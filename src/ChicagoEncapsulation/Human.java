package ChicagoEncapsulation;

public class Human {
//Human class
	/*instance variable gender ages
	 * encapsulate variable
	 * generates setter and geters
	 * age has to be between 0-150
	 * gender has to bemale or female only
	 */
	
	private String gender;
	private int age;
	public String getGender() {
		
		return gender;
	}
	public void setGender(String gender) {
		
if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")) {
		this.gender = gender;	
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>1&&age<120) {
		this.age = age;
	}
	}
	
	
}
