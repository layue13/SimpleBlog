package com.sblog.simpleblog.configuration;


import com.sblog.simpleblog.intercepter.AuthorizationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthorizationInterceptor())
                .excludePathPatterns("/user/register","/user/login","/index","/","/user","/css/**","/js/**","/article/detail");
    }
}
