/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import javax.swing.JOptionPane;

import Controlador.TareaController;
import Modelos.Tarea;
import Modelos.Usuario;
import Temporizador.Pomodoro;

/**
 *
 * @author Steven
 */
public class Frm_CrearTarea extends javax.swing.JDialog {
    private Usuario usuario;

    public Frm_CrearTarea(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        this.usuario = usuario;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        btnEnfoque25 = new javax.swing.JRadioButton();
        btnEnfoque50 = new javax.swing.JRadioButton();
        btnIniciar = new javax.swing.JButton();

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

        txtNombreTarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnEnfoque25.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnEnfoque25);
        btnEnfoque25.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEnfoque25.setText("25 minutos");

        btnEnfoque50.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnEnfoque50);
        btnEnfoque50.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEnfoque50.setText("50 minutos");

        btnIniciar.setBackground(new java.awt.Color(255, 102, 51));
        btnIniciar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.setToolTipText("");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
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
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addGap(53, 53, 53)
                                                                        .addComponent(txtNombreTarea,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                264,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(157, 157, 157))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnEnfoque25)
                                                        .addComponent(btnIniciar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 129,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEnfoque50)
                                                .addGap(167, 167, 167)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(btnEnfoque25)
                                        .addComponent(btnEnfoque50))
                                .addGap(29, 29, 29)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Integer getTiempoEnfoque() {
        Integer tiempoEnfoque = 0;
        if (btnEnfoque25.isSelected()) {
            tiempoEnfoque = 25;
        } else if (btnEnfoque50.isSelected()) {
            tiempoEnfoque = 50;
        }

        return tiempoEnfoque;
    }

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BttIniciarActionPerformed
        String nombre = txtNombreTarea.getText().trim();
        Integer tiempoEnfoque = getTiempoEnfoque();

        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "No se ha iniciado sesión", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nombre.isEmpty() || tiempoEnfoque == 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, ingrese el nombre de la tarea y seleccione el tiempo de enfoque",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Integer numeroPomodoros = 0;
        String username = usuario.getUsername();

        TareaController tareaController = new TareaController();

        try {
            Tarea tarea = tareaController.crearTarea(nombre, tiempoEnfoque, numeroPomodoros, username);
            Pomodoro pomodoro = new Pomodoro(tarea);
            pomodoro.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error inesperado. Intente de nuevo.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_BttIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CrearTarea.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frm_CrearTarea dialog = new Frm_CrearTarea(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JRadioButton btnEnfoque25;
    private javax.swing.JRadioButton btnEnfoque50;
    private javax.swing.JButton btnIniciar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables
}
