package Assignment01;
import java.util.ArrayList;
//Write a method in Java which will remove any given character from
// a String.
public class StringDeleteChar {






public static String deleteChar(String s, char a) {
	StringBuilder array = new StringBuilder(s);
	char[] char_array = s.toCharArray();
	ArrayList<Integer> indexes = new ArrayList<Integer>();
	for(int i = 0; i<s.length(); i++) {
		if (char_array[i] == a) {
			indexes.add(i);
			
		}
		
		
		
	}
	for(Integer i : indexes) {
		array.deleteCharAt(i);
		
	}
	
	return array.toString();
}

}
