/**
 * 
 * @author Cole Burnworth
 *
 */
import java.util.*;
public class Agent {
	private ArrayList<Property> myProperties;
	int mlsNumber;
	
	public Agent() {
		myProperties = new ArrayList<Property>();
	}
	
	public void AddProperty(String title, String address, double price, ArrayList<String> Description, int bedrooms, double bathrooms, double DistToCampus, ArrayList<Restriction> Restriction) {
		myProperties.add(title, address, price, Description, bedrooms, bathrooms, DistToCampus, Restriction);
	}
	
	public void editProperty(int propertyID, String title) {
		myProperties.set(propertyID, title);
	}
	
	public void editPrice(int propertyID, double price) {
		myProperties.set(propertyID, price);
	}
	
	public void editDescription(int propertyID, ArrayList<String> Description) {
		myProperties.set(propertyID, Description);
	}
	
	public void editBedrooms(int propertyID, int bedrooms) {
		myProperties.set(propertyID, bedrooms);
	}
	
	public void editBathrooms(int propertyID, double bathrooms) {
		myProperties.set(propertyID, bathrooms);
	}
	
	public void editRestriction(int propertyID, ArrayList<Restriction> Restriction) {
		myProperties.set(propertyID, Restriction);
	}
	
	public void editSimilarProperty(int propertyID, ArrayList<Property> similarProperties) {
		myProperties.add(propertyID, similarProperties);
	}
}
