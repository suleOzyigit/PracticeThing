package Practice;

public class NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int bill=1000;
int qty=19;
int discount;
//if(bill>2000) {
//	if(qty>10) {
//		discount=10;
//	}else {
//		discount=9;
//	}
//
//}else {
//	discount=5;
//}
//System.out.println("bill equal" + discount);
	discount=(bill>2000)?(qty>10)?10:9:5;
	System.out.println("discount" + discount);
	}

}
