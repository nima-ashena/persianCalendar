
import java.util.Date;

import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

public class Kerm {
	
	
	
	public static void main(String[] args) {
		
		Date d = new Date();
		//System.out.println(d.getTime());
		
		
		Tarikh t2 = new Tarikh(1395, 5, 12, 15, 20, 30);

		System.out.println(t2);
		t2.add(Tarikh.WEEK, 2);
		System.out.println(t2);
		System.out.println();
		


	

	
	}
	

	
	
}
