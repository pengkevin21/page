 class �N���
{
	int ��;
	int �e;
	int �ū�=17;
	int �ë�;
	
	void �\��()
	{
		System.out.println("�ҰʧN��\��"+" , �ū׬� "+�ū�+" �ë׬� "+�ë�+" ���׬� "+��+" �e�׬� "+�e);
	}
	void �\��(int m)
	{	
		�ū�=m;
		System.out.println("�Ұʷx��\��"+" , �ū׬� "+�ū�+" �ë׬� "+�ë�+" ���׬� "+��+" �e�׬� "+�e);
	}
	void �\��(int m, int n)
	{
		�ū�=m;
		�ë�=n;
		System.out.println("�Ұʰ���\��"+" , �ū׬� "+�ū�+" �ë׬� "+�ë�+" ���׬� "+��+" �e�׬� "+�e);
	}
	void �\��(double m, double n)
	{
		System.out.println("�Ұ�void �\��(double m, double n)"+" , �ū׬� "+�ū�+" �ë׬� "+�ë�+" ���׬� "+��+" �e�׬� "+�e);
	}
	void set�N���(int m,int n)
	{
		��=m;
		�e=n;
		System.out.println("�Ұʰ���\��"+" , �ū׬� "+�ū�+" �ë׬� "+�ë�+" ���׬� "+��+" �e�׬� "+�e);
	}
}
public class App8
{
	public static void main(String args[])
	{
		�N��� L001=new �N���();
		�N��� L002=new �N���();
		L001.�\��();
		L001.�\��(30);
		L001.�\��(25.8,2.5);
		L001.�\��(58,50);
		L001.set�N���(299,199);
		L002.�\��();
	}
}
