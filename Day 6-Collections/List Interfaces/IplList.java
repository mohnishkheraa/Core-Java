package world.hello;
import java.util.*;
public class IplList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("rawtypes")
		LinkedList ll=new LinkedList();
		a=sc.nextLine();
		ll.add(a);
		b=sc.nextLine();
		ll.add(b);
		c=sc.nextLine();
		ll.add(c);
		d=sc.nextLine();
		ll.add(d);
		e=sc.nextLine();
		ll.add(e);
		System.out.println("Enter Swap Position:");
		int n=sc.nextInt();
		Collections.swap(ll, 0 ,n);
		Iterator itr= ll.iterator();
		
		for(Object s:ll)
			System.out.println(s);


	}

}
