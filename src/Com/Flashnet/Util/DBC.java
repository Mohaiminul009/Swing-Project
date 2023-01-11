package Com.Flashnet.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBC {
    public static Connection getDB() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/isp", "root", "root");
        } catch (Exception e) {
        }
        return con;
    }
}
