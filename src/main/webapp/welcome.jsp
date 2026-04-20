<%@ page language="java" %>
<%
    // Get user input
    String name = request.getParameter("username");

    // Create session and store value
    session.setAttribute("user", name);

    // Set session expiry = 60 seconds (1 minute)
    session.setMaxInactiveInterval(60);

    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire in 1 minute.</p>
<%
    } else {
%>
        <h2>Session Expired! Please enter your name again.</h2>
<%
    }
%>

</body>
</html>