package BuilderPattern;

public class MeetingAppointment extends Appointment {

	private int minRequiredAttendees;

	public int getMinRequiredAttendees() {
		return minRequiredAttendees;
	}

	public void setMinRequiredAttendees(int minRequiredAttendees) {
		this.minRequiredAttendees = minRequiredAttendees;
	}
	
}
