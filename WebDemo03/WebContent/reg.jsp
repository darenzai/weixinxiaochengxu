<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.*" %>
<%@page import="javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	
  
        String name = request.getParameter("name");
        String password = request.getParameter("password");
  
     	if("admin".equals(name)){
     		out.println("欢迎你，管理员");
     	}else{
     		out.println("注册成功");
     	}
  
        
  
 
  
    
	
	%>
	
	
</body>
</html>