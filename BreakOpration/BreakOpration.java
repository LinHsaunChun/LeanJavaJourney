package leaned;
/*
 * �{���ت��G�m��Break�ާ@
 * �{�������G�p�⦨�Z�������{��,�ϥ� while �j��Ӱ��汵���ϥΪ̪���J,���J��-1 �ɲפ�j��íp�⵲�G�C
 */

public class BreakOpration {

	public static void main(String[] args) {
		/*
		 * ���o�ϥΪ̿�J��ScoreInput�ܼƭ�
		 */
		java.util.Scanner ScoreInput = new
				java.util.Scanner(System.in);
		int sum=0;
		int count=0;
		while(true)
		{
		System.out.println("�п�J���ơA�p�G��J-1�N���}�{��");
		int score = ScoreInput.nextInt();
		System.out.print("�z��J�����Ƭ�");
		System.out.print(score);

			if(score == -1)
			{
				System.out.println("�]���z��J-1�A�Y�N�����{��");
				break;
			}
			sum = sum+score;
			System.out.print("�ثe�����`�M��");
			System.out.println(sum);
			count=count+1;//�p��ثe���h�ּƭȳQ��J
		}
		System.out.print("���ƥ����`�X");
		System.out.println((float)sum/(float)count);
	}

}
