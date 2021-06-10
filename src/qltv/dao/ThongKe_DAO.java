/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.dao;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Đông
 */
public class ThongKe_DAO {
     public int thongke(String sql, Connection_db aConnection_db) throws SQLException{
        CallableStatement aCallableStatement;
        aCallableStatement=aConnection_db.aConnection.prepareCall(sql);
        aCallableStatement.registerOutParameter(1, java.sql.Types.INTEGER);
        aCallableStatement.execute();
        int a=aCallableStatement.getInt(1);
        return a;
    }
}
