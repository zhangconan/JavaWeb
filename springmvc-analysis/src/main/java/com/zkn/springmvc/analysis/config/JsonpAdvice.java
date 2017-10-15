package com.zkn.springmvc.analysis.config;

import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

import java.nio.charset.Charset;

/**
 * Create By ZKN
 *
 * @date 2017/10/14
 * @time 下午10:31
 */
@ControllerAdvice(basePackages = "com.zkn.springmvc.analysis.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonpAdvice() {
        super("callback", "jsonp");
    }

    @Override
    protected MediaType getContentType(MediaType contentType, ServerHttpRequest request, ServerHttpResponse response) {
        return new MediaType("application", "javascript", Charset.forName("UTF-8"));
    }
}
