<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
	<meta charset="UTF-8">
	<title>게시판 목록보기</title>
	<style>
		* {
			margin: 0 auto;
			padding: 0 auto;
			overflow: hidden;
		}
		h2, td {
			text-align: center;
		}
	</style>
</head>

<body>
	<h2>게시판 목록보기</h2>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<tr>
			<td>1</td>
			<td>박사온</td>
			<td>제목</td>
			<td>날짜</td>
			<td>3</td>
		</tr>
		<tr>
			<td colspan="5"><a href="writeForm">글 작성</a></td>
		</tr>
	</table>

</body>
</html>