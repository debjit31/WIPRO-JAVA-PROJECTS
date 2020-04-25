public class Employee {
	private int empNo, basic, hra, it;
	private String empName, joinDate, designCode, department;
	public Employee(int empNo, String empName, String joinDate, String designCode, String department, int basic, int hra, int it)
	{
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.designCode = designCode;
		this.department = department;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
	String getEmpName() {
		return this.empName;
	}
	String getJoindate() {
		return this.joinDate;
	}
	String getdesignCode() {
		return this.designCode;
	}
	String getDepartment() {
		return this.department;
	}
	int getEmpNo() {
		return this.empNo;
	}
	int getBasic() {
		return this.basic;
	}
	int getHra() {
		return this.hra;
	}
	int getIt() {
		return this.it;
	}
}
