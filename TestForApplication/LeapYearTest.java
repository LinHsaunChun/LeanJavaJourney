package TestForApplication;

public class LeapYearTest {
		/*
		 *  閏年測試程式
		 *    １.不可被4整除者為平年。
		 *    ２.可被4整除且不為100整除者為閏年。
		 *    ３.可被400整除為閏年。
		 *    ４.可被1000整除為閏年。
		 */
	public static void main(String[] args) {
		

		java.util.Scanner UseInput =new
			java.util.Scanner(System.in);
		System.out.println("請輸入一個年份");
		double	Input = UseInput.nextDouble();
			
		int CastType=0;
		int Test=(int)Input;
		
		double Test4 = (double)Input/4;
		double Test100 = (double)Input/100;
		
		if(Test%1000==0)
		{
			CastType=0;
		}
		if(Test4!=0)
		{
			CastType=1;
		}
		if(Test%400==0)
		{
			CastType=0;
		}
		if(Test4==0 & Test100 !=0 )
		{
			CastType=0;
		}
		
		switch(CastType)
		{
			case 0:
			{
				System.out.println((int)Input+"是閏年");
				break;
			}
			case 1:
			{
				System.out.println((int)Input+"是平年");
				break;
			}
		}

	}

}
