<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 한글 깨짐 방지 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%-- jsp 사용 선언  --%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<!-- 멤버 속성을꺼냈을때 null이면 ?-->
<%-- <c:if test="${member eq null}"> --%>
<!-- null 비교 ${empty member} -->

<c:if test=" ${empty sessionScope.member}">
<a href="./member/login.aa">Login</a>
<a href="./member/join.aa">join</a>
</c:if>
<hr>
<c:if test=" ${not empty sessionScope.member}">
<h3>${sessionScope.member.name} 환영합니다. </h3>
<a href= "./member/logout.aa">logout</a>
<a href="#">mypage</a> 
<!--  주소를 모를 땐 # 현재 주소 -->
</c:if>

<a href="./bankbook/add.aa "> add </a>
<a href="./member/search.aa "> member search </a>
<a href="./member/list.aa "> member list </a>
</body>
</html>
