package PracticeFromRepl;

import java.util.Arrays;

public class MultipicationTable2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]mult=new int[10][10];

for(int i=0;i<10;i++) {
	for(int j=0;j<10;j++) {
		mult[i][j]=(i+1)*(j+1);
		
	}
}
System.out.print(Arrays.deepToString(mult));
	}

}
