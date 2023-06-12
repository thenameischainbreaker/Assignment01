package Assignment01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsDigit {

	public static void main(String[] args) {
		
		char input1 = 'a';
		char input2 = '3';
		char input3 = '0';
		char input4 = 'z';
		System.out.println(IsDigit.isDigit(input1));
		System.out.println(IsDigit.isDigit(input2));
		System.out.println(IsDigit.isDigit(input3));
		System.out.println(IsDigit.isDigit(input4));
		
		
	}
	
	
	public static boolean isDigit(char char_digit) {
		String digit_string = ((Character)char_digit).toString();
		
		String pattern_string = "[0-9]";
		//compile pattern
		Pattern digit_regex = Pattern.compile(pattern_string);
		
		Matcher matcher = digit_regex.matcher(digit_string);
		
		if(matcher.find() == true) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
		
		
		
	}
	
	
}
