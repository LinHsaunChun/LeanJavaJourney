package leaned;
/*
 * �{���ت��G�ǲߦp����o�ϥΪ̿�J
 * �{�������G
 * 			�B��JAVA����java.util.Scanner���o�ϥΪ̿�J�T��
 * 			1.�p�G�ϥΪ̿�J�_�ơA�h�쥻�ƭȥ[k+1
 * 			2.�p�G�ϥΪ̿�J���ơA�h�쥻�ƭȥ[k
 * 			3.�p�G�ϥΪ̿�J�O�_��A�h�^�ǰT��"�_��"�F���O�_�ƫh�^�ǰ���
 
 */
public class IfElseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		java.util.Scanner UserInput = new
		java.util.Scanner(System.in);
		/*
		 * �p�G�ϥΪ̿�J�_�ơA�h�쥻�ƭȥ[k
		 */
		System.out.println("�п�J�@�ө_��");
		int number = UserInput.nextInt(); //�ܼ�number���ȷ|�qUserInput�o��κAInt���ƭ�
		if (number%2 ==1)
			number=number+k;
		System.out.println(number+"�O�_��");
		/*
		 * �p�G�ϥΪ̿�J���ơA�h�쥻�ƭȥ[k+1
		 */
		System.out.println("�п�J�@�Ӱ���");
		int DoubleNum = UserInput.nextInt();
		if (DoubleNum%2 ==0)
			DoubleNum=DoubleNum+k;
		System.out.println(DoubleNum+"�O����");
		/*
		 * �p�G�ϥΪ̿�J�O�_��A�h�^�ǰT��"�_��"�F���O�_�ƫh�^�ǰ���
		 */
		java.util.Scanner UserData = new
			java.util.Scanner(System.in);
		System.out.println("�п�J�@�Ӽƭ�");
		int UseNumber= UserData.nextInt();
		if(UseNumber%2==1)
			System.out.println("�A��J���Ʀr�O�_��");
		else
			System.out.println("�A��J���Ʀr�O����");
		
	}

}
