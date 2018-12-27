package Day_19;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str="SULE";
//str=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
//System.out.println(str);
//int n =1;
//while(n<=10) {
//	System.out.print(n+ " ");
//	n++;
//}
//System.out.println();
//System.out.println("number value:"+n);
//int k=10;
//while(k>=1) {
//	System.out.print(k+ " ");
//	k--;
//}
//System.out.println("number value:"+k);
System.out.println("=============");
boolean hungry=true;
int apples=1;
while(hungry) {
	System.out.println("I am eating apple");
	
	if(apples==5) {
		hungry=false;
	}
	apples++;
}

}
}