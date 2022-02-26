<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
request.setCharacterEncoding("utf-8");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 변환창</title>
</head>
<body>
  <c:set var="score" value="${param.score }" />
<c:choose>
 <c:when test="${score>=0 && score<=100 }">  
  <c:choose>
    <c:when test="${score >= 90 && score <= 100 }">
    <h1>A학점</h1>
    <a href="scoreTest.jsp">점수 입력창 돌아가기 </a>  
    </c:when>
    <c:when test="${score >= 80 && score <= 90 }">
    <h1>B학점</h1>
    <a href="scoreTest.jsp">점수 입력창 돌아가기 </a>  
    </c:when>
    <c:when test="${score >= 70 && score <= 80 }">
    <h1>C학점</h1>
    <a href="scoreTest.jsp">점수 입력창 돌아가기 </a>  
    </c:when>
    <c:when test="${score >= 60 && score <= 70 }">
    <h1>D학점</h1>
    <a href="scoreTest.jsp">점수 입력창 돌아가기 </a>  
    </c:when>
    <c:otherwise>
    <h1>F학점</h1>
    <a href="scoreTest.jsp">점수 입력창 돌아가기 </a>  
    </c:otherwise>
   </c:choose>  
 </c:when>
 <c:otherwise> 
    <h1> 점수를 잘못 입력했습니다 </h1>
    <a href="scoreTest.jsp">점수 입력창 돌아가기 </a>
 </c:otherwise> 
</c:choose>
</body>
</html>