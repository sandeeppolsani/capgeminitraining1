package exercise10;

public class nameValidation {

	public nameValidation() {
		// TODO Auto-generated constructor stub
	}
	public boolean validate(String s)
	{
		if(s.matches("[A-z]{8}_job"))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		nameValidation v=new nameValidation();
		System.out.println(v.validate("polsanis_job"));
	}
}
