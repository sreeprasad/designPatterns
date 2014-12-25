package BuilderPattern;
import java.sql.Time;
import java.util.Date;
import java.util.List;


public abstract class Appointment {

	@Override
	public String toString() {
		return "Appointment [start=" + start + ", end=" + end
				+ ", appointmentTime=" + appointmentTime + ", description="
				+ description + ", attendees=" + attendees.toString() + ", location="
				+ location + "]";
	}
	private Date start;
	private Date end;
	private Time appointmentTime;
	private Description description;
	private List<Person> attendees;
	private Address location;
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Time getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(Time appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public Description getDescription() {
		return description;
	}
	public void setDescription(Description description) {
		this.description = description;
	}
	public List<Person> getAttendees() {
		return attendees;
	}
	public void setAttendees(List<Person> attendees) {
		this.attendees = attendees;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	
	
}
