import java.util.*;


public class exercise7 {

	public exercise7() {
		// TODO Auto-generated constructor stub
	}
	public static int reverse(Integer a)
	{
		int rev=0;
		while(a>0)
		{
			rev=(rev*10)+(a%10);
			a=a/10;
		}
		return rev;
		
	}
	public static int[] getSorted(int[] arr)
	{
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
	for (int i = 0; i < arr.length; i++) {
		arrlist.add(reverse(arr[i]));
	}	
		Collections.sort(arrlist);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arrlist.get(i);
		}	
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,32,39,62,58,26,52,43,81};
		a=getSorted(a);
		for (int i : a) {
			System.out.println(i);
		}
		
	}

}
