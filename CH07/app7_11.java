// app7_11, 私有成員無法從類別外部來存取的範例
class CCircle   // 設定field為私有成員
{
   private double pi=3.14;    // 將資料成員設定初值
   private double radius;
   
   void show_area(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app7_11
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.radius=-2.0;
      cir1.show_area();
   }
}  
/*results
C:\mytest>javac app7_11.java
app7_11.java:17: radius has private access in CCircle
      cir1.radius=-2.0;
          ^
1 error
*/