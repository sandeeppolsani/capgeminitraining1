import java.util.Scanner;


public class scanner {

	public scanner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.toString());
		String s=sc.next();
		System.out.println(sc.hasNext("polsani"));
		System.out.println(s);
	}

}