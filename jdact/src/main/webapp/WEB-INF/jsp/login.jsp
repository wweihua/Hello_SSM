<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="common/tag.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<%@include file="common/head.jsp" %>
	
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/signin.css"></c:url>">
	

  </head>
  
  <body>
    <div class="container">
      <form action="login" class="form-signin" role="form" method="post">
        <h2 class="form-signin-heading">请登录</h2>
        <input type="text" class="form-control" id="username" name="username" placeholder="用户名" required autofocus>
        <input type="password" class="form-control" id="password" name="password" placeholder="密码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me">记住我
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>

    </div> <!-- /container -->
  </body>
  <%@include file="common/footer.jsp" %>
</html>
