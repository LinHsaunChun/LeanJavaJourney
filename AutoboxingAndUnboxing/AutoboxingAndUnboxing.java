package leaned;
/*
 * �{���ت��G�ǲ�Autoboxing�MUnboxing�t��
 * �{�������GAutoboxing
 */
public class AutoboxingAndUnboxing 
{

	public static void main(String[] args)
	{
		/*
		 * ���q�@:�S���N�Ѽƥ��]�ˡA�N�i����
		 * ���G����:�� 3 ��P�� 4 ��קאּ���w�Ȭ� 200,��l�����èS������,�o�y���F���P�����浲�G
		 * ���o��A�Ψ����Y�B��l"=="�Ω�ѦҦW�٪�������D�C
		 *�����Y�B��l"=="�ϥΩ��ӰѦҦW�٤������,��������O��ӰѦҦW�٬O�_�ѦҦܦP�@�Ӫ���,
		 * �H�{���X 8-2 ��8-3 ����,�N�O�b��� iRef1 �P iRef2 �O�_ô���ܦP�@�Ӫ���C
		 * �۰ʸ˽c�������ƭ� -128 �� 127 ��������,�b�˽c�����󤧫�,�|�s�b�O���餧���@���Q���ƨϥ�,
		 * �ӹ��-128 �� 127 ���~����,�h�����ɴ��B���Ӭq�{���X��,�~�إߤ@�ӷs������C
		 */

		/*
		 * �p�G�n����U�ϵ{���Ч���Ѯ���
		 */
	//	 Integer iRef1 = 100;
	//        Integer iRef2 = 100;
	 
	//        if (iRef1 == iRef2) {
	//            System.out.println("iRef1 == iRef2");
	//        }
	//        else {
	//            System.out.println("iRef1 != iRef2");
	//        }
	
		Integer iRef1 = 200;
		Integer iRef2 = 200;

		if (iRef1 == iRef2)
		{
         System.out.println("iRef1 == iRef2");
		}
		else 
		{
         System.out.println("iRef1 != iRef2");
		}
	}
}


