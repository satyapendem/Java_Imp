import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeInfo {
	Map<String, Object> map = new HashMap<String, Object>();
	Set<Object> employeeId = new HashSet<Object>();
	
	Employee newEmployee;
	
	String employeeNameToBeAdded, employeeEmailToBeAdded, employeeNumberToBeAdded, employeeIdToBeAdded;
	char choice;
	Scanner employeeInput = new Scanner(System.in);

	public void addEmployeeDetails() 
	{
		try 
		{
			do 
			{
				System.out.println("Enter the Employee Id:");
				employeeIdToBeAdded = employeeInput.next();
				employeeId.add(employeeIdToBeAdded);

				System.out.println("Enter the Employee Name: ");
				employeeNameToBeAdded = employeeInput.next();

				System.out.println("Enter the Employee Email:");
				employeeEmailToBeAdded = employeeInput.next();

				System.out.println("Enter the Employee Phone Number:");
				employeeNumberToBeAdded = employeeInput.next();
				
				newEmployee = new Employee(employeeNameToBeAdded,employeeEmailToBeAdded,employeeNumberToBeAdded);

				map.put(employeeIdToBeAdded, newEmployee);
				//employeeId.add(newEmployee);

				System.out.println("If you want to insert details of another employee press Y else N: ");
				choice = employeeInput.next().charAt(0);
			} while (choice == 'Y' || choice == 'y');
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public void searchEmployee() 
	{
		try 
		{
			do 
			{
				System.out.println("Enter the Employee Id to Search the Employee:");
				

				if(employeeId.contains(employeeIdToBeAdded=employeeInput.next()))
				{
					System.out.println("The details of employee with the id "+ employeeIdToBeAdded +" are:");
					System.out.println(map.get(employeeIdToBeAdded));
				}
				else
				{
					System.out.println("Id "+ employeeIdToBeAdded +" doesn't exist");
				}
				System.out.println("If you want to insert another employee id press Y else N: ");
				choice = employeeInput.next().charAt(0);
			} while (choice == 'Y' || choice == 'y');
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void removeEmployeeDetails() {
		// TODO Auto-generated method stub
		try 
		{
			do 
			{
				System.out.println("Enter the Employee Id to remove the Employee:");
				

				if(employeeId.contains(employeeIdToBeAdded=employeeInput.next()))
				{
					map.remove(employeeIdToBeAdded);
					employeeId.remove(employeeIdToBeAdded);
					System.out.println("The details of employee with the id "+ employeeIdToBeAdded +" are removed sucessfully.");
				}
				else
				{
					System.out.println("Id "+ employeeIdToBeAdded +" doesn't exist");
				}
				System.out.println("If you want to insert another employee id press Y else N: ");
				choice = employeeInput.next().charAt(0);
			} while (choice == 'Y' || choice == 'y');
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public void displayAllEmployyeDetails() {
		// TODO Auto-generated method stub
		Set<Object> employeeSet = new HashSet<Object>(map.values());
		employeeSet.addAll(map.values());
		employeeId.addAll(employeeSet);
		Iterator setIterator = employeeId.iterator();
		while(setIterator.hasNext())
		{
			System.out.println(setIterator.next());
		}
	}
}
