// app7_3, method���إ�
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

public class app7_3
{
   public static void main(String args[])
   {
      CRectangle rect1,rect2;
      rect1=new CRectangle();    // �إ߷s������
      rect2=new CRectangle();
 
      rect1.width=10;    // �]�w�����rect1���e
      rect1.height=5;    // �]�w�����rect1����
      
      System.out.println("area="+rect1.area());
      System.out.println("perimeter="+rect1.perimeter());
      System.out.println("area="+rect2.area());
      System.out.println("perimeter="+rect2.perimeter());
   }
}
/*results
C:\mytest>javac app7_3.java

C:\mytest>java app7_3
area=50
perimeter=30
area=0
perimeter=0
*/