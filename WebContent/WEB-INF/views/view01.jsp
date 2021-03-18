<%-- page 지시자 --%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 템플릿 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>view01.jsp</h5>
	<hr/>
	<%-- 스크립트릿(Scriptlet) --%>
	<%
	String name = "홍길동";
	%>
	
	<%-- 표현식(Expressions) --%>
	이름: <%=name %>
	
	<%-- 태그와 자바 코드를 결합한 형태 --%>
	<%for (int i = 1; i <= 6; i++) {%>
		<h<%=i%>><%=name%></h<%=i%>>
	<%}%>
</body>
</html>