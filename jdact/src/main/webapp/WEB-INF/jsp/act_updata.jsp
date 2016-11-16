<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="common/tag.jsp" %>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>活动更新</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<%@include file="common/head.jsp" %>
	<base href="<%=basePath%>"> 
	<style type="text/css">
		body { padding-top: 70px; }
		
	</style>
  </head>
  
  <body>
  	<%@include file="common/nav.jsp" %>
    <div class="container">
    	<form action="<%=basePath%>updata" method="get" class="form-horizontal" role="form">
    		<input type="hidden" name="id" value="${act.id }">
  			<div class="form-group">
  				<lable class="col-sm-2 control-label">活动名称</lable>
  				<div class="col-sm-10">
    				<input type="text" class="form-control" name="name" value="${act.name}">
    			</div>
  			</div>
  			<div class="form-group">
  				<lable class="col-sm-2 control-label">活动链接</lable>
  				<div class="col-sm-10">
    				<input type="text" class="form-control" name="url" value="${act.url }">
    			</div>
  			</div>
  			<div class="form-group">
  				<lable class="col-sm-2 control-label">活动时间</lable>
  				<div class="col-sm-10">
    				<input type="text" class="form-control" name="time" value="${act.time }">
    			</div>
  			</div>
  			<div class="col-sm-offset-2 col-sm-10">
  				<button type="submit" class="btn btn-default">更新</button>
  			</div>
		</form>
    </div>
  </body>
  <%@include file="common/footer.jsp"%>
</html>
