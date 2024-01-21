package week4.day1.mon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,10,6,8};
		List<Integer> l1=new ArrayList<Integer>(a.length);
		for(int i:a) {
			l1.add(i);
			System.out.println(l1);
		}
		Collections.sort(l1);
		System.out.println(l1);
		
		for(int b1=0;b1<=l1.size();b1++) {
			if(l1.get(b1) != l1.get(b1+1) ) {
				System.out.println(l1.get(b1)+1);
			}
		}
	}

}
