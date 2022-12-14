/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitycenter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author andik
 */
public class ManageBuku extends javax.swing.JFrame {

    /**
     * Creates new form ManageBuku
     */
    
    String img_path = null;
    int i;
    String n;
    String e;
    
    public ManageBuku() {
        initComponents();
    }
    
    public ManageBuku(int id, String nama, String email) {
        initComponents();
        DisplayBuku();
        DisplayPengarang();
        DisplayPenerbit();
        
        i = id;
        n = nama;
        e = email;
    }
    
    private void DisplayBuku() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
            String querry = "SELECT b.id_buku, b.judul, g.nama_pengarang, t.nama_penerbit, b.tahun_rilis, b.status "
                    + " FROM buku b "
                    + " JOIN pengarang g USING(id_pengarang) "
                    + " JOIN penerbit t USING(id_penerbit);";
            PreparedStatement pstmt = conn.prepareStatement(querry);
            ResultSet rs = pstmt.executeQuery();
            tableBuku.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal.\n" + e);
        }
    }
    
    private void DisplayPengarang() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
            String querry = "SELECT * FROM pengarang WHERE status=1";
            PreparedStatement pstmt = conn.prepareStatement(querry);
            ResultSet rs = pstmt.executeQuery();
            tablePengarang.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal.\n" + e);
        }
    }
    
    private void DisplayPenerbit() {
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
            String querry = "SELECT * FROM penerbit WHERE status=1";
            PreparedStatement pstmt = conn.prepareStatement(querry);
            ResultSet rs = pstmt.executeQuery();
            tablePenerbit.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal.\n" + e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldJudul = new javax.swing.JTextField();
        fieldTahunRilis = new javax.swing.JTextField();
        fieldHalaman = new javax.swing.JTextField();
        fieldISBN = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDeskripsi = new javax.swing.JTextArea();
        fieldSampulDepan = new javax.swing.JTextField();
        buttonBrowseSD = new javax.swing.JButton();
        comboBoxBentuk = new javax.swing.JComboBox<>();
        buttonTambah = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePengarang = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePenerbit = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        fieldIDPengarang = new javax.swing.JTextField();
        fieldIDPenerbit = new javax.swing.JTextField();
        buttonUpdate = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        fieldIDBuku = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COMMUNITY CENTER");

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul", "Pengarang", "Penerbit", "Tahun Terbit", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBuku);
        if (tableBuku.getColumnModel().getColumnCount() > 0) {
            tableBuku.getColumnModel().getColumn(2).setHeaderValue("Penerbit");
            tableBuku.getColumnModel().getColumn(3).setHeaderValue("Tahun Terbit");
            tableBuku.getColumnModel().getColumn(4).setHeaderValue("Status");
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("List Buku");

        jLabel3.setText("Judul");

        jLabel4.setText("ID Pengarang");

        jLabel5.setText("ID Penerbit");

        jLabel6.setText("Tahun Rilis");

        jLabel7.setText("Halaman");

        jLabel8.setText("ISBN");

        jLabel9.setText("Deskripsi");

        jLabel10.setText("Sampul");

        jLabel12.setText("Bentuk");

        areaDeskripsi.setColumns(20);
        areaDeskripsi.setRows(5);
        jScrollPane2.setViewportView(areaDeskripsi);

        buttonBrowseSD.setText("Browse");
        buttonBrowseSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBrowseSDActionPerformed(evt);
            }
        });

        comboBoxBentuk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Fisik", " E-Book" }));
        comboBoxBentuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBentukActionPerformed(evt);
            }
        });

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonKembali.setText("Kembali");
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Manage Buku");

        tablePengarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Pengarang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablePengarang);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("List Pengarang");

        tablePenerbit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Penerbit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablePenerbit);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("List Penerbit");

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        jLabel11.setText("ID Buku");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(buttonTambah)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(88, 88, 88)
                                    .addComponent(comboBoxBentuk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel5))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldTahunRilis, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldHalaman, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldISBN, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldJudul)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                                        .addComponent(fieldIDPengarang)
                                        .addComponent(fieldIDPenerbit)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(83, 83, 83)
                                    .addComponent(fieldSampulDepan, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                    .addComponent(buttonBrowseSD)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldIDBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(72, 72, 72)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fieldIDPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fieldIDPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fieldTahunRilis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fieldHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(fieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBrowseSD)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(fieldSampulDepan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(comboBoxBentuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buttonUpdate)
                                    .addComponent(buttonHapus)
                                    .addComponent(fieldIDBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonKembali))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        // TODO add your handling code here:
        new Buku(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal.\n" + e);
        }
        
        Statement insert;
        String judul = fieldJudul.getText();
        int idPengarang = Integer.parseInt(fieldIDPengarang.getText());
        int idPenerbit = Integer.parseInt(fieldIDPenerbit.getText());
        int tahunRilis = Integer.parseInt(fieldTahunRilis.getText());
        int halaman = Integer.parseInt(fieldHalaman.getText());
        String isbn = fieldISBN.getText();
        String deskripsi = areaDeskripsi.getText();
        String bentuk = comboBoxBentuk.getSelectedItem().toString();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
            PreparedStatement ps = conn.prepareStatement("INSERT INTO buku(id_pengarang,id_penerbit,judul,tahun_rilis,halaman,isbn,deskripsi,sampul,bentuk,kondisi,status)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            InputStream image = new FileInputStream(new File(img_path));
            ps.setInt(1, idPengarang);
            ps.setInt(2, idPenerbit);
            ps.setString(3, judul);
            ps.setInt(4, tahunRilis);
            ps.setInt(5, halaman);
            ps.setString(6, isbn);
            ps.setString(7, deskripsi);
            ps.setBlob(8, image);
            ps.setString(9, bentuk);
            ps.setInt(10, 1);
            ps.setInt(11, 1);
            ps.executeUpdate();
            DisplayBuku();
            JOptionPane.showMessageDialog(null, "Data Ditambahkan!");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berhasil Ditambahkan.\n" + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonBrowseSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBrowseSDActionPerformed
        // TODO add your handling code here:
        String path = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*Images",".jpg",".png",".jpeg");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
        
        if(filestate == JFileChooser.APPROVE_OPTION) {
            File selectedImage = chooser.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            fieldSampulDepan.setText(path);
            img_path = path;
        }
    }//GEN-LAST:event_buttonBrowseSDActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal.\n" + e);
        }
        
        Statement insert;
        int id = Integer.parseInt(fieldIDBuku.getText());
        String judul = fieldJudul.getText();
        int idPengarang = Integer.parseInt(fieldIDPengarang.getText());
        int idPenerbit = Integer.parseInt(fieldIDPenerbit.getText());
        int tahunRilis = Integer.parseInt(fieldTahunRilis.getText());
        int halaman = Integer.parseInt(fieldHalaman.getText());
        String isbn = fieldISBN.getText();
        String deskripsi = areaDeskripsi.getText();
        String bentuk = comboBoxBentuk.getSelectedItem().toString();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
            PreparedStatement ps = conn.prepareStatement("UPDATE buku SET id_pengarang=?, id_penerbit=?, judul=?, tahun_rilis=?, "
                    + "halaman=?, isbn=?, deskripsi=?, sampul=?, bentuk=?, kondisi=?, status=? WHERE id_buku=?");
            InputStream image = new FileInputStream(new File(img_path));
            ps.setInt(1, idPengarang);
            ps.setInt(2, idPenerbit);
            ps.setString(3, judul);
            ps.setInt(4, tahunRilis);
            ps.setInt(5, halaman);
            ps.setString(6, isbn);
            ps.setString(7, deskripsi);
            ps.setBlob(8, image);
            ps.setString(9, bentuk);
            ps.setInt(10, 1);
            ps.setInt(11, 1);
            ps.setInt(12, id);
            ps.executeUpdate();
            DisplayBuku();
            JOptionPane.showMessageDialog(null, "Data Diupdate!");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berhasil Diupdate.\n" + e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/community_center", "root", "");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal.\n" + e);
        }
        
        int id = Integer.parseInt(fieldIDBuku.getText());
        
        try {
            String sql1 = "UPDATE buku SET status=0 WHERE id_buku=?";
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, id);
            pst.executeUpdate();
            DisplayBuku();
            JOptionPane.showMessageDialog(null, "Data Buku Berhasil dihapus!");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke Database Gagal.\n" + e);
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void comboBoxBentukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBentukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBentukActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeskripsi;
    private javax.swing.JButton buttonBrowseSD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> comboBoxBentuk;
    private javax.swing.JTextField fieldHalaman;
    private javax.swing.JTextField fieldIDBuku;
    private javax.swing.JTextField fieldIDPenerbit;
    private javax.swing.JTextField fieldIDPengarang;
    private javax.swing.JTextField fieldISBN;
    private javax.swing.JTextField fieldJudul;
    private javax.swing.JTextField fieldSampulDepan;
    private javax.swing.JTextField fieldTahunRilis;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTable tablePenerbit;
    private javax.swing.JTable tablePengarang;
    // End of variables declaration//GEN-END:variables
}
