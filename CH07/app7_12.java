// app7_12, ��������(method)���إ�
class CCircle   // �w�q���OCCircle
{
   private double pi=3.14;    // �N��Ʀ����]�w��private
   private double radius;
  
   public void show_area(){   // �Nmethod�]�wpublic
      System.out.println("area="+pi*radius*radius);
   }
   public void setRadius(double r){  
      if(r>0){
         radius=r;      // �N�p������radius�]��r
         System.out.println("radius="+radius);
      }
      else
         System.out.println("input error");
   }  
}

public class app7_12
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();  
      cir1.setRadius(-2.0);
      cir1.show_area();
   }
}
/*results
C:\mytest>javac app7_12.java

C:\mytest>java app7_12
input error
area=0.0
*/