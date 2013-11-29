/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Create;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Database.ConnectDB;
import java.util.Scanner;

/**
 *
 * @author Maarten
 */
public class CustomerDAO {

    ConnectDB conn = new ConnectDB();
    
    public CustomerDAO() {
    }

    public int create(Customer cust) throws SQLException {
        PreparedStatement prdstmt = null;
        String query = "INSERT INTO customer  (customerid, firstname, lastname, postalcode, address, residence, destination, phone, email, notes)";
        query += " Values(?,?,?,?,?,?,?,?,?,?)";


        conn.startConnection();
        
        prdstmt = conn.getConnection().prepareStatement(query);
        prdstmt.setInt(1, cust.getCustomerid());
        prdstmt.setString(2, cust.getFirstname());
        prdstmt.setString(3, cust.getLastname());
        prdstmt.setString(4, cust.getPostalcode());
        prdstmt.setString(5, cust.getAddress());
        prdstmt.setString(6, cust.getDestination());
        prdstmt.setString(7, cust.getResidence());
        prdstmt.setInt(8, cust.getPhone());
        prdstmt.setString(9, cust.getEmail());
        prdstmt.setString(10,cust.getNotes());
        
        
        prdstmt.executeUpdate();
        
        if (conn != null) {
            conn.closeConnection();
        }
        return -1;
    }
}
