import java.io.*;
public class EX5_12
{
	public static void main (String args[])throws IOException
	{
	    char choose;//��ܪ��r���ܼ�
	    //�j��}�l
	    do
	    {
	      System.out.print("�п�J�����Ҧr�� : ");
	      choose=(char)System.in.read();//��J�@�Ӧr��
	     //switch�P�_�}�l
	      switch(choose)
	      {
	        case'a':
	        case'A':
	       		System.out.println("�x�_��");
	        break;//�����Ĥ@��
	        case'b':
	        case'B':
	        System.out.println("�x����");
	        break;//�����ĤG��
	        case'c':
	        case'C':
	        System.out.println("�x�n��");
	        break;//�����ĤT��
	        case'd':
	        case'D':
	        System.out.println("������");
	        break; 
	        default:
	        System.out.println("�d�L���H")
	        break;
	      }
	    }while((choose!=68)&&(choose!=100));
	}
}
