package client;
import services.*;

import java.util.Scanner;

import controllers.salaryException;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws salaryException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		EmployeeService es=new EmployeeService();
		es.mainmenu();
		int choice=sc.nextInt();
		while(choice!=6)
		{
			
			switch(choice)
			{
			case 1:
				es.addEmployee();
				break;
			case 2:
				es.removeEmployee();
				break;
			case 3:
				es.getEmployeeDetails();
				break;
			case 4:
				es.getEmployeeName();
				break;
			case 5:
				es.getEmployeeSalary();
				break;
			default:
				System.out.println("wrong option");
			}
			System.out.println();
			System.out.println("Press 0 to exit or any other to continue");
			if(sc.nextInt()==0)
			{
				break;
			}
			es.mainmenu();
			choice=sc.nextInt();
		}
	}

}
