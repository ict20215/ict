<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>ページ2</title>
	</head>
	<body>
		<form action="ControllerP2toP3map" method="POST">
		以下の内容でよろしいですか？<br>
			<table border="1">
				<tr>
					<td>セミナー名</td>
					<td>人数</td>
				</tr>
				<c:forEach var="orderlistitem" items="${orderlist}">
				<tr>
					<td>
						<c:out value="${orderlistitem.seminar5}" />
					</td>
					<td>
						<c:out value="${orderlistitem.orderninzu}" />
					</td>
				</tr>
				</c:forEach>
			</table>
			<p>
				<input type="submit" value="決定">
			</p>
		</form>
	</body>
</html>