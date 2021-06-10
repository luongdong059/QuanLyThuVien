/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Đông
 */
public class MuonTra_DAO {
    ArrayList<Muontra_pojo> lstMuontra_pojos = new ArrayList<Muontra_pojo>();
    public ArrayList<Muontra_pojo> layMangMuontra() {
        try {
            //Tạo kết nối DB
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            //Lấy mảng Đọc giả
            String str = "SELECT * FROM MUONTRA";
            ResultSet result = con.exCuteQuery(str);
            while (result.next()) {
                //Khởi tạo Đọc giả
                String mamt = result.getString("MAMT");
                String madg = result.getString("MADG");
                String matt = result.getString("MATT");
                String mash = result.getString("MASH");
                String ngaymuon = result.getString("NGAYMUON");
                String ngaytradukien = result.getString("NGAYTRADUKIEN");
                String ngaytrathucte = result.getString("NGAYTRATHUCTE");
                Muontra_pojo muontra_pojo = new Muontra_pojo(mamt, madg, matt, mash, ngaymuon, ngaytradukien, ngaytrathucte);
                //Thêm độc giả vào mảng
                lstMuontra_pojos.add(muontra_pojo);
            }
            con.close();
            //Thêm độc giả vào mảng
        } catch (SQLException ex) {
            Logger.getLogger(DocGia_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstMuontra_pojos;
    }
    
    public int themMuonTra(Muontra_pojo muontra_pojo){
        int i = 0;
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            String sql = "INSERT INTO MUONTRA VALUES(?,?,?,?,?,?,?)";
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);               
                prstm.setString(1, muontra_pojo.getMamt());
                prstm.setString(2, muontra_pojo.getMadg());
                prstm.setString(3, muontra_pojo.getMatt());
                prstm.setString(4, muontra_pojo.getMash());
                prstm.setString(5, muontra_pojo.getNgaymuon());
                prstm.setString(6, muontra_pojo.getNgaytradukien());
                prstm.setString(7, muontra_pojo.getNgaytrathucte());
                i=prstm.executeUpdate();
            a.close();
        } catch (SQLException ex) {
            Logger.getLogger(MuonTra_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
   ArrayList<Muontra_pojo> lstMuontra_pojos1 = new ArrayList<Muontra_pojo>();
    public ArrayList<Muontra_pojo> timkiemmuontra(String aString) {
        try {
            //Tạo kết nối DB
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            //Lấy mảng Đọc giả
            String str = "exec timkiemMT @mt=?";
            PreparedStatement aPreparedStatement=con.aConnection.prepareCall(str);
            aPreparedStatement.setString(1, aString);
            
            ResultSet result = aPreparedStatement.executeQuery();
            while (result.next()) {
                //Khởi tạo Đọc giả
               String mamt = result.getString("MAMT");
                String madg = result.getString("MADG");
                String matt = result.getString("MATT");
                String mash = result.getString("MASH");
                String ngaymuon = result.getString("NGAYMUON");
                String ngaytradukien = result.getString("NGAYTRADUKIEN");
                String ngaytrathucte = result.getString("NGAYTRATHUCTE");
                Muontra_pojo muontra_pojo = new Muontra_pojo(mamt, madg, matt, mash, ngaymuon, ngaytradukien, ngaytrathucte);
                lstMuontra_pojos1.add(muontra_pojo);
            }
            con.close();
            //Thêm độc giả vào mảng
        } catch (SQLException ex) {
            Logger.getLogger(MuonTra_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstMuontra_pojos1;
    }
    
    public void xoaMuontra(Muontra_pojo mt)
    {
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            String sql ="DELETE FROM MUONTRA WHERE MAMT =? ";
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);               
                prstm.setString(1, mt.getMamt());
                prstm.executeUpdate();
            a.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(MuonTra_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void suaMuonTra(Muontra_pojo mt)
    {
        try {
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            System.out.println(mt.getMamt().length());
            
            String sqlUpdate = "UPDATE MUONTRA SET MADG=?, MATT=?, MASH=?, NGAYMUON=?, NGAYTRADUKIEN=?, NGAYTRATHUCTE=? WHERE MAMT=?";
            
            PreparedStatement preStatement=con.getConnectiontoMSSQL().prepareStatement(sqlUpdate);
                
                preStatement.setString(1, mt.getMadg());
                preStatement.setString(2, mt.getMatt());
                preStatement.setString(3, mt.getMash());
                preStatement.setString(4, mt.getNgaymuon());
                preStatement.setString(5, mt.getNgaytradukien());
                preStatement.setString(6, mt.getNgaytrathucte());
                preStatement.setString(7, mt.getMamt());
            
            int kt = preStatement.executeUpdate();
            
            if (kt == 1) {
                System.out.println("Update thanh cong!");
            }
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(MuonTra_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
