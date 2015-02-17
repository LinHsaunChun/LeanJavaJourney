package leanJAVA;
/*
 * 程式目的： 學習將文字進行串接、分離或取代文字中的某段子字串
 * 程式說明：
 * 			1.字串的串接
 * 			2.字串的分離
 * 			3.字串的取代
 */
public class StrinInstanceSeparationReplace {

	public static void main(String[] args) {
		
		/*
		 *  字串的串接
		 */
			String Text1 = "我是前面，";
			String Text2 = "我是後面，";
			String Text3 = Text1 + Text2;
			
			System.out.print("字串串接練習：");
			System.out.println(Text3);
			/*
			 * 每一次使用+運算子來串接兩個字串,都會產生一次新的 String 實例,
			 */
	        String text1 = "Java";
	        String text2 = "One";
	 
	        String text3 = text1 + text2;
	        String text4 = text1 + text2;
	 
	        System.out.println(text3.equals(text4));
	        System.out.println(text3 == text4);
			
		/*
		 *  字串的分離根據為","來分離字串
		 */
	        String text = "Java,programming,is,funny";
	        
	        String[] tokens = text.split(",");
	        for(String token : tokens) 
	        {
	            System.out.println(token);
	        }
	    /*
		 * 有一字串"abcdebcadxbc",使用".bc"為正則表示式的話,符合的子字串有"abc"、
		 * "ebc"、"xbc"三個,所以 split()會傳回這三個字串以外的子字串,也就是"d"、
		 *  "ad" 兩個字串;如果使用"..cd",則符合的子字串只有"abcd",
		 *  所以 split()會傳回"ebcadxbc"字串
		 */
	        String textabc = "abcdebcadxbc";
	        
	        System.out.println("原字串:" + textabc);
	        System.out.print(
	                "根據\".bc\"正則表示式分離字串:");
	        String[] tokensabc = textabc.split(".bc");
	        for (String tokenabc : tokensabc){
	            System.out.print(tokenabc + " ");
	        }
	        System.out.println();
	 
	        System.out.print(
	                "根據\"..cd\"正則表示式分離字串:");
	        tokens = text.split("..cd");
	        for (String tokenabc : tokensabc){
	            System.out.print(tokenabc + " ");
	        }
	        System.out.println();

	        /*
	         *  字串的取代
	         */
	        String textreplace = "abcdebcadxbc";
	        
	        System.out.println(
	        		textreplace.replaceAll(".bc", "*"));
	        System.out.println(
	        		textreplace.replaceAll("..cd", "*"));
	}

}
