// app7_8, ������OCCircle
class CCircle   // �w�q���OCCircle
{
   double pi;    // �N��Ʀ����]�w���
   double radius;
 
   void show_area(){     // show_area() method, ��ܥX�ꭱ�n
      System.out.println("area="+pi*radius*radius);
   }
    
   void setCircle(double p, double r){  // �֦���Ӥ޼ƪ�method
      pi=p;
      radius=r;   
   }
}

public class app7_8
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // �ŧi�ëإ߷s������
      cir1.setCircle(3.1416,2.0);   // �I�s�öǻ��޼ƨ�setCircle()
      cir1.show_area();          
   }
}  
/*results
C:\mytest>javac app7_8.java
C:\mytest>java app7_8
area=12.5664
*/