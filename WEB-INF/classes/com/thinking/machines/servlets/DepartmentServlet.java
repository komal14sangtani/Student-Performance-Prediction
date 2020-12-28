
<!DOCTYPE html>
<html lang="en">

<head>
    <title>CSS Template</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }
        
        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
        }
        /* Style the top navigation bar */
        
        .topnav {
            overflow: hidden;
            background-color: #333;
        }
        /* Style the topnav links */
        
        .topnav a {
            float: right;
            display: block;
            color: #f2f2f2;
            padding: 14px 16px;
            text-decoration: none;
        }
        /* Change color on hover */
        
        .topnav a:hover {
            background-color: #ddd;
            color: black;
        }
        
        .login {
            position: relative;
            margin: 30px auto;
            padding: 20px 20px 20px;
            width: 350px;
            height: 350px;
            background: white;
            border-radius: 3px;
            -webkit-box-shadow: 0 0 200px rgba(255, 255, 255, 0.5), 0 1px 2px rgba(0, 0, 0, 0.3);
            box-shadow: 0 0 200px rgba(255, 255, 255, 0.5), 0 1px 2px rgba(0, 0, 0, 0.3);
        }
        
        .login:before {
            content: '';
            position: absolute;
            top: -8px;
            right: -8px;
            bottom: -8px;
            left: -8px;
            z-index: -1;
            background: rgba(0, 0, 0, 0.08);
            border-radius: 4px;
        }
        
        .login h1 {
            margin: -20px -20px 21px;
            line-height: 40px;
            font-size: 15px;
            font-weight: bold;
            color: #555;
            text-align: center;
            text-shadow: 0 1px white;
            background: #f3f3f3;
            border-bottom: 1px solid #cfcfcf;
            border-radius: 3px 3px 0 0;
            background-image: -webkit-linear-gradient(top, whiteffd, #eef2f5);
            background-image: -moz-linear-gradient(top, whiteffd, #eef2f5);
            background-image: -o-linear-gradient(top, whiteffd, #eef2f5);
            background-image: linear-gradient(to bottom, whiteffd, #eef2f5);
            -webkit-box-shadow: 0 1px whitesmoke;
            box-shadow: 0 1px whitesmoke;
        }
        
        .login p {
            margin: 20px 0 0;
        }
        
        .login p:first-child {
            margin-top: 0;
        }
        
        .login input[type=text],
        .login input[type=password] {
            width: 278px;
        }
        
        .login p.remember_me {
            float: left;
            line-height: 31px;
        }
        
   
        }
        
        .login p.submit {
            text-align: right;
        }
        
       
        
         :-moz-placeholder {
            color: #c9c9c9 !important;
            font-size: 13px;
        }
        
         ::-webkit-input-placeholder {
            color: #ccc;
            font-size: 13px;
        }
        
        input {
            font-family: 'Lucida Grande', Tahoma, Verdana, sans-serif;
            font-size: 14px;
        }
        
        input[type=text],
        input[type=password] {
            margin: 16px;
            padding: 0 10px;
            width: 200px;
            height: 30px;
            color: #404040;
            background: white;
            border: 1px solid;
            border-color: #c4c4c4 #d1d1d1 #d4d4d4;
            border-radius: 2px;
            outline: 5px solid #eff4f7;
            -moz-outline-radius: 3px;
            -webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
            box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
        }
        
        input[type=text]:focus,
        input[type=password]:focus {
            border-color: #7dc9e2;
            outline-color: #dceefc;
            outline-offset: 0;
        }
        
        input[type=submit] {
            padding: 0 38px;
            margin: 36px;
            height: 29px;
           margin-left: 100px;
margin-right: -120px;
            font-size: 12px;
            font-weight: bold;
            color: #527881;
            text-shadow: 0 1px #e3f1f1;
            background: #cde5ef;
            border: 1px solid;
            border-color: #b4ccce #b3c0c8 #9eb9c2;
            border-radius: 16px;
            outline: 0;
            -webkit-box-sizing: content-box;
            -moz-box-sizing: content-box;
            box-sizing: content-box;
            background-image: -webkit-linear-gradient(top, #edf5f8, #cde5ef);
            background-image: -moz-linear-gradient(top, #edf5f8, #cde5ef);
            background-image: -o-linear-gradient(top, #edf5f8, #cde5ef);
            background-image: linear-gradient(to bottom, #edf5f8, #cde5ef);
            -webkit-box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
            box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
        }
        
        input[type=submit]:active {
            background: #cde5ef;
            border-color: #9eb9c2 #b3c0c8 #b4ccce;
            -webkit-box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
            box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
        }
        
        .lt-ie9 input[type=text],
        .lt-ie9 input[type=password] {
            line-height: 34px;
        }
        
        .rectangles .rectangle {
            border-radius: 10px;
            display: inline-block;
            margin-bottom: 30px;
            margin-right: 5px;
            width: 350px;
            height: 100px;
            border: 1px solid #000;
            background-color: white;
            padding: 10px 10px 10px 100px;
            position: relative;
        }
        
        .rectangles .rectangle .circle {
            background: #aaa;
            border-radius: 100%;
            height: 60px;
            width: 60px;
            position: absolute;
            top: 20px;
            left: 20px;
        }
        /* Style the footer */
        
        {
            font-family: Open Sans;
        }
        
        section {
            width: 100%;
            display: inline-block;
            background: #333;
            height: 50%;
            text-align: center;
            font-size: 22px;
            font-weight: 700;
            text-decoration: underline;
        }
        
        .footer-distributed {
            background: #666;
            box-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.12);
            box-sizing: border-box;
            width: 100%;
            text-align: left;
            font: bold 16px sans-serif;
            padding: 55px 50px;
        }
        
        .footer-distributed .footer-left,
        .footer-distributed .footer-center,
        .footer-distributed .footer-right {
            display: inline-block;
            vertical-align: top;
        }
        /* Footer left */
        
        .footer-distributed .footer-left {
            width: 40%;
        }
        /* The company logo */
        
        .footer-distributed h3 {
            color: #ffffff;
            font: normal 36px 'Open Sans', cursive;
            margin: 0;
        }
        
        .footer-distributed h3 span {
            color: lightseagreen;
        }
        /* Footer links */
        
        .footer-distributed .footer-links {
            color: #ffffff;
            margin: 20px 0 12px;
            padding: 0;
        }
        
        .footer-distributed .footer-links a {
            display: inline-block;
            line-height: 1.8;
            font-weight: 400;
            text-decoration: none;
            color: inherit;
        }
        
        .footer-distributed .footer-company-name {
            color: #222;
            font-size: 14px;
            font-weight: normal;
            margin: 0;
        }
        /* Footer Center */
        
        .footer-distributed .footer-center {
            width: 35%;
        }
        
        .footer-distributed .footer-right i {
            background-color: #33383b;
            color: #ffffff;
            font-size: 25px;
            width: 38px;
            height: 38px;
            border-radius: 50%;
            text-align: center;
            line-height: 42px;
            margin: 10px 15px;
            vertical-align: middle;
        }
        
        .footer-distributed .footer-center i.fa-envelope {
            font-size: 17px;
            line-height: 38px;
        }
        
        .footer-distributed .footer-center p {
            display: inline-block;
            color: #ffffff;
            font-weight: 400;
            vertical-align: middle;
            margin: 0;
        }
        
        .footer-distributed .footer-center p span {
            display: block;
            font-weight: normal;
            font-size: 14px;
            line-height: 2;
        }
        
        .footer-distributed .footer-center p a {
            color: lightseagreen;
            text-decoration: none;
            ;
        }
        
        .footer-distributed .footer-links a:before {
            content: "|";
            font-weight: 300;
            font-size: 20px;
            left: 0;
            color: #fff;
            display: inline-block;
            padding-right: 5px;
        }
        
        .footer-distributed .footer-links .link-1:before {
            content: none;
        }
    </style>
</head>

<body>
    <div class="topnav">
        <a href="index.html">Home Page</a>
        <a href="AboutUs.html">About</a>
        <a href="Login.html">Login</a>
        <a href="Contact.html"> Contact Us</a>
        <a href="/Project/logoutServlet">Logout</a>
    </div>
    <div class="login">
        <h1>Login to Web App</h1>
        <form method="post" action="/Project/login">
            UserName<input type="text" name="name" /><br/>
            Password<input type="password" name="pass" /><br/>
            <input type="submit" value="login"/>
        </form>
    </div>

    </div>
    <footer class="footer-distributed">
        <div class="footer-left">
            <h3>Student<span>Performance</span></h3>
            <p class="footer-links">
                <a href="index.html">Home</a>
                <a href="AboutUs.html">About</a>
                <a href="Login.html">Login</a>
                <a href="Contact.html">Contact</a>
                <a href="Logout.html">Logout</a>
            </p>
        </div>
        <div class="footer-center">
<div>
<i class="fa fa-map-marker"></i>
<p><span>Hoshila Bharti      Komal Sangtani       Dolly Saluja</span></p>
</div>
<div>
<i class="fa fa-phone"></i>
<p>+1.555.555.5555</p>
</div>

<div>
<i class="fa fa-envelope"></i>
<p>support@studentPrediction.com</a></p>
</div>
</div>
</footer>
  </div>
</body>
</html>