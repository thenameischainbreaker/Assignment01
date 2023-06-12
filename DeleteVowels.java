package Assignment01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteVowels {


	
	public static String deleteVowels(String s) {
		
		StringBuilder string = new StringBuilder(s);
	
		String string_vowel = "[aeiou]";
		
		Pattern vowel_regex = Pattern.compile(string_vowel);
		
		Matcher matcher = vowel_regex.matcher(s);
		int vowel_index;
		while(matcher.find() == true) {
			 vowel_index = matcher.start();
			string.deleteCharAt(vowel_index);
			matcher = vowel_regex.matcher(string);
		}
		
		String no_vowel_string = string.toString();
		return no_vowel_string;
		
	}

	
	@Test
    void testDeleteVowels() {
        assertAll("Test cases for DeleteVowels.deleteVowels()",
            () -> assertEquals("Hll Wrld!", DeleteVowels.deleteVowels("Hello World!")),
            () -> assertEquals("Jv", DeleteVowels.deleteVowels("Java")),
            () -> assertEquals("Smpl txt", DeleteVowels.deleteVowels("Sample text")),
            () -> assertEquals("qrst", DeleteVowels.deleteVowels("aieouqrst")),
            () -> assertEquals("", DeleteVowels.deleteVowels("aeiou")),
            () -> assertEquals("", DeleteVowels.deleteVowels(""))
        );
    }
	
}

