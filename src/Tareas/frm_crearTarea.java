/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import Controlador.NuevaTarea;

/**
 *
 * @author Steven
 */
public class frm_crearTarea extends javax.swing.JDialog {

    private NuevaTarea nuevaTarea = new NuevaTarea();

    /**
     * Creates new form FrmNTarea
     */
    public frm_crearTarea(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        BttIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarBotonClick(evt);
            }
        });
    }

    public void pasarDatoNombre() {
        String nombre = cajatxtNombreTarea.getText();
        nuevaTarea.guardarNombre(nombre);
    }
        
    public void pasarDatoEnfoque() {
        Integer tiempo = 0;
        if (RadBttenf25.isSelected()) {
            tiempo = 25;
        } else if (Radbttenf50.isSelected()) {
            tiempo = 50;
        }
        
        nuevaTarea.guardarEnfoque(tiempo);
    }
    
    private void ejecutarBotonClick(java.awt.event.ActionEvent evt) {
        pasarDatoNombre();
        pasarDatoEnfoque();
        
        javax.swing.JOptionPane.showMessageDialog(this, "Se ha guardado los datos correctamente");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajatxtNombreTarea = new javax.swing.JTextField();
        RadBttenf25 = new javax.swing.JRadioButton();
        Radbttenf50 = new javax.swing.JRadioButton();
        BttIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CREAR NUEVA TAREA");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel3.setText("Tarea:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setText("Tiempo de enfoque:");

        cajatxtNombreTarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cajatxtNombreTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajatxtNombreTareaActionPerformed(evt);
            }
        });

        RadBttenf25.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadBttenf25);
        RadBttenf25.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        RadBttenf25.setText("25 minutos");
        RadBttenf25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadBttenf25ActionPerformed(evt);
            }
        });

        Radbttenf50.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Radbttenf50);
        Radbttenf50.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        Radbttenf50.setText("50 minutos");
        Radbttenf50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radbttenf50ActionPerformed(evt);
            }
        });

        BttIniciar.setBackground(new java.awt.Color(255, 102, 51));
        BttIniciar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BttIniciar.setForeground(new java.awt.Color(255, 255, 255));
        BttIniciar.setText("INICIAR");
        BttIniciar.setToolTipText("");
        BttIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(cajatxtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RadBttenf25)
                            .addComponent(BttIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Radbttenf50)
                        .addGap(167, 167, 167))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajatxtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RadBttenf25)
                    .addComponent(Radbttenf50))
                .addGap(29, 29, 29)
                .addComponent(BttIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadBttenf25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadBttenf25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadBttenf25ActionPerformed

    private void Radbttenf50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radbttenf50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Radbttenf50ActionPerformed

    private void BttIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttIniciarActionPerformed

    private void cajatxtNombreTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajatxtNombreTareaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cajatxtNombreTareaActionPerformed

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
            java.util.logging.Logger.getLogger(frm_crearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_crearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_crearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_crearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm_crearTarea dialog = new frm_crearTarea(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BttIniciar;
    private javax.swing.JRadioButton RadBttenf25;
    private javax.swing.JRadioButton Radbttenf50;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cajatxtNombreTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
