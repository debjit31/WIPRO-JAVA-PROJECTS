import java.util.*;
public class EmployeeRegister {
	
	
	ArrayList<Employee> register = new ArrayList<Employee>();
	public void addEmployee(int eid, String firstName, String lastName, String email, String address, String mobile)
	{
		register.add(new Employee(eid, firstName, lastName, email, address, mobile));
		System.out.println("Employee Added Successfully!!!\n");
		
	}
	public void delete(int did)
	{
		if(register.size() == 0)
			System.out.println("Record Not Found!!!");
		else
		{
			int i;
			for(i=0;i<register.size(); i++) {
				if(Integer.toString(register.get(i).getEID()).equals(Integer.toString(did)))
				{
					register.remove(register.get(i));
					System.out.println("Record has been deleted!!!");
					break;
				}
			}
			if(i == register.size())
				System.out.println("Record Not found!!");
		}
	}
	public void find(int sid)
	{
		if(register.size() == 0)
			System.out.println("No records exists!!!\n");
		else
		{
			int i;
			for(i=0;i<register.size();i++) {
				if(Integer.toString(register.get(i).getEID()).equals(Integer.toString(sid)))
				{
					System.out.print("EID : - " + register.get(i).getEID()+"\n");
					System.out.print("Name :- " + register.get(i).getFirstName() + " " + register.get(i).getLastName()+"\n");
					System.out.print("Email :- " + register.get(i).getEmail()+"\n");
					System.out.print("Address :- " + register.get(i).getEmail()+"\n");
					System.out.print("Contact :- " + register.get(i).getNumber()+"\n");		
					break;
				}
			}
			if(i == register.size())
				System.out.println("No Records were Found!!!");
		}
	}
	public void displayAll()
	{
		if(register.size() == 0)
			System.out.println("No Records to show....\n");
		else
		{
			for(int i=0; i<register.size(); i++)
			{
				System.out.print(register.get(i).getEID() + " | ");
				System.out.print(register.get(i).getFirstName() + " | ");
				System.out.print(register.get(i).getLastName() + " | ");
				System.out.print(register.get(i).getEmail() + " | ");
				System.out.print(register.get(i).getAddress() + " | ");
				System.out.print(register.get(i).getNumber() + " | ");
				System.out.print("\n");	
			}
		}
	}

}
