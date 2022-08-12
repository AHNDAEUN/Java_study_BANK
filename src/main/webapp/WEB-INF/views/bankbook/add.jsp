<%@page import="java.util.Calendar"%>
<%@page import="com.iu.start.bankbook.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% BookDTO bookDTO =new BookDTO(); %>
    <% Calendar cal = Calendar.getInstance(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		
		<h1> add page </h1>
		<form action = "./add.aa", method ="post">
		<div>
		계좌명 입력 <input type = " text " name = "BookName" >
			<br><br>
			 <input type="reset" value ="다시 입력">
	
		</div>
		    <div>
		    <br><br>
		     이자율 입력 <input type="text" name ="BookRate">
		      <input type="reset" value ="다시 입력">
		    </div>
		    
		    <div>
		    <br><br><br>
		    <input type="submit" value="추가 등록">
		    <button type="submit">add</button>
		
		</div>
		
		
		</form>





</form>
</body>
</html>