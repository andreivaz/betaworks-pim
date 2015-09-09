<%-- 
    Document   : login
    Created on : 22/08/2015, 00:44:38
    Author     : andreivaz
--%>


<!DOCTYPE html>
<html lang="br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Login - BETAWORKS</title>

    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/signin.css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/resources/js/ie-emulation-modes-warning.js"></script>
  </head>

  <body>

    <div class="container">
        <form class="form-signin" action="doLogin" method="post" >
        <h2 class="form-signin-heading">Betaworks System</h2>
        <input type="text" name="user_col" class="form-control" placeholder="Usuário" required autofocus>
        <input type="password" name="password" class="form-control" placeholder="Senha" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Manter conectado
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      </form>
    </div> <!-- /container -->

    <script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
