package ch.traal.demo.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {

  
  /* member variables */
  
  
  /* constructors */
  
  
  /* methods */
  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {
    System.out.println("Servlet Context Destroyed");
  }

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    System.out.println("Servlet Context Initialized");
  }
}
