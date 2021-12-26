// app7_7, 呼叫method並傳遞引數
class CCircle   // 定義類別CCircle
{
   double pi=3.14;    // 將資料成員設定初值
   double radius;
 
   void show_area(){     // show_area() method, 顯示出半徑及圓面積
      System.out.println("radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
    
   void setRadius(double r){  // setRadius() method, 可用來設定半徑
      radius=r;   
   }
}

public class app7_7
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // 宣告並建立新的物件
      cir1.setRadius(2.0);   // 設定cir1的半徑為2.0
      cir1.show_area();          
   }
}
/*results
C:\mytest>javac app7_7.java

C:\mytest>java app7_7
radius=2.0
area=12.56
*/