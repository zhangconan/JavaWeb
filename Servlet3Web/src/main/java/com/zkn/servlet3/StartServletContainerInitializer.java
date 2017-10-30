package com.zkn.servlet3;

import com.zkn.servlet3.filter.DemoFilter;
import com.zkn.servlet3.initializer.WebApplicationContextInitializer;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by zkn on 2017/10/30.
 */
@HandlesTypes(WebApplicationContextInitializer.class)
public class StartServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> classSet, ServletContext servletContext) throws ServletException {
        if (classSet != null && !classSet.isEmpty()) {
            classSet.forEach(e -> {
                //不是接口，也不是抽象类
                if (!e.isInterface() && !Modifier.isAbstract(e.getModifiers()) &&
                        WebApplicationContextInitializer.class.isAssignableFrom(e)) {
                    try {
                        WebApplicationContextInitializer webApplication = (WebApplicationContextInitializer) e.newInstance();
                        webApplication.onStartup(servletContext);
                    } catch (InstantiationException e1) {
                        e1.printStackTrace();
                    } catch (IllegalAccessException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        //添加Servlet
        ServletRegistration.Dynamic dynamicServlet = servletContext.addServlet("demoServlet", new DemoStartServlet());
        //请求路径
        dynamicServlet.addMapping("/demo");
        //Servlet InitParam
        dynamicServlet.setInitParameter("demo", "demo");
        dynamicServlet.setLoadOnStartup(1);
        //添加过滤器
        FilterRegistration.Dynamic dynamicFilter = servletContext.addFilter("filter", new DemoFilter());
        dynamicFilter.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "demoServlet");
    }
}
