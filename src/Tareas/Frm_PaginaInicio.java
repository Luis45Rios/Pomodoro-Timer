/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.awt.Component;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import Controlador.TareaController;
import Modelos.Tarea;
import Modelos.TareaTableModel;
import Modelos.Usuario;

/**
 *
 * @author luisr
 */
public class Frm_PaginaInicio extends javax.swing.JFrame {
        private Usuario usuario;
        private static TareaController tareaController = new TareaController();

        /**
         * Creates new form frm_pagInicio
         */
        public Frm_PaginaInicio(Usuario usuario) {
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
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jButtonNuevaTarea = new javax.swing.JButton();
                jLabelNombreUsuario = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTableResumen = new javax.swing.JTable();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(193, 250, 220));
                jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                jLabel1.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Inicio");

                jButtonNuevaTarea.setBackground(new java.awt.Color(1, 1, 1));
                jButtonNuevaTarea.setForeground(new java.awt.Color(255, 255, 255));
                jButtonNuevaTarea.setText("Nueva Tarea");
                jButtonNuevaTarea.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonNuevaTareaActionPerformed(evt);
                        }
                });

                jLabelNombreUsuario.setFont(new java.awt.Font("Bitstream Charter", 0, 36)); // NOI18N
                jLabelNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                String username = usuario != null ? usuario.getUsername() : "Usuario";
                jLabelNombreUsuario.setText("Bienvedido (" + username + ")");

                List<Tarea> tareas = tareaController.obtenerTareas(usuario != null ? usuario.getUsername() : null);
                TareaTableModel model = new TareaTableModel(tareas);
                jTableResumen.setModel(model);
                jTableResumen.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());
                jTableResumen.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(model));
                jScrollPane1.setViewportView(jTableResumen);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelNombreUsuario,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 619,
                                                                Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(65, 65, 65)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jButtonNuevaTarea,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                137,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                484,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(25, 25, 25)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabelNombreUsuario)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                49,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButtonNuevaTarea,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                36,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)));

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

        private void jButtonNuevaTareaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonNuevaTareaActionPerformed
                Frm_CrearTarea frm = new Frm_CrearTarea(this, rootPaneCheckingEnabled, usuario);
                setVisible(false);
                frm.setVisible(true);
        }// GEN-LAST:event_jButtonNuevaTareaActionPerformed

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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Frm_PaginaInicio.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Frm_PaginaInicio.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Frm_PaginaInicio.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Frm_PaginaInicio.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Frm_PaginaInicio(null).setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButtonNuevaTarea;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabelNombreUsuario;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTableResumen;
        // End of variables declaration//GEN-END:variables

        static class ButtonRenderer extends JButton implements TableCellRenderer {
                public ButtonRenderer() {
                        setText("Eliminar");
                }

                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                boolean hasFocus, int row, int column) {
                        return this;
                }

        }

        static class ButtonEditor extends DefaultCellEditor {
                private final JButton button;
                private final TareaTableModel model;
                private int row;

                public ButtonEditor(TareaTableModel model) {
                        super(new JTextField());
                        this.model = model;
                        button = new JButton("Eliminar");
                        button.addActionListener(e -> {
                                if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la tarea?",
                                                "Eliminar tarea",
                                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                                        Tarea tarea = this.model.getTarea(row);
                                        tareaController.eliminarTarea(tarea.getId());
                                        this.model.removeRow(row);

                                }
                        });
                }

                @Override
                public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
                                int column) {
                        this.row = row;
                        return button;
                }

        }
}
