package world.hello;
import java.util.*;
public class String1 {

		static void Stringin(String firstname, String lastname) {
			  String firstLetter = firstname.substring(0, 1);
			    String remainingLetters = firstname.substring(1, firstname.length());

			    firstLetter = firstLetter.toUpperCase();
			    remainingLetters=remainingLetters.toLowerCase();
			   lastname=lastname.toUpperCase();
			    firstname = firstLetter + remainingLetters;
			    System.out.println( firstname+" " +lastname);
		}
		public static void main(String[] args) {
			Scanner in =new Scanner(System.in);
			  String firstname,lastname;
			  firstname=in.next();
			  lastname=in.next();
			    
			  Stringin(firstname,lastname);

		}

	}

