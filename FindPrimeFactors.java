package Assignment01;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindPrimeFactors {
	
ArrayList<Integer> factors;	


public static ArrayList<Integer> findPrimeFactors(int number_param){
//	Integer number = number_param;
	int sqrt = (int) Math.sqrt(number_param);
	sqrt++;
	ArrayList<Integer> factorList = new ArrayList<Integer>();
	for(int i = 2; i<= sqrt; i++) {
		if(number_param%i==0) {
			factorList.add(i);
			number_param = number_param/i;
			i--;
			
		}
		
		
	}
	
	if(factorList.size() == 0) {
		System.out.println(number_param + " is prime");
		return factorList;
		
	}
	
	else {
		System.out.println(number_param + " has " + factorList.size() + " factors");
		return factorList;
	}
	
	
}

@Test
void testFindPrimeFactors() {
    assertAll(
        () -> {
            ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 3));
            assertEquals(expectedOutput, FindPrimeFactors.findPrimeFactors(6), "The factors of 6 are 2 and 3");
        },
        () -> {
            ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 2, 5));
            assertEquals(expectedOutput, FindPrimeFactors.findPrimeFactors(20), "The factors of 20 are 2, 4, and 5");
        },
        () -> {
            ArrayList<Integer> expectedOutput = new ArrayList<>();
            assertEquals(expectedOutput, FindPrimeFactors.findPrimeFactors(13), "13 is a prime number and has no factors");
        },
        () -> {
            ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2,2));
            assertEquals(expectedOutput, FindPrimeFactors.findPrimeFactors(4), "The factors of 4 is 2");
        },
        () -> {
            ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 2, 3, 3));
            assertEquals(expectedOutput, FindPrimeFactors.findPrimeFactors(36), "The factors of 36 are 2, 3, and 6");
        }
    );
}
	
	
}
