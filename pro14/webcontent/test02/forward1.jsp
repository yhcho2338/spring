<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<% request.setCharacterEncoding("utf-8");
request.setAttribute("id", "ryu");
request.setAttribute("pwd", "1234");
session.setAttribute("name", "류현진");
application.setAttribute("email", "ryu99@test.com");
%>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>
<jsp:forward page="member1.jsp" />
</body>
</html>