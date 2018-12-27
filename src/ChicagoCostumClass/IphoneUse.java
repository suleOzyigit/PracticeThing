package ChicagoCostumClass;

public class IphoneUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iphone myphone=new Iphone();
myphone.model="iphone 8 plus";
myphone.memory=64;
myphone.color="red";
System.out.println(myphone.memory);
System.out.println(myphone.color);
Iphone OmersPhone=new Iphone();
OmersPhone.model="iphone 6";
OmersPhone.memory=65;
OmersPhone.color="gold";
//System.out.println(OmersPhone.memory);
//System.out.println(OmersPhone.color);

myphone.PrintInfo();

	}

}
