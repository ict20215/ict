<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>rei08_response.jsp</title>
	</head>
	<body>
		<table border="1">
			<tr>
				<td>弊社の利用</td>
				<td>
					<c:out value="${a.sei}"/>
				</td>
			</tr>
			<tr>
				<td>会社の所在地</td>
				<td>
					<c:out value="${a.nen}"/>
				</td>
			</tr>
			<tr>
				<td>会社名</td>
				<td>
					<c:out value="${a.company}"/> <c:out value="${a.tokoro}"/>
				</td>
			</tr>
			<tr>
				<td>オプション</td>
				<td>
					<c:forEach var="mosidoki" items="${a.mosidoki}">
						<c:out value="${mosidoki}"/>
						<br>
					</c:forEach>
				</td>
			</tr>
			<tr>
				<td>情報の入手方法</td>
				<td>
					<c:forEach var="seminardata" items="${a.seminar }">
						<c:out value="${seminardata}"/><br>
					</c:forEach>
				</td>
			</tr>
		</table>
	</body>
</html>