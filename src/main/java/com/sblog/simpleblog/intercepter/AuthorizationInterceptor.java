package com.sblog.simpleblog.intercepter;

import com.sblog.simpleblog.entity.User;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            response.sendRedirect("/user/login");
            return false;
        }
        return true;
    }
}
