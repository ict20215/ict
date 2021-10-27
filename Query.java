
//java.sql�p�b�P�[�W�̃C���|�[�g
import java.sql.*;

public class Query {
    public static void main(String[] args) {
        Query query = new Query();
        query.select();
    }

    public void select() {
        // Connection�N���X�̕ϐ�conn���`
        Connection conn = null;
        Statement stmt = null; 
        ResultSet rs = null;
        try {
            // JDBC�h���C�o�N���X��JavaVM�ɓo�^
            Class.forName("com.mysql.cj.jdbc.Driver");
            String uri = "jdbc:mysql://localhost:3306/sql_lesson?characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B9:00";
            // DB�ւ̐ڑ�����
            conn = DriverManager.getConnection(uri,"root","rootpass");
            // Statement�I�u�W�F�N�g�̍쐬
            stmt = conn.createStatement();
            // SELECT�����̎��s
            rs = stmt.executeQuery("SELECT " + "staff_code as �Ј��ԍ�," + "staff_name as �Ј���," + "work_years as �Α��N��," + "wages as ����" + " FROM staff");
            // �����������P��������
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
                // ResultSet�I�u�W�F�N�g��Statement�I�u�W�F�N�g�̃N���[�Y����
                rs.close();
                stmt.close();
                // �ؒf
                conn.close();
            } catch (SQLException e) {
                // ��O����
            }
        }
    }
}