package BuilderPattern;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AppointmentBuilder {

	private List<String> required = new ArrayList<>();
	private static String START_DATE_REQUIRED =" APPOINTMENT START DATE REQUIRED ";
	private static String TIME_REQUIRED =" APPOINTMENT TIME REQUIRED ";
	private static String ADDRESS_REQUIRED =" APPOINTMENT ADDRESS REQUIRED ";
	private static String CREATE_APPOINMENT ="CREATE APPOINTMENT FIRST";
	private Appointment appointment;
	public Appointment buildAppointment(AppointmentType type){
		
		if(type.equals(AppointmentType.MEETING))
			appointment = new MeetingAppointment();
		if(type.equals(AppointmentType.DOCTOR))
			appointment=  new DoctorAppointment();
		
		return appointment;
	}
	
	
	public Appointment createAppointment() throws InformationRequiredException {
		   
		if(requiredFields().size()>0){
			throw new InformationRequiredException(requiredFields());
		}
		 
		return appointment;
		
	}
	
	public void buildStartDate(Date start){
		if(appointment==null) throw new IllegalArgumentException(CREATE_APPOINMENT);
		appointment.setStart(start);
	}
	public void buildEndDate(Date end){
		if(appointment==null) throw new IllegalArgumentException(CREATE_APPOINMENT);
		appointment.setEnd(end);
	}
	
	public void buildTime(Time appointmentTime){
		if(appointment==null) throw new IllegalArgumentException(CREATE_APPOINMENT);
		appointment.setAppointmentTime(appointmentTime);
	}
	
	public void setAttendees(List<Person> attendees){
		if(appointment==null) throw new IllegalArgumentException(CREATE_APPOINMENT);
		appointment.setAttendees(attendees);	
	}
	public void setLocation(Address location){
		if(appointment==null) throw new IllegalArgumentException(CREATE_APPOINMENT);
		appointment.setLocation(location);
	}
	public void setDescription(Description description){
		if(appointment==null) throw new IllegalArgumentException(CREATE_APPOINMENT);
		appointment.setDescription(description);
	}
	
	public List<String> getRequired(){
		return required;
	}
	
	public List<String> requiredFields(){
		if(appointment==null) throw new IllegalArgumentException(CREATE_APPOINMENT);
		if(appointment.getStart()==null){
			required.add(START_DATE_REQUIRED);
		}
		if(appointment.getAppointmentTime()==null){
			required.add(TIME_REQUIRED);
		}
		if(appointment.getLocation()==null){
			required.add(ADDRESS_REQUIRED);
		}
		return required;
	}
}
