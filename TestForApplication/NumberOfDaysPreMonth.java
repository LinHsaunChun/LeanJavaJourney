package TestForApplication;

public class NumberOfDaysPreMonth {

	public static void main(String[] args)
	{
		int i;
		int [] DaysArry = 
			{31,29,31,30,31,30,31,31,30,31,30,31}; //設定每月天數
		for(i=0;i<=11;i++)
		{
			System.out.print(i+1);                // 顯示當前月份
			System.out.print("月分的天數有");
			System.out.print(DaysArry[i]);        // 顯示第i個矩陣資位置資訊
			System.out.println("天");
		}
		
	}

}
