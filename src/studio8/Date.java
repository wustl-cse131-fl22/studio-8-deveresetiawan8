package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
private int month;
private int day;
private int year;
private boolean holiday;

/*@param int month - int between 1 and 12
 * @param int day - between 1 and 31
 * @param int year 
 * 
 * @param boolean holiday - true if the day is a holiday
 * 
 */
public Date (int month, int day, int year, boolean holiday) {
	this.month=month;
	this.day=day;
	this.year=year;
	this.holiday=holiday;
}

@Override
public int hashCode() {
	return Objects.hash(day, month, year);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month && year == other.year;
}

public String toString() {
	return this.month +"/" + day + "/"+year ;
}
    public static void main(String[] args) {

    	Date date1=new Date (12, 04, 2003, false);
    	System.out.println(date1.toString());
    	
    	Date date2=new Date(12,05,2003,false);
    	Date date3=new Date (12,04,2003, true);
    	Date date4 =new Date (10,31,1,true);
    	Date date5=new Date(9,11,2011,true);
    	
    	LinkedList<Date> list =new LinkedList<Date>();
    	list.add(date1);
    	list.add(date5);
    	list.add(date5);
    	System.out.println(list);
    	
    	HashSet<Date> set=new HashSet<Date>();
    	set.add(date5);
    	set.add(date5);
    	set.add(date1);
    	System.out.println(set);
    	
  
    }

}
