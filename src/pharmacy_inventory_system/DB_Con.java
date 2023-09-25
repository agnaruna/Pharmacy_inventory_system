/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_inventory_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author NISHA
 */
public class DB_Con {

    Connection con = null;
    String path = null;

    //default constructor
    public DB_Con() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            path = "jdbc:mysql://localhost:3306/pharmacy_inventory_system";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Connection getConnect() {
        try {
            con = (Connection) DriverManager.getConnection(path, "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DB class: Get Connect" + e);
        }
        return con;
    }

    public void closeConnect() {
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DB class: close Connect" + e);
        }
    }
}

