package world.hello;
import java.util.*;
public class SetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("rawtypes")
		HashSet<String> set=new HashSet<String>();  
		int n=sc.nextInt();
		String[] str = new String[10]; 
		for(int i=0; i<n;i++)
		{
			str[i] = sc.next();
		}
		for(int i=0; i<n;i++)
		{
			set.add(str[i]);
		}
		
		System.out.println(set.size());

	}

}
