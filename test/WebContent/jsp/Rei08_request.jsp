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
				<td>弊社を利用したことがありますか？</td>
				<td colspan="2"><input type="radio" name="sei" value="初めて利用する">初めて利用する <input
					type="radio" name="sei" value="利用したことがある">利用したことがある</td>
			</tr>
			<tr>
				<td>会社の所在地を入力してください</td>
				<td>
				    <select name="nen">
							<option value="東京都">東京都</option>
							<option value="埼玉県">埼玉県</option>
							<option value="群馬県">神奈川県</option>
                    </select>
        		</td>
        		<td>
					<input type="text" name="tokoro" value="">
        		</td>
			</tr>
			<tr>
				<td>会社名を入力してください</td>
				<td colspan="2">
					<input type="text" name="company" value="">
				</td>
			</tr>
			<tr>
				<td>発注予定のオプション</td>
				<td colspan="2">
					<input type="checkbox" name="mosidoki" value="光学式マウス">光学式マウス
					<input type="checkbox" name="mosidoki" value="モニター">モニター
					<input type="checkbox" name="mosidoki" value="DVDドライブ">DVDドライブ
				</td>
			</tr>
			<tr>
				<td>発注予定のオプション</td>
				<td colspan="2">
					<select name="seminar" multiple="multiple">
						<option value="郵送">郵送</option>
						<option value="メール">メール</option>
						<option value="訪問">訪問</option>
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