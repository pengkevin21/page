// app7_7, �I�smethod�öǻ��޼�
class CCircle   // �w�q���OCCircle
{
   double pi=3.14;    // �N��Ʀ����]�w���
   double radius;
 
   void show_area(){     // show_area() method, ��ܥX�b�|�ζꭱ�n
      System.out.println("radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
    
   void setRadius(double r){  // setRadius() method, �i�Ψӳ]�w�b�|
      radius=r;   
   }
}

public class app7_7
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // �ŧi�ëإ߷s������
      cir1.setRadius(2.0);   // �]�wcir1���b�|��2.0
      cir1.show_area();          
   }
}
/*results
C:\mytest>javac app7_7.java

C:\mytest>java app7_7
radius=2.0
area=12.56
*/