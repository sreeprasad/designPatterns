package BuilderPattern;
import java.sql.Time;
import java.util.Date;
import java.util.List;


public class MeetingApppointmentBuilder extends AppointmentBuilder{

	private static String MIN_REQUIED_ATTENDEES="MIN 2 ATTENDEES REQUIRED";
	private static String END_DATE_REQUIRED =" APPOINTMENT END DATE REQUIRED ";
	private int MIN=2;
	
	public Appointment getAppointment(AppointmentType type){
		
		return super.buildAppointment(type);
	}
	
	public MeetingAppointment createAppointment(AppointmentType type, Date start, Date end, Time time, Address location, List<Person> attendees, 
			Description description) throws InformationRequiredException{
		
		if(end==null){
			super.getRequired().add(END_DATE_REQUIRED);
		}
		if(attendees.size()<MIN){
			super.getRequired().add(MIN_REQUIED_ATTENDEES);
			
		}
		MeetingAppointment meeting = (MeetingAppointment) getAppointment(type);		
		meeting.setEnd(end);
		meeting.setStart(start);
		meeting.setAppointmentTime(time);
		meeting.setAttendees(attendees);
		meeting.setDescription(description);
		meeting.setLocation(location);
		if(super.getRequired().size()>0){
			throw new InformationRequiredException(super.getRequired());
		}
		return meeting;
	}
	
  
	public void setMin(int min){
		this.MIN = min;
	}
}
