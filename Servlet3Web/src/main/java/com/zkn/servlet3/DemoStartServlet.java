package com.zkn.servlet3;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by zkn on 2017/10/30.
 */
public class DemoStartServlet extends HttpServlet {
    /**
     * 处理GET请求
     *
     * @param request
     * @param response
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Enumeration<String> parameters = request.getParameterNames();
        String paramterName;
        List<String> parameterValue = new ArrayList<>();
        parameterValue.add("请求参数：");
        if (parameters != null) {
            while (parameters.hasMoreElements()) {
                paramterName = parameters.nextElement();
                parameterValue.add(paramterName + "=" + request.getParameter(paramterName) + ";");
            }
        }
        String resultString = JSON.toJSONString(parameterValue);
        try {
            PrintWriter printWriter = new PrintWriter(response.getOutputStream());
            printWriter.write(resultString);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("我是Servlet，我被初始化了、、、、、");
        super.init(config);
    }
}
