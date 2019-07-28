<%@ page language="java" contentType="text/html; charset=uTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="script/jquery.min.js"></script>
<script type="text/javascript" >
/*
 * 	
	
	var jsonObject ={
			
		"name":"atguigu"	
	};
	
	alert(jsonObject.name);
	
	
	
	//获取a节点,并为其添加onclick 响应函数



 window.onload=function(){
		
		document.getElementsByTagName("a")[0].onclick =function(){
			
	//3，创建一个XMLHttpRequest对象

		var request =new XMLHttpRequest();
	//4，准备发送请求数据：url

		var url=this.href+ "?time="+new Date();
		var method="POST";
	//5，调用XMLhttpRequest 对象open方法
		request.open(method,url);
		request.setRequestHeader("ContentType","application/x-www-form-urlencoded");
	//6，调用XMLHttpRequest对象的send方法
		request.send("name='getguigu'");
	//7，为XMLHttp 对象添加onreadystatechange 响应函数
	request.onreadystatechange=function(){
		
		if(request.readyState==4){
			if(request.status==200|| request.status==304){
				
				alert(request.responseText);
			}
			
			
			
		}
		
	}
	
	
	
	//8，判断响应是否完成：XmlHttprequest 对象read属行是4的时候响应完成
	
	
	//9在判断响应是否可用 200可用
	
	//10打印响应结果
		
		return false;
		}
	
		
	}
	
	*/
	$(function(){
		$("a").click(function(){
			var url=this.href;
			
			var date= {"time":new Date()};
			$("#content").load(url,date);
		
			return false;
		});
		
		
	});
	
	
	
</script>
</head>
<body>
	<h1><a href="helloAjax.txt">qwqwq</a></h1>

	<div id="content"></div>
</body>
</html>