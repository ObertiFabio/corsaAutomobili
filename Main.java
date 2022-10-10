import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r=new Random(); 
    
    ruota citta1 = new ruota("roma",500);
    ruota citta2 = new ruota("napoli",500);
    ruota citta3 = new ruota("firenze",500);
    citta1.start();
    citta2.start();
    citta3.start();
  }
}