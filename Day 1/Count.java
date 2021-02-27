package world.hello;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n,count=0;
		n=sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
			System.out.println("Invalid Input");
		int[] arr = new int[20];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x= sc.nextInt();
		if(x<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
			
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
				break;
			}
			if(x==arr[i])
				count++;
		}
		System.out.println(count);
		sc.close();
	}

}
