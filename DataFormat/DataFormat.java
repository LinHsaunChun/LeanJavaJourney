package leaned;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DataFormat {
	

		public static void main(String args[])
		{
			
			Date today = new Date();
			SimpleDateFormat f1=new SimpleDateFormat("yyyy-M-d a h:m");
			SimpleDateFormat f2=new SimpleDateFormat("yyyy/MMM/d H:m:s");

			System.out.println(f1.format(today));
			System.out.println(f2.format(today));

		}

}
