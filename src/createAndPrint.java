import java.util.Arrays;

public class createAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][] name= {{"sule","omer","emre","isar"},{"Yahya","Ercan"}};
for(int i=0;i<name.length;i++) {
	for(int j=0;j<name[i].length;j++) {
		System.out.print(name[i][j] + " ");
	}
	System.out.println();
	for(String[] names:name) {
		for(String listName:names) {
			System.out.println(listName);
		}
		System.out.println();
	}
	for(String[]myNames:name) {
		System.out.println(Arrays.toString(myNames));
		System.out.println(Arrays.deepToString(name));
	}
}
	}

}
