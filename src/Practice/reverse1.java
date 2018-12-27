package Practice;

public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String reverse="";
String word="Sule";
for(int lent=word.length()-1;lent>=0;lent--) {
	reverse=reverse+word.charAt(lent);
	}
System.out.println(reverse);
}
}
