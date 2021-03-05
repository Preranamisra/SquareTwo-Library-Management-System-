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
 * @author 91861
 */
public class LoanManager {
   
 
/**
 *
 * @author prera
 */
    private ArrayList<Loan> loanRecord;
    private String exLine;
    
    
    public boolean init(String fn) {
        boolean result=false;
        
    result = true;
    readFile();
    return result;
   
    }
     
    public LoanManager()  {
        this.loanRecord=new ArrayList<Loan>();
        
        
        
    }
      
            
            public List<Loan> getLoan() {
                List<Loan> result = null;
                result = Collections.unmodifiableList(this.loanRecord);
                return result;
            }
                    public boolean calLoan(Loan newLoan) throws IOException {
                        boolean result = false;
                        
                                              
                        result=true;
                        return result;
                    }
                    public boolean BorrowandReturn(Loan newLoan) {
                        boolean result = false;
                        
                        this.loanRecord.add(newLoan);
                        System.out.println("Borrow and Return book record" +newLoan.toString());
                        result=true;
                        return result;
                    }
        public void readFile() {
        
        try(FileReader reader = new FileReader("borrowm.csv");
         BufferedReader bufReader = new BufferedReader(reader)){
            exLine=bufReader.readLine();
            String oneLine;
            
           
         
            
            while((oneLine= bufReader.readLine()) != null){
                System.out.println(oneLine);
                
                StringTokenizer st = new StringTokenizer(oneLine, "|");
                String[] a=new String[6];
                int count=0;
                while (st.hasMoreTokens()) {
                    
                    a[count]=st.nextToken();
                    count++;
                }
                
                Loan b1=new Loan(a[0],a[1],a[2],a[3],a[4],a[5]);                
                
                this.loanRecord.add(b1);
               
                
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
                        LoanManager mngr = new LoanManager();
                        mngr.init("borrowm.csv");
                        
                        
                        
                        int res;
                        List<Loan> temp=mngr.getLoan();
                        
                        assert(mngr.getLoan().size()==4);
                      //  JFrame borrowandreturnUI=new BorrowandReturnUI(mngr);
                        //borrowandreturnUI.setVisible(true);
                        
                        
                        
                    }

   
       
}
                
               
         

