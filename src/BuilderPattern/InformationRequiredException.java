package BuilderPattern;
import java.util.List;


public class InformationRequiredException extends Exception {
	
	private List<String> required;

	public InformationRequiredException(List<String> required) {
		super();
		this.required = required;
	}

	 
	
}
