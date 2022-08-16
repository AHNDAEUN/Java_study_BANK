<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> detail page </title>
</head>
<body>

<h1> board detail page </h1>

<tr>

				<th>BOARDNUM</th>
				<th>BOARDSUBJECT</th>
				<th>BOARDCONTENT</th>
				<th>BOARDNAME</th>
				<th>BOARDDATE</th>
				<th>BOARDHIT</th>


</tr>


<tr>

			<td> ${requestScope.board.boardNum} </td>
			<td> ${requestScope.board.boardSubject} </td>
			<td> ${requestScope.board.boardContent} </td>
			<td> ${requestScope.board.boardName} </td>
			<td> ${requestScope.board.boardDate} </td>
			<td> ${requestScope.board.boardHit} </td>


</tr>
 <a href=" ./update.aa"><button>  글 수정하기 </button> </a>>
<a href="./delete.aa"><button> 글 삭제하기 </button> </a>>
</body>
</html>