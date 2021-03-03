package ltts.thread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String match[]=new String[3];
	String score[]=new String[3];
	int i;
	CalculateScore[] ss=new CalculateScore[5];
	for(i=0;i<3;i++)
	{
		System.out.println("Enter the match : ");
		match[i]=br.readLine();
		System.out.println("Enter the Score :  ");
		score[i]=br.readLine();
		ss[i]=new CalculateScore(match[i],score[i]);
	}
	System.out.println("Score Summary :  ");
	for(i=0;i<3;i++) {
		ss[i].start();
		try
		{
			ss[i].join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		ss[i].getScores();
	}
}
}