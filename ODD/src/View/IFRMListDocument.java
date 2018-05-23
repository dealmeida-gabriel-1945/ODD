/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.AccountControl;
import Control.DocumentControl;
import Control.Warnings;
import Model.Account;
import Model.Box;
import Model.Document;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Guimarães
 */
public class IFRMListDocument extends javax.swing.JInternalFrame {

    private Account acc = new Account();
    private DefaultTableModel dfltBoxes;
    private Document docClicked = new Document();
    private ArrayList<Document> docs = new ArrayList<>();

    /**
     * Creates new form IFRMListDocument
     */
    public IFRMListDocument(int id) {
        initComponents();
        this.setDefaultRender();
        this.setAcc(id);
    }

    public void setAcc(int id) {
        this.acc = AccountControl.getAccountById(id);
        this.preparate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLDocuments = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFShowId = new javax.swing.JTextField();
        TFShowName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFShowType = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFShowBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BTNEdit = new javax.swing.JButton();
        BTNDelete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        TBLDocuments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Type", "Box"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLDocuments.getTableHeader().setReorderingAllowed(false);
        TBLDocuments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLDocumentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLDocuments);
        if (TBLDocuments.getColumnModel().getColumnCount() > 0) {
            TBLDocuments.getColumnModel().getColumn(0).setResizable(false);
            TBLDocuments.getColumnModel().getColumn(1).setResizable(false);
            TBLDocuments.getColumnModel().getColumn(2).setResizable(false);
            TBLDocuments.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Id:");

        TFShowId.setEditable(false);
        TFShowId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TFShowName.setEditable(false);
        TFShowName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Name:");

        TFShowType.setEditable(false);
        TFShowType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Type");

        TFShowBox.setEditable(false);
        TFShowBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Box:");

        BTNEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTNEdit.setText("Edit");
        BTNEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEditActionPerformed(evt);
            }
        });

        BTNDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTNDelete.setText("Delete");
        BTNDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFShowBox)
                            .addComponent(TFShowType)
                            .addComponent(TFShowId)
                            .addComponent(TFShowName, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                    .addComponent(BTNDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFShowId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFShowName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFShowType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFShowBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBLDocumentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLDocumentsMouseClicked
        this.docClicked = docs.get(TBLDocuments.getSelectedRow());
        TFShowId.setText(this.docClicked.getId() + "");
        TFShowName.setText(this.docClicked.getName());
        TFShowType.setText(this.docClicked.getType());
        TFShowBox.setText(this.docClicked.getBox().getName());
    }//GEN-LAST:event_TBLDocumentsMouseClicked

    private void BTNEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEditActionPerformed
        if (this.docClicked.getId() > 0) {

        } else {
            Warnings.wrngNoSelection();
        }
    }//GEN-LAST:event_BTNEditActionPerformed

    private void BTNDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDeleteActionPerformed
        if (this.docClicked.getId() > 0) {
            if (this.docClicked.getBox().getId() == 0) {
                if (Warnings.wrngConfirmDelete() == 0) {
                    if (Warnings.wrngTypeYourPassword().equals(this.acc.getPassword())) {
                        if (!DocumentControl.delete(this.docClicked.getId())) {
                            Warnings.wrngDeleteDocumentSuccess();
                            this.restart();
                        } else {
                            Warnings.wrngDeleteDocumentFail();
                        }
                    } else {
                        Warnings.wrngIncorrectPassword();
                    }
                } else {

                }
            } else {
                Warnings.wrngDeleteDocumentFailByBox();
            }
        } else {
            Warnings.wrngNoSelection();
        }
    }//GEN-LAST:event_BTNDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNDelete;
    private javax.swing.JButton BTNEdit;
    private javax.swing.JTable TBLDocuments;
    private javax.swing.JTextField TFShowBox;
    private javax.swing.JTextField TFShowId;
    private javax.swing.JTextField TFShowName;
    private javax.swing.JTextField TFShowType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void preparate() {
        this.docs = DocumentControl.listDocsByAccId(this.acc.getId());
        this.clearTable();
        this.populateTable();
    }

    private void clearTable() {
        while (TBLDocuments.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) TBLDocuments.getModel();
            dm.getDataVector().removeAllElements();
        }
    }

    private void populateTable() {
        this.dfltBoxes = (DefaultTableModel) this.TBLDocuments.getModel();
        for (Document doc : docs) {
            dfltBoxes.addRow(new Object[]{doc.getId(), doc.getName(), doc.getType(), doc.getBox().getName()});
        }
        TBLDocuments.setModel(dfltBoxes);
    }

    private void setDefaultRender() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TBLDocuments.setDefaultRenderer(String.class, centerRenderer);
    }

    private void restart() {
        IFRMListDocument ild = new IFRMListDocument(this.acc.getId());
        javax.swing.plaf.InternalFrameUI ifu = ild.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
        this.getParent().add(ild);
        try {
            ild.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ild.show();
        this.dispose();
    }
}
