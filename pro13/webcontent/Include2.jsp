<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("utf-8");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include2.jsp</title>
</head>
<body>
안녕하세요. 쇼핑몰 JSP 시작입니다.
<br>  
<jsp:include  page="imageLoad.jsp"  flush="true" >
   <jsp:param name= "name"  value="콩" />
   <jsp:param name="imgName"  value="kong.jpg" />
</jsp:include>
<br>
안녕하세요. 쇼핑몰 JSP 끝입니다.!!!

</body>
</html>