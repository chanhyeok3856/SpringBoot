package min.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import min.boot.begin.servlet.login.InterceptorLogin;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"min.boot.begin", "min.boot.servlet"})
public class ServletConfig implements WebMvcConfigurer{
@Override
public void addInterceptors(InterceptorRegistry interceptorRegistry) {
	interceptorRegistry.addInterceptor(new InterceptorLogin()).addPathPatterns("/admin/**");
}
}
