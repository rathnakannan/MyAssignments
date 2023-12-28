package week2.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int n=8;
		int f=0;
		int s=1;
		int t;
		System.out.println(f);
		System.out.println(s);
		for(int i=3;i<=8;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}
		
	}

}
