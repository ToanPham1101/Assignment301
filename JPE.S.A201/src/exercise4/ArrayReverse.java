/*Fresher training 2022
*Author ToanPDT
*Date Mar 1, 2022
*Study assignment
*/
package exercise4;

public class ArrayReverse {
	public static void reverse(int a[]) {
		System.out.print("\nRevered Array: ");
		for(int i = a.length - 1; i > 0; i--){
			System.out.print(a[i] + ", ");
		}
		System.out.print(a[0]);
	}
	public static void main(String[] args) {
		int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
		System.out.print("Original Array: ");
		for(int i = 0; i < myIntArray.length - 1; i++) {
			System.out.print(myIntArray[i] + ", ");
		}
		System.out.print(myIntArray[myIntArray.length - 1]);
		reverse(myIntArray);
	}
}
