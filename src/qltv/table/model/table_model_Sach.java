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
import qltv.dao.Sach_pojo;

/**
 *
 * @author Đông
 */
public class table_model_Sach extends AbstractTableModel{
    ArrayList<Sach_pojo> lstsach_pojos;

    //Khởi tạo modal và lstDocGias
    public table_model_Sach() {
        lstsach_pojos = new ArrayList<>();
    }
    
    public void xoaSach(Sach_pojo sach){
        lstsach_pojos.remove(sach);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
     public Sach_pojo laySach(int index){
        return lstsach_pojos.get(index);
    }
    
    //Thêm độc giả vào modal
    public void themsach(Sach_pojo sach_pojo){
        lstsach_pojos.add(sach_pojo);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void remove(){
        lstsach_pojos.removeAll(lstsach_pojos);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void load(Sach_pojo sach_pojo){
        lstsach_pojos.add(sach_pojo);
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public void updateSach(Sach_pojo sach_pojo){
        //Khi dữ liệu modal thay đổi dùng fireTableDataChanged
        fireTableDataChanged();
    }
    
    public int getRowCount() {
        return lstsach_pojos.size();
    }

    public int getColumnCount() {
        return 10;
    }

    //Thể hiện dữ liệu lên từng dòng (getValueAt)
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Láy độc giả tại vị hiện hành
        Sach_pojo sach_pojo = lstsach_pojos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sach_pojo.getMash();
            case 1:
                return sach_pojo.getTensh();
            case 2:
                return sach_pojo.getTentg();
            case 3:
                return sach_pojo.getSoluong();
            case 4:
                return sach_pojo.getNgaynhap();
            case 5:
                return sach_pojo.getTheloai();
            case 6:
                return sach_pojo.getNxb();
            case 7:
                return sach_pojo.getNamxb();
            case 8:
                return sach_pojo.getPhidenbu();
            case 9:
                return sach_pojo.getTinhtrang();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Mã Sách";
            case 1:
                return "Tên Sách";
            case 2:
                return "Tên Tác Giả";
            case 3:
                return "Số Lượng";
            case 4:
                return "Ngày Nhập";
            case 5:
                return "Thể Loại";
            case 6:
                return "Nhà Xuất Bản";
            case 7:
                return "Năm Xuất Bản";
            case 8:
                return "Phí Đền Bù";
            case 9:
                return "Tình Trạng";
            default:
                return null;
        }
    }

}
