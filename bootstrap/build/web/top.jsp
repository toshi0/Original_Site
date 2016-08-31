<%-- 
    Document   : top
    Created on : 2016/08/29, 14:18:36
    Author     : yoshikawatoshio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <!-- このドキュメントの見た目はhref属性によって参照されるCSSで制御されます。詳細はhttp://www.w3.org/TR/xml-stylesheet/を参照してください。 -->
    
   <title>アニニュース</title>
    <link href="css/bootswatch.css" rel="StyleSheet">
   <script>

     var _gaq = _gaq || [];
      _gaq.push(['_setAccount', 'UA-23019901-1']);
      _gaq.push(['_setDomainName', "bootswatch.com"]);
        _gaq.push(['_setAllowLinker', true]);
      _gaq.push(['_trackPageview']);

     (function() {
       var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
       ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
       var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
     })();

    </script>
</head>
  <body>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <div class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a href="top.jsp" class="navbar-brand">アニニュース</a>
          <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div class="navbar-collapse collapse" id="navbar-main">
          <ul class="nav navbar-nav">
            <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="themes">ニュース <span class="caret"></span></a>
              <ul class="dropdown-menu" aria-labelledby="ニュース">
                <li class="divider"></li>
                <li><a href="music.jsp">CD</a></li>
                <li><a href="brd_dvd.jsp">アニメ作品/BRD・DVD</a></li>
                <li><a href="live.jsp">ライブ</a></li>
                <li><a href="event.jsp">イベント</a></li>
              </ul>
            </li>
            <li>
              <a href="#">お問い合わせ</a>
            </li>
            <li>
              <a href="#">ログイン</a>
            </li>
          </ul>
        </div>
      </div>
    </div> 
      <div class="page-header" id="banner">
        <div class="row">
          <div class="col-lg-8 col-md-7 col-sm-6">
            <h1>アニ!WEB</h1>
            <p class="lead">アニメ・音楽の情報サイト</p>
          </div>
        </div>
       </div>
     <!-- アニ!WEB
      ================================================== -->
        <p class="bs-component">
            <a href="music.jsp" class="btn btn-default">CD</a>
            <a href="brd_dvd.jsp" class="btn btn-primary">アニメ作品/BRD・DVD</a>
            <a href="live.jsp" class="btn btn-success">ライブ</a>
            <a href="event.jsp" class="btn btn-info">イベント</a>
            <!--<a href="#" class="btn btn-warning">Warning</a>
            <a href="#" class="btn btn-danger">Danger</a>
            <a href="#" class="btn btn-link">Link</a>
            <img src="">-->
        </p>

                    
 


    
  </body>
</html>
