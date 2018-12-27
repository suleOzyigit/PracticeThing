
public class Circle extends Shape{
//implements Drawable  {
	
	int radius;
	
public Circle(String name,int radius) {
		super(name);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}






@Override
public void calculateArea() {
	// TODO Auto-generated method stub
	int area=(int)3.14*radius*radius;
	System.out.println(area);
}






@Override
public int drawLine(String s) {
	// TODO Auto-generated method stub
	return 0;
}






@Override
public void draw() {
	// TODO Auto-generated method stub
	
}






//@Override
//public int drawLine(String s) {
//	// TODO Auto-generated method stub
//	return 0;
//}
//
//
//
//
//
//
//@Override
//public void draw() {
//	// TODO Auto-generated method stub
//	
//}
}
