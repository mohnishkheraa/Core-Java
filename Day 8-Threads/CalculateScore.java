package ltts.thread;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CalculateScore extends Thread {
	String matchType;
	String scoreString;
	int scores;
	double meanScore=0;
	int minScore;
	int maxScore;
	
	public CalculateScore(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}

	List<Integer> l=new ArrayList<Integer>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] s= scoreString.split(",");
		for(int i=0;i<s.length;i++)
		{
			Integer in= Integer.parseInt(s[i]);
			l.add(in);
			if(in<minScore)
				minScore=in;
			
			else if(in>maxScore)
			{
				maxScore=in;
			}
				meanScore=meanScore+in;
			
		}
		meanScore=meanScore/s.length;
		Collections.sort(l);
	}

	public void getScores() {
		
		System.out.println("Match : "+matchType);
		System.out.println("min "+minScore);
		System.out.println("max "+maxScore);
		System.out.println("mean "+meanScore);
	}

	}
	
	
