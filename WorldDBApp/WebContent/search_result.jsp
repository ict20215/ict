<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>World DB App</title>
<style>
	#poplulation {text-align: right;}
</style>
</head>
<body>
City Table List<br>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>CountryCode</td>
			<td>District</td>
			<td>Population</td>
		</tr>
		<c:forEach var="citylistitem" items="${citylist}">
		<tr>
			<td><c:out value="${citylistitem.id}"/></td>
			<td><c:out value="${citylistitem.name}"/></td>
			<td><c:out value="${citylistitem.countrycode}"/></td>
			<td><c:out value="${citylistitem.district}"/></td>
			<td id="population">
				<f:formatNumber value="${citylistitem.population}" type="NUMBER"/>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td>
				<p><a href="IndexToListController?pos=${pb.previous}">＜＜</a></p>
			</td>
			<td></td>
			<td></td>
			<td></td>
			<td>
				<a href="IndexToListController?pos=${pb.next}">＞＞</a>
			</td>
		</tr>
	</table>
</body>
</html>