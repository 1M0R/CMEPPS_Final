/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmepps_final.ventanas;

import cmepps_final.elementos.Elemento;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.WindowConstants;

/**
 *
 * @author Pablo
 */
public class VentanaInsertarElemento extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInsertarElemento
     */
    public VentanaInsertarElemento() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
    }

    public void insertarElemento(){
        
        Elemento e = new Elemento(textNombre.getText(), parseInt(textEntradas.getText()), 
                parseInt(textEntradas2.getText()), parseInt(textSalidas.getText()),
                parseInt(textSalidas2.getText()));
        
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
        textNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        textEntradas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textEntradas2 = new javax.swing.JTextField();
        textSalidas = new javax.swing.JTextField();
        textSalidas2 = new javax.swing.JTextField();
        labelEntradas = new javax.swing.JLabel();
        labelSalidas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonInsertar = new javax.swing.JButton();
        labelSalidas2 = new javax.swing.JLabel();
        labelEntradas2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo de elemento");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EE", "SE", "CE", "FLI", "FLE" }));
        comboTipo.setSelectedIndex(2);
        comboTipo.setSelectedItem(2);
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        textEntradas.setName(""); // NOI18N

        jLabel3.setText("Ficheros/registros referenciados:");

        jLabel4.setText("Datos elementales");

        labelEntradas.setText("entradas");

        labelSalidas.setText("salidas");

        buttonInsertar.setText("INSERTAR");

        labelSalidas2.setText("salidas");

        labelEntradas2.setText("entradas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textNombre)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textEntradas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSalidas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSalidas2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEntradas2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEntradas)
                            .addComponent(labelSalidas)
                            .addComponent(labelEntradas2)
                            .addComponent(labelSalidas2)))
                    .addComponent(buttonInsertar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(labelEntradas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSalidas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(textEntradas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEntradas2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSalidas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelSalidas2))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(buttonInsertar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
        actualizarTipo();
    }//GEN-LAST:event_comboTipoActionPerformed

    private void actualizarTipo() {
        String tipo = (String) comboTipo.getSelectedItem();
        switch (tipo) {
            case "EE":
            case "FLI":
            case "FLE":
            case "SE":
                labelEntradas.setVisible(false);
                labelSalidas.setVisible(false);
                textSalidas.setVisible(false);
                textSalidas.setText("");
                labelEntradas2.setVisible(false);
                labelSalidas2.setVisible(false);
                textSalidas2.setVisible(false);
                textSalidas2.setText("");
                break;
            case "CE":
                labelEntradas.setVisible(true);
                labelSalidas.setVisible(true);
                textSalidas.setVisible(true);
                textSalidas2.setText("");
                labelEntradas2.setVisible(true);
                labelSalidas2.setVisible(true);
                textSalidas2.setVisible(true);
                textSalidas2.setText("");
                break;
        }
    }
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
            java.util.logging.Logger.getLogger(VentanaInsertarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInsertarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInsertarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInsertarElemento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInsertarElemento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInsertar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelEntradas;
    private javax.swing.JLabel labelEntradas2;
    private javax.swing.JLabel labelSalidas;
    private javax.swing.JLabel labelSalidas2;
    private javax.swing.JTextField textEntradas;
    private javax.swing.JTextField textEntradas2;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textSalidas;
    private javax.swing.JTextField textSalidas2;
    // End of variables declaration//GEN-END:variables
}