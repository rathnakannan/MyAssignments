package week4.day1.mon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};
		Arrays.sort(a);
		List<Integer> l1= new ArrayList<Integer>(a.length);
		for(int i:a) {
		l1.add(i);
		}
        
        System.out.println(l1);
       System.out.println( l1.get(4));
	}

}
