package Day_42;

public class EtsyRegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EtsyAccount acount1=new EtsyAccount();
acount1.setEmail("null@gmail");
acount1.setFirstName("Adam");
acount1.setPassword("adam1234");

EtsyAccount acount2=new EtsyAccount();
acount2.setEmail("acount2@mail.com");
acount2.setFirstName("jashua");
acount2.setPassword("jashua1234");


EtsyAccount acount3=new EtsyAccount();
acount3.setEmail("atsy@.com");
acount3.setFirstName("_");
acount3.setPassword("1234");

System.out.println(acount1.getFirstName());


EtsyAccount myAccount=new EtsyAccount();
myAccount.setAccauntInfo("myacount@gmail.com","Bill","123456");
System.out.println(myAccount.getEmail()+"----" + myAccount.getFirstName()+ "====="+ myAccount.getPassword());	
	
	
	}

}
