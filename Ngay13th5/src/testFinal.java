import java.sql.*;
import java.util.Scanner;

public class testFinal {
    public static void main(String[] args) throws SQLException {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test", "root", "");
                Statement stmt = conn.createStatement();
        ) {
//
            Scanner scanner = new Scanner(System.in);  // Create a Scanner scanner
            System.out.println("Enter data to search: ");
            String findData = scanner.next();
            System.out.println("Data to search is: " + findData);
            System.out.println();
//
            String findbyID = "SELECT * FROM six where id like '%"+findData+"%'";
            String findbyName = "SELECT * FROM six where name like '%"+findData+"%'";
            String findbyAge = "SELECT * FROM six where age like '%"+findData+"%'";
            String findbyGender = "SELECT * FROM six where gender like '%"+findData+"%'";
            String query[] ={findbyID,
                    findbyName,findbyAge
                    ,findbyGender};
            for(String q : query){
//
                ResultSet resultSet1 = stmt.executeQuery(q);
                System.out.println("Corresponding searched data at column: "+q+":");
//
                while (resultSet1.next()) {
                    String id = resultSet1.getString("id");
                    String name = resultSet1.getString("name");
                    int age = resultSet1.getInt("age");
                    String gender = resultSet1.getString("gender");
                    System.out.println("Data:"+id + ", " + name + ", " + age + ", " + gender);
                    String str = String.valueOf(age);
                    String all[] = {id,name,str,gender};
                    String nullElemnt[]={};
//                    if (all != nullElemnt){
//                        System.out.println("Success");
//                    }else {
//                        System.out.println("NULL");
//                    }
//                    boolean s = Arrays.equals(all,nullElemnt);
//                    if (s==false){
//                        System.out.println("Success");
//                    }else {
//                        System.out.println("NULL");
//                    }
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

