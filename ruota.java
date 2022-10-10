import java.util.Random;
 class ruota extends Thread {
  
  private String citta;
  private Random r;
  private int ritardo;
   
   public ruota(String citta, int ritardo){
    this.citta=citta;
     this.ritardo=ritardo;
     r=new Random();
   }

  public ruota(String citta){
    this.citta=citta;
    r=new Random();
    ritardo=0;
  }

   public void run(){
      int N;
      for(int i=0;i<5;i++){
          N=r.nextInt(90)+1;
          System.out.println(citta +" " + N);
  
        try{
            sleep(ritardo);
          } 
          catch(Exception e){
             System.out.println("errore");
          }
      }
    }
}