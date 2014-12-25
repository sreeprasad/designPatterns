package BuilderPattern;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Client {

	
	public static void main(String[] args) {
		Client client = new Client();
		MeetingAppointment appointment = client.createMeeting(client);
		System.out.println(appointment.toString());
		DoctorAppointment doctorAppointment = client.getDoctorAppointment(client);
		System.out.println(doctorAppointment.toString());
	}

	private MeetingAppointment createMeeting(Client client) {
		MeetingAppointment appointment=null;
		AppointmentBuilderFactory factory = new AppointmentBuilderFactory();
		MeetingApppointmentBuilder meeting = (MeetingApppointmentBuilder) factory.buildAppointmentBuilder(AppointmentType.MEETING);
		List<Person> attendees = new ArrayList<Person>();
 		Date start = new Date();
		Date end = new Date();
		Time time = new Time(System.currentTimeMillis());
		client.createContact(attendees,3);
		Description description = new MeetingDescription();
		description.setDescription("JAVA ONE");
		Address address = new MeetingAddress();
		address.setApartmentName("110 EAST");
		address.setApartmentNumber("8 FLOOR");
		address.setCountry("USA");
		address.setState("NY");
		address.setStreet("23");
		
		try {
			appointment= meeting.createAppointment(AppointmentType.MEETING,start,end,time, address, attendees, description);
		} catch (InformationRequiredException e) {
			e.printStackTrace();
		}
		
		return appointment;
	}
	
	private DoctorAppointment getDoctorAppointment(Client client){
		
		DoctorAppointment appointment=null;
		AppointmentBuilderFactory factory = new AppointmentBuilderFactory();
		DoctorAppointmentBuilder doctorAppointmenet = (DoctorAppointmentBuilder) factory.buildAppointmentBuilder(AppointmentType.DOCTOR);
		List<Person> patientList = new ArrayList<>();
 		Date start = new Date();
		Date end = new Date();
		Time time = new Time(System.currentTimeMillis());
		MedicalRecord record = new MedicalRecord();
		client.createPatients(patientList,record);
 
		Description description = new DoctorDescription();
		description.setDescription("DOCTOR APPOINTMENT FOR "+patientList.get(0).getLastName());
		Address address = new MeetingAddress();
		address.setApartmentName("110 EAST");
		address.setApartmentNumber("8 FLOOR");
		address.setCountry("USA");
		address.setState("NY");
		address.setStreet("23");
		Person doctor = new Person();
		doctor.setFirstName("paul");
		doctor.setLastName("zaucowitsz");
		doctor.setAge(35);
		try {
			appointment =doctorAppointmenet.getAppointment(AppointmentType.DOCTOR, start, end, time, address, patientList, description, record, doctor);
		} catch (InformationRequiredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appointment;
	}

	private void createPatients(List<Person> patientList, MedicalRecord record) {
		
		 
			
			Patient one =  new Patient  ();
			one.setSsn("12345678");
			Address address = new ContactAddress();
			address.setApartmentName("33 WEST");
			address.setApartmentNumber("B");
			address.setCountry("USA");
			address.setState("NY");
			address.setStreet("9");
			one.setAddress(address);
			one.setAge(32);;
			one.setFirstName("Sreeprasad");
			one.setLastName("Govindankutty");
			patientList.add(one);
			Ailment ailment = new Ailment ();
			ailment.setDescription("ASTMA");
			record.setAilment(ailment);
			Allergy allergy= new Allergy();
			allergy.addAllergies("POLLEN GRAINS");
			allergy.addAllergies("CHEESE");
			record.setAllergies(allergy);
			
			
		 
	}

	private void createContact(List<Person> attendees,int number) {
		for(int i=0;i<number;i++){
			
			Person one = new Contact();
			Address address = new ContactAddress();
			address.setApartmentName("33"+i+" WEST");
			address.setApartmentNumber(i+"B");
			address.setCountry("USA");
			address.setState("NY");
			address.setStreet(i+"9");
			one.setAddress(address);
			one.setAge(32);;
			one.setFirstName("Sreeprasad"+i);
			one.setLastName("Govindankutty"+i);
			attendees.add(one);
			
		}
				
	}
}
