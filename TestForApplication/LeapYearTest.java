package TestForApplication;

public class LeapYearTest {
		/*
		 *  �|�~���յ{��
		 *    ��.���i�Q4�㰣�̬����~�C
		 *    ��.�i�Q4�㰣�B����100�㰣�̬��|�~�C
		 *    ��.�i�Q400�㰣���|�~�C
		 *    ��.�i�Q1000�㰣���|�~�C
		 */
	public static void main(String[] args) {
		

		java.util.Scanner UseInput =new
			java.util.Scanner(System.in);
		System.out.println("�п�J�@�Ӧ~��");
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
				System.out.println((int)Input+"�O�|�~");
				break;
			}
			case 1:
			{
				System.out.println((int)Input+"�O���~");
				break;
			}
		}

	}

}
