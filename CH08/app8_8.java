// app8_8, �u���O�ܼơv���ϥ�
class CCircle   // �w�q���OCCircle
{
   private static int num=0;         // �]�wnum���u���O�ܼơv
   private static double pi=3.14;   // �]�wpi���u���O�ܼơv
   private double radius;
 
   public CCircle(double r){ // CCircle�غc��
      radius=r;
      num++;       // ��CCircle()�غc���Q�I�s�ɡAnum�K�[1
   }      
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
   public void count(){   // count() method�A�Ψ���ܥثe����إߪ��Ӽ�
      System.out.println(num+" object(s) created");      
   }   
}

public class app8_8
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      cir1.count();       // ��cir1����I�scount() method
      CCircle cir2=new CCircle(2.0);
      cir1.count();       // ��cir1����I�scount() method
      cir2.count();       // ���cir2����I�scount() method
   }
}  

