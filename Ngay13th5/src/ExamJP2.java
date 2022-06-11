import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ExamJP2 {
    public static void main(String[] args) throws SQLException {
        String sqlDelete = "delete from Movie where movieID = ?";
//        String sqlUpdate = "UPDATE movies SET ? = ? WHERE ? = ?";
        String sqlInsert = "INSERT INTO Movie VALUES(?, ?, ?, ?, ?)";
        String sqlPrint = "select * from Movie";
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Exam", "root", "");
                PreparedStatement preparedStatement1 = conn.prepareStatement("INSERT INTO Movie VALUES(?,?, ?, ?, ?)");
                PreparedStatement preparedStatement2 = conn.prepareStatement("select * from Movie");
                PreparedStatement preparedStatement3 = conn.prepareStatement("delete from Movie where name = ?");
                PreparedStatement preparedStatement4 = conn.prepareStatement("update Movie set id = ? where name = ?");
                Statement stmt = conn.createStatement();

        ) {
            //delete
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id colum to delete: ");
            String idDelete = scanner.next();
            System.out.println("id to delete is: " + idDelete);
            System.out.println();
//
            PreparedStatement.setString(1,idDelete);
            int rowDelete = PreparedStatement.executeUpdate();
            System.out.println(rowDelete+" successfully deleted");
            ResultSet resultset = preparedStatement3.executeQuery();
            while (resultset.next()){
                String ID = resultset.getString("ID");
                String Name = resultset.getString("Name");
                String Time = resultset.getString("Time");
                String Author = resultset.getString("Author");
                String Ratings = resultset.getString("Ratings");
                System.out.println("Movie:"+ID + ", " + Name + ", " + Time + ", " + Author + ", " + Ratings);
            }
            System.out.println();

            //insert
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter ID to Insert: ");
            String id = scanner1.next();
            System.out.println("ID to Insert is: " + id);
            System.out.println();
//
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter Name to Insert: ");
            String name = scanner1.next();
            System.out.println("Name to Insert is: " + name);
            System.out.println();
//
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter Time to Insert: ");
            String time = scanner2.next();
            System.out.println("time to Insert is: " + time);
            System.out.println();
//
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Enter Author to Insert: ");
            String author = scanner4.next();
            System.out.println("movieDirector to Insert is: " + author);
            System.out.println();
////
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Enter ratings to Insert: ");
            int ratings = scanner5.nextInt();
            System.out.println("ratings to Insert is: " + ratings);
            System.out.println();
//
            preparedStatement1.setString(1,id);
            preparedStatement1.setString(2,name);
            preparedStatement1.setString(3, time);
            preparedStatement1.setString(4,author);
            preparedStatement1.setInt(5,ratings);
            int rowInsert = preparedStatement1.executeUpdate();
            System.out.println(rowInsert+" Successfully Insert");
            ResultSet resultSet = preparedStatement2.executeQuery();
            while (resultSet.next()){
                String MovieID = resultSet.getString("MovieID");
                String MovieName = resultSet.getString("MovieName");
                String MovieTime = resultset.getString("MovieTime");
                String MovieAuthor = resultSet.getString("MovieAuthor");
                String MovieRatings = resultSet.getString("MovieRatings");
                System.out.println("Movie:"+MovieID + ", " + MovieName + ", " + MovieTime + ", " + MovieAuthor + ", " + MovieRatings);
            }
            System.out.println();

//          Search
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("Enter Movie Information You Need To Find: ");
            String findMovie = scanner6.next();
            System.out.println("Enter Movie Information You Need to Find: " + findMovie);
            System.out.println();
////
            String findbyID = "SELECT * FROM Movie where ID like '%"+findMovie+"%'";
            String findbyName = "SELECT * FROM Movie where Name like '%"+findMovie+"%'";
            String findbyTime = "SELECT * FROM Movie where Time like '%"+findMovie+"%'";
            String findbyAuthor = "SELECT * FROM Movie where Author like '%"+findMovie+"%'";
            String findbyRatings = "SELECT * FROM Movie where Ratings like '%"+findMovie+"%'";
            String query[] ={findbyID,
                    findbyName,findbyTime
                    ,findbyAuthor,findbyRatings};
            for(String q : query){
////
                ResultSet resultSet1 = stmt.executeQuery(q);
                System.out.println("Movies In Table According To The Information You Request: "+q+":");
////
                while (resultSet1.next()) {
                    String movieID = resultSet1.getString("movieID");
                    String movieName = resultSet1.getString("movieName");
                    String movieTime = resultSet1.getString("movieTime");
                    String movieAuthor = resultSet1.getString("movieAuthor");
                    int movieRatings = resultSet1.getInt("movieRatings");
                    System.out.println("Movie to search:"
                            +movieID + ", " + movieName + ", " + movieTime
                            + ", " + movieAuthor + ", " + movieRatings);
                }
                System.out.println();
            }
        } catch (SQLException | ParseException ex) {
            ex.printStackTrace();
        }
    }
