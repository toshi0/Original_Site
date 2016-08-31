<%-- 
    Document   : live
    Created on : 2016/08/30, 14:35:39
    Author     : yoshikawatoshio
--%>


<%@page import="Lisani.JsoupLive"%>
<%
    JsoupLive live = new JsoupLive();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <h1>Hello World!</h1>
        <%out.println(live.LIVE());%>
    </body>
</html>
