package PracticeFromRepl;

public class convertBinaryTodecimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {0,0,0,0,1,0,1,0};
int sum=0;
int base=2;
int exponent;
for(int i=0;i<num.length;i++) {
	exponent=num.length-1-i;
	if(num[i]==1) {
		sum=(int) (sum+ Math.pow(base,exponent));
	}
}
System.out.println(sum);
	}

}
