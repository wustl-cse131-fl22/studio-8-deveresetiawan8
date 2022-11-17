package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean twentyFourHour;
	
	/*
	 * @param hour - integer for hour
	 * @param minute - integer for minute
	 * @param twentyFourHour - boolean for if 24 hour time or 12 hour time
	 */
	public Time (int hour, int minute, boolean twentyFourHour){
		this.hour=hour;
		this.minute=minute;
		this.twentyFourHour=twentyFourHour;
	}
	public String toString() {
		if (twentyFourHour) {
			if (hour<= 12) {
				if (minute <10) {
					return hour + ":0" + minute+" A.M.";
				}
				return hour + ":" + minute+" A.M.";
			}
			else 
				if (minute <10) {
					return hour + ":0" + minute+" P.M.";
				}
				return hour-12+ ":" + minute+" P.M.";
		}
		else {
			
		
		return hour + ":" + minute;
		}
		}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	public static void main(String[] args) {
		Time midnight=new Time(12,1,true);
		System.out.println(midnight.toString());
		
		Time lunch=new Time(24,1,true);
		
		Time lunch12Hr=new Time(24,1,false);
		
		Time oneInMorning= new Time(1,0,true);
		
		Time twoInMorning=new Time(2,1,true);
		
		LinkedList<Time> list = new LinkedList<Time>();
		
		 System.out.println(midnight.equals(lunch));
		 System.out.println(lunch.equals(lunch12Hr));
    	
    }

}