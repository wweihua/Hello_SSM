<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="common/tag.jsp"%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<title> 京东优惠券,京东优惠券免费领取,京东券,京东商城优惠券,京东优惠券领取-慢淘优惠卷网</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta name="keywords" content="2016京东双十一攻略 京东优惠券,京东优惠券免费领取,京东券,京东商城优惠券,京东优惠券领取,什么值得买">
	<meta name="Description" content="券妈妈慢淘优惠网(www.mtoke.cn)有免费京东优惠券领取，有最新2016年11月京东优惠券,京东优惠券免费领取,京东券,京东商城优惠券,京东优惠券领取，更多京东代金券和京东优惠券团购请访问券妈妈" />
	<%@include file="common/head.jsp"%>
	<style type="text/css">
		body { padding-top: 70px; }
		
	</style>
	<base href="<%=basePath%>"> 
</head>
<body>
	<%@include file="common/nav.jsp"%>
	<div class="container">
		<div class="row row-offcanvas row-offcanvas-right">
			<div class="col-xs-12 col-sm-9">
				<!-- <p class="pull-right visible-xs">
				<button type="button" class="btn btn-primary btn-xs"
						data-toggle="offcanvas">Toggle nav</button>
			</p>
			-->
			<div class="jumbotron">
				<h1>热门优惠券</h1>
				<p>这个广告位有人要吗?</p>
			</div>
			<div class="row">
				<c:forEach var="act" items="${list}">
					<div class="col-sm-6 col-md-4">
						<div class="thumbnail">
							<div class="caption">
								<h4>${act.name}</h4>
								<p>
									活动时间：${act.time}
									<br />
									活动链接:${act.url}
								</p>
								<p>
									<a href="${act.url}" title="京东自营商品优惠券" class="btn btn-info" target="_blank"
											role="button">直达</a>
									<a class="btn btn-default"
											href="<%=basePath %>${act.id }/detail" target="_blank" role="button">详情</a>
								</p>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<!--/row-->
		</div>
		<!--/.col-xs-12.col-sm-9-->
		<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar"
				role="navigation">
			<div class="list-group">
				<a href="#"	class="list-group-item active">友情链接</a>
				<a href="http://www.zuanke8.com/zuixin.php" class="list-group-item ">赚客吧</a>
				<a href="http://t.cn/RVKZKTv"	class="list-group-item">京东</a>
				<a href="http://s.click.taobao.com/OUkPYQx" class="list-group-item">天猫红包</a>
				
			</div>
		</div>
		<!--/.sidebar-offcanvas-->
	</div>
	<!--row  -->
</div>
<hr>
<script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1256931592'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/z_stat.php%3Fid%3D1256931592' type='text/javascript'%3E%3C/script%3E"));</script>
</body>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</html>