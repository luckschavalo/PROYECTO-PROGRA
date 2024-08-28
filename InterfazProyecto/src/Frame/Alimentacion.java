/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class Alimentacion extends javax.swing.JFrame {

    private static DefaultTableModel modelo = new DefaultTableModel();
    private static DefaultTableModel tablaAnimales = Animales.getModelo();
    
    /**
     * Creates new form Habitats
     */
    public Alimentacion() {
        initComponents();
        setVisible(false);
        setLocationRelativeTo(null);
        setVisible(true);
        if (modelo.getColumnCount() == 0) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Aliento");
            modelo.addColumn("Horario");
            modelo.addColumn("Frecuencia");
            modelo.addColumn("Cantidad");

        }
        this.tabla.setModel(modelo);
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtanimal = new javax.swing.JTextField();
        txtalimento = new javax.swing.JTextField();
        txthorario = new javax.swing.JTextField();
        txtfrecu = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(176, 128, 46));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(88, 98, 50));
        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 249, 224));
        jButton1.setText("INICIO");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 463, 60, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 249, 224));
        jLabel1.setText("ALIMENTACION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 249, 224));
        jLabel2.setText("Animal ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 64, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 249, 224));
        jLabel3.setText("Alimento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 104, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 249, 224));
        jLabel4.setText("Horario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 139, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 249, 224));
        jLabel5.setText("Frecuencia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 174, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 249, 224));
        jLabel6.setText("Cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 209, -1, -1));

        jButton2.setBackground(new java.awt.Color(88, 98, 50));
        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(254, 249, 224));
        jButton2.setText("AÑADIR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, 20));

        jButton3.setBackground(new java.awt.Color(88, 98, 50));
        jButton3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(254, 249, 224));
        jButton3.setText("ELIMINAR");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, 20));

        txtanimal.setBackground(new java.awt.Color(88, 98, 50));
        txtanimal.setForeground(new java.awt.Color(254, 249, 224));
        jPanel1.add(txtanimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 64, 71, -1));

        txtalimento.setBackground(new java.awt.Color(88, 98, 50));
        txtalimento.setForeground(new java.awt.Color(254, 249, 224));
        txtalimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalimentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtalimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 105, 71, -1));

        txthorario.setBackground(new java.awt.Color(88, 98, 50));
        txthorario.setForeground(new java.awt.Color(254, 249, 224));
        jPanel1.add(txthorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 140, 71, -1));

        txtfrecu.setBackground(new java.awt.Color(88, 98, 50));
        txtfrecu.setForeground(new java.awt.Color(254, 249, 224));
        jPanel1.add(txtfrecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 175, 71, -1));

        txtcantidad.setBackground(new java.awt.Color(88, 98, 50));
        txtcantidad.setForeground(new java.awt.Color(254, 249, 224));
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 210, 71, -1));

        tabla.setBackground(new java.awt.Color(88, 98, 50));
        tabla.setForeground(new java.awt.Color(254, 249, 224));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 64, 539, 372));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ALIMENTACION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 16, -1, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame on = new JFrame();
        on.setVisible(true); // para que el boton regrese al menu
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtalimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalimentoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] info = new String[5];
        info[0] = txtanimal.getText();
        info[1] = txtalimento.getText();
        info[2] = txthorario.getText();
        info[3] = txtfrecu.getText();
        info[4] = txtcantidad.getText();
        modelo.addRow(info); //para que almacene la informacion en la tabla 
        txtanimal.setText("");
        txtalimento.setText("");
        txthorario.setText("");
        txtfrecu.setText("");
        txtcantidad.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "seleccione la fila");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alimentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtalimento;
    private javax.swing.JTextField txtanimal;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtfrecu;
    private javax.swing.JTextField txthorario;
    // End of variables declaration//GEN-END:variables
}
