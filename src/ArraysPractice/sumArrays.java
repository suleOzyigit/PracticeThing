package ArraysPractice;

public class sumArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] number= {10,20,30,40,50,60,1,3,5,6};
int sumeven=0;
int sumodd=0;
for(int i=0;i<number.length;i++) {
	if(number[i]%2==0) {
		sumeven=sumeven+number[i];
		
		}else {
			sumodd=sumodd+number[i];
			
		}
	//System.out.println(sumeven);
	//System.out.println(sumodd);
	}
System.out.println(sumeven);
System.out.println(sumodd);
}
}