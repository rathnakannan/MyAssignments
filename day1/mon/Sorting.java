package week4.day1.mon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		String[] a= {"HCL", "Wipro" , "Aspire" , "CTS" };
		 List<String> l1= new ArrayList<String>(a.length);
		 for(String s:a) {
			 l1.add(s);
			 System.out.println(l1);
			 Collections.sort(l1);
			 System.out.println(l1);
		 }

}
}