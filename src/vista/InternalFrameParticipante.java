/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.sql.Date;
import modelo.DAOPARTICIPANTE;
import modelo.Participante;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class InternalFrameParticipante extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameParticipante
     */
    public InternalFrameParticipante() {
        initComponents();
        setTitle("Registrar Participantes");
        jtxtNumeroLista.setEnabled(false);
    }

    public void LimpirCampos() {

        jtxtNumeroLista.setText("");
        jtxtNombreClienteP1.setText("");
        jtxtNombreClienteP2.setText("");
        comboActividadParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ninguno", "Activo", "Inactivo"}));
        comboEstadoTransporteP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ninguno", "Transporte Propio", "Transporte Contratado"}));
        comboEstadoParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ninguno", "Pago Pendiente", "Pago Realizado"}));
        jtxtEdadClienteP.setText("");
        jtxtNumeroReservaP.setText("");
    }

    public void obtenerDatos() {
        List<Participante> participantes = new DAOPARTICIPANTE().ObtenerDatos();

        DefaultTableModel modelo = new DefaultTableModel();

        String[] columnas = {"Nº Lista", "Primer Nombre", "Segundo Nombre", "Transporte", "Actividad", "Deposito", "Fecha Nac", "Nº Reserva"};

        modelo.setColumnIdentifiers(columnas);

        for (Participante pr : participantes) {
            String[] renglon = {Integer.toString(pr.getNUMERO_LIST()), pr.getNOMBRE_PART1(), pr.getNOMBRE_PART2(),
                pr.getESTADO_P(), pr.getESTADO_DEPO(), pr.getESTADO_TRANSP(),
                pr.getFECHANAC_PART().toString(),
                Integer.toString(pr.getN_RESERVA())};

            modelo.addRow(renglon);
        }
        jtableClientesRegistrados.setModel(modelo);
    }

    public void actualizarParticipantes() {
        int numL = Integer.parseInt(this.jtxtNumeroLista.getText());
        String nomp1 = this.jtxtNombreClienteP1.getText();
        String nomp2 = this.jtxtNombreClienteP2.getText();
        String edp = this.comboEstadoTransporteP.getSelectedItem().toString();
        String actv = this.comboActividadParticipantes.getSelectedItem().toString();
        String ed = this.comboEstadoParticipantes.getSelectedItem().toString();
        Date edadPart = Date.valueOf(this.jtxtEdadClienteP.getText());
        int nreserv = Integer.parseInt(this.jtxtNumeroReservaP.getText());

        DAOPARTICIPANTE dao = new DAOPARTICIPANTE();

        int res = dao.Actualizar(numL, nomp1, nomp2, edp, actv, ed, edadPart, nreserv);

        if (res == 1) {
            JOptionPane.showMessageDialog(rootPane, "Participante Actualizado.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lo sentimos. Ocurrio un ERROR");
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

        jPanel2 = new javax.swing.JPanel();
        btnAgregarReserva = new javax.swing.JButton();
        btnEditarReserva = new javax.swing.JButton();
        btnActualizarReserva = new javax.swing.JButton();
        btnBorrarReserva = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtNumeroLista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombreClienteP1 = new javax.swing.JTextField();
        comboEstadoTransporteP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboActividadParticipantes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtEdadClienteP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtNumeroReservaP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        comboEstadoParticipantes = new javax.swing.JComboBox<>();
        jtxtNombreClienteP2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        panel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableClientesRegistrados = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        btnAgregarReserva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregarReserva.setText("Agregar");
        btnAgregarReserva.setPreferredSize(new java.awt.Dimension(79, 23));
        btnAgregarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarReservaActionPerformed(evt);
            }
        });

        btnEditarReserva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditarReserva.setText("Editar");
        btnEditarReserva.setPreferredSize(new java.awt.Dimension(79, 23));
        btnEditarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarReservaActionPerformed(evt);
            }
        });

        btnActualizarReserva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnActualizarReserva.setText("Actualizar");
        btnActualizarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarReservaActionPerformed(evt);
            }
        });

        btnBorrarReserva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBorrarReserva.setText("Borrar");
        btnBorrarReserva.setPreferredSize(new java.awt.Dimension(79, 23));
        btnBorrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarReservaActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBorrarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarReserva)
                .addGap(18, 18, 18)
                .addComponent(btnEditarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 260, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 261, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 260, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 261, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnEditarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAgregarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBorrarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnActualizarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Participantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Nº Lista");

        jtxtNumeroLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Primer Nombre");

        jtxtNombreClienteP1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        comboEstadoTransporteP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Transporte Propio", "Transporte Contratado" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Estado de transporte");

        comboActividadParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Activo", "Inactivo" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Actividad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Estado Deposito");

        jtxtEdadClienteP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Fecha de nacimiento");

        jtxtNumeroReservaP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Nº Reserva");

        comboEstadoParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Pago Pendiente", "Pago Realizado" }));

        jtxtNombreClienteP2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Segundo Nombre");

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 3, 12)); // NOI18N
        jLabel1.setText("Part'e Perro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtxtNumeroLista, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtxtNumeroReservaP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(comboEstadoTransporteP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(comboActividadParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboEstadoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jtxtEdadClienteP, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                    .addComponent(jtxtNombreClienteP2)
                                    .addComponent(jtxtNombreClienteP1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumeroLista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jtxtNumeroReservaP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtNombreClienteP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtNombreClienteP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtEdadClienteP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstadoTransporteP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboActividadParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstadoParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Participantes Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jtableClientesRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4", "Título 5", "Título 6", "Título 7"
            }
        ));
        jScrollPane2.setViewportView(jtableClientesRegistrados);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarReservaActionPerformed
        // TODO add your handling code here:
        String nomb1 = jtxtNombreClienteP1.getText();
        String nomb2 = jtxtNombreClienteP2.getText();
        String estTrans = comboEstadoTransporteP.getSelectedItem().toString();
        String act = comboActividadParticipantes.getSelectedItem().toString();
        String estDepo = comboEstadoParticipantes.getSelectedItem().toString();
        String edad = jtxtEdadClienteP.getText();
        String nreser = jtxtNumeroReservaP.getText();

        if (nreser.contentEquals("") || nomb1.contentEquals("") || nomb2.contentEquals("") || edad.contentEquals("") || estTrans.contentEquals("")
                || act.contentEquals("") || estDepo.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "No se realizo ningun cambio.");
        } else {
            try {
                
                String estadoT = comboEstadoTransporteP.getSelectedItem().toString();
                String actividad = comboActividadParticipantes.getSelectedItem().toString();
                String estadoDepo = comboEstadoParticipantes.getSelectedItem().toString();
                Date edadP = Date.valueOf(edad);
                int nr = Integer.valueOf(nreser);

                Participante pts = new DAOPARTICIPANTE().Insertar(nomb1, nomb2, estadoT, actividad, estadoDepo, edadP, nr);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado.");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro.");
            }
        }
        obtenerDatos();
        LimpirCampos();
    }//GEN-LAST:event_btnAgregarReservaActionPerformed

    private void btnEditarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarReservaActionPerformed
        // TODO add your handling code here:
        int fila = this.jtableClientesRegistrados.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un participante de la tabla.");
        } else {
            try {
                int numList = Integer.parseInt((String) this.jtableClientesRegistrados.getValueAt(fila, 0));
                String nomP1 = (String) this.jtableClientesRegistrados.getValueAt(fila, 1);
                String nomP2 = (String) this.jtableClientesRegistrados.getValueAt(fila, 2);
                String estT = (String) this.jtableClientesRegistrados.getValueAt(fila, 3).toString();
                String acti = (String) this.jtableClientesRegistrados.getValueAt(fila, 4).toString();
                String estDepo = (String) this.jtableClientesRegistrados.getValueAt(fila, 5).toString();
                Date edadPart = Date.valueOf((String) this.jtableClientesRegistrados.getValueAt(fila, 6).toString());
                int nreserva = Integer.parseInt((String) this.jtableClientesRegistrados.getValueAt(fila, 7));

                jtxtNumeroLista.setText("" + numList);
                jtxtNombreClienteP1.setText(nomP1);
                jtxtNombreClienteP2.setText(nomP2);
                comboEstadoTransporteP.setSelectedItem(estT);
                comboActividadParticipantes.setSelectedItem(acti);
                comboEstadoParticipantes.setSelectedItem(estDepo);
                jtxtEdadClienteP.setText(String.valueOf(edadPart));
                jtxtNumeroReservaP.setText(String.valueOf(nreserva));
                

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEditarReservaActionPerformed

    private void btnActualizarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarReservaActionPerformed
        // TODO add your handling code here:
        actualizarParticipantes();
        obtenerDatos();
        LimpirCampos();
    }//GEN-LAST:event_btnActualizarReservaActionPerformed

    private void btnBorrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarReservaActionPerformed
        // TODO add your handling code here:
        int fila = this.jtableClientesRegistrados.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un participante de la tabla.");
        } else {
            int num = Integer.parseInt((String) this.jtableClientesRegistrados.getValueAt(fila, 0));

            DAOPARTICIPANTE dao = new DAOPARTICIPANTE();
            dao.Eliminar(num);
            obtenerDatos();
        }
    }//GEN-LAST:event_btnBorrarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarReserva;
    private javax.swing.JButton btnAgregarReserva;
    private javax.swing.JButton btnBorrarReserva;
    private javax.swing.JButton btnEditarReserva;
    private javax.swing.JComboBox<String> comboActividadParticipantes;
    private javax.swing.JComboBox<String> comboEstadoParticipantes;
    private javax.swing.JComboBox<String> comboEstadoTransporteP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jtableClientesRegistrados;
    private javax.swing.JTextField jtxtEdadClienteP;
    private javax.swing.JTextField jtxtNombreClienteP1;
    private javax.swing.JTextField jtxtNombreClienteP2;
    private javax.swing.JTextField jtxtNumeroLista;
    private javax.swing.JTextField jtxtNumeroReservaP;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
