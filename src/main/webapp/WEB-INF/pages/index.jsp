<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Home</title>                    
        <link href="/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body {
                padding : 15px;
            }
        </style>
    </head>
    <body>
        <ul class="nav nav-tabs">
            <li class="active" id="cut1">
                <a href="#">Главная</a>
            </li>
            <li id="cut2">
                <a href="#" onclick="javascript : Main.getEmployee();" >Все сотрудники</a>
            </li>
            <li id="cut3">
                <a href="#">Выбрать сотрудника по ID</a>
            </li>
        </ul>        
        
        <div id="pageBody" style="margin: 10px;">
            
        </div>
                       
        <script src="/js/jquery-2.0.2.js"></script>       
        <script src="/js/bootstrap.min.js"></script>
        <script src="/js/scripts.js"></script>
    </body>
</html>