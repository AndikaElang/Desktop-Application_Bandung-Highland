/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitycenter;

/**
 *
 * @author andik
 */
public class Laporan extends javax.swing.JFrame {

    /**
     * Creates new form Laporan
     */
    
    int i;
    String n;
    String e;
    
    public Laporan() {
        initComponents();
    }
    
    public Laporan(int id, String nama, String email) {
        initComponents();
        
        i = id;
        n = nama;
        e = email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonLaporanPB = new javax.swing.JButton();
        buttonLaporanPA = new javax.swing.JButton();
        buttonLaporanPV = new javax.swing.JButton();
        buttonLaporanPT = new javax.swing.JButton();
        buttonLaporanBCS = new javax.swing.JButton();
        buttonBeli = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COMMUNITY CENTER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Laporan");

        buttonLaporanPB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonLaporanPB.setText("Pinjam Buku");
        buttonLaporanPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanPBActionPerformed(evt);
            }
        });

        buttonLaporanPA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonLaporanPA.setText("Pinjam Audio");
        buttonLaporanPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanPAActionPerformed(evt);
            }
        });

        buttonLaporanPV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonLaporanPV.setText("Pinjam Video");
        buttonLaporanPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanPVActionPerformed(evt);
            }
        });

        buttonLaporanPT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonLaporanPT.setText("Pinjam Toy");
        buttonLaporanPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanPTActionPerformed(evt);
            }
        });

        buttonLaporanBCS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonLaporanBCS.setText("Booking Coworking Space");
        buttonLaporanBCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanBCSActionPerformed(evt);
            }
        });

        buttonBeli.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonBeli.setText("Pembelian");
        buttonBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBeliActionPerformed(evt);
            }
        });

        buttonKembali.setText("Kembali");
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonKembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buttonLaporanPB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonBeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLaporanBCS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLaporanPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLaporanPV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLaporanPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(buttonLaporanPB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLaporanPA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLaporanPV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLaporanPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLaporanBCS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBeli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(buttonKembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLaporanPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanPTActionPerformed
        // TODO add your handling code here:
        new LaporanPinjamToy(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonLaporanPTActionPerformed

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        // TODO add your handling code here:
        new Menu(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void buttonLaporanPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanPBActionPerformed
        // TODO add your handling code here:
        new LaporanPinjamBuku(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonLaporanPBActionPerformed

    private void buttonLaporanPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanPAActionPerformed
        // TODO add your handling code here:
        new LaporanPinjamAudio(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonLaporanPAActionPerformed

    private void buttonLaporanPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanPVActionPerformed
        // TODO add your handling code here:
        new LaporanPinjamVideo(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonLaporanPVActionPerformed

    private void buttonLaporanBCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanBCSActionPerformed
        // TODO add your handling code here:
        new LaporanBookingCS(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonLaporanBCSActionPerformed

    private void buttonBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBeliActionPerformed
        // TODO add your handling code here:
        new LaporanBeli(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonBeliActionPerformed

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
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBeli;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonLaporanBCS;
    private javax.swing.JButton buttonLaporanPA;
    private javax.swing.JButton buttonLaporanPB;
    private javax.swing.JButton buttonLaporanPT;
    private javax.swing.JButton buttonLaporanPV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
