package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
private Date date;
private Time time;

public Appointment (Date date, Time time) {
	this.date=date;
	this.time=time;
}


	@Override
public int hashCode() {
	return Objects.hash(date, time);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Appointment other = (Appointment) obj;
	return Objects.equals(date, other.date) && Objects.equals(time, other.time);
}


	public static void main(String[] args) {
		Time doctorTime=new Time(12,12,false);
		Date doctorDate=new Date (12,12,2012,false);
		Appointment doctor=new Appointment(doctorDate,doctorTime);
		
		Time dentistTime=new Time(11,11,false);
		Date dentistDate=new Date(11,11,2011,false);
		Appointment dentist=new Appointment(dentistDate,dentistTime);
		
		HashSet<Appointment> appointments= new HashSet<Appointment>();
		appointments.add(dentist);
		appointments.add(doctor);
		
		Calendar appointmentCalendar=new Calendar(appointments);
		System.out.println(appointmentCalendar);
		
		
	}

}
