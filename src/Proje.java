import java.util.Arrays;

public class Proje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String sentence="I love you";
String[] myWord=sentence.split(" ");
System.out.println(Arrays.toString(myWord));
String reverse="";
for(int i=myWord.length-1;i>=0;i--) {
	reverse=reverse+myWord[i].trim()+" ";
	
}
System.out.println(reverse);
	}

}
