package Day_43;

public class Appuser {
private String userId;
private String name;
private String password;
private static  int count=0;


public Appuser() {
	count++;
}



public Appuser(String userId, String name, String password) { //.int count) {
	
	this.userId = userId;
	this.name = name;
	this.password = password;
	//this.count = count;
	count++;
}
public String  getuserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getPassWord() {
	return password;
}

public void setPassWord(String password) {
	this.password=password;
}


public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count=count;
}
}