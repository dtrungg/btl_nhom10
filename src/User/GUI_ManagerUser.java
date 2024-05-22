package User;

import DBEngine.*;
import Menu.GUI_Menu;
import java.awt.Color;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;


public class GUI_ManagerUser extends javax.swing.JFrame {
    String fileName = "user.txt";
    String fName = "User.xlsx";
    DBEngine db = new DBEngine();
    ExportFileExcel ex = new ExportFileExcel();
    User us = new User();
    ArrayList<User> listUser = new ArrayList<>();
    
    public void loadData(){
        try {
            listUser = (ArrayList<User>) db.readFile(fileName);
        } catch (Exception err) {
            System.out.println(err.toString());
        }
    }
    
    public void loadTable(ArrayList<User> listUser){
        tableUser.setModel(new TableUser(listUser));
    }
    
    /**
     * Creates new form GUI_ManagerUser
     */
    public GUI_ManagerUser() {
        initComponents();
        getContentPane().setBackground(new Color(242,242,242));
        setTitle("Manager User");
        loadData();
        loadTable(listUser);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxSearch = new javax.swing.JComboBox<>();
        search = new javax.swing.JTextField();
        btnSearh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        maNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hoTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ngaySinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        queQuan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mk = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        chucVu = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        backMenu = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/UserLogo.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ NGƯỜI DÙNG");

        cbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm theo tên", "Tìm theo mã nhân viên" }));
        cbxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSearchActionPerformed(evt);
            }
        });

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        btnSearh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.jpg"))); // NOI18N
        btnSearh.setText("Search");
        btnSearh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearhActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã nhân viên: ");

        jLabel3.setText("Họ tên: ");

        jLabel4.setText("Số điện thoại:");

        jLabel5.setText("Ngày sinh");

        ngaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaySinhActionPerformed(evt);
            }
        });

        jLabel6.setText("Quê quán: ");

        jLabel7.setText("Tài khoản:");

        jLabel8.setText("Mật khẩu:");

        jLabel9.setText("Chức vụ:");

        tableUser.setAutoCreateRowSorter(true);
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
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
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setText("Xoá");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        chucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));
        chucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chucVuActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        backMenu.setText("Về màn hình chính");
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExport.setText("Xuất Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(backMenu))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSearh))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(maNV, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                        .addComponent(sdt)
                                        .addComponent(tk))
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(mk))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(22, 22, 22)
                                            .addComponent(hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ngaySinh)))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(queQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDel)
                    .addComponent(backMenu)
                    .addComponent(btnReset)
                    .addComponent(btnExport))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSearchActionPerformed

    private void ngaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngaySinhActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String userCode = maNV.getText();
        String userName = hoTen.getText();
        String phoneNumber = sdt.getText();
        String dateBirth = ngaySinh.getText();
        String address = queQuan.getText();
        String account = tk.getText();
        String password = mk.getText();
        String role = chucVu.getSelectedItem().toString();

        User user = new User(userCode, userName, phoneNumber, dateBirth, address, account, password, role);
        try {
            if(userCode.equals("") || userName.equals("") || phoneNumber.equals("") || dateBirth.equals("") || address.equals("") || account.equals("") || password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                if(listUser.contains(user)){
                    System.out.println("err");
                    JOptionPane.showMessageDialog(null, "Mã nhân viên đã tồn tại!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    for(User o: listUser) {
                        if(o.getTaiKhoan().equals(user.getTaiKhoan())){
                            JOptionPane.showMessageDialog(null, "Tài khoản đã tồn tại!", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        } else {
                            listUser.add(user);
                            db.saveFile(fileName, listUser);
                            loadTable(listUser);
                            JOptionPane.showMessageDialog(null, "Thêm tài khoản thành công!");
                            break;
                        }
                    }
                    maNV.setText("");
                    maNV.setText("");
                    hoTen.setText("");
                    sdt.setText("");
                    tk.setText("");
                    mk.setText("");
                    queQuan.setText("");
                    ngaySinh.setText("");
                    search.setText("");
                }
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void chucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chucVuActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int del = tableUser.getSelectedRow();
        try {
            if(del == -1) {
                JOptionPane.showMessageDialog(this, " Chọn tài khoản cần xoá","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this,"Xác nhận xoá","Xác nhận",JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION) {
                    listUser.remove(del);
                    db.saveFile(fileName, listUser);
                    loadTable(listUser);
                    JOptionPane.showMessageDialog(this, "Xoá thành công!","Information",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    maNV.setEnabled(true);
                    maNV.setText("");
                    hoTen.setText("");
                    sdt.setText("");
                    tk.setText("");
                    mk.setText("");
                    queQuan.setText("");
                    ngaySinh.setText("");
                }
            }            
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(err.toString());
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int update = tableUser.getSelectedRow();
        try {
            if(update == -1) {
                JOptionPane.showMessageDialog(this, " Chọn tài khoản cần Cập nhật","Error",JOptionPane.ERROR_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this,"Xác nhận cập nhật tài khoản","Xác nhận",JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                    us = listUser.get(update);
                    us.setHoTen(hoTen.getText());
                    us.setSoDienThoai(sdt.getText());
                    us.setNgaySinh(ngaySinh.getText());
                    us.setQueQuan(queQuan.getText());
                    us.setTaiKhoan(tk.getText());
                    us.setMatKhau(mk.getText());
                    us.setChucVu(chucVu.getSelectedItem().toString());
                    listUser.set(update, us);
                    db.saveFile(fileName, listUser);
                    loadTable(listUser);
                    JOptionPane.showMessageDialog(this, "Cập nhật tài thông tin thành công!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    maNV.setEnabled(true);
                    maNV.setText("");
                    hoTen.setText("");
                    sdt.setText("");
                    tk.setEnabled(true);
                    mk.setText("");
                    queQuan.setText("");
                    ngaySinh.setText("");
                }
            }
            
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            //System.out.println(err.toString());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        GUI_Menu gui = new GUI_Menu();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        GUI_ManagerUser.this.dispose();
    }//GEN-LAST:event_backMenuActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        int selected = tableUser.getSelectedRow();
        maNV.setEnabled(false);
        tk.setEnabled(false);
        if(selected != -1) {
            us = listUser.get(selected);
            maNV.setText(us.getMaNV());
            hoTen.setText(us.getHoTen());
            sdt.setText(us.getSoDienThoai());
            ngaySinh.setText(us.getNgaySinh());
            tk.setText(us.getTaiKhoan());
            mk.setText(us.getMatKhau());
            queQuan.setText(us.getQueQuan());
            chucVu.setSelectedItem(us.getChucVu());
        }
    }//GEN-LAST:event_tableUserMouseClicked

    private void btnSearhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearhActionPerformed
        String typeSearch = cbxSearch.getSelectedItem().toString();
        String src = search.getText();
        ArrayList<User> searchTable = new ArrayList<>();
        if(src.equals("")){
            JOptionPane.showMessageDialog(this, "Nội dung nhập không được để trống","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            if(typeSearch.equals("Tìm theo tên")){
                for(User o: listUser) {
                    if(src.toLowerCase().equals(o.getHoTen().toLowerCase().trim())){
                        searchTable.add(o);
                    }
                }
            } else {
                for(User u: listUser) {
                    if(src.toLowerCase().equals(u.getMaNV().toLowerCase().trim())){
                        searchTable.add(u);
                    }
                }
            }
            loadTable(searchTable);
        }
    }//GEN-LAST:event_btnSearhActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        maNV.setEnabled(true);
        maNV.setText("");
        hoTen.setText("");
        sdt.setText("");
        tk.setText("");
        tk.setEnabled(true);
        mk.setText("");
        queQuan.setText("");
        ngaySinh.setText("");
        search.setText("");
        loadTable(listUser);
    }//GEN-LAST:event_btnResetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    Workbook workbook = new XSSFWorkbook(); // tạo mới đối tượng đại diện cho excel.
    Sheet sheet = (Sheet) workbook.createSheet(fName); // tạo 1 đối tượng sheet, đại diện cho sheet bên trong file Excel
    private void exportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportExcelActionPerformed
        try {
            ex.ExportFileExcel(tableUser, fName);
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(null, ex.toString());
        }
    }//GEN-LAST:event_exportExcelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ManagerUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ManagerUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backMenu;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxSearch;
    private javax.swing.JComboBox<String> chucVu;
    private javax.swing.JTextField hoTen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maNV;
    private javax.swing.JTextField mk;
    private javax.swing.JTextField ngaySinh;
    private javax.swing.JTextField queQuan;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField search;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField tk;
    // End of variables declaration//GEN-END:variables
}