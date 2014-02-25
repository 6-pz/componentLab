<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Home</title>            
        <script src="/js/jquery-2.0.2.js"></script>       
        <script src="/js/bootstrap.min.js"></script>
        <link href="/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <ul class="nav nav-tabs">
            <li class="active">
                <a href="#">Главная</a>
            </li>
            <li><a href="#">Форма</a></li>
            <li><a href="#">...</a></li>
        </ul>        
        <table class="table" width="100%">
            <thead>
                <tr>
                    <th width="50%">1</th>
                    <th>1</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${m}</td>
                    <td>2</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>2</td>
                </tr>
            </tbody>
        </table>
    </body>
</html>