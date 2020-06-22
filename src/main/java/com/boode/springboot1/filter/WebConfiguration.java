package com.boode.springboot1.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    public FilterRegistrationBean testFilterRegistrationBean(){

        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        // 1. 注册
        registrationBean.setFilter(new MyFilter());
        registrationBean.setName("MyFilter");

        // 2. 配置映射(配置过滤的目标)
        //registrationBean.addUrlPatterns("/*");
        registrationBean.addUrlPatterns("/hello","/toIndex");

        // 设置初始化参数
        // 值的类型为字符串
        registrationBean.addInitParameter("age", "25");
        registrationBean.addInitParameter("uname", "tom");

        // 设置过滤的顺序
        registrationBean.setOrder(2);

        return registrationBean;
    }

}
