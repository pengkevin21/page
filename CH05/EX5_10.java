import java.io.*;
public class EX5_10
{

  public static void main(String args[]) throws IOException
  {
	int chin;
	int math;
	int nature;
	int session;
	int score;
	float avg;
	int level;
	String str;
	BufferedReader buf;
	buf=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("請輸入國文成績：");
	str=buf.readLine();
	chin=Integer.parseInt(str);

	System.out.print("請輸入數學成績：");
	str=buf.readLine();
	math=Integer.parseInt(str);

	System.out.print("請輸入自然成績：");
	str=buf.readLine();
	nature=Integer.parseInt(str);

	System.out.print("請輸入社會成績：");
	str=buf.readLine();
	session=Integer.parseInt(str);
	score=chin+math+nature+session;
	avg=score/4;
	level=(int)avg/10;
	switch(level)
	{
	case 10:
	  System.out.println("您的平均成績是"+avg);
          System.out.println("您的等級是AA級");
 	  break;

	case 9:
	  System.out.println("您的平均成績是"+avg);
          System.out.println("您的等級是A級");
 	  break;

	case 8:
	  System.out.println("您的平均成績是"+avg);
          System.out.println("您的等級是B級");
 	  break;

	case 7:
	  System.out.println("您的平均成績是"+avg);
          System.out.println("您的等級是C級");
 	  break;

	case 6:
	  System.out.println("您的平均成績是"+avg);
	  System.out.println("您的等級是D級");
 	  break;

        default:
          System.out.println("您的平均成績是"+avg);
          System.out.println("您的等級是E級");	

	}
  }
}