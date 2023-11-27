/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.AgregarDao;
import Controlador.Rellenado;
import Modelo.AgregarAclara;
import javax.swing.JOptionPane;

/**
 *
 * @author RaccoonCaffeine
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    private Rellenado re = new Rellenado();
    private AgregarDao agreDao = new AgregarDao();

    public Agregar() {
        initComponents();
        re.RellenarCombo("PRODUCTO", "NOMBRE_PRODUCTO", cbProducto);
        re.RellenarCombo("MOTIVO", "DESCRIPCION_MOTIVO", cbMotivo);
        re.NroOrden(txtNroIngreso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDeudaGroup = new javax.swing.ButtonGroup();
        jlNroIngreso = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlRut = new javax.swing.JLabel();
        jlInstBancaria = new javax.swing.JLabel();
        jlProducto = new javax.swing.JLabel();
        jlMotivo = new javax.swing.JLabel();
        jlTipoDeuda = new javax.swing.JLabel();
        jlRazon = new javax.swing.JLabel();
        txtNroIngreso = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtInstBancaria = new javax.swing.JTextField();
        cbProducto = new javax.swing.JComboBox<>();
        cbMotivo = new javax.swing.JComboBox<>();
        rbDirecta = new javax.swing.JRadioButton();
        rbIndirecta = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRazon = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlNroIngreso.setText("Nro ingreso");

        jlNombre.setText("Nombre");

        jlRut.setText("Rut");

        jlInstBancaria.setText("Institucion Bancaria");

        jlProducto.setText("Producto");

        jlMotivo.setText("Motivo");

        jlTipoDeuda.setText("Tipo Deuda");

        jlRazon.setText("Razon");

        txtNroIngreso.setEditable(false);
        txtNroIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroIngresoActionPerformed(evt);
            }
        });

        cbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opción" }));

        cbMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una opcion" }));

        tipoDeudaGroup.add(rbDirecta);
        rbDirecta.setText("Directa");
        rbDirecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDirectaActionPerformed(evt);
            }
        });

        tipoDeudaGroup.add(rbIndirecta);
        rbIndirecta.setText("Indirecta");
        rbIndirecta.setToolTipText("");

        txtAreaRazon.setColumns(20);
        txtAreaRazon.setRows(5);
        jScrollPane1.setViewportView(txtAreaRazon);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        jLabel1.setText("(*)");

        jLabel2.setText("(*)");

        jLabel3.setText("(*)");

        jLabel4.setText("(*)");

        jLabel5.setText("(*)");

        jLabel6.setText("(*)");

        jLabel7.setText("(*)");

        jLabel8.setText("(*)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlInstBancaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNroIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTipoDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNroIngreso)
                            .addComponent(txtNombre)
                            .addComponent(txtRut)
                            .addComponent(txtInstBancaria)
                            .addComponent(cbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMotivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbDirecta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbIndirecta))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNroIngreso)
                    .addComponent(txtNroIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInstBancaria)
                    .addComponent(txtInstBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProducto)
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMotivo)
                    .addComponent(cbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoDeuda)
                    .addComponent(rbDirecta)
                    .addComponent(rbIndirecta)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlRazon)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbDirectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDirectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDirectaActionPerformed

    private void txtNroIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroIngresoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            String rut = txtRut.getText().trim();
            String nombre = txtNombre.getText().trim();
            String banco = txtInstBancaria.getText().trim();
            String razon = txtAreaRazon.getText().trim();
            int producto = cbProducto.getSelectedIndex();
            int motivo = cbMotivo.getSelectedIndex();
            int tipoDeuda;
            if (rbDirecta.isSelected()) {
                tipoDeuda = 1;
            } else {
                tipoDeuda = 2;
            }
            try {
                AgregarAclara objAgre = new AgregarAclara(rut, nombre, banco, razon, producto, motivo, tipoDeuda);
                String mensaje = agreDao.insertarDatos(objAgre);
                JOptionPane.showMessageDialog(null, mensaje);
                this.limpiar();
                re.NroOrden(txtNroIngreso);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO se guardo en base datos");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiar() {
        txtNombre.setText("");
        txtRut.setText("");
        txtInstBancaria.setText("");
        cbProducto.setSelectedIndex(0);
        cbMotivo.setSelectedIndex(0);
        txtAreaRazon.setText("");
        tipoDeudaGroup.clearSelection();
        tipoDeudaGroup.getSelection();
    }

    private boolean validar() {
        boolean seleccion = rbDirecta.isSelected() || rbIndirecta.isSelected();
        boolean flag = true;
        if (txtNombre.getText().trim().length() == 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Error: Ingrese su nombre");
        }
        if (txtRut.getText().trim().length() == 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Error: Ingrese su rut");
        }
        if (txtInstBancaria.getText().trim().length() == 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Error: Ingrese insitucion bancaria");
        }
        if (cbProducto.getSelectedIndex() == 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Error: Seleccione un producto");
        }
        if (cbMotivo.getSelectedIndex() == 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Error: Seleccione un motivo");
        }
        if (seleccion == false) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Error: Seleccione su tipo de deuda");
        }
        if (txtAreaRazon.getText().trim().length() == 0) {
            flag = false;
            JOptionPane.showMessageDialog(null, "Error: Ingrese una razon");
        }
        return flag;
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
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbMotivo;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlInstBancaria;
    private javax.swing.JLabel jlMotivo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNroIngreso;
    private javax.swing.JLabel jlProducto;
    private javax.swing.JLabel jlRazon;
    private javax.swing.JLabel jlRut;
    private javax.swing.JLabel jlTipoDeuda;
    private javax.swing.JRadioButton rbDirecta;
    private javax.swing.JRadioButton rbIndirecta;
    private javax.swing.ButtonGroup tipoDeudaGroup;
    private javax.swing.JTextArea txtAreaRazon;
    private javax.swing.JTextField txtInstBancaria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroIngreso;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
