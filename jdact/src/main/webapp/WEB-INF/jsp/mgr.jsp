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
    <title>活动管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<%@include file="common/head.jsp" %>
	<base href="<%=basePath %>>">
	<script type="text/javascript">
		function Remove(Id){
			if(confirm("删除此条信息？")){
				alert("你即将删除");
				location.href='<%=basePath%>'+encodeURI(Id)+'/delete';
			}
		}
	</script>
  </head>
  
  <body>
        <div class="container">
    <div class="panel header-default">
      <div class="panel-heading text-center">
        <h2>活动列表</h2>
      </div>
      <div class="panel-body">
        <table class="table table-hover">
          <thead>
            <tr>
              <th>名称</th>
              <th>开始时间</th>
              <th>活动链接</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="act" items="${mgrList}">
              <tr>
                <td>${act.name}</td>
                <td>${act.time}</td>
                <td>${act.url}</td>
                <td>
                  <button type="button" class="btn btn-info" onclick="Remove('${act.id}')">删除</button>
                  <a class="btn btn-info" href="/jdact/${act.id }/updata" >更新</a> 
                </td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  </body>
</html>
