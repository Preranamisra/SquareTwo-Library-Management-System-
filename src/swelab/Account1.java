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
public class Account1 {

    
    /**
     * @param args the command line arguments
     */
    private String Name, Username,BR ;
    private String UserID;

    Account1(String oneLine) {
         //To change body of generated methods, choose Tools | Templates.
    }

    Account1(String string, String string0, String string1, String string2, String string3) {
        //To change body of generated methods, choose Tools | Templates.
    }

    Account1(String Name, String Username, String BR, String UserID, String Email, String Phone_no, String Password, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Account1(String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public String getName() {
    return Name;
}
public String getUserID() {
    return UserID;
}
public String getUsername() {
    return Username;
}
public String getBR() {
    return BR;
}
public Account1 (String Name, String UserID, String Username, String BR) {
    this.Name= Name;
    this.UserID= UserID;
    this.Username= Username;
    this.BR= BR;
}
public String toString() 
{
    return "UserID" + this.getUserID() + "Name" + this.getName() + "Username" + this.getUsername() + "BR" + this.getBR();
}
}

        

