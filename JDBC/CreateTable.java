// import java.sql.Statement;
// import java.sql.Connection;
import java.sql.*;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            //create stmt object
            Statement stmt = conn.createStatement();

            //execute query
            String query = "CREATE TABLE PizzaToppingsPreferences (" +
                "person_id INT AUTO_INCREMENT PRIMARY KEY," + 
                "pizza_lover_name VARCHAR(50) NOT NULL," +
                "favorite_topping VARCHAR(50)," +
                "topping_confidence INT," + 
                "unusual_combination BOOLEAN" +
            ");";

            stmt.executeUpdate(query);
            System.out.println("Table created successfully!");
            // if(re == 0) {
            //     System.out.println("Table created successfully!");
            // } else {
            //     System.out.println("Failed to create the table!");
            // }
            
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e);
        }
    }
}