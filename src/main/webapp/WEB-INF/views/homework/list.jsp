<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> list page </title>
</head>
<body>


<h1>  borad list page  </h1>
		
		<form >
		
		<table border ="1">
		
		<thead>
		
	 <tr>
		
				<th>BOARDNUM</th>
				<th>BOARDSUBJECT</th>
				<th>BOARDNAME</th>
				<th>BOARDDATE</th>
				<th>BOARDHIT</th>
		
		</tr>
		
		</thead>
		
		<tbody>
		
		<c:forEach items="${list}" var ="board">
		
		<tr>    <!-- 한줄에 4칸 생성 -->
				   <td> ${board.boardNum} </td> 
				  <td><a href="./detail.aa?boardSubject=${board.boardNum}">
				  ${board.boardSubject}</a></td>  
				  <td> ${board.boardName}</td> 
				  <td> ${board.boardDate}</td> 
				  <td> ${board.boardHit}</td>
				 				 
				 
		</tr>
		
		
		</c:forEach>
		
		
		
		</tbody>
		
		
		
		</table>
		
		
</form>
</body>
</html>