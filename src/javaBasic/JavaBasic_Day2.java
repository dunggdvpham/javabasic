package javaBasic;


import java.util.Scanner;

public class JavaBasic_Day2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bạn muốn nhập mảng có bao nhiêu phần tử:");
		int count = sc.nextInt();
		
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			System.out.println("Nhập giá trị của phần tử thứ: " + i);
			int item = sc.nextInt();
			System.out.println("---------------------------");
			arr[i] = item;
			}
		
		int sum = calculate(arr);
		System.out.println("Tổng giá trị của mảng: " + sum);
		sc.close();	
	}
	public static int calculate(int[] arr) {
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			
		}
		return sum;
		
	}
}
