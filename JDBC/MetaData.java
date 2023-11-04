import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class MetaData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConn.getConnection();
            DatabaseMetaData dbmd = conn.getMetaData();

            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Name: " + dbmd.getDriverVersion());
            System.out.println("Database Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
            
            String table[] = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, table);

            while(rs.next()) {
                // System.out.println(rs.getString(3));
                String tblName = rs.getString("TABLE_NAME");
                System.out.println("Table Name: " + tblName);

                ResultSet cols = dbmd.getColumns(null, null, tblName, null);
                ResultSetMetaData rsmd = cols.getMetaData();
                int colCount = rsmd.getColumnCount();

                while(cols.next()) {
                    for(int i=1; i<=colCount; i++) {
                        System.out.println(rsmd.getColumnName(i) + ": " + cols.getString(i));
                    }
                    System.out.println("\n\n\n");
                }
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
