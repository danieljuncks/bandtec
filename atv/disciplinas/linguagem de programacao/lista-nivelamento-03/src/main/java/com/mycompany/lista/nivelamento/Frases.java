/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.nivelamento;

import java.awt.Color;
import javax.swing.SwingConstants;

/**
 *
 * @author diego
 */
public class Frases extends javax.swing.JFrame {
    
    String frasePositiva = "Nunca é tarde demais!";
    String fraseNegativa = "Só dará errado se você tentar”";
    String fraseVerdade = "O professor Yoshi é parecido com o ex-jogador Caio Ribeiro!";

    /**
     * Creates new form Frases
     */
    public Frases() {
        initComponents();
        
        lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
        
        getContentPane().setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPositiva = new javax.swing.JButton();
        btnNegativa = new javax.swing.JButton();
        btnVerdade = new javax.swing.JButton();
        lblFrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPositiva.setBackground(new java.awt.Color(67, 197, 109));
        btnPositiva.setFont(new java.awt.Font("Exo 2", 1, 12)); // NOI18N
        btnPositiva.setText("Mensagem positiva");
        btnPositiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPositivaActionPerformed(evt);
            }
        });

        btnNegativa.setBackground(new java.awt.Color(226, 74, 74));
        btnNegativa.setFont(new java.awt.Font("Exo 2", 1, 12)); // NOI18N
        btnNegativa.setText("Mensagem negativa");
        btnNegativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativaActionPerformed(evt);
            }
        });

        btnVerdade.setBackground(new java.awt.Color(68, 147, 168));
        btnVerdade.setFont(new java.awt.Font("Exo 2", 1, 12)); // NOI18N
        btnVerdade.setText("Verdade");
        btnVerdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdadeActionPerformed(evt);
            }
        });

        lblFrase.setFont(new java.awt.Font("Exo 2", 1, 18)); // NOI18N
        lblFrase.setForeground(new java.awt.Color(254, 254, 254));
        lblFrase.setText("clique nos botões abaixo!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPositiva)
                        .addGap(56, 56, 56)
                        .addComponent(btnNegativa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(btnVerdade, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(lblFrase)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPositiva)
                    .addComponent(btnNegativa)
                    .addComponent(btnVerdade))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPositivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPositivaActionPerformed
        lblFrase.setText(frasePositiva);
    }//GEN-LAST:event_btnPositivaActionPerformed

    private void btnNegativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativaActionPerformed
        lblFrase.setText(fraseNegativa);
    }//GEN-LAST:event_btnNegativaActionPerformed

    private void btnVerdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdadeActionPerformed
        lblFrase.setText(fraseVerdade);
    }//GEN-LAST:event_btnVerdadeActionPerformed

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
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNegativa;
    private javax.swing.JButton btnPositiva;
    private javax.swing.JButton btnVerdade;
    private javax.swing.JLabel lblFrase;
    // End of variables declaration//GEN-END:variables
}