package Capa_Presentacion;

import Capa_Negocio.DataArticulo;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormularioArticulo extends javax.swing.JFrame {

    public FormularioArticulo() {
        initComponents();
        this.setSize(1100, 500);
        ListarArticulos();
        JBtGrabar.setEnabled(false);
    }

    public void ListarArticulos() {
        DefaultTableModel tabla = new DefaultTableModel();
        DataArticulo objart = new DataArticulo();
        ArrayList<DataArticulo> lista2 = new ArrayList();
        lista2 = objart.ListaArticulos();
        tabla.addColumn("Codigo");
        tabla.addColumn("Nombre");
        tabla.addColumn("Unidad");
        tabla.addColumn("Precio");
        tabla.addColumn("Stock");
        tabla.addColumn("Marca");
        tabla.setRowCount(lista2.size());
        int i = 0;
        for (DataArticulo x : lista2) {
            tabla.setValueAt(x.getArt_cod(), i, 0);
            tabla.setValueAt(x.getArt_nom(), i, 1);
            tabla.setValueAt(x.getArt_uni(), i, 2);
            tabla.setValueAt(x.getArt_pre(), i, 3);
            tabla.setValueAt(x.getArt_stk(), i, 4);
            tabla.setValueAt(x.getArt_marca(), i, 5);
            i++;

        }
        this.jTable1.setModel(tabla);
    }

    public void LimpiarCajasTexto() {
        this.JtfPrecio.setText("");
        this.JtfNombre.setText("");
        this.JtfUdeMedida.setText("");
        this.JtfPrecio.setText("");
        this.JtfCantidad.setText("");
        this.JtfMarca.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JtfCodigo1 = new javax.swing.JTextField();
        JlbNombre = new javax.swing.JLabel();
        JlbCodigo = new javax.swing.JLabel();
        JlbUdeMedida = new javax.swing.JLabel();
        JlbPrecio = new javax.swing.JLabel();
        JlbCantidad = new javax.swing.JLabel();
        JlbMarca = new javax.swing.JLabel();
        JBtNuevo = new javax.swing.JButton();
        JBtGrabar = new javax.swing.JButton();
        JBtModificar = new javax.swing.JButton();
        JBtEliminar = new javax.swing.JButton();
        JtfNombre = new javax.swing.JTextField();
        JtfUdeMedida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBtSalir = new javax.swing.JButton();
        JtfPrecio = new javax.swing.JTextField();
        JtfCodigo = new javax.swing.JTextField();
        JtfCantidad = new javax.swing.JTextField();
        JtfMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JlbNombre.setText("Nombre:");

        JlbCodigo.setText("Codigo:");

        JlbUdeMedida.setText("Unidad Medida:");

        JlbPrecio.setText("Precio:");

        JlbCantidad.setText("Cantidad:");

        JlbMarca.setText("Marca:");

        JBtNuevo.setText("Nuevo");
        JBtNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtNuevoActionPerformed(evt);
            }
        });

        JBtGrabar.setText("Grabar");
        JBtGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtGrabarActionPerformed(evt);
            }
        });

        JBtModificar.setText("Modificar");
        JBtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtModificarActionPerformed(evt);
            }
        });

        JBtEliminar.setText("Eliminar");
        JBtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtEliminarActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JBtSalir.setText("Salir");
        JBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JlbCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JlbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JlbUdeMedida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JlbCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JlbMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JlbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JtfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JtfCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JtfUdeMedida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBtNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBtSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JlbCodigo)
                                .addGap(25, 25, 25)
                                .addComponent(JlbNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(JlbUdeMedida))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JtfUdeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlbPrecio)
                            .addComponent(JtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlbCantidad)
                            .addComponent(JtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlbMarca)
                            .addComponent(JtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBtSalir)
                            .addComponent(JBtEliminar)
                            .addComponent(JBtModificar)
                            .addComponent(JBtGrabar)
                            .addComponent(JBtNuevo)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtGrabarActionPerformed
        DataArticulo objart = new DataArticulo();
        objart.setArt_cod(this.JtfCodigo.getText());
        objart.setArt_nom(this.JtfNombre.getText());
        objart.setArt_uni(this.JtfUdeMedida.getText());
        objart.setArt_pre(Double.parseDouble(this.JtfPrecio.getText()));
        objart.setArt_stk(Integer.parseInt(this.JtfCantidad.getText()));
        objart.setArt_marca(this.JtfMarca.getText());
        JOptionPane.showMessageDialog(null, objart.GrabarArticulo());
        ListarArticulos();
    }//GEN-LAST:event_JBtGrabarActionPerformed

    private void JBtNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtNuevoActionPerformed
        LimpiarCajasTexto();
        JBtGrabar.setEnabled(true);
    }//GEN-LAST:event_JBtNuevoActionPerformed

    private void JBtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtModificarActionPerformed
        DataArticulo objart = new DataArticulo();
        objart.setArt_cod(this.JtfCodigo.getText());
        objart.setArt_nom(this.JtfNombre.getText());
        objart.setArt_uni(this.JtfUdeMedida.getText());
        objart.setArt_pre(Double.parseDouble(this.JtfPrecio.getText()));
        objart.setArt_stk(Integer.parseInt(this.JtfCantidad.getText()));
        objart.setArt_marca(this.JtfMarca.getText());
        JOptionPane.showMessageDialog(null, objart.EditarArticulo());
        ListarArticulos();
    }//GEN-LAST:event_JBtModificarActionPerformed

    private void JBtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtEliminarActionPerformed
        int Res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el articulo: " + this.JtfCodigo.getText());
        if (Res == 0) {
            DataArticulo objart = new DataArticulo();
            objart.setArt_cod(this.JtfCodigo.getText());
            if(objart.EliminarArticulo().equals("0")){
                JOptionPane.showMessageDialog(null, "Se afectaron 0 filas");
            } else {
                JOptionPane.showMessageDialog(null, "Se afectaron 1 filas");
                ListarArticulos();
                JOptionPane.showMessageDialog(null, "Articulo Eliminado");
            }
            
            
        }
    }//GEN-LAST:event_JBtEliminarActionPerformed

    private void JBtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtSalirActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere salir?");
        if (r == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_JBtSalirActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        int rec = this.jTable1.getSelectedRow();
        this.JtfCodigo.setText(jTable1.getValueAt(rec, 0).toString());
        this.JtfNombre.setText(jTable1.getValueAt(rec, 1).toString());
        this.JtfUdeMedida.setText(jTable1.getValueAt(rec, 2).toString());
        this.JtfPrecio.setText(jTable1.getValueAt(rec, 3).toString());
        this.JtfCantidad.setText(jTable1.getValueAt(rec, 4).toString());
        this.JtfMarca.setText(jTable1.getValueAt(rec, 5).toString());

    }//GEN-LAST:event_jTable1MousePressed

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
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtEliminar;
    private javax.swing.JButton JBtGrabar;
    private javax.swing.JButton JBtModificar;
    private javax.swing.JButton JBtNuevo;
    private javax.swing.JButton JBtSalir;
    private javax.swing.JLabel JlbCantidad;
    private javax.swing.JLabel JlbCodigo;
    private javax.swing.JLabel JlbMarca;
    private javax.swing.JLabel JlbNombre;
    private javax.swing.JLabel JlbPrecio;
    private javax.swing.JLabel JlbUdeMedida;
    private javax.swing.JTextField JtfCantidad;
    private javax.swing.JTextField JtfCodigo;
    private javax.swing.JTextField JtfCodigo1;
    private javax.swing.JTextField JtfMarca;
    private javax.swing.JTextField JtfNombre;
    private javax.swing.JTextField JtfPrecio;
    private javax.swing.JTextField JtfUdeMedida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
