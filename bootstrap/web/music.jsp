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
    <div class="bs-docs-section">
        <div class="row">
          <div class="col-lg-12">
            <div class="page-header">
              <h1 id="containers">ニュース ＞ 作品情報(CD)</h1>
            </div>
            <div class="bs-component">
              <div class="jumbotron">
                <h1></h1>
                <div class="panel-body">
                    <%out.println(j.CD2());%>
                </div>
                
                <p></p>
                <p><a class="btn btn-primary btn-lg">Learn more</a></p>
              </div>
            </div>
          </div>
        </div>
    </div>
                
                    
          
    </body>
</html>
