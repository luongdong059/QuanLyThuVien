/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.view;

import java.rmi.dgc.DGC;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;
import qltv.dao.DocGia_DAO;
import qltv.dao.Docgia_pojo;
import qltv.dao.MuonTra_DAO;
import qltv.dao.Muontra_pojo;
import qltv.dao.Sach_DAO;
import qltv.dao.Sach_pojo;
import qltv.dao.ThuThu_DAO;
import qltv.dao.ThuThu_pojo;
import qltv.table.model.table_model_MuonTra;
import qltv.table.model.table_model_Sach;
import qltv.table.model.table_model_Thuthu;
import qltv.table.model.tablel_model_Docgia;

/**
 *
 * @author Đông
 */
public class NhanVien extends javax.swing.JFrame {

    
    table_model_Sach aSach;
    tablel_model_Docgia aDocgia;
    table_model_MuonTra aMuonTra;
    table_model_Thuthu aThuThu;
    ArrayList<Docgia_pojo> aDocgia_pojos;
    ArrayList<Sach_pojo> aSach_pojos;
    ArrayList<Muontra_pojo> aMuontra_pojos;
    ArrayList<ThuThu_pojo> aThuThu_pojos;
    ThuThu_DAO aThuThu_DAO;
    Sach_DAO aSach_DAO;
    DocGia_DAO aDocGia_DAO;
    MuonTra_DAO aMuonTra_DAO;
    public NhanVien() {
        initComponents();
        aSach_DAO=new Sach_DAO();
        aDocGia_DAO=new DocGia_DAO();
        aMuonTra_DAO=new MuonTra_DAO();
        aThuThu_DAO=new ThuThu_DAO();
        aSach=new table_model_Sach();
        aDocgia=new tablel_model_Docgia();
        aMuonTra=new table_model_MuonTra();
        aThuThu=new table_model_Thuthu();
        intlistSach();
        intlistDocGia();
        intlistMuonTra();
        intlistThuThu();
    }

    public void intlistThuThu(){
        aThuThu_pojos=new ArrayList<>();
        aThuThu_pojos=aThuThu_DAO.layMangThuThu();
        aThuThu_pojos.forEach((item) -> {
        aThuThu.themThuThu(item);
        tbThuThu.setModel(aThuThu);
    });
        aThuThu_pojos.removeAll(aThuThu_pojos);
    }
    
    public void intlistMuonTra(){
        aMuontra_pojos=new ArrayList<>();
        aMuontra_pojos=aMuonTra_DAO.layMangMuontra();
        aMuontra_pojos.forEach((item) -> {
        aMuonTra.themMuonTra(item);
        tbMuonTra.setModel(aMuonTra);
    });
        aMuontra_pojos.removeAll(aMuontra_pojos);
    }
    
    public void intlistSach(){
        aSach_pojos=new ArrayList<>();
        aSach_pojos=aSach_DAO.layMangSach();
        aSach_pojos.forEach((item) -> {
        aSach.themsach(item);
        tbSach.setModel(aSach);
    });
        aSach_pojos.removeAll(aSach_pojos);
    }
    
