package com.example.myprocod;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Enumeration<String> headerNames = request.getHeaderNames();


//        if (headerNames != null) {
//            while (headerNames.hasMoreElements()) {
        System.out.println(  request.getHeader("language"));
//                System.out.println("Header: " + request.getHeader(headerNames.nextElement()));
//            }
//        }

        response.setHeader("name", "a1");
        response.setHeader("name", "a2");
        response.addHeader("surname", "b1");
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}