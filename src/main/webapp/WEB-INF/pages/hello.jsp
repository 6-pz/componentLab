<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Home</title>    
        <script src="/js/jquery-1.6.1.min.js"></script>
        <script src="/js/bootstrap.min.js"></script>
        <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen">
    </head>
    <body>
        <h1>${message}</h1>
        <div class="btn-group">
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              Кнопка
              <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <!-- dropdown menu links -->
            </ul>
        </div>
    </body>
</html>