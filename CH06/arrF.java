//�i�H�ۦ��J�Q�ƧǪ���
import java.util.Scanner;
public class arrF
{
	public static void main(String args[])
	{
		int tmp,num,i;
		
		System.out.print("�`�@���X�ӼơG");					//��J�n�ƧǪ��Ʀ@��
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		int a[]=new int[num];
		
		for(i=0;i<a.length;i++)								//��?�ӭn�ƧǪ��Ʀr
		{
			System.out.print("�п�J��"+(i+1)+"�ӼơG");
			a[i]=scan.nextInt();	
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
/*
�`�@���X�ӼơG10
�п�J��1�ӼơG10
�п�J��2�ӼơG9
�п�J��3�ӼơG8
�п�J��4�ӼơG7
�п�J��5�ӼơG6
�п�J��6�ӼơG5
�п�J��7�ӼơG4
�п�J��8�ӼơG3
�п�J��9�ӼơG2
�п�J��10�ӼơG1

�Ƨǫe���}�C���G10 9 8 7 6 5 4 3 2 1
�Ƨǫ᪺�}�C���G1 2 3 4 5 6 7 8 9 10
���}�C�̤j�Ȭ��G10
���}�C�̤p�Ȭ��G1
*/