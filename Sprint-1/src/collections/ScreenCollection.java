package collections;
import Enities.*;

import java.util.HashMap;

public class ScreenCollection {

	private static int key=1000;
	
	public static HashMap<Integer,Screen> ScreenData=new HashMap<Integer,Screen>();
	static
	{
		ScreenData.put(1001, new Screen(1001,1001,"SCREEN 1",null,5,5));
		ScreenData.put(1002, new Screen(1002,1001,"SCREEN 2",null,5,5));
		ScreenData.put(1003, new Screen(1003,1001,"SCREEN 3",null,6,5));
		ScreenData.put(1004, new Screen(1004,1002,"SCREEN 1",null,8,8));
		ScreenData.put(1005, new Screen(1005,1002,"SCREEN 2",null,5,5));
	}
	public ScreenCollection() {
		// TODO Auto-generated constructor stub
	}
	public static int getKey() {
		return key;
	}
	public static void setKey(int key) {
		ScreenCollection.key = key;
	}
	public static HashMap<Integer, Screen> getScreenData() {
		return ScreenData;
	}
	public static void keyIncrement()
	{
		key++;
	}
	
	
}
