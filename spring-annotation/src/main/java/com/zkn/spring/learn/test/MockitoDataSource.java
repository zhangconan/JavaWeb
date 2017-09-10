package com.zkn.spring.learn.test;

import com.zkn.spring.learn.domain.ProvinceChinaDomain;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.sql.RowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zkn on 2017/9/10.
 */
@Configuration
@Profile("test")
public class MockitoDataSource {

    @Bean
    public DataSource getDataSource() throws SQLException {

        DataSource dataSource = Mockito.mock(DataSource.class);
        Connection con = Mockito.mock(Connection.class);
        Statement stmt = Mockito.mock(Statement.class);
        RowSet rowSet = Mockito.mock(RowSet.class);
        Mockito.when(dataSource.getConnection()).then(t -> {
            System.out.println("getconn ");
            return con;
        });
        Mockito.when(con.createStatement()).thenReturn(stmt);
        Mockito.when(stmt.executeQuery(Mockito.anyString())).thenReturn(rowSet);
        //Mockito.verify(rowSet,Mockito.times(1)).next();
        Mockito.when(rowSet.next()).thenReturn(true);
        Mockito.when(rowSet.getLong(0)).thenReturn(100L);
        Mockito.when(rowSet.getString(1)).thenReturn("zhangsan");
        Mockito.when(rowSet.getString(2)).thenReturn("lisi");
        Mockito.when(rowSet.next()).thenReturn(false);
        return dataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() throws SQLException {
        return new JdbcTemplate(getDataSource());
    }
}
