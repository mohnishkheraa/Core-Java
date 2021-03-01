package world.hello;

import java.util.*;  
import java.io.*;  
class Ranking implements Comparable<Ranking>{  
int Score;  
String name;  

Ranking(int Score,String name){  
this.Score=Score;  
this.name=name;  
 
}  
public int compareTo(Ranking st){  
if(Score==st.Score)  
return 0;  
else if(Score>st.Score)  
return -1;  
else  
return 1;  
}  
}  
