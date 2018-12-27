package PracticeFromRepl;

public class findMaches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr= {{2,2,1,3,4,5},
		{5,2,3,3,4,5},{3,2,3,1,4,5}};
int count=0;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length-1;j++) {
	if(arr[i][j]==arr[i][j+1]) {
		count++;
	}
		
	}
}
System.out.println(count);
}
	}


