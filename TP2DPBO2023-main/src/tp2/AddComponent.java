/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp2;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author raisy
 */
public class AddComponent extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    private Home home;
    private dbConnection db;
    private boolean isUpdate;
    private int id;
    private int tempIdLayar = 0;
    public AddComponent(Home home, boolean isUpdate, int id) {
        initComponents();
        
        db = new dbConnection();
        this.home = home;
        this.isUpdate = isUpdate;
        this.id = id;
        getDataLayar();
        
        cpuField.setText("");
        graphicsCardField.setText("");
        ramField.setText("");
        hddssdField.setText("");
        layarDrop.setSelectedItem(null);
        keyboardDrop.setSelectedItem(null);
        cameraDrop.setSelectedItem(null);
//      Check first, now update or insert
        if (this.isUpdate == false) {
            System.out.println(this.isUpdate);
//          If now is update, set text of button, clear button set to invis and set the color to yellow in the add button
        } else {
            AddDataButton.setText("Update");
            clearButton1.setVisible(false);
            AddDataButton.setBackground(new Color(204, 204, 0));
        }
    }

    private AddComponent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//  Reset Field
    public void resetForm() {
        // Set All Value Form to Empty
        cpuField.setText("");
        graphicsCardField.setText("");
        ramField.setText("");
        hddssdField.setText("");
        layarDrop.setSelectedItem(null);
        keyboardDrop.setSelectedItem(null);
        cameraDrop.setSelectedItem(null);
    }

//  Call the procedure from home, for the reset panel
    public void notifydataupdate() {
        home.ondataupdated();
    }
    
//  Create the procedure for the set of text/item, for the update
    public void setUpdate(String cpu, String vga, String ram, String hddssd, String layar, String keyboard, String camera) {
        tempIdLayar = Integer.valueOf(layar);
        layarDrop.addItem(layar);
        cpuField.setText(cpu);
        graphicsCardField.setText(vga);
        ramField.setText(ram);
        hddssdField.setText(hddssd);
        layarDrop.setSelectedItem(layar);
        keyboardDrop.setSelectedItem(keyboard);
        cameraDrop.setSelectedItem(camera);
        AddLabel.setText("Update Component");
    }
    
