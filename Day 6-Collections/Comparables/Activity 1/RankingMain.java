package world.hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.Comparable;
public class RankingMain {

	
	
	public static void main(String args[]){  
		ArrayList<Ranking> al=new ArrayList<Ranking>();  
		Scanner in =new Scanner(System.in);
		int number;
		int Score,count=0;
		String name;
		System.out.println("Enter number of players");
	number=in.nextInt();


	
	for(int i=0;i<number;i++) {
		Scanner in1 =new Scanner(System.in);
		System.out.println("Enter the name of Player "+(i+1));
		name=in1.nextLine();
		System.out.println("Enter the score of Player "+(i+1));
		Score=in1.nextInt();
		al.add(new Ranking(Score,name)); 
	}
		 
		
		Collections.sort( al);  
		for(Ranking st:al){  
			count++;
		System.out.println(count+" "+st.Score+" "+st.name+" ");  
		
		}  
}

}