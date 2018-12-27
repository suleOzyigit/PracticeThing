
public class Regtangle extends Shape  implements Drawable{
	int width;
	int height;
	public Regtangle() {
		super("rec");
	}
	
public Regtangle(int width,int height,String name) {
	super(name);
	this.width=width;
	this.height=height;
	
}
@Override
public void calculateArea() {
	int area=width*height;
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
}
