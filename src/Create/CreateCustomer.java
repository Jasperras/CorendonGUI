/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Create;

import java.sql.SQLException;



/**
 *
 * @author Jasper
 */
public class CreateCustomer extends javax.swing.JFrame {
Customer cust = new Customer();
    /**
     * Creates new form CreateCustomer
     */

    public CreateCustomer() {
        initComponents();
        init();
    }

    public void init() {
        setLocationRelativeTo(null);
    }
    
    
    
    public int createTempCustomer()throws SQLException {
        Customer cust = new Customer();
        CustomerDAO custDAO = new CustomerDAO();
        int x = Integer.parseInt(customerIdTextCreate.getText());
        int y = Integer.parseInt(phoneTextCreate.getText());

        cust.setCustomerid(x);
        cust.setFirstname(firstNameTextCreate.getText());
        cust.setLastname(lastNameTextCreate.getText());
        cust.setPostalcode(postalCodeTextCreate.getText());
        cust.setAddress(addressTextCreate.getText());
        cust.setResidence(residenceTextCreate.getText());
        cust.setDestination(destinationTextCreate.getText());
        cust.setPhone(y);
        cust.setEmail(emailTextCreate.getText());
        cust.setNotes(notesTextPaneCreate.getText());
      
        
   
    return custDAO.create(cust);
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabelCreateCust = new javax.swing.JLabel();
        firstNameLabelCreate = new javax.swing.JLabel();
        lastNameLabelCreate = new javax.swing.JLabel();
        postalCodeLabelCreate = new javax.swing.JLabel();
        addressLabelCreate = new javax.swing.JLabel();
        residenceLabelCreate = new javax.swing.JLabel();
        destinationLabelCreate = new javax.swing.JLabel();
        phoneLabelCreate = new javax.swing.JLabel();
        emailLabelCreate = new javax.swing.JLabel();
        customerIdLabelCreate = new javax.swing.JLabel();
        notesLabelCreate = new javax.swing.JLabel();
        firstNameTextCreate = new javax.swing.JTextField();
        lastNameTextCreate = new javax.swing.JTextField();
        postalCodeTextCreate = new javax.swing.JTextField();
        addressTextCreate = new javax.swing.JTextField();
        residenceTextCreate = new javax.swing.JTextField();
        destinationTextCreate = new javax.swing.JTextField();
        phoneTextCreate = new javax.swing.JTextField();
        emailTextCreate = new javax.swing.JTextField();
        customerIdTextCreate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTextPaneCreate = new javax.swing.JTextPane();
        saveButtonCreate = new javax.swing.JButton();
        cancelButtonCreate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Customer");
        setName("createCustomer"); // NOI18N

        headerLabelCreateCust.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        headerLabelCreateCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabelCreateCust.setText("Create new customer profile");
        headerLabelCreateCust.setName("headerLabelCreateCust"); // NOI18N

        firstNameLabelCreate.setText("First name:");
        firstNameLabelCreate.setName("fnameLabel"); // NOI18N

        lastNameLabelCreate.setText("Last name:");
        lastNameLabelCreate.setName("lnameLabel"); // NOI18N

        postalCodeLabelCreate.setText("Postal/ZIP:");
        postalCodeLabelCreate.setName("postalLabel"); // NOI18N

        addressLabelCreate.setText("Address:");
        addressLabelCreate.setName("addressLabelCreate"); // NOI18N

        residenceLabelCreate.setText("Residence:");
        residenceLabelCreate.setName("residenceLabelCreate"); // NOI18N

        destinationLabelCreate.setText("Destination:");
        destinationLabelCreate.setName("destinationLabelCreate"); // NOI18N

        phoneLabelCreate.setText("Phone:");
        phoneLabelCreate.setName("phoneLabelCreate"); // NOI18N

        emailLabelCreate.setText("Email:");
        emailLabelCreate.setName("emailLabelCreate"); // NOI18N

        customerIdLabelCreate.setText("Customer ID:");
        customerIdLabelCreate.setName("customeridLabel"); // NOI18N

        notesLabelCreate.setText("Notes:");
        notesLabelCreate.setName("notesLabelCreate"); // NOI18N

        firstNameTextCreate.setName("fnameText"); // NOI18N
        firstNameTextCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextCreateActionPerformed(evt);
            }
        });

        lastNameTextCreate.setName("lnameText"); // NOI18N

        postalCodeTextCreate.setName("postalText"); // NOI18N
        postalCodeTextCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalCodeTextCreateActionPerformed(evt);
            }
        });

        addressTextCreate.setName("addressTextCreate"); // NOI18N

        residenceTextCreate.setName("residenceTextCreate"); // NOI18N
        residenceTextCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residenceTextCreateActionPerformed(evt);
            }
        });

        destinationTextCreate.setName("destinationTextCreate"); // NOI18N

        phoneTextCreate.setName("phoneTextCreate"); // NOI18N

        emailTextCreate.setName("emailTextCreate"); // NOI18N

        customerIdTextCreate.setFocusable(false);
        customerIdTextCreate.setName("customeridText"); // NOI18N
        customerIdTextCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdTextCreateActionPerformed(evt);
            }
        });

        jScrollPane1.setName("notesText"); // NOI18N
        jScrollPane1.setViewportView(notesTextPaneCreate);

        saveButtonCreate.setText("Save");
        saveButtonCreate.setName("saveButtonCreate"); // NOI18N
        saveButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonCreateActionPerformed(evt);
            }
        });

        cancelButtonCreate.setText("Cancel");
        cancelButtonCreate.setName("cancelButtonCreate"); // NOI18N
        cancelButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notesLabelCreate)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveButtonCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelButtonCreate))
                            .addComponent(jScrollPane1)))
                    .addComponent(lastNameLabelCreate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(firstNameLabelCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(postalCodeLabelCreate))
                                    .addComponent(addressLabelCreate))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(customerIdLabelCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(postalCodeTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerIdTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(residenceLabelCreate)
                                    .addComponent(destinationLabelCreate)
                                    .addComponent(phoneLabelCreate)
                                    .addComponent(emailLabelCreate))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(residenceTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destinationTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabelCreateCust)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(headerLabelCreateCust)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerIdTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerIdLabelCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabelCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabelCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postalCodeTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postalCodeLabelCreate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(residenceLabelCreate)
                            .addComponent(residenceTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(destinationLabelCreate)
                            .addComponent(destinationTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabelCreate)
                            .addComponent(phoneTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabelCreate)
                            .addComponent(emailTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabelCreate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesLabelCreate)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButtonCreate)
                    .addComponent(cancelButtonCreate))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextCreateActionPerformed
    
    }//GEN-LAST:event_firstNameTextCreateActionPerformed

    private void cancelButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonCreateActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonCreateActionPerformed

    private void saveButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonCreateActionPerformed
        
    }//GEN-LAST:event_saveButtonCreateActionPerformed

    private void residenceTextCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residenceTextCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_residenceTextCreateActionPerformed

    private void customerIdTextCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdTextCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdTextCreateActionPerformed

    private void postalCodeTextCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalCodeTextCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalCodeTextCreateActionPerformed

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
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabelCreate;
    private javax.swing.JTextField addressTextCreate;
    private javax.swing.JButton cancelButtonCreate;
    private javax.swing.JLabel customerIdLabelCreate;
    private javax.swing.JTextField customerIdTextCreate;
    private javax.swing.JLabel destinationLabelCreate;
    private javax.swing.JTextField destinationTextCreate;
    private javax.swing.JLabel emailLabelCreate;
    private javax.swing.JTextField emailTextCreate;
    private javax.swing.JLabel firstNameLabelCreate;
    private javax.swing.JTextField firstNameTextCreate;
    private javax.swing.JLabel headerLabelCreateCust;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabelCreate;
    private javax.swing.JTextField lastNameTextCreate;
    private javax.swing.JLabel notesLabelCreate;
    private javax.swing.JTextPane notesTextPaneCreate;
    private javax.swing.JLabel phoneLabelCreate;
    private javax.swing.JTextField phoneTextCreate;
    private javax.swing.JLabel postalCodeLabelCreate;
    private javax.swing.JTextField postalCodeTextCreate;
    private javax.swing.JLabel residenceLabelCreate;
    private javax.swing.JTextField residenceTextCreate;
    private javax.swing.JButton saveButtonCreate;
    // End of variables declaration//GEN-END:variables
}
