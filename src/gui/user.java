/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kontrol.kontrolUser;

/**
 *
 * @author Lenovo
 */
public class user extends javax.swing.JInternalFrame {
    kontrolUser u;
    String iduser,username,password,namauser,idlevel;
    ResultSet rs;       
    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        u = new kontrolUser();
        tampildata();
        setobjek(false);
        txtidlevel.setEnabled(false);
        baru.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
        try {
            ResultSet rs = u.setcombobox();
            while (rs.next()) {
            cblevel.addItem(rs.getString("id_level"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtiduser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnamauser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbuser = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        baru = new javax.swing.JButton();
        update = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        cblevel = new javax.swing.JComboBox();
        canceledit = new javax.swing.JButton();
        txtidlevel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtiduser1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtusername1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpassword1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtnamauser1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbuser1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        simpan1 = new javax.swing.JButton();
        hapus1 = new javax.swing.JButton();
        baru1 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        edit1 = new javax.swing.JButton();
        cbstatus1 = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Edit Pengguna");

        jPanel1.setBackground(new java.awt.Color(17, 17, 16));

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID User          :");

        txtiduser.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username      :");

        txtusername.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password       :");

        txtpassword.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama User     :");

        txtnamauser.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Level         :");

        tbuser.setBackground(new java.awt.Color(204, 204, 204));
        tbuser.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        tbuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID User", "Username", "Password", "Nama User", "ID Level"
            }
        ));
        tbuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbuserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbuser);

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Daftar Pengguna");

        simpan.setBackground(new java.awt.Color(195, 57, 15));
        simpan.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(195, 57, 15));
        hapus.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        baru.setBackground(new java.awt.Color(195, 57, 15));
        baru.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        baru.setForeground(new java.awt.Color(255, 255, 255));
        baru.setText("Baru");
        baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(195, 57, 15));
        update.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(195, 57, 15));
        edit.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        cblevel.setBackground(new java.awt.Color(195, 57, 15));
        cblevel.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        cblevel.setForeground(new java.awt.Color(255, 255, 255));
        cblevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih ID Level" }));
        cblevel.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cblevelPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cblevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblevelActionPerformed(evt);
            }
        });

        canceledit.setBackground(new java.awt.Color(195, 57, 15));
        canceledit.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        canceledit.setForeground(new java.awt.Color(255, 255, 255));
        canceledit.setText("Cancel Edit");
        canceledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceleditActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Masukkan data pengguna");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtiduser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                            .addComponent(txtnamauser)
                                            .addComponent(txtpassword)
                                            .addComponent(txtusername)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtidlevel)
                                                .addComponent(cblevel, 0, 128, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(canceledit)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(baru)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(update)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(simpan)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(hapus))))))))
                            .addComponent(jLabel7))
                        .addGap(0, 187, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnamauser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cblevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtidlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(hapus)
                    .addComponent(baru)
                    .addComponent(update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canceledit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jInternalFrame1.setClosable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("USER");

        jLabel9.setText("ID User          :");

        jLabel10.setText("Username      :");

        jLabel11.setText("Password       :");

        jLabel12.setText("Nama User     :");

        jLabel13.setText("ID Level         :");

        tbuser1.setBackground(new java.awt.Color(204, 204, 204));
        tbuser1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID User", "Username", "Password", "Nama User", "ID Level"
            }
        ));
        tbuser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbuser1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbuser1);

        jLabel14.setText("| List User");

        simpan1.setText("Simpan");
        simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan1ActionPerformed(evt);
            }
        });

        hapus1.setText("Hapus");
        hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus1ActionPerformed(evt);
            }
        });

        baru1.setText("Baru");
        baru1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baru1ActionPerformed(evt);
            }
        });

        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        edit1.setText("Edit");
        edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit1ActionPerformed(evt);
            }
        });

        cbstatus1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Level Pengguna", "Administrator", "Waiter", "Kasir", "Owner", "Pelanggan" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(baru1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(update1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(simpan1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hapus1))
                                            .addComponent(txtiduser1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtnamauser1)
                                            .addComponent(txtpassword1)
                                            .addComponent(txtusername1)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtiduser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtusername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtnamauser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan1)
                    .addComponent(hapus1)
                    .addComponent(baru1)
                    .addComponent(update1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 286, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 286, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 292, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 293, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        simpandata();
        baru.setEnabled(true);
        simpan.setEnabled(true);
        hapus.setEnabled(false);
        update.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_simpanActionPerformed

    private void tbuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbuserMouseClicked
        // TODO add your handling code here:
        setformtable();
        baru.setEnabled(true);
        edit.setEnabled(true);
        hapus.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_tbuserMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        hapusdata();
        baru.setEnabled(true);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        update.setEnabled(false);
        edit.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_hapusActionPerformed

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
        // TODO add your handling code here:
        baru();
        setobjek(true);
        txtiduser.requestFocus();
        simpan.setEnabled(true);
        update.setEnabled(false);
        edit.setEnabled(false);
        hapus.setEnabled(false);
        update.setEnabled(false);
        canceledit.setVisible(false);
    }//GEN-LAST:event_baruActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        updatedata();
        update.setEnabled(true);
        edit.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        baru.setEnabled(true);
        canceledit.setVisible(false);
    }//GEN-LAST:event_updateActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        setobjek(true);
        edit.setVisible(true);
        update.setEnabled(true);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        baru.setEnabled(false);
        canceledit.setVisible(true);
    }//GEN-LAST:event_editActionPerformed

    private void tbuser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbuser1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbuser1MouseClicked

    private void simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpan1ActionPerformed

    private void hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapus1ActionPerformed

    private void baru1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baru1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baru1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update1ActionPerformed

    private void edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit1ActionPerformed

    private void cblevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblevelActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_cblevelActionPerformed

    private void canceleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceleditActionPerformed
        // TODO add your handling code here:
        baru();
        baru.setEnabled(true);
        update.setEnabled(false);
        simpan.setEnabled(false);
        hapus.setEnabled(false);
        edit.setEnabled(false);
    }//GEN-LAST:event_canceleditActionPerformed

    private void cblevelPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cblevelPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        carilevel();
    }//GEN-LAST:event_cblevelPopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baru;
    private javax.swing.JButton baru1;
    private javax.swing.JButton canceledit;
    private javax.swing.JComboBox cblevel;
    private javax.swing.JComboBox cbstatus1;
    private javax.swing.JButton edit;
    private javax.swing.JButton edit1;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hapus1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton simpan;
    private javax.swing.JButton simpan1;
    private javax.swing.JTable tbuser;
    private javax.swing.JTable tbuser1;
    private javax.swing.JTextField txtidlevel;
    private javax.swing.JTextField txtiduser;
    private javax.swing.JTextField txtiduser1;
    private javax.swing.JTextField txtnamauser;
    private javax.swing.JTextField txtnamauser1;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtpassword1;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtusername1;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    // End of variables declaration//GEN-END:variables
