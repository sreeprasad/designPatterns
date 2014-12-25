package BuilderPattern;

public class Patient extends Person {
	
	private String ssn;

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Patient [ssn=" + ssn + " "+super.toString() + "]";
	}
	

}
