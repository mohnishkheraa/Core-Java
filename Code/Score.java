package world.hello;
import java.util.*;
public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,x,count=0;
		n=sc.nextInt();
		int[] arr = new int[20];
		int[] res = new int[20];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		x= sc.nextInt();
		for(int i=1;i<n;i=i+2)
		{
			if(x<arr[i])
			{
				res[count]=arr[i-1];
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(res[i]);
		}
	}

}
