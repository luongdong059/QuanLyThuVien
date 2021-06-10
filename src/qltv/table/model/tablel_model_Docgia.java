/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.table.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import qltv.dao.Docgia_pojo;

/**
 *
 * @author Đông
 */
public class tablel_model_Docgia extends AbstractTableModel{
    ArrayList<Docgia_pojo> lstDocGia;

    //Khởi tạo modal và lstDocGias
    public tablel_model_Docgia() {
        lstDocGia = new ArrayList<>();
    }
    
     public Docgia_pojo layDocGia(int index){
        return lstDocGia.get(index);
    }
    //Thêm độc giả vào modal
    public void themDocGia(Docgia_pojo docGia){
        lstDocGia.add(docGia);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void xoaDocGia(Docgia_pojo docGia){
        lstDocGia.remove(docGia);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
        public void remove(){
        lstDocGia.removeAll(lstDocGia);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void load(Docgia_pojo docGia){
        lstDocGia.add(docGia);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void updateDocgia(Docgia_pojo docGia){
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public int getRowCount() {
        return lstDocGia.size();
    }

    public int getColumnCount() {
        return 8;
    }

    //Thể hiện dữ liệu lên từng dòng (getValueAt)
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Láy độc giả tại vị hiện hành
        Docgia_pojo docGia = lstDocGia.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return docGia.getMadg();
            case 1:
                return "**************";
            case 2:
                return docGia.getTendg();
            case 3:
                return docGia.getGioitinh();
            case 4:
                return docGia.getDiachi();
            case 5:
                return docGia.getNgaybd();
            case 6:
                return docGia.getNgaykt();
            case 7:
                return docGia.getPhicoc();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Mã Đọc Giả";
            case 1:
                return "Mật Khẩu";
            case 2:
                return "Tên Đọc Giả";
            case 3:
                return "Giới Tính";
            case 4:
                return "Địa Chỉ";
            case 5:
                return "Ngày Bắt Đầu";
            case 6:
                return "Ngày Kết Thúc";
            case 7:
                return "Phí Cọc";
            default:
                return null;
        }
    }
}
