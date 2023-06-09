package Assignment01;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class Number01IsNumberPrime {

	public static void main(String[] args) {
		// Write a program in Java to check given number is prime or not

	}





	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number);
		
		for(int i = 2; i <= sqrt; i++) {
			if (number%i == 0) {
				System.out.println(number + " is not a prime number");
				return false;
				
				
			
			}
			
			
			
			
		}
		
		System.out.println(number + " is a prime number");
		return true;
		
		
	}
	
	  @Test
	    void testIsPrime() {
	        assertAll(
	                () -> assertTrue(Number01IsNumberPrime.isPrime(2), "2 is a prime number, expected output is true"),
	                () -> assertTrue(Number01IsNumberPrime.isPrime(3), "3 is a prime number, expected output is true"),
	                () -> assertFalse(Number01IsNumberPrime.isPrime(4), "4 is not a prime number, expected output is false"),
	                () -> assertTrue(Number01IsNumberPrime.isPrime(5), "5 is a prime number, expected output is true"),
	                () -> assertFalse(Number01IsNumberPrime.isPrime(16), "16 is not a prime number, expected output is false"),
	                () -> assertTrue(Number01IsNumberPrime.isPrime(17), "17 is a prime number, expected output is true"),
	                () -> assertFalse(Number01IsNumberPrime.isPrime(18), "18 is not a prime number, expected output is false"),
	                () -> assertFalse(Number01IsNumberPrime.isPrime(25), "25 is not a prime number, expected output is false"),
	                () -> assertTrue(Number01IsNumberPrime.isPrime(29), "29 is a prime number, expected output is true"),
	                () -> assertFalse(Number01IsNumberPrime.isPrime(100), "100 is not a prime number, expected output is false")
	        );
	    }




}







