<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>修改页面</title>
	</head>
	<body>
	
	<form method="post" action="edit">	
		<table border="1">
			
			<tr>
				<td colspan="2">修改用户信息</td>
			</tr>
			<tr>
				<td>编号</td>
				<td>
					<input type="text" name="id" value="${c.id}" readonly/>
				</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>
					<input type="text" name="uname" value="${c.uname }" />
				</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>
					<input type="text" name="sex" value="${c.sex }"/>
				</td>
			</tr>
			<tr>
				<td>年龄</td>
				<td>
					<input type="text" name="age" value="${c.age }" />
				</td>
			</tr>
			<tr>
				<td>身份证</td>
				<td>
					<input type="text" name="card" value="${c.card }"/>
				</td>
			</tr>
			<tr>
				<td>地址</td>
				<td>
					<input type="text" name="addr" value="${c.addr }"/>
				</td>
			</tr>
 
			<tr>
				<td>
					<a href="/ssmcrud/fanhui">返回</a>
				</td>
				<td>
					<input type="submit" value="提交" />					
				</td>
			</tr>
			
			
		</table>
		
		</form>
		
	</body>
</html>
