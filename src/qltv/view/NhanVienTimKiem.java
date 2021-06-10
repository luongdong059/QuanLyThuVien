/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.view;

import java.util.ArrayList;
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
public class NhanVienTimKiem extends javax.swing.JFrame {


    
    tablel_model_Docgia aDocgia;
    table_model_MuonTra aMuonTra;
    table_model_Sach aSach;
    ArrayList<Docgia_pojo> arrayList;
    ArrayList<Muontra_pojo> bArrayList;
    ArrayList<Sach_pojo> cArrayList;
    DocGia_DAO aDocGia_DAO;
    MuonTra_DAO aMuonTra_DAO;
    Sach_DAO aSach_DAO;
    public NhanVienTimKiem() {
        initComponents();
        aDocGia_DAO= new DocGia_DAO();
        aMuonTra_DAO=new MuonTra_DAO();
        aSach_DAO=new Sach_DAO();
        aDocgia=new tablel_model_Docgia();
        aMuonTra=new table_model_MuonTra();
        aSach=new table_model_Sach();
        initMuonTra();
        initDocGia();
        initSach();
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
            tbTimKiemDocGia.setModel(aDocgia); 
        });
        arrayList.removeAll(arrayList);
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
            tbTimKiemMuonTra.setModel(aMuonTra); 
        });
        bArrayList.removeAll(bArrayList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnTimKiemSach = new javax.swing.JPanel();
        btnTimKiemSach = new javax.swing.JButton();
        txtTimKiemSach = new javax.swing.JTextField();
        btnMoiSach = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        btnTrangChuSach = new javax.swing.JButton();
        jpnTimKiemMuonTra = new javax.swing.JPanel();
        btnTimKiemMuonTra = new javax.swing.JButton();
        txtTimKiemMuonTra = new javax.swing.JTextField();
        btnMoiMuonTra = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTimKiemMuonTra = new javax.swing.JTable();
        btnTrangChuMuonTra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiemDocGia = new javax.swing.JTextField();
        btnTimKiemDocGIa = new javax.swing.JButton();
        btnMoiDocGia = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTimKiemDocGia = new javax.swing.JTable();
        btnTrangChuDocGia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tìm Kiếm");

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jpnTimKiemSach.setBackground(new java.awt.Color(204, 204, 204));
        jpnTimKiemSach.setForeground(new java.awt.Color(204, 204, 204));

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

        btnMoiSach.setBackground(new java.awt.Color(255, 255, 255));
        btnMoiSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMoiSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/new.png"))); // NOI18N
        btnMoiSach.setText("Mới");
        btnMoiSach.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMoiSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiSachActionPerformed(evt);
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

        btnTrangChuSach.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangChuSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTrangChuSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/real-estate.png"))); // NOI18N
        btnTrangChuSach.setText("Trang Chủ");
        btnTrangChuSach.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTrangChuSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTimKiemSachLayout = new javax.swing.GroupLayout(jpnTimKiemSach);
        jpnTimKiemSach.setLayout(jpnTimKiemSachLayout);
        jpnTimKiemSachLayout.setHorizontalGroup(
            jpnTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTimKiemSachLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTrangChuSach, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTimKiemSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimKiemSach)
                .addGap(50, 50, 50)
                .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnMoiSach, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jpnTimKiemSachLayout.setVerticalGroup(
            jpnTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemSachLayout.createSequentialGroup()
                .addComponent(btnTrangChuSach, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jpnTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemSach)
                    .addComponent(btnMoiSach, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tìm Kiếm Sách", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search.png")), jpnTimKiemSach); // NOI18N

        jpnTimKiemMuonTra.setBackground(new java.awt.Color(204, 204, 204));

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

        tbTimKiemMuonTra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbTimKiemMuonTra);

        btnTrangChuMuonTra.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangChuMuonTra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTrangChuMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/real-estate.png"))); // NOI18N
        btnTrangChuMuonTra.setText("Trang Chủ");
        btnTrangChuMuonTra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTrangChuMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuMuonTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTimKiemMuonTraLayout = new javax.swing.GroupLayout(jpnTimKiemMuonTra);
        jpnTimKiemMuonTra.setLayout(jpnTimKiemMuonTraLayout);
        jpnTimKiemMuonTraLayout.setHorizontalGroup(
            jpnTimKiemMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
            .addGroup(jpnTimKiemMuonTraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTrangChuMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpnTimKiemMuonTraLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(btnTimKiemMuonTra)
                .addGap(50, 50, 50)
                .addComponent(txtTimKiemMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnMoiMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTimKiemMuonTraLayout.setVerticalGroup(
            jpnTimKiemMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemMuonTraLayout.createSequentialGroup()
                .addComponent(btnTrangChuMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jpnTimKiemMuonTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemMuonTra)
                    .addComponent(btnMoiMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tìm Kiếm Mượn Trả", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/update.png")), jpnTimKiemMuonTra); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTimKiemDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTimKiemDocGia.setText("Điền mã Đọc Giả");

        btnTimKiemDocGIa.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiemDocGIa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTimKiemDocGIa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/search.png"))); // NOI18N
        btnTimKiemDocGIa.setText("Tìm Kiếm");
        btnTimKiemDocGIa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTimKiemDocGIa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemDocGIaActionPerformed(evt);
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

        tbTimKiemDocGia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbTimKiemDocGia);

        btnTrangChuDocGia.setBackground(new java.awt.Color(255, 255, 255));
        btnTrangChuDocGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTrangChuDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/real-estate.png"))); // NOI18N
        btnTrangChuDocGia.setText("Trang Chủ");
        btnTrangChuDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTrangChuDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuDocGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTrangChuDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnTimKiemDocGIa)
                .addGap(50, 50, 50)
                .addComponent(txtTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnMoiDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnTrangChuDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoiDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiemDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemDocGIa))
                .addGap(0, 412, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 173, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Tìm Kiếm Đọc Giả", new javax.swing.ImageIcon(getClass().getResource("/qltv/image/student (1).png")), jPanel1); // NOI18N

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

    private void btnTrangChuDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuDocGiaActionPerformed
        TrangChu aChu=new TrangChu();
        aChu.setVisible(true);
        aChu.setResizable(false);
        aChu.setLocationRelativeTo(null);
        aChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuDocGiaActionPerformed

    private void btnTrangChuMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuMuonTraActionPerformed
        TrangChu aChu=new TrangChu();
        aChu.setVisible(true);
        aChu.setResizable(false);
        aChu.setLocationRelativeTo(null);
        aChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuMuonTraActionPerformed

    private void btnTrangChuSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuSachActionPerformed
        TrangChu aChu=new TrangChu();
        aChu.setVisible(true);
        aChu.setResizable(false);
        aChu.setLocationRelativeTo(null);
        aChu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrangChuSachActionPerformed

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

    private void btnTimKiemDocGIaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemDocGIaActionPerformed
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
            tbTimKiemDocGia.setModel(aDocgia);
        });
        arrayList.removeAll(arrayList);
    }//GEN-LAST:event_btnTimKiemDocGIaActionPerformed

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
            tbTimKiemMuonTra.setModel(aMuonTra);
        });
        bArrayList.removeAll(bArrayList);
    }//GEN-LAST:event_btnTimKiemMuonTraActionPerformed

    private void btnMoiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiSachActionPerformed
        txtTimKiemSach.setText("");
        aSach.remove();
        initSach();
    }//GEN-LAST:event_btnMoiSachActionPerformed

    private void btnMoiMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiMuonTraActionPerformed
        txtTimKiemMuonTra.setText("");
        aMuonTra.remove();
        initMuonTra();
    }//GEN-LAST:event_btnMoiMuonTraActionPerformed

    private void btnMoiDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiDocGiaActionPerformed
        txtTimKiemDocGia.setText("");
        aDocgia.remove();
        initDocGia();
    }//GEN-LAST:event_btnMoiDocGiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoiDocGia;
    private javax.swing.JButton btnMoiMuonTra;
    private javax.swing.JButton btnMoiSach;
    private javax.swing.JButton btnTimKiemDocGIa;
    private javax.swing.JButton btnTimKiemMuonTra;
    private javax.swing.JButton btnTimKiemSach;
    private javax.swing.JButton btnTrangChuDocGia;
    private javax.swing.JButton btnTrangChuMuonTra;
    private javax.swing.JButton btnTrangChuSach;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnTimKiemMuonTra;
    private javax.swing.JPanel jpnTimKiemSach;
    private javax.swing.JTable tbSach;
    private javax.swing.JTable tbTimKiemDocGia;
    private javax.swing.JTable tbTimKiemMuonTra;
    private javax.swing.JTextField txtTimKiemDocGia;
    private javax.swing.JTextField txtTimKiemMuonTra;
    private javax.swing.JTextField txtTimKiemSach;
    // End of variables declaration//GEN-END:variables
}
