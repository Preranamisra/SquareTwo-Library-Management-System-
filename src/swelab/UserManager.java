/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swelab;

/**
 *
 * @author 10
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JFrame;
/**
 *
 * @author 10
 */
public class UserManager 
{
    private ArrayList<Account> manageReader;
    private String exLine;

    

    
    

    
    
    
    
    public boolean init(String fn) 
    {
        boolean result=false;
        
    result = true;
    readFile();
    return result;
    }
    
public UserManager()
{
    this.manageReader=new ArrayList<Account>();
}

    public List<Account> getAccount()
    {
     List<Account> result = null;
     result = Collections.unmodifiableList(this.manageReader);
     return result;
    }
        //public boolean updateAccount(Account newAccount)
        //{
        //boolean result = false;
        
        //this.manageReader.add(newAccount);
        //System.out.println("added" + newAccount.toString());
        //result = true;
        //return result;
        //}
        
        
        
        
        public void readFile()
        {
            try(FileReader reader = new FileReader("Account.csv");
                    BufferedReader bufReader = new BufferedReader(reader))
            {
                exLine = bufReader.readLine();
                String oneLine;
                
                while((oneLine = bufReader.readLine()) != null)
                {
                    System.out.println(oneLine);
                    StringTokenizer st = new StringTokenizer(oneLine, "|");
                String[] r=new String[8];
                int counter=0;
                while (st.hasMoreTokens()) {
                    
                    r[counter]=st.nextToken();
                    counter++;
                }
                
                Account b1=new Account(r[0],r[1],r[2],r[3],r[4],r[5],r[6]);                
                
                this.manageReader.add(b1);
               
                
            }
        }
                   
                
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        public void addUserAccount(String Name,String Username,String BR,String UserID,String Email,String Phone_no,String  Password,boolean isLibrarian) {
        manageReader.add(new Account(Name, Username,BR,UserID, Email, Phone_no, Password,false));
     
     
    }
        public ArrayList<Account> getAllAccounts(){
        return new ArrayList<>(manageReader);
        }


        public boolean doHousekeeping()
        {
            return true;
        }

    
       public static void main (String[] args) throws IOException
        {
            UserManager test = new UserManager();
            test.init("Account.csv");
            
            int res;
            List<Account> temp=test.getAccount();
            
            assert(test.getAccount().size()==5);
            //JFrame manageReaderUI = new Manage_Reader(test);
             //JFrame loginUI= new Login(test);
            //manageReaderUI.setVisible(true);
            //loginUI.setVisible(true);
        }

    

    
    
    
}
