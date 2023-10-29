import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            //Load the driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create the connection object
            final String URL = "jdbc:mysql://localhost:3306/club_34";
            final String USERNAME = "root";
            final String PASSWORD = "root";
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if(conn != null) {
                System.out.println("DB Connected Successfully!");
            } else {
                System.out.println("Failed to connect with the DB!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // public static void main(String[] args) {
    //     try {
    //         //Load the driver Class
    //         Class.forName("com.mysql.cj.jdbc.Driver");

    //         //Create the connection object
    //         final String URL = "jdbc:mysql://localhost:3306/club_34";
    //         final String USERNAME = "root";
    //         final String PASSWORD = "root";
    //         Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

    //         if(conn != null) {
    //             System.out.println("DB Connected Successfully!");
    //         } else {
    //             System.out.println("Failed to connect with the DB!");
    //         }

    //         //Close the connection object
    //         conn.close();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
}
/*
Steps to communicate with the database:

1. Load the driver class
2. Create the connection object
3. Create the statement object
4. Execute the query
5. Close the connection object

these steps throws 2 different types of exceptions:
1. class not found exception
2. SQL exception


*/