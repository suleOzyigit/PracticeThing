package LoopPractice;

public class Looppractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]pointss= {5,10,15,20,25,30,35,40,50,45,100};
	boolean found=true;
	int num=1000;
	while(found) {
		for(int i=0;i<pointss.length;i++) {
			if(pointss[i]==num) {
				System.out.println("value found at index" + i);
				found=false;
				break;
			}
		}
		
	}
	
	}
	}

	
	
