public class Employee 
{

	private String employeeName;
	private String employeeEmail;
	private String employeeNumber;
	public Employee(String employeeNameToBeAdded, String employeeEmailToBeAdded, String employeeNumberToBeAdded) {
		// TODO Auto-generated constructor stub
		employeeName=employeeNameToBeAdded;
		employeeEmail=employeeEmailToBeAdded;
		employeeNumber=employeeNumberToBeAdded;	
	}
	public String toString()
	{
		return "Employee_Name= " + employeeName + "\nEmployee_Email= " + employeeEmail + "\nEmployee_Number= " + employeeNumber +"";
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public String getEmployeeEmail()
	{
		return employeeEmail;
	}
	public String getEmployeeNumber()
	{
		return employeeNumber;
	}
	public void setEmployeeName(String setEmployeeName)
	{
		employeeName = setEmployeeName;
	}
	public void setEmployeeEmail(String setEmployeeEmail)
	{
		employeeEmail = setEmployeeEmail;

	}
	public void setEmployeeNumber(String setEmployeeNumber)
	{
		employeeNumber = setEmployeeNumber;
	}

}
