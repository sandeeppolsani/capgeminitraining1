
public class exception {

	public exception() {
		// TODO Auto-generated constructor stub
	}
	void print()
	{
		System.out.println("print");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
//		new exception.print();
		int y=10;
		int []b = {};
		int [][]c={{1,2,3},{3,4},{5,1}};
		System.out.println(b[3]==c[1][1]);
		System.out.println(b instanceof Object);
		try
		{
			y/=x;
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
	}

}
