/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swelab;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 10
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }
    public void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userntf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dobtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        gencom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pntf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addresstf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pctf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        conpf = new javax.swing.JPasswordField();
        pwdf = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 153, 153));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel11.setText("NAME");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 67, 21));

        nametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nametfKeyReleased(evt);
            }
        });
        panel.add(nametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 243, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel1.setText("USERNAME");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 75, -1));

        userntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userntfActionPerformed(evt);
            }
        });
        userntf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userntfKeyReleased(evt);
            }
        });
        panel.add(userntf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 243, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel2.setText("EMAIL ID");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 95, 22));

        emailtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtfActionPerformed(evt);
            }
        });
        emailtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailtfKeyReleased(evt);
            }
        });
        panel.add(emailtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 243, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel3.setText("PHONE NUMBER");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 111, 22));

        dobtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dobtfKeyReleased(evt);
            }
        });
        panel.add(dobtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 243, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 94, 32));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel4.setText("GENDER");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 66, 24));

        gencom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        gencom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gencomKeyReleased(evt);
            }
        });
        panel.add(gencom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 243, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel5.setText("DATE OF BIRTH");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 101, 24));

        pntf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pntfKeyReleased(evt);
            }
        });
        panel.add(pntf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 243, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel6.setText("ADDRESS");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 94, 29));

        addresstf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addresstfKeyReleased(evt);
            }
        });
        panel.add(addresstf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 243, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel7.setText("PIN CODE");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 113, 29));

        pctf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pctfKeyReleased(evt);
            }
        });
        panel.add(pctf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 243, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel8.setText("SET PASSWORD");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 23));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel9.setText("CONFIRM PASSWORD");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 135, 23));

        conpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                conpfKeyReleased(evt);
            }
        });
        panel.add(conpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 243, -1));

        pwdf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pwdfKeyReleased(evt);
            }
        });
        panel.add(pwdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 243, -1));

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, 10));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 10));

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 10));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 230, 10));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, 10));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 230, 10));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 230, 10));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 230, 10));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 230, 10));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 230, 10));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 230, 10));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtfActionPerformed

    private void userntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userntfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nametf.getText().trim().isEmpty() && emailtf.getText().trim().isEmpty() && addresstf.getText().trim().isEmpty() && pwdf.getText().trim().isEmpty() && userntf.getText().trim().isEmpty() && dobtf.getText().trim().isEmpty() && pntf.getText().trim().isEmpty() && pctf.getText().trim().isEmpty() && conpf.getText().trim().isEmpty()    ){
            jLabel10.setText("This field cannot be empty");
            jLabel14.setText("This field cannot be empty");
            jLabel15.setText("This field cannot be empty");
            jLabel16.setText("This field cannot be empty");
            jLabel17.setText("This field cannot be empty");
            jLabel18.setText("This field cannot be empty");
            jLabel19.setText("This field cannot be empty");
            jLabel20.setText("This field cannot be empty");
            jLabel21.setText("This field cannot be empty");
        }
        else if (nametf.getText().trim().isEmpty()) {
            jLabel10.setText("This field cannot be empty");
        }
        else if (emailtf.getText().trim().isEmpty()){
            jLabel14.setText("This field cannot be empty");
        }
        else if (addresstf.getText().trim().isEmpty()){
            jLabel15.setText("This field cannot be empty");
        }
        else if (pwdf.getText().trim().isEmpty()){
            jLabel16.setText("This field cannot be empty");
        }
        else if (userntf.getText().trim().isEmpty()){
            jLabel17.setText("This field cannot be empty");
        }
        else if (dobtf.getText().trim().isEmpty()){
            jLabel18.setText("This field cannot be empty");
        }
        else if (pntf.getText().trim().isEmpty()){
            jLabel19.setText("This field cannot be empty");
        }
        else if (pctf.getText().trim().isEmpty()){
            jLabel20.setText("This field cannot be empty");
        }
        else if (conpf.getText().trim().isEmpty()){
            jLabel21.setText("This field cannot be empty");
        }
        
            
        
            if(nametf.getText().length()<=0 && emailtf.getText().length()<=0 && addresstf.getText().length()<=0 && pwdf.getText().length()<=0 && userntf.getText().length()<=0 && pntf.getText().length()<=0 && pctf.getText().length()<=0 && dobtf.getText().length()<=0 && conpf.getText().length()<=0 ){
             JOptionPane.showMessageDialog(this, "Registration unsuccessful");   
            } else
            {
                JOptionPane.showMessageDialog(null, "Registration successful, Email containing LibraryID send at "+ emailtf.getText());
                
                Login l2 = new Login();
            l2.show();
            dispose();
            }
           
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nametfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametfKeyReleased
        // TODO add your handling code here:
        jLabel10.setText("");
    }//GEN-LAST:event_nametfKeyReleased

    private void gencomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gencomKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_gencomKeyReleased

    private void emailtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtfKeyReleased
        // TODO add your handling code here:
        jLabel14.setText("");
    }//GEN-LAST:event_emailtfKeyReleased

    private void addresstfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addresstfKeyReleased
        // TODO add your handling code here:
        jLabel15.setText("");
    }//GEN-LAST:event_addresstfKeyReleased

    private void pwdfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdfKeyReleased
        // TODO add your handling code here:
         jLabel16.setText("");
    }//GEN-LAST:event_pwdfKeyReleased

    private void userntfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userntfKeyReleased
        // TODO add your handling code here:
        jLabel17.setText("");
    }//GEN-LAST:event_userntfKeyReleased

    private void dobtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobtfKeyReleased
        // TODO add your handling code here:
        jLabel18.setText("");
    }//GEN-LAST:event_dobtfKeyReleased

    private void pntfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pntfKeyReleased
        // TODO add your handling code here:
        jLabel19.setText("");
    }//GEN-LAST:event_pntfKeyReleased

    private void pctfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pctfKeyReleased
        // TODO add your handling code here:
        jLabel20.setText("");
    }//GEN-LAST:event_pctfKeyReleased

    private void conpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conpfKeyReleased
        // TODO add your handling code here:
        jLabel21.setText("");
    }//GEN-LAST:event_conpfKeyReleased

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstf;
    private javax.swing.JPasswordField conpf;
    private javax.swing.JTextField dobtf;
    private javax.swing.JTextField emailtf;
    private javax.swing.JComboBox<String> gencom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametf;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField pctf;
    private javax.swing.JTextField pntf;
    private javax.swing.JPasswordField pwdf;
    private javax.swing.JTextField userntf;
    // End of variables declaration//GEN-END:variables
}
