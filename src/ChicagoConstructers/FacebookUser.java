package ChicagoConstructers;

import java.util.ArrayList;
import java.util.List;

import ChicagoEncapsulation.Post;

public class FacebookUser {
String userName;
int age;
String name;
String password;
int numOffriends;
List<Post> posts=new ArrayList<>();

//public FacebookUser() {
//	
//}






public FacebookUser(String username,String password) {
	this.userName=username;
	this.password=password;
	//System.out.println("helllll");
	
}

public FacebookUser(String userName,String password,String name) {
	
	if(!password.contains(userName)) {
		this.password=password;
	}else {
		System.out.println("pawword ncant contain user name please change password");
	this.password="....";//if we do noat write antthing  like this.password=""; it will be empty string
	
	}
	
	
	this.userName=userName;
	this.name=name;
}

public  boolean  sendFriendRequest(FacebookUser targetUser) {
	if(targetUser.numOffriends<5000) {
		System.out.println( " Friends request sent to the " + targetUser.userName);
	return true;
	
	}
	else {
		System.out.println(targetUser.userName + "can not accepts friens request");
	return false;
	}
	
}
public void userInfo() {
	System.out.println("name=" +name);
	System.out.println("user name " +userName);
	System.out.println("age= " + this.age);
	System.out.println("number of friends= " +numOffriends);
}


public void post(Post post) {
	System.out.println("\nYour neww post here\n");
	post.postInfo();
	posts.add(post);
}
}
