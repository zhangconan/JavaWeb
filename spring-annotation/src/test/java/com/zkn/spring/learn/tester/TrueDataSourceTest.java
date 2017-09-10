package com.zkn.spring.learn.tester;

import com.zkn.spring.learn.domain.ProvinceChinaDomain;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zkn on 2017/9/10.
 */
public class TrueDataSourceTest {

    @Test
    public void testDataSource() {
        System.setProperty("spring.profiles.active", "dev");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/zkn/spring/learn/test/applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        List<ProvinceChinaDomain> listResult = jdbcTemplate.query("select id,ename,cname from province_china", (resultSet, i) -> {
            ProvinceChinaDomain provinceChinaDomain = new ProvinceChinaDomain();
            provinceChinaDomain.setId(resultSet.getLong("id"));
            provinceChinaDomain.setEname(resultSet.getString("ename"));
            provinceChinaDomain.setCname(resultSet.getString("cname"));
            return provinceChinaDomain;
        });
        System.out.println(Arrays.toString(listResult.toArray()));
    }
}
