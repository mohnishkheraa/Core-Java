package world.hello;
import java.util.*;
public class CricList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	     String name;
		 int age;
		 String country,skill;
		 @SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		 System.out.println("Enter Player Details");
		 System.out.println("Enter Player Name");
		 name=sc.next();
		 al.add(name);
		 System.out.println("Enter Player Age");
		 age=sc.nextInt();
		 al.add(age);
		 System.out.println("Enter Player Country");
		 country=sc.next();
		 al.add(country);
		 
		 @SuppressWarnings("rawtypes")
		Iterator itr=al.iterator();  
		 System.out.println("Player Details");
		 while(itr.hasNext()){  
		 System.out.println(itr.next());  
		 }  
	

		 System.out.println("Enter Skill");
		 skill=sc.next();

		 System.out.println("Enter the position to add the skill");
		 int n= sc.nextInt();
		 al.set(n, skill);
		 for(Object s:al) {
			 System.out.println(s);
		 }
		 System.out.println("Enter the position of the detail to be removed");
		 int k=sc.nextInt();
		 al.remove(k);
		 for(Object s:al) {
			 System.out.println(s);
		 }

	}

	}

