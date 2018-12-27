package TwoDiomensionalArray;

import java.util.Arrays;

public class print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]anArray= {{5,3,6,7},
                 {8,2,4,1},
                 {1,5,8,0},};
System.out.println(Arrays.deepToString(anArray));//first wat

System.out.println(anArray[2][3]);//second way
for(int i=0;i<anArray.length;i++) {
	for(int j=0;j<anArray[i].length;j++) {
		System.out.print(anArray[i][j]+ " ");
	}
	System.out.println();
	}
for(int []tempArray:anArray) {//third way
	for(int value:tempArray) {
		System.out.print(value);
	}
	System.out.println();
}

}
	}


