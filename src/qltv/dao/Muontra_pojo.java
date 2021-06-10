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
public class Muontra_pojo {
    private  String mamt;
    private  String madg;
    private  String matt;
    private  String mash;
    private  String ngaymuon;
    private  String ngaytradukien;
    private  String ngaytrathucte;
    public Muontra_pojo()
    {}

    public Muontra_pojo(String mamt, String madg, String matt, String mash, String ngaymuon, String ngaytradukien, String ngaytrathucte) {
        this.mamt = mamt;
        this.madg = madg;
        this.matt = matt;
        this.mash = mash;
        this.ngaymuon = ngaymuon;
        this.ngaytradukien = ngaytradukien;
        this.ngaytrathucte = ngaytrathucte;
    }
    
    

    public String getMamt() {
        return mamt;
    }

    public void setMamt(String mamt) {
        this.mamt = mamt;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getMatt() {
        return matt;
    }

    public void setMatt(String matt) {
        this.matt = matt;
    }

    public String getMash() {
        return mash;
    }

    public void setMash(String mash) {
        this.mash = mash;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytradukien() {
        return ngaytradukien;
    }

    public void setNgaytradukien(String ngaytradukien) {
        this.ngaytradukien = ngaytradukien;
    }

    public String getNgaytrathucte() {
        return ngaytrathucte;
    }

    public void setNgaytrathucte(String ngaytrathucte) {
        this.ngaytrathucte = ngaytrathucte;
    }
    
    
}
