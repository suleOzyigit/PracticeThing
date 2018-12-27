import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray : myComplexArray) {
//			for(int i=0; i<mySimpleArray.length; i++) { 
//				
//				System.out.print(mySimpleArray[i]+"\t");
//			}
			System.out.println(Arrays.toString(mySimpleArray));
		
			}
		
         
        
		StringBuilder sb1 = new StringBuilder("123456");
        sb1.subSequence(2, 4);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);
        int num=5;
        do {
        	System.out.println(num--+ "");
        }while(num==0);
       String [][] arr= {{"A","B","C"},{"D","E"}};
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0;j<arr[i].length;j++) {
    		   System.out.print(arr[i][j] + "");
    		   if(arr[i][j].equals("B")) {
    			   break;
    		   }
    	   }
    	   continue;
       }
       
       int data[]= {2010,2013,2014,2015,2014};
       int key=2014;
       int count=0;
       
      StringBuilder sb=new StringBuilder("ackli");
       //sb.delete(0, sb.length());
       sb.substring(0,1);
       System.out.println(sb);
       //sb.delete(0, sb.size());
        }
        
        
        
        
	   
        
        

}
