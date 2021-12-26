// app7_10, 圓形類別CCircle
class CCircle   // 定義類別CCircle
{
   double pi=3.14;    // 將資料成員設定初值
   double radius;
   
   void show_area(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app7_10
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.radius=-2.0;
      cir1.show_area();
   }
}  
/*results
C:\mytest>javac app7_10.java

C:\mytest>java app7_10
area=12.56
*/