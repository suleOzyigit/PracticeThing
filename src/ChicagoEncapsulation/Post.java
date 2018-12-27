package ChicagoEncapsulation;

import java.util.Random;

public class Post {
private String body;
private int likes;
private String date;
private int postID;



public Post() {
	Random r=new Random();
	postID= r.nextInt(3000);
}
public void postInfo() {
	System.out.println("body="+body);
	System.out.println("likes="+likes);
	System.out.println("dates="+ date);
}








public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
	
}
public int getLikes() {
	return likes;
}
public void setLikes(int likes) {
	this.likes = likes;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getPostID() {
	return postID;
}
public void setPostID(int postID) {
	this.postID = postID;
}




}
