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
public class Sach_pojo {
    private  String mash;
    private  String tensh;
    private  String tentg;
    private  String soluong;
    private  String ngaynhap;
    private  String theloai;
    private  String nxb;
    private  String namxb;
    private  String phidenbu;
    private  String tinhtrang;
    public Sach_pojo()
    {}

    public Sach_pojo(String mash, String tensh, String tentg, String soluong, String ngaynhap, String theloai, String nxb, String namxb, String phidenbu, String tinhtrang) {
        this.mash = mash;
        this.tensh = tensh;
        this.tentg = tentg;
        this.soluong = soluong;
        this.ngaynhap = ngaynhap;
        this.theloai = theloai;
        this.nxb = nxb;
        this.namxb = namxb;
        this.phidenbu = phidenbu;
        this.tinhtrang = tinhtrang;
    }

    public String getMash() {
        return mash;
    }

    public void setMash(String mash) {
        this.mash = mash;
    }

    public String getTensh() {
        return tensh;
    }

    public void setTensh(String tensh) {
        this.tensh = tensh;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getNamxb() {
        return namxb;
    }

    public void setNamxb(String namxb) {
        this.namxb = namxb;
    }

    public String getPhidenbu() {
        return phidenbu;
    }

    public void setPhidenbu(String phidenbu) {
        this.phidenbu = phidenbu;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
    
}
