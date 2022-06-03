public class CommitCatchTest {
    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            try {
                conn.setAutoCommit(false);
                stmt.executeUpdate("insert into books values(4001, 'Paul chan', 'Mahjong 101', 4.4, 4)");
                stmt.executeUpdate("insert into books values (4001, 'Paul chan', 'Mahjong 102', 4.4, 4)");
                conn.commit();
            } catch (SQLException ex) {
                System.out.printf("--Rolling back changes --");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
