<%-- page 지시자 --%>
<%@ page contentType="text/html; charset=UTF-8" %>
    
<%-- 템플릿 --%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
		<link rel="stylesheet" href="/servlet/bootstrap-4.6.0/css/bootstrap.min.css">
		<script src="/servlet/js/jquery-3.5.1.min.js"></script>
		<script src="/servlet/bootstrap-4.6.0/js/bootstrap.bundle.min.js"></script>
		<script src="/servlet/bootstrap-4.6.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<h5>view03.jsp</h5>
		<hr/>
		<table class="table">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>글쓴이</th>
			</tr>
			<tr>
				<%-- Expression Language로 데이터 표현 --%>
				<td>${board.bno}</td>
				<td>${board.btitle}</td>
				<td>${board.bcontent}</td>
				<td>${board.bwriter}</td>
			</tr>
		</table>
	</body>
</html>
