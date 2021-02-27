package world.hello;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	Employee emp= new Employee();
	System.out.println("Enter the Name: ");
	emp.setName(sc.nextLine());
	System.out.println("Enter the Address: ");
	emp.setAddress(sc.nextLine());
	System.out.println("Enter the Mobile: ");
	emp.setMobile(sc.nextInt());
	
	System.out.println("Employee Details");
	System.out.println("Name: "+emp.getName());
	System.out.println("Address: "+emp.getAddress());
	System.out.println("Mobile: "+emp.getMobile());
	}
}
	

