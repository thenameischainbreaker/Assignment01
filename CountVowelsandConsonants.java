package Assignment01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Java program to count Occurence of Vowels & Consonants in a String
public class CountVowelsandConsonants {
	
	public static int count(String s) {
		
		String string_regex = "[a-zA-Z0-9]";
		
		Pattern pattern = Pattern.compile(string_regex);
		
		Matcher matcher = pattern.matcher(s);
		
		int count = 0;
		while(matcher.find()==true) {
			count++;
		}
		return count;
		
		
		
		
	}
	
	@Test
    public void testCountVowelsAndConsonants() {
        String input = "Hello World";
        int expectedVowels = 10;
     

        int actual= CountVowelsandConsonants.count(input);
    

        Assertions.assertAll("Counts",
                () -> Assertions.assertEquals(expectedVowels, actual)
               
        );
    }
	
	
	

}
