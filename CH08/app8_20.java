// app8_20, �ΦW�������O
public class app8_20
{
   public static void main(String args[])
   {  
      (new Caaa(){void set_num(int n){num=n;
       System.out.println("num= "+ num);}}).set_num(5);
   }

   static class Caaa
   {
       int num;
   }
}
