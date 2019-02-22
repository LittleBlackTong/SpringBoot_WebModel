package com.example.web_model;



import com.example.web_model.Interceptor.OneInterceptor;
import com.example.web_model.Interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 拦截是按照注册顺序执行的
         */
        registry.addInterceptor((new OneInterceptor())).addPathPatterns("/inter/**");
        registry.addInterceptor((new TwoInterceptor())).addPathPatterns("/inter2/**");
        super.addInterceptors(registry);
    }
}
