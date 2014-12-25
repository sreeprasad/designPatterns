package BuilderPattern;
public class DoctorAppointment extends Appointment {

	public Person getDoctor() {
		return doctor;
	}
	public void setDoctor(Person doctor) {
		this.doctor = doctor;
	}
	public MedicalRecord getRecord() {
		return record;
	}
	public void setRecord(MedicalRecord record) {
		this.record = record;
	}
	private Person doctor;
	private MedicalRecord record;
	
	
}
