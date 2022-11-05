/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/** 
 *
 * @author Kentry Gutter
 */
public class InternalFrameCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameParticipante
     */
    public InternalFrameCliente() {
        initComponents();
        setTitle("Registrar Cliente");
        jtxtIdParticipante.setEnabled(false);
    }
    
    public void LimpiarCampos(){
        
        jtxtIdParticipante.setText("");
        jtxtNombreParticipante.setText("");
        jtxtApellido1Participante.setText("");
        jtxtApellido2Participante.setText("");
        jtxtEdadCliente.setText("");
        jtxtDepartamentoParticipante.setText("");
        
    }
    
    public void obtenerDatos(){
        
        List<Cliente> cliente = new DAOCliente(). ObtenerDatos();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] columnas = {"id_cliente", "Nombre(S)", "Apellido Paterno", "Apellido Materno", "Edad",
        "Departamento"};
        
        modelo.setColumnIdentifiers(columnas);
        
        for(Cliente cl : cliente){
            String[] renglon ={Integer.toString(cl.getId_cliente()), cl.getNombre_c(),
                    cl.getApellido_c1(), cl.getApellido_c2(),
                    Integer.toString(cl.getEdad_c()), cl.getDepart_c()};
            
                    modelo.addRow(renglon);
        }
        jtableCliente.setModel(modelo);
    }
    
    public void actualizarCliente(){
        
        int id = Integer.parseInt(this.jtxtIdParticipante.getText());
        String nom = this.jtxtNombreParticipante.getText();
        String ape1 = this.jtxtApellido1Participante.getText();
        String ape2 = this.jtxtApellido2Participante.getText();
        int edad = Integer.valueOf(this.jtxtEdadCliente.getText());
        String depa = this.jtxtDepartamentoParticipante.getText();
        
        DAOCliente dao = new DAOCliente();
        
        int res = dao.Actualizar(id, nom, ape1, ape2, edad, depa);
        
        if(res == 1){
            JOptionPane.showMessageDialog(rootPane, "Datos del cliente actualizados.");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Lo sentimos. Ocurrio un ERROR.");
        }
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
        jLabel1 = new javax.swing.JLabel();
        jtxtIdParticipante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtApellido1Participante = new javax.swing.JTextField();
        jtxtNombreParticipante = new javax.swing.JTextField();
        jtxtApellido2Participante = new javax.swing.JTextField();
        jtxtEdadCliente = new javax.swing.JTextField();
        jtxtDepartamentoParticipante = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        btnAgregarParticipante = new javax.swing.JButton();
        btnEditarParticipante = new javax.swing.JButton();
        btnActualizarParticipante = new javax.swing.JButton();
        btnBorrarParticipante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableCliente = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("ID Cliente");

        jtxtIdParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Nombre (S)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Edad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Apellido Paterno");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Apellido Materno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Departamento");

        jtxtApellido1Participante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtNombreParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtApellido2Participante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtEdadCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtDepartamentoParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNombreParticipante)
                            .addComponent(jtxtApellido1Participante)
                            .addComponent(jtxtApellido2Participante, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtEdadCliente)
                                        .addGap(71, 71, 71))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(166, 166, 166)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtxtDepartamentoParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombreParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtApellido1Participante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtApellido2Participante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtEdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDepartamentoParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));

        btnAgregarParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregarParticipante.setText("Agregar");
        btnAgregarParticipante.setPreferredSize(new java.awt.Dimension(79, 23));
        btnAgregarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarParticipanteActionPerformed(evt);
            }
        });

        btnEditarParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditarParticipante.setText("Editar");
        btnEditarParticipante.setPreferredSize(new java.awt.Dimension(79, 23));
        btnEditarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarParticipanteActionPerformed(evt);
            }
        });

        btnActualizarParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnActualizarParticipante.setText("Actualizar");
        btnActualizarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarParticipanteActionPerformed(evt);
            }
        });

        btnBorrarParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBorrarParticipante.setText("Borrar");
        btnBorrarParticipante.setPreferredSize(new java.awt.Dimension(79, 23));
        btnBorrarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarParticipanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBorrarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(btnActualizarParticipante)
                .addGap(18, 18, 18)
                .addComponent(btnEditarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnEditarParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAgregarParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnBorrarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnActualizarParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jtableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jtableCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarParticipanteActionPerformed
        // TODO add your handling code here:
        String nomb = jtxtNombreParticipante.getText();
        String ape1 = jtxtApellido1Participante.getText();
        String ape2 = jtxtApellido2Participante.getText();
        String edad = jtxtEdadCliente.getText();
        String depart = jtxtDepartamentoParticipante.getText();

        if(nomb.contentEquals("")|| ape1.contentEquals("")||ape2.contentEquals("")||
            edad.contentEquals("")||depart.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, "Registro agregado.");
        }else{
            try {
                int ed = Integer.valueOf(edad);
                Cliente clt = new DAOCliente().Insertar(nomb, ape1, ape2, ed, depart);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro.");
            }
        }
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_btnAgregarParticipanteActionPerformed

    private void btnEditarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarParticipanteActionPerformed
        // TODO add your handling code here:
        int fila = this.jtableCliente.getSelectedRow();

        if(fila == -1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla.");
        }else{
            try {
                int id = Integer.parseInt((String) this.jtableCliente.getValueAt(fila, 0). toString());
                String nom = (String) this.jtableCliente.getValueAt(fila, 1);
                String ap1 = (String) this.jtableCliente.getValueAt(fila, 2);
                String ap2 = (String) this.jtableCliente.getValueAt(fila, 3);
                int edad = Integer.parseInt((String) this.jtableCliente.getValueAt(fila, 4).toString());
                String depart = (String)this.jtableCliente.getValueAt(fila, 5);

                jtxtIdParticipante.setText("" + id);
                jtxtNombreParticipante.setText(nom);
                jtxtApellido1Participante.setText(ap1);
                jtxtApellido2Participante.setText(ap2);
                jtxtEdadCliente.setText(String.valueOf(edad));
                jtxtDepartamentoParticipante.setText(depart);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEditarParticipanteActionPerformed

    private void btnActualizarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarParticipanteActionPerformed
        // TODO add your handling code here:
        actualizarCliente();
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_btnActualizarParticipanteActionPerformed

    private void btnBorrarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarParticipanteActionPerformed
        // TODO add your handling code here:
        int fila = this.jtableCliente.getSelectedRow();

        if(fila == -1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla.");
        }else{
            int id = Integer.parseInt((String) this.jtableCliente.getValueAt(fila, 0). toString());
            DAOCliente dao = new DAOCliente();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_btnBorrarParticipanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarParticipante;
    private javax.swing.JButton btnAgregarParticipante;
    private javax.swing.JButton btnBorrarParticipante;
    private javax.swing.JButton btnEditarParticipante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtableCliente;
    private javax.swing.JTextField jtxtApellido1Participante;
    private javax.swing.JTextField jtxtApellido2Participante;
    private javax.swing.JTextField jtxtDepartamentoParticipante;
    private javax.swing.JTextField jtxtEdadCliente;
    private javax.swing.JTextField jtxtIdParticipante;
    private javax.swing.JTextField jtxtNombreParticipante;
    // End of variables declaration//GEN-END:variables
}
