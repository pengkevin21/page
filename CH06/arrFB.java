import java.io.*;
public class arrFB
{
	public static void main(String args[])throws IOException
	{
		int tmp,num,i;
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�`�@�n��J�h�ּƭ�: ");					//��J�n�ƧǪ��Ʀ@��
		String str=buf.readLine();
		num=Integer.parseInt(str);
		
		int a[]=new int[num];
		
		for(i=0;i<a.length;i++)								//��?�ӭn�ƧǪ��Ʀr
		{
			System.out.print("�п�J��"+(i+1)+"�ӼơG");
			String str1=buf.readLine();
			a[i]=Integer.parseInt(str1);
		}
		
		System.out.print("\n�Ƨǫe���}�C���G");		
		for(i=0;i<a.length;i++)								//�L�X�Ƨǫe���}�C
		{
			System.out.print(a[i]+" ");	
		}
		
		for(i=a.length;i>1;i--)								//�q�p��j���Ƨ�
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					tmp=a[j+1];
					a[j+1]=a[j];
					a[j]=tmp;
				}
			}
		}
		
		System.out.print("\n�Ƨǫ᪺�}�C���G");
		for(i=0;i<a.length;i++)								//�Ƨǫ᪺�}�C��
		{
			System.out.print(a[i]+" ");	
		}
		
		System.out.println("\n���}�C�̤j�Ȭ��G"+a[a.length-1]);
		System.out.println("���}�C�̤p�Ȭ��G"+a[0]);
	}	
}