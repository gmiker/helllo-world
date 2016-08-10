// simple POJO
//
public class simple {
  private int count;
  
  public void simple() {
    count = 0;
    }
    
  public void bump() {
    count++;
  }
  
  public void report() {
    System.out.println("There are " + count + " simple counts that have occurred." );
  }
  
  public static void main( String args ) {
    if ( args.length > 0 ) {
      simple S = new simple();
      for( int i = 0; i < args.length; i++ ) S.bump();
      
      S.report();
    }
  }
    

}


//gmike
