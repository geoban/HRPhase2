
import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ideapad 520
 */
public class chooseLogin extends javax.swing.JFrame {

    /**
     * Creates new form chooseLogin
     */
    public chooseLogin() {
        initComponents();
        this.setResizable(false);
        //making it center       
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jButton_general = new javax.swing.JButton();
        jButton_instituional = new javax.swing.JButton();
        jButton_trading = new javax.swing.JButton();
        jButton_finance = new javax.swing.JButton();
        jButton_human = new javax.swing.JButton();
        jButton_assets = new javax.swing.JButton();
        jButton_info = new javax.swing.JButton();
        jButton_public = new javax.swing.JButton();
        jButton_administrative = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_security = new javax.swing.JButton();
        jButton1_chief = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 51));
        kGradientPanel1.setkGradientFocus(357);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 0));

        jButton_general.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_general.setText("General Service Unit");
        jButton_general.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_general.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_general.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_generalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_generalMouseExited(evt);
            }
        });
        jButton_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generalActionPerformed(evt);
            }
        });

        jButton_instituional.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_instituional.setText("<html>Instituional Development and<br/> Extension Services Unit</html>");
        jButton_instituional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_instituional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_instituional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_instituionalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_instituionalMouseExited(evt);
            }
        });

        jButton_trading.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_trading.setText("Trading Operations Division");
        jButton_trading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_trading.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_trading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_tradingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_tradingMouseExited(evt);
            }
        });

        jButton_finance.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_finance.setText("Finance Division");
        jButton_finance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_finance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_finance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_financeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_financeMouseExited(evt);
            }
        });

        jButton_human.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_human.setText("<html>Human Resource<br/> Management Unit</html>");
        jButton_human.setActionCommand("<html>Human Resource<br/> Management Unit</html>");
        jButton_human.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_human.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_human.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_humanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_humanMouseExited(evt);
            }
        });

        jButton_assets.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_assets.setText("<html>Assets and Amenities <br/>Management Division</html>");
        jButton_assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_assets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_assetsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_assetsMouseExited(evt);
            }
        });

        jButton_info.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_info.setText("<html>Information and Communication <br/>Technology Management <br/>Information System Unit</html>");
        jButton_info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_infoMouseExited(evt);
            }
        });

        jButton_public.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_public.setText("Public Relations Unit");
        jButton_public.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_public.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_public.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_publicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_publicMouseExited(evt);
            }
        });

        jButton_administrative.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_administrative.setText("Administrative Division");
        jButton_administrative.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_administrative.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_administrative.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_administrativeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_administrativeMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please Choose a Division to Login ");

        jButton_security.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton_security.setText("Security Unit");
        jButton_security.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_security.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_securityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_securityMouseExited(evt);
            }
        });

        jButton1_chief.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton1_chief.setText("Chief Operator");
        jButton1_chief.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1_chief.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_chief.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_chiefMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_chiefMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_chiefMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1_chief, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_instituional, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_human, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_administrative, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_public, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_assets)
                            .addComponent(jButton_trading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_finance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_info, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_security, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_info)
                    .addComponent(jButton1_chief, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_instituional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_assets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_trading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_human, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_administrative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_general, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_public, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_finance, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton_security, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_generalActionPerformed

    private void jButton1_chiefMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_chiefMouseEntered
        jButton1_chief.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton1_chiefMouseEntered

    private void jButton1_chiefMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_chiefMouseExited
        jButton1_chief.setBackground(Color.white);
    }//GEN-LAST:event_jButton1_chiefMouseExited

    private void jButton_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_infoMouseEntered
        jButton_info.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_infoMouseEntered

    private void jButton_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_infoMouseExited
        jButton_info.setBackground(Color.white);
    }//GEN-LAST:event_jButton_infoMouseExited

    private void jButton_instituionalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_instituionalMouseEntered
        jButton_instituional.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_instituionalMouseEntered

    private void jButton_instituionalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_instituionalMouseExited
        jButton_instituional.setBackground(Color.white);
    }//GEN-LAST:event_jButton_instituionalMouseExited

    private void jButton_assetsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_assetsMouseEntered
        jButton_assets.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_assetsMouseEntered

    private void jButton_assetsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_assetsMouseExited
        jButton_assets.setBackground(Color.white);
    }//GEN-LAST:event_jButton_assetsMouseExited

    private void jButton_humanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_humanMouseEntered
        jButton_human.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_humanMouseEntered

    private void jButton_humanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_humanMouseExited
        jButton_human.setBackground(Color.white);
    }//GEN-LAST:event_jButton_humanMouseExited

    private void jButton_tradingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_tradingMouseEntered
        jButton_trading.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_tradingMouseEntered

    private void jButton_tradingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_tradingMouseExited
        jButton_trading.setBackground(Color.white);
    }//GEN-LAST:event_jButton_tradingMouseExited

    private void jButton_administrativeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_administrativeMouseEntered
        jButton_administrative.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_administrativeMouseEntered

    private void jButton_administrativeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_administrativeMouseExited
       jButton_administrative.setBackground(Color.white);
    }//GEN-LAST:event_jButton_administrativeMouseExited

    private void jButton_generalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_generalMouseEntered
        jButton_general.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_generalMouseEntered

    private void jButton_generalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_generalMouseExited
        jButton_general.setBackground(Color.white);
    }//GEN-LAST:event_jButton_generalMouseExited

    private void jButton_publicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_publicMouseExited
        jButton_public.setBackground(Color.white);
    }//GEN-LAST:event_jButton_publicMouseExited

    private void jButton_publicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_publicMouseEntered
        jButton_public.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_publicMouseEntered

    private void jButton_financeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_financeMouseEntered
        jButton_finance.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_financeMouseEntered

    private void jButton_financeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_financeMouseExited
        jButton_finance.setBackground(Color.white);
    }//GEN-LAST:event_jButton_financeMouseExited

    private void jButton_securityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_securityMouseEntered
        jButton_security.setBackground(Color.darkGray);
    }//GEN-LAST:event_jButton_securityMouseEntered

    private void jButton_securityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_securityMouseExited
        jButton_security.setBackground(Color.white);
    }//GEN-LAST:event_jButton_securityMouseExited

    private void jButton1_chiefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_chiefMouseClicked
        ChiefLoginForm rf = new ChiefLoginForm();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1_chiefMouseClicked

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
            java.util.logging.Logger.getLogger(chooseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chooseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chooseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chooseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chooseLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_chief;
    private javax.swing.JButton jButton_administrative;
    private javax.swing.JButton jButton_assets;
    private javax.swing.JButton jButton_finance;
    private javax.swing.JButton jButton_general;
    private javax.swing.JButton jButton_human;
    private javax.swing.JButton jButton_info;
    private javax.swing.JButton jButton_instituional;
    private javax.swing.JButton jButton_public;
    private javax.swing.JButton jButton_security;
    private javax.swing.JButton jButton_trading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
