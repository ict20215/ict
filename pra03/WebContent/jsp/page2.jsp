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
		以下の内容でよろしいですか？<br>
		<form action="ControllerP2toP3map" accept-charset="UTF-8" method="POST">
			<table border="1">
				<tr>
					<td>品名</td>
					<td>発注名</td>
				</tr>
				<c:forEach var="orderlistitem" items="${orderlist}">
				<tr>
					<td>
						<c:out value="${orderlistitem.item}" />
					</td>
					<td>
						<c:out value="${orderlistitem.numberoforder}" />
					</td>
				</tr>
				</c:forEach>
			</table>
			会社名を入力してくださいよ
			<table border="1">
				<tr>
					<td>会社名</td>
					<td><input type="text" id="companyname" name="companyname"></td>
				</tr>

			</table>
			<p>
				<input type="submit" value="決定">
			</p>
		</form>
	</body>
</html>