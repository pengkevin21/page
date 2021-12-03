// app5_1,選擇性結構
public class App5_1
{
   public static void main(String args[])
   {
      int a=6,b=5;
      
      System.out.println("a="+a+",b="+b);
      if (a>b)
         System.out.println("a-b="+(a-b)); // a>b時計算並印出結果
      System.out.println("a*b="+(a*b));    // 計算並印出結果
   }
}
/* results
C:\mytest>javac App5_1.java
C:\mytest>java App5_1
a=6,b=5
a-b=1
a*b=30
*/
