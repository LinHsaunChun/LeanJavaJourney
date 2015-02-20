package TestForApplication;

public class PrintTriangle 
	{

	public static void main(String[] args) 
	{
		//檔名:以字元*印出三角形
		int i;
		int j;  
		int k =4; //三角型階層數
		for(j=1;j<=k;j++)
		{
		System.out.print(" ");
			for(i=1;i<=j;i++)
			{	
				System.out.print("*");
			}
		System.out.println("");
		}
	}

}
