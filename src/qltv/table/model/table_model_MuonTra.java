/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.table.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import qltv.dao.Docgia_pojo;
import qltv.dao.Muontra_pojo;

/**
 *
 * @author Đông
 */
public class table_model_MuonTra extends AbstractTableModel{
    ArrayList<Muontra_pojo> lstMuonTra;

    //Khởi tạo modal và lstDocGias
    public table_model_MuonTra() {
        lstMuonTra = new ArrayList<>();
    }
    
    //Thêm độc giả vào modal
    public void themMuonTra(Muontra_pojo muontra_pojo){
        lstMuonTra.add(muontra_pojo);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public Muontra_pojo layMuontra(int index){
        return lstMuonTra.get(index);
    }
    
    public void remove(){
        lstMuonTra.removeAll(lstMuonTra);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void xoaMuontra(Muontra_pojo mt){
        lstMuonTra.remove(mt);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void load(Muontra_pojo muontra_pojo){
        lstMuonTra.add(muontra_pojo);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void updateMuonTra(Muontra_pojo muontra_pojo){
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public int getRowCount() {
        return lstMuonTra.size();
    }

    public int getColumnCount() {
        return 7;
    }

    //Thể hiện dữ liệu lên từng dòng (getValueAt)
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Láy độc giả tại vị hiện hành
        Muontra_pojo muontra_pojo = lstMuonTra.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return muontra_pojo.getMamt();
            case 1:
                return muontra_pojo.getMadg();
            case 2:
                return muontra_pojo.getMatt();
            case 3:
                return muontra_pojo.getMash();
            case 4:
                return muontra_pojo.getNgaymuon();
            case 5:
                return muontra_pojo.getNgaytradukien();
            case 6:
                return muontra_pojo.getNgaytrathucte();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Mã Mượn Trả";
            case 1:
                return "Mã Đọc Giả";
            case 2:
                return "Mã Thủ Thư";
            case 3:
                return "Mã Sách";
            case 4:
                return "Ngày Mươn";
            case 5:
                return "Ngày Trả Dự Kiến";
            case 6:
                return "Ngày Trả Thực Tế";
            default:
                return null;
        }
    }

}