//  get the id from table layar, for input layar drop
    public void getDataLayar() {
        int idNotUsed = 0;
        ResultSet dbLayar = db.selectQuery("select * from layar WHERE stats_used = '"+idNotUsed+"'");
        try {
            while (dbLayar.next()) {
                layarDrop.addItem(dbLayar.getString("id_layar"));
            }
            dbLayar.last();
            int jumlahData = dbLayar.getRow();
            dbLayar.first();
        } catch (SQLException ex) {
            Logger.getLogger(AddComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        AddLabel = new javax.swing.JLabel();
        cpuLabel = new javax.swing.JLabel();
        graphicsCardLabel = new javax.swing.JLabel();
        AddDataButton = new javax.swing.JButton();
        ramLabel = new javax.swing.JLabel();
        clearButton1 = new javax.swing.JButton();
        hddssdLabel = new javax.swing.JLabel();
        idLayarLabel = new javax.swing.JLabel();
        keyboardLabel = new javax.swing.JLabel();
        cameraLabel = new javax.swing.JLabel();
        layarDrop = new javax.swing.JComboBox<>();
        keyboardDrop = new javax.swing.JComboBox<>();
        cameraDrop = new javax.swing.JComboBox<>();
        hddssdField = new javax.swing.JTextField();
        ramField = new javax.swing.JTextField();
        graphicsCardField = new javax.swing.JTextField();
        cpuField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBg/laptop_logo.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Laptop Media");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 14, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBg/back_icon.png"))); // NOI18N
        jButton1.setText(" Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        AddLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddLabel.setText("Form Add Component");
        getContentPane().add(AddLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        cpuLabel.setForeground(new java.awt.Color(255, 255, 255));
        cpuLabel.setText("CPU      :");
        getContentPane().add(cpuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        graphicsCardLabel.setForeground(new java.awt.Color(255, 255, 255));
        graphicsCardLabel.setText("Graphics Card :");
        getContentPane().add(graphicsCardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        AddDataButton.setBackground(new java.awt.Color(51, 153, 0));
        AddDataButton.setForeground(new java.awt.Color(0, 0, 0));
        AddDataButton.setText("Add Data");
        AddDataButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddDataButtonMouseClicked(evt);
            }
        });
        AddDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        ramLabel.setForeground(new java.awt.Color(255, 255, 255));
        ramLabel.setText("RAM :");
        getContentPane().add(ramLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        clearButton1.setBackground(new java.awt.Color(0, 153, 153));
        clearButton1.setForeground(new java.awt.Color(0, 0, 0));
        clearButton1.setText("Clear");
        clearButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButton1MouseClicked(evt);
            }
        });
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        hddssdLabel.setForeground(new java.awt.Color(255, 255, 255));
        hddssdLabel.setText("HDD/SSD :");
        getContentPane().add(hddssdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        idLayarLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLayarLabel.setText("Layar :");
        getContentPane().add(idLayarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        keyboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        keyboardLabel.setText("Keyboard :");
        getContentPane().add(keyboardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        cameraLabel.setForeground(new java.awt.Color(255, 255, 255));
        cameraLabel.setText("Camera :");
        getContentPane().add(cameraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        layarDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layarDropActionPerformed(evt);
            }
        });
        getContentPane().add(layarDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 220, -1));

        keyboardDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keyboard Standar", "Keyboard Chiclet", "Keyboard Backlit", "Keyboard Mechanical" }));
        getContentPane().add(keyboardDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 220, -1));

        cameraDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kamera Webcam HD", "Kamera 3D", "Kamera Infrared", "Kamera RGB" }));
        getContentPane().add(cameraDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 220, -1));

        hddssdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hddssdFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hddssdFieldFocusLost(evt);
            }
        });
        getContentPane().add(hddssdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 220, -1));

        ramField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ramFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ramFieldFocusLost(evt);
            }
        });
        getContentPane().add(ramField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, -1));

        graphicsCardField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                graphicsCardFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                graphicsCardFieldFocusLost(evt);
            }
        });
        getContentPane().add(graphicsCardField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 217, -1));

        cpuField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpuFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpuFieldFocusLost(evt);
            }
        });
        getContentPane().add(cpuField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 217, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBg/bg_addcomponent.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 360, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDataButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddDataButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void clearButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButton1MouseClicked
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_clearButton1MouseClicked

//  Insert/Update statement
    private void AddDataButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDataButtonMouseClicked
        // TODO add your handling code here:
        if (this.isUpdate == false) { // If now is insert
            String cpu = cpuField.getText();
            String vga = graphicsCardField.getText();
            String ram = ramField.getText();
            String hdd_ssd = hddssdField.getText();
            String stringid_layar = "", keyboard = "", camera = "";
            int id_layar = 0;
            if (layarDrop.getSelectedItem() != null) {
                stringid_layar = layarDrop.getSelectedItem().toString();
                id_layar = Integer.parseInt(stringid_layar);
            }
            if (keyboardDrop.getSelectedItem() != null) {
                keyboard = keyboardDrop.getSelectedItem().toString();
            }
            if (cameraDrop.getSelectedItem() != null) {
                camera = cameraDrop.getSelectedItem().toString();
            }
            
            int statsUsed = 1;
            int stats = 0;

            int yes = JOptionPane.showConfirmDialog(null, "Anda yakin menginput data terkait ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == yes) {
                if (cpu.isEmpty() || vga.isEmpty() || ram.isEmpty() || hdd_ssd.isEmpty() || layarDrop.getSelectedItem() == null || keyboardDrop.getSelectedItem() == null || cameraDrop.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(null, "Please fill in the data completely!");
                } else {
                    String sql = "insert into component (id_component, cpu, graphics_card, ram, hdd_ssd, id_layar, keyboard, camera, stats_used) values (NULL, '"+cpu+"', '"+vga+"', '"+ram+"', '"+hdd_ssd+"', '"+id_layar+"', '"+keyboard+"', '"+camera+"', '"+stats+"')";
                    String updateLayar = "UPDATE layar SET stats_used='" + statsUsed + "' WHERE id_layar=" + id_layar;
                    db.updateQuery(updateLayar);
                    db.updateQuery(sql);
                    JOptionPane.showMessageDialog(null, "Data has been successfully entered!");
                    dispose();
                    notifydataupdate();
                    home.selectedFilterComponent();
                }
            }
        } else if (this.isUpdate == true) { //If now is update
            String cpu = cpuField.getText();
            String vga = graphicsCardField.getText();
            String ram = ramField.getText();
            String hdd_ssd = hddssdField.getText();
            boolean idlayarFlag = false;
            String stringid_layar = layarDrop.getSelectedItem().toString();
            int id_layar = Integer.parseInt(stringid_layar);
            if (tempIdLayar != id_layar) {
                idlayarFlag = true;
            }
            String keyboard = keyboardDrop.getSelectedItem().toString();
            String camera = cameraDrop.getSelectedItem().toString();
            int statsUsed = 1;
            int stats = 0;
            int affectedRow = 0;

            int yes = JOptionPane.showConfirmDialog(null, "Anda yakin mengedit data terkait ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_OPTION == yes) {
                if (cpu.isEmpty() || vga.isEmpty() || ram.isEmpty() || hdd_ssd.isEmpty() || layarDrop.getSelectedItem() == null || keyboardDrop.getSelectedItem() == null || cameraDrop.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(null, "Please fill in the data completely!");
                } else {
                    String sql = "UPDATE component SET cpu='" + cpu + "', graphics_card='" + vga + "', ram='" + ram + "', hdd_ssd= '" +hdd_ssd+ "', id_layar= '"+id_layar+"', keyboard= '"+keyboard+"', camera= '"+camera+"' WHERE id_component=" + this.id;
//                  If the user change the id layar
                    if (idlayarFlag == true) {
                        String updateLayar = "UPDATE layar SET stats_used='" + statsUsed + "' WHERE id_layar=" + id_layar;
                        String anotherLayar = "UPDATE layar SET stats_used='" + stats + "' WHERE id_layar=" + tempIdLayar;
                        db.updateQuery(updateLayar);
                        db.updateQuery(anotherLayar);
                        
                        affectedRow = db.updateQuery(sql);
                        if (affectedRow > 0) {
                            JOptionPane.showMessageDialog(null, "Data has been successfully edited!");
                            dispose();
                            notifydataupdate();
                            home.selectedFilterComponent();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Unsuccessfully Updated");
                            dispose();
                        }
                    } else {
                        affectedRow = db.updateQuery(sql);
                        if (affectedRow > 0) {
                            JOptionPane.showMessageDialog(null, "Data has been successfully edited!");
                            dispose();
                            notifydataupdate();
                            home.selectedFilterComponent();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Unsuccessfully Updated");
                            dispose();
                        }
                    }
                }
            }
        }
            
        
            
    }//GEN-LAST:event_AddDataButtonMouseClicked

    private void cpuFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpuFieldFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cpuFieldFocusGained

    private void cpuFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpuFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cpuFieldFocusLost

    private void graphicsCardFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_graphicsCardFieldFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_graphicsCardFieldFocusGained

    private void graphicsCardFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_graphicsCardFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_graphicsCardFieldFocusLost

    private void ramFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ramFieldFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ramFieldFocusGained

    private void ramFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ramFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ramFieldFocusLost

    private void hddssdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hddssdFieldFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hddssdFieldFocusGained

    private void hddssdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hddssdFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hddssdFieldFocusLost

    private void layarDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layarDropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_layarDropActionPerformed

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
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddComponent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDataButton;
    private javax.swing.JLabel AddLabel;
    private javax.swing.JComboBox<String> cameraDrop;
    private javax.swing.JLabel cameraLabel;
    private javax.swing.JButton clearButton1;
    private javax.swing.JTextField cpuField;
    private javax.swing.JLabel cpuLabel;
    private javax.swing.JTextField graphicsCardField;
    private javax.swing.JLabel graphicsCardLabel;
    private javax.swing.JTextField hddssdField;
    private javax.swing.JLabel hddssdLabel;
    private javax.swing.JLabel idLayarLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> keyboardDrop;
    private javax.swing.JLabel keyboardLabel;
    private javax.swing.JComboBox<String> layarDrop;
    private javax.swing.JTextField ramField;
    private javax.swing.JLabel ramLabel;
    // End of variables declaration//GEN-END:variables
}