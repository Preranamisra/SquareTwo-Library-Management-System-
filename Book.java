/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swelab;

/**
 *
 * @author prera
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    private String Title,ISBN_no,Author;
    private String BookID ;

    Book(String text, String text0, String text1, String text2, String text3, String text4, String text5) {
        
    }

    Book(String abc) {
         //To change body of generated methods, choose Tools | Templates.
    }

    Book(String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public String getAuthor() {
        return Author;
    }
     public Book(String BookID, String Title, String ISBN_no, String Author ) {
       this.Title=Title;
       this.BookID=BookID;
       this.ISBN_no=ISBN_no;
       this.Author=Author;
    }
    
   public String toString() {
        return "BookID" + this.getBookID() + "Title" + this.getTitle() + "ISBN_no" + this.getISBN_no() +"Author" + this.getAuthor();
    }
}
        // TODO code application logic here
    
    

