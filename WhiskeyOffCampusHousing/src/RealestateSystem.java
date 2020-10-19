
public class RealestateSystem {
	PropertyList propertyList;
	AccountList accountList ;
	Account account;
	 public RealestateSystem()
	{
		
	}
	 public ArrayList<Property> findProperties()
	 {
		 String w;
		 findProperties(w);
	 }
	 private ArrayList<Property> findProperties(String keyword)
	 {
		 
	 }
	 public Account createAccount(String fname, String lname, String uname, int id, String email)
	 {
		Account newaccount = new Account(fname, lname,uname, id, email);
		accountList.add(newaccount);
		return newaccount;
	 }
	 public Account Login(String username, String password)
	 {
		Account account = Accountlist.getAccount(username);
		boolean a = account.verifyacc();
		if(a == true)
		{
			this.account = account;
			return account;
		}
		else
		{
			System.out.print("incorrect login");
		}
	 }
	 public ArrayList<Property> getFavoriteProperties()
	 {
		 this.account
	 }
	 public ArrayList<Property> getMyProperties()
	 {
		 
	 }
	 public addProperty(String title, String address, double price, ArrayList<String> description, Int bedrooms, double bathrooms, double DistToCampus, ArrayList<Restriction> restriction)
	 {
		 Property property = new Property(title,address,price,description,bedrooms,bathrooms,DisToCampus,restriction);
		 propertyList.add(property);
		 
		 /*
		  * is this Boolean?
		  */
	 }
	public void editProperty(Property property,String title)
	{
		findProperties(title);
		
	}
	public void reviewProperty(Property property, int rating ,String comment)
	{
		property.addReview(account,rating,comment);
	}
}
