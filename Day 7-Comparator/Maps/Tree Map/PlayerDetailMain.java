package world.hello;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PlayerDetailMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
TreeMap<Integer,PlayerDetail>map = new TreeMap<Integer,PlayerDetail >();
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of players");
 int n =Integer.parseInt(reader.readLine());
 int count=1;
 for(int i=0;i<n;i++)
 { 
	 System.out.println("Enter the details of the player"+count);
	 System.out.println("Enter the Cap Number");
	  int capNumber = Integer.parseInt(reader.readLine());
	  System.out.println("Enter the Name");
	  String name = reader.readLine();
	  System.out.println("Enter the Team name");
	  String team = reader.readLine();
	  System.out.println("Enter the Skill");
	  String skills = reader.readLine();
	  PlayerDetail p = new PlayerDetail();
	  p.setName(name);
	  p.setTeam(team);
	  p.setSkills(skills);
	  
	  map.put(capNumber, p);
	  count++;
	  
 }
 
 
 System.out.println("Player Details");
 Set<Map.Entry<Integer, PlayerDetail>> entries = map.entrySet();
 for(Map.Entry<Integer, PlayerDetail> entry : entries){
	    System.out.println( entry.getKey() + "--" + entry.getValue() );
	}
	}

}