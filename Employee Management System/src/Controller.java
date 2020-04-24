import java.util.*;
public class Controller {
	
	public static EmployeeRegister er = new EmployeeRegister();
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ui;
		while(true)
		{
			System.out.println("MAIN MENU");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Records");
			System.out.println("3.Search Employee");
			System.out.println("4.Exit");
			System.out.print("Enter your choice (1..4) : ");
			ui  = sc.nextInt();
			switch(ui)
			{
				case 1:
					int eid;
					String firstName, lastName, email, address, mobile;
					System.out.println("Enter Employee ID : ");
					eid = sc.nextInt();
					System.out.println("Enter Employee First Name : ");
					firstName = sc.next();
					System.out.println("Enter Employee last Name : ");
					lastName = sc.next();
					System.out.println("Enter Employee email address : ");
					email = sc.next();
					System.out.println("Enter Employee Billing Address : ");
					address = sc.next();
					System.out.println("Enter Employee Contact Number : ");
					mobile = sc.next();
					er.addEmployee(eid, firstName, lastName, email, address, mobile);
				break;
				case 2:
					System.out.println("---Report---");
					er.displayAll();
				break;
				case 3:
					System.out.println("Enter Employee ID : ");
					int search_id = sc.nextInt();
					er.find(search_id);
				break;
				case 4:
					System.exit(0);
				break;
				default:
					System.out.println("Invalid Input!!");
			}
		}
	}
}
