import java.util.*;
import java.util.function.BiFunction;


public class Maps {

	public Maps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();   //no insertion order
		Map m2=new LinkedHashMap(); //maintains the insertion order
		Map m3=new TreeMap(); //sorted order
		m2.put("5", 560);
		m2.put("6", 5560);
		m2.put("5", 57860); //since same key again, so the previous one is overwrited
		m2.put("59", 560);
		m2.put("56", 560);
		m2.put("15", 565860);
		m3.put("5", 560);
		m3.put("6", 5560);
		m3.put("5", 57860); //since same key again, so the previous one is overwrited
		m3.put("59", 560);
		m3.put("56", 560);
		m3.put("15", 565860);
		System.out.println(m2);
	}

}
