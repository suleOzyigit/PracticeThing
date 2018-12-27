package OCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deneme12 {
	private char var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var1='a';
		char var2=var1;
		var2='e';
		Deneme12 obj1=new Deneme12();
		Deneme12 obj2=new Deneme12();
		obj1.var='i';
		obj1.var='o';
		System.out.println(var1 + var2);
		//System.out.println(obj1.var + obj2.var);
		for (int ii = 0; ii < 3;ii++) {
			int count = 0;
			for (int jj = 3; jj > 0; jj--) {
			if (ii == jj) {
			++count;
			break;
			}
			}
			System.out.print(count);
			continue;
			}
	}
}
