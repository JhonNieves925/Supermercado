package proyecto2;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public boolean mostrar = true;

    public Login() {
        initComponents();
        lblcontraseña.setVisible(true);
        txtmostrar.setVisible(false);
        this.setTitle("Supermercado Cali");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagesrest/super.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblusuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonlogin = new javax.swing.JButton();
        lblcontraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtmostrar = new javax.swing.JTextField();
        mostrarcontra = new java.awt.Checkbox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("Supermercado Cali");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, -1));

        lblusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 102, 140, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        botonlogin.setBackground(new java.awt.Color(204, 204, 204));
        botonlogin.setText("Ingresar");
        botonlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonloginMouseClicked(evt);
            }
        });
        botonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonloginActionPerformed(evt);
            }
        });
        jPanel1.add(botonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 30));

        lblcontraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblcontraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(lblcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Salir");
        jButton1.setMaximumSize(new java.awt.Dimension(76, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(76, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 110, 30));
        jPanel1.add(txtmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, 30));

        mostrarcontra.setBackground(new java.awt.Color(7, 118, 190));
        mostrarcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mostrarcontra.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        mostrarcontra.setLabel("Mostrar contraseña");
        mostrarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarcontraMouseClicked(evt);
            }
        });
        jPanel1.add(mostrarcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesrest/login.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonloginActionPerformed

        String Usuario = "admin";
        String Contraseña = "123";

        String Pass = new String(lblcontraseña.getPassword());

        if (lblusuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {

            interfaz int1 = new interfaz();
            int1.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuario / contraseña incorrectos");
        }


    }//GEN-LAST:event_botonloginActionPerformed

    private void lblusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblusuarioActionPerformed

    private void botonloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonloginMouseClicked

    }//GEN-LAST:event_botonloginMouseClicked

    private void lblcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblcontraseñaActionPerformed

    }//GEN-LAST:event_lblcontraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mostrarcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarcontraMouseClicked
        
        if(mostrar)
        {
        txtmostrar.setVisible(true);
        lblcontraseña.setVisible(false);
        txtmostrar.setText(lblcontraseña.getText());
        mostrar = false;
        } else{
         txtmostrar.setVisible(false);
        lblcontraseña.setVisible(true);
        lblcontraseña.setText(txtmostrar.getText());
        mostrar = true;
        }
    }//GEN-LAST:event_mostrarcontraMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField lblcontraseña;
    public javax.swing.JTextField lblusuario;
    private java.awt.Checkbox mostrarcontra;
    private javax.swing.JTextField txtmostrar;
    // End of variables declaration//GEN-END:variables
}
