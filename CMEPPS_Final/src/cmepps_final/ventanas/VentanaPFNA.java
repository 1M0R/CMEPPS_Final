/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmepps_final.ventanas;

import cmepps_final.variabs.Elemento;
import static cmepps_final.ventanas.VentanaElementos.modelo2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class VentanaPFNA extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPFNA
     */
    static ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    public VentanaPFNA(ArrayList<Elemento> elementos) {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.elementos = elementos;
        CrearModelo1();
        llenarTabla();
    }
    
    static DefaultTableModel modelo1;
    private void CrearModelo1(){
        try {
            modelo1 = (new DefaultTableModel(
                null, new String [] {
                "Elemento","SIMPLE", "MEDIA","COMPLEJA", "Total"}){
        Class[] types = new Class [] {
            java.lang.String.class,
            java.lang.String.class,
            java.lang.String.class,
            java.lang.String.class,
            java.lang.String.class
        };

        boolean[] canEdit = new boolean [] {false,false,false,false, false};

        @Override
        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        @Override
        public boolean isCellEditable(int rowIndex, int colIndex){
            return canEdit [colIndex];
        }
    });
      
        tablaPFNA.setModel(modelo1);

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString()+"error2");
            }
    }
    
    void llenarTabla(){
        Object O[]=null;
        
        modelo1.addRow(O);
        modelo1.setValueAt("EE (x3)", 0, 0);
        modelo1.setValueAt(nTipoComplejidadPFNA("EE", "SIMPLE"), 0, 1);
        modelo1.setValueAt(nTipoComplejidadPFNA("EE", "MEDIA"), 0, 2);
        modelo1.setValueAt(nTipoComplejidadPFNA("EE", "COMPLEJA"), 0, 3);
        
        int totalEE  = nTipoComplejidadPFNA("EE", "SIMPLE") + nTipoComplejidadPFNA("EE", "MEDIA") + nTipoComplejidadPFNA("EE", "COMPLEJA");
        totalEE*=3;
        modelo1.setValueAt(totalEE, 0, 4);
        
        modelo1.addRow(O);
        modelo1.setValueAt("SE (x4)", 1, 0);
        modelo1.setValueAt(nTipoComplejidadPFNA("SE", "SIMPLE"), 1, 1);
        modelo1.setValueAt(nTipoComplejidadPFNA("SE", "MEDIA"), 1, 2);
        modelo1.setValueAt(nTipoComplejidadPFNA("SE", "COMPLEJA"), 1, 3);
        int totalSE  = nTipoComplejidadPFNA("SE", "SIMPLE") + nTipoComplejidadPFNA("SE", "MEDIA") + nTipoComplejidadPFNA("SE", "COMPLEJA");
        totalSE*=4;
        modelo1.setValueAt(totalSE, 1, 4);
        
        modelo1.addRow(O);
        modelo1.setValueAt("CE (x3)", 2, 0);
        modelo1.setValueAt(nTipoComplejidadPFNA("CE", "SIMPLE"), 2, 1);
        modelo1.setValueAt(nTipoComplejidadPFNA("CE", "MEDIA"), 2, 2);
        modelo1.setValueAt(nTipoComplejidadPFNA("CE", "COMPLEJA"), 2, 3);
        int totalCE  = nTipoComplejidadPFNA("CE", "SIMPLE") + nTipoComplejidadPFNA("CE", "MEDIA") + nTipoComplejidadPFNA("CE", "COMPLEJA");
        totalCE*=3;
        modelo1.setValueAt(totalCE, 2, 4);
        
        modelo1.addRow(O);
        modelo1.setValueAt("FLI (x7)", 3, 0);
        modelo1.setValueAt(nTipoComplejidadPFNA("FLI", "SIMPLE"), 3, 1);
        modelo1.setValueAt(nTipoComplejidadPFNA("FLI", "MEDIA"), 3, 2);
        modelo1.setValueAt(nTipoComplejidadPFNA("FLI", "COMPLEJA"), 3, 3);
        int totalFLI  = nTipoComplejidadPFNA("FLI", "SIMPLE") + nTipoComplejidadPFNA("FLI", "MEDIA") + nTipoComplejidadPFNA("FLI", "COMPLEJA");
        totalFLI*=7;
        modelo1.setValueAt(totalFLI, 3, 4);
        
        
        modelo1.addRow(O);
        modelo1.setValueAt("FLE (x5)", 4, 0);
        modelo1.setValueAt(nTipoComplejidadPFNA("FLE", "SIMPLE"), 4, 1);
        modelo1.setValueAt(nTipoComplejidadPFNA("FLE", "MEDIA"), 4, 2);
        modelo1.setValueAt(nTipoComplejidadPFNA("FLE", "COMPLEJA"), 4, 3);
        int totalFLE  = nTipoComplejidadPFNA("FLE", "SIMPLE") + nTipoComplejidadPFNA("FLE", "MEDIA") + nTipoComplejidadPFNA("FLE", "COMPLEJA");
        totalFLE*=5;
        modelo1.setValueAt(totalFLE, 4, 4);
        
        modelo1.addRow(O);
        modelo1.setValueAt(totalCE+totalEE+totalFLE+totalFLI+totalSE, 5, 4);
        
        
        
        
        
        tablaPFNA.setModel(modelo1);
    }
    
    
    
    public int nTipoComplejidadPFNA(String tipo, String complejidad)
    {
        int n = 0;
        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i).getTipo() == tipo && elementos.get(i).getComplejidad() == complejidad)
            {
                n++;
            }
        }
        return n;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTotal3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPFNA = new javax.swing.JTable();

        labelTotal3.setText("0");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaPFNA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"EE (x3)", "", null, null, null},
                {"SE (x4)", null, null, null, null},
                {"CE (x3)", null, null, null, null},
                {"FLI (x7)", null, null, null, null},
                {"FLE (x5)", null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Elemento", "SIMPLE", "MEDIA", "COMPLEJA", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tablaPFNA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel3)
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPFNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPFNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPFNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPFNA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPFNA(elementos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTotal3;
    private javax.swing.JTable tablaPFNA;
    // End of variables declaration//GEN-END:variables
}
