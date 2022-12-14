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
public class Booking extends javax.swing.JFrame {

    /**
     * Creates new form Booking
     */
    
    int i;
    String n;
    String e;
    
    public Booking() {
        initComponents();
    }
    
    public Booking(int id, String nama, String email) {
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
        buttonBuku = new javax.swing.JButton();
        buttonAudio = new javax.swing.JButton();
        buttonToy = new javax.swing.JButton();
        buttonVideo = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        buttonCS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COMMUNITY CENTER");

        buttonBuku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonBuku.setText("Buku");
        buttonBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBukuActionPerformed(evt);
            }
        });

        buttonAudio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAudio.setText("Audio");
        buttonAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAudioActionPerformed(evt);
            }
        });

        buttonToy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonToy.setText("Toy");
        buttonToy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonToyActionPerformed(evt);
            }
        });

        buttonVideo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonVideo.setText("Video");
        buttonVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVideoActionPerformed(evt);
            }
        });

        buttonKembali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonKembali.setText("Kembali");
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        buttonCS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCS.setText("Coworking Space");
        buttonCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCSActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Booking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(180, 180, 180))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonVideo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(buttonBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonToy, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(buttonCS, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonToy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCS, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBukuActionPerformed
        // TODO add your handling code here:
        new BookingBuku(i, n, e).setVisible(true);

        dispose();
    }//GEN-LAST:event_buttonBukuActionPerformed

    private void buttonAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAudioActionPerformed
        // TODO add your handling code here:
        new BookingAudio(i, n, e).setVisible(true);

        dispose();
    }//GEN-LAST:event_buttonAudioActionPerformed

    private void buttonToyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonToyActionPerformed
        // TODO add your handling code here:
        new BookingToy(i, n, e).setVisible(true);

        dispose();
    }//GEN-LAST:event_buttonToyActionPerformed

    private void buttonVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVideoActionPerformed
        // TODO add your handling code here:
        new BookingVideo(i, n, e).setVisible(true);

        dispose();
    }//GEN-LAST:event_buttonVideoActionPerformed

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        // TODO add your handling code here:
        new Menu(i, n, e).setVisible(true);

        dispose();
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void buttonCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCSActionPerformed
        // TODO add your handling code here:
        new BookingCS(i, n, e).setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonCSActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAudio;
    private javax.swing.JButton buttonBuku;
    private javax.swing.JButton buttonCS;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonToy;
    private javax.swing.JButton buttonVideo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
