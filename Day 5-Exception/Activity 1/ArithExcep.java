package world.hello;
import java.util.*;

public class ArithExcep {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		float cur_runrate;
		try
		{
		System.out.println("Enter the total runs scored ");
		String sr=sc.next();
	    int scoredruns= Integer.parseInt(sr);
	    System.out.println("Enter the total overs faced: ");
		int facedovers= sc.nextInt();
		
		
			
			cur_runrate= scoredruns/facedovers;
			System.out.println("Current runrate: "+cur_runrate);
			
		}
		catch(ArithmeticException e) {
			
			System.out.println(" "+e);
		}
		
		catch(NumberFormatException e) {
			
			System.out.println(" "+e);
		}
	}	
}