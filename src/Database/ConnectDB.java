package Database;

import java.sql.*;

public class ConnectDB {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/corendon";
    public static final String DBUSER = "root";
    public static final String DBPASS = "root";
    private ResultSet result = null;
    private int affectedRows = -1;
    Connection conn = null;

    public void startConnection() {
        try {

            Class.forName(DRIVER);
            DriverManager.setLoginTimeout(5);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

        } catch (Exception e) {
            System.out.println("ERROR: Caught @ Line 23 : Database.ConnectDB.java");
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("ERROR: Caught @ Line 34 : Database.ConnectDB.java");
            e.printStackTrace();
        }
        conn = null;
    }

    public ResultSet performSelect(PreparedStatement prdstmt) throws SQLException {
        result = prdstmt.executeQuery();

        return result;
    }

    public int performUpdate(PreparedStatement prdstmt) throws SQLException {

        affectedRows = prdstmt.executeUpdate();

        return affectedRows;
    }

    public Connection getConnection() {
        return conn;
    }
}
