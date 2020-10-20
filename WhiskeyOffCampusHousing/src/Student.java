/**
 * 
 * @author Cole Burnworth
 *
 */
import java.util.*;
public class Student {
	private String firstName, lastName, userName, email;
	private int uscID;
	private ArrayList<Property> favoriteProperties = new ArrayList<>();
	
	public Student(String firstName, String lastName, String userName, int uscID, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.uscID = uscID;
		this.email = email;
	}
	
	public void addFavoriteProperty(Property property) {
		favoriteProperties.add(property);
	}
	
	public ArrayList<Property> getFavoriteProperty() {
		return favoriteProperties.property;
	}
	
	public void addPropertyReview(Property property, int rating, String comment) {
		reviews.add(property, rating, comment);
	}
}
