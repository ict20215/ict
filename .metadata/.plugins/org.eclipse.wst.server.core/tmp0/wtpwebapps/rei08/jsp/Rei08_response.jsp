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
				<td>性別</td>
				<td>
					<c:out value="${rei08bean.sei}"/>
				</td>
			</tr>
			<tr>
				<td>年齢</td>
				<td>
					<c:out value="${rei08bean.nen}"/>
				</td>
			</tr>
			<tr>
				<td>セミナーを知った理由</td>
				<td>
					<c:forEach var="mosidoki" items="${rei08bean.mosidoki}">
						<c:out value="${mosidoki}"/>
					</c:forEach>
				</td>
			</tr>
			<tr>
				<td>希望セミナー</td>
				<td>
					<c:forEach var="seminardata" items="${rei08bean.seminar }">
						<c:out value="${seminardata}"/>
					</c:forEach>
				</td>
			</tr>
		</table>
	</body>
</html>