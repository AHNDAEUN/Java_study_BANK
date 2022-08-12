<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join page</title>
</head>
<body>

<h1> Join page </h1>
	<div  class = "container">
	<h3> 회원가입 </h3>
		<form action = "join.aa" method ="post" >
		<div>
		    아이디 입력 <input type="text" name = "username"> 
		    <input type="button" value="중복확인"> 
		    <br><br>
		    비밀번호 입력 <input type="password" name ="Passwoard">  
		    <input type="reset">
		    <br>
		    비밀번호 확인 <input type="password">
		    <br><br>
		    이름 입력 <input type="text" name ="name">
		    <br><br>
		    생년월일 입력 <input type="text" value=" ex) 1900 / 00 / 00  ">
		    <input type="date">
		    <br><br>
		    
		    이메일 입력<input type = "text" name = "email">
		    전화번호 입력 <input type="number" name = "phone" >
		    <br><br>
		
		    지역 <select>
		        <OPtion >서울</OPtion>
		        <OPtion >경기</OPtion>
		        <OPtion >세종</OPtion>
		
		    </select>
		    <BR>
		     주소 입력 <textarea rows="2" cols="30"> </textarea>
		
		</div>
		
		<div>
		    <br><br><br>
		    <input type="submit" value="회원가입">
		    <input type="button" value="취소">
		
		</div>
		
		  <a href = "./login" ><input type="button" value="로그인 이동"></a>
		</form>

</body>

</html>