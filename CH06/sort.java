public class sort
{
	public static void main(String args[])
	{
		int tmp;
		//int a[]={74,48,30,17,62};					//�������T�w��
		int a[]={5,4,3,2,1};
		
		System.out.print("�Ƨǫe���}�C���G");		
		for(int i=0;i<a.length;i++)					//�L�X�Ƨǫe
		{
			System.out.print(a[i]+" ");	
		}
		
		for(int i=a.length;i>1;i--)					//�q�p��j���Ƨ�
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
		for(int i=0;i<a.length;i++)					//�L�X�Ƨǫ�
		{
			System.out.print(a[i]+" ");	
		}
		
		System.out.println("\n�}�C�̤j�Ȭ�"+a[4]);
		System.out.println("�}�C�̤p�Ȭ�"+a[0]);
	}	
}
/*
�Ƨǫe���}�C���G74 48 30 17 62
�Ƨǫ᪺�}�C���G17 30 48 62 74
�}�C�̤j�Ȭ�74
�}�C�̤p�Ȭ�17
*/