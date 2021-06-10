/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Đông
 */
public class Connection_db {
    public Connection aConnection=null;
    public Connection getConnectiontoMSSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            aConnection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-V3IJJH5\\SQLEXPRESS:1433;databaseName=dbLibrary","sa","123");
        } catch (SQLException ex) {
            Logger.getLogger(Connection_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aConnection;
    }
    public void close(){
        if(aConnection!=null)
            try {
                if(!aConnection.isClosed())
                    aConnection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        aConnection=null;
    }
    public ResultSet exCuteQuery(String str) throws SQLException{
        Statement stm = aConnection.createStatement();
        return stm.executeQuery(str);
    }
    public int exCuteUpdate(String str) throws SQLException{
        Statement stm = aConnection.createStatement();
        return stm.executeUpdate(str);
    }
}
