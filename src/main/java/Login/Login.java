package Login;

import Main.Toll;
import Handles.Database;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Login extends javax.swing.JFrame 
{

    public Database db = null; // contain connection established with the database

    public Login() {
        initComponents();

        //making connection to be established with database
        db = new Database();

        //Set window to max size possible        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Fetching and setting page image icon from absolute path with the specific computer on which program is running
        toll_image.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\My_project.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_Main = new javax.swing.JPanel();
        Login_Panel = new javax.swing.JPanel();
        User_F = new javax.swing.JTextField();
        Pass_F = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Pass_L = new javax.swing.JLabel();
        User_L = new javax.swing.JLabel();
        sign_up = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        toll_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toll Plaza Management System");

        Login_Main.setBackground(new java.awt.Color(21, 34, 56));
        Login_Main.setPreferredSize(new java.awt.Dimension(720, 480));

        Login_Panel.setBackground(new java.awt.Color(230, 235, 237));
        Login_Panel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(30, 154, 223)));
        Login_Panel.setPreferredSize(new java.awt.Dimension(320, 320));

        User_F.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        User_F.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                User_FKeyPressed(evt);
            }
        });

        Pass_F.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Pass_F.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Pass_F.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pass_FKeyPressed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(255, 193, 0));
        Login.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        Login.setText("Login");
        Login.setBorder(null);
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginKeyPressed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(153, 153, 153));
        Reset.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.setBorder(null);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        Reset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ResetKeyPressed(evt);
            }
        });

        Pass_L.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        Pass_L.setText("Password");

        User_L.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        User_L.setText("Username");

        sign_up.setBackground(new java.awt.Color(117, 180, 255));
        sign_up.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        sign_up.setText("Sign Up");
        sign_up.setToolTipText("");
        sign_up.setBorder(null);
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });
        sign_up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sign_upKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
        Login_Panel.setLayout(Login_PanelLayout);
        Login_PanelLayout.setHorizontalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(User_F, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pass_L)
                            .addComponent(Pass_F, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Login_PanelLayout.createSequentialGroup()
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(User_L, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                        .addComponent(sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)))
                .addGap(118, 118, 118))
        );
        Login_PanelLayout.setVerticalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(User_L)
                .addGap(18, 18, 18)
                .addComponent(User_F, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pass_L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pass_F, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Toll Plaza Management System");

        toll_image.setLabelFor(User_L);
        toll_image.setText("          ");
        toll_image.setToolTipText("");
        toll_image.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout Login_MainLayout = new javax.swing.GroupLayout(Login_Main);
        Login_Main.setLayout(Login_MainLayout);
        Login_MainLayout.setHorizontalGroup(
            Login_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Login_MainLayout.createSequentialGroup()
                        .addComponent(toll_image, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                        .addGap(93, 93, 93)))
                .addContainerGap())
        );
        Login_MainLayout.setVerticalGroup(
            Login_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Login_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_MainLayout.createSequentialGroup()
                        .addComponent(toll_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Login_MainLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(Login_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(158, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Main, javax.swing.GroupLayout.DEFAULT_SIZE, 1413, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Main, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        //if user clicked on reset button 
        clickedOnResetButton(); //run the fields reseting method
    }//GEN-LAST:event_ResetActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        
        //if the user click the login button then initiate the Login process
            clickedOnLoginButton(); //start login process
        
    }//GEN-LAST:event_LoginActionPerformed

    private void User_FKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_User_FKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) //if the user presses enter key while typing then inite the Login process
        {
            clickedOnLoginButton(); //start login process
        }
    }//GEN-LAST:event_User_FKeyPressed

    private void Pass_FKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pass_FKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER) //if the user presses enter key while typing then inite the Login process
        {
            clickedOnLoginButton(); //start login process
        }
    }//GEN-LAST:event_Pass_FKeyPressed

    private void LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) //if the user presses enter key on login button
        {
            clickedOnLoginButton(); //start login process
        }
    }//GEN-LAST:event_LoginKeyPressed

    private void ResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResetKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) //if the user presses enter key on reset button
        {
            clickedOnResetButton(); //start reset process
        }
    }//GEN-LAST:event_ResetKeyPressed

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
        
        clickedOnSignUpButton(); //start sign up function process
        
    }//GEN-LAST:event_sign_upActionPerformed

    private void sign_upKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sign_upKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) //if the user presses enter key on sign up button
        {
            clickedOnSignUpButton(); //start sign up function process
        }
    }//GEN-LAST:event_sign_upKeyPressed

    public void clickedOnResetButton()
    {
        User_F.setText("");
        Pass_F.setText("");
    }
    public boolean validateFields() 
    {
        if (User_F.getText().length() != 0 && Pass_F.getText().length() != 0) 
        {
            return true;
        } 
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "Please Fill All the Fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public void clickedOnLoginButton()
    {
        //validateFields method defined below
            if (!validateFields()) {
                return; //validating all fields if anyone is empty return back after displaying error
            }
            
            String uname = User_F.getText();
            String upass = Pass_F.getText();
            int user_id = 0; //to be fetched at last
            
            db.generalQuery("select * from Login where userName = '"+uname+"' AND userPassword = '"+upass+"';");
            
            //check whether the user exists or not
            if (db.next()) 
            {
                //display message if login was successful
                JOptionPane.showMessageDialog(rootPane, "You Have Logged In!", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                
                //grabbing user id to be accessed further on multiple pages
                user_id = (int) db.col("userNo"); //converting value to integer
                
                
                //if exists transfer control to main window with USER_ID as parameter
                Toll field = new Toll(user_id);
                field.setVisible(true);
                
                
                this.dispose(); // will kill this window process
            } 
            else //if user does not exists display an error 
            {
                JOptionPane.showMessageDialog(null,
                        "Username or password not Correct",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    public void clickedOnSignUpButton()
    {
        //validateFields method defined below
            if (!validateFields()) {
                return; //validating all fields if anyone is empty return back after displaying error
            }
            
            String uname = User_F.getText();
            String upass = Pass_F.getText();
            int user_id = 0; //to be fetched at last
            
            db.generalQuery("select * from Login where userName = '"+uname+"';");
            
            //run the following if condition if no user existed with the provided userName
            if ( !db.next() ) 
            {
                //insert his record in database in USER'S table
                db.IUDQuery("INSERT into Login values ('" + uname + "','" + upass + "');");
                //display message if sign up was successful
                JOptionPane.showMessageDialog(rootPane, "You Have Signed Up!", "Sign Up Successful", JOptionPane.INFORMATION_MESSAGE);
                
                
                //now fetching the user record which contains his/her unique id from database
                db.generalQuery("select * from Login where userName = '"+uname+"' AND userPassword = '"+upass+"';");

                //if the user data is stored run the following if statement
                if ( db.next() ) 
                {
                    //grabbing user id to be accessed further on multiple pages
                    
                    user_id = (int) db.col("userNo"); //converting value to integer
                }
                
                
                //if exists transfer control to main window with USER_ID as parameter
                Toll field = new Toll(user_id);
                field.setVisible(true);
                
                
                this.dispose(); // will kill this window process
            } 
            else //if user does not exists display an error 
            {
                JOptionPane.showMessageDialog(null,
                        "Username Already Exists! Try Different One.",
                        "Username Already Exists", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPanel Login_Main;
    private javax.swing.JPanel Login_Panel;
    private javax.swing.JPasswordField Pass_F;
    private javax.swing.JLabel Pass_L;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField User_F;
    private javax.swing.JLabel User_L;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel toll_image;
    // End of variables declaration//GEN-END:variables

}
