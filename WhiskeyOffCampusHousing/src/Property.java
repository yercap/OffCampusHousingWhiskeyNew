import java.util.*;
import java.io.*;
public class Property {
	String title;
	String address;
	int bedrooms;
	double bathrooms;
	String dwellingType;
	double price;
	Agent agent;
	double DistToCampus;
	ArrayList<String> description = new ArrayList<String>();
	ArrayList<Restriction> restriction = new ArrayList<Restriction>();
	ArrayList<Property> similarProperties = new ArrayList<Property>();
	ArrayList<Review> reviews= new ArrayList<Review>();
	
	public Property(String title, String address, double price, ArrayList<String> description, int bedrooms, double bathrooms, double distToCampus, ArrayList<Restriction> restriction)
	{
		this.title = title;
		this.address = address;
		this.price = price;
		this.description = description;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.DistToCampus = distToCampus;
		this.restriction = restriction;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getBedrooms() {
		return bedrooms;
	}
	
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	
	public double getBathrooms() {
		return bathrooms;
	}
	
	public void setBathrooms(double bathrooms) {
		this.bathrooms = bathrooms;
	}
	
	public dwellingType getDwellingType() {
		return dwellingType;
	}
	
	public void setDwellingType(dwellingType dwellingType) {
		this.dwellingType = dwellingType;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Agent getAgent() {
		return agent;
	}
	
	public double getDistToCampus() {
		return DistToCampus;
	}
	
	public void setDistToCampus(double distToCampus) {
		DistToCampus = distToCampus;
	}
	
	public ArrayList<String> getDescription() {
		return Description;
	}
	
	public void setDescription(ArrayList<String> description) {
		Description = description;
	}
	
	public ArrayList<Restriction> getRestriction() {
		return Restriction;
	}
	
	public void setRestriction(ArrayList<Restriction> restriction) {
		Restriction = restriction;
	}
	
	public ArrayList<Property> getSimilarProperties() {
		return similarProperties;
	}
	
	public void setSimilarProperties(ArrayList<Property> similarProperties) {
		this.similarProperties = similarProperties;
	}
	
	public ArrayList<Review> getReviews() {
		return reviews;
	}
	
	public ArrayList<Review> addReviews(Student student, int rating, String feedback) {
		
		ArrayList<Review> Review = new review(student,rating,feedback);
		return reviews.add(Review);
	}
	
	public boolean isAvalible(ArrayList<Property> propertyList)
	{
		return propertyList.isEmpty();
	}
	
	
	
	
}
