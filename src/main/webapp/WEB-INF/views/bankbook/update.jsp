<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<H1> BANKBOOK update page</H1>

<form action ="./update.aa" method = "post" >
<input type ="hidden" name ="booknum"  readonly value ="${dto.booknum}}"> 
<!--hidden : 눈에는 안보이지만 텍스트를 넘기는 것 웹에 표시 x  개발자 모드시 -->
 <!--읽기전용(수정 못하게 막기) : readonly, disabled 파라미터값으로 안넘김 html--> 

<div>
 	Name <input type =" text" name= "bookname" value ="${dto.bookname} }">
</div>

<div>
	 Rate <input type =" text " name="bookrate" value ="${dto.bookrate} }">
</div>

    
   <button type="submit">update</button>
	<a href="../"><input type="button" value="메인으로 이동"></a>
	
	
</form>

</body>
</html>