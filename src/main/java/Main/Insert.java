package Main;

import Handles.Database;
import Login.Login;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.*;
import javax.swing.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class Insert extends javax.swing.JFrame {
    
    Database db = null;
    //current directory
        String dir = System.getProperty("user.dir");
    
    HashMap category_collection_with_taxes = new HashMap();
    HashMap category_collection_with_category_ID = new HashMap();
//hashmap is data structure where index is called as key which can be of any data type and same as the case with value corresponding to that
    
    public Insert(int userID) 
    {
        initComponents();
        
        //fetching and storing user data in class static variables
        User.isUser(userID);
        
        //making connection with database
        db = new Database();
        
        //setting window to its maximum position
        this.setExtendedState( JFrame.MAXIMIZED_BOTH );
        
        //setting all images correctly
        program.setIcon(new ImageIcon(dir + "\\src\\main\\java\\gear_2.png"));
        home.setIcon(new ImageIcon(dir + "\\src\\main\\java\\home_2_1.png"));
        view.setIcon(new ImageIcon(dir + "\\src\\main\\java\\eye_1.png"));
        tools.setIcon(new ImageIcon(dir + "\\src\\main\\java\\settings_1.png"));
        program_exit.setIcon(new ImageIcon(dir + "\\src\\main\\java\\door_1.png"));
        
        account.setIcon(new ImageIcon(dir + "\\src\\main\\java\\profile_close_3.png"));
        man.setIcon(new ImageIcon(dir + "\\src\\main\\java\\man_paying_toll_tax.jpg"));
        
        //setting all category colection combo box
        comboLoaderFromDatabase();
        
        //setting default tax for category pre- selected in combo box when window loads
        tollTaxUpdater();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel3 = new javax.swing.JPanel();
        Head3 = new javax.swing.JPanel();
        Heading3 = new javax.swing.JLabel();
        Form = new javax.swing.JPanel();
        Veh_N = new javax.swing.JLabel();
        vehicle_number = new javax.swing.JTextField();
        vehicle_type = new javax.swing.JComboBox<>();
        Veh_T = new javax.swing.JLabel();
        cash_recieved = new javax.swing.JTextField();
        Cash_Rec = new javax.swing.JLabel();
        Toll_Tax = new javax.swing.JLabel();
        toll_tax = new javax.swing.JTextField();
        Cash_Change = new javax.swing.JLabel();
        change = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Time = new javax.swing.JLabel();
        current_time = new javax.swing.JTextField();
        man = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        program = new javax.swing.JMenu();
        program_exit = new javax.swing.JMenuItem();
        home = new javax.swing.JMenu();
        go_home = new javax.swing.JMenuItem();
        view = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        tools = new javax.swing.JMenu();
        update_toll_tax = new javax.swing.JMenuItem();
        account = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adding New Vehicle Toll Record");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Main_Panel3.setBackground(new java.awt.Color(21, 34, 56));

        Head3.setBackground(new java.awt.Color(0, 0, 0));

        Heading3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Heading3.setForeground(new java.awt.Color(255, 255, 255));
        Heading3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading3.setText("Add New Vehicle Toll Record");
        Heading3.setToolTipText("");

        javax.swing.GroupLayout Head3Layout = new javax.swing.GroupLayout(Head3);
        Head3.setLayout(Head3Layout);
        Head3Layout.setHorizontalGroup(
            Head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
        );
        Head3Layout.setVerticalGroup(
            Head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        Form.setBackground(new java.awt.Color(230, 235, 237));
        Form.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(30, 154, 223)));
        Form.setPreferredSize(new java.awt.Dimension(400, 380));

        Veh_N.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Veh_N.setText("Vehicle Number");

        vehicle_number.setPreferredSize(new java.awt.Dimension(125, 25));

        vehicle_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_typeActionPerformed(evt);
            }
        });

        Veh_T.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Veh_T.setText("Vehicle Type");

        cash_recieved.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cash_recievedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cash_recievedKeyTyped(evt);
            }
        });

        Cash_Rec.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Cash_Rec.setText("Cash Received");

        Toll_Tax.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Toll_Tax.setText("Toll");

        toll_tax.setFocusable(false);

        Cash_Change.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Cash_Change.setText("Change");

        change.setFocusable(false);

        Insert.setBackground(new java.awt.Color(255, 193, 0));
        Insert.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        Insert.setText("Insert");
        Insert.setBorder(null);
        Insert.setInheritsPopupMenu(true);
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        Insert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InsertKeyTyped(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(101, 211, 67));
        Reset.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        Reset.setText("Reset");
        Reset.setBorder(null);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        Reset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResetKeyTyped(evt);
            }
        });

        Time.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Time.setText("Time");

        current_time.setFocusable(false);

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Veh_N, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(Cash_Rec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(Toll_Tax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(Cash_Change, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(Time, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(Veh_T, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addGap(18, 52, Short.MAX_VALUE))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addComponent(Insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vehicle_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cash_recieved)
                    .addComponent(toll_tax)
                    .addComponent(change)
                    .addComponent(current_time)
                    .addComponent(vehicle_number, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Veh_N, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicle_number, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Veh_T, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicle_type, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cash_Rec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cash_recieved, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Toll_Tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toll_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cash_Change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(current_time, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        man.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Main_Panel3Layout = new javax.swing.GroupLayout(Main_Panel3);
        Main_Panel3.setLayout(Main_Panel3Layout);
        Main_Panel3Layout.setHorizontalGroup(
            Main_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Head3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(man, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Form, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
        Main_Panel3Layout.setVerticalGroup(
            Main_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_Panel3Layout.createSequentialGroup()
                .addComponent(Head3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Main_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_Panel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(man, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Main_Panel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programActionPerformed(evt);
            }
        });

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

        go_home.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        go_home.setText("Home");
        go_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_homeActionPerformed(evt);
            }
        });
        home.add(go_home);

        jMenuBar1.add(home);

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

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        account.add(logout);

        jMenuBar1.add(account);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1118, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResetKeyTyped
        if( evt.getKeyCode() == KeyEvent.VK_ENTER ) //if user pressed entered while focusing on reset button runt his if condition
        {
            clickedOnResetButton(); //run the reset method
        }
    }//GEN-LAST:event_ResetKeyTyped

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed

        //when user clicked on reset button
        clickedOnResetButton();
    }//GEN-LAST:event_ResetActionPerformed

    private void InsertKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsertKeyTyped
        if( evt.getKeyCode() == KeyEvent.VK_ENTER ) //if user pressed entered while focusing on insert button runt his if condition
        {
            clickedOnInsertButton(); //run the insertion process method
        }
    }//GEN-LAST:event_InsertKeyTyped

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed

        //when user clicked on insert button
        clickedOnInsertButton();
    }//GEN-LAST:event_InsertActionPerformed

    private void cash_recievedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash_recievedKeyTyped

    }//GEN-LAST:event_cash_recievedKeyTyped

    private void cash_recievedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash_recievedKeyReleased
        //update change value as user enter cash
        changeValueUpdater();
    }//GEN-LAST:event_cash_recievedKeyReleased

    private void vehicle_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_typeActionPerformed

        //update the tax according to the item selected
        tollTaxUpdater();
    }//GEN-LAST:event_vehicle_typeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void go_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_homeActionPerformed
        new Toll(User.user_no).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_go_homeActionPerformed

    private void update_toll_taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_toll_taxActionPerformed
        //transfer control to update toll form
        new updateToll(User.user_no).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_update_toll_taxActionPerformed

    private void program_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_program_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_program_exitActionPerformed

    private void programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programActionPerformed
        System.exit(0);
    }//GEN-LAST:event_programActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new View(User.user_no).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public void comboLoaderFromDatabase()
    {
        
        
        //fetching latest all vehicle categories from database with their taxes
        db.generalQuery("select category_No,category_name,category_tax from Category;");
        
        while(db.next())
        {
            //storing each category with its correspoonding tax in HashMap
            category_collection_with_taxes.put( db.col("category_name") , db.col("category_tax"));
            
            //storing each category name as key and its ID as value in hashmap
            category_collection_with_category_ID.put(db.col("category_name") , db.col("category_No") );
            
            //setting combo box items one by one by fetching them
            vehicle_type.addItem( db.col("category_name").toString() );
        }
        
    }
    
    public void tollTaxUpdater()
    {
        //fetching the current combo box item selected
        String selected_name = vehicle_type.getSelectedItem().toString();
        
        //fetching proper tax for the selected item from hashmap indexing
        String tax = category_collection_with_taxes.get( selected_name ).toString();
        
        //setting the computed tax in toll tax box
        toll_tax.setText(tax);
    }
    
    //whenever user presess a key compute change set to change box
    public void changeValueUpdater()
    {
        int cashRecieved;
        int tollTax;
        
        if( cash_recieved.getText().length() == 0 ) //recieved cash is not entered or does not exists
            return;
        
        cashRecieved = Integer.parseInt(cash_recieved.getText());
        tollTax = Integer.parseInt(toll_tax.getText());
        
        int changeCash = cashRecieved - tollTax;
        
        if( changeCash >= 0 ) //there is some or no change cash to be given to user
        {
            change.setText( changeCash + "" );
        }
        else
        {
            change.setText( null ); //if the recievedCash is less than the Toll Tax 
        }
    }
    
    public boolean ValidateFields()
    {
        if ( vehicle_number.getText().length() == 0 || cash_recieved.getText().length() == 0 ) 
        {
            //display message any fields is empty
            JOptionPane.showMessageDialog(rootPane, "Please Fill All the Fields", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else 
        {
            return true; //all the required fields are not empty so return true
        }
    }
    
    public boolean validateCashAmountRecieved()
    {
        //if there is no change to be given what definitely means that the recieved amount was less than toll tax 
        if ( change.getText().length() == 0 )
        {
            //display message any fields is empty
            JOptionPane.showMessageDialog(rootPane, "Recieved Cash is Less Than Toll Tax", "Recieved Cash Insufficient", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        else 
        {
            return true; //the length of change box is bigger than 0
        }
    }
    public void clickedOnResetButton()
    {
        vehicle_number.setText("");
        cash_recieved.setText("");
        change.setText("");
        toll_tax.setText("");
        current_time.setText("");
        
        //setting default tax for category pre- selected in combo box when window loads
        tollTaxUpdater();
    }
    
    public void clickedOnInsertButton()
    {
        //validate required fields first
        if( !ValidateFields() ){
            return; //exit the function if validation fails
        }
        
        //validate cash amount recieved with respect to toll tax for vehicle
        if( !validateCashAmountRecieved())
            return;
        
        
        //fetching all fields values
        String vehiclePlateNo = vehicle_number.getText();
        String categoryID = category_collection_with_category_ID.get( vehicle_type.getSelectedItem() ).toString();
        int cashRecieved = Integer.parseInt(cash_recieved.getText());
        int tollTax = Integer.parseInt(toll_tax.getText());
        int changeCash = Integer.parseInt( change.getText() );
        String currentTimeStamp = setCurrentTime(); 
        int currentUserID = User.user_no;
        
        
        //Dsiplay record added successfully message
        JOptionPane.showMessageDialog(rootPane, "Vehicle Toll Record Added: "+vehiclePlateNo, "Vehicle Entry Successful", JOptionPane.INFORMATION_MESSAGE);
        
        Receipt();
        
        //preparing query to insert record
        String query = "INSERT INTO Toll_Record VALUES('" + vehiclePlateNo + "'," + 
                        categoryID + "," + cashRecieved + "," + changeCash + ",'" + currentTimeStamp + "'," + currentUserID + ");";
        
        //insert record
        db.IUDQuery(query);
        
        //after successful record insertion refresh the form
        clickedOnResetButton();
    }
    
    public String setCurrentTime() //this method sets current time in Time Fields as well as return it as a string
    {
            //Getting Current Time
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
            

            //Sending Calculated Time To Text Field
            current_time.setText(time);
            
            return time;
    }
    
    public void Receipt()
    {
        //file location will be in projects root directory for that specific computer on which program running
        String path = dir + "\\src\\main\\java\\Recipt.txt";
        
        try
        {
            //Writing recipt
            FileWriter writer = new FileWriter(path);
            
            String V_Num = vehicle_number.getText();
            String V_Typ = vehicle_type.getSelectedItem().toString();
            String Cas_R = cash_recieved.getText();
            String Toll_T = toll_tax.getText();
            String Cas_C = change.getText();
            String Time = current_time.getText();
             
            writer.write("----Toll Plaza Receipt----");
            writer.write("\n\nVehical Number  "+V_Num);
            writer.write("\nVehical Type    "+V_Typ);
            writer.write("\nCash Received   "+Cas_R);
            writer.write("\nToll            "+Toll_T);
            writer.write("\nCash Change     "+Cas_C);
            writer.write("\nTime            "+Time); 
            writer.write("\n\n---------------------------");   

            writer.close();
            
            
            //Now Open The recipt file after writing a recipt
            File Recipt = new File(path); //fetching file first
            Desktop.getDesktop().open( Recipt );
        }
        catch(IOException e){
        e.printStackTrace();
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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert(0).setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Cash_Change;
    public javax.swing.JLabel Cash_Rec;
    public javax.swing.JPanel Form;
    public javax.swing.JPanel Head3;
    public javax.swing.JLabel Heading3;
    public javax.swing.JButton Insert;
    public javax.swing.JPanel Main_Panel3;
    public javax.swing.JButton Reset;
    public javax.swing.JLabel Time;
    public javax.swing.JLabel Toll_Tax;
    public javax.swing.JLabel Veh_N;
    public javax.swing.JLabel Veh_T;
    public javax.swing.JMenu account;
    public javax.swing.JTextField cash_recieved;
    public javax.swing.JTextField change;
    public javax.swing.JTextField current_time;
    public javax.swing.JMenuItem go_home;
    public javax.swing.JMenu home;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenuItem logout;
    public javax.swing.JLabel man;
    public javax.swing.JMenu program;
    public javax.swing.JMenuItem program_exit;
    public javax.swing.JTextField toll_tax;
    public javax.swing.JMenu tools;
    public javax.swing.JMenuItem update_toll_tax;
    public static javax.swing.JTextField vehicle_number;
    public javax.swing.JComboBox<String> vehicle_type;
    public javax.swing.JMenu view;
    // End of variables declaration//GEN-END:variables
}