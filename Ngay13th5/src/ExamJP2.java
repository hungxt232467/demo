public class ExamJP2 {
    public static void main(String[] args) throws SQLException {
        String sqlDelete = "delete from Movie where movieID = ?";
//        String sqlUpdate = "UPDATE movies SET ? = ? WHERE ? = ?";
        String sqlInsert = "INSERT INTO Movie VALUES(?, ?, ?, ?, ?)";
        String sqlPrint = "select * from Movie";
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Exam", "root", "");
                Statement stmt = conn.createStatement();

        ) {
            //delete
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter id to delete: ");
//            String id = scanner.nextLine();
//            System.out.println("id is: " + id);
//
//            String sqlDelete = "delete from Movie where id + ";
//            System.out.println("The SQL statement is: " + sqlDelete + "\n");
//            int countDeleted = stmt.executeUpdate(sqlDelete);
//            System.out.println(countDeleted + " record deleted.\n");
            //insert
//            Scanner scanner1 = new Scanner(System.in);
//                 System.out.println("Enter findID  to insert: ");
//                 String FindID = scanner1.nextLine();
//                  System.out.println("FindID is: " + FindID);
//            Scanner scanner2 = new Scanner(System.in);
//            System.out.println("Enter FindName insert: ");
//            String FindName = scanner2.nextLine();
//            System.out.println("FindName is: " + FindName);
//
//            Scanner scanner3 = new Scanner(System.in);
//            System.out.println("Enter FindTime  to insert: ");
//            String FindTime = scanner3.nextLine();
//            System.out.println("FindTime is: " + FindTime);
//
//            Scanner scanner4 = new Scanner(System.in);
//            System.out.println("Enter author insert: ");
//            String FindAuthor = scanner4.nextLine();
//            System.out.println("Author is: " + FindAuthor);
//
//            Scanner scanner5 = new Scanner(System.in);
//            System.out.println("Enter ratings insert: ");
//            String FindRatings = scanner5.nextLine();
//            System.out.println("Ratings is: " + FindRatings);
//
//            String sqlInsert = "insert into Movie value('"+FindID+"'"
//                    +","+"'"+FindName+"'"
//                    +","+FindTime
//                    +","+"'"+FindAuthor+"'"
//                    +","+"'"+FindRatings+"')";
//            System.out.println("The SQL statement is: "+ sqlInsert +"\n");
//            int countInserted = stmt.executeUpdate(sqlInsert);
//            System.out.println(countInserted+" record insert");
            //update
//            Scanner scanner6 = new Scanner(System.in);
//            System.out.println("Enter ID  to update: ");
//            String ID = scanner6.nextLine();
//            System.out.println("ID is: " + ID);
//            Scanner scanner7 = new Scanner(System.in);
//            System.out.println("Enter Name updated: ");
//            String Name = scanner7.nextLine();
//            System.out.println("Name is: " + Name);
//            String sqlUpdate = "UPDATE Movie " +
//                    "SET Name='" + Name + "'" +
//                    "WHERE ID='" + ID + "'" + ";";
//            System.out.println("The SQL preparedStatement is: " + sqlUpdate + "\n");
//            PreparedStatement preparedStatement = conn.prepareStatement(sqlUpdate);
//            int countUpdated = preparedStatement.executeUpdate(sqlUpdate);
//            System.out.println(countUpdated + " record update");
            //search
            Scanner scanner8 = new Scanner(System.in);
            System.out.println("Enter ID: ");
            String ID = scanner8.nextLine();
            System.out.println("StudentID is: " + ID);
            String findbyID = "SELECT * FROM Movie where ID like '%" + ID + "'";
            System.out.println(findbyID);

            Scanner scanner9 = new Scanner(System.in);
            System.out.println("Enter Name: ");
            String Name = scanner9.nextLine();
            System.out.println("Name is: " + Name);
            String findbyName = "SELECT * FROM Movie where studentName like '%" + Name + "'";
            System.out.println(findbyName);
            String query[] = {findbyID,
                    findbyName};
            for (String q : query) {
                ResultSet resultSet1 = stmt.executeQuery(q);
                System.out.println("Corresponding searched data at column: " + q + ":");
            }
            while (resuSet1.next()) {
                int id = resultSet1.getInt("id");
                String name = resultSet1.getString("name");
                int time = resultSet1.getInt("time");
                String author = resultSet1.getString("author");
                int ratings = resultSet1.getInt("ratings");
                System.out.println("Movie To Search: " + id + ", " + name + ", " + time + ", " + author + ", " + ratings);
            }
            System.out.println();
            String strSelect = "select * from Movie";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet resultSet = stmt.executeQuery(strSelect);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("ID") + ", "
                        + resultSet.getString("Name") + ", "
                        + resultSet.getInt("Time") + ", "
                        + resultSet.getInt("Author") + ", "
                        + resultSet.getInt("Ratings") + ", "
                );
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

