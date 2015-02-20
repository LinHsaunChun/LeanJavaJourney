package TestForApplication;

public class SunMultiplicative {
	/* 檔名:連和連積分數連和.java
	 * 說明:輸入一整數n，並計算1+2+…+n(連和)，及1*2*…*n(連積)
	 */
	public static void main(String[] args)
	{
		/*
		 *  1.讀取指標i的數值
		 *  2.將i數值和變數相加
		 *  3.將相加結果回存到變數
		 */
		int []IntArry={1,2,3,4,5,6,7,8};
		int NewTurn;
		double NewTurnMult;
		int Add;
		int result=0;
		double resultMult=1;
		int i;
		double Mult;
		int j;
		Double []DoubleArry={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0};
		
		for(i=0;i<=IntArry.length;i++)
		{
		NewTurn=IntArry[i]; //讀取指標i的數值
		Add = NewTurn + result; //將i數值和變數相加
		result = Add; //將相加結果回存到變數
		System.out.println("第"+(i+1)+"次的結果為"+result);
		}
		
		for(j=0;j<=IntArry.length;j++)
		{
		NewTurnMult=DoubleArry[j]; //讀取指標i的數值
		Mult = NewTurnMult * resultMult; //將i數值和變數相乘
		resultMult = Mult; //將相加結果回存到變數
		System.out.println("第"+(j+1)+"次的結果為"+resultMult);
		}
	}
}
