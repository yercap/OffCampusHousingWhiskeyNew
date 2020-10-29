/**
 * 
 * @author Jerald Capilo
 *
 */
import java.util.ArrayList;

public class Properties {
	private static Properties properties = null;
	private static ArrayList<Property> propertyList = new ArrayList<Property>();
	
	private Properties() {
		propertyList = DataLoader.loadProperties();
	}
	
	public static Properties getInstance() {
		if (properties == null) {
			properties = new Properties();
		}
		
		return properties;
	}
	
	public ArrayList<Property> getAccounts() {
		return propertyList;
	}
	
	public void addProperty(String title, String address, double price, ArrayList<String> description, int bedrooms, double bathrooms, double distToCampus, ArrayList<Restriction> restriction) {
		propertyList.add(new Property(title, address, price, description, bedrooms, bathrooms, distToCampus, restriction));
		DataWriter.saveProperties();
	}
}