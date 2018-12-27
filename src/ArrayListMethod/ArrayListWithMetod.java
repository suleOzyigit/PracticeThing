package ArrayListMethod;
import java.util.*;
public class ArrayListWithMetod {

	public static void main(String[] args) {
		// //how to write method that accepts an Arraylist
		//calculate sum of values and return
ArrayList<Integer> numList=new ArrayList<>();
numList.add(100);
numList.add(400);
int result= sumList(numList);
System.out.println(result);
	}
public static int sumList(ArrayList<Integer> nums) {
	int sum=0;
//	for(int n:nums) {
//		sum+=n;
//	}
	for(int i=0;i<nums.size();i++) {
		sum+=nums.get(i);
	}
	
return sum;	
}

}
