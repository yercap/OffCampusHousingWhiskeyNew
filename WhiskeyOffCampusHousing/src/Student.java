/**
 * 
 * @author Cole Burnworth, Jerald Capilo
 *
 */
import java.util.*;
public class Student {
	private String firstName, lastName, userName, email, type;
	private int uscID;
	private ArrayList<Property> favoriteProperties = new ArrayList<>();
	
	public Student(String firstName, String lastName, String userName, int uscID, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.uscID = uscID;
		this.email = email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getUscID() {
		return uscID;
	}
	
	public void setUscID(int uscID) {
		this.uscID = uscID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
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
