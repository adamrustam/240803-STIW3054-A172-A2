

/**
 *
 * @author adamrustam
 */
public class Ass3 {
    
    
    

    public static void main(String[] args) throws Exception {
        
       final long start = System.currentTimeMillis()/1000 ;
       //System.out.println("start:"+start) ;
       Read ABC = new Read() ;
       ABC.See() ;
       ABC.baca() ;
       
       Calculate CDE = new Calculate() ;
       CDE.kira() ;
       
       
       
    
       final long end = System.currentTimeMillis()/1000 ;
       //System.out.println(end) ;
       long elapsedTime = end - start ;
       //System.out.println("ElapsedTime : "+elapsedTime) ;
       
       //long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime) ;
       System.out.println("Tooks : "+elapsedTime+"s") ;
       
       
       
    }

}





    
    
