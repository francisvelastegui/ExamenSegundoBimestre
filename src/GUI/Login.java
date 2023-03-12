package GUI;

import javax.swing.JOptionPane;

import DAC.EncriptDac;
import DAC.UsuarioDac;

/**
 *
 * @author villarrealvelasteguí
 */
public class Login extends javax.swing.JFrame {
    public static final String vvNombre1="Francis Belén Velasteguí Armas";
    public static final String vvCedula1="1754644415";
    public static final String vvNombre2="Carlos Alexander Villarreal Cuenca";
    public static final String vvCedula2="1752817799";

    UsuarioDac vvUsuariosDAC = new UsuarioDac();
   
    public Login() {
        initComponents();
    }

   
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int syIntentos = 0;
    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
       
    }//GEN-LAST:event_txtUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed    

        String syUsername = txtUser.getText();    
        // Obtener la contraseña ingresada por el usuario
    String contrasena = txtPassword.getText();
    
    // Encriptar la contraseña ingresada por el usuario
    String contrasenaEncriptada = EncriptDac.vvEncriptContrasena(contrasena);
    
    // Verificar si el usuario y la contraseña son válidos
    UsuarioDac vvUsuario = new vvUsuarios();
    vvUsuario.vvSetUsuario(txtUser.getText());
    vvUsuario.vvSetContrasena(contrasenaEncriptada);
    UsuarioDac usuariosDAC = new UsuariosDac();
    

    if (usuariosDAC.vvAutenticarUsuario(vvUsuario)) {
            JOptionPane.showMessageDialog(this, "Bienvenido, " + vvUsername + "!");
            Coordenadas frmCoordenadas = new Coordenadas();
            frmCoordenadas.setVisible(true);
            this.setVisible(false);
        } else {
            syIntentos++;
            if (syIntentos < 3) {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos!  Numero de intento: "+vvIntentos+" de 3", "Error", JOptionPane.ERROR_MESSAGE);
             
            } else {
                JOptionPane.showMessageDialog(this, "Ha excedido el número máximo de intentos. El programa se cerrará.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelFondoLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
