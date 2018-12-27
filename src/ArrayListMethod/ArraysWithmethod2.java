package ArrayListMethod;
import java.util.*;
public class ArraysWithmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> myNums1= new ArrayList<>();
myNums1.add(2);
myNums1.add(4);
List<Integer> myNums2= new ArrayList<>();
myNums2.add(4);
myNums2.add(10);
int result=sumList(myNums1,myNums2);
System.out.println(result);
	}
public static int sumList(List<Integer> nums1,List<Integer>nums2) {
	int sum=0;
	for(Integer num:nums1) {
		sum+=num;
	}
	for(Integer num:nums2) {
		sum+=num;
	}
	return sum;
}

}
