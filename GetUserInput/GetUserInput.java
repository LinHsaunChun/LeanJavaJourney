package leaned;
/*
 * �{���ت��G�ǲߦp����o�ϥΪ̿�J
 * �{�������G
 * 			�B��JAVA����java.util.Scanner���o�ϥΪ̿�J�T��
 * 			1.�N�ϥΪ̿�J���T����int�Φ����o
 * 			2.�N�ϥΪ̿�J���T����flot�Φ����o
 * 			3.�N�ϥΪ̿�J���T����Boolean�Φ����o
 * 
 */
public class GetUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϥ�Scanner�u�㱽�y�ܼ�UserInput
		//@SuppressWarnings("resource")
		java.util.Scanner UserInputData = new
	                java.util.Scanner(System.in);
		//�N�ϥΪ̿�J����T�H��ƧκA����
	        System.out.print("��J���:");
	        int IntInput = UserInputData.nextInt();
	    //�N�ϥΪ̿�J����T�H�B�I�ƧκA����
	        System.out.print("��J�B�I��:");
	        double FloatInput = UserInputData.nextDouble();
	    //�N�ϥΪ̿�J����T�H���L�ƧκA����
	        System.out.print("��J���L��:");
	        boolean BooleanInput= UserInputData.nextBoolean();
	 
	        System.out.println("��ƿ�J:" + IntInput);
	        System.out.println("�B�I�ƿ�J:" + FloatInput);
	        System.out.println("���L�ƿ�J:" + BooleanInput);
	}

}
