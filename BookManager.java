/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swelab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JFrame;
/**
 *
 * @author prera
 */
public class BookManager {
    private ArrayList<Book> bookStore;
    private String exLine;
    
    
    public boolean init(String fn) {
        boolean result=false;
        
    result = true;
    readFile();
    return result;
   
    }
     
    public BookManager()  {
        this.bookStore=new ArrayList<Book>();
        
        
        
    }
      
            
            public List<Book> getBooks() {
                List<Book> result = null;
                result = Collections.unmodifiableList(this.bookStore);
                return result;
            }
                    public boolean addBook(Book newBook) {
                        boolean result = false;
                        
                        this.bookStore.add(newBook);
                        System.out.println("added" +newBook.toString());
                        result=true;
                        return result;
                    }
                    public boolean DonateBook(Book newBook) {
                        boolean result = false;
                        
                        this.bookStore.add(newBook);
                        System.out.println("Donated" +newBook.toString());
                        result=true;
                        return result;
                    }
        public void readFile() {
        
        try(FileReader reader = new FileReader("bookm.csv");
         BufferedReader bufReader = new BufferedReader(reader)){
            exLine=bufReader.readLine();
            String oneLine;
            
           
         
            
            while((oneLine= bufReader.readLine()) != null){
                System.out.println(oneLine);
                
                StringTokenizer st = new StringTokenizer(oneLine, "|");
                String[] a=new String[4];
                int count=0;
                while (st.hasMoreTokens()) {
                    
                    a[count]=st.nextToken();
                    count++;
                }
                
                Book b1=new Book(a[0],a[1],a[2],a[3]);                
                
                this.bookStore.add(b1);
               
                
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
                 
                
               
        }
        
        
        }
                    public boolean doHousekeeping() {
                        return true;
                    }
                    public static void main(String[] args) throws IOException {
                        BookManager mngr = new BookManager();
                        mngr.init("bookm.csv");
                        
                        
                        
                        int res;
                        List<Book> temp=mngr.getBooks();
                        
                        assert(mngr.getBooks().size()==4);
                        //JFrame donateBookUI = new DonateBookui(mngr);
                        //donateBookUI.setVisible(true);
                        
                        
                    }

    public ArrayList<Book> searchByAuthor(String Auth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

    