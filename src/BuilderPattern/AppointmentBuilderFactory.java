package BuilderPattern;

public class AppointmentBuilderFactory {
	
	
	public AppointmentBuilder buildAppointmentBuilder(AppointmentType type){
		
		if(type.equals(AppointmentType.MEETING)){
			return new MeetingApppointmentBuilder();
		}
		if(type.equals(AppointmentType.DOCTOR)){
			return new DoctorAppointmentBuilder();
		}
		return null;
		
	}
	
	
	
}
