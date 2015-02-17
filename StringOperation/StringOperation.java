package leanJAVA;
/*
 * �{���ت��G �ǲߦr��ϥΤ覡
 * �{�������G
 * 			1.�ϥ� new ����r�إ� String ����
 * 			2. �j�p�g�ഫ
 * 			3. ���o�l�r��
 * 			4. �r���ާ@
 * 			5. �j�M���
 * 			6. �ϥ� equals()���r�ꤺ�e
 */
public class StringOperation {
	
	public static void main(String[] args) {
		/*
		 * �ϥ� new ����r�إ� String ����A
		 * ���ϥ�new�ӫإߦr��ɡA�o��Ӧb�O���餤�x�s��m���ۦP
		 */
		String name1 = "Justin Lin";
		String name2 = new String("Justin Lin");

		System.out.println(name1 == "Justin Lin");
		System.out.println(name2 == "Justin Lin");
		System.out.println(name1 == name2);
		/*
		 * �j�p�g�ഫ
		 * 
		 */
		String StringTest = "Java";
		String upper = StringTest.toUpperCase();
		String lowwer = StringTest.toLowerCase();
		System.out.println("��r��:" + StringTest);
        System.out.println("��j�g:" + upper);
        System.out.println("��p�g:" + lowwer);
		/*
		 * ���o�l�r��
		 * 
		 */        
        System.out.println("Justin Lin".substring(7));
        System.out.println("Justin Lin".substring(0, 6));
        String name = "Java";
        for (int i = 0; i < name.length(); i++)
        {
            System.out.println(name.charAt(i));
        }
		/*
		 * �N�r���x�s���x�}
		 */         
        String nameArray = "Java";
        char[] array = nameArray.toCharArray();
 
        for (char c : array)
        {
        	System.out.println("�s���x�}���r��");
        	System.out.println(c);
        }
		/*
		 * �j�M���
		 */          
        
        String text = "Java Everywhere";
        
        System.out.println("�Ĥ@�� a �r��:"
                + text.indexOf('a'));
        System.out.println("�̫�@�� a �r��:"
                + text.lastIndexOf('a'));
        System.out.println("�Ĥ@�� Every:"
                + text.indexOf("Every"));
        System.out.println("�̫�@�� Every:"
                + text.lastIndexOf("Every"));
        System.out.println("�]�A Java:"
                + text.contains("Java"));
        System.out.println("�H Java ���}�l:"
                + text.startsWith("Java"));
        System.out.println("�H Java ������:"
                + text.endsWith("Java"));
        
		/*
		 * �ϥ� equals()���r�ꤺ�e
		 */   
        String text1 = "Java";
        String text2 = new String("Java");
        String text3 = new String("Java");
 
        System.out.println(
                "==����O�_���P�@����..");
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text2 == text3);
 
 
        System.out.println(
                "\nequals()����r�����e..");
        System.out.println(text1.equals(text2));
        System.out.println(text2.equals(text3));
        System.out.println(text1.equals(text3));
        
	}
}

