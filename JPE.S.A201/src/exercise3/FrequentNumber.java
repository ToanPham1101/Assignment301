/*Fresher training 2022
*Author ToanPDT
*Date Mar 2, 2022
*Study assignment
*/
package exercise3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FrequentNumber {
	public static void finalAnswer(int a[], int value) {
		int count = 0;
		//Khởi tạo Linkedlist cấu trúc queue
		Queue<Integer> b = new LinkedList<Integer>();
		for(int i = 0; i < a.length; i++) {
			if(a[i] == value) {
				b.add(i); //nếu trong mảng có giá trị cần tìm thì thêm giá trị vào list
				count++;
			}
		}System.out.println("Amount of frequence: " + count);
		System.out.print("Index: ");
		for(int i = 0; i < a.length; i++) {
			if(!b.isEmpty()) {
				System.out.print(b.poll() + " ");
			}
		}
	}

	public static void main(String[] args) {
		//khởi tạo Scanner
		Scanner sc = new Scanner(System.in);
		//Nhập độ dài mảng
		System.out.print("Enter length= ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		/*nhập elements
		 * mỗi lần nhập sẽ đưa câu hỏi để tiếp tục*/
		int i = 0;
		do {
			System.out.println("Enter element: ");
			arr[i] = sc.nextInt();
			i++;
			if(i < len) {
				System.out.println("Do you want to continue?");
				String a = sc.next();
				if(a.equals("N") || a.equals("n")) {
					break;
				}
			}
		}while(i < len);
		
		//nhập giá trị cần tìm trong mảng
		System.out.println("Enter value= ");
		int value = sc.nextInt();
		sc.close();
		finalAnswer(arr, value);

	}

}


