package leaned;
/*
 * �{���ت��G�p��ϥ�for���
 * �{�������G
 * 			�Q��for��ƦL�X10��"�A�n!"
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
			System.out.print("�ڳۤF");
			System.out.print(count);
			System.out.println("��");
			System.out.println("�A�n!");
		}
		/*
		 * �_��for�j��L�X10���A�n
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
				System.out.print("�ڳۤF");
				System.out.print(K);
				System.out.println("��");
				System.out.println("�A�n!");	
				K=K+1;
			}
		}
	}
		
}

