/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Login.Login;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Popup;
import javax.swing.PopupFactory;

/**
 *
 * @author 92311
 */

public class Toll extends javax.swing.JFrame {

    /**
     * Creates new form Toll
     * @param userID
     */
    public Toll(int userID)
    {
        initComponents();
        
        //Set window to max size possible        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //current directory
        String dir = System.getProperty("user.dir");
        
        //setting all images correctly
        program.setIcon(new ImageIcon(dir + "\\src\\main\\java\\gear_2.png"));
        view.setIcon(new ImageIcon(dir + "\\src\\main\\java\\eye_1.png"));
        tools.setIcon(new ImageIcon(dir + "\\src\\main\\java\\settings_1.png"));
        
        program_exit.setIcon(new ImageIcon(dir + "\\src\\main\\java\\door_1.png"));
        
        account.setIcon(new ImageIcon(dir + "\\src\\main\\java\\profile_close_3.png"));
        
        profile_box.setIcon(new ImageIcon(dir + "\\src\\main\\java\\account.png"));
        
        
        
        
        //=============> Setting header logged in as details
        
        //fetching and storing user data in class static variables
        User.isUser(userID);
        
        //setting text in header
        profile_box.setText(User.user_name.toUpperCase());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        image_container = new javax.swing.JPanel();
        image_con = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        new_vehicle_entry_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        profile_box = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        program = new javax.swing.JMenu();
        program_exit = new javax.swing.JMenuItem();
        view = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        tools = new javax.swing.JMenu();
        update_toll_tax = new javax.swing.JMenuItem();
        account = new javax.swing.JMenu();
        Logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toll Plaza Management System");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(21, 34, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Toll Plaza Management System");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout image_containerLayout = new javax.swing.GroupLayout(image_container);
        image_container.setLayout(image_containerLayout);
        image_containerLayout.setHorizontalGroup(
            image_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        image_containerLayout.setVerticalGroup(
            image_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(250, 255, 255));

        new_vehicle_entry_btn.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        new_vehicle_entry_btn.setText("New Vehicle Entry");
        new_vehicle_entry_btn.setToolTipText("add new vehicle record");
        new_vehicle_entry_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 121, 206), 4, true));
        new_vehicle_entry_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_vehicle_entry_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(new_vehicle_entry_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(new_vehicle_entry_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 255, 255));
        jPanel2.setToolTipText("");

        profile_box.setBackground(new java.awt.Color(255, 255, 255));
        profile_box.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        profile_box.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile_box.setText("Muhammad Bin Zulfiqar");
        profile_box.setToolTipText("");
        profile_box.setIconTextGap(10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(image_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        program_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        program_exit.setText("Exit");
        program_exit.setToolTipText("Exit from the program");
        program_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        program_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                program_exitActionPerformed(evt);
            }
        });
        program.add(program_exit);

        jMenuBar1.add(program);

        view.setText("View");
        view.setToolTipText("");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("All Vehicle Entries");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        view.add(jMenuItem2);

        jMenuBar1.add(view);

        tools.setText("Tools");
        tools.setToolTipText("");

        update_toll_tax.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        update_toll_tax.setText("Update Toll Tax");
        update_toll_tax.setToolTipText("");
        update_toll_tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_toll_taxActionPerformed(evt);
            }
        });
        tools.add(update_toll_tax);

        jMenuBar1.add(tools);

        account.setText("Account");
        account.setToolTipText("");

        Logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Logout.setText("Logout");
        Logout.setToolTipText("");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        account.add(Logout);

        jMenuBar1.add(account);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void program_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_program_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_program_exitActionPerformed
    public int times = 0;
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        
        if(this.getExtendedState() == JFrame.MAXIMIZED_BOTH)
        {
            times = 1;
            //image resizer for main bottom section of TOLL PLAZA
            //current directory
            
            String dir = System.getProperty("user.dir");
            ImageIcon icon = new ImageIcon(dir + "\\src\\main\\java\\Toll_plaza.jpg");
            
            Image scaleImage = icon.getImage().getScaledInstance(image_container.getWidth(), image_container.getHeight(),Image.SCALE_DEFAULT);
            System.out.println("resized");
            
            image_con.setIcon(new ImageIcon(scaleImage));
        }
    }//GEN-LAST:event_formComponentResized

    
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    
    private void new_vehicle_entry_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_vehicle_entry_btnActionPerformed
        
        //popup container
        new Insert(User.user_no).setVisible(true);
        
        //destroying the current window
        this.dispose();
    }//GEN-LAST:event_new_vehicle_entry_btnActionPerformed

    private void update_toll_taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_toll_taxActionPerformed
        //transfer control to update toll form
        new updateToll(User.user_no).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update_toll_taxActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //opening all records view
        new View(User.user_no).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Toll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Toll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Toll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Toll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Toll(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu account;
    private javax.swing.JLabel image_con;
    private javax.swing.JPanel image_container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton new_vehicle_entry_btn;
    private javax.swing.JLabel profile_box;
    private javax.swing.JMenu program;
    private javax.swing.JMenuItem program_exit;
    private javax.swing.JMenu tools;
    private javax.swing.JMenuItem update_toll_tax;
    private javax.swing.JMenu view;
    // End of variables declaration//GEN-END:variables
}