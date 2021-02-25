package world.hello;
import java.util.*;
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		  String firstname,lastname,firstname1, lastname1;
		  firstname=sc.next();
		  lastname=sc.next();
		  firstname1=sc.next();
		  lastname1=sc.next();
		  
		  if(lastname.equalsIgnoreCase(lastname1))
		  {
			  System.out.println("Yes");
		  }
		  else
			  System.out.println("No");
	}

}
