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

<hr>

<!-- 멤버 속성을꺼냈을때 null이면 ?-->
<%-- <c:if test="${member eq null}"> --%>
<!-- null 비교 ${empty member} -->

<div><br>
<c:if test="${empty member}">
로그인 <a href="./member/login.aa"><button> Login </button></a>
<br>
회원가입 <a href="./member/join.aa"><button> join </button></a>
</c:if>


<c:if test="${not empty member}">
<%-- <c:if test=" ${not empty sessionScope.member}"> --%>
<h3>${sessionScope.member.name} 환영합니다. </h3>
<a href= "./member/logout.aa">logout</a>
<a href="#">mypage</a> 
<!--  주소를 모를 땐 # 현재 주소 -->
</c:if>

<br>
상품 추가 <a href="./bankbook/add.aa "> <button> add </button> </a>
<br>
상품 검색 <a href="./member/search.aa "> <button> member search </button> </a>
<br>
통장 정보 <a href="./bankbook/list.aa "> <button> bankbook list </button> </a>
<br>
게시판 정보 <a href="./homework/list.aa" > <button> homework list </button> </a> 
</body>
</html>
