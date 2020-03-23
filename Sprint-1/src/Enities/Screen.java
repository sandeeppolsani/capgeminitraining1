package Enities;

import java.util.regex.Pattern;

import javax.naming.LimitExceededException;

import services.AdminService;
import services.UserService;
import collections.ShowCollection;

public class Screen {

	private Integer screenId;
	private Integer theatreId;
	private String screenName;
	private Show[] showList;
	private Integer rows;
	private Integer columns;
	
	public Screen() {
		// TODO Auto-generated constructor stub
	}
	
	public Screen(Integer screenId, Integer theatreId, String screenName,
			Show[] showList, Integer rows, Integer columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.rows = rows;
		this.columns = columns;
	}

	public void addShow(Screen screen,Show show)
	{
		Show[] showlist=screen.getShowList();
		if(showList==null)
		{
			this.showList=new Show[]{show};
			return;
		}
		Show[] tempShowList=new Show[showList.length+1];
		for (int i = 0; i < showList.length; i++) {
			tempShowList[i]=showList[i];
		}
		tempShowList[showList.length]=show;
		AdminService adminservice=new AdminService();
		Screen updatedScreen=screen;
		updatedScreen.setShowList(tempShowList);
		if(adminservice.UpdateScreen(updatedScreen))
		{
			System.out.println("Show successfully updated");
		}
	}
	public Show searchShow(String showName)
	{
		for (Show show : ShowCollection.ShowData.values()) {
			if((show.getShowName().compareToIgnoreCase(showName)==0 || show.getShowName().matches("(?i:.*"+showName+".*)")) && show.getTheatreId()==1001)
			{
				return show;
			}
		}
		return null;
	}
	
	
	public Show[] showShows()
	{
		return getShowList();
		
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Show[] getShowList() {
		return showList;
	}

	public void setShowList(Show[] showList) {
		this.showList = showList;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}

}
