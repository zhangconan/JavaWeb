package com.zkn.spring.miscellaneous.controller;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wb-zhangkenan on 2017/5/16.
 * 用来测试这个Class类是从哪个jar包加载的
 *
 * @author wb-zhangkenan
 * @date 2017/05/16
 */
@Controller
public class ClassFromWhichJARController {
    private static final String ERR_MESSAGE = "请输入正确的类名!";

    @RequestMapping("/classFromWhichJar")
    @ResponseBody
    public String getClassPath(String className) {

        if (StringUtils.isEmpty(className)) {
            return ERR_MESSAGE;
        }
        try {
            Class<?> clazz = Class.forName(className);
            return getClassFromWhere(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ERR_MESSAGE;
    }

    private String getClassFromWhere(Class<?> clazz) {

        if (StringUtils.isEmpty(clazz)) {
            return ERR_MESSAGE;
        }
        String clazzName = clazz.getName().replace('.', '/').concat(".class");

        ProtectionDomain pd = clazz.getProtectionDomain();
        URL url = null;
        if (pd != null) {
            CodeSource codeSource = pd.getCodeSource();
            if (codeSource != null) {
                url = codeSource.getLocation();
            }
            if (url != null) {
                //URL中的协议有很多像：ftp,http,nntp
                if ("file".equals(url.getProtocol())) {
                    try {
                        if (url.toExternalForm().endsWith(".jar") || url.toExternalForm().endsWith(".zip")) {
                            //一般名称都是这样的jar:file:/path/.jar!/.class
                            url = new URL("jar:".concat(url.toExternalForm()).concat("!/").concat(clazzName));
                        } else if (new File(url.getFile()).isDirectory()) {
                            url = new URL(url, clazzName);
                        }
                    } catch (MalformedURLException e) {
                        return ERR_MESSAGE;
                    }
                }
            }
        }
        if (url == null) {
            //像rt.jar中的类是被启动类加载加载的，所以这里就会获取不到类加载器
            ClassLoader classLoader = clazz.getClassLoader();
            url = classLoader != null ? classLoader.getResource(clazzName) : ClassLoader.getSystemResource(clazzName);
        }
        return url.toString();
    }
}