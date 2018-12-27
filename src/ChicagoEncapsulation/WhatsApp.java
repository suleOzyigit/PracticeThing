package ChicagoEncapsulation;

import ChicagoConstructers.FacebookUser;

public class WhatsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Post p1=new Post();
System.out.println(p1.getPostID());
	
	p1.setBody("today is a good day");
	p1.setDate("November 11 2018");
	p1.postInfo();
	
	FacebookUser user1=new FacebookUser("Jamie32","123");
	user1.post(p1);
	
	}

}
