package com.servlet.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieVisitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        // Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {

                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }

                if (c.getName().equals("username")) {
                    name = c.getValue();
                }
            }
        }

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (60 seconds)
        nameCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        // Add cookies to response
        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // Output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");

        // Display cookie list
        out.println("<h3>Cookies and their values:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() +
                            " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<p><b>Note:</b> Cookies expire after 60 seconds.</p>");
        out.println("</body></html>");
    }
}