private void simpandata() {
        iduser = txtiduser.getText();
        username = txtusername.getText();
        password = txtpassword.getText();
        namauser = txtnamauser.getText();
        idlevel = (String) cblevel.getSelectedItem();
        
        if (txtiduser.getText().isEmpty() || txtusername.getText().isEmpty() || txtpassword.getText().isEmpty() || txtnamauser.getText().isEmpty() || cblevel.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane,"Silahkan isi data terlebih dahulu !","Informasi",JOptionPane.INFORMATION_MESSAGE);
        } else {
            u.simpandata(iduser, username, password, namauser, idlevel);
            JOptionPane.showMessageDialog(rootPane,"Data berhasil disimpan","Informasi",JOptionPane.INFORMATION_MESSAGE);
            tampildata();
            baru();
            setobjek(false);
        }
        
       
}

private void tampildata () {
    DefaultTableModel dtm = (DefaultTableModel) tbuser.getModel();
    dtm.setRowCount(0);
    u.tampildata(dtm);
    tbuser.setModel(dtm);
}

private void setformtable() {
     txtiduser.setText(tbuser.getValueAt(tbuser.getSelectedRow(), 0).toString());
     txtusername.setText(tbuser.getValueAt(tbuser.getSelectedRow(), 1).toString());
     txtpassword.setText(tbuser.getValueAt(tbuser.getSelectedRow(), 2).toString());
     txtnamauser.setText(tbuser.getValueAt(tbuser.getSelectedRow(), 3).toString());
        try {
            
            ResultSet rs = u.carilevel(tbuser.getValueAt(tbuser.getSelectedRow(), 4).toString());
            while(rs.next()){
                cblevel.setSelectedItem(rs.getString("id_level"));
                txtidlevel.setText(rs.getString("nama_level"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
}

private void hapusdata() {
    iduser = txtiduser.getText();
    
    int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan menghapus data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
    if (conf == 0) {
        u.hapusdata(iduser);
    JOptionPane.showMessageDialog(rootPane,"Data berhasil dihapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
    tampildata();
        baru();
        setobjek(false);
    }
    
} 

private void updatedata() {
        iduser = txtiduser.getText();
        username = txtusername.getText();
        password = txtpassword.getText();
        namauser = txtnamauser.getText();
        idlevel = (String) cblevel.getSelectedItem();
        
        int conf = JOptionPane.showConfirmDialog(rootPane,"Apakah anda yakin akan mengubah data ini ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
            u.updatedata(iduser, username, password, namauser, idlevel);
            tampildata();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diubah","Informasi",JOptionPane.INFORMATION_MESSAGE);
            baru();
            setobjek(false);
        }
    }

private void baru() {
    txtiduser.setText(null);
    txtusername.setText(null);
    txtpassword.setText(null);
    txtnamauser.setText(null);
    cblevel.setSelectedIndex(0);
    txtidlevel.setText(null);
}

private void setobjek(boolean b) {
    txtiduser.setEnabled(b);
    txtusername.setEnabled(b);
    txtpassword.setEnabled(b);
    txtnamauser.setEnabled(b);
    cblevel.setEnabled(b);

}

private void carilevel () {
     try {
            String level = txtidlevel.getText();
            ResultSet rs = u.carilevel(cblevel.getSelectedItem().toString());
            while (rs.next()) {
                txtidlevel.setText(rs.getString("nama_level"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
}     
    



}











