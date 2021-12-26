// app7_4, 圓形類別CCircle
class CCircle   // 定義類別CCircle
{
   double pi=3.14;    // 將資料成員設定初值
   double radius;
   
   void show_area(){     // show_area() method, 顯示出圓面積
      System.out.println("area="+pi*radius*radius);
   }
}

public class app7_4
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // 宣告並建立新的物件
      cir1.radius=2.0;
      cir1.show_area();
   }
}  
/*results
C:\mytest>javac app7_4.java
C:\mytest>java app7_4
area=12.56
*/