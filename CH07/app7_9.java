// app7_9, ������OCCircle
class CCircle   // �w�q���OCCircle
{
   double pi;    // �N��Ʀ����]�w���
   double radius;
 
   double getRadius(){
      return radius;
   }

   void setCircle(double r, double p){     
      pi=p;
      radius=r;   
   }
}

public class app7_9
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // �ŧi�ëإ߷s������
      cir1.setCircle(2.0,3.1416);
      System.out.println("radius="+cir1.getRadius()); 
   }
}  
/*results
C:\mytest>javac app7_9.java
C:\mytest>java app7_9
radius=2.0
*/