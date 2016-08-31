<%-- 
    Document   : brd_dvd
    Created on : 2016/08/30, 14:31:54
    Author     : yoshikawatoshio
--%>


<%@page import="Lisani.JsoupBd"%>
<%
    JsoupBd bd = new JsoupBd();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
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
    <h1></h1>
     <%out.println(bd.BRD_DVD());%>
  </body>
</html>