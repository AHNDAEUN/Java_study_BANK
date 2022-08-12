<%@page import="com.iu.start.test.bank.BankMemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%BankMemberDTO bankMembersDTO = new BankMemberDTO(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> search page </h1>

<form action= "./search.aa " method ="POST">

 회원 이름 입력: <input type = "text" name ="search">
<button type = "submit">search</button>


</form>


</body>
</html>