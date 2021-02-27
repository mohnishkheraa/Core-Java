package world.hello;
import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(c==1)
			System.out.println(a+b);
		else if(c==2)
			System.out.println(a-b);
		else if(c==3)
			System.out.println(a*b);
		else if(c==4)
			System.out.println(a/b);
		else
			System.out.println("-1");
	}

}
