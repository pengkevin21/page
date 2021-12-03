import java.io.*;
public class EX5_12
{
	public static void main (String args[])throws IOException
	{
	    char choose;//選擇的字元變數
	    //迴圈開始
	    do
	    {
	      System.out.print("請輸入身分證字號 : ");
	      choose=(char)System.in.read();//輸入一個字元
	     //switch判斷開始
	      switch(choose)
	      {
	        case'a':
	        case'A':
	       		System.out.println("台北市");
	        break;//結束第一項
	        case'b':
	        case'B':
	        System.out.println("台中市");
	        break;//結束第二項
	        case'c':
	        case'C':
	        System.out.println("台南市");
	        break;//結束第三樣
	        case'd':
	        case'D':
	        System.out.println("高雄市");
	        break; 
	        default:
	        System.out.println("查無此人")
	        break;
	      }
	    }while((choose!=68)&&(choose!=100));
	}
}
