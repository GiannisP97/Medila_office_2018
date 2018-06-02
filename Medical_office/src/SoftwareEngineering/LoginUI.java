/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareEngineering;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


/**
 *
 * @author DeRed
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI
     */
    private Border borderc ;
    public LoginUI() {
        initComponents();
        borderc = this.LoginForm_Username.getBorder();
        this.passworderror.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ForgotPassword = new javax.swing.JFrame();
        ForgotPasswordFrame = new javax.swing.JPanel();
        ForgotPasswordForm = new javax.swing.JPanel();
        ForgotPassword_Username = new javax.swing.JTextField();
        ForgotPassword_Password = new javax.swing.JPasswordField();
        ForgotPassword_Submit = new javax.swing.JButton();
        ForgotPassword_Image = new javax.swing.JLabel();
        LoginFrame = new javax.swing.JPanel();
        LoginForm = new javax.swing.JPanel();
        LoginForm_Username = new javax.swing.JTextField();
        LoginForm_Password = new javax.swing.JPasswordField();
        LoginForm_SubmitButton = new javax.swing.JButton();
        LoginForm_ForgotPassword = new javax.swing.JLabel();
        LoginForm_Image = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        passworderror = new javax.swing.JLabel();

        ForgotPassword.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ForgotPassword.setTitle("Ιατρικό Γραφείο");
        ForgotPassword.setName("MainFrame"); // NOI18N
        ForgotPassword.setResizable(false);

        ForgotPasswordFrame.setBackground(new java.awt.Color(204, 204, 255));
        ForgotPasswordFrame.setAlignmentX(0.0F);
        ForgotPasswordFrame.setAlignmentY(0.0F);

        ForgotPasswordForm.setBackground(new java.awt.Color(255, 255, 255));
        ForgotPasswordForm.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        ForgotPasswordForm.setForeground(new java.awt.Color(255, 255, 255));

        ForgotPassword_Username.setBorder(javax.swing.BorderFactory.createTitledBorder("Όνομα Χρήστη"));
        ForgotPassword_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPassword_UsernameActionPerformed(evt);
            }
        });

        ForgotPassword_Submit.setText("Αλλαγή Κωδικού");
        ForgotPassword_Submit.setBorder(new javax.swing.border.MatteBorder(null));
        ForgotPassword_Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPassword_SubmitMouseClicked(evt);
            }
        });
        ForgotPassword_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPassword_SubmitActionPerformed(evt);
            }
        });

        ForgotPassword_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Avatar.png"))); // NOI18N

        javax.swing.GroupLayout ForgotPasswordFormLayout = new javax.swing.GroupLayout(ForgotPasswordForm);
        ForgotPasswordForm.setLayout(ForgotPasswordFormLayout);
        ForgotPasswordFormLayout.setHorizontalGroup(
            ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordFormLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ForgotPassword_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ForgotPassword_Password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ForgotPassword_Username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ForgotPassword_Submit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        ForgotPasswordFormLayout.setVerticalGroup(
            ForgotPasswordFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ForgotPasswordFormLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(ForgotPassword_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ForgotPassword_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ForgotPassword_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ForgotPassword_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout ForgotPasswordFrameLayout = new javax.swing.GroupLayout(ForgotPasswordFrame);
        ForgotPasswordFrame.setLayout(ForgotPasswordFrameLayout);
        ForgotPasswordFrameLayout.setHorizontalGroup(
            ForgotPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordFrameLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(ForgotPasswordForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        ForgotPasswordFrameLayout.setVerticalGroup(
            ForgotPasswordFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordFrameLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ForgotPasswordForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        //jPanel1.setBounds(0,0,new_Height,new_Width*100);

        javax.swing.GroupLayout ForgotPasswordLayout = new javax.swing.GroupLayout(ForgotPassword.getContentPane());
        ForgotPassword.getContentPane().setLayout(ForgotPasswordLayout);
        ForgotPasswordLayout.setHorizontalGroup(
            ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ForgotPasswordFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ForgotPasswordLayout.setVerticalGroup(
            ForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ForgotPasswordFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ιατρικό Γραφείο");
        setName("LoginWindow"); // NOI18N
        setResizable(false);

        LoginFrame.setBackground(new java.awt.Color(204, 204, 255));
        LoginFrame.setAlignmentX(0.0F);
        LoginFrame.setAlignmentY(0.0F);

        LoginForm.setBackground(new java.awt.Color(255, 255, 255));
        javax.swing.border.SoftBevelBorder border = new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED);
        LoginForm.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        LoginForm.setForeground(new java.awt.Color(255, 255, 255));

        LoginForm_Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        LoginForm_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginForm_UsernameFocusGained(evt);
            }
        });

        LoginForm_Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        LoginForm_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginForm_PasswordFocusGained(evt);
            }
        });

        LoginForm_SubmitButton.setText("Σύνδεση");
        LoginForm_SubmitButton.setBorder(new javax.swing.border.MatteBorder(null));
        LoginForm_SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginForm_SubmitButtonMouseClicked(evt);
            }
        });
        LoginForm_SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginForm_SubmitButtonActionPerformed(evt);
            }
        });

        LoginForm_ForgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginForm_ForgotPassword.setText("Ξεχάσατε τον κωδικό σας;");

        LoginForm_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Avatar.png"))); // NOI18N

        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("Όνομα Χρήστη");

        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Κωδικός Πρόσβασης");
        PasswordLabel.setToolTipText("");

        passworderror.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        passworderror.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passworderror.setText("* 6 χαρακτήρες ελάχιστο");
        passworderror.setFocusable(false);

        javax.swing.GroupLayout LoginFormLayout = new javax.swing.GroupLayout(LoginForm);
        LoginForm.setLayout(LoginFormLayout);
        LoginFormLayout.setHorizontalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFormLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passworderror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LoginForm_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginForm_Password, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LoginForm_Username, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LoginForm_SubmitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginForm_ForgotPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        LoginFormLayout.setVerticalGroup(
            LoginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFormLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(LoginForm_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginForm_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginForm_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passworderror)
                .addGap(18, 18, 18)
                .addComponent(LoginForm_SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginForm_ForgotPassword)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout LoginFrameLayout = new javax.swing.GroupLayout(LoginFrame);
        LoginFrame.setLayout(LoginFrameLayout);
        LoginFrameLayout.setHorizontalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFrameLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(LoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        LoginFrameLayout.setVerticalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFrameLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LoginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        //jPanel1.setBounds(0,0,new_Height,new_Width*100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginForm_SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginForm_SubmitButtonActionPerformed
        // TODO add your handling code here:        
        
        
        //VALIDATE USER INPUT
        javax.swing.border.Border tmp = this.LoginForm_Username.getBorder();
        if (this.LoginForm_Username.getText().equals("")){
            //this.UsernameLabel.setText(this.UsernameLabel.getText()+"*");
            
            this.LoginForm_Username.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        //javax.swing.border.Border tmp = this.LoginForm_Username.getBorder();
        if (this.LoginForm_Password.getPassword().length < 6){
            //this.PasswordLabel.setText(this.PasswordLabel.getText()+"*");
            this.passworderror.setVisible(true);
            this.LoginForm_Password.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        
        
        
        
        
    }//GEN-LAST:event_LoginForm_SubmitButtonActionPerformed

    private void LoginForm_SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginForm_SubmitButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LoginForm_SubmitButtonMouseClicked

    private void ForgotPassword_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPassword_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ForgotPassword_UsernameActionPerformed

    private void ForgotPassword_SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPassword_SubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ForgotPassword_SubmitMouseClicked

    private void ForgotPassword_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPassword_SubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ForgotPassword_SubmitActionPerformed

    private void LoginForm_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginForm_UsernameFocusGained
        // TODO add your handling code here:
        this.LoginForm_Username.setBorder(borderc);
    }//GEN-LAST:event_LoginForm_UsernameFocusGained

    private void LoginForm_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginForm_PasswordFocusGained
        // TODO add your handling code here:
        this.LoginForm_Password.setBorder(borderc);
        this.passworderror.setVisible(false);
    }//GEN-LAST:event_LoginForm_PasswordFocusGained

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ForgotPassword;
    private javax.swing.JPanel ForgotPasswordForm;
    private javax.swing.JPanel ForgotPasswordFrame;
    private javax.swing.JLabel ForgotPassword_Image;
    private javax.swing.JPasswordField ForgotPassword_Password;
    private javax.swing.JButton ForgotPassword_Submit;
    private javax.swing.JTextField ForgotPassword_Username;
    private javax.swing.JPanel LoginForm;
    private javax.swing.JLabel LoginForm_ForgotPassword;
    private javax.swing.JLabel LoginForm_Image;
    private javax.swing.JPasswordField LoginForm_Password;
    private javax.swing.JButton LoginForm_SubmitButton;
    private javax.swing.JTextField LoginForm_Username;
    private javax.swing.JPanel LoginFrame;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel passworderror;
    // End of variables declaration//GEN-END:variables
}
