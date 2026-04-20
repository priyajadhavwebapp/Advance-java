package com.servlet.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        out.println("<html><body>");
        out.println("<h2>Prime Number Result</h2>");

        if (isPrime) {
            out.println(num + " is a Prime Number");
        } else {
            out.println(num + " is NOT a Prime Number");
        }

        out.println("</body></html>");
    }
}