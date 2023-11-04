import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();

            String query = "DELETE FROM pizzatoppingspreferences WHERE pizza_lover_name=?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            pstmt.setString(1, sc.next());
            sc.close();

            int re = pstmt.executeUpdate();

            if(re > 0) {
                System.out.println("Data Deleted Successfully!");
            } else {
                System.out.println("Failed to delete data!");
            }
            conn.close();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
