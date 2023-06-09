package Assignment01;
import java.util.regex.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelorConsonant {






public static String isVowelOrConsonant(char a)
{
	String character = ((Character) a).toString();
	String pattern_vowel = "[aeiou]";
	String pattern_consonant = "[bcdfghjklmnpqrstvwxyz]";
	
	Pattern regex_vowel = Pattern.compile(pattern_vowel);
	Pattern regex_consonant = Pattern.compile(pattern_consonant);
	
	Matcher matcher_vowel = regex_vowel.matcher(character);
	Matcher matcher_consonant = regex_consonant.matcher(character);
	
	if (matcher_vowel.find() == true)
		return "vowel";
	else if (matcher_consonant.find() == true)
		return "consonant";
		else
			return "neither";
	
	
}

@Test
public void testIsVowelOrConsonant() {
    char vowel = 'a';
    char consonant = 'b';
    char neither = '1';

    Assertions.assertAll(
        () -> Assertions.assertEquals("vowel", VowelorConsonant.isVowelOrConsonant(vowel)),
        () -> Assertions.assertEquals("consonant", VowelorConsonant.isVowelOrConsonant(consonant)),
        () -> Assertions.assertEquals("neither", VowelorConsonant.isVowelOrConsonant(neither))
    );
}

}
