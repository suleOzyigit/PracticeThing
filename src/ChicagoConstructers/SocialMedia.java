package ChicagoConstructers;

public class SocialMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FacebookUser f1=new FacebookUser("james2018","1234");
FacebookUser f2=new FacebookUser("adam2018","av1223");
FacebookUser f4=new FacebookUser("sule","sule1234","sule dddd");
System.out.println(f4.password);
//FacebookUser f3=new FacebookUser();
//
//f3.age=23;
//f3.name="Sule";
//System.out.println(f3.name);
//System.out.println(f3.age);
//System.out.println(f3.userName);


f1.name="James Something";
f1.age=32;
f1.numOffriends=200;
System.out.println(f1.age);
System.out.println(f1.name);
System.out.println(f1.userName);

f2.name="Adam Smith";
f2.age=89;
f2.numOffriends=600;
System.out.println(f2.age);
System.out.println(f2.name);

System.out.println(" =============");
//System.out.println(f4.age);
//System.out.println(f4.name);
//System.out.println(f4.userName);

System.out.println(f4.age);
System.out.println(f4.name);
System.out.println(f4.userName);
f4.numOffriends=800;
System.out.println("=======");
f2.sendFriendRequest(f1);
f1.userInfo();
System.out.println("========User 2======");
f2.userInfo();
System.out.println("========User 4======");
f4.userInfo();
	}

}

