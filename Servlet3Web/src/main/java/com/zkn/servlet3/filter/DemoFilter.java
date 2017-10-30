package com.zkn.servlet3.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zkn on 2017/10/30.
 */
public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行一个过滤器!");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器!");
    }
}
