// app8_3, �غc�����ϥ�
class CCircle   // �w�q���OCCircle
{
   private double pi=3.14;    
   private double radius;
 
   public CCircle(double r){    // �w�q�غc��CCircle()
      radius=r;
   }   
   public void show(){  
      System.out.println("radius="+radius+", area="+pi*radius*radius);
   }
}

public class app8_3
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(4.0);  // �إߪ���éI�sCCircle()�غc��
      cir1.show();
   }
}  
