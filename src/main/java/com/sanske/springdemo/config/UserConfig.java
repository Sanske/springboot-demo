package com.sanske.springdemo.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author sanske
 * @date 2018/8/1 下午2:13
 * 用户过滤和参数打印
 **/

@Component
public class UserConfig implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("开始拦截==" + request.getRequestURL());
        System.out.println("--------------------");
        System.out.println(request.getMethod() + ":");
        Map<String, String[]> mapData = request.getParameterMap();
        for (String key : mapData.keySet()) {
            System.out.println(key + ":" + request.getParameter(key));
        }
        System.out.println("--------------------");
        //验证失败的回复
        //        if (userId == null) {
        //            response.setCharacterEncoding("UTF-8");
        //            response.setContentType("application/json; charset=utf-8");
        //            PrintWriter out = response.getWriter();
        //            out.append(ResponseModel.fail(TipMessage.OUT_TOKEN));
        //            return false;
        //        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception e) throws Exception {

    }
}
