package leaned;
/*
 * �{���ت��G�ǲߦp��ϥ�Switch���
 * �{�������G
 * 			��J�@�Ӿǥͪ����Z�A90�H�W�oA�A80���H�W�oB�A70���H�W�oC�A60���H�W��D,����60���oF
 */
public class SwitchOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner Point = new
				java.util.Scanner(System.in);

		System.out.println("�п�J�ǥͤ���");
		int StudentPoint = Point.nextInt();
		System.out.print("�ǥͤ��Ƭ�");
		System.out.print(StudentPoint);
		System.out.println("��");
		int level = StudentPoint/10;
		switch (level){
			case 10:
			System.out.println("�ǥͦ��Z��A");
			break;
			case 9:
			System.out.println("�ǥͦ��Z��A");
			break;			
			case 8:
			System.out.println("�ǥͦ��Z��C");
			break;			
			case 7:
			System.out.println("�ǥͦ��Z��D");
			break;			
			case 6:
			System.out.println("�ǥͦ��Z��E");
			break;
			default:
			System.out.println("�ǥͦ��Z��F");
		}
	}

}
