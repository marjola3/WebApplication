<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="../css/style.css" media="screen"/>
    <title>WebApp</title>
</head>

<body>
    <div id="content">
        <form method="post" action="#">
            <table>
                <tr>
                    <td><label for="firstName">Imie:</label> </td>
                    <td><input name="firstName" id="firstName" type="text" maxlength="30"/></td>
                </tr>
                <tr>
                    <td><label for="lastName">Nazwisko:</label> </td>
                    <td><input name="lastName" id="lastName" type="text" maxlength="30"/></td>
                </tr>
                <tr>
                    <td><label for="login">Login:</label> </td>
                    <td><input name="login" id="login" type="text" maxlength="20"/></td>
                </tr>
                <tr>
                    <td><label for="password">Haslo:</label> </td>
                    <td><input name="password" id="password" type="password" maxlength="20"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Zapisz"/></td>
                </tr>
            </table>

        </form>
    </div>
</body>

</html>