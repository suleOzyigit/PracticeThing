package ArraysPractice;

public class spesificCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {55, 45, 69, 44};
	      int num = 55;

	      for(int i = 0; i<myArray.length; i++){
	         if(num == myArray[i]){
	            System.out.println("Array contains the given element");
	            break;
	         }else {
	        	 System.out.println("not contains");
	        	 break;
	         }
	      }
	   }
	}
	

