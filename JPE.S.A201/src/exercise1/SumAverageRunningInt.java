/*Fresher training 2022
*Author ToanPDT
*Date Mar 1, 2022
*Study assignment
*/
package exercise1;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		//define variables
		int lowerbround = 1;
		int upperbround = 100;
		int average;
		int sum = 0;
		for(int i = lowerbround; i <= upperbround; i++) {
			sum += i;
		}
		/*Trong đề bài em không thấy expected Output có xuất ra sum
		 *Nên em chỉ xuất giá trị average như trong đề*/
		average = (lowerbround + upperbround) / 2;
		System.out.println("Average of all 100 first numbers: " + average);
	}

}
