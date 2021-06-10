/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Đông
 */
public class DocGia_DAO {
    ArrayList<Docgia_pojo> lstDocGia = new ArrayList<Docgia_pojo>();
    public ArrayList<Docgia_pojo> layMangDocGia() {
        try {
            //Tạo kết nối DB
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            //Lấy mảng Đọc giả
            String str = "SELECT * FROM DOCGIA";
            ResultSet result = con.exCuteQuery(str);
            while (result.next()) {
                //Khởi tạo Đọc giả
                String maDG = result.getString("MADG");
                String matKhau = result.getString("MATKHAU");
                String tenDG = result.getString("TENDG");
                String gioiTinh = result.getString("GIOITINH");
                String diaChi = result.getString("DIACHI");
                String ngayBD = result.getString("NGAYBD");
                String ngayKT = result.getString("NGAYKT");
                String phiCoc = result.getString("PHICOC");
                Docgia_pojo docGia = new Docgia_pojo(maDG, matKhau, tenDG, gioiTinh, diaChi, ngayBD, ngayKT, phiCoc);
                //Thêm độc giả vào mảng
                lstDocGia.add(docGia);
            }
            con.close();
            //Thêm độc giả vào mảng
        } catch (SQLException ex) {
            Logger.getLogger(DocGia_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstDocGia;
    }
    
    public int themDocGia(Docgia_pojo docgia){
        int i = 0;
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            String sql ="INSERT INTO DOCGIA VALUES(?,?,?,?,?,?,?,?)";
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);               
                prstm.setString(1, docgia.getMadg());
                prstm.setString(2, docgia.getMatkhau());
                prstm.setString(3, docgia.getTendg());
                prstm.setString(4, docgia.getGioitinh());
                prstm.setString(5, docgia.getDiachi());
                prstm.setString(6, docgia.getNgaybd());
                prstm.setString(7, docgia.getNgaykt());
                prstm.setString(8, docgia.getPhicoc());
                i=prstm.executeUpdate();
            a.close();
        } catch (SQLException ex) {
            Logger.getLogger(DocGia_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    ArrayList<Docgia_pojo> lstDocGia1 = new ArrayList<Docgia_pojo>();
    public ArrayList<Docgia_pojo> timkiemdocgia(String aString) {
        try {
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            String str = "exec timkiemDG @dg=?";
            PreparedStatement aPreparedStatement=con.aConnection.prepareCall(str);
            aPreparedStatement.setString(1, aString);
            
            ResultSet result = aPreparedStatement.executeQuery();
            while (result.next()) {
                //Khởi tạo Đọc giả
                String maDG = result.getString("MADG");
                String matKhau = result.getString("MATKHAU");
                String tenDG = result.getString("TENDG");
                String gioiTinh = result.getString("GIOITINH");
                String diaChi = result.getString("DIACHI");
                String ngayBD = result.getString("NGAYBD");
                String ngayKT = result.getString("NGAYKT");
                String phiCoc = result.getString("PHICOC");
                Docgia_pojo docGia = new Docgia_pojo(maDG, matKhau, tenDG, gioiTinh, diaChi, ngayBD, ngayKT, phiCoc);
                lstDocGia.add(docGia);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DocGia_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstDocGia;
    }
    
    public void xoaDocGia(Docgia_pojo dg)
    {
        try {
            Connection_db a=new Connection_db();
            PreparedStatement prstm;
            String sql ="DELETE FROM DOCGIA WHERE MADG =? ";
            prstm=a.getConnectiontoMSSQL().prepareStatement(sql);               
                prstm.setString(1, dg.getMadg());
                prstm.executeUpdate();
            a.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(DocGia_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void suaDocGia(Docgia_pojo dg)
    {
        try {
            Connection_db con = new Connection_db();
            con.getConnectiontoMSSQL();
            System.out.println(dg.getMadg().length());
            
            String sqlUpdate = "UPDATE DOCGIA SET MATKHAU= ?, TENDG=?, GIOITINH=?, DIACHI=?, NGAYBD=?, NGAYKT=?, PHICOC=? WHERE MADG=? ";
            
            PreparedStatement preStatement=con.getConnectiontoMSSQL().prepareStatement(sqlUpdate);
            preStatement.setString(1,dg.getMatkhau());
            preStatement.setString(2,dg.getTendg());
            preStatement.setString(3,dg.getGioitinh());
            preStatement.setString(4,dg.getDiachi());
            preStatement.setString(5,dg.getNgaybd());
            preStatement.setString(6,dg.getNgaykt());
            preStatement.setString(7,dg.getPhicoc());
            preStatement.setString(8,dg.getMadg());
            
            
           int kt = preStatement.executeUpdate();
            
            if (kt == 1) {
                System.out.println("Update thanh cong!");
            }
            con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(DocGia_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
