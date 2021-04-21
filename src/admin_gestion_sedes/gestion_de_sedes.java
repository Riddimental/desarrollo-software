/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_gestion_sedes;

import java.awt.Dialog.ModalityType;
import java.awt.Image;
import javax.swing.ImageIcon;
import admin_gestion_sedes.actualizar_sede;
import admin_gestion_sedes.agregar_sede;
import admin_gestion_sedes.borrar_sede;
import admin_gestion_sedes.consultar_sede;
import modulos.menu_admin;

/**
 *
 * @author juandiazvillota
 */
public class gestion_de_sedes extends javax.swing.JFrame {

    /**
     * Creates new form gestion_de_sedes
     */
    public gestion_de_sedes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.imagenes();
    }

    public void imagenes(){
        ImageIcon imagenadd = new ImageIcon("src/imagenes/add.png");
        Image add = imagenadd.getImage();
        Image imgadd = add.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_add = new ImageIcon(imgadd);
        this.jLabel_add.setIcon(imagen_add);
        this.jLabel_add.setText("");
        
        ImageIcon imagenlogo = new ImageIcon("src/imagenes/sedes.png");
        Image logo = imagenlogo.getImage();
        Image imglogo = logo.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_logo = new ImageIcon(imglogo);
        this.jLabel_logo.setIcon(imagen_logo);
        this.jLabel_logo.setText("");
        
        ImageIcon imagenactualizar = new ImageIcon("src/imagenes/actualizar.png");
        Image imagenupdate = imagenactualizar.getImage();
        Image imgupdate = imagenupdate.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_actualizar = new ImageIcon(imgupdate);
        this.jLabel_actualizar.setIcon(imagen_actualizar);
        this.jLabel_actualizar.setText("");
        
        ImageIcon imagenbuscar = new ImageIcon("src/imagenes/buscar.png");
        Image imagensearch = imagenbuscar.getImage();
        Image imgsearch = imagensearch.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_buscar = new ImageIcon(imgsearch);
        this.jLabel_buscar.setIcon(imagen_buscar);
        this.jLabel_buscar.setText("");
        
        ImageIcon imagenborrar = new ImageIcon("src/imagenes/borrar.png");
        Image imagendel = imagenborrar.getImage();
        Image imgdel = imagendel.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon imagen_borrar = new ImageIcon(imgdel);
        this.jLabel_borrar.setIcon(imagen_borrar);
        this.jLabel_borrar.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENIDO = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_add = new javax.swing.JLabel();
        jButton_add = new javax.swing.JButton();
        jButton_search = new javax.swing.JButton();
        jLabel_buscar = new javax.swing.JLabel();
        jButton_uodate = new javax.swing.JButton();
        jLabel_actualizar = new javax.swing.JLabel();
        jLabel_borrar = new javax.swing.JLabel();
        jButton_delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel_TITULO = new javax.swing.JLabel();
        jLabel_logo = new javax.swing.JLabel();
        jButton_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_add.setText("ADD");
        jLabel_add.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel_add.setMinimumSize(new java.awt.Dimension(16, 16));

        jButton_add.setText("Agregar Sede");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_search.setText("Consultar Sede");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jLabel_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_buscar.setText("SEARCH");

        jButton_uodate.setText("Actualizar Sede");
        jButton_uodate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_uodateActionPerformed(evt);
            }
        });

        jLabel_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_actualizar.setText("UPDATE");

        jLabel_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_borrar.setText("DELETE");

        jButton_delete.setText("Borrar Sede");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_add, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_uodate)
                    .addComponent(jLabel_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton_search)
                    .addComponent(jLabel_buscar)
                    .addComponent(jButton_delete)
                    .addComponent(jLabel_borrar))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_add)
                    .addComponent(jButton_search))
                .addGap(18, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_borrar)
                    .addComponent(jLabel_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_uodate)
                    .addComponent(jButton_delete))
                .addContainerGap())
        );

        jLabel_TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITULO.setText("Gestion de Sedes");

        jLabel_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_logo.setText("logo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_TITULO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
            .addComponent(jLabel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_CONTENIDOLayout = new javax.swing.GroupLayout(jPanel_CONTENIDO);
        jPanel_CONTENIDO.setLayout(jPanel_CONTENIDOLayout);
        jPanel_CONTENIDOLayout.setHorizontalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENIDOLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel_CONTENIDOLayout.setVerticalGroup(
            jPanel_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jButton_atras.setText("Atras");
        jButton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_atras))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_atras)
                .addGap(5, 5, 5)
                .addComponent(jPanel_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        agregar_sede addsede;
        addsede = new agregar_sede(this,true);
        addsede.setModal (true);
        addsede.setAlwaysOnTop (true);
        addsede.setModalityType (ModalityType.APPLICATION_MODAL);
        addsede.setVisible(true);
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        consultar_sede buscarsede;
        buscarsede = new consultar_sede(this,true);
        buscarsede.setModal (true);
        buscarsede.setAlwaysOnTop (true);
        buscarsede.setModalityType (ModalityType.APPLICATION_MODAL);
        buscarsede.setVisible(true);
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        borrar_sede delsede;
        delsede = new borrar_sede(this,true);
        delsede.setModal (true);
        delsede.setAlwaysOnTop (true);
        delsede.setModalityType (ModalityType.APPLICATION_MODAL);
        delsede.setVisible(true);
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_uodateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_uodateActionPerformed
        actualizar_sede updatesede;
        updatesede = new actualizar_sede(this,true);
        updatesede.setModal (true);
        updatesede.setAlwaysOnTop (true);
        updatesede.setModalityType (ModalityType.APPLICATION_MODAL);
        updatesede.setVisible(true);
    }//GEN-LAST:event_jButton_uodateActionPerformed

    private void jButton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_atrasActionPerformed
        menu_admin log = new menu_admin();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(gestion_de_sedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestion_de_sedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestion_de_sedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestion_de_sedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestion_de_sedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_atras;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_uodate;
    private javax.swing.JLabel jLabel_TITULO;
    private javax.swing.JLabel jLabel_actualizar;
    private javax.swing.JLabel jLabel_add;
    private javax.swing.JLabel jLabel_borrar;
    private javax.swing.JLabel jLabel_buscar;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_CONTENIDO;
    // End of variables declaration//GEN-END:variables
}
