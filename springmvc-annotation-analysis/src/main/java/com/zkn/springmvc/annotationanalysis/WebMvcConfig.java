package com.zkn.springmvc.annotationanalysis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import java.util.Arrays;

/**
 * Create By ZKN
 *
 * @date 2017/10/28
 * @time 上午10:04
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.zkn.springmvc.annotationanalysis.controller")
public class WebMvcConfig extends WebMvcConfigurerAdapter implements ServletContextAware {

    private ServletContext servletContext;

    @Bean
    @Profile("jsp")
    public ViewResolver jspViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/resources/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setExposePathVariables(true);
        return viewResolver;
    }

    /**
     * 视图解析器
     *
     * @return
     */
    @Bean
    @Profile(value = "thymeleaf")
    public ViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        return viewResolver;
    }

    /**
     * 模版引擎
     *
     * @return
     */
    @Bean
    @Profile("thymeleaf")
    public TemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        return templateEngine;
    }

    /**
     * 模版引擎解析器
     *
     * @return
     */
    @Bean
    @Profile("thymeleaf")
    public ITemplateResolver templateResolver() {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(servletContext);
        templateResolver.setPrefix("WEB-INF/resources/thymeleaf/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        return templateResolver;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    /**
     * 配置静态资源
     *
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * 处理静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/js/");
        registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/resources/img/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public HandlerAdapter requestMappingHandlerAdapter(){
        RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
        StringHttpMessageConverter messageConverter = new StringHttpMessageConverter();
        messageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.valueOf("text/html;charset=UTF-8")));
        handlerAdapter.getMessageConverters().add(messageConverter);
        handlerAdapter.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return handlerAdapter;
    }

}
