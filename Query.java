
//java.sqlパッケージのインポート
import java.sql.*;

public class Query {
    public static void main(String[] args) {
        Query query = new Query();
        query.select();
    }

    public void select() {
        // Connectionクラスの変数connを定義
        Connection conn = null;
        Statement stmt = null; 
        ResultSet rs = null;
        try {
            // JDBCドライバクラスをJavaVMに登録
            Class.forName("com.mysql.cj.jdbc.Driver");
            String uri = "jdbc:mysql://localhost:3306/sql_lesson?characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B9:00";
            // DBへの接続処理
            conn = DriverManager.getConnection(uri,"root","rootpass");
            // Statementオブジェクトの作成
            stmt = conn.createStatement();
            // SELECT処理の実行
            rs = stmt.executeQuery("SELECT " + "staff_code as 社員番号," + "staff_name as 社員名," + "work_years as 勤続年数," + "wages as 給料" + " FROM staff");
            // 検索処理を１件ずつ処理
            while (rs.next()) {
                System.out
                        .println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t\t" + rs.getInt(4));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // ResultSetオブジェクトとStatementオブジェクトのクローズ処理
                rs.close();
                stmt.close();
                // 切断
                conn.close();
            } catch (SQLException e) {
                // 例外処理
            }
        }
    }
}