package com.servlet.factorial;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));

        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        out.println("<html><body>");
        out.println("<h2>Factorial Result</h2>");
        out.println("Factorial of " + num + " is: " + fact);
        out.println("</body></html>");
    }
}