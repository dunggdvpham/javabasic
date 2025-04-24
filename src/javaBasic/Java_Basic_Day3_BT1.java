package javaBasic;


import java.util.Arrays;
import java.util.Scanner;

public class Java_Basic_Day3_BT1 {
	public static void main(String[] args) {
		// Bài 1: Sắp xếp mảng tăng dần, giảm dần
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào số phần tử của mảng ");
		int count = sc.nextInt();
		int[] baseArr = new int[count];
		
		for (int i = 0; i < baseArr.length; i++) {
			System.out.println("Nhập phần tử thứ " + i);
			System.out.println("---------------------");
			int value = sc.nextInt();
			baseArr[i] = value;
		}
		System.out.println("Kết quả: ");
		System.out.println("Mảng gốc: " + Arrays.toString(baseArr));
		System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(sapXepMang_ASC(baseArr)));
		System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(sapXepMang_DESC(baseArr)));
		sc.close();
	}
	public static int[] sapXepMang_ASC(int[] arr) {
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		return arr;
	}
	public static int[] sapXepMang_DESC(int[] arr) {
		for (int i = 0; i < arr.length -1; i++) 
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		return arr;
	}
}
