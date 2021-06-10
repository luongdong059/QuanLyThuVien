/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Đông
 */
public class Test {
    public  void main  (String[] args) {
        Connection_db a=new Connection_db();
        Connection con=a.getConnectiontoMSSQL();
        try {
            Statement aStatement=con.createStatement();
            ResultSet aResultSet = aStatement.executeQuery("SELECT * FROM DOCGIA");
            while (aResultSet.next()) {                
                System.out.println(aResultSet.getString("MADG"));
                System.out.println(aResultSet.getString("MATKHAU"));
                System.out.println(aResultSet.getString("TENDG"));
                System.out.println(aResultSet.getString("GIOITINH"));
                System.out.println(aResultSet.getString("DIACHI"));
                System.out.println(aResultSet.getString("NGAYBD"));
                System.out.println(aResultSet.getString("NGAYKT"));
                System.out.println(aResultSet.getString("PHICOC"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
