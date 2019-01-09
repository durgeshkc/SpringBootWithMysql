<head>
<%@ page isELIgnored="false" %>
</head>
<html>
<body>
<h2> Greetings : Hello ${user} , Welcome to Stackroute</h2>

    <div align="center">
        <form action="/register" method="post" commandName = "userForm">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Login Form</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><input type = "text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type ="password" name="password" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
