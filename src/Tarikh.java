import com.ghasemkiani.util.icu.PersianCalendar;
import com.ibm.icu.util.Calendar;

public class Tarikh extends PersianCalendar {
	
	public static final int YEAR = 1;
	public static final int MONTH = 2; 
	public static final int WEEK = 3; 
	public static final int DAY = 5; 
	public static final int DOZENHOUR = 9; 
	public static final int HOUR = 10; 
	public static final int MIN = 12;
	public static final int SECOND = 13; 
	public static final int MILLISECOND = 14; 
	
	public Tarikh(){
		super();
	}
	
	public Tarikh(int year, int month, int day){
		super(year, month-1, day);
	}
	
	public Tarikh(int year, int month, int day, int hour, int min, int second){
		super(year, month-1, day, hour, min, second);
	}
	
	public int getDayOfMonth(){
		return this.get(Calendar.DAY_OF_MONTH);
	}
	
	public int getMounth(){
		return this.get(Calendar.MONTH)+1;
	}
	
	public int getYear(){
		return this.get(Calendar.YEAR);
	}
	
	public int getHour(){
		return this.get(Calendar.HOUR_OF_DAY);
	}
	
	public int getMin(){
		return this.get(Calendar.MINUTE);
	}
	
	public int getSecond(){
		return this.get(Calendar.SECOND);
	}
	
	//S is uppercase
	public void Set(int year, int month, int day, int hour, int min, int second){
		super.set(year, month-1, day, hour, min, second);
	}
	
	public void Set(int year, int month, int day, int hour, int min){
		super.set(year, month-1, day, hour, min);
	}
	
	public void Set(int year, int month, int day){
		super.set(year, month-1, day);
	}
	
	@Override
	public String toString(){
		String month = Integer.toString(this.get(Calendar.MONTH)+1);
		String ans = this.get(Calendar.YEAR) + "/" + month + "/" + this.get(Calendar.DAY_OF_MONTH)
			+ " " + this.get(Calendar.HOUR_OF_DAY) + ":" + this.get(Calendar.MINUTE) + ":"
			+ this.get(Calendar.SECOND);
		return ans;
	}
	
	@Override
	public void add(int type, int count){
		super.add(type, count);
	}
	
}
