<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>rei08_request.jsp</title>
</head>
<body>

	<form action="../a" method="POST">
		<table border="1">
			<tr>
				<td>性別</td>
				<td><input type="radio" name="sei" value="男">男 <input
					type="radio" name="sei" value="女">女</td>
			</tr>
			<tr>
				<td>年齢</td>
				<td>
				    <select name="nen">
						<s:forEach var="i" begin="18" end="90" step="1">
							<option value="${i}"><s:out value="${i}"/></option>
						</s:forEach>
                    </select>
        		</td>
			</tr>
			<tr>
				<td>このセミナーをどのように知りました？（複数選択可）</td>
				<td>
					<input type="checkbox" name="mosidoki" value="パンフレット">パンフレット
					<input type="checkbox" name="mosidoki" value="ホームページ">ホームページ
					<input type="checkbox" name="mosidoki" value="会社指示">会社支持
				</td>
			</tr>
			<tr>
				<td>開講を希望するセミナーを選択して（複数選択可）</td>
				<td>
					<select name="seminar" multiple="multiple">
						<option value="Javaデザインパターン">Javaデザインパターン</option>
						<option value="Spring">Spring</option>
						<option value="JSF">JSF</option>
						<option value="Eclipse WTP">Eclipse WTP</option>
					</select>
				</td>

			</tr>
		</table>
		<p>
			<input type="submit" value="決定">
		</p>
	</form>
</body>
</html>