package leanJAVA;
	/*
	 * �{���ت��G�m�ߦp��ϥ�sub function
	 */

public class CallFuncation {
	/*
	 * int x=15,y=25,w,z=0;
�@	 * �w�q����ܼ� x�Ay�Aw�Az �ȩ̀ǳ]�w��Ȥ��O�� x=15,y=25,w=0,z=0�C
	 *  w=Sub((z=Add(x,y)),y);
�@	 * ����� Sub((z=Add(x,y)),y) �ɡA�D�{���|���� z=Add(x,y) �� y �D�k�ȡA
	 * �A�I�s�禡 sub�C
	 * ������ z=Add(x,y) �S�I�s�t�@�禡 Add(x,y)�A
	 * �N�{������y�{���ܨ�{�� public static int Add(int i,int j)�A
	 * �䤤 public static int �w�q�F�禡���Ǧ^�ȡA�ñN x �ǤJ i ���A
	 * �N y �ȶǤJ j ���Az=Add(x,y)
	 * ��ܷ|���ܼ� z �ӱ� Add()�禡�Ǧ^�ȡF
	 * �P�z�A�� z�Ay �ǤJ Sub(i,j) �g�B���o�X w=15�C
	 * �N w �����G����ܦb�ù��C
	 */
	public static void main(String[] args) 
	{
		int x=15,y=25;
		int w,z=0;
		w=Sub((z=Add(x,y)),y);
		System.out.println(w);
	}
	private static int Add(int i,int j)
	{
		int sum=0;
		sum=i+j;
		return sum;
	}
	
	private static int Sub(int i,int j)
	{
		int sum=0;
		sum=i-j;
		return sum;
	}

}