    public void intlistDocGia(){
        aDocgia_pojos=new ArrayList<>();
        aDocgia_pojos=aDocGia_DAO.layMangDocGia();
        aDocgia_pojos.forEach((item) -> {
        aDocgia.themDocGia(item);
        tbDocGia.setModel(aDocgia);
    });
        aDocgia_pojos.removeAll(aDocgia_pojos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        CapNhatSach = new javax.swing.JPanel();
        btnTimKiemSach = new javax.swing.JButton();
        btnThemSach = new javax.swing.JButton();
        txtTimKiemSach = new javax.swing.JTextField();
        btnMoi = new javax.swing.JButton();
        btnXoaSach = new javax.swing.JButton();
        btnSuaSach = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtTenTacGia = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        txtNamXuatBan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhiDenBu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        txtNhaXuatBan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        btnTrangChu = new javax.swing.JButton();
        CapNhatBanDoc = new javax.swing.JPanel();
        btnTimKiemDocGia = new javax.swing.JButton();
        btnThemDocGia = new javax.swing.JButton();
        btnXoaDocGia = new javax.swing.JButton();
        btnMoiDocGia = new javax.swing.JButton();
        txtTimKiemDocGia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMaDocGia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtPhiCoc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTenDocGia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDocGia = new javax.swing.JTable();
        btnTrangChu1 = new javax.swing.JButton();
        btCapNhatDocGia = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        CapNhatMuonTra = new javax.swing.JPanel();
        btnTimKiemMuonTra = new javax.swing.JButton();
        btnThemMuonTra = new javax.swing.JButton();
        btnXoaMuonTra = new javax.swing.JButton();
        btnCapNhatMuonTra = new javax.swing.JButton();
        btnMoiMuonTra = new javax.swing.JButton();
        txtTimKiemMuonTra = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtMaMuonTra = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNgayMuon = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtMaThuThu = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtNgayTraDuKien = new javax.swing.JTextField();
        txtNgayTraThucTe = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtMaSachMuon = new javax.swing.JTextField();
        txtMaDocGiaMuon = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMuonTra = new javax.swing.JTable();
        btnTrangChu2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnTimKiemThuThu = new javax.swing.JButton();
        btnThemThuThu = new javax.swing.JButton();
        btnXoaThuThu = new javax.swing.JButton();
        btnSuaThuThu = new javax.swing.JButton();
        btnMoiThuthu = new javax.swing.JButton();
        txtTimKiemThuThu = new javax.swing.JTextField();
        btnTrangChu3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtMaTT = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtNgaySinhTT = new javax.swing.JTextField();
        txtSDTTT = new javax.swing.JTextField();
        txtEmaiTT = new javax.swing.JTextField();
        txtDiaChiTT = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtGioiTinhTT = new javax.swing.JTextField();
        txtTenTT = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbThuThu = new javax.swing.JTable();
        txtMatKhauTT = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhân Viên");

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 102));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CapNhatSach.setBackground(new java.awt.Color(204, 204, 204));
        CapNhatSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTimKiemSach.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiemSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTimKiemSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search.png"))); // NOI18N
        btnTimKiemSach.setText("Tìm Kiếm");
        btnTimKiemSach.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTimKiemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSachActionPerformed(evt);
            }
        });

        btnThemSach.setBackground(new java.awt.Color(255, 255, 255));
        btnThemSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThemSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/add.png"))); // NOI18N
        btnThemSach.setText("Thêm");
        btnThemSach.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSachActionPerformed(evt);
            }
        });

        txtTimKiemSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemSach.setText("Điền mã sách");
        txtTimKiemSach.setBorder(null);

        btnMoi.setBackground(new java.awt.Color(255, 255, 255));
        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiSach(evt);
            }
        });

        btnXoaSach.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/delete.png"))); // NOI18N
        btnXoaSach.setText("Xóa");
        btnXoaSach.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSachActionPerformed(evt);
            }
        });

        btnSuaSach.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSuaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/repair.png"))); // NOI18N
        btnSuaSach.setText("Sửa");
        btnSuaSach.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSachActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Mã Sách");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Tên Sách");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Tên Tác Giả");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Số Lượng");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Ngày Nhập Sách");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Thể Loại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Nhà Xuất Bản");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Năm Xuất Bản");

        txtMaSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaSach.setBorder(null);

        txtTenSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenSach.setBorder(null);

        txtTenTacGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenTacGia.setBorder(null);

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSoLuong.setBorder(null);

        txtNgayNhap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgayNhap.setText("MM/DD/YYYY");
        txtNgayNhap.setBorder(null);

        txtTheLoai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTheLoai.setBorder(null);

        txtNamXuatBan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNamXuatBan.setText("MM/DD/YYYY");
        txtNamXuatBan.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Phí Đền Bù");

        txtPhiDenBu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPhiDenBu.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Tình Trạng");

        txtTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTinhTrang.setText("KHÔNG MƯỢN");
        txtTinhTrang.setBorder(null);

        txtNhaXuatBan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNhaXuatBan.setBorder(null);

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sach", "Tên Sach", "Tên Tác Giả", "Số Lượng", "Phí Đền Bù", "Ngày Nhập Sách", "Thể Loại", "Nhà Xuất Bản", "Năm Xuất Bản", "Tình Trạng"
            }
        ));
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        btnTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangChu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/real-estate.png"))); // NOI18N
        btnTrangChu.setText("Trang Chủ");
        btnTrangChu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CapNhatSachLayout = new javax.swing.GroupLayout(CapNhatSach);
        CapNhatSach.setLayout(CapNhatSachLayout);
        CapNhatSachLayout.setHorizontalGroup(
            CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapNhatSachLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CapNhatSachLayout.createSequentialGroup()
                .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CapNhatSachLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSach)
                            .addComponent(txtTenTacGia)
                            .addComponent(txtTenSach)
                            .addComponent(txtSoLuong)
                            .addComponent(txtPhiDenBu, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgayNhap)
                            .addComponent(txtTheLoai)
                            .addComponent(txtNamXuatBan)
                            .addComponent(txtTinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtNhaXuatBan)))
                    .addGroup(CapNhatSachLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnTimKiemSach)
                        .addGap(35, 35, 35)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CapNhatSachLayout.createSequentialGroup()
                                .addComponent(btnThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnXoaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnSuaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        CapNhatSachLayout.setVerticalGroup(
            CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CapNhatSachLayout.createSequentialGroup()
                .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CapNhatSachLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSuaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimKiemSach)
                            .addComponent(btnXoaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTheLoai)
                            .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(txtTenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CapNhatSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhiDenBu)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTinhTrang))
                        .addGap(87, 87, 87))
                    .addGroup(CapNhatSachLayout.createSequentialGroup()
                        .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cập Nhật Sách", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/update.png")), CapNhatSach); // NOI18N

        CapNhatBanDoc.setBackground(new java.awt.Color(204, 204, 204));

        btnTimKiemDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiemDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTimKiemDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search.png"))); // NOI18N
        btnTimKiemDocGia.setText("Tìm Kiếm");
        btnTimKiemDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTimKiemDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemDocGiaActionPerformed(evt);
            }
        });

        btnThemDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btnThemDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThemDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/add.png"))); // NOI18N
        btnThemDocGia.setText("Thêm");
        btnThemDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDocGiaActionPerformed(evt);
            }
        });

        btnXoaDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoaDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/delete.png"))); // NOI18N
        btnXoaDocGia.setText("Xóa");
        btnXoaDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDocGiaActionPerformed(evt);
            }
        });

        btnMoiDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btnMoiDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMoiDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnMoiDocGia.setText("Mới");
        btnMoiDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiDocGiaActionPerformed(evt);
            }
        });

        txtTimKiemDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemDocGia.setText("Điền mã đọc giả");
        txtTimKiemDocGia.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Mã Đoc Giả");

        txtMaDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaDocGia.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Địa Chỉ");

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDiaChi.setBorder(null);

        txtPhiCoc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPhiCoc.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Phí Cọc");

        txtTenDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenDocGia.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Tên Đọc Giả");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Mật Khẩu");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Ngày Bắt Đầu");

        txtNgayBD.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgayBD.setText("MM/DD/YYYY");
        txtNgayBD.setBorder(null);

        txtNgayKT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgayKT.setText("MM/DD/YYYY");
        txtNgayKT.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Ngày Kết Thúc");

        txtGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtGioiTinh.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Giới Tính");

        tbDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Đọc Giả", "Tên Đọc Giả", "Mật Khẩu", "Giới Tính", "Địa Chỉ", "Phí Cọc", "Ngày Bắt Đầu", "Ngày Kết Thúc"
            }
        ));
        tbDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDocGiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDocGia);

        btnTrangChu1.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangChu1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTrangChu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/real-estate.png"))); // NOI18N
        btnTrangChu1.setText("Trang Chủ");
        btnTrangChu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTrangChu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChu1ActionPerformed(evt);
            }
        });

        btCapNhatDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btCapNhatDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btCapNhatDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/update.png"))); // NOI18N
        btCapNhatDocGia.setText("Cập Nhật");
        btCapNhatDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btCapNhatDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatDocGiaActionPerformed(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMatKhau.setBorder(null);

        javax.swing.GroupLayout CapNhatBanDocLayout = new javax.swing.GroupLayout(CapNhatBanDoc);
        CapNhatBanDoc.setLayout(CapNhatBanDocLayout);
        CapNhatBanDocLayout.setHorizontalGroup(
            CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapNhatBanDocLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTrangChu1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CapNhatBanDocLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btnTimKiemDocGia)
                .addGap(30, 30, 30)
                .addComponent(btnThemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnXoaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btCapNhatDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnMoiDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapNhatBanDocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapNhatBanDocLayout.createSequentialGroup()
                        .addComponent(txtTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapNhatBanDocLayout.createSequentialGroup()
                        .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))
                        .addGap(41, 41, 41)
                        .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaDocGia)
                            .addComponent(txtTenDocGia)
                            .addComponent(txtGioiTinh)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(35, 35, 35)
                        .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhiCoc)
                            .addComponent(txtNgayKT)
                            .addComponent(txtDiaChi)
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179))))
        );
        CapNhatBanDocLayout.setVerticalGroup(
            CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CapNhatBanDocLayout.createSequentialGroup()
                .addComponent(btnTrangChu1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaDocGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimKiemDocGia)
                        .addComponent(btnMoiDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCapNhatDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhiCoc)
                    .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CapNhatBanDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cập Nhật Bạn Đọc", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/student (1).png")), CapNhatBanDoc); // NOI18N

        CapNhatMuonTra.setBackground(new java.awt.Color(204, 204, 204));

        btnTimKiemMuonTra.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiemMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTimKiemMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search.png"))); // NOI18N
        btnTimKiemMuonTra.setText("Tìm Kiếm");
        btnTimKiemMuonTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTimKiemMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemMuonTraActionPerformed(evt);
            }
        });

        btnThemMuonTra.setBackground(new java.awt.Color(255, 255, 255));
        btnThemMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThemMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/add.png"))); // NOI18N
        btnThemMuonTra.setText("Thêm");
        btnThemMuonTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMuonTraActionPerformed(evt);
            }
        });

        btnXoaMuonTra.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoaMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/delete.png"))); // NOI18N
        btnXoaMuonTra.setText("Xóa");
        btnXoaMuonTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMuonTraActionPerformed(evt);
            }
        });

        btnCapNhatMuonTra.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhatMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCapNhatMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/repair.png"))); // NOI18N
        btnCapNhatMuonTra.setText("Cập Nhật");
        btnCapNhatMuonTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCapNhatMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatMuonTraActionPerformed(evt);
            }
        });

        btnMoiMuonTra.setBackground(new java.awt.Color(255, 255, 255));
        btnMoiMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMoiMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnMoiMuonTra.setText("Mới");
        btnMoiMuonTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiMuonTraActionPerformed(evt);
            }
        });

        txtTimKiemMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemMuonTra.setText("Điền mã mượn trả");
        txtTimKiemMuonTra.setBorder(null);
        txtTimKiemMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemMuonTraActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Mã Mượn Trả");

        txtMaMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaMuonTra.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("Mã Sách");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("Mã Đọc Giả");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("Ngày Mượn");

        txtNgayMuon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgayMuon.setText("MM/DD/YYYY");
        txtNgayMuon.setBorder(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setText("Mã Thủ Thư");

        txtMaThuThu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaThuThu.setBorder(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("Ngày Trả Dự Kiến");

        txtNgayTraDuKien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgayTraDuKien.setText("MM/DD/YYYY");
        txtNgayTraDuKien.setBorder(null);

        txtNgayTraThucTe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgayTraThucTe.setText("MM/DD/YYYY");
        txtNgayTraThucTe.setBorder(null);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel26.setText("Ngày Trả Thực Tế");

        txtMaSachMuon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaSachMuon.setBorder(null);

        txtMaDocGiaMuon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaDocGiaMuon.setBorder(null);

        tbMuonTra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Mượn Trả", "Mã Đọc Giả", "Mã Thủ Thư", "Mã Sách", "Ngày Mượn", "Ngày Trả Dự Kiến", "Ngày Trả Thực Tế"
            }
        ));
        tbMuonTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMuonTraMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbMuonTra);

        btnTrangChu2.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangChu2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTrangChu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/real-estate.png"))); // NOI18N
        btnTrangChu2.setText("Trang Chủ");
        btnTrangChu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTrangChu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CapNhatMuonTraLayout = new javax.swing.GroupLayout(CapNhatMuonTra);
        CapNhatMuonTra.setLayout(CapNhatMuonTraLayout);
        CapNhatMuonTraLayout.setHorizontalGroup(
            CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapNhatMuonTraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTrangChu2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtTimKiemMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                        .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addGap(41, 41, 41)
                        .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaDocGiaMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgayTraThucTe, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel25))
                                .addGap(21, 21, 21)
                                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayTraDuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSachMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                        .addComponent(btnTimKiemMuonTra)
                        .addGap(30, 30, 30)
                        .addComponent(btnThemMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnXoaMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCapNhatMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnMoiMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        CapNhatMuonTraLayout.setVerticalGroup(
            CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                .addComponent(btnTrangChu2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtTimKiemMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCapNhatMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimKiemMuonTra)
                        .addComponent(btnMoiMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CapNhatMuonTraLayout.createSequentialGroup()
                        .addComponent(btnXoaMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(txtMaMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSachMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaDocGiaMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtMaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtNgayTraDuKien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CapNhatMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtNgayTraThucTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cập Nhật Mượn Trả", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/receipt.png")), CapNhatMuonTra); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnTimKiemThuThu.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiemThuThu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTimKiemThuThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search.png"))); // NOI18N
        btnTimKiemThuThu.setText("Tìm Kiếm");
        btnTimKiemThuThu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTimKiemThuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemThuThuActionPerformed(evt);
            }
        });

        btnThemThuThu.setBackground(new java.awt.Color(255, 255, 255));
        btnThemThuThu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThemThuThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/add.png"))); // NOI18N
        btnThemThuThu.setText("Thêm");
        btnThemThuThu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnThemThuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThuThuActionPerformed(evt);
            }
        });

        btnXoaThuThu.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaThuThu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXoaThuThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/delete.png"))); // NOI18N
        btnXoaThuThu.setText("Xóa");
        btnXoaThuThu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoaThuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThuThuActionPerformed(evt);
            }
        });

        btnSuaThuThu.setBackground(new java.awt.Color(255, 255, 255));
        btnSuaThuThu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSuaThuThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/repair.png"))); // NOI18N
        btnSuaThuThu.setText("Sửa");
        btnSuaThuThu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSuaThuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThuThuActionPerformed(evt);
            }
        });

        btnMoiThuthu.setBackground(new java.awt.Color(255, 255, 255));
        btnMoiThuthu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMoiThuthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnMoiThuthu.setText("Mới");
        btnMoiThuthu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiThuthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiThuthuActionPerformed(evt);
            }
        });

        txtTimKiemThuThu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemThuThu.setText("Điền mã thủ thư");
        txtTimKiemThuThu.setBorder(null);

        btnTrangChu3.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangChu3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTrangChu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/real-estate.png"))); // NOI18N
        btnTrangChu3.setText("Trang Chủ");
        btnTrangChu3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTrangChu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChu3ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Mã Thủ Thư");

        txtMaTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaTT.setBorder(null);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel27.setText("Ngày Sinh");

        txtNgaySinhTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgaySinhTT.setText("MM/DD/YYYY");
        txtNgaySinhTT.setBorder(null);

        txtSDTTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSDTTT.setBorder(null);

        txtEmaiTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtEmaiTT.setBorder(null);

        txtDiaChiTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDiaChiTT.setBorder(null);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel32.setText("Địa Chỉ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel31.setText("Email");

        txtGioiTinhTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtGioiTinhTT.setBorder(null);

        txtTenTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenTT.setBorder(null);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setText("Mật Khẩu");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setText("Tên Thủ Thư");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel33.setText("Giới Tính");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel28.setText("Số Điện Thoại");

        tbThuThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Mượn Trả", "Mã Đọc Giả", "Mã Thủ Thư", "Mã Sách", "Ngày Mượn", "Ngày Trả Dự Kiến", "Ngày Trả Thực Tế"
            }
        ));
        tbThuThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThuThuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbThuThu);

        txtMatKhauTT.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMatKhauTT.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(990, Short.MAX_VALUE)
                .addComponent(btnTrangChu3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtTimKiemThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTimKiemThuThu)
                                .addGap(30, 30, 30)
                                .addComponent(btnThemThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnXoaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel33))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTenTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txtMaTT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGioiTinhTT)
                                    .addComponent(txtMatKhauTT, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel28))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmaiTT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSDTTT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgaySinhTT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChiTT, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSuaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnMoiThuthu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnTrangChu3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtTimKiemThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSuaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemThuThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimKiemThuThu)
                        .addComponent(btnMoiThuthu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXoaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaySinhTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDTTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmaiTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDiaChiTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtMaTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtMatKhauTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtTenTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtGioiTinhTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cập Nhật Thủ Thư", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/personal-information (1).png")), jPanel1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        TrangChu aChu=new TrangChu();
        aChu.setVisible(true);
        aChu.setResizable(false);
        aChu.setLocationRelativeTo(null);
        aChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnTrangChu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChu1ActionPerformed
        TrangChu aChu=new TrangChu();
        aChu.setVisible(true);
        aChu.setResizable(false);
        aChu.setLocationRelativeTo(null);
        aChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChu1ActionPerformed

    private void btnTrangChu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChu2ActionPerformed
        TrangChu aChu=new TrangChu();
        aChu.setVisible(true);
        aChu.setResizable(false);
        aChu.setLocationRelativeTo(null);
        aChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChu2ActionPerformed

    private void btnTimKiemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSachActionPerformed
        aSach.remove();
        aSach_pojos.removeAll(aSach_pojos);
        tbSach.setModel(aSach);
        //Lấy mảng độc giả từ docGia__Dao;
        String aString=txtTimKiemSach.getText();
        aSach_pojos = aSach_DAO.timkiemsach(aString);
        System.out.println(aSach_pojos);
        System.out.println("Length: " + aSach_pojos.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        aSach_pojos.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aSach.themsach(item);
            tbSach.setModel(aSach);
        });
        aSach_pojos.removeAll(aSach_pojos);
    }//GEN-LAST:event_btnTimKiemSachActionPerformed

    private void btnXoaMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMuonTraActionPerformed
        //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbMuonTra.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        Muontra_pojo mt = aMuonTra.layMuontra(index);
        //Xóa độc giả trên DB
        aMuonTra_DAO.xoaMuontra(mt);
        //Xóa độc giả trên table
        aMuonTra.xoaMuontra(mt);
    }//GEN-LAST:event_btnXoaMuonTraActionPerformed

    private void txtTimKiemMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemMuonTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemMuonTraActionPerformed

    private void btnXoaThuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThuThuActionPerformed
        //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbThuThu.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        ThuThu_pojo mt = aThuThu.layThuThu(index);
        //Xóa độc giả trên DB
        aThuThu_DAO.xoaThuThu(mt);
        //Xóa độc giả trên table
        aThuThu.xoaThuThu(mt);
        JOptionPane.showMessageDialog(this, "Xóa Thủ Thư thành công...!");
    }//GEN-LAST:event_btnXoaThuThuActionPerformed

    private void btnTrangChu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChu3ActionPerformed
        TrangChu aChu=new TrangChu();
        aChu.setVisible(true);
        aChu.setResizable(false);
        aChu.setLocationRelativeTo(null);
        aChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChu3ActionPerformed

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        int rowSelected = this.tbSach.getSelectedRow();
        
        txtMaSach.setText((String)tbSach.getValueAt(rowSelected, 0));
        txtTenSach.setText((String)tbSach.getValueAt(rowSelected, 1));
        txtTenTacGia.setText((String)tbSach.getValueAt(rowSelected, 2));
        txtSoLuong.setText((String)tbSach.getValueAt(rowSelected, 3));
        txtNgayNhap.setText((String)tbSach.getValueAt(rowSelected, 4));
        txtTheLoai.setText((String)tbSach.getValueAt(rowSelected, 5));
        txtNhaXuatBan.setText((String)tbSach.getValueAt(rowSelected, 6));
        txtNamXuatBan.setText((String)tbSach.getValueAt(rowSelected, 7));
        txtPhiDenBu.setText((String)tbSach.getValueAt(rowSelected, 8));
        txtTinhTrang.setText((String)tbSach.getValueAt(rowSelected, 9));
    }//GEN-LAST:event_tbSachMouseClicked

    private void btnThemDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDocGiaActionPerformed
       // TODO add your handling code here:
        String maDG = txtMaDocGia.getText();
        Docgia_pojo aDocgia_pojo=new Docgia_pojo();
        //Kiểm tra mã đọc giảm, nếu có mã rồi khi ko thêm vào nữa

        int check = 0;
        for (int i = 0; i < aDocgia_pojos.size(); i++) {
            //Lấy từng đọc giả ra kiểm tra (MaDG), nếu có đọc giả rồi thì dừng
            Docgia_pojo dgCheck = aDocgia_pojos.get(i);
            if (dgCheck.getMadg().equals(maDG)) {
                JOptionPane.showMessageDialog(getContentPane(), "Đọc Giả đã tồn tại");
                check = 1;
                return;
            }
        }
        //Nếu tồn tại độc giả rồi thì dừng ko thêm
        if(check != 0) return;
        int dem=0;
        if (txtMaDocGia.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập tên Đăng Nhập");
            dem++;
        }
        if (txtMatKhau.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Mật Khẩu");
            dem++;
        }
        if (txtTenDocGia.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập đầy đủ Họ và Tên");
            dem++;
        }
        if (txtGioiTinh.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần chọn Giới Tính");
            dem++;
        }
        if (txtDiaChi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Địa Chỉ");
            dem++;
        }
        if (txtNgayBD.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Ngày Bắt Đầu");
            dem++;
        }
        if (txtNgayKT.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Cần nhập Ngày Kết Thúc");
            dem++;
        }
        if (txtMaDocGia.getText().length()>10) {
            JOptionPane.showMessageDialog(this, "Tên Đăng Nhập không được quá 10 kí tự!");
        }
        if (txtMatKhau.getText().length()>15)
            JOptionPane.showMessageDialog(this, "Mật Khẩu không được quá 15 kí tự!");
        if (dem==0) {
            aDocgia_pojo.setMadg(txtMaDocGia.getText());
            aDocgia_pojo.setMatkhau(txtMatKhau.getText());
            aDocgia_pojo.setTendg(txtTenDocGia.getText());
            aDocgia_pojo.setGioitinh(txtGioiTinh.getText());
            aDocgia_pojo.setDiachi(txtDiaChi.getText());
            aDocgia_pojo.setNgaybd(txtNgayBD.getText());
            aDocgia_pojo.setNgaykt(txtNgayKT.getText());
            aDocgia_pojo.setPhicoc(txtPhiCoc.getText());
            int a=aDocGia_DAO.themDocGia(aDocgia_pojo);
            if (a==1) {
               JOptionPane.showMessageDialog(this, "Thêm Đọc Giả thành công...!"); 
            }

        aDocgia.themDocGia(aDocgia_pojo);
        }
    }//GEN-LAST:event_btnThemDocGiaActionPerformed

    private void btnXoaDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDocGiaActionPerformed
        //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbDocGia.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        Docgia_pojo dg = aDocgia.layDocGia(index);
        //Xóa độc giả trên DB
        aDocGia_DAO.xoaDocGia(dg);
        //Xóa độc giả trên table
        aDocgia.xoaDocGia(dg);
        JOptionPane.showMessageDialog(this, "Xóa Đọc Giả thành công...!"); 
    }//GEN-LAST:event_btnXoaDocGiaActionPerformed

    private void tbDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDocGiaMouseClicked
       int rowSelect = this.tbDocGia.getSelectedRow();
        txtMaDocGia.setText((String) tbDocGia.getValueAt(rowSelect, 0));
        txtMatKhau.setText((String) tbDocGia.getValueAt(rowSelect, 1));
        txtTenDocGia.setText((String) tbDocGia.getValueAt(rowSelect, 2));
        txtGioiTinh.setText((String) tbDocGia.getValueAt(rowSelect, 3));
        txtDiaChi.setText((String) tbDocGia.getValueAt(rowSelect, 4));
        txtNgayBD.setText(tbDocGia.getValueAt(rowSelect, 5) + "");
        txtNgayKT.setText(tbDocGia.getValueAt(rowSelect, 6) + "");
        txtPhiCoc.setText((String) tbDocGia.getValueAt(rowSelect, 7));
    }//GEN-LAST:event_tbDocGiaMouseClicked

    private void btnMoiDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiDocGiaActionPerformed
        txtTimKiemDocGia.setText("");
        txtMaDocGia.setText("");
        txtTenDocGia.setText("");
        txtMatKhau.setText("");
        txtGioiTinh.setText("");
        txtDiaChi.setText("");
        txtPhiCoc.setText("");
        txtNgayBD.setText("");
        txtNgayKT.setText("");
        aDocgia.remove();
        intlistDocGia();
    }//GEN-LAST:event_btnMoiDocGiaActionPerformed

    private void btnXoaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSachActionPerformed
       //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbSach.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        Sach_pojo sach = aSach.laySach(index);
        String test="KHÔNG MƯỢN";
        if(sach.getTinhtrang().equals(test)){
            //Xóa độc giả trên DB
            aSach_DAO.xoaSach(sach);
            //Xóa độc giả trên table
            aSach.xoaSach(sach);
            JOptionPane.showMessageDialog(this, "Xóa Sách thành công...!"); 
        }
        else{
           JOptionPane.showMessageDialog(getContentPane(), "Sách này vẫn đang được mượn, không thể xóa!"); 
        }
        

    }//GEN-LAST:event_btnXoaSachActionPerformed

    private void btnThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSachActionPerformed
        String maSH = txtMaSach.getText();
        //Kiểm tra mã đọc giảm, nếu có mã rồi khi ko thêm vào nữa

        int check = 0;
        for (int i = 0; i < aSach_pojos.size(); i++) {
            //Lấy từng đọc giả ra kiểm tra (MaDG), nếu có đọc giả rồi thì dừng
            Sach_pojo sachCheck = aSach_pojos.get(i);
            if (sachCheck.getMash().equals(maSH)) {
                JOptionPane.showMessageDialog(getContentPane(), "Đã có sách này!");
                check = 1;
                return;
            }
        }
        //Nếu tồn tại độc giả rồi thì dừng ko thêm
        Sach_pojo sach;
        sach=new Sach_pojo();
        if(check != 0) return;
        sach.setMash(txtMaSach.getText());
        sach.setTensh(txtTenSach.getText());
        sach.setTentg(txtTenTacGia.getText());
        sach.setSoluong(txtSoLuong.getText());
        sach.setPhidenbu(txtPhiDenBu.getText());
        sach.setNgaynhap(txtNgayNhap.getText());
        sach.setTheloai(txtTheLoai.getText());
        sach.setNxb(txtNhaXuatBan.getText());
        sach.setNamxb(txtNamXuatBan.getText());
        sach.setTinhtrang(txtTinhTrang.getText());
        int a=aSach_DAO.themSach(sach);
        aSach_pojos.add(sach);
        if (a==1) {
           JOptionPane.showMessageDialog(this, "Thêm Sách thành công...!"); 
        }
        aSach.themsach(sach);
        
    }//GEN-LAST:event_btnThemSachActionPerformed

    private void btnMoiSach(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiSach
        txtTimKiemSach.setText("");
        txtMaSach.setText("");
        txtTenSach.setText("");
        txtTenTacGia.setText("");
        txtSoLuong.setText("");
        txtPhiDenBu.setText("");
        txtNgayNhap.setText("");
        txtTheLoai.setText("");
        txtNhaXuatBan.setText("");
        txtNamXuatBan.setText("");
        txtTinhTrang.setText("");
        aSach.remove();
        intlistSach();
    }//GEN-LAST:event_btnMoiSach

    private void btnTimKiemMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemMuonTraActionPerformed
        aMuonTra.remove();
        aMuontra_pojos = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        String aString=txtTimKiemMuonTra.getText();
        aMuontra_pojos = aMuonTra_DAO.timkiemmuontra(aString);
        System.out.println(aMuontra_pojos);
        System.out.println("Length: " + aMuontra_pojos.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        aMuontra_pojos.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aMuonTra.themMuonTra(item);
            tbMuonTra.setModel(aMuonTra);
        });
        aMuontra_pojos.removeAll(aMuontra_pojos);
    }//GEN-LAST:event_btnTimKiemMuonTraActionPerformed

    private void btnMoiMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiMuonTraActionPerformed
        txtTimKiemMuonTra.setText("");
        txtMaMuonTra.setText("");
        txtMaDocGiaMuon.setText("");
        txtMaThuThu.setText("");
        txtMaSachMuon.setText("");
        txtNgayMuon.setText("");
        txtNgayTraDuKien.setText("");
        txtNgayTraThucTe.setText("");
        aMuonTra.remove();
        intlistMuonTra();
    }//GEN-LAST:event_btnMoiMuonTraActionPerformed

    private void btnSuaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSachActionPerformed
        //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbSach.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        Sach_pojo sach = aSach.laySach(index);
        //Xóa độc giả trên DB
        
        //Xóa độc giả trên table
        
        sach.setMash(txtMaSach.getText());
        sach.setTensh(txtTenSach.getText());
        sach.setTentg(txtTenTacGia.getText());
        sach.setSoluong(txtSoLuong.getText());
        sach.setPhidenbu(txtPhiDenBu.getText());
        sach.setNgaynhap(txtNgayNhap.getText());
        sach.setTheloai(txtTheLoai.getText());
        sach.setNxb(txtNhaXuatBan.getText());
        sach.setNamxb(txtNamXuatBan.getText());
        sach.setTinhtrang(txtTinhTrang.getText());
        aSach_DAO.suaSach(sach);
        aSach.updateSach(sach);
        JOptionPane.showMessageDialog(this, "Cập nhật thành công...!"); 
    }//GEN-LAST:event_btnSuaSachActionPerformed

    private void tbMuonTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMuonTraMouseClicked
        int rowSelect = this.tbMuonTra.getSelectedRow();
        txtMaMuonTra.setText((String) tbMuonTra.getValueAt(rowSelect, 0));
        txtMaDocGiaMuon.setText((String) tbMuonTra.getValueAt(rowSelect, 1));
        txtMaThuThu.setText((String) tbMuonTra.getValueAt(rowSelect, 2));
        txtMaSachMuon.setText((String) tbMuonTra.getValueAt(rowSelect, 3));
        txtNgayMuon.setText((String) tbMuonTra.getValueAt(rowSelect, 4));
        txtNgayTraDuKien.setText(tbMuonTra.getValueAt(rowSelect, 5) + "");
        txtNgayTraThucTe.setText(tbMuonTra.getValueAt(rowSelect, 6) + "");
    }//GEN-LAST:event_tbMuonTraMouseClicked

    private void btnThemMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMuonTraActionPerformed
        String maMT = txtMaMuonTra.getText();
        //Kiểm tra mã đọc giảm, nếu có mã rồi khi ko thêm vào nữa

        int check = 0;
        for (int i = 0; i < aMuontra_pojos.size(); i++) {
            //Lấy từng đọc giả ra kiểm tra (MaDG), nếu có đọc giả rồi thì dừng
            Muontra_pojo muontraCheck = aMuontra_pojos.get(i);
            if (muontraCheck.getMamt().equals(maMT)) {
                JOptionPane.showMessageDialog(getContentPane(), "Đã có Phiếu Mượn Trả này!");
                check = 1;
                return;
            }
        }
        Muontra_pojo muontra;
        muontra=new Muontra_pojo();
        if(check != 0) return;
        muontra.setMamt(txtMaMuonTra.getText());
        muontra.setMadg(txtMaDocGiaMuon.getText());
        muontra.setMatt(txtMaThuThu.getText());
        muontra.setMash(txtMaSachMuon.getText());
        muontra.setNgaymuon(txtNgayMuon.getText());
        muontra.setNgaytradukien(txtNgayTraDuKien.getText());
        muontra.setNgaytrathucte(txtNgayTraThucTe.getText());
        int a=aMuonTra_DAO.themMuonTra(muontra);
        aMuontra_pojos.add(muontra);
        if (a==1) {
           JOptionPane.showMessageDialog(this, "Thêm phiếu mượn thành công...!"); 
        }
        aMuonTra.themMuonTra(muontra);
        aMuontra_pojos.add(muontra);
    }//GEN-LAST:event_btnThemMuonTraActionPerformed

    private void btnTimKiemThuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemThuThuActionPerformed
        aThuThu.remove();
        aThuThu_pojos = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        String aString=txtTimKiemThuThu.getText();
        aThuThu_pojos = aThuThu_DAO.timkiemthuthu(aString);
        System.out.println(aThuThu_pojos);
        System.out.println("Length: " + aThuThu_pojos.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        aThuThu_pojos.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aThuThu.themThuThu(item);
            tbThuThu.setModel(aThuThu);
        });
        aThuThu_pojos.removeAll(aThuThu_pojos);
    }//GEN-LAST:event_btnTimKiemThuThuActionPerformed

    private void btnMoiThuthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiThuthuActionPerformed
        txtTimKiemThuThu.setText("");
        txtMaTT.setText("");
        txtTenTT.setText("");
        txtMatKhauTT.setText("");
        txtGioiTinhTT.setText("");
        txtNgaySinhTT.setText("");
        txtSDTTT.setText("");
        txtDiaChiTT.setText("");
        txtEmaiTT.setText("");
        aThuThu.remove();
        intlistThuThu();
    }//GEN-LAST:event_btnMoiThuthuActionPerformed

    private void btnTimKiemDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemDocGiaActionPerformed
        aDocgia.remove();
        aDocgia_pojos = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        String aString=txtTimKiemDocGia.getText();
        aDocgia_pojos = aDocGia_DAO.timkiemdocgia(aString);
        System.out.println(aDocgia_pojos);
        System.out.println("Length: " + aDocgia_pojos.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        aDocgia_pojos.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aDocgia.themDocGia(item);
            tbDocGia.setModel(aDocgia);
        });
        aDocgia_pojos.removeAll(aDocgia_pojos);
    }//GEN-LAST:event_btnTimKiemDocGiaActionPerformed

    private void btCapNhatDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatDocGiaActionPerformed
        //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbDocGia.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        Docgia_pojo aDocgia_pojo = aDocgia.layDocGia(index);
        //Xóa độc giả trên DB
        
            aDocgia_pojo.setMadg(txtMaDocGia.getText());
            aDocgia_pojo.setMatkhau(txtMatKhau.getText());
            aDocgia_pojo.setTendg(txtTenDocGia.getText());
            aDocgia_pojo.setGioitinh(txtGioiTinh.getText());
            aDocgia_pojo.setDiachi(txtDiaChi.getText());
            aDocgia_pojo.setNgaybd(txtNgayBD.getText());
            aDocgia_pojo.setNgaykt(txtNgayKT.getText());
            aDocgia_pojo.setPhicoc(txtPhiCoc.getText());
        aDocGia_DAO.suaDocGia(aDocgia_pojo);
        aDocgia.updateDocgia(aDocgia_pojo);
        JOptionPane.showMessageDialog(this, "Cập nhật đọc giả thành công...!"); 
    }//GEN-LAST:event_btCapNhatDocGiaActionPerformed

    private void btnCapNhatMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatMuonTraActionPerformed
        //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbMuonTra.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        Muontra_pojo muontra = aMuonTra.layMuontra(index);
        
        muontra.setMamt(txtMaMuonTra.getText());
        muontra.setMadg(txtMaDocGiaMuon.getText());
        muontra.setMatt(txtMaThuThu.getText());
        muontra.setMash(txtMaSachMuon.getText());
        muontra.setNgaymuon(txtNgayMuon.getText());
        muontra.setNgaytradukien(txtNgayTraDuKien.getText());
        muontra.setNgaytrathucte(txtNgayTraThucTe.getText());
        aMuonTra_DAO.suaMuonTra(muontra);
        aMuonTra.updateMuonTra(muontra);
        JOptionPane.showMessageDialog(this, "Cập nhật phiếu mượn trả thành công...!");
    }//GEN-LAST:event_btnCapNhatMuonTraActionPerformed

    private void btnThemThuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThuThuActionPerformed
        String maTT = txtMaTT.getText();
        //Kiểm tra mã đọc giảm, nếu có mã rồi khi ko thêm vào nữa

        int check = 0;
        for (int i = 0; i < aThuThu_pojos.size(); i++) {
            //Lấy từng đọc giả ra kiểm tra (MaDG), nếu có đọc giả rồi thì dừng
            ThuThu_pojo thuthucheck = aThuThu_pojos.get(i);
            if (thuthucheck.getMatt().equals(maTT)) {
                JOptionPane.showMessageDialog(getContentPane(), "Đã có thủ thư này!");
                check = 1;
                return;
            }
        }
        //Nếu tồn tại độc giả rồi thì dừng ko thêm
        ThuThu_pojo thuthu;
        thuthu=new ThuThu_pojo();
        if(check != 0) return;
        thuthu.setMatt(txtMaTT.getText());
        thuthu.setMatkhau(txtMatKhauTT.getText());
        thuthu.setHoten(txtTenTT.getText());
        thuthu.setGioitinh(txtGioiTinhTT.getText());
        thuthu.setNgaysinh(txtNgaySinhTT.getText());
        thuthu.setSdt(txtSDTTT.getText());
        thuthu.setEmail(txtEmaiTT.getText());
        thuthu.setDiachi(txtDiaChiTT.getText());
        int a=aThuThu_DAO.themThuThu(thuthu);
        aThuThu_pojos.add(thuthu);
        if (a==1) {
           JOptionPane.showMessageDialog(this, "Thêm Thủ thư thành công...!"); 
        }
        aThuThu.themThuThu(thuthu);
    }//GEN-LAST:event_btnThemThuThuActionPerformed

    private void btnSuaThuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThuThuActionPerformed
        //Lấy vị trí đọc giả từ bảng khi chọn
        int index = tbThuThu.getSelectedRow();
        //Lấy độc giả nhờ vào vị trí
        ThuThu_pojo thuthu = aThuThu.layThuThu(index);
        //Xóa độc giả trên DB
        
        thuthu.setMatt(txtMaTT.getText());
        thuthu.setMatkhau(txtMatKhauTT.getText());
        thuthu.setHoten(txtTenTT.getText());
        thuthu.setGioitinh(txtGioiTinhTT.getText());
        thuthu.setNgaysinh(txtNgaySinhTT.getText());
        thuthu.setSdt(txtSDTTT.getText());
        thuthu.setEmail(txtEmaiTT.getText());
        thuthu.setDiachi(txtDiaChiTT.getText());
        aThuThu_DAO.suaThuThu(thuthu);
        aThuThu.updatethuthu(thuthu);
        JOptionPane.showMessageDialog(this, "Cập nhật thủ thư thành công...!"); 
    }//GEN-LAST:event_btnSuaThuThuActionPerformed

    private void tbThuThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThuThuMouseClicked
         int rowSelect = this.tbThuThu.getSelectedRow();
        txtMaTT.setText((String) tbThuThu.getValueAt(rowSelect, 0));
        txtMatKhauTT.setText((String) tbThuThu.getValueAt(rowSelect, 1));
        txtTenTT.setText((String) tbThuThu.getValueAt(rowSelect, 2));
        txtGioiTinhTT.setText((String) tbThuThu.getValueAt(rowSelect, 3));
        txtNgaySinhTT.setText((String) tbThuThu.getValueAt(rowSelect, 4));
        txtSDTTT.setText((String)tbThuThu.getValueAt(rowSelect, 5));
        txtEmaiTT.setText((String)tbThuThu.getValueAt(rowSelect, 6));
        txtDiaChiTT.setText((String) tbThuThu.getValueAt(rowSelect, 7));
    }//GEN-LAST:event_tbThuThuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CapNhatBanDoc;
    private javax.swing.JPanel CapNhatMuonTra;
    private javax.swing.JPanel CapNhatSach;
    private javax.swing.JButton btCapNhatDocGia;
    private javax.swing.JButton btnCapNhatMuonTra;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnMoiDocGia;
    private javax.swing.JButton btnMoiMuonTra;
    private javax.swing.JButton btnMoiThuthu;
    private javax.swing.JButton btnSuaSach;
    private javax.swing.JButton btnSuaThuThu;
    private javax.swing.JButton btnThemDocGia;
    private javax.swing.JButton btnThemMuonTra;
    private javax.swing.JButton btnThemSach;
    private javax.swing.JButton btnThemThuThu;
    private javax.swing.JButton btnTimKiemDocGia;
    private javax.swing.JButton btnTimKiemMuonTra;
    private javax.swing.JButton btnTimKiemSach;
    private javax.swing.JButton btnTimKiemThuThu;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnTrangChu1;
    private javax.swing.JButton btnTrangChu2;
    private javax.swing.JButton btnTrangChu3;
    private javax.swing.JButton btnXoaDocGia;
    private javax.swing.JButton btnXoaMuonTra;
    private javax.swing.JButton btnXoaSach;
    private javax.swing.JButton btnXoaThuThu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbDocGia;
    private javax.swing.JTable tbMuonTra;
    private javax.swing.JTable tbSach;
    private javax.swing.JTable tbThuThu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiaChiTT;
    private javax.swing.JTextField txtEmaiTT;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtGioiTinhTT;
    private javax.swing.JTextField txtMaDocGia;
    private javax.swing.JTextField txtMaDocGiaMuon;
    private javax.swing.JTextField txtMaMuonTra;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtMaSachMuon;
    private javax.swing.JTextField txtMaTT;
    private javax.swing.JTextField txtMaThuThu;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauTT;
    private javax.swing.JTextField txtNamXuatBan;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtNgayMuon;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtNgaySinhTT;
    private javax.swing.JTextField txtNgayTraDuKien;
    private javax.swing.JTextField txtNgayTraThucTe;
    private javax.swing.JTextField txtNhaXuatBan;
    private javax.swing.JTextField txtPhiCoc;
    private javax.swing.JTextField txtPhiDenBu;
    private javax.swing.JTextField txtSDTTT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenDocGia;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTenTT;
    private javax.swing.JTextField txtTenTacGia;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txtTimKiemDocGia;
    private javax.swing.JTextField txtTimKiemMuonTra;
    private javax.swing.JTextField txtTimKiemSach;
    private javax.swing.JTextField txtTimKiemThuThu;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
