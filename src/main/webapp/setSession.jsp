<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Created</title>
</head>
<body>

<%
    String name = request.getParameter("username");
    int expiry = Integer.parseInt(request.getParameter("expiry"));

    // Create session
    HttpSession sessionObj = request.getSession(true);

    // Set values
    sessionObj.setAttribute("user", name);
    sessionObj.setMaxInactiveInterval(expiry);
%>

<h2>Hello <%= name %>!</h2>
<p>Session expiry time set to <%= expiry %> seconds.</p>

<p>
Click here to check session:
<a href="checkSession.jsp">Check Session</a>
</p>

<p>Or wait for the given time and then click the link to see expiry.</p>

</body>
</html>