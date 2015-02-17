package leaned;
/*
 * 程式目的：如何使用for函數
 * 程式說明：
 * 			利用for函數印出10次"你好!"
 * 
 */
public class ForOperation 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int times=10;
		int count;
		for(count=times;count>0;count--)
		{
			System.out.print("我喊了");
			System.out.print(count);
			System.out.println("次");
			System.out.println("你好!");
		}
		/*
		 * 巢狀for迴圈印出10次你好
		 */
		int TimesLevelOne=2;
		int TimesLevelTow=5;
		int CountOne;
		int CountTow;
		int K=1;
		
		for(CountOne=TimesLevelOne;CountOne>0;CountOne--)
		{
			for(CountTow=TimesLevelTow;CountTow>0;CountTow--)
			{
				System.out.print("我喊了");
				System.out.print(K);
				System.out.println("次");
				System.out.println("你好!");	
				K=K+1;
			}
		}
	}
		
}

