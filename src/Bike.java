abstract public class Bike{
     abstract void ride();
}
 class YamahaXZ extends Bike{
     @Override
     void ride() {
         System.out.println("Drive Safely!");
     }

     public static void main(String[] args) {
         Bike b = new YamahaXZ();
         b.ride();
     }
 }
