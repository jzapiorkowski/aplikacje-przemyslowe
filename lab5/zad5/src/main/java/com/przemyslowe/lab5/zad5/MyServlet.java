package com.przemyslowe.lab5.zad5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {


  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    PrintWriter out  = resp.getWriter();

    resp.setContentType("text/html");

    out.println("<html><body>");

    out.println("<h1>This is a Hello World for GET request on /</h1>");

    out.println("</body></html>");

  }
}
