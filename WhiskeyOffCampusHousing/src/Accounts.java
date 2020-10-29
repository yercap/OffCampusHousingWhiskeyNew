/**
 * 
 * @author Jerald Capilo
 *
 */
import java.util.ArrayList;

public class Accounts {
	private static Accounts accounts = null;
	private static ArrayList<Student> accountList = new ArrayList<Student>();
	
	private Accounts() {
		accountList = DataLoader.loadAccounts();
	}
	
	public static Accounts getInstance() {
		if (accounts == null) {
			accounts = new Accounts();
		}
		
		return accounts;
	}
	
	public ArrayList<Student> getAccounts() {
		return accountList;
	}
	
	public void addAccount(String firstName, String lastName, String userName, int uscID, String email, ArrayList<Property> favoriteProperties, String type) {
		accountList.add(new Student(firstName, lastName, userName, uscID, email));
		DataWriter.saveAccounts();
	}
}
