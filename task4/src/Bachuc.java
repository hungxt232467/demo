import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.*;
import java.util.Scanner;

public class Bachuc {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bachuc", "root", "");
                Statement stmt = conn.createStatement()
        ) {
//            Delete a record
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id to delete: ");
            String id = scanner.nextLine();
            System.out.println("id is: " + id);

            String sqlDelete = "delete from five where id + ";
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " record deleted.\n");


////        Insert a record
//                  Scanner scanner = new Scanner(System.in);  // Create a Scanner scanner
//                  System.out.println("Enter studentID  to insert: ");
//                  String StudentID = scanner.nextLine();  // Read StudentID input
//                  System.out.println("StudentID is: " + StudentID);
//
//                  Scanner scanner1 = new Scanner(System.in);  // Create a Scanner scanner1
//                  System.out.println("Enter studentName insert: ");
//                  String StudentName = scanner1.nextLine();  // Read StudentName input
//                  System.out.println("StudentName is: " + StudentName);
//
//                  Scanner scanner2 = new Scanner(System.in);  // Create a Scanner scanner
//                  System.out.println("Enter age  to insert: ");
//                  String StudentAge = scanner2.nextLine();  // Read StudentID input
//                  System.out.println("age is: " + StudentAge);
//
//                  Scanner scanner3 = new Scanner(System.in);  // Create a Scanner scanner1
//                  System.out.println("Enter gender insert: ");
//                  String StudentGender = scanner3.nextLine();  // Read StudentName input
//                  System.out.println("gender is: " + StudentGender);
//
//                  Scanner scanner4 = new Scanner(System.in);  // Create a Scanner scanner1
//                  System.out.println("Enter phoneNumber insert: ");
//                  String StudentPhone = scanner4.nextLine();  // Read StudentName input
//                  System.out.println("phoneNumber is: " + StudentPhone);
//
//                String sqlInsert = "insert into Student value('"+StudentID+"'"
//                +","+"'"+StudentName+"'"
//                +","+StudentAge
//                +","+"'"+StudentGender+"'"
//                +","+"'"+StudentPhone+"')";
//                System.out.println("The SQL statement is: "+ sqlInsert +"\n");
//                int countInserted = statement.executeUpdate(sqlInsert);
//                System.out.println(countInserted+" record insert");
//

//          Update database input
//                  Scanner scanner = new Scanner(System.in);  // Create a Scanner scanner
//                  System.out.println("Enter studentID  to update: ");
//                  String StudentID = scanner.nextLine();  // Read StudentID input
//                  System.out.println("StudentID is: " + StudentID);
//                  Scanner scanner1 = new Scanner(System.in);  // Create a Scanner scanner1
//                  System.out.println("Enter studentName updated: ");
//                  String StudentName = scanner1.nextLine();  // Read StudentName input
//                  System.out.println("StudentName is: " + StudentName);
//                String sqlUpdate = "UPDATE Student " +
//                        "SET studentName='"+StudentName+"'" +
//                        "WHERE studentID='"+StudentID+"'"+";";
//                System.out.println("The SQL preparedStatement is: "+ sqlUpdate +"\n");
//                PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
//                int countUpdated = preparedStatement.executeUpdate(sqlUpdate);
//                System.out.println(countUpdated+" record update");
//

//          Tim kiem theo id & ten
//                  Scanner scanner = new Scanner(System.in);  // Create a Scanner scanner
//                  System.out.println("Enter studentID: ");
//                  String StudentID = scanner.nextLine();  // Read StudentID input
//                  System.out.println("StudentID is: " + StudentID);
//                  String findbyID = "SELECT * FROM Student where studentID like '%"+StudentID+"'";
//                  System.out.println(findbyID);
//            //
//                  Scanner scanner1 = new Scanner(System.in);  // Create a Scanner scanner1
//                  System.out.println("Enter studentName: ");
//                  String StudentName = scanner1.nextLine();  // Read StudentName input
//                  System.out.println("StudentName is: " + StudentName);
//                  String findbyName ="SELECT * FROM Student where studentName like '%"+StudentName+"'";
//                  System.out.println(findbyName);
//            //
//              String query[] ={findbyID,
//                      findbyName};
//                  for(String q : query){
//                  ResultSet resultSet1 = statement.executeQuery(q);
//                  System.out.println("Student for query "+q+" is(studentID, studentName, age, gender, phoneNumber): ");
//                  while (resultSet1.next()) {
//                    String studentID = resultSet1.getString("studentID");
//                    String studentName = resultSet1.getString("studentName");
//                    String age = resultSet1.getString("age");
//                    String gender = resultSet1.getString("gender");
//                    String phoneNumber = resultSet1.getString("phoneNumber");
//                    System.out.println(studentID + ", " + studentName + ", " + age + ", " + gender + ", " + phoneNumber);
//                  }
//                   System.out.println();
//              }

////            Issue a SELECT to check change
            String strSelect = "select * from five";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet resultSet = stmt.executeQuery(strSelect);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("studentID") + ", "
                        + resultSet.getString("studentName") + ", "
                        + resultSet.getInt("age") + ", "
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}