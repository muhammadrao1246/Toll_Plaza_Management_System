/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handles;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Home
 */
public class Database
{
    public Connection con = null; //contains connection with database
    
    public ResultSet row = null; //contains row if returned after running SELECT query
    
    public int effect_count; //contains number of relation, attributes or rows which are affected after running INSERT, UPDATE or DELETE query
    
    
    //used to establish a secureconnection with database
    public Database()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433";
            String uname = "sa";
            String upass = "12345678";
            con = DriverManager.getConnection(url,uname,upass);
            System.out.println("Connection Established : ");
            
            //if connection established checke does database exists with the name of Toll_Plaza
            generalQuery("select * from master.sys.databases where name = 'Toll_Plaza';");
            //check if database exists (if does not exists then create database with all its tables and views also)
            if(!next())
            {
                //create database first
                IUDQuery("create database Toll_Plaza");
                System.out.println("database created");
                
                //create tables all 
                
                //-------create table Login
                IUDQuery("CREATE TABLE Toll_Plaza.dbo.Login(\n" +
                            "	userNo int IDENTITY(1,1) PRIMARY KEY,\n" +
                            "	userName varchar(50) NOT NULL UNIQUE,\n" +
                            "	userPassword varchar(50) NOT NULL\n" +
                            ")");
                //------------------Insert default records for users in this table
                IUDQuery("insert into Toll_Plaza.dbo.Login values('admin','admin');");

                
                //=-------create table category for vehicle's
                IUDQuery("CREATE TABLE Toll_Plaza.dbo.Category(\n" +
                            "	category_No int IDENTITY(1,1) PRIMARY KEY,\n" +
                            "	category_name varchar(20) NOT NULL,\n" +
                            "	category_tax int NOT NULL\n" +
                            ")");
                //-------------------Insert deault categories
                IUDQuery("insert into Toll_Plaza.dbo.Category values ('Car',100),('Bus',150),('Van',200),('Truck',250),('Trailer',300);");
                
                
                //--------create table toll records
                IUDQuery("CREATE TABLE Toll_Plaza.dbo.Toll_Record(\n" +
                            "	recordNo int IDENTITY(1,1) PRIMARY KEY,\n" +
                            "	vehiclePlateNo varchar(50) NOT NULL,\n" +
                            "	category_No int foreign key references Category(category_No),\n" +
                            "	recievedAmount int NOT NULL,\n" +
                            "	changeAmount int NULL,\n" +
                            "	recordDate datetime,\n" +
                            "	recordAddedBy int foreign key references Login(userNo)\n" +
                            ")");
                //-------------------Inserting demo records
                IUDQuery("insert into Toll_Plaza.dbo.Toll_Record values('LHR-534',1,500,400,'2023-01-16 22:25:27',1)");
                
                
                
                System.out.println("All Tables created");
                
                
                //=======Database Connection Establishing On Top Of The Toll_Plaza=======
                    url += ";databaseName=Toll_Plaza";
                    con = DriverManager.getConnection(url,uname,upass);
                    System.out.println("Database Connection Establishing On Top Of The Toll_Plaza");
                
                //Creating record organizing view
                IUDQuery("create view Toll_Record_Details as\n" +
                            "select Toll_Plaza.dbo.Toll_Record.recordNo as 'Record ID', \n" +
                            "Toll_Plaza.dbo.Toll_Record.vehiclePlateNo as 'Plate No', \n" +
                            "Toll_Plaza.dbo.Category.category_name as 'Category', \n" +
                            "Toll_Plaza.dbo.Toll_Record.recievedAmount as 'Recieved', \n" +
                            "Toll_Plaza.dbo.Toll_Record.changeAmount as 'Change', \n" +
                            "Toll_Plaza.dbo.Category.category_tax as 'Tax Deducted', \n" +
                            "Toll_Plaza.dbo.Toll_Record.recordDate as 'Dated', \n" +
                            "Toll_Plaza.dbo.Login.userName as 'Added By' \n" +
                            "\n" +
                            "from Toll_Plaza.dbo.Toll_Record, Toll_Plaza.dbo.Login, Toll_Plaza.dbo.Category \n" +
                            "\n" +
                            "where Toll_Plaza.dbo.Toll_Record.recordAddedBy = Toll_Plaza.dbo.Login.userNo \n" +
                            "AND \n" +
                            "Toll_Plaza.dbo.Toll_Record.category_No = Toll_Plaza.dbo.Category.category_No ;"
                );
                System.out.println("All Views created");
                
                return;
            }
            
            //=======Database Connection Establishing On Top Of The Toll_Plaza=======
            url += ";databaseName=Toll_Plaza";
            con = DriverManager.getConnection(url,uname,upass);
            System.out.println("Database Connection Establishing On Top Of The Toll_Plaza");
            
        }
        catch(ClassNotFoundException c)
        {
            JOptionPane.showMessageDialog(null,c.toString(),"Driver Class Exception",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql.toString(),"SQL Exception Occured",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString(),"Error Occured in Database Model: "+e.getClass().getSimpleName(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //to run queries which returns Something on successfulness i.e SELECT query
    public void generalQuery(String stmt)
    {
        try
        {
            Statement query = con.createStatement();
            row = query.executeQuery(stmt);
            System.out.println("General Query Executed Successfully: "+row.getType());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString(),"Error Occured in Database Model: "+e.getClass().getSimpleName(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //to run INSERT, UPDATE, and DELETE queries
    public void IUDQuery(String stmt)
    {
        try
        {
            Statement query = con.createStatement();
            effect_count = query.executeUpdate(stmt);
            System.out.println("Insert, Update and Delete Query Executed Successfully: Effected Rows -> "+effect_count);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString(),"Error Occured in Database Model: "+e.getClass().getSimpleName(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //to point to next row to start fetching data
    public boolean next()
    {
        try
        {
            if(row != null)
                return row.next();
            else 
                return false;
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql.toString(),"SQL Exception Ocurred",JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
    }
    
    //to fetch desired column value from the row ResultSet variable
    public Object col(String column)
    {
        try
        {
            if(row != null)
                return row.getObject(column);
            else 
                return false;
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql.toString(),"SQL Exception Ocurred",JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
    }
    
    //to close the database connection safely
    public void close()
    {
        try
        {
            if(con != null)
                con.close();
            else 
                return;
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql.toString(),"Error in Database occured",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
