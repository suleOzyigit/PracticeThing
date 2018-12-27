package ArrayList;
import java.util.*;
public class ClassNotes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> nums=new ArrayList<>();
nums.add(100);
nums.add(200);
nums.add(300);
nums.add(400);
nums.add(500);
System.out.println(nums);
nums.set(0, 1000);
System.out.println(nums);
nums.set(1, nums.get(1)*2);
System.out.println(nums);
nums.indexOf(300);
nums.set(nums.indexOf(300), 3);
System.out.println(nums);
	}

}
