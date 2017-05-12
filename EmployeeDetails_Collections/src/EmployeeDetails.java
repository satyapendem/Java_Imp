import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo employee=new EmployeeInfo();
		int choice = 0;
		Scanner employeeInput = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the choice to enter details of Employee:\n1.Add Employee Details\n2.Search for an Employee\n3.Display all Employee Details\n4.Remove employee Details using Id\n5.Exit");
			choice=employeeInput.nextInt();
			switch (choice) 
			{
				case 1:
					employee.addEmployeeDetails();
					break;
				case 2:
					employee.searchEmployee();
					break;
				case 3:
					employee.displayAllEmployyeDetails();
					break;
				case 4:
					employee.removeEmployeeDetails();
					break;
				case 5:
					System.out.println("Successfully Exited");
					System.exit(0);
					break;
				default:
					break;
			}
		}
	}

}
