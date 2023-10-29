import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            String query = "INSERT INTO PizzaToppingsPreferences (pizza_lover_name, favorite_topping, topping_confidence, unusual_combination) VALUES (?, ?, ?, ?);"; // ? is a placeholder
            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter pizza lover name: ");
            pstmt.setString(1, sc.next());

            System.out.print("Enter favorite topping: ");
            sc.nextLine();
            pstmt.setString(2, sc.nextLine());

            System.out.print("Enter topping confidence: ");
            pstmt.setInt(3, sc.nextInt());

            System.out.print("Enter unusual combination: ");
            pstmt.setBoolean(4, sc.nextBoolean());
            sc.close();

            int re = pstmt.executeUpdate();

            if(re == 1) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data!");
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}