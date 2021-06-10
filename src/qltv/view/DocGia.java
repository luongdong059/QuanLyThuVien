/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import qltv.dao.DocGia_DAO;
import qltv.dao.Docgia_pojo;
import qltv.dao.MuonTra_DAO;
import qltv.dao.Muontra_pojo;
import qltv.dao.Sach_DAO;
import qltv.dao.Sach_pojo;
import qltv.table.model.table_model_MuonTra;
import qltv.table.model.table_model_Sach;
import qltv.table.model.tablel_model_Docgia;

/**
 *
 * @author Đông
 */
public class DocGia extends javax.swing.JFrame {

    tablel_model_Docgia aDocgia;
    table_model_MuonTra aMuonTra;
    table_model_Sach aSach;
    ArrayList<Docgia_pojo> arrayList;
    ArrayList<Muontra_pojo> bArrayList;
    ArrayList<Sach_pojo> cArrayList;
    DocGia_DAO aDocGia_DAO;
    MuonTra_DAO aMuonTra_DAO;
    Sach_DAO aSach_DAO;
    public DocGia() {
        initComponents();
        aDocGia_DAO= new DocGia_DAO();
        aMuonTra_DAO=new MuonTra_DAO();
        aSach_DAO=new Sach_DAO();
        aDocgia=new tablel_model_Docgia();
        aMuonTra=new table_model_MuonTra();
        aSach=new table_model_Sach();
        initDocGia();
        initMuonTra();
        initSach();
    }
    
    public void initDocGia() {
        //Khởi tạo mảng
        arrayList = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        arrayList = aDocGia_DAO.layMangDocGia();
        System.out.println(arrayList);
        System.out.println("Length: " + arrayList.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        arrayList.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aDocgia.themDocGia(item);
            tbDocGia1.setModel(aDocgia); 
        });
        arrayList.removeAll(arrayList);
    }
    
    public void initSach() {
        //Khởi tạo mảng
        cArrayList = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        cArrayList = aSach_DAO.layMangSach();
        System.out.println(cArrayList);
        System.out.println("Length: " + cArrayList.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        cArrayList.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aSach.themsach(item);
            tbSach.setModel(aSach); 
        });
        cArrayList.removeAll(cArrayList);
    }
    
    public void initMuonTra() {
        //Khởi tạo mảng
        bArrayList = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        bArrayList = aMuonTra_DAO.layMangMuontra();
        System.out.println(bArrayList);
        System.out.println("Length: " + bArrayList.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        bArrayList.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aMuonTra.themMuonTra(item);
            tbMuonTra.setModel(aMuonTra); 
        });
        bArrayList.removeAll(bArrayList);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnThongTinMuonTra = new javax.swing.JPanel();
        btnTimKiemMuonTra = new javax.swing.JButton();
        txtTimKiemMuonTra = new javax.swing.JTextField();
        btnNewMuonTra = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMuonTra = new javax.swing.JTable();
        btnDangXuat = new javax.swing.JButton();
        jpnThongTinDocGia = new javax.swing.JPanel();
        btnTimKiemDocGia = new javax.swing.JButton();
        txtTimKiemDocGia = new javax.swing.JTextField();
        btnNewDocGia = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtHovaTen = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDocGia1 = new javax.swing.JTable();
        btnDangXuat1 = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        jpnTimKiemSach = new javax.swing.JPanel();
        btnTimKiemSach = new javax.swing.JButton();
        txtTimKiemSach = new javax.swing.JTextField();
        btnNewSach = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        btnDangXuat2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đọc Giả");

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jpnThongTinMuonTra.setBackground(new java.awt.Color(204, 204, 204));
        jpnThongTinMuonTra.setForeground(new java.awt.Color(255, 51, 51));

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

        txtTimKiemMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemMuonTra.setText("Điền mã Mượn Trả");
        txtTimKiemMuonTra.setBorder(null);

        btnNewMuonTra.setBackground(new java.awt.Color(255, 255, 255));
        btnNewMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNewMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnNewMuonTra.setText("Mới");
        btnNewMuonTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNewMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMuonTraActionPerformed(evt);
            }
        });

        tbMuonTra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbMuonTra);

        btnDangXuat.setBackground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/exit.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnThongTinMuonTraLayout = new javax.swing.GroupLayout(jpnThongTinMuonTra);
        jpnThongTinMuonTra.setLayout(jpnThongTinMuonTraLayout);
        jpnThongTinMuonTraLayout.setHorizontalGroup(
            jpnThongTinMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
            .addGroup(jpnThongTinMuonTraLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnTimKiemMuonTra)
                .addGap(38, 38, 38)
                .addComponent(txtTimKiemMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnNewMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongTinMuonTraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnThongTinMuonTraLayout.setVerticalGroup(
            jpnThongTinMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinMuonTraLayout.createSequentialGroup()
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jpnThongTinMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemMuonTra)
                    .addComponent(btnNewMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Thông Tin Mượn Trả", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/personal-information (1).png")), jpnThongTinMuonTra); // NOI18N

        jpnThongTinDocGia.setBackground(new java.awt.Color(204, 204, 204));

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

        txtTimKiemDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemDocGia.setText("Điền mã Đọc Giả");
        txtTimKiemDocGia.setBorder(null);

        btnNewDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btnNewDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNewDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnNewDocGia.setText("Mới");
        btnNewDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNewDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDocGiaActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel28.setText("Mật Khẩu");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setText("Giới Tính");

        txtGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtGioiTinh.setBorder(null);

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDiaChi.setBorder(null);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setText("Địa Chỉ");

        txtHovaTen.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtHovaTen.setBorder(null);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel31.setText("Họ và Tên");

        tbDocGia1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDocGia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDocGia1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbDocGia1);

        btnDangXuat1.setBackground(new java.awt.Color(255, 255, 255));
        btnDangXuat1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDangXuat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/exit.png"))); // NOI18N
        btnDangXuat1.setText("Đăng Xuất");
        btnDangXuat1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangXuat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuat1ActionPerformed(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMatKhau.setBorder(null);

        javax.swing.GroupLayout jpnThongTinDocGiaLayout = new javax.swing.GroupLayout(jpnThongTinDocGia);
        jpnThongTinDocGia.setLayout(jpnThongTinDocGiaLayout);
        jpnThongTinDocGiaLayout.setHorizontalGroup(
            jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jpnThongTinDocGiaLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31))
                .addGap(41, 41, 41)
                .addGroup(jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHovaTen, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(txtMatKhau))
                .addGap(41, 41, 41)
                .addGroup(jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(21, 21, 21)
                .addGroup(jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiaChi)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongTinDocGiaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDangXuat1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongTinDocGiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(txtTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnNewDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jpnThongTinDocGiaLayout.setVerticalGroup(
            jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinDocGiaLayout.createSequentialGroup()
                .addComponent(btnDangXuat1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnThongTinDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Thông Tin Đọc Giả", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/student (1).png")), jpnThongTinDocGia); // NOI18N

        jpnTimKiemSach.setBackground(new java.awt.Color(204, 204, 204));
        jpnTimKiemSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        txtTimKiemSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemSach.setText("Điền Mã Sách");
        txtTimKiemSach.setBorder(null);

        btnNewSach.setBackground(new java.awt.Color(255, 255, 255));
        btnNewSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNewSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnNewSach.setText("Mới");
        btnNewSach.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNewSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSachActionPerformed(evt);
            }
        });

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbSach);

        btnDangXuat2.setBackground(new java.awt.Color(255, 255, 255));
        btnDangXuat2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDangXuat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/exit.png"))); // NOI18N
        btnDangXuat2.setText("Đăng Xuất");
        btnDangXuat2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDangXuat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuat2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTimKiemSachLayout = new javax.swing.GroupLayout(jpnTimKiemSach);
        jpnTimKiemSach.setLayout(jpnTimKiemSachLayout);
        jpnTimKiemSachLayout.setHorizontalGroup(
            jpnTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1156, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTimKiemSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnNewSach, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTimKiemSachLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDangXuat2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnTimKiemSachLayout.setVerticalGroup(
            jpnTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemSachLayout.createSequentialGroup()
                .addComponent(btnDangXuat2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jpnTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewSach, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tìm Kiếm Sách", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search.png")), jpnTimKiemSach); // NOI18N

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

    private void btnDangXuat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuat2ActionPerformed
        DangNhapJFrame aDangNhapJFrame=new DangNhapJFrame();
        aDangNhapJFrame.setVisible(true);
        aDangNhapJFrame.setResizable(false);
        aDangNhapJFrame.setLocationRelativeTo(null);
        aDangNhapJFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangXuat2ActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhapJFrame aDangNhapJFrame=new DangNhapJFrame();
        aDangNhapJFrame.setVisible(true);
        aDangNhapJFrame.setResizable(false);
        aDangNhapJFrame.setLocationRelativeTo(null);
        aDangNhapJFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnDangXuat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuat1ActionPerformed
        DangNhapJFrame aDangNhapJFrame=new DangNhapJFrame();
        aDangNhapJFrame.setVisible(true);
        aDangNhapJFrame.setResizable(false);
        aDangNhapJFrame.setLocationRelativeTo(null);
        aDangNhapJFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangXuat1ActionPerformed

    private void btnTimKiemMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemMuonTraActionPerformed
        aMuonTra.remove();
        bArrayList = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        String aString=txtTimKiemMuonTra.getText();
        bArrayList = aMuonTra_DAO.timkiemmuontra(aString);
        System.out.println(bArrayList);
        System.out.println("Length: " + bArrayList.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        bArrayList.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aMuonTra.themMuonTra(item);
            tbMuonTra.setModel(aMuonTra);
        });
        bArrayList.removeAll(bArrayList);
    }//GEN-LAST:event_btnTimKiemMuonTraActionPerformed

    private void btnTimKiemDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemDocGiaActionPerformed
        aDocgia.remove();
        arrayList = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        String aString=txtTimKiemDocGia.getText();
        arrayList = aDocGia_DAO.timkiemdocgia(aString);
        System.out.println(arrayList);
        System.out.println("Length: " + arrayList.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        arrayList.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aDocgia.themDocGia(item);
            tbDocGia1.setModel(aDocgia);
        });
        arrayList.removeAll(arrayList);
        
    }//GEN-LAST:event_btnTimKiemDocGiaActionPerformed

    private void btnTimKiemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSachActionPerformed
        aSach.remove();
        cArrayList = new ArrayList<>();
        //Lấy mảng độc giả từ docGia__Dao;
        String aString=txtTimKiemSach.getText();
        cArrayList = aSach_DAO.timkiemsach(aString);
        System.out.println(cArrayList);
        System.out.println("Length: " + cArrayList.size());
        //Duyệt từng phần tử trong mảng, thêm từng phần tử vào modal table
        cArrayList.forEach((item) -> {
            //Thêm đọc giả vào table
            System.out.println(item);
            aSach.themsach(item);
            tbSach.setModel(aSach);
        });
        cArrayList.removeAll(cArrayList);
    }//GEN-LAST:event_btnTimKiemSachActionPerformed

    private void btnNewMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMuonTraActionPerformed
        txtTimKiemMuonTra.setText("");
        aMuonTra.remove();
        initMuonTra();
    }//GEN-LAST:event_btnNewMuonTraActionPerformed

    private void btnNewDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDocGiaActionPerformed
        txtTimKiemDocGia.setText("");
        aDocgia.remove();
        initDocGia();
    }//GEN-LAST:event_btnNewDocGiaActionPerformed

    private void btnNewSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSachActionPerformed
       txtTimKiemSach.setText("");
       aSach.remove();
       initSach();
    }//GEN-LAST:event_btnNewSachActionPerformed

    private void tbDocGia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDocGia1MouseClicked
        int rowSelected = this.tbDocGia1.getSelectedRow();
          
        txtMatKhau.setText((String)tbDocGia1.getValueAt(rowSelected, 1));
        txtHovaTen.setText((String)tbDocGia1.getValueAt(rowSelected, 2));
        txtGioiTinh.setText((String)tbDocGia1.getValueAt(rowSelected, 3));
        txtDiaChi.setText((String)tbDocGia1.getValueAt(rowSelected, 4));
    }//GEN-LAST:event_tbDocGia1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDangXuat1;
    private javax.swing.JButton btnDangXuat2;
    private javax.swing.JButton btnNewDocGia;
    private javax.swing.JButton btnNewMuonTra;
    private javax.swing.JButton btnNewSach;
    private javax.swing.JButton btnTimKiemDocGia;
    private javax.swing.JButton btnTimKiemMuonTra;
    private javax.swing.JButton btnTimKiemSach;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnThongTinDocGia;
    private javax.swing.JPanel jpnThongTinMuonTra;
    private javax.swing.JPanel jpnTimKiemSach;
    private javax.swing.JTable tbDocGia1;
    private javax.swing.JTable tbMuonTra;
    private javax.swing.JTable tbSach;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHovaTen;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTimKiemDocGia;
    private javax.swing.JTextField txtTimKiemMuonTra;
    private javax.swing.JTextField txtTimKiemSach;
    // End of variables declaration//GEN-END:variables
}
