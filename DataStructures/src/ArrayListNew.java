import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String employeeName,employeeId;
		char ch;
		Scanner input = new Scanner(System.in);
		ArrayList<String> employee=new ArrayList<String>();
		do
		{
			System.out.println("Enter the employee Id:");
			if(employee.contains(employeeId=input.next()))
			{
				System.out.println(employeeId + " Already exists");
				System.out.println("\"\"");
			}
			else
			{
				System.out.println("Enter the name of employee:");
				employee.add(employeeId);	
				employee.add(employeeName=input.next());
			}
			System.out.println("If you want to insert another element press Y else N: ");
			ch=input.next().charAt(0);
		}while(ch=='Y' || ch=='y');
		System.out.println("Elements in the list are:");
		for(int i=0;i<employee.size();i++)
		{
			System.out.println(employee.get(i));
		}
	}
}
