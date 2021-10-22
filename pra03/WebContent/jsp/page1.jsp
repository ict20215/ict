<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList" %>
<%
String[] itemlist1 = {"光学式マウス","19インチ液晶モニタ","DVD-RAMドライブ"} ;
pageContext.setAttribute("itemlist2", itemlist1);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>ページ1</title>
	</head>
	<body>
		<form action="../ControllerP1toP2map" method="POST">
		発注したい品名と発注数<br>
			<table border="1">
				<tr>
					<td>品名</td>
					<td>発注数</td>
				</tr>
				<c:forEach var="item1" items="${itemlist2}">
				<tr>
					<td>
					<input type="hidden" name="item2" value="${item1}">
						<c:out value="${item1}" />
					</td>
					<td>
						<select name="numberoforder1">
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