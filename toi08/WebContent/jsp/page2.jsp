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
		<!-- <form action="ControllerP2toP3map" accept-charset="UTF-8" method="POST"> -->
			<table border="1">
				<tr>
					<td>商品名</td>
					<td>価格</td>
					<td>数量</td>
				</tr>
				<c:forEach var="orderlistitem" items="${orderlist}">
				<tr>
					<td>
						<c:out value="${orderlistitem.itemname}" />
					</td>
					<td>
						<c:out value="${orderlistitem.itemprice}" />
					</td>
					<td>
						<c:out value="${orderlistitem.quantity}ケース" />
					</td>
				</tr>
				</c:forEach>
			</table>

<!-- 		</form> -->
	</body>
</html>