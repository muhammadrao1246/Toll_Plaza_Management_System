/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Handles.Database;
/**
 *
 * @author 92311
 */
public class User 
{    
    static String user_name = null;
    static int user_no = 0;
    
    public static boolean isUser(int user_id)
    {
        //creating database class's object to run queries easily
        Database db = new Database();
        
        //checking whether user exists in database or not by this name
        db.generalQuery("select * from Login where userNo = "+user_id);
        
        //going to fetch the row obtained from query if exists
        if(db.next())
        {
           //storing all his details
           user_name = db.col("userName").toString(); //converting to string
           user_no = (int) db.col("userNo"); //converting to integer value
           
           //if everything is ok user exists return true
           return true;
        }
        else
        {
            //if user not found return false
            return false;
        }
    }
}
