package leanJAVA;
/*
 * 程式目的： 學習字串使用方式
 * 程式說明：
 * 			1.使用 new 關鍵字建立 String 物件
 * 			2. 大小寫轉換
 * 			3. 取得子字串
 * 			4. 字元操作
 * 			5. 搜尋比對
 * 			6. 使用 equals()比對字串內容
 */
public class StringOperation {
	
	public static void main(String[] args) {
		/*
		 * 使用 new 關鍵字建立 String 物件，
		 * 當不使用new來建立字串時，這兩個在記憶體中儲存位置不相同
		 */
		String name1 = "Justin Lin";
		String name2 = new String("Justin Lin");

		System.out.println(name1 == "Justin Lin");
		System.out.println(name2 == "Justin Lin");
		System.out.println(name1 == name2);
		/*
		 * 大小寫轉換
		 * 
		 */
		String StringTest = "Java";
		String upper = StringTest.toUpperCase();
		String lowwer = StringTest.toLowerCase();
		System.out.println("原字串:" + StringTest);
        System.out.println("轉大寫:" + upper);
        System.out.println("轉小寫:" + lowwer);
		/*
		 * 取得子字串
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
		 * 將字串儲存成矩陣
		 */         
        String nameArray = "Java";
        char[] array = nameArray.toCharArray();
 
        for (char c : array)
        {
        	System.out.println("存成矩陣的字串");
        	System.out.println(c);
        }
		/*
		 * 搜尋比對
		 */          
        
        String text = "Java Everywhere";
        
        System.out.println("第一個 a 字元:"
                + text.indexOf('a'));
        System.out.println("最後一個 a 字元:"
                + text.lastIndexOf('a'));
        System.out.println("第一個 Every:"
                + text.indexOf("Every"));
        System.out.println("最後一個 Every:"
                + text.lastIndexOf("Every"));
        System.out.println("包括 Java:"
                + text.contains("Java"));
        System.out.println("以 Java 為開始:"
                + text.startsWith("Java"));
        System.out.println("以 Java 為結束:"
                + text.endsWith("Java"));
        
		/*
		 * 使用 equals()比對字串內容
		 */   
        String text1 = "Java";
        String text2 = new String("Java");
        String text3 = new String("Java");
 
        System.out.println(
                "==比較是否為同一物件..");
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text2 == text3);
 
 
        System.out.println(
                "\nequals()比較字元內容..");
        System.out.println(text1.equals(text2));
        System.out.println(text2.equals(text3));
        System.out.println(text1.equals(text3));
        
	}
}

