<%-- 
    Document   : firstPage
    Created on : Jul 4, 2022, 10:32:27 PM
    Author     : Vo Viet Nhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Choose Page</title>
    <link rel="icon" href="image/logo.png">

    <link href="cssbootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="css/stylefirstpage.css" rel="stylesheet" id="bootstrap-css">
    <script src="jsbootstrap/Jquery.js"></script>
    <script src="jsbootstrap/bootstrap.min.js"></script>
    <link href="https://fonts.googleapis.com/css2?family=Arima:wght@200&family=Merriweather:ital,wght@1,300&family=Nunito:wght@300&family=Roboto+Condensed:wght@400;700&display=swap" rel="stylesheet">
    </head>
    <body>
         <div class="bg-image"></div>
            <div class="bg-text">
                <a href="firstpage.jsp"
                class="logo"><img src="image/logo.png" alt=""></a>
                <h1 class="intro"> Library Choosen mode Login</h1>
            </div>

            <div class="container">
                <div id="contain-left">
                    <label class="mode">
                        <span>Admin</span>
                    </label>
                    <a href="LoginAdmin.jsp"><button class="signup">Login Admin</button></a>
                    <a href="SignUpAdmin.jsp"><button class="login">Signup Admin </button></a>    
                </div>

                <div id="contain-right">
                    <label class="mode">
                        <span>User</span>
                    </label>   
                    <a href="loginUser.jsp"><button class="signup">Login User</button></a>
                    <a href="SignUpUser.jsp"><button class="login">Signup User </button></a>    
                </div>

                <p>@made by group 02</p>
            </div>
       

       </body>
</html>
