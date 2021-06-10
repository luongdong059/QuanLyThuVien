package qltv.view;

import qltv.dao.Connection_db;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DangNhapJFrame extends javax.swing.JFrame {
    Connection_db con;
    public DangNhapJFrame() {
        initComponents();
        con= new Connection_db();
        con.getConnectiontoMSSQL();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtnDangNhap = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jrbtnNhanVien = new javax.swing.JRadioButton();
        jrbtnSinhVien = new javax.swing.JRadioButton();
        btnThoat = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/login (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/login.png"))); // NOI18N
        jLabel2.setText("ĐĂNG NHẬP");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/user.png"))); // NOI18N
        jLabel3.setText("Tên Đăng Nhập");

        txtTenDN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenDN.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/password.png"))); // NOI18N
        jLabel4.setText("Mật Khẩu");

        jbtnDangNhap.setBackground(new java.awt.Color(51, 51, 255));
        jbtnDangNhap.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDangNhap.setText("ĐĂNG NHẬP");
        jbtnDangNhap.setBorder(null);
        jbtnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhap(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ĐĂNG KÍ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKy(evt);
            }
        });

        jrbtnNhanVien.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(jrbtnNhanVien);
        jrbtnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jrbtnNhanVien.setText("NHÂN VIÊN");
        jrbtnNhanVien.setBorder(null);

        jrbtnSinhVien.setBackground(new java.awt.Color(0, 204, 255));
        buttonGroup1.add(jrbtnSinhVien);
        jrbtnSinhVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jrbtnSinhVien.setText("SINH VIÊN");

        btnThoat.setBackground(new java.awt.Color(255, 51, 51));
        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMatKhau.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTenDN)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbtnNhanVien)
                        .addGap(18, 18, 18)
                        .addComponent(jrbtnSinhVien)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtnNhanVien)
                    .addComponent(jrbtnSinhVien))
                .addGap(31, 31, 31)
                .addComponent(jbtnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKy
        DangKy aDangKy=new DangKy();
        aDangKy.setVisible(true);
        aDangKy.setResizable(false);
        aDangKy.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnDangKy

    private void btnDangNhap(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhap
        Statement stml;
        if (txtMatKhau.getText().equals("") || txtTenDN.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Cần nhập đầy đủ thông tin !");
        } else if (jrbtnNhanVien.isSelected() == false && jrbtnSinhVien.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn chức vụ");
        } else{
            try {
                int kiemtra=0;
                        con.getConnectiontoMSSQL();
                        String sql = "SELECT * FROM DOCGIA";
                        ResultSet rsReultSet = con.exCuteQuery(sql);
                        String sqlNhanVien = "SELECT * FROM THUTHU";
                        ResultSet rsNhanVien = con.exCuteQuery(sqlNhanVien);
                        String user = txtTenDN.getText().toLowerCase();
                        String pass = txtMatKhau.getText().toLowerCase();
                        if (jrbtnSinhVien.isSelected()==true) {
                            while (rsReultSet.next()) {                        
                                String madg = rsReultSet.getString("MADG").trim().toLowerCase();
                                String mkdocgia = rsReultSet.getString("MATKHAU").trim().toLowerCase();
                                if (madg.equals(user) && mkdocgia.equals(pass)) {
                                    kiemtra++;
                                    DocGia dg=new DocGia();
                                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                                    this.setVisible(false);
                                    dg.setVisible(true);
                                    dg.setResizable(false);
                                    dg.setLocationRelativeTo(null);
                                }
                            }
                        }
                        if (jrbtnNhanVien.isSelected() == true) {
                            while (rsNhanVien.next()) {
                                String maTT = rsNhanVien.getString("MATT").trim().toLowerCase();
                                String matKhau = rsNhanVien.getString("MATKHAU").trim().toLowerCase();
                                if (maTT.equals(user) && matKhau.equals(pass)) {
                                    kiemtra++;
                                    TrangChu aChu = new TrangChu();
                                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                                    this.setVisible(false);     
                                    aChu.setVisible(true);
                                    aChu.setResizable(false);
                                    aChu.setLocationRelativeTo(null);
                                }
                            }
                        }
                        if (kiemtra==0) {
                            JOptionPane.showMessageDialog(this, "Tên tài khoản, hoặc mật khẩu không hợp lệ!");
                        }
                        txtMatKhau.setText("");
                        txtTenDN.setText("");
                        con.close();
                    }
                catch (SQLException ex) {
                   Logger.getLogger(DangNhapJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
    }//GEN-LAST:event_btnDangNhap

    private void btnThoat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat
        this.setVisible(false);
    }//GEN-LAST:event_btnThoat
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnDangNhap;
    private javax.swing.JRadioButton jrbtnNhanVien;
    private javax.swing.JRadioButton jrbtnSinhVien;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables
}
