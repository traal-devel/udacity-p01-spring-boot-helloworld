package ch.traal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import ch.traal.demo.servlet.HelloFilter;
import ch.traal.demo.servlet.HelloListener;
import ch.traal.demo.servlet.HelloServlet;

@SpringBootApplication
public class SpringBootHelloworldApplication {

  
  /* member variables */
  
  
  /* constructors */
  
  
  /* methods */
  /// Register Servlet.
  @Bean
  public ServletRegistrationBean getServletRegistrationBean() {
    ServletRegistrationBean servletBean = new ServletRegistrationBean(new HelloServlet());
    servletBean.addUrlMappings("/helloServlet");
    return servletBean;
  }
  
  /// Register Filter.
  @Bean
  public FilterRegistrationBean getFilterRegistrationBean() {
    FilterRegistrationBean filterBean = new FilterRegistrationBean(new HelloFilter());
    // Add filter path
    filterBean.addUrlPatterns("/helloServlet");
    return filterBean;
  }
  
  @Bean
  public ServletListenerRegistrationBean<HelloListener> getServletListenerRegistrationBean() {
    ServletListenerRegistrationBean listenerBean =
          new ServletListenerRegistrationBean(new HelloListener());
    return listenerBean;
  }
  
  public static void main(String[] args) {
    SpringApplication.run(SpringBootHelloworldApplication.class, args);
  }

}
