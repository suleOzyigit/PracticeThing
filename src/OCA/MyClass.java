package OCA;

public class MyClass {
	
	void print(long duration) {
	    System.out.println("long");
	  }
	
	void print(int duration) {
	    System.out.println("int");
	  }

	  void print(String s) {
	    System.out.println("String");
	  }

	  void print(Object o) {
	    System.out.println("Object");
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass course=new MyClass();	
		long a=10;
		char c=10;
		course.print(c);
		course.print("Object");
		
	
	
	}

}
