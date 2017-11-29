package com.dbbyte.servletssb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/path2/*")
public class MyServlet extends HttpServlet {

  @Override
  protected void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
	  
	  	System.out.println("from servlet step 1");
      PrintWriter writer = resp.getWriter();
      	System.out.println("from servlet step 2");
      writer.println("response from servlet ");
      	System.out.println("from servlet step 3");
  }
}