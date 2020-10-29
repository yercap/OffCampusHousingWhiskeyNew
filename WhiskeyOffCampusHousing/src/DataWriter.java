/**
 * 
 * @author Jerald Capilo
 *
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
	
	public static void saveAccounts() {
		Accounts accounts = Accounts.getInstance();
		ArrayList<Student> users = accounts.getAccounts();
		JSONArray jsonUsers = new JSONArray();
		
		for (int i = 0; i < users.size(); i++) {
			jsonUsers.add(getAccountJSON(users.get(i)));
		}
		
		// DataWriter
		try (FileWriter file = new FileWriter(ACCOUNT_FILE)) {
			file.write(jsonUsers.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static JSONObject getAccountJSON(Student student) {
		JSONObject accountDetails = new JSONObject();
		accountDetails.put(ACCOUNT_FIRST_NAME, student.getFirstName());
		accountDetails.put(ACCOUNT_LAST_NAME, student.getLastName());
		accountDetails.put(ACCOUNT_USERNAME, student.getUserName());
		accountDetails.put(ACCOUNT_ID, student.getUscID());
		accountDetails.put(ACCOUNT_EMAIL, student.getEmail());
		accountDetails.put(ACCOUNT_FAVORITE_PROPERTIES, student.getFavoriteProperty());
		accountDetails.put(ACCOUNT_TYPE, student.getType());
		
		return accountDetails;
	}
}
