<%@page import="java.text.SimpleDateFormat" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head> 
<body>
<%
	Date time=new Date();
	SimpleDateFormat formatter=new SimpleDateFormat("MM-dd HH:mm:ss");
	String data=formatter.format(time);
	System.out.println(data);	
%>
<form action="addServlet">
	请输入宿舍号码:
	<input type="text" name="dorm" placeholder="请输入宿舍号">
	
	<hr>
	检查时间:
	<input type="text" name="time" value="<%=data %>" placeholder="请输入时间">
	<hr>
	宿舍等级:
	<select size="1" name="dengji">
		<option  value="优秀">优秀</option>
		<option  value="良好">良好</option>
		<option  value="一般">一般</option>
		<option  value="差">通报</option>	
	</select>
	<hr>
	宿舍问题: <textarea rows="10" cols="10" placeholder="请输入通报原因" name="reason"></textarea>
	<hr>
	是否通报:
	<input type="radio" name="tongbao" value="通报">通报<br>
	<input type="radio" name="tongbao" value="不通报">不通报
	<hr>
	
	<input type="submit" value="提交"> 

</form>
	


</body>
</html>
