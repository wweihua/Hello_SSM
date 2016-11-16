<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="common/tag.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>慢淘优惠劵网活动详情</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta name="keywords" content="2016京东双十一攻略 京东优惠券,京东优惠券免费领取,京东券,京东商城优惠券,京东优惠券领取,什么值得买">
	<meta name="Description" content="券妈妈慢淘优惠网(www.mtoke.cn)有免费京东优惠券领取，有最新2016年11月京东优惠券,京东优惠券免费领取,京东券,京东商城优惠券,京东优惠券领取，更多京东代金券和京东优惠券团购请访问券妈妈" />
	<%@include file="common/head.jsp" %>
	<link rel="stylesheet" href="../css/style.css">
	<style type="text/css">
		body { padding-top: 70px; }
		
	</style>
  </head>
  
  <body>
  	<%@include file="common/nav.jsp" %>
    <div class="container">
    <div class="panel panel-default text-center">
        <div class="pannel-heading">
            <h1>${detail.name}</h1>
        </div>
        <div class="panel-body">
            <h2 class="text-danger">活动时间:${detail.time}</h2>
            <h2 class="text-danger">活动链接:${detail.url}</h2>
        </div>
        <div>
        	<img alt="" src="http://pan.baidu.com/share/qrcode?w=150&h=150&url=${detail.url }">
        </div>
    </div>
</div>
	<script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1256931592'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s95.cnzz.com/z_stat.php%3Fid%3D1256931592' type='text/javascript'%3E%3C/script%3E"));</script>
  </body>
  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</html>
