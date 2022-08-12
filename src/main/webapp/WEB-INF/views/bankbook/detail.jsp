<%@page import="com.iu.start.bankbook.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
   <%--  <%
    BookDTO bookDTO = (BookDTO) request.getAttribute("dto");
    %> --%>
    <!-- 서버내에서 jsp를 보낼때 model & modelandview에 담아서 보내는 용도 (request와 비슷함 생명주기가 같음) -->
  <!--   요청이 발생하면 생성, 응답이 나가면 소멸  requsetscope -->
  
<%-- jsp 주석 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>!!!detail page!!!</h1>
<%-- <%if (bookDTO != null) { %> --%>
<!--  변수에 null이 들어가면 에러 발생으로 if를 사용해서 null문제를 방지  -->

<table border="1">
<!-- border 테두리 적용  -->
<tr>

			<td>BOOKNUM</td>
			<td>BOOKNAME</td>
			<td>BOOKRATE</td>
			<td>BOOKSALE</td>



</tr>

<tr>


 <%-- <td> <%= bookDTO.getBookNum() %></td> 
  null일때 booknum을 가져오면 server 연결 시 에러가 뜨며, nullpoint 예외 발생
 --%>
  
  <%--  EL 사용법 => --%>
 <td>${requestScope.dto.getBookNum()}</td> 
<%-- 뱅크북 dto가 나옴  어레이리스트로 꺼낸것과 같음
 어트리뷰트는 오브젝트타입이라 형변환을 해줘야하지만 EL은 자식테이블에 알아서 형변환을 해줌 --%> 

<%-- <td><%= bookDTO.getBookName() %></td> --%>
<td>${requestScope.dto.bookName} </td>

<%--   <td><%=bookDTO.getBookRate() %></td>
                스코프명 생략가능 --%> 
<td>${dto.bookRate}</td>
<%-- <td> <% if (bookDTO.getBookSale()==1) { --%>

<td>${dto.booksale}</td>
 
<%--    판매중
<%} else {%>
 
  판매금지  
  
  <% } %> --%>


</td>


</tr>

</table>
<%--  <%} else {%> 
 <h3> data가 없다 </h3> 
 <% } %>  --%>

<!--  상대경로 -->
<a href = "../member/login.aa" >login</a> 

<!--  절대경로  -->
<a href = "/member/join.aa" >join</a> 

<a href = "./list.aa" >리스트 보기</a> 
<a href ="./update.aa?booknum=${dto.bookNum}"> 수정 </a>
<a href ="./delete.aa?booknum=${dto.bookNum}"> 삭제 </a>
<c:if test="${not empty sessionScope.member}">

<a href ="../account/add.aa?booknum=2"> 상품 가입하기 </a> 

<!--  로그인한 사람만보기 -->
<!-- 현재 위치는 /bankbook/detail  -->
<!-- /안에는 bankbook과 account가 있기때문에 
bankbook에서 account까지 가려면 한단계 (../)위로 올라가서 경로 찾음 -->
<!--  상품 가입하기 클릭시 acoount add 실행 -->
<!--  booknum을 detail에서 parameter로 넘기려면: ? 에 값은 이페이지가 만들어질때 만들어진 디티오 값 -->


</c:if>
</body>
</html>

  <%--
디테일 현재 주소 = /bank book /detail
로그인  /member/login
조인/member/ join  --%>
 
 
