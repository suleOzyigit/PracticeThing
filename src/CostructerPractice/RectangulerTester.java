package CostructerPractice;

public class RectangulerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangangle r1=new Rectangangle();
		System.out.println(r1.length);
		System.out.println(r1.breadth);
		Rectangangle r2=new Rectangangle(3,6);
		System.out.println(r2.length);
		System.out.println(r2.breadth);
		System.out.println(r2.Area());
		
	}

}
