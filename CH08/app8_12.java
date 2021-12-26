// app8_12,物件的比較
class CCircle 
{
   private static double pi=3.14;   
   private double radius;
 
   public CCircle(double r){ // CCircle()建構元
      radius=r;
   }
   public void compare(CCircle cir){ // compare() method
      if(this==cir) 
         System.out.println("objects are equal");
      else
         System.out.println("objects are not equal");      
      }         
}

public class app8_12
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      CCircle cir2=new CCircle(2.0);      
      cir1.compare(cir2);   // 呼叫compare()，比較cir1與cir2是否相同
   }
}


