import java.sql.*;

public class Insert {

  public static void main(String[] args) {
    if (args.length < 4) {
      System.out.println("コマンドライン引数が足りません");
      return;
    }
    Insert tran = new Insert();
    try {
      int code = Integer.parseInt(args[0]);
      String name = args[1];
      int year = Integer.parseInt(args[2]);
      int wages = Integer.parseInt(args[3]);
      tran.insert(code, name, year, wages);
    } catch (NumberFormatException e) {
      System.out.println(
        "社員番号、社員名、勤続年数、給料" + "の順で引数に渡してください"
      );
    }
  }

  public void insert(int code, String name, int year, int wages) {
    Connection conn = null;
    PreparedStatement stmt = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String uri =
        "jdbc:mysql://localhost:3306/sql_lesson?characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B9:00";
      conn = DriverManager.getConnection(uri, "root", "rootpass");
      String sql =
        "INSERT INTO staff" +
        "(staff_code, staff_name, work_years, wages)" +
        " VALUES(?, ?, ?, ?)";
      stmt = conn.prepareStatement(sql);
      stmt.setInt(1, code);
      stmt.setString(2, name);
      stmt.setInt(3, year);
      stmt.setInt(4, wages);
      int rowCount = stmt.executeUpdate();
      System.out.println(rowCount + "行のデータを追加しました");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        conn.close();
      } catch (SQLException e) {
        // 例外処理
      }
    }
  }
}
