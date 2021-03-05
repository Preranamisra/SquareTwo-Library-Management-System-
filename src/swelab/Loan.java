/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swelab;

/**
 *
 * @author 91861
 */
public class Loan {

    /**
     * @param args the command line arguments
     */

    /**
     * @param args the command line arguments
     */
    private String Title,ISBN_no,Borrow_Date,Return_Date ;
    private String BookID ;
    String getISBN;

    Loan(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Loan(String string, String string0, String string1, String string2, String string3, String string4) {
    }

    Loan(String text) {
    
    }

 public String getTitle() {
        return this.Title;
    }
    
    public String getBookID() {
        return BookID;
    }
    
    public String getISBN_no() {
        return ISBN_no;
    }
    public String getBorrow_Date() {
        return Borrow_Date;
    }
    public String getReturn_Date() {
        return Return_Date;
    } 
     public Loan(String BookID, String Title, String ISBN_no, String Borrow_Date,String Return_Date ) {
       this.Title=Title;
       this.BookID=BookID;
       this.ISBN_no=ISBN_no;
       this.Borrow_Date=Borrow_Date;
       this.Return_Date=Return_Date;
    }
    
   public String toString() {
        return "BookID" + this.getBookID() + "Title" + this.getTitle() + "ISBN_no" + this.getISBN_no() +"Borrow_Date" + this.getBorrow_Date()+"Return_Date"+this.getReturn_Date();
    }

    }
    

