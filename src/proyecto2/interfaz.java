package proyecto2;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class interfaz extends javax.swing.JFrame {

    String productos[] = {"Arroz lbr", "Cafe lbr", "Sal lbr", "Azucar lbr", "Lata atun", "Paquete Galletas", "Leche 1ltr", "Pan tajado"};
    double precios[] = {2.000, 3.000, 1.800, 2.000, 5.000, 3.800, 3.000, 4.800,};
    double precio = 0;
    int cantidad = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<main> listaVentas = new ArrayList<main>();

    public interfaz() {
        initComponents();
        this.setTitle("Supermercado Cali");

        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagesrest/super.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel combomodel = new DefaultComboBoxModel(productos);
        cboproducto.setModel(combomodel);
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
        actualizarTabla();
        calcularprecio();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        lblimporte = new javax.swing.JLabel();
        cboproducto = new javax.swing.JComboBox<>();
        lblcantidad = new javax.swing.JSpinner();
        btnagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltabla = new javax.swing.JTable();
        lblsubtotal = new javax.swing.JLabel();
        lbliva = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        imprimirfactura = new javax.swing.JButton();
        sesioncerrar = new javax.swing.JButton();
        nvaventa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        deleteproduct = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Supermercado Cali");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 350, 40));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Importe");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        lblprecio.setForeground(new java.awt.Color(0, 0, 0));
        lblprecio.setText("$0.0COP");
        getContentPane().add(lblprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        lblimporte.setForeground(new java.awt.Color(0, 0, 0));
        lblimporte.setText("$0.0COP");
        getContentPane().add(lblimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 60, 20));

        cboproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lblcantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        lblcantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lblcantidadStateChanged(evt);
            }
        });
        getContentPane().add(lblcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 112, -1, 30));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        tbltabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbltabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 140));

        lblsubtotal.setForeground(new java.awt.Color(0, 0, 0));
        lblsubtotal.setText("$0.00COP");
        getContentPane().add(lblsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 60, 20));

        lbliva.setForeground(new java.awt.Color(0, 0, 0));
        lbliva.setText("$0.00COP");
        getContentPane().add(lbliva, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        lbltotal.setForeground(new java.awt.Color(0, 0, 0));
        lbltotal.setText("$0.00COP");
        getContentPane().add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("SubTotal");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("IVA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Total");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        imprimirfactura.setText("Imprimir   ");
        imprimirfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(imprimirfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 130, 20));

        sesioncerrar.setText("Cerrar Sesion");
        sesioncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesioncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(sesioncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 120, 30));

        nvaventa.setText("Nueva venta   ");
        nvaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvaventaActionPerformed(evt);
            }
        });
        getContentPane().add(nvaventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, 20));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 100, 30));

        deleteproduct.setText("Borrar Producto");
        deleteproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteproductActionPerformed(evt);
            }
        });
        getContentPane().add(deleteproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrest/factura.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproductoActionPerformed
        calcularprecio();
    }//GEN-LAST:event_cboproductoActionPerformed

    private void lblcantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lblcantidadStateChanged
        calcularprecio();
    }//GEN-LAST:event_lblcantidadStateChanged

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        main venta = new main();
        venta.setId(cboproducto.getSelectedIndex());
        venta.setDescripcion(cboproducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio * cantidad);
        if (!buscarVenta(venta)) {
            listaVentas.add(venta);
            //modelo.getDataVector().set(tbltabla.getSelectedRow(),venta);
            tbltabla.updateUI();
        }

        actualizarTabla();
        borrarventa();

    }//GEN-LAST:event_btnagregarActionPerformed

    private void imprimirfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirfacturaActionPerformed

        try {
            FileWriter salvar = new FileWriter("archivo.txt");

            salvar.write("-----------------");
            salvar.write("SUPERMERCADO CALI ");
            salvar.write("-----------------\n\n");

            for (int i = 0; i < this.tbltabla.getRowCount(); i++) {

                salvar.write("-----------------\n");
                salvar.write(modelo.getValueAt(i, 0).toString() + "\n");
                salvar.write(modelo.getValueAt(i, 1).toString() + "\n");
                salvar.write("Cantidad: ");
                salvar.write(modelo.getValueAt(i, 2).toString() + "\n");
                salvar.write(modelo.getValueAt(i, 3).toString() + "\n\n\n");

            }
            salvar.write(jLabel11.getText().toString() + "  ");
            salvar.write(lblsubtotal.getText().toString() + "\n");

            salvar.write(jLabel12.getText().toString() + "  ");
            salvar.write(lbliva.getText().toString() + "\n");

            salvar.write(jLabel13.getText().toString() + "  ");
            salvar.write(lbltotal.getText().toString() + "\n\n");

            salvar.write(" Agradecemos su compra en Supermercado Cali \n AVISO!! Por favor verificar que su factura este en orden ");
            salvar.close();
            JOptionPane.showMessageDialog(null, "Datos Guardados correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }


    }//GEN-LAST:event_imprimirfacturaActionPerformed

    private void sesioncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesioncerrarActionPerformed
        Login v2 = new Login();
        this.setVisible(false);
        v2.setVisible(true);
    }//GEN-LAST:event_sesioncerrarActionPerformed

    private void nvaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvaventaActionPerformed

        modelo.getDataVector().removeAllElements();
        tbltabla.updateUI();
        calcularprecio();

    }//GEN-LAST:event_nvaventaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteproductActionPerformed

        if (tbltabla.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Seleccione fila");
        else {

            modelo.removeRow(tbltabla.getSelectedRow());
            return;

        }
    }//GEN-LAST:event_deleteproductActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JComboBox<String> cboproducto;
    private javax.swing.JButton deleteproduct;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton imprimirfactura;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner lblcantidad;
    private javax.swing.JLabel lblimporte;
    private javax.swing.JLabel lbliva;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JButton nvaventa;
    private javax.swing.JButton sesioncerrar;
    private javax.swing.JTable tbltabla;
    // End of variables declaration//GEN-END:variables

    private void calcularprecio() {
        precio = precios[cboproducto.getSelectedIndex()];
        cantidad = Integer.parseInt(lblcantidad.getValue().toString());
        lblprecio.setText(aMoneda(precio));
        lblimporte.setText(aMoneda(precio * cantidad));
    }

    private String aMoneda(double precio) {
        return "$ " + Math.round(precio * 100.0) / 100.0 + "COP";
    }

    private void actualizarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        double subtotal = 0;
        for (main v : listaVentas) {
            Object x[] = new Object[4];
            x[0] = v.getDescripcion();
            x[1] = aMoneda(v.getPrecio());
            x[2] = v.getCantidad();
            x[3] = aMoneda(v.getImporte());
            subtotal += v.getImporte();
            modelo.addRow(x);
        }
        double iva = subtotal * 0.19;
        double total = subtotal + iva;
        lblsubtotal.setText(aMoneda(subtotal));
        lbliva.setText(aMoneda(iva));
        lbltotal.setText(aMoneda(total));
        tbltabla.setModel(modelo);

    }

    private void borrarventa() {
        precio = 0;
        cantidad = 1;
        cboproducto.setSelectedIndex(0);
        lblcantidad.setValue(1);
        calcularprecio();
    }

    public boolean buscarVenta(main nueva) {
        for (main v : listaVentas) {
            if (v.getId() == nueva.getId()) {
                int nuevaCantidad = v.getCantidad() + nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio() * nuevaCantidad);
                return true;
            }
        }
        return false;
    }

}
