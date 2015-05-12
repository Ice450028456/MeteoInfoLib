/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteoinfo.layer;

import com.l2fprod.common.swing.JFontChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;

/**
 *
 * @author yaqiang
 */
public class FrmChartLabel extends javax.swing.JDialog {
    
    private final ChartSet chartSet;
    
    /**
     * Creates new form FrmChartLabel
     * @param parent
     * @param modal
     * @param chartSet
     */
    public FrmChartLabel(java.awt.Dialog parent, boolean modal, ChartSet chartSet) {
        super(parent, modal);
        initComponents();
        
        this.chartSet = chartSet;
        this.jCheckBox_DrawLabel.setSelected(chartSet.isDrawLabel());
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
        jButton_Font = new javax.swing.JButton();
        jLabel_Color = new javax.swing.JLabel();
        jLabel_DecimalDigits = new javax.swing.JLabel();
        jTextField_DecimalDigits = new javax.swing.JTextField();
        jCheckBox_DrawLabel = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chart Label");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Label Set"));

        jButton_Font.setText("Font");
        jButton_Font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FontActionPerformed(evt);
            }
        });

        jLabel_Color.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Color.setText("Color");
        jLabel_Color.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel_Color.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ColorMouseClicked(evt);
            }
        });

        jLabel_DecimalDigits.setText("Decimal Digits:");

        jTextField_DecimalDigits.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Font, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_DecimalDigits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_DecimalDigits, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Font)
                    .addComponent(jLabel_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_DecimalDigits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_DecimalDigits))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBox_DrawLabel.setText("Draw Label");
        jCheckBox_DrawLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DrawLabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_DrawLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_DrawLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton_FontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FontActionPerformed
        // TODO add your handling code here:
        Font font = JFontChooser.showDialog(this, null, this.chartSet.getLabelFont());
        if (font != null)
            this.chartSet.setLabelFont(font);
    }//GEN-LAST:event_jButton_FontActionPerformed

    private void jLabel_ColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ColorMouseClicked
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(this, null, this.chartSet.getLabelColor());
        if (color != null)
            this.chartSet.setLabelColor(color);
    }//GEN-LAST:event_jLabel_ColorMouseClicked

    private void jCheckBox_DrawLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DrawLabelActionPerformed
        // TODO add your handling code here:
        this.chartSet.setDrawLabel(this.jCheckBox_DrawLabel.isSelected());
    }//GEN-LAST:event_jCheckBox_DrawLabelActionPerformed

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
            java.util.logging.Logger.getLogger(FrmChartLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmChartLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmChartLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmChartLabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmChartLabel dialog = new FrmChartLabel(new javax.swing.JDialog(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Font;
    private javax.swing.JCheckBox jCheckBox_DrawLabel;
    private javax.swing.JLabel jLabel_Color;
    private javax.swing.JLabel jLabel_DecimalDigits;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_DecimalDigits;
    // End of variables declaration//GEN-END:variables
}
