<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList" %>
<%
String[] itemnames = {"おいしいお茶","ミネラル健康水","スカッとメロン"};
String[] itemprices = {"1200円","1000円","2400円"} ;
/* ページスコープに登録するために以下の処理を行う．
これをしないとJSPで使用できない． */
pageContext.setAttribute("itemnames", itemnames);
pageContext.setAttribute("itemprices", itemprices);

%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>ページ1</title>
	</head>
	<body>
	<c:out value="${item1}" />
		<form action="../ControllerP1toP2map" method="POST">
			<table border="1">
				<tr>
					<td>商品名</td>
					<td>価格</td>
					<td>数量</td>
				</tr>
				<c:forEach var="itemname" items="${itemnames}" varStatus="st">
				<tr>
					<td><c:out value="${itemname}" />
						<input type="hidden" name="itemname" value="${itemname}">
					</td>
					<td><c:out value="${itemprices[st.count-1]}" />
						<input type="hidden" name="itemprice" value="${itemprices[st.count-1]}">
					</td>
					<td>
						<select name="quantity">
							<c:forEach var="i" begin="0" end="100" step="1">
								<option value="${i}"><c:out value="${i}ケース"/></option>
							</c:forEach>
						</select>
					</td>

				</tr>
				</c:forEach>
			</table>
			<p>
				<input type="submit" value="送信">
			</p>
		</form>

	</body>
</html>