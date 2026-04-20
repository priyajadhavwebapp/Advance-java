package com.servlet.user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        // Server-side validation
        if (name == null || name.isEmpty() ||
            email == null || email.isEmpty() ||
            designation == null || designation.isEmpty()) {

            response.sendRedirect("index.jsp");
            return;
        }

        // Email validation
        if (!email.matches("^[^ ]+@[^ ]+\\.[a-z]{2,3}$")) {
            response.sendRedirect("index.jsp");
            return;
        }

        // Set attributes
        request.setAttribute("username", name);
        request.setAttribute("email", email);
        request.setAttribute("designation", designation);

        // Forward to result.jsp
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}