/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DatabaseManager;
import Control.Warnings;
import Model.Account;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Gabriel Guimarães
 */
public class FRMMain extends javax.swing.JFrame {

    private Account acc = new Account();

    /**
     * Creates new form FRMLogin
     */
    public FRMMain() {
        initComponents();
        this.checkLogin();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.openIMain();
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
        this.checkLogin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PUMBoxes = new javax.swing.JPopupMenu();
        MIAddBox = new javax.swing.JMenuItem();
        MIListBoxes = new javax.swing.JMenuItem();
        PUMDocs = new javax.swing.JPopupMenu();
        MIAddDoc = new javax.swing.JMenuItem();
        MIListDocs = new javax.swing.JMenuItem();
        PNLMain = new javax.swing.JPanel();
        PNLTools = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTNLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BTNDocuments = new javax.swing.JButton();
        BTNBoxes = new javax.swing.JButton();
        BTNAccount = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        PNLPhoto = new javax.swing.JPanel();
        LBLPhoto = new javax.swing.JLabel();
        DTPNLMain = new javax.swing.JDesktopPane();

        PUMBoxes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        PUMBoxes.setInvoker(BTNBoxes);

        MIAddBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MIAddBox.setText("Add Box");
        MIAddBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAddBoxActionPerformed(evt);
            }
        });
        PUMBoxes.add(MIAddBox);

        MIListBoxes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MIListBoxes.setText("List Boxes");
        MIListBoxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIListBoxesActionPerformed(evt);
            }
        });
        PUMBoxes.add(MIListBoxes);

        PUMBoxes.getAccessibleContext().setAccessibleParent(BTNBoxes);

        PUMDocs.setInvoker(BTNDocuments);

        MIAddDoc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MIAddDoc.setText("Add Document");
        MIAddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAddDocActionPerformed(evt);
            }
        });
        PUMDocs.add(MIAddDoc);

        MIListDocs.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MIListDocs.setText("List Documents");
        MIListDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIListDocsActionPerformed(evt);
            }
        });
        PUMDocs.add(MIListDocs);

        PUMDocs.getAccessibleContext().setAccessibleParent(BTNDocuments);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ODD - Main");

        PNLMain.setBackground(new java.awt.Color(1, 19, 50));
        PNLMain.setForeground(new java.awt.Color(102, 102, 102));

        PNLTools.setBackground(new java.awt.Color(1, 19, 50));
        PNLTools.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ODDSystem");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        BTNLogin.setBackground(new java.awt.Color(153, 153, 153));
        BTNLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTNLogin.setText("Login");
        BTNLogin.setBorder(null);
        BTNLogin.setBorderPainted(false);
        BTNLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLoginActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(1, 19, 50));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        BTNDocuments.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTNDocuments.setForeground(new java.awt.Color(204, 0, 0));
        BTNDocuments.setText("Documents");
        BTNDocuments.setBorder(null);
        BTNDocuments.setBorderPainted(false);
        BTNDocuments.setContentAreaFilled(false);
        BTNDocuments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDocumentsActionPerformed(evt);
            }
        });

        BTNBoxes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTNBoxes.setForeground(new java.awt.Color(204, 0, 0));
        BTNBoxes.setText("Boxes");
        BTNBoxes.setBorder(null);
        BTNBoxes.setBorderPainted(false);
        BTNBoxes.setContentAreaFilled(false);
        BTNBoxes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNBoxesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNBoxesMouseExited(evt);
            }
        });
        BTNBoxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBoxesActionPerformed(evt);
            }
        });

        BTNAccount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BTNAccount.setForeground(new java.awt.Color(204, 0, 0));
        BTNAccount.setText("Account");
        BTNAccount.setBorder(null);
        BTNAccount.setBorderPainted(false);
        BTNAccount.setContentAreaFilled(false);
        BTNAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAccountActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Home");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(BTNAccount)
                .addGap(18, 18, 18)
                .addComponent(BTNBoxes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNDocuments, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNBoxes, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(BTNDocuments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PNLPhoto.setBackground(new java.awt.Color(1, 19, 50));
        PNLPhoto.setForeground(new java.awt.Color(102, 102, 102));

        LBLPhoto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBLPhoto.setForeground(new java.awt.Color(204, 0, 0));
        LBLPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLPhoto.setText("Sign in");
        LBLPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLPhotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PNLPhotoLayout = new javax.swing.GroupLayout(PNLPhoto);
        PNLPhoto.setLayout(PNLPhotoLayout);
        PNLPhotoLayout.setHorizontalGroup(
            PNLPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLPhotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PNLPhotoLayout.setVerticalGroup(
            PNLPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLPhotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PNLToolsLayout = new javax.swing.GroupLayout(PNLTools);
        PNLTools.setLayout(PNLToolsLayout);
        PNLToolsLayout.setHorizontalGroup(
            PNLToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BTNLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PNLPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PNLToolsLayout.setVerticalGroup(
            PNLToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PNLToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNLToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(BTNLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(PNLPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DTPNLMain.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout DTPNLMainLayout = new javax.swing.GroupLayout(DTPNLMain);
        DTPNLMain.setLayout(DTPNLMainLayout);
        DTPNLMainLayout.setHorizontalGroup(
            DTPNLMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DTPNLMainLayout.setVerticalGroup(
            DTPNLMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PNLMainLayout = new javax.swing.GroupLayout(PNLMain);
        PNLMain.setLayout(PNLMainLayout);
        PNLMainLayout.setHorizontalGroup(
            PNLMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNLTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DTPNLMain)
        );
        PNLMainLayout.setVerticalGroup(
            PNLMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLMainLayout.createSequentialGroup()
                .addComponent(PNLTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DTPNLMain))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNLMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PNLMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNDocumentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDocumentsActionPerformed
        if (this.acc.getId() > 0) {
            this.PUMDocs.setVisible(true);
            this.PUMDocs.setLocation(this.getMousePosition().x, this.getMousePosition().y);
        } else {
            Warnings.wrngNotLogged();
            this.PUMDocs.setVisible(false);
        }
    }//GEN-LAST:event_BTNDocumentsActionPerformed

    private void BTNAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAccountActionPerformed
        if (this.acc.equals(new Account()) != true) {

        } else {

        }
    }//GEN-LAST:event_BTNAccountActionPerformed

    private void BTNBoxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBoxesActionPerformed
        if (this.acc.getId() > 0) {
            this.PUMBoxes.setVisible(true);
            this.PUMBoxes.setLocation(this.getMousePosition().x, this.getMousePosition().y);

        } else {
            Warnings.wrngNotLogged();
            this.PUMBoxes.setVisible(false);
        }
    }//GEN-LAST:event_BTNBoxesActionPerformed

    private void LBLPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLPhotoMouseClicked
        if (this.acc.getId() < 1) {
            IFRMAddAccount iAddAcc = new IFRMAddAccount();
            setRootPaneCheckingEnabled(false);
            javax.swing.plaf.InternalFrameUI ifu = iAddAcc.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
            DTPNLMain.removeAll();
            DTPNLMain.add(iAddAcc);
            try {
                iAddAcc.setMaximum(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            iAddAcc.show();
        } else {
            IFRMViewMyrofile vacc = new IFRMViewMyrofile();
            vacc.setAcc(this.acc.getId());
            setRootPaneCheckingEnabled(false);
            javax.swing.plaf.InternalFrameUI ifu = vacc.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
            DTPNLMain.removeAll();
            DTPNLMain.add(vacc);
            try {
                vacc.setMaximum(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            vacc.show();
        }
    }//GEN-LAST:event_LBLPhotoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IFRMMain imain = new IFRMMain();
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu = imain.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
        DTPNLMain.removeAll();
        DTPNLMain.add(imain);
        try {
            imain.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        imain.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTNLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLoginActionPerformed
        if (BTNLogin.getText().equals("Login")) {
            IFRMLogin ilog = new IFRMLogin();
            setRootPaneCheckingEnabled(false);
            javax.swing.plaf.InternalFrameUI ifu = ilog.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
            DTPNLMain.removeAll();
            DTPNLMain.add(ilog);
            try {
                ilog.setMaximum(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            ilog.show();
        } else {
            int i = Warnings.wrngConfirmLogout();
            FRMMain main = new FRMMain();
            main.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BTNLoginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        DatabaseManager d = new DatabaseManager();
        //d.drop();
        d.deletall();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BTNBoxesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBoxesMouseEntered


    }//GEN-LAST:event_BTNBoxesMouseEntered

    private void BTNBoxesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBoxesMouseExited

    }//GEN-LAST:event_BTNBoxesMouseExited

    private void MIAddBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAddBoxActionPerformed
        IFRMAddBox ab = new IFRMAddBox(this.acc.getId());
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu = ab.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
        DTPNLMain.removeAll();
        DTPNLMain.add(ab);
        try {
            ab.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ab.show();
    }//GEN-LAST:event_MIAddBoxActionPerformed

    private void MIListBoxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIListBoxesActionPerformed
        IFRMListBox lb = new IFRMListBox(this.acc.getId());
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu = lb.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
        DTPNLMain.removeAll();
        DTPNLMain.add(lb);
        try {
            lb.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        lb.show();
    }//GEN-LAST:event_MIListBoxesActionPerformed

    private void MIAddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAddDocActionPerformed
        IFRMAddDocument ad = new IFRMAddDocument(this.acc.getId());
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu = ad.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
        DTPNLMain.removeAll();
        DTPNLMain.add(ad);
        try {
            ad.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ad.show();
    }//GEN-LAST:event_MIAddDocActionPerformed

    private void MIListDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIListDocsActionPerformed
        IFRMListDocument ld = new IFRMListDocument(this.acc.getId());
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu = ld.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
        DTPNLMain.removeAll();
        DTPNLMain.add(ld);
        try {
            ld.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ld.show();
    }//GEN-LAST:event_MIListDocsActionPerformed

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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAccount;
    private javax.swing.JButton BTNBoxes;
    private javax.swing.JButton BTNDocuments;
    private javax.swing.JButton BTNLogin;
    private javax.swing.JDesktopPane DTPNLMain;
    private javax.swing.JLabel LBLPhoto;
    private javax.swing.JMenuItem MIAddBox;
    private javax.swing.JMenuItem MIAddDoc;
    private javax.swing.JMenuItem MIListBoxes;
    private javax.swing.JMenuItem MIListDocs;
    private javax.swing.JPanel PNLMain;
    private javax.swing.JPanel PNLPhoto;
    private javax.swing.JPanel PNLTools;
    private javax.swing.JPopupMenu PUMBoxes;
    private javax.swing.JPopupMenu PUMDocs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void openIMain() {
        IFRMMain imain = new IFRMMain();
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu = imain.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
        DTPNLMain.removeAll();
        DTPNLMain.add(imain);
        try {
            imain.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        imain.show();
    }

    private void checkLogin() {
        if (this.acc.getId() != 0) {
            BTNLogin.setText("Logout");
            LBLPhoto.setText("");
            this.putPhoto();
        } else {
            LBLPhoto.setText("Sign In");
        }
    }

    private void putPhoto() {
        try {
            int blobLength = (int) acc.getPhoto().length();
            byte[] blobAsBytes = acc.getPhoto().getBytes(1, blobLength);
            acc.getPhoto().free();
            ImageIcon imgi = new ImageIcon(blobAsBytes);
            Image image = imgi.getImage();
            Image newimg = image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imgi = new ImageIcon(newimg);  // transform it back
            LBLPhoto.setIcon(imgi);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
