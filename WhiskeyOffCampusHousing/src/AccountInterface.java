/**
 * 
 * @author Jerald Capilo
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AccountInterface {
	private Scanner scanner;
	
	public AccountInterface() {
		scanner = new Scanner(System.in);
	}
	
	public void displayAccounts() {
		Accounts accounts = Accounts.getInstance();
		ArrayList<Student> users = accounts.getAccounts();
		
		for (Student student : users) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}
	}
	
	public void run() {
		Accounts accounts = Accounts.getInstance();
		
		System.out.println("***** Current Accounts *****");
		//displayAccounts();
		
	}

	// Main method
	public static void main(String[] args) {
		//AccountInterface a = new AccountInterface();
		System.out.println("***** Current Accounts *****");
	}
}
