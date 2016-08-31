<%-- 
    Document   : event
    Created on : 2016/08/30, 13:02:26
    Author     : yoshikawatoshio
--%>

<%@page import="Lisani.JsoupEvent"%>
<%
    JsoupEvent event = new JsoupEvent();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8">
    <title>Bootstrap 101 Template</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <h1>Hello World!</h1>
        <%out.println(event.EVENT());%>
    </body>
</html>
