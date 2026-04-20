<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Check Session</title>
</head>
<body>

<%
    HttpSession sessionObj = request.getSession(false);

    if (sessionObj != null) {
        String user = (String) sessionObj.getAttribute("user");

        if (user != null) {
%>
            <h2>Hello <%= user %>!</h2>
            <p>Your session is still active.</p>
<%
        } else {
%>
            <h2>Session Expired!</h2>
<%
        }
    } else {
%>
        <h2>Session Expired!</h2>
<%
    }
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>