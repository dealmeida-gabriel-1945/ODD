/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.AccountControl;
import Control.BoxControl;
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
public class IFRMAddBox extends javax.swing.JInternalFrame {

    private Account acc = new Account();
    private ArrayList<Document> docs = new ArrayList<>();
    private DefaultTableModel dtm;

    /**
     * Creates new form IFRMAddBox
     */
    public IFRMAddBox(int id) {
        initComponents();
        this.setDefaultRender();
        this.setAcc(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PNLMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TADescription = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLDocs = new javax.swing.JTable();
        BTNRegister = new javax.swing.JButton();

        PNLMain.setBackground(new java.awt.Color(102, 0, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Box", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Description:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Box's name:");

        TFName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TADescription.setColumns(20);
        TADescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TADescription.setRows(5);
        jScrollPane1.setViewportView(TADescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Document", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(102, 0, 0))); // NOI18N

        TBLDocs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Id", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLDocs.setColumnSelectionAllowed(true);
        TBLDocs.getTableHeader().setReorderingAllowed(false);
        TBLDocs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLDocsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBLDocs);
        TBLDocs.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TBLDocs.getColumnModel().getColumnCount() > 0) {
            TBLDocs.getColumnModel().getColumn(0).setResizable(false);
            TBLDocs.getColumnModel().getColumn(1).setResizable(false);
            TBLDocs.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        BTNRegister.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BTNRegister.setText("Register");
        BTNRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNRegister)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(BTNRegister)
                .addContainerGap())
        );

        javax.swing.GroupLayout PNLMainLayout = new javax.swing.GroupLayout(PNLMain);
        PNLMain.setLayout(PNLMainLayout);
        PNLMainLayout.setHorizontalGroup(
            PNLMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        PNLMainLayout.setVerticalGroup(
            PNLMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void BTNRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegisterActionPerformed
        if (this.checkFields() == false) {
            this.register(this.buildBox());
        } else {
            Warnings.wrngEmptyFields();
        }
    }//GEN-LAST:event_BTNRegisterActionPerformed

    private void TBLDocsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLDocsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TBLDocsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNRegister;
    private javax.swing.JPanel PNLMain;
    private javax.swing.JTextArea TADescription;
    private javax.swing.JTable TBLDocs;
    private javax.swing.JTextField TFName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    private void setDefaultRender() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TBLDocs.setDefaultRenderer(String.class, centerRenderer);
    }
    
    private void setAcc(int id) {
        AccountControl accc = new AccountControl();
        this.acc = accc.getAccountById(id);
        this.populateTable();
    }

    private void populateTable() {
        this.docs = DocumentControl.listDocsByAccIdToAddBox(this.acc.getId());
        this.deleteAllRows();
        this.populate();
    }

    private boolean checkFields() {
        if ((TFName.getText().equals("")) || (TADescription.getText().equals(""))) {
            return true;
        } else {
            return false;
        }
    }

    private Box buildBox() {
        Box b = new Box();
        b.setAccount_id(this.acc.getId());
        b.setName(TFName.getText());
        b.setDescription(TADescription.getText());
        if (docs.size() != 0) {
            b.setDocuments(this.takeDocs());
        }
        return b;
    }

    private void register(Box box) {
        if (BoxControl.addBox(box) == false) {
            IFRMAddBox iaddbox = new IFRMAddBox(this.acc.getId());
            javax.swing.plaf.InternalFrameUI ifu = iaddbox.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);
            this.getParent().add(iaddbox);
            try {
                iaddbox.setMaximum(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            iaddbox.show();
            this.dispose();
        }
    }

    private void deleteAllRows() {
        while (TBLDocs.getRowCount() > 0) {
            DefaultTableModel dm = (DefaultTableModel) TBLDocs.getModel();
            dm.getDataVector().removeAllElements();
        }
    }

    private void populate() {
        dtm = (DefaultTableModel) this.TBLDocs.getModel();
        for (Document doc : docs) {
            dtm.addRow(new Object[]{Boolean.FALSE, doc.getId(), doc.getName()});
        }
        TBLDocs.setModel(dtm);
    }

    private ArrayList<Document> takeDocs() {
        ArrayList<Document> dd = new ArrayList<Document>();
        
        for(int i = 0; i < TBLDocs.getRowCount(); i++){
            if(TBLDocs.getValueAt(i, 0).equals(Boolean.TRUE)){
                dd.add(docs.get(i));
            }
        }
        return dd;
    }
}
