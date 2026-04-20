<%@ page language="java" %>
<%
    Cookie[] cookies = request.getCookies();
%>

<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
    if (cookies != null) {
        for (Cookie c : cookies) {
%>
            Name: <%= c.getName() %> |
            Value: <%= c.getValue() %> <br>
<%
        }
    } else {
%>
        <p>No cookies found.</p>
<%
    }
%>

</body>
</html>