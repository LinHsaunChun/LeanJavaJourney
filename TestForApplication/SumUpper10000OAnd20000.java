package TestForApplication;

public class SumUpper10000OAnd20000 {
	/*
	 *  �ɦW:�֥[�`�X�W�L10000��20000
	 *  ����:1+2+�K+n>10000�A�Q��while�ԭz�Dn
	 *  1+2+�K+m>20000�A�Q��do�ԭz�Dm   
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
