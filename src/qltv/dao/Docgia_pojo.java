/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.dao;

/**
 *
 * @author Đông
 */
public class Docgia_pojo {
    private  String madg;
    private  String matkhau;
    private  String tendg;
    private  String gioitinh;
    private  String diachi;
    private  String ngaybd;
    private  String ngaykt;
    private  String phicoc;
    public Docgia_pojo()
    {}

    public Docgia_pojo(String madg, String matkhau, String tendg, String gioitinh, String diachi, String ngaybd, String ngaykt, String phicoc) {
        this.madg = madg;
        this.matkhau = matkhau;
        this.tendg = tendg;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.phicoc = phicoc;
    }

    @Override
    public String toString() {
        return "DocGia_Pojo{" + "madg=" + madg + ", matkhau=" + matkhau + ", tendg=" + tendg + ", gioitinh=" + gioitinh + ", diachi=" + diachi + ", ngaybd=" + ngaybd + ", ngaykt=" + ngaykt + ", phicoc=" + phicoc + '}';
    }
    
    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTendg() {
        return tendg;
    }

    public void setTendg(String tendg) {
        this.tendg = tendg;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    public String getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(String ngaykt) {
        this.ngaykt = ngaykt;
    }

    public String getPhicoc() {
        return phicoc;
    }

    public void setPhicoc(String phicoc) {
        this.phicoc = phicoc;
    }
}
