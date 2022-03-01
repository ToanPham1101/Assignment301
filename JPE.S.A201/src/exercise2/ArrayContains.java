/*Fresher training 2022
*Author ToanPDT
*Date Mar 1, 2022
*Study assignment
*/
package exercise2;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayContains {
	public static void check(String[] a, int b, String c) {
		boolean found = Arrays.stream(a).anyMatch(t -> t.equals(c));

		if(found) {
			System.out.println("Check " + "'" + c + "'" + " in Array: Contained!");
		}
		else {
			System.out.println("Check " + "'" + c + "'" + " in Array: NO Contain!");
		}
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("length= ");
	    int n = sc.nextInt();
		String[] stringArray = new String[n];
		for(int i = 0; i < n; i++) {
			System.out.println("element= ");
			stringArray[i] =sc.next();
		}
		System.out.println("sValue= ");
		String toFind = sc.next();
		sc.close();
		check(stringArray, n, toFind);
		
	}
}
