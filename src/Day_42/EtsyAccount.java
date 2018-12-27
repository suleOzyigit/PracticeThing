package Day_42;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;
	public void setAccauntInfo(String email,String firstName,String password) {
		this. email=email;
		this.firstName=firstName;
		setPassword(password);
	} 
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println(" Password must be at leat 6 character");
			return;
		}
		
		this.password = password;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
