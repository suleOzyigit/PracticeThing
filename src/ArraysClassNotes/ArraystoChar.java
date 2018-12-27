package ArraysClassNotes;

public class ArraystoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word="sulesule";
char [] myWord=word.toCharArray();
for(char newWord:myWord) {
	System.out.println(newWord);
}
String gift="Dimand Ring";
//convert to char array print reverse
char [] reversegift=gift.toCharArray();
for(int i=reversegift.length-1;i>0;i--) {
	System.out.print(reversegift[i]);
}
	}

} 
