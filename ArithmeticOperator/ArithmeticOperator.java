package leaned;
/*
 * �{���ت��G�ǲ߰򥻹B��l�ϥΤ覡
 * �{�������G
 * 			1.���ܼƬۥ[��42
 * 			2.���ܼƬ۴15
 * 			3.���ܼƬۭ���98
 * 			4.���ܼƬ۰���35
 * 			5.���ܼƬ۰����l��
 * 			6.��@�ܼƻ��W
 * 			7.��@�ܼƻ���
 * 
 */
public class ArithmeticOperator {
	public static void main(String[] args) {
		int VarA=20;
		int VarB=22;
		/*
		 * ���ܼƬۥ[��42
		 */
		System.out.print("�ܼ�A��");
		System.out.println(VarA);
		System.out.print("�ܼ�B��");
		System.out.println(VarB);
		System.out.print("�ܼ�A�[�ܼ�B��");
		System.out.println(VarA+VarB);
		/*
		 * ���ܼƬ۴15
		 */
		int VarC=30;
		int VarD=15;		
		System.out.print("�ܼ�C��");
		System.out.println(VarC);
		System.out.print("�ܼ�D��");
		System.out.println(VarD);
		System.out.print("�ܼ�C���ܼ�D��");
		System.out.println(VarC-VarD);
		/*
		 * ���ܼƬۭ���98
		 */	
		int VarE=49;
		int VarF=2;		
		System.out.print("�ܼ�E��");
		System.out.println(VarE);
		System.out.print("�ܼ�F��");
		System.out.println(VarF);
		System.out.print("�ܼ�E���ܼ�F��");
		System.out.println(VarE*VarF);
		/*
		 * ���ܼƬ۰���35
		 */
		int VarG=70;
		int VarH=2;
		float Result = VarG/VarH; //�Ȧs�ܼ�G���ܼ�H���p�⵲�G
		System.out.print("�ܼ�G��");
		System.out.println(VarG);
		System.out.print("�ܼ�H��");
		System.out.println(VarH);
		System.out.print("�ܼ�G���ܼ�H��");
		System.out.println(Result);
		/*
		 * ���ܼƬ۰����l��
		 */
		int VarI=70;
		int VarJ=2;
		float Result_IJ = VarI%VarJ; //�Ȧs�ܼ�G���ܼ�H���p�⵲�G
		System.out.print("�ܼ�I��");
		System.out.println((float)VarI); //Note:�૬�����b�ϥΪ��ܼƦW�٫e�����ܼƧκA�Y�iex: (float) VarI 
		System.out.print("�ܼ�J��");
		System.out.println(VarJ);
		System.out.print("�ܼ�I���ܼ�J���l�Ƭ�");
		System.out.println(Result_IJ);
		/*
		 * ��@�ܼƻ��W
		 */
		int VarK=70;
		int addK=VarK+1;   //�μƦr+1�F�컼�W�ĪG
		int addKup=++VarK; //�λ��W�Ÿ�
		System.out.print("�ܼ�K��");
		System.out.println(VarK);
		System.out.print("�μƦr+1�F�컼�W�ĪG���׬�");
		System.out.println(addK);
		System.out.print("�λ��W�T���F�컼�W�ĪG���׬�");
		System.out.println(addKup);		
		/*
		 * ��@�ܼƻ���
		 */
		int VarL=70;
		int downL=VarL-1;
		int downLdown = --VarL; 
		System.out.print("�ܼ�L��");
		System.out.println(VarL);
		System.out.print("�μƦr+1�F�컼��ĪG���׬�");
		System.out.println(downL);
		System.out.print("�λ���T���F�컼��ĪG���׬�");
		System.out.println(downLdown);	
	}
}
