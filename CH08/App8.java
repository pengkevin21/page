 class 冷氣機
{
	int 長;
	int 寬;
	int 溫度=17;
	int 溼度;
	
	void 功能()
	{
		System.out.println("啟動冷氣功能"+" , 溫度為 "+溫度+" 溼度為 "+溼度+" 長度為 "+長+" 寬度為 "+寬);
	}
	void 功能(int m)
	{	
		溫度=m;
		System.out.println("啟動暖氣功能"+" , 溫度為 "+溫度+" 溼度為 "+溼度+" 長度為 "+長+" 寬度為 "+寬);
	}
	void 功能(int m, int n)
	{
		溫度=m;
		溼度=n;
		System.out.println("啟動除濕功能"+" , 溫度為 "+溫度+" 溼度為 "+溼度+" 長度為 "+長+" 寬度為 "+寬);
	}
	void 功能(double m, double n)
	{
		System.out.println("啟動void 功能(double m, double n)"+" , 溫度為 "+溫度+" 溼度為 "+溼度+" 長度為 "+長+" 寬度為 "+寬);
	}
	void set冷氣機(int m,int n)
	{
		長=m;
		寬=n;
		System.out.println("啟動除濕功能"+" , 溫度為 "+溫度+" 溼度為 "+溼度+" 長度為 "+長+" 寬度為 "+寬);
	}
}
public class App8
{
	public static void main(String args[])
	{
		冷氣機 L001=new 冷氣機();
		冷氣機 L002=new 冷氣機();
		L001.功能();
		L001.功能(30);
		L001.功能(25.8,2.5);
		L001.功能(58,50);
		L001.set冷氣機(299,199);
		L002.功能();
	}
}
