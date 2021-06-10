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
public class Sach_DAO {
    ArrayList<Sach_pojo> lstSach_pojos = new ArrayList<Sach_pojo>();
    public ArrayList<Sach_pojo> layMangSach() {
        try {
            //Tạo kết nối DB
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            //Lấy mảng Đọc giả
            String str = "SELECT * FROM SACH";
            ResultSet result = con.exCuteQuery(str);
            while (result.next()) {
                //Khởi tạo Đọc giả
                String mash = result.getString("MASH");
                String tensh = result.getString("TENSH");
                String tentg = result.getString("TENTG");
                String soluong = result.getString("SOLUONG");
                String ngaynhapsach = result.getString("NGAYNHAPSACH");
                String theloai = result.getString("THELOAI");
                String nxb = result.getString("NXB");
                String namxuatban = result.getString("NAMXB");
                String phidenbu = result.getString("PHIDENBU");
                String tinhtrang = result.getString("TINHTRANG");
                Sach_pojo sach_pojo = new Sach_pojo(mash, tensh, tentg, soluong, ngaynhapsach, theloai, nxb, namxuatban, phidenbu,tinhtrang);
                //Thêm độc giả vào mảng
                lstSach_pojos.add(sach_pojo);
            }
            con.close();
            //Thêm độc giả vào mảng
        } catch (SQLException ex) {
            Logger.getLogger(Sach_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstSach_pojos;
    }
    
    public int themSach(Sach_pojo sach_pojo){
        int i = 0;
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            String sql = "INSERT INTO SACH VALUES(?,?,?,?,?,?,?,?,?,?)";
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);               
                prstm.setString(1, sach_pojo.getMash());
                prstm.setString(2, sach_pojo.getTensh());
                prstm.setString(3, sach_pojo.getTentg());
                prstm.setString(4, sach_pojo.getSoluong());
                prstm.setString(5, sach_pojo.getNgaynhap());
                prstm.setString(6, sach_pojo.getTheloai());
                prstm.setString(7, sach_pojo.getNxb());
                prstm.setString(8, sach_pojo.getNamxb());
                prstm.setString(9, sach_pojo.getPhidenbu());
                prstm.setString(10, sach_pojo.getTinhtrang());
                i=prstm.executeUpdate();
            a.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sach_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public Sach_pojo laySach_pojo (String aString) throws SQLException{
        Sach_pojo sach_pojo=null;
            Connection_db a=new Connection_db();
            a.getConnectiontoMSSQL();
            String str = "SELECT * FROM SACH WHERE MASH LIKE '"+aString+"'";
            ResultSet result = a.exCuteQuery(str);
            System.out.println("hello...ok");
            while (result.next()) {
                //Khởi tạo Đọc giả
                String mash = result.getString("MASH");
                String tensh = result.getString("TENSH");
                String tentg = result.getString("TENTG");
                String soluong = result.getString("SOLUONG");
                String ngaynhapsach = result.getString("NGAYNHAP");
                String theloai = result.getString("THELOAI");
                String nxb = result.getString("NXB");
                String namxuatban = result.getString("NAMXUATBAN");
                String phidenbu = result.getString("PHIDENBU");
                String tinhtrang = result.getString("TINHTRANG");
                sach_pojo = new Sach_pojo(mash, tensh, tentg, soluong, ngaynhapsach, theloai, nxb, namxuatban, phidenbu,tinhtrang);
            }
            a.close();
        return sach_pojo;
    }
    
   ArrayList<Sach_pojo> lstSach_pojos1 = new ArrayList<Sach_pojo>();
    public ArrayList<Sach_pojo> timkiemsach(String aString) {
        try {
            Sach_pojo sach_pojo=null;
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            //Lấy mảng Đọc giả
            String str = "exec timkiemSH @sh=?";
            PreparedStatement aPreparedStatement=con.aConnection.prepareCall(str);
            aPreparedStatement.setString(1, aString);
            
            ResultSet result = aPreparedStatement.executeQuery();
            while (result.next()) {
                //Khởi tạo Đọc giả
                String mash = result.getString("MASH");
                String tensh = result.getString("TENSH");
                String tentg = result.getString("TENTG");
                String soluong = result.getString("SOLUONG");
                String ngaynhapsach = result.getString("NGAYNHAPSACH");
                String theloai = result.getString("THELOAI");
                String nxb = result.getString("NXB");
                String namxuatban = result.getString("NAMXB");
                String phidenbu = result.getString("PHIDENBU");
                String tinhtrang = result.getString("TINHTRANG");
                sach_pojo = new Sach_pojo(mash, tensh, tentg, soluong, ngaynhapsach, theloai, nxb, namxuatban, phidenbu,tinhtrang);
                lstSach_pojos1.add(sach_pojo);
            }
            con.close();
            //Thêm độc giả vào mảng
        } catch (SQLException ex) {
            Logger.getLogger(Sach_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstSach_pojos1;
    }
    
    public void xoaSach(Sach_pojo sach)
    {
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            PreparedStatement prstm1;
            String sql ="DELETE FROM SACH WHERE MASH=? ";
            String sql1 ="DELETE FROM MUONTRA WHERE MASH=? ";

            prstm1=a.getConnectiontoMSSQL().prepareStatement(sql1);
            prstm1.setString(1, sach.getMash());
            prstm1.executeUpdate();
            
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);
            prstm.setString(1, sach.getMash());
            prstm.executeUpdate();
            
            a.close();
        } catch (SQLException ex) {
            Logger.getLogger(Sach_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
    public void suaSach(Sach_pojo sach_pojo)
    {
        try {
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            System.out.println(sach_pojo.getMash().length());
            
            String sqlUpdate = "UPDATE SACH SET TENSH=?, TENTG=?, SOLUONG=?, NGAYNHAPSACH=?, THELOAI=?, NXB=?, NAMXB=?, PHIDENBU=?, TINHTRANG=? WHERE MASH=?";
            
            PreparedStatement preStatement=con.getConnectiontoMSSQL().prepareStatement(sqlUpdate);
                
                preStatement.setString(1, sach_pojo.getTensh());
                preStatement.setString(2, sach_pojo.getTentg());
                preStatement.setString(3, sach_pojo.getSoluong());
                preStatement.setString(4, sach_pojo.getNgaynhap());
                preStatement.setString(5, sach_pojo.getTheloai());
                preStatement.setString(6, sach_pojo.getNxb());
                preStatement.setString(7, sach_pojo.getNamxb());
                preStatement.setString(8, sach_pojo.getPhidenbu());
                preStatement.setString(9, sach_pojo.getTinhtrang());
                preStatement.setString(10, sach_pojo.getMash());
            
            
           int kt = preStatement.executeUpdate();
            
            if (kt == 1) {
                System.out.println("Update thanh cong!");
            }
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(Sach_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
