package Frame;

public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        animales = new javax.swing.JLabel();
        alimentacion = new javax.swing.JLabel();
        visitantes = new javax.swing.JLabel();
        habitots = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        eventos = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        ingreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 530));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        animales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/animnalesssssss.jpg"))); // NOI18N
        animales.setText("ANIMALES");
        animales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        animales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(animales, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, 120));

        alimentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alimentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/alimentacionnnnnn.jpg"))); // NOI18N
        alimentacion.setText("ALIMENTACION");
        alimentacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        jPanel2.add(alimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 140, 120));

        visitantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        visitantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/visitantes.jpg"))); // NOI18N
        visitantes.setText("VISITANTES");
        visitantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        jPanel2.add(visitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 140, 130));

        habitots.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        habitots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/habitatssssss.jpg"))); // NOI18N
        habitots.setText("HABITATS");
        habitots.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        jPanel2.add(habitots, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 140, 130));

        mapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mapaoo.jpg"))); // NOI18N
        mapa.setText("MAPA");
        mapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        jPanel2.add(mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 140, 120));

        eventos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eventos.jpg"))); // NOI18N
        eventos.setText("EVENTOS");
        eventos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        jPanel2.add(eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 130, 120));

        jButton7.setText("ANIMALES");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jButton8.setText("MAPA");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jButton9.setText("EVENTOS");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, -1, -1));

        jButton10.setText("VISITANTES");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, -1, -1));

        jButton11.setText("HABITATS");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));

        jButton12.setText("ALIMENTACION");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 530));

        ingreso.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("ZOOLOGICO");

        javax.swing.GroupLayout ingresoLayout = new javax.swing.GroupLayout(ingreso);
        ingreso.setLayout(ingresoLayout);
        ingresoLayout.setHorizontalGroup(
            ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresoLayout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jLabel2)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        ingresoLayout.setVerticalGroup(
            ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
        );

        getContentPane().add(ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 750, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Animales an = new Animales();
        an.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       Habitats ha = new Habitats();
       ha.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Eventos ev = new Eventos();
        ev.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Visitantes vi = new Visitantes();
        vi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Alimentacion al = new Alimentacion();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alimentacion;
    private javax.swing.JLabel animales;
    private javax.swing.JLabel eventos;
    private javax.swing.JLabel habitots;
    private javax.swing.JPanel ingreso;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mapa;
    private javax.swing.JLabel visitantes;
    // End of variables declaration//GEN-END:variables
}
