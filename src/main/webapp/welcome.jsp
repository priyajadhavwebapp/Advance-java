<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    // Get session (create if not exists)
    HttpSession sessionObj = request.getSession(true);

    // Set session expiry time = 60 seconds (1 minute)
    sessionObj.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    // If user submitted form, store in session
    if (name != null) {
        sessionObj.setAttribute("user", name);
    }

    // Retrieve session value
    String user = (String) sessionObj.getAttribute("user");
%>

<%
    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire after 1 minute of inactivity.</p>
        <p>Refresh after 1 minute to check session expiry.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <p>Please enter your name again.</p>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>