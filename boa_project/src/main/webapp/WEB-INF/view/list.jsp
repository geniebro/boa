
<!-- list.jsp -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
                                        "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>미용 구인구직! BoA프로젝트</title>
</head>

<body>
	<table border="1">
		<tr>
			<th>등록번호</th>
			<th>이름</th>
			<th>ID</th>
			<th>위치</th>
			<th>직원수</th>
		</tr>
		<tr>
			<td>${seq}</td>
			<td>${name}</td>
			<td>${userId}</td>
			<td>${location}</td>
			<td>${worker_num}</td>
		</tr>
	</table>
</body>

</html>
