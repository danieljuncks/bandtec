package com.mycompany.projeto.cofrinho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Tela extends javax.swing.JFrame {

    Integer saldo01 = 0;
    Integer saldo02 = 0;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
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
        btnSacar01 = new javax.swing.JButton();
        btnDepositar01 = new javax.swing.JButton();
        lblSaldo01 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSacar02 = new javax.swing.JButton();
        btnDepositar02 = new javax.swing.JButton();
        lblSaldo02 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnQuebrar01 = new javax.swing.JButton();
        btnQuebra02 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Exo 2", 1, 14)); // NOI18N
        jLabel1.setText("Conta 01");

        jLabel2.setText("Saldo:");

        btnSacar01.setText("Sacar R$50");
        btnSacar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar01ActionPerformed(evt);
            }
        });

        btnDepositar01.setText("Depositar R$50");
        btnDepositar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar01ActionPerformed(evt);
            }
        });

        lblSaldo01.setText("0");

        jLabel3.setText("Saldo:");

        btnSacar02.setText("Sacar R$50");
        btnSacar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar02ActionPerformed(evt);
            }
        });

        btnDepositar02.setText("Depositar R$50");
        btnDepositar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositar02ActionPerformed(evt);
            }
        });

        lblSaldo02.setText("0");

        jLabel4.setFont(new java.awt.Font("Exo 2", 1, 14)); // NOI18N
        jLabel4.setText("Conta 02");

        btnQuebrar01.setText("quebrar cofre");
        btnQuebrar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuebrar01ActionPerformed(evt);
            }
        });

        btnQuebra02.setText("quebrar cofre");
        btnQuebra02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuebra02ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Essa tela não está usando o conceito de orientação a objeto.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSaldo02, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDepositar02)
                                .addGap(18, 18, 18)
                                .addComponent(btnSacar02)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuebra02, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDepositar01)
                                .addGap(18, 18, 18)
                                .addComponent(btnSacar01)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuebrar01, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSaldo01, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSaldo01))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSacar01)
                        .addComponent(btnQuebrar01))
                    .addComponent(btnDepositar01))
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSaldo02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSacar02)
                        .addComponent(btnQuebra02))
                    .addComponent(btnDepositar02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar01ActionPerformed
        saldo01 += 50;

        lblSaldo01.setText(saldo01.toString());
    }//GEN-LAST:event_btnDepositar01ActionPerformed

    private void btnSacar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar01ActionPerformed
        
        if ((saldo01 - 50) >= 0) {
            saldo01 -= 50;
        }
        
        lblSaldo01.setText(saldo01.toString());
    }//GEN-LAST:event_btnSacar01ActionPerformed

    private void btnSacar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar02ActionPerformed
            
        System.out.println();
        
        if ((saldo02 - 50) >= 0) {
            saldo02 -= 50;
        }

        lblSaldo02.setText(saldo02.toString());
    }//GEN-LAST:event_btnSacar02ActionPerformed

    private void btnDepositar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositar02ActionPerformed
        saldo02 += 50;

        lblSaldo02.setText(saldo02.toString());
    }//GEN-LAST:event_btnDepositar02ActionPerformed

    private void btnQuebrar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuebrar01ActionPerformed
        
        saldo01 = 0;
        
        lblSaldo01.setText(saldo01.toString());
        
    }//GEN-LAST:event_btnQuebrar01ActionPerformed

    private void btnQuebra02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuebra02ActionPerformed
        saldo02 = 0;
        
        lblSaldo02.setText(saldo02.toString());
    }//GEN-LAST:event_btnQuebra02ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar01;
    private javax.swing.JButton btnDepositar02;
    private javax.swing.JButton btnQuebra02;
    private javax.swing.JButton btnQuebrar01;
    private javax.swing.JButton btnSacar01;
    private javax.swing.JButton btnSacar02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblSaldo01;
    private javax.swing.JLabel lblSaldo02;
    // End of variables declaration//GEN-END:variables
}