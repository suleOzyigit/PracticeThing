package PracticeFromRepl;

public class FindMax2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr={{1,2,3},
	           {2,4,5}};
int max=1;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		if(arr[i][j]>max) {
			max=arr[i][j];
		}
	}
}
System.out.println(max);
}
	}


