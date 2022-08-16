<%@page import="com.iu.start.test.bank.BankMemberDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.iu.start.test.bank.BankMemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
ArrayList<BankMemberDTO> ar = (ArrayList<BankMemberDTO>)request.getAttribute("list");
--%>    



<!DOCTYPE html>//
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>member list page</h1>
<form action ="search.aa", method ="POST"> 
<%-- <%if(ar != null){ %> --%>
<table border ="1">

	<thead>

			<tr> 
					<th>UserName</th>
					<th>password</th>
					<th>name</th>
					<th>email</th>				
					<th>phone</th>
					
					
				</tr>
				
			</thead>
			
			
			<tbody>
			
			<%-- <c:forEach begin ="0" end ="10" var ="i" step ="2"> 
				자바에서 for (int i=0; i<10; i+2) step으로 2+ (-)는 안됨 증가값만
				<h3> ${pageScope.i} </h3> 
				</c:forEach>--%>
				
				<c:forEach items ="${requestScope.list}" var = "dto"> 
				
				<%-- <h3> ${pageScope.dto} </h3> --%>
				<!-- 주소록 노출 -->
				
				<tr>
					
					<td> ${pageScope.dto.userName}</td>
					<td> ${pageScope.dto.password}</td>
					<td> ${pageScope.dto.name}</td>
					<td> ${pageScope.dto.email}</td>
					<td> ${pageScope.dto.phone}</td>
					
					</tr>	

				</c:forEach>
				<%--list(request에서 꺼냄)를 꺼내서 items에 담음/ 꺼낸 리스트를 dto오 담고 dto는 page에 속함  --%>
				<%-- 리스트는 어레이 리스트에 있어서 꺼낸 다음 변수에 담아 사용함  --%> 
			
			
				<%-- <% for(BankMemberDTO bankMemberDTO:ar){ %>
				<tr>
					<td><%=bankMemberDTO.getUserName()%> </td>
					<td><%= bankMemberDTO.getName() %> </td>
					<td><%= bankMemberDTO.getEmail() %> </td>
					<td><%= bankMemberDTO.getPhone() %> </td>
				</tr>
				
				<%} %> --%>
				
		</tbody>


</table>

<%-- <%} else{ %>
데이터가 없음
<%} %>
 --%>

</form>
</body>
</html>