/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantautomation;

/**
 *
 * @author Alejandro
 */
public class ManagerWindow extends javax.swing.JFrame {
    RestrauntDatabase rD;
    /**
     * Creates new form ManagerWindow
     */
    public ManagerWindow(RestrauntDatabase r) {
        rD = r;
        initComponents();
        refreshNames(rD);
        refreshMenu(rD);
        
    }
    
    public void refreshNames(RestrauntDatabase rD) {
        String setEmpList = "";
        
        for (int i = 0; i < rD.getAllUsernames().size(); i++) {
            setEmpList += (rD.getEmployeeData(rD.getAllUsernames().get(i)).get(0) + 
                    " " + (rD.getEmployeeData(rD.getAllUsernames().get(i)).get(1)) +
                    " " + (rD.getEmployeeData(rD.getAllUsernames().get(i)).get(2)) + 
                    " " + (rD.getEmployeeData(rD.getAllUsernames().get(i)).get(3)) + 
                    " " + (rD.getEmployeeData(rD.getAllUsernames().get(i)).get(4)) + "\n");
        }
        
        empListTextArea.setText(setEmpList);
    }
    
    public void refreshMenu(RestrauntDatabase rD) {
        
        String setMenuList = "";
        
        for (int i = 0; i < rD.getAllItems().size(); i++) {
            setMenuList += (rD.getItemData(rD.getAllItems().get(i)).get(0) + 
                    " " + rD.getItemData(rD.getAllItems().get(i)).get(1) +  "\n");
        }
        
        menuListTextArea.setText(setMenuList);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeePanel = new javax.swing.JPanel();
        empControlPanel = new javax.swing.JPanel();
        empRemoveButton = new javax.swing.JButton();
        empEditButton = new javax.swing.JButton();
        empAddButton = new javax.swing.JButton();
        logOffButton = new javax.swing.JButton();
        empLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empListTextArea = new javax.swing.JTextArea();
        empRefreshButton = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        menuControlPanel = new javax.swing.JPanel();
        menuRemoveButton = new javax.swing.JButton();
        menuEditButton = new javax.swing.JButton();
        menuAddButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuListTextArea = new javax.swing.JTextArea();
        menuRefreshButton = new javax.swing.JButton();
        manWebPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager");
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);

        employeePanel.setBackground(new java.awt.Color(255, 255, 255));

        empRemoveButton.setText("Remove");
        empRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empRemoveButtonActionPerformed(evt);
            }
        });

        empEditButton.setText("Edit");
        empEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEditButtonActionPerformed(evt);
            }
        });

        empAddButton.setText("Add");
        empAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAddButtonActionPerformed(evt);
            }
        });

        logOffButton.setText("Log Off");
        logOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empControlPanelLayout = new javax.swing.GroupLayout(empControlPanel);
        empControlPanel.setLayout(empControlPanelLayout);
        empControlPanelLayout.setHorizontalGroup(
            empControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(logOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        empControlPanelLayout.setVerticalGroup(
            empControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(empControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logOffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(empRemoveButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empEditButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        empLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        empLabel.setText("Employees");

        empListTextArea.setEditable(false);
        empListTextArea.setColumns(20);
        empListTextArea.setFont(new java.awt.Font("Segoe WP Light", 0, 18)); // NOI18N
        empListTextArea.setRows(5);
        jScrollPane1.setViewportView(empListTextArea);

        empRefreshButton.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        empRefreshButton.setText("Refresh");
        empRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employeePanelLayout = new javax.swing.GroupLayout(employeePanel);
        employeePanel.setLayout(employeePanelLayout);
        employeePanelLayout.setHorizontalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(empControlPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, employeePanelLayout.createSequentialGroup()
                        .addComponent(empLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        employeePanelLayout.setVerticalGroup(
            employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(employeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuPanel.setBackground(new java.awt.Color(255, 255, 255));

        menuLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        menuLabel.setText("Menu");

        menuRemoveButton.setText("Remove");
        menuRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoveButtonActionPerformed(evt);
            }
        });

        menuEditButton.setText("Edit");
        menuEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditButtonActionPerformed(evt);
            }
        });

        menuAddButton.setText("Add");
        menuAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuControlPanelLayout = new javax.swing.GroupLayout(menuControlPanel);
        menuControlPanel.setLayout(menuControlPanelLayout);
        menuControlPanelLayout.setHorizontalGroup(
            menuControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        menuControlPanelLayout.setVerticalGroup(
            menuControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(menuEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuListTextArea.setEditable(false);
        menuListTextArea.setColumns(20);
        menuListTextArea.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        menuListTextArea.setRows(5);
        jScrollPane2.setViewportView(menuListTextArea);

        menuRefreshButton.setText("Refresh");
        menuRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(menuLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menuControlPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuRefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        manWebPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout manWebPanelLayout = new javax.swing.GroupLayout(manWebPanel);
        manWebPanel.setLayout(manWebPanelLayout);
        manWebPanelLayout.setHorizontalGroup(
            manWebPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        manWebPanelLayout.setVerticalGroup(
            manWebPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(employeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(manWebPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manWebPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAddButtonActionPerformed
        // TODO add your handling code here:
        
        AddEmployee aE = new AddEmployee (rD);
        aE.setVisible(true);
        refreshNames(rD);
        
    }//GEN-LAST:event_empAddButtonActionPerformed

    private void empRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empRefreshButtonActionPerformed
        // TODO add your handling code here:
        refreshNames(rD);
        
    }//GEN-LAST:event_empRefreshButtonActionPerformed

    private void empRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empRemoveButtonActionPerformed
        // TODO add your handling code here:
        
        RemoveEmployee rE = new RemoveEmployee (rD);
        rE.setVisible(true);
        refreshNames(rD);
        
    }//GEN-LAST:event_empRemoveButtonActionPerformed

    private void empEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEditButtonActionPerformed
        // TODO add your handling code here:
        
        EditEmployee eE = new EditEmployee (rD);
        eE.setVisible(true);
        refreshNames(rD);
        
    }//GEN-LAST:event_empEditButtonActionPerformed

    private void logOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffButtonActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
               
    }//GEN-LAST:event_logOffButtonActionPerformed

    private void menuRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRefreshButtonActionPerformed
        // TODO add your handling code here:
        refreshMenu(rD);
    }//GEN-LAST:event_menuRefreshButtonActionPerformed

    private void menuAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddButtonActionPerformed
        // TODO add your handling code here:
        
        AddMenuItem aMI = new AddMenuItem (rD);
        aMI.setVisible(true);
        refreshNames(rD);
    }//GEN-LAST:event_menuAddButtonActionPerformed

    private void menuRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoveButtonActionPerformed
        // TODO add your handling code here:
        RemoveMenuItem rME = new RemoveMenuItem (rD);
        rME.setVisible(true);
        refreshMenu(rD);
    }//GEN-LAST:event_menuRemoveButtonActionPerformed

    private void menuEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditButtonActionPerformed
        // TODO add your handling code here:
        EditMenuItem eMI = new EditMenuItem (rD);
        eMI.setVisible(true);
        refreshMenu(rD);
    }//GEN-LAST:event_menuEditButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ManagerWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empAddButton;
    private javax.swing.JPanel empControlPanel;
    private javax.swing.JButton empEditButton;
    private javax.swing.JLabel empLabel;
    private javax.swing.JTextArea empListTextArea;
    private javax.swing.JButton empRefreshButton;
    private javax.swing.JButton empRemoveButton;
    private javax.swing.JPanel employeePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOffButton;
    private javax.swing.JPanel manWebPanel;
    private javax.swing.JButton menuAddButton;
    private javax.swing.JPanel menuControlPanel;
    private javax.swing.JButton menuEditButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JTextArea menuListTextArea;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menuRefreshButton;
    private javax.swing.JButton menuRemoveButton;
    // End of variables declaration//GEN-END:variables
}