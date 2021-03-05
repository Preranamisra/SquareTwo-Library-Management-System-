/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swelab;

/**
 *
 * @author ghosh
 */
public class Book1 {
    /**
     * @param args the command line arguments
     */
    private String Title,ISBN_no,Author;
    private String BookID, Genre ;

    Book1(String text, String text0, String text1, String text2, String text3, String text4, String text5) {
        
    }

    Book1(String abc) {
         //To change body of generated methods, choose Tools | Templates.
    }

    Book1(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Book1(String text, String text0, String text1, String text2) {
         //To change body of generated methods, choose Tools | Templates.
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
    public String getGenre() {
        return Genre;
    }
     public Book1(String BookID, String Title, String ISBN_no, String Author, String Genre ) {
       this.Title=Title;
       this.BookID=BookID;
       this.ISBN_no=ISBN_no;
       this.Author=Author;
       this.Genre=Genre;
    }
    
   public String toString() {
        return "BookID" + this.getBookID() + "Title" + this.getTitle() + "ISBN_no" + this.getISBN_no() +"Author" + this.getAuthor() + "Genre" + this.getGenre();
    }
    
}
