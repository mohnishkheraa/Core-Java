package ltts.thread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ScoresMain {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int start,end;
		
		System.out.println("Enter range of scores");
		start=Integer.parseInt(br.readLine());
		end = Integer.parseInt(br.readLine());
		
		Scores ss = new Scores(start,end);
		ss.start();
		try
		{
			ss.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		ss.display();
}
}