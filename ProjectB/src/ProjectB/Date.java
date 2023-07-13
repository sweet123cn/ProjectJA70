package ProjectB;

import java.io.Serializable;

public class Date implements Serializable{
	private int month;
	private int day;
	private int year;
	
	public Date(int mm, int dd, int yy) {
		month = mm;
		day = dd;
		year = yy;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int mm) {
		month = mm;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int dd) {
		day = dd;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int yy) {
		year = yy;
	}
	public  void dateOK() {
		if(this.getYear() < 1000 || this.getYear() > 9999) {
			setYear(1900);
		}
		if(this.getDay() < 1 || this.getDay() > 31) {
			setDay(1);
		}
		if(this.getMonth() < 1 || this.getMonth() > 12) {
			setMonth(1);
		}
	}
	

	public  boolean comparedateAfterDate(Date d) {
		if(this.year > d.year) {
			return true;
		}else if (this.year == d.year && this.month > d.month) {
			return true;
		}else if (this.year == d.year && this.month == d.month && this.day > d.day) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return month + "-" + day + "-" + year ;
	}
	
}
