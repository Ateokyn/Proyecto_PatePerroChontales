/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Kentry Gutter
 */
public class IntenalFrameGira extends javax.swing.JInternalFrame {

    /**
     * Creates new form IntenalFrameGira
     */
    public IntenalFrameGira() {
        initComponents();
        setTitle("Registrar Giras");
        jtxtIdGira.setEnabled(false);
        jtxtEncargado.setEnabled(false);
    }
    
    //Metodo para limpiar los campos.
    public void LimpiarCampos(){
        jtxtIdGira.setText("");
        jtxtNombreGira.setText("");
        jtxtDistanciaGira.setText("");
        jtxtPrecioGira.setText("");
        jtxtFechaGira.setText("");
    }
    
    //Metodo para listar datos dentro de la tabla.
    public void obtenerDatos(){
        //Se crea un lista que almacena los datos obtenidos.
        List<Giras> giras = new DAOGiras().ObtenerDatos(WIDTH); 
        //Define un modelo para la tabla.
        DefaultTableModel modelo = new DefaultTableModel();
        //Arreglo con nombre de caolumnas de la tabla.
        String[] columnas = {"id_gira", "Nombre Gira", "Precio Gira",
            "Distancia Gira", "Fecha Gira"};
        //Establece los nombres definidos de las columnas.
        modelo.setColumnIdentifiers(columnas);
        for(Giras gs:giras){
            String[]renglon = {Integer.toString(gs.getId_gira()), gs.getNombre_gira(),
            Float.toString(gs.getPrecio_gira()),
            Float.toString(gs.getDistancia_gira()),
            gs.getFecha_gira().toString()};
            modelo.addRow(renglon);
        }
        jtableGiras.setModel(modelo);
        }
    
    public void actualizarGira(){
        int id = Integer.parseInt(this.jtxtIdGira.getText());
        String nomG = this.jtxtNombreGira.getText();
        float precG = Float.parseFloat(this.jtxtPrecioGira.getText());
        float disG = Float.parseFloat(this.jtxtDistanciaGira.getText());
        Date fecG = Date.valueOf(this.jtxtFechaGira.getText());
        
        DAOGiras daoG = new DAOGiras();
        int res = daoG.Actualizar(id, nomG, precG, disG, fecG);
        if(res == 1){
            JOptionPane.showMessageDialog(rootPane, "Gira Actualizada.");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ocurrio un ERROR");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtDistanciaGira = new javax.swing.JTextField();
        jtxtIdGira = new javax.swing.JTextField();
        jtxtNombreGira = new javax.swing.JTextField();
        jtxtPrecioGira = new javax.swing.JTextField();
        jtxtFechaGira = new javax.swing.JTextField();
        jtxtEncargado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarGira = new javax.swing.JButton();
        btnEditarGira = new javax.swing.JButton();
        btnActualizarGira = new javax.swing.JButton();
        btnBorrarGira = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableGiras = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giras", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Distancia");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("ID Organizador");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Fecha");

        jtxtDistanciaGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtIdGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtNombreGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtPrecioGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtFechaGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtxtEncargado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtPrecioGira, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtxtIdGira, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtxtNombreGira, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jtxtDistanciaGira, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtFechaGira, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtIdGira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtxtDistanciaGira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtxtNombreGira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtPrecioGira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtFechaGira, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnAgregarGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregarGira.setText("Agregar");
        btnAgregarGira.setPreferredSize(new java.awt.Dimension(79, 23));
        btnAgregarGira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGiraActionPerformed(evt);
            }
        });

        btnEditarGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditarGira.setText("Editar");
        btnEditarGira.setPreferredSize(new java.awt.Dimension(79, 23));
        btnEditarGira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGiraActionPerformed(evt);
            }
        });

        btnActualizarGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnActualizarGira.setText("Actualizar");
        btnActualizarGira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarGiraActionPerformed(evt);
            }
        });

        btnBorrarGira.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBorrarGira.setText("Borrar");
        btnBorrarGira.setPreferredSize(new java.awt.Dimension(79, 23));
        btnBorrarGira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarGiraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBorrarGira, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizarGira)
                .addGap(18, 18, 18)
                .addComponent(btnEditarGira, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarGira, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnEditarGira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAgregarGira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBorrarGira, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnActualizarGira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giras Registradas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        jtableGiras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jtableGiras);

        jPanel3.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarGiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGiraActionPerformed
        // TODO add your handling code here:
        String gir = jtxtNombreGira.getText();
        String prec = jtxtPrecioGira.getText();
        String dist = jtxtDistanciaGira.getText();
        String fechG = jtxtFechaGira.getText();
        
        if(gir.contentEquals("") || prec.contentEquals("")
            || dist.contentEquals("") || fechG.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios.");
        }else {
            try {
                Date fechg = Date.valueOf(fechG);
                Giras gs =new DAOGiras().Insertar(gir, TOP_ALIGNMENT, TOP_ALIGNMENT, fechg);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego al registro.");
            }
        }
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_btnAgregarGiraActionPerformed

    private void btnEditarGiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGiraActionPerformed
        // TODO add your handling code here:
        int fila = this.jtableGiras.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un regustro de la tabla.");
        }else{
            try {
                int id = Integer.parseInt((String) this.jtableGiras.getValueAt(fila, 0).toString());
                String  nomG = (String) this.jtableGiras.getValueAt(fila,1);
                float precG = Float.parseFloat((String) this.jtableGiras.getValueAt(fila,2));
                float distG = Float.parseFloat((String) this.jtableGiras.getValueAt(fila,3));
                Date fecG = Date.valueOf((String) this.jtableGiras.getValueAt(fila,4). toString());
                
                jtxtIdGira.setText("");
                jtxtNombreGira.setText("");
                jtxtPrecioGira.setText("");
                jtxtDistanciaGira.setText("");
                jtxtFechaGira.setText(String.valueOf(fecG));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEditarGiraActionPerformed

    private void btnActualizarGiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarGiraActionPerformed
        // TODO add your handling code here:
        actualizarGira();
        obtenerDatos();
        LimpiarCampos();
    }//GEN-LAST:event_btnActualizarGiraActionPerformed

    private void btnBorrarGiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarGiraActionPerformed
        // TODO add your handling code here:
        int fila = this.jtableGiras.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione unregistro de la tabla.");
        }else{
            int id = Integer.parseInt((String) this.jtableGiras.getValueAt(fila,0).toString());
            DAOGiras dao = new DAOGiras();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_btnBorrarGiraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarGira;
    private javax.swing.JButton btnAgregarGira;
    private javax.swing.JButton btnBorrarGira;
    private javax.swing.JButton btnEditarGira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableGiras;
    private javax.swing.JTextField jtxtDistanciaGira;
    private javax.swing.JTextField jtxtEncargado;
    private javax.swing.JTextField jtxtFechaGira;
    private javax.swing.JTextField jtxtIdGira;
    private javax.swing.JTextField jtxtNombreGira;
    private javax.swing.JTextField jtxtPrecioGira;
    // End of variables declaration//GEN-END:variables
}
