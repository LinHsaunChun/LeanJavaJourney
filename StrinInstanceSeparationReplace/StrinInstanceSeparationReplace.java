package leanJAVA;
/*
 * �{���ت��G �ǲ߱N��r�i��걵�B�����Ψ��N��r�����Y�q�l�r��
 * �{�������G
 * 			1.�r�ꪺ�걵
 * 			2.�r�ꪺ����
 * 			3.�r�ꪺ���N
 */
public class StrinInstanceSeparationReplace {

	public static void main(String[] args) {
		
		/*
		 *  �r�ꪺ�걵
		 */
			String Text1 = "�ڬO�e���A";
			String Text2 = "�ڬO�᭱�A";
			String Text3 = Text1 + Text2;
			
			System.out.print("�r��걵�m�ߡG");
			System.out.println(Text3);
			/*
			 * �C�@���ϥ�+�B��l�Ӧ걵��Ӧr��,���|���ͤ@���s�� String ���,
			 */
	        String text1 = "Java";
	        String text2 = "One";
	 
	        String text3 = text1 + text2;
	        String text4 = text1 + text2;
	 
	        System.out.println(text3.equals(text4));
	        System.out.println(text3 == text4);
			
		/*
		 *  �r�ꪺ�����ھڬ�","�Ӥ����r��
		 */
	        String text = "Java,programming,is,funny";
	        
	        String[] tokens = text.split(",");
	        for(String token : tokens) 
	        {
	            System.out.println(token);
	        }
	    /*
		 * ���@�r��"abcdebcadxbc",�ϥ�".bc"�����h��ܦ�����,�ŦX���l�r�꦳"abc"�B
		 * "ebc"�B"xbc"�T��,�ҥH split()�|�Ǧ^�o�T�Ӧr��H�~���l�r��,�]�N�O"d"�B
		 *  "ad" ��Ӧr��;�p�G�ϥ�"..cd",�h�ŦX���l�r��u��"abcd",
		 *  �ҥH split()�|�Ǧ^"ebcadxbc"�r��
		 */
	        String textabc = "abcdebcadxbc";
	        
	        System.out.println("��r��:" + textabc);
	        System.out.print(
	                "�ھ�\".bc\"���h��ܦ������r��:");
	        String[] tokensabc = textabc.split(".bc");
	        for (String tokenabc : tokensabc){
	            System.out.print(tokenabc + " ");
	        }
	        System.out.println();
	 
	        System.out.print(
	                "�ھ�\"..cd\"���h��ܦ������r��:");
	        tokens = text.split("..cd");
	        for (String tokenabc : tokensabc){
	            System.out.print(tokenabc + " ");
	        }
	        System.out.println();

	        /*
	         *  �r�ꪺ���N
	         */
	        String textreplace = "abcdebcadxbc";
	        
	        System.out.println(
	        		textreplace.replaceAll(".bc", "*"));
	        System.out.println(
	        		textreplace.replaceAll("..cd", "*"));
	}

}
