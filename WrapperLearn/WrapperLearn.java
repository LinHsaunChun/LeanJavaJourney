package leaned;
/*
 * �{���ت��G�m��Wrapper�ާ@
 * �{�������G�N�ϥΪ̿�J���ƭ�int class�]�˦�����Φ��A�M��������ܼƪ��j�p
 */
public class WrapperLearn {

	public static void main(String[] args) {
	
		/*
		 *  Phase 1: ���աA�N�ϥΪ̿�J�ƭȥ]�˦�����
		 */
		/*
		 *  Step1:�����ϥΪ̿�J���ƭ�
		 */
	//		java.util.Scanner UserInput = new
	//				java.util.Scanner(System.in);
	//		System.out.println("�п�J�@�Ӿ��");
	//		int Input = UserInput.nextInt();
	//		System.out.print("�A��J���ƭȬ�");
	//		System.out.println(Input);
		/*
		 *  Step2:�N�ƭȥ]�˦�����
		 */
	//		Integer UserInputData = new Integer(Input);
		/*
		 *  Stpe3:�L�X�]�˦n���󪺭�
		 */
	//		System.out.print("�]�˦n���󫬦��ƭȬ�");
	//		System.out.println(UserInputData);
	
		/*
		 *  Phase 2: �H���󫬦�����ǥͦ~�֩M�魫���ƭȤj�p
		 */
			java.util.Scanner AgeofStudentInput = new
					java.util.Scanner(System.in);
			System.out.println("�п�J�ǥͦ~��");
			int AgeofStudent = AgeofStudentInput.nextInt();
			Integer ObjectTypeAgeofStudent = new Integer(AgeofStudent);
			java.util.Scanner WeightofStudentInput = new
					java.util.Scanner(System.in);
			System.out.println("�п�J�ǥ��魫");
			int WeightofStudent = WeightofStudentInput.nextInt();
			Integer ObjectTypeWeightofStudent = new Integer(WeightofStudent);
			int CompareReult=
					ObjectTypeAgeofStudent.compareTo(ObjectTypeWeightofStudent);
			
			switch(CompareReult)
			{
			case 1:
				System.out.print("�ǥͦ~��");
				System.out.print(ObjectTypeAgeofStudent);
				System.out.print("�j��");
				System.out.print("�ǥ��魫");
				System.out.println(ObjectTypeWeightofStudent);
				break;
			
			case -1:
				System.out.print("�ǥͦ~��");
				System.out.print(ObjectTypeAgeofStudent);
				System.out.print("�p��");
				System.out.print("�ǥ��魫");
				System.out.println(ObjectTypeWeightofStudent);
				break;
			
			case 0:
				System.out.print("�ǥͦ~��");
				System.out.print(ObjectTypeAgeofStudent);
				System.out.print("����");
				System.out.print("�ǥ��魫");
				System.out.println(ObjectTypeWeightofStudent);
				break;
			}
    }
}

