<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Page</h1>
	                   <!-- value에서 미리 값을 저장 -->
	<div>
        <form action="./login.aa" method="POST">
            <div class="container">
             <a href= "/"><input type="button" value="메인 페이지로 돌아가기"></a>
                <h2>ID 로그인</h2>
                <div>
                    <input type="text" value="user2" name="userName" >
                </div>
                <div>
                    <input type="password" value="pw2" name="password">
                </div>
               
                   <div class="login">
                       <input type="submit" value="로그인">
                         <input type="reset" value="초기화">
                         <input type="checkbox" value="체크박스">
                       
                  </div>
                </div>
                
                <a href = /study_form_join.aa><input type="button" value="회원가입 하기"></a>
        </form>
    </div>

</body>
</html>