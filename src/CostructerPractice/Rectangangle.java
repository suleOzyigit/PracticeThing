package CostructerPractice;

public class Rectangangle {
int length; 
int breadth;

public Rectangangle() {
	length=0;
	breadth=0;
}
public Rectangangle(int length,int breadth) {
	this. length= length;
	this. breadth=breadth;
}
public  int Area() {
	return length*breadth;
}
}
