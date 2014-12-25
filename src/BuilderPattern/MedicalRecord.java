package BuilderPattern;

public class MedicalRecord {

		public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Ailment getAilment() {
		return ailment;
	}
	public void setAilment(Ailment ailment) {
		this.ailment = ailment;
	}
	public Allergy getAllergies() {
		return allergies;
	}
	public void setAllergies(Allergy allergies) {
		this.allergies = allergies;
	}
		private Patient patient;
		private Ailment ailment;
		private Allergy allergies;
	
}
