package TestForApplication;
/*
 * �{�������G��J�@�ӥ���n�A�íp��1-1/2+1/3-1/4+......+1/n����
 */
public class sumOneTOFrac1n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Input;
		double i;
		double j=0;
		double k=0;
		double sum;
			java.util.Scanner InputNum = new
					java.util.Scanner(System.in);
			System.out.print("�п�J�@�ӥ���:");
			Input = InputNum.nextDouble();
			for(i=1;i<=Input;i++)
			{
				k = j;
				j= 1/i;
				sum=k+j;
				System.out.print("1+......+1/"+i+"��");
				System.out.println(sum);
			}
	}

}
