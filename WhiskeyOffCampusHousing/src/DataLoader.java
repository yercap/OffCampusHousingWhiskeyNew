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
	
	public static ArrayList<Account> loadAccounts() {
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		try {
			FileReader reader = new FileReader(ACCOUNT_FILE);
			JSONParser parser = new JSONParser();
			JSONArray accountJSON = (JSONArray)new JSONParser().parse(reader);
			
			for (int i =0; i < accountJSON.size(); i++) {
				JSONObject accountJSON = (JSONObject)accountJSON.get(i);
				String firstName = (String)accountJSON.get(ACCOUNT_FIRST_NAME);
				String lastName = (String)accountJSON.get(ACCOUNT_LAST_NAME);
				String userName = (String)accountJSON.get(ACCOUNT_USERNAME);
				int uscID = (int)accountJSON.get(ACCOUNT_ID);
				String email = (String)accountJSON.get(ACCOUNT_EMAIL);
				ArrayList<Property> favoriteProperties = (ArrayList<Property>)accountJSON.get(ACCOUNT_FAVORITE_PROPERTIES);
				String type = (String)accountJSON.get(ACCOUNT_TYPE);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
