package world.hello;
import java.util.*;
public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Customer cr =new Customer();
		System.out.println("Enter the details: ");
	    cr.setName(sc.nextLine());
	    
	    String[] str= cr.getName().split(",");
	    System.out.println("Name: "+str[0]);
	    System.out.println("Address: "+str[1]);
	    System.out.println("Mobile: "+str[2]);

	}

}
