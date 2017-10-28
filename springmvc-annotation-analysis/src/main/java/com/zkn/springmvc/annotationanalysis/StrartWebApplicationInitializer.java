package com.zkn.springmvc.annotationanalysis;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 上午9:53
 */
public class StrartWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * SpringContext中相关的bean
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringRootConfig.class};
    }

    /**
     * DispatcherServlet中上下文相关的Bean
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcConfig.class};
    }

    /**
     * Servlet请求映射路径
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }

    @Override
    public void registerDispatcherServlet(ServletContext servletContext) {
        //配置profile，激活不同的环境
        servletContext.setInitParameter("spring.profiles.active", "jsp");
        super.registerDispatcherServlet(servletContext);
    }
}
