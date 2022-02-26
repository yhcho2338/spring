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
<title>로그인 창</title>
</head>
<body>

<c:if test="${empty param.userID }">
아이디를 입력하세요<br>
<a href="login.jsp">로그인 창</a>
</c:if>

<c:if test="${not empty param.userID }">
  <c:if test="${param.userID == 'admin' }">
   <h1>관리자로 로그인 했습니다</h1>
   <form>
     <input type=button value="삭제" />
     <input type=button value="수정" />
   </form>
   <br>
   <h5> </h5><a href="login.jsp">로그아웃 후 로그인창으로 이동</a> </h5>
  </c:if>
  <c:if test="${param.userID != 'admin' }">
     <h1>환영합니다 <c:out value="${param.userID }" />님 </h1>
  </c:if>
</c:if>
</body>
</html>