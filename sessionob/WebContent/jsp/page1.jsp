<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList" %>
<%
String[] seminar1 = {"Strutsセミナー","JSPセミナー","Javaセミナー", "Yasuセミナー" } ;
pageContext.setAttribute("seminar2", seminar1);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>ページ1</title>
	</head>
	<body>
		<form action="../ControllerP1toP2map" method="POST">
		受講したいセミナーと受講人数<br>
			<table border="1">
				<tr>
					<td>セミナー名</td>
					<td>人数</td>
				</tr>
				<c:forEach var="seminaritem1" items="${seminar2}">
				<tr>
					<td>
					<input type="hidden" name="seminar3" value="${seminaritem1}">
						<c:out value="${seminaritem1}" />
					</td>
					<td>
						<select name="ninzu1">
							<c:forEach var="i" begin="0" end="100" step="1">
								<option value="${i}"><c:out value="${i}"/></option>
							</c:forEach>
						</select>
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