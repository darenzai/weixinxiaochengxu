<!DOCTYPE html>
  <%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<head>
	<script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
	<link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
	<script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>

</head>

<body>
<h2>小型SSM crudDEMO</h2>
<%  Date date=new Date();
	SimpleDateFormat df=new SimpleDateFormat("YYYY-dd-MM hh:mm");
	String time=(String)df.format(date);
	System.out.println(time);
%>

<div style=" position: relative;
  left: 350px;
  top: 50px;
  width:50%;
  
  ">
<form >


	<div >
	<h3>Please input dorm number</h3>
	<select class="form-control" id="dorm" width="50">
		<option>201</option>
		<option>202</option>
		<option>203</option>
		<option>204</option>
	</select>
	</div>
	<hr>
	
	<select class="form-control" id="rang" width="">
		<option>优秀</option>
		<option>良好</option>
		<option>一般</option>
		<option>差</option>
	</select>
	<hr>
	<div>
		<div class="input-group">
            <span class="input-group-addon">Time</span>
            <input type="text" class="form-control" placeholder="请输入检查时间" value="<%=time %>" id="date">
        </div>
	</div>
	</hr>
	<h4><span class="input-group-addon">Reason</span></h4>
	
		<div>
		<textarea class="form-control" rows="5" id="reason"></textarea>
		
		</div>
		<hr>
<div>
	
  <div class="radio">
  	<label>
    	<input type="radio" name="optionsRadios" id="tongbao" value="通报">
   		 	通报
  		</label>
  	<label>
    	<input type="radio" name="optionsRadios" id="tongbao" value="不通报">
    	不通报
  	</label>
	</div>	
	
</div>
	<div>
	
		<input type="submit" class="btn btn-default" value="提交">
	</div>
	
</form>
</div>


</body>
</html>
