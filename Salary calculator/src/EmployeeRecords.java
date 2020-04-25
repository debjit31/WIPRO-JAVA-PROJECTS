import java.util.*;
public class EmployeeRecords {
	static int i = 0;
	int salary = 0;
	String designation = "";
	ArrayList<Employee> records = new ArrayList<Employee>();
	public void addEmployees() {
		records.add(new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000));
		records.add(new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000));
		records.add(new Employee(1003, "Rahul", "12/11/2018", "k", "Acct", 10000, 8000, 1000));
		records.add(new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000));
		records.add(new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000));
		records.add(new Employee(1006, "Suman", "01/01/2020", "e", "Manufacturing", 23000, 9000, 4400));
		records.add(new Employee(1007, "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000));
	}
	public void calculateSalary(int empNo)
	{
		Employee se = null;
		for(int i=0;i<records.size(); i++)
		{
			if(records.get(i).getEmpNo() == empNo)
			{
				se = records.get(i);
				break;
			}
		}
		salary = se.getBasic() + se.getHra() - se.getIt();
		int da=0;
		switch(se.getdesignCode())
		{
			case "e":
				da = 20000;
				designation = "Engineer";
			break;
			case "c":
				da = 32000;
				designation = "Consultant";
			break;
			case "k":
				da = 12000;
				designation = "Clerk";
			break;
			case "r":
				da = 15000;
				designation = "Receptionist";
			break;
			case "m":
				da = 40000;
				designation = "Manager";
			break;		
		}
		salary += da;
	}
	public void display(int empNo)
	{
		Employee se = null;
		for(int i=0;i<records.size(); i++)
		{
			if(records.get(i).getEmpNo() == empNo)
			{
				se = records.get(i);
				break;
			}
		}
		System.out.println("Emp No.\t Emp Name\t Department\tDesignation\tSalary\t");
		System.out.println(se.getEmpNo()+"\t"+se.getEmpName()+"\t"+se.getDepartment()+"\t"+designation+"\t"+salary);
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid Employee Number :- ");
		int empNo = sc.nextInt();
		EmployeeRecords er = new EmployeeRecords();
		er.addEmployees();
		er.calculateSalary(empNo);
		er.display(empNo);
		
	}
}
