package GUI;

import javax.swing.JOptionPane;

import BL.Entities.Usuario;
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

        panelFondoLogin = new javax.swing.JPanel();
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

        javax.swing.GroupLayout panelFondoLoginLayout = new javax.swing.GroupLayout(panelFondoLogin);
        panelFondoLogin.setLayout(panelFondoLoginLayout);
        panelFondoLoginLayout.setHorizontalGroup(
            panelFondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLoginLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(panelFondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLoginLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(234, 234, 234))
        );
        panelFondoLoginLayout.setVerticalGroup(
            panelFondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLoginLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(223, Short.MAX_VALUE))
        );

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

    private int vvIntentos = 0;
    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
       
    }//GEN-LAST:event_txtUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed    

        String vvUsername = txtUser.getText();    
        // Obtener la contraseña ingresada por el usuario
    String vvContrasena = txtPassword.getText();
    
    // Encriptar la contraseña ingresada por el usuario
    String vvContrasenaEncript = EncriptDac.vvEncriptContrasena(vvContrasena);
    
    // Verificar si el usuario y la contraseña son válidos
    Usuario vvUsuario = new Usuario();
    vvUsuario.vvSetUsuario(txtUser.getText());
    vvUsuario.vvSetContrasena(vvContrasenaEncript);
    UsuarioDac usuariosDac = new UsuarioDac();
    

    if (usuariosDac.vvVerificar(vvUsuario)) {
            JOptionPane.showMessageDialog(this, "Bienvenido, " + vvUsername + "!");
            Coordenadas vvCoordenadas = new Coordenadas();
            vvCoordenadas.setVisible(true);
            this.setVisible(false);
        } else {
            vvIntentos++;
            if (vvIntentos < 3) {
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
