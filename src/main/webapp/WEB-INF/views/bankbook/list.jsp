<%@page import="com.iu.start.bankbook.BookDTO"%>
<%@page import="com.iu.start.bankmember.BankMemberDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%-- 스크립틀릿 형태 <% Java 코드 작성 시 사용% >
    	표현식 HTML <%=자바변수 또는 값% > --%>
    

     <% ArrayList<BookDTO> ar = (ArrayList<BookDTO>) request.getAttribute("list"); %>
   <!-- ① request로 arraylist를 꺼내옴 
   리턴타입은 array로 꺼내오고 list obeject로 가져온것은 list object로 나오기 때문에
    array로 가져오기 위해서 ()로 array를 선언하여 바꿔서 가져옴 (다형성) --> 
   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>bankbook list</h1>
<!--  /bankbook/list 주소 클릭시 list페이지 노출-->

<!--/bankbook/detail jsp : detail.jsp -->
<!--a태그를 클릭하면 디테일 노출-->
<!--link주소는 상대경로 작성-->

<table border ="1"> 

		</thead>
		
		<tr>
		
				<th>BOOKNUM</th> 
			   <th>BOOKNAME</th> 
			   <th>BOOKRATE</th> 
			   <th>BOOKSALE</th>
		
		</tr>
		
		</thead>
		
		<tbody>
		<tr>
				<td> name1 </td> 
				<td> 0.012 </td> 
			</tr>
			
			<tr>
			<!--하나가 dto의 하나에 대한 내용 -->
			
			<tr>	
				<td> name2 </td> 
				<td> 0.133 </td>
				
				</tr>
							
				
				
				 <% for (BookDTO bookDTO : ar ) {%>
			 <!-- 	html에 자바의 코드를 입력하는 방식 =  표현식 -->
				<tr>
				<td>
						<a href= "./detail.aa?BookNum=<%= bookDTO.getBooknum() %>">
								 <%= bookDTO.getBookname() %> </a> 
								 
		 </td>
						 <!--표현식에 ; 생략 / 앞뒤 공백생기지 않게 주의 공백도 글자로 인식-- > 
					
						 
				<td> <%= bookDTO.getBookrate() %></td>
				</tr>
				
				<%}%>
				 
		</tbody>
		  <!--arrylist에 있는 내용을 꺼내와서 출력하려고함
			  	   제목눌러서 경로 이동
				   클라이언트가 서버를 요청하는 경우 url ,a- 입력하는 것 업이 클릭하기때문에 a 사용 , form 테크 매서드 형식에 따라 get, post으로 사용,
				   요청받는 언어 get = url에 직접 입력하는 것 a 태크 post -->

</table>
<a href = "add.aa"> 상품등록 </a>

</body>
</html>