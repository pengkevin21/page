// app7_3a, method���إ�
class CRectangle
{
   int width;        
   int height;        
   int area()        // �w�q��Ʀ���area(), �Ψӭp�⭱�n
   {
      return width*height;
   }
   
   int perimeter()    // �w�q��Ʀ���perimeter(), �Ψӭp��P��
   {
      return 2*(width+height);
   }
}

class CCircle   // �w�q���OCCircle
{
   double pi=3.14;    // �N��Ʀ����]�w���
   double radius;
   
   double show_area()	// show_area() method, ��ܥX�ꭱ�n
   {     
      return pi*radius*radius;
   }
}

public class app7_3a
{
   public static void main(String args[])
   {
      CRectangle rect1,rect2;
      rect1=new CRectangle();    // �إ߷s������
      rect2=new CRectangle();
      CCircle c1=new CCircle();
 
      rect1.width=10;    // �]�w�����rect1���e
      rect1.height=5;    // �]�w�����rect1����
      c1.radius=20;
      
      System.out.println("area="+rect1.area());
      System.out.println("perimeter="+rect1.perimeter());
      System.out.println("area="+rect2.area());
      System.out.println("perimeter="+rect2.perimeter());
      System.out.println("Circle area="+c1.show_area());
   }
}
/*results
C:\mytest>javac app7_3a.java

C:\mytest>java app7_3a
area=50
perimeter=30
area=0
perimeter=0
Circle area=1256.0
*/