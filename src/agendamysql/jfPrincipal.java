/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamysql;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paty
 */
public class jfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfPrincipal
     */
    DefaultTableModel TableModelo = new DefaultTableModel();
    List<DatosDTO> listaDatos = new ArrayList<>();
    int vId=0;
    public jfPrincipal() {
        initComponents();
        cargartitulos();
        cargar();
        
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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnregistra = new javax.swing.JButton();
        btnactualiza = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();
        btnlimpia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agenda");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Sexo");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        btnregistra.setText("Registar");
        btnregistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraActionPerformed(evt);
            }
        });

        btnactualiza.setText("Actualizar");
        btnactualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizaActionPerformed(evt);
            }
        });

        btnelimina.setText("Elimina");
        btnelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaActionPerformed(evt);
            }
        });

        btnlimpia.setText("Limpia");
        btnlimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnregistra)
                            .addComponent(btnelimina))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlimpia)
                            .addComponent(btnactualiza))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistra)
                    .addComponent(btnactualiza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnelimina)
                    .addComponent(btnlimpia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiaActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
    }//GEN-LAST:event_btnlimpiaActionPerformed

    private void btnregistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraActionPerformed
        // TODO add your handling code here:
        DatosDTO datos = new DatosDTO();
        ConexionDAO conexion = new ConexionDAO();
        
        datos.setNombre(txtNombre.getText());
        datos.setEdad(txtEdad.getText());
        datos.setSexo(txtSexo.getText());
        
        if (conexion.inserta(datos)){
            JOptionPane.showMessageDialog(this," Se registro correctamente...","registro",JOptionPane.INFORMATION_MESSAGE);
            TableModelo = (DefaultTableModel) tablaDatos.getModel();
            TableModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this," Error al insertar...","error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnregistraActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        // TODO add your handling code here:
        int nfilas= 0;
        int fila= 0;
        nfilas = tablaDatos.getSelectedRowCount();
        if (nfilas == 1){
            fila=tablaDatos.getSelectedRow();
            vId = (int) tablaDatos.getValueAt(fila, 0);
            txtNombre.setText((String)tablaDatos.getValueAt(fila, 1));
             txtEdad.setText((String)tablaDatos.getValueAt(fila, 2));
             txtSexo.setText((String)tablaDatos.getValueAt(fila, 3));
        }
    }//GEN-LAST:event_tablaDatosMouseClicked

    private void btnactualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizaActionPerformed
        // TODO add your handling code here:
        ConexionDAO conexion = new ConexionDAO();
        DatosDTO datos =  new DatosDTO();
        
        datos.setId(vId);
        datos.setNombre(txtNombre.getText());
        datos.setEdad(txtEdad.getText());
        datos.setSexo(txtSexo.getText());
        
        if(conexion.actualiza(datos)){
            JOptionPane.showMessageDialog(this," Se actualizo correctamente...","Actualiza",JOptionPane.INFORMATION_MESSAGE);
            TableModelo = (DefaultTableModel) tablaDatos.getModel();
            TableModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this," Error al actualizar...","error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnactualizaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        // TODO add your handling code here:
        DatosDTO datos =  new DatosDTO();
        ConexionDAO conexion = new ConexionDAO();
        
        datos.setId(vId);
        
        if(conexion.elimina(datos)){
            JOptionPane.showMessageDialog(this," Se Elimino correctamente...","Elimino",JOptionPane.INFORMATION_MESSAGE);
            TableModelo = (DefaultTableModel) tablaDatos.getModel();
            TableModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this," Error al eliminar...","error",JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btneliminaActionPerformed

   private void cargar(){
       ConexionDAO conexion = new ConexionDAO();
       if (conexion.cargar()){
           listaDatos =  conexion.getDatos();
       }else{
           JOptionPane.showMessageDialog(this," Error al cargar la informacion...","error",JOptionPane.INFORMATION_MESSAGE);
       }
       if (listaDatos.size()> 0 && listaDatos !=null){
       cargarcontenido();    
       }
   } 
   private void cargarcontenido(){
       Object[] filatabla = new Object[4];
       for (DatosDTO datos : listaDatos){
           filatabla[0]=datos.getId();
           filatabla[1]=datos.getNombre();
           filatabla[2]=datos.getEdad();
           filatabla[3]=datos.getSexo();
           TableModelo.addRow(filatabla);
       }
       tablaDatos.setModel(TableModelo);
   }
    public void cargartitulos(){
        TableModelo.addColumn("id");
        TableModelo.addColumn("Nombre");
        TableModelo.addColumn("Edad");
        TableModelo.addColumn("Sexo");
        tablaDatos.setModel(TableModelo);
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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualiza;
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btnlimpia;
    private javax.swing.JButton btnregistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
