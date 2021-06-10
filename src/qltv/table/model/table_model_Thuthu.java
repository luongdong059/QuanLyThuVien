/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.table.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import qltv.dao.Docgia_pojo;
import qltv.dao.ThuThu_pojo;

/**
 *
 * @author Đông
 */
public class table_model_Thuthu extends AbstractTableModel{
    ArrayList<ThuThu_pojo> lstThuThu;
    //Khởi tạo modal và lstDocGias
    public table_model_Thuthu() {
        lstThuThu = new ArrayList<>();
    }
    
     public ThuThu_pojo layThuThu(int index){
        return lstThuThu.get(index);
    }
    //Thêm độc giả vào modal
    public void themThuThu(ThuThu_pojo thuThu_pojo){
        lstThuThu.add(thuThu_pojo);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void xoaThuThu(ThuThu_pojo ThuThu_pojo){
        lstThuThu.remove(ThuThu_pojo);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
        public void remove(){
        lstThuThu.removeAll(lstThuThu);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
        
        public void updatethuthu(ThuThu_pojo ThuThu_pojo){
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    @Override
    public int getRowCount() {
       return lstThuThu.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Láy độc giả tại vị hiện hành
        ThuThu_pojo thuthu = lstThuThu.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return thuthu.getMatt();
            case 1:
                return "**************";
            case 2:
                return thuthu.getHoten();
            case 3:
                return thuthu.getGioitinh();
            case 4:
                return thuthu.getNgaysinh();
            case 5:
                return thuthu.getSdt();
            case 6:
                return thuthu.getEmail();
            case 7:
                return thuthu.getDiachi();
            default:
                return null;
    }
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Mã Thủ Thư";
            case 1:
                return "Mật Khẩu";
            case 2:
                return "Tên Thủ Thư";
            case 3:
                return "Giới Tính";
            case 4:
                return "Ngày Sinh";
            case 5:
                return "Số Điện Thoại";
            case 6:
                return "Email";
            case 7:
                return "Địa Chỉ";
            default:
                return null;
        }
    }
}
