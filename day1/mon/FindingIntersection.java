package week4.day1.mon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingIntersection {

	public static void main(String[] args) {
	
		
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		
	    List<Integer> l1=new ArrayList<Integer>(a.length);
	    List<Integer> l2=new ArrayList<Integer>(b.length);
	    for(int i:a) {
	    	l1.add(i);
	    	
	    }
	    for(int i:b) {
	    	l2.add(i);
	    	
	    }
	    l1.retainAll(l2);
	    System.out.println(l1);
	   
	    
		

	}

}
