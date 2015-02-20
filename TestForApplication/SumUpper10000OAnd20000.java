package TestForApplication;

public class SumUpper10000OAnd20000 {
	/*
	 *  檔名:累加總合超過10000及20000
	 *  說明:1+2+…+n>10000，利用while敘述求n
	 *  1+2+…+m>20000，利用do敘述求m   
	 */

	public static void main(String[] args) {
		int WhileNum;
		int DoNum;
		int i=0;
		int upper=20000;
		int sum=0;
		int sumIn;
		while(i<=upper)
		{
			sumIn=i+sum;
			System.out.println(sumIn);
			i=i+1;
			
		}
		i=0;
		do
		{
			
			sumIn=i+sum;
			System.out.println(sumIn);
			i=i+1;
			
		}
		while(i<=upper);
	}

}
