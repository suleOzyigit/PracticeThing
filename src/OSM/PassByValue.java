package OSM;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*when you pass a variable argument to the a method
 * you are olnly passing the copy of that variable
 * 
 * 
// */int k=10;
// printInt(k);
// System.out.println(k);
// 
//	}
//public static void printInt(int i) {
//	i=i+5;
//	System.out.println(i);
//	
//			
//}


//int k = 10 ; 
//printInt(k);
//
//System.out.println(k);
StringBuilder sb1 = new StringBuilder("original"); 
doSomething(sb1);
System.out.println(sb1);

}

public static void doSomething(StringBuilder sb) {

sb.append("abc") ; 
System.out.println(sb);
}

public static void doSomething2(StringBuilder sb) {

sb = new StringBuilder("original"); 
sb.append("abc") ; 
System.out.println(sb);
}

//public static void printInt(int i) {
//
//i = i + 5 ; 
//System.out.println("the i value inside method " + i);
//
//}








}
