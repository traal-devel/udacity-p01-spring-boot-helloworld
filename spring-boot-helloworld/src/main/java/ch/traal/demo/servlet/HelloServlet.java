package ch.traal.demo.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="helloServlet", urlPatterns ="/helloServlet")
public class HelloServlet  extends HttpServlet {
  
  /** Auto generated serial-version by eclipse */
  private static final long serialVersionUID = 2177556473029818793L;

  /* methods */
  @Override
  protected void doGet(
      HttpServletRequest request, 
      HttpServletResponse response
  ) throws IOException{
    System.out.println("Running Hello Servlet doGet method.");
    response.getOutputStream().println("Running Hello Servlet doGet method");
  }

}
