/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mbstu.cse.habib.storeprocedure;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class StoreProcedure {

    public static void main(String[] args) {
        try{
            Connection connection = DBConnect.getConnection();

//            String query = "INSERT INTO dept (deptno, dname, location) VALUES (13, 'textile', 'building c')";
//
//            Statement statement = connection.createStatement();
//            statement.execute(query);
        }
        catch(SQLException ex){
            Logger.getLogger(StoreProcedure.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
           FormUI formUI = new FormUI();
             formUI.setVisible(true);
        });

    }
}
