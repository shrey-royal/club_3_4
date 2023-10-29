import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            String query = "SELECT * FROM PizzaToppingsPreferences;";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Person_id\tPizza Lover Name\tFavorite Topping\tTopping Confidence\tUnusual Combination");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString("pizza_lover_name") + "\t\t\t" + rs.getString("favorite_topping") + "\t\t\t" + rs.getInt("topping_confidence") + "\t\t\t" + rs.getBoolean("unusual_combination"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
