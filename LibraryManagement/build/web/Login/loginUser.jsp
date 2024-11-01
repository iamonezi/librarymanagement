<%-- 
    Document   : loginUser
    Created on : Jul 4, 2022, 10:49:27 PM
    Author     : Vo Viet Nhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Login</title>
    <link rel="icon" href="image/logo.png">


    <link href="css/styleLoginUser.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="javascript.js"> </script>

    </head>
    <body>
    <body id="particles-js"></body>
    <div class="animated bounceInDown">
        <div class="container">
            <span class="error animated tada" id="msg"></span>
            <form name="form1" class="box" onsubmit="return checkStuff()">
                <h4>User<span>Login</span></h4>
                <h5>Please enter your account.</h5>
                <input type="text" name="email" placeholder="Account" autocomplete="off">
                <i class="typcn typcn-eye" id="eye"></i>
                <input type="password" name="password" placeholder="Passsword" id="pwd" autocomplete="off">
                <label>
                    <input type="checkbox">
                    <span></span>
                    <small class="rmb"> Remember me</small>
                </label>
                <a href="#" class="forgetpass">Forget Password?</a>oki
                <input type="submit" value="Sign in" class="btn1">
            </form>
            <a href="#" class="dnthave">Don’t have an account? Sign up</a>
        </div>
        <div class="footer">
            <span>Made with <i class="fa fa-heart pulse"></i> <a
                    href="https://www.google.de/maps/place/Augsburger+Puppenkiste/@48.360357,10.903245,17z/data=!3m1!4b1!4m2!3m1!1s0x479e98006610a511:0x73ac6b9f80c4048f"><a
                        href="https://codepen.io/lordgamer2354">By Group 2</a></span>
        </div>
        
    </div>

    </body>
</html>
