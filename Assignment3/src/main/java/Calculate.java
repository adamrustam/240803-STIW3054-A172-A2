
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.Writer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adamrustam
 */
public class Calculate {
    

    Writer writer = null;
       
    
    public void kira() throws Exception {
    
    System.out.println ("Counting Words");       
       FileReader fr = new FileReader ("/Users/adamrustam/240803-STIW3054-A172-A1.wiki/Home.md");        
       BufferedReader br = new BufferedReader (fr);     
       String line = br.readLine ();
       int count = 0;
       int bilLine = 0;
       while (line != null) {
          String []parts = line.split(" ");
          bilLine++;
          for( String w : parts)
          {
            count++;        
          }
          line = br.readLine();
       }
       

       
       File file = new File("/Users/adamrustam/240803-STIW3054-A172-A2.wiki/Home2.md");
       writer = new BufferedWriter(new FileWriter(file));
       
       System.out.println("Words : "+count);
       writer.write("* Words : "+count +"\n");
       
       System.out.println("Lines : "+bilLine);
       writer.write("* Lines : "+bilLine +"\n");
       
       System.out.println("Average words in one line : "+count / bilLine + " Words ");
       writer.write("* Average words in one line : "+count / bilLine + " Words "+"\n");
       
       try {                 
            if (writer != null) {                     
                writer.close();                 
            }             
        } catch (IOException e) {                 
            e.printStackTrace();             
        }
    
    
    }

    
  

}
    
    
    



