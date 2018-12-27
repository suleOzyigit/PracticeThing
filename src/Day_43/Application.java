package Day_43;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Appuser user1=new Appuser("iranMan","mark Smith","ac124");
Appuser user2=new Appuser("postman","Sar sama","a2345");
Appuser user3=new Appuser("superman","Hi joe", "aaa");
Appuser user4=new Appuser();
user1.setCount(100);
System.out.println(user1.getName());
System.out.println(user1.getCount());
System.out.println(user2.getCount());
System.out.println(user3.getCount());
System.out.println(user4.getCount());
System.out.println(user4.getName());	
System.out.println(user2.getName());
System.out.println(user3.getName());
System.out.println(user4.getuserId());
	}

}
