package ltts.thread;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Scores extends Thread  {
	int start;
	int end;
	public Scores(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	int arr1[]= new int[50];
	int [] arr2=new int[50];
	int counte=0;
	int counto=0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start;i<end;i++)
		{
			if(i%2==0)
			{
				arr1[counte]=i;
				counte++;
			}
			else
			{
				arr2[counto]=i;
				counto++;
			}
				
		}
		
	}
	
	public void display()
	{
		System.out.println("Odd scores in given range");
		for(int i=0;i<counte;i++)
		{
			System.out.println(arr1[i]+ " ");
		}
		System.out.println("Odd scores in given range");
		for(int i=0;i<counto;i++)
		{
			System.out.println(arr2[i]+ " ");

		}
	}

}
