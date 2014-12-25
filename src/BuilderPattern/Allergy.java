package BuilderPattern;
import java.util.ArrayList;
import java.util.List;


public class Allergy {

	List<String> allergies = new ArrayList<>();
	
	public void addAllergies(String allergy){
		allergies.add(allergy);
	}
}
