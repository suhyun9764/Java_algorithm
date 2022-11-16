package chap5_solco;

public class Mydate {

	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Mydate(int day, int month, int year) {
		
	}
	
	public boolean isValid() {
		if(month==2) {
			if(day<1 || day>28) {
				return false;
			}
		}
		else
			
			return true;
		
	}

}
