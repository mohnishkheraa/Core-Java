package world.hello;
import java.util.*;
public class PlayerMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("rawtypes")
		HashSet<String> hs=new HashSet<String>();  
		int n=sc.nextInt();
		String[] str = new String[10]; 
		for(int i=0; i<n;i++)
		{
			str[i] = sc.next();
		}
		for(int i=0; i<n;i++)
		{
			hs.add(str[i]);
		}
		TreeSet<String> treeSet = new TreeSet<String>(hs);
		for(Object s:treeSet)
		{
			System.out.println(s);
		}



	}

}