<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>ページ3</title>
	</head>
	<body>
		確定しました．<br>
		<table border="1">
			<tr>
				<td>セミナー名</td>
				<td>人数</td>
			</tr>
			<c:forEach var="orderlistitem" items="${orderlist}">
			<tr>
				<td>
					<c:out value="${orderlistitem.seminar}" />
				</td>
				<td>
					<c:out value="${orderlistitem.orderninzu}" />
				</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>