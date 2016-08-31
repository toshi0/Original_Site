<%-- 
    Document   : music
    Created on : 2016/08/30, 14:36:46
    Author     : yoshikawatoshio
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="Lisani.JsoupMusic"%>
<%
    ArrayList<JsoupMusic> jm = new ArrayList<JsoupMusic>();
    JsoupMusic j = new JsoupMusic();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>作品情報(CD)</title>
        <link href="css/bootswatch.css" rel="StyleSheet">
    </head>
    <body>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
          <!-- Containers
      ================================================== -->
    <%
       for( int i=0 ; i< jm.size() ; i++ ){
              out.print( jm.get(i) );
            } 
         out.print( j.CD2() );
    %>
                
                    
          
    </body>
</html>
