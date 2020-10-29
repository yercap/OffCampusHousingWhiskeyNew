/**
 * 
 * @author Jerald Capilo
 *
 */
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

public class DataLoader extends DataConstants {
	
	/**
	 * Static method that loads in the data for accounts
	 * @return
	 */
	public static ArrayList<Student> loadAccounts() {
		ArrayList<Student> accounts = new ArrayList<Student>();	
		
		try {
			FileReader reader = new FileReader(ACCOUNT_FILE);
			JSONParser parser = new JSONParser();
			JSONArray accountsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for (int i =0; i < accountsJSON.size(); i++) {
				JSONObject accountJSON = (JSONObject)accountsJSON.get(i);		
				
				String firstName = (String)accountJSON.get(ACCOUNT_FIRST_NAME);
				String lastName = (String)accountJSON.get(ACCOUNT_LAST_NAME);
				String userName = (String)accountJSON.get(ACCOUNT_USERNAME);
				int uscID = (int)accountJSON.get(ACCOUNT_ID);
				String email = (String)accountJSON.get(ACCOUNT_EMAIL);
				ArrayList<Property> favoriteProperties = (ArrayList<Property>)accountJSON.get(ACCOUNT_FAVORITE_PROPERTIES);
				String type = (String)accountJSON.get(ACCOUNT_TYPE);
				
				accounts.add(new Student(firstName, lastName, userName, uscID, email));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Static method that loads in the data for the property 
	 * @return
	 */
	public static ArrayList<Property> loadProperties() {
		ArrayList<Property> properties = new ArrayList<Property>();
		
		try {
			FileReader reader = new FileReader(PROPERTY_FILE);
			JSONParser parser = new JSONParser();
			JSONArray propertiesJSON = (JSONArray)new JSONParser().parse(reader);
			
			for (int i = 0; i < propertiesJSON.size(); i++) {
				JSONObject propertyJSON = (JSONObject)propertiesJSON.get(i);
				
				String title = (String)propertyJSON.get(PROPERTY_TITLE);
				String address = (String)propertyJSON.get(PROPERTY_ADDRESS);
				int bedrooms = (int)propertyJSON.get(PROPERTY_BEDROOMS);
				int bathrooms = (int)propertyJSON.get(PROPERTY_BATHROOMS);
				String dwellingType = (String)propertyJSON.get(PROPERTY_DWELLING_TYPE);
				double price = (double)propertyJSON.get(PROPERTY_PRICE);
				String agent = (String)propertyJSON.get(PROPERTY_AGENT);
				int distToCampus = (int)propertyJSON.get(PROPERTY_DIST);
				ArrayList<String> description = (ArrayList<String>)propertyJSON.get(PROPERTY_DESCRIPTION);
				ArrayList<Restriction> restriction = (ArrayList<Restriction>)propertyJSON.get(PROPERTY_RESTRICTION); // Check if this can be just an ArrayList of Strings only
				ArrayList<Property> similarProperties = (ArrayList<Property>)propertyJSON.get(PROPERTY_SIMILAR_PROPERTIES);
				ArrayList<Review> reviews = (ArrayList<Review>)propertyJSON.get(PROPERTY_REVIEWS);
				
				properties.add(new Property(title, address, price, description, bedrooms, bathrooms, distToCampus, restriction));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Static method that loads in the data for the reviews
	 * @return
	 */
	public static ArrayList<Review> loadReviews() {
		ArrayList<Review> reviews = new ArrayList<Review>();
		
		try {
			FileReader reader = new FileReader(REVIEW_FILE);
			JSONParser parser = new JSONParser();
			JSONArray reviewsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for (int i = 0; i < reviewsJSON.size(); i++) {
				JSONObject reviewJSON = (JSONObject)reviewsJSON.get(i);
				
				Student writer = (Student)reviewJSON.get(REVIEW_WRITER);
				int rating = (int)reviewJSON.get(REVIEW_RATING);
				String feedback = (String)reviewJSON.get(REVIEW_FEEDBACK); //Shouldn't this be in the ArrayList<Review>?
				
				reviews.add(new Review(writer, rating, feedback));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
