package BuilderPattern;
import java.sql.Time;
import java.util.Date;
import java.util.List;


public class DoctorAppointmentBuilder extends AppointmentBuilder {
	
	private static String MEDICAL_RECORD_REQUIRED ="MEDICAL RECORDS REQUIRED";
	private static String DOCTOR_REQUIRED ="DOCTOR REQUIRED";
	
	public Appointment buildAppointment(AppointmentType type){
		return super.buildAppointment(type);
	}
	
	public DoctorAppointment getAppointment(AppointmentType type, Date start, Date end, Time time, Address location, List<Person> personList, 
			Description description,MedicalRecord record, Person doctor) throws InformationRequiredException {
		
		if(record==null){
			super.getRequired().add(MEDICAL_RECORD_REQUIRED);
		}
		if(doctor==null){
			super.getRequired().add(DOCTOR_REQUIRED);
		}
		DoctorAppointment doctorAppointment =(DoctorAppointment) buildAppointment(type);
		doctorAppointment.setEnd(end);
		doctorAppointment.setStart(start);
		doctorAppointment.setAppointmentTime(time);
		doctorAppointment.setAttendees(personList);
		doctorAppointment.setDescription(description);
		doctorAppointment.setLocation(location);
		doctorAppointment.setRecord(record);
		doctorAppointment.setDoctor(doctor);
 		
		if(super.getRequired().size()>0){
			throw new InformationRequiredException(super.getRequired());
		}
		return doctorAppointment;
	}

}
