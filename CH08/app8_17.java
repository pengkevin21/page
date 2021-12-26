// app8_17, 內部類別的撰寫
public class app8_17
{
   public static void main(String args[])
   {  
      Caaa aa= new Caaa();
      aa.set_num(5);
   }
   
   static class Caaa
   {
      int num;
      void set_num(int n){
         num=n;
         System.out.println("num= "+ num); 
      }
   }   
}

