/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.dao;

import java.sql.CallableStatement;
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
public class ThuThu_DAO {
   ArrayList<ThuThu_pojo> lstThuThu = new ArrayList<ThuThu_pojo>();
    public ArrayList<ThuThu_pojo> layMangThuThu() {
        try {
            //Tạo kết nối DB
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            //Lấy mảng Đọc giả
            String str = "SELECT * FROM THUTHU";
            ResultSet result = con.exCuteQuery(str);
            while (result.next()) {
                //Khởi tạo Đọc giả
                String matt = result.getString("MATT");
                String matKhau = result.getString("MATKHAU");
                String tentt = result.getString("HOTEN");
                String gioiTinh = result.getString("GIOITINH");
                String ngaysinh = result.getString("NGAYSINH");
                String sdt = result.getString("SDT");
                String email = result.getString("EMAIL");
                String diachi = result.getString("DIACHI");
                ThuThu_pojo thuthu = new ThuThu_pojo(matt, matKhau, tentt, gioiTinh, ngaysinh, sdt, email, diachi);
                //Thêm độc giả vào mảng
                lstThuThu.add(thuthu);
            }
            con.close();
            //Thêm độc giả vào mảng
        } catch (SQLException ex) {
            Logger.getLogger(ThuThu_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstThuThu;
    }
    
    ArrayList<ThuThu_pojo> lstthuthu = new ArrayList<ThuThu_pojo>();
    public ArrayList<ThuThu_pojo> timkiemthuthu(String aString) {
        try {
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            String str = "exec timkiemTT @tt=?";
            PreparedStatement aPreparedStatement=con.aConnection.prepareCall(str);
            aPreparedStatement.setString(1, aString);
            
            ResultSet result = aPreparedStatement.executeQuery();
            while (result.next()) {
                //Khởi tạo Đọc giả
                String matt = result.getString("MATT");
                String matKhau = result.getString("MATKHAU");
                String tentt = result.getString("HOTEN");
                String gioiTinh = result.getString("GIOITINH");
                String ngaysinh = result.getString("NGAYSINH");
                String sdt = result.getString("SDT");
                String email = result.getString("EMAIL");
                String diachi = result.getString("DIACHI");
                ThuThu_pojo thuthu = new ThuThu_pojo(matt, matKhau, tentt, gioiTinh, ngaysinh, sdt, email, diachi);
                lstthuthu.add(thuthu);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThuThu_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstthuthu;
    }
    
    public void xoaThuThu(ThuThu_pojo tt)
    {
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            String sql ="DELETE FROM THUTHU WHERE MATT =? ";
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);               
                prstm.setString(1, tt.getMatt());
                prstm.executeUpdate();
            a.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(ThuThu_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int themThuThu(ThuThu_pojo tt){
        int i = 0;
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            String sql = "INSERT INTO THUTHU VALUES(?,?,?,?,?,?,?,?)";
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);               
                prstm.setString(1, tt.getMatt());
                prstm.setString(2, tt.getMatkhau());
                prstm.setString(3, tt.getHoten());
                prstm.setString(4, tt.getGioitinh());
                prstm.setString(5, tt.getNgaysinh());
                prstm.setString(6, tt.getSdt());
                prstm.setString(7, tt.getEmail());
                prstm.setString(8, tt.getDiachi());
                i=prstm.executeUpdate();
            a.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThuThu_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public void suaThuThu(ThuThu_pojo tt)
    {
        try {
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            System.out.println(tt.getMatt().length());
            
            String sqlUpdate = "UPDATE THUTHU SET MATKHAU= ?, HOTEN=?, GIOITINH=?, NGAYSINH=?, SDT=?, EMAIL=?, DIACHI=? WHERE MATT=? ";
            
            PreparedStatement prstm=con.getConnectiontoMSSQL().prepareStatement(sqlUpdate);
            
                prstm.setString(1, tt.getMatkhau());
                prstm.setString(2, tt.getHoten());
                prstm.setString(3, tt.getGioitinh());
                prstm.setString(4, tt.getNgaysinh());
                prstm.setString(5, tt.getSdt());
                prstm.setString(6, tt.getEmail());
                prstm.setString(7, tt.getDiachi());
                prstm.setString(8, tt.getMatt());
            
            
           int kt = prstm.executeUpdate();
            
            if (kt == 1) {
                System.out.println("Update thanh cong!");
            }
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(ThuThu_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
