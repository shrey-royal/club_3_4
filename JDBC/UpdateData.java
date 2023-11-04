import java.sql.*;
import java.util.Scanner;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();
            
            String query = "UPDATE pizzatoppingspreferences SET favorite_topping=?, topping_confidence=?, unusual_combination=? WHERE pizza_lover_name=?;";

            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Name: ");
            pstmt.setString(4, sc.next());

            System.out.print("Enter Favorite Topping: ");
            pstmt.setString(1, sc.next());

            System.out.print("Enter Topping Confidence: ");
            pstmt.setString(2, sc.next());

            System.out.print("Is it Unusual Combination?(1/0) -> ");
            pstmt.setInt(3, sc.nextInt());

            sc.close();

            int re = pstmt.executeUpdate();
            if(re > 0) {
                System.out.println("Data Updated Successfully!");
            } else {
                System.out.println("Failed to Update Data!");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}