package leaned;
/*
 * �{���ت��G�ǲߦp��ϥ�while��ƩMdo while���
 * �{�������G
 * 			1.��*�r�Ų���M��N���x�}�A���޿�e��
 * 			2.��*�r�Ų���M��N���x�}�A�Υ������P�_���覡
 */
public class WhileAndDoWhileOperation {

	public static void main(String[] args) {
		/*
		 * �ϥ�while��ƶi���޿�e������M*N���x�}
		 */
		// TODO Auto-generated method stub
		/*
		 * Ū���ϥΪ̿�J���x�}����M
		 */
		java.util.Scanner VarM = new
				java.util.Scanner(System.in);
		System.out.println("�п�J�x�}����");
		int InputVarM = VarM.nextInt();
		System.out.print("��J���x�}���׬�");
		System.out.println(InputVarM);
		/*
		 * Ū���ϥΪ̿�J���x�}�e��N
		 */
		java.util.Scanner VarN = new
				java.util.Scanner(System.in);
		System.out.println("�п�J�x�}�e��");
		int InputVarN = VarN.nextInt();
		System.out.print("��J���x�}�e�׬�");
		System.out.println(InputVarN);
		/*
		 * �p��ثe�e�X���x�}���׻P�e��
		 */
		int VarMCount=0;
		int VarNCount=0;
		System.out.println("�{�b�}�lø�s�ϧ�");
		while(VarNCount<=InputVarN){
			
			/*
			 * �C�e�XM��*�N����
			 */
			while(VarMCount<=InputVarM){
				System.out.print("*");
				VarMCount=++VarMCount;
			}
			/*
			 * ����N������N����
			 */
			System.out.println("");
			VarNCount=++VarNCount;
			/*
			 * ���s�p��e�X*���ƶq
			 */
			VarMCount=0;
		}
	}

}
