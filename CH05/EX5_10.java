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

	System.out.print("�п�J��妨�Z�G");
	str=buf.readLine();
	chin=Integer.parseInt(str);

	System.out.print("�п�J�ƾǦ��Z�G");
	str=buf.readLine();
	math=Integer.parseInt(str);

	System.out.print("�п�J�۵M���Z�G");
	str=buf.readLine();
	nature=Integer.parseInt(str);

	System.out.print("�п�J���|���Z�G");
	str=buf.readLine();
	session=Integer.parseInt(str);
	score=chin+math+nature+session;
	avg=score/4;
	level=(int)avg/10;
	switch(level)
	{
	case 10:
	  System.out.println("�z���������Z�O"+avg);
          System.out.println("�z�����ŬOAA��");
 	  break;

	case 9:
	  System.out.println("�z���������Z�O"+avg);
          System.out.println("�z�����ŬOA��");
 	  break;

	case 8:
	  System.out.println("�z���������Z�O"+avg);
          System.out.println("�z�����ŬOB��");
 	  break;

	case 7:
	  System.out.println("�z���������Z�O"+avg);
          System.out.println("�z�����ŬOC��");
 	  break;

	case 6:
	  System.out.println("�z���������Z�O"+avg);
	  System.out.println("�z�����ŬOD��");
 	  break;

        default:
          System.out.println("�z���������Z�O"+avg);
          System.out.println("�z�����ŬOE��");	

	}
  }
}