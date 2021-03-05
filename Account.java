/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swelab;

import java.util.regex.Pattern;

/**
 *
 * @author prera
 */
public class Account {
    private String Name, Username,BR ;
    private String UserID,Email, Phone_no, Password;
    private Boolean IsLibrarian;

    public Account(String Name,String Username,String BR,String UserID,String Email,String Phone_no,String  Password,boolean isLibrarian) {
        this.Name=Name;
        this.Username=Username;
        this.Phone_no=Phone_no;
        this.UserID=UserID;
        this.Email=Email;
        this.Password=Password;
        this.IsLibrarian=IsLibrarian;
    }

    Account(String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNAME() {
        return Name;
    }

    public String getUSERNAME() {
        return Username;
    }

    public String getPHONE_NUMBER() {
        return Phone_no;
    }

    public String getUSERID() {
        return UserID;
    }

    public String getEMAIL_ID() {
        return Email;
    }
    public String getPASSWORD() {
        return Password;
    }
    public String getBR() {
        return BR;
    }

    public boolean isIsLibrarian() {
        return IsLibrarian;
    }
    

    public Account(String oneLine){
        String[] parts = oneLine.split("|");
        Name = parts[0].trim();
        Username=parts[1].trim();
        Phone_no = parts[2].trim();
        UserID = parts[3].trim();
        Email = parts[4].trim();
        Password = parts[5].trim();
        IsLibrarian = Boolean.parseBoolean(parts[1].trim().toLowerCase());
        if(!isValidEMAIL_ID(Email))
            throw new NumberFormatException();
        if(!isValidPHONE_NUMBER(Phone_no))
            throw new NumberFormatException();
    }
    private boolean isValidPHONE_NUMBER(String number){
        Long.parseLong(number);
        return (number.length() == 10 || (number.length() == 13 && number.substring(0,3).equals("+91")));
    }
    private boolean isValidEMAIL_ID(String Email){
        return Pattern.compile("^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@"
        + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$").matcher(Email).find();
    }
    public String toString(){
        return "UserID" + this.getUSERID() + "Name" + this.getNAME() + "Username" + this.getUSERNAME() + "Email"+this.getEMAIL_ID()+"Mobile number"+this.getPHONE_NUMBER()+"Password"+this.getPASSWORD();
        
    }
}

    

