package world.hello;
import java.util.*;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n%400==0)
			System.out.println("1");
		else if(n%100==0)
			System.out.println("0");
		else if(n%4==0)
			System.out.println("1");
		else
			System.out.println("0");

	}

}
