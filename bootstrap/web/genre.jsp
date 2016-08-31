<%-- 
    Document   : genre
    Created on : 2016/08/29, 16:11:54
    Author     : yoshikawatoshio
--%>
<%@page import="Lisani.URLSeach"%>
<%
    URLSeach url = new URLSeach();
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
    <h1></h1>
     <%out.println(url.BRD_DVD());%>
    


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
