package javaBasic;


import java.util.Arrays;
import java.util.Scanner;

public class Java_Basix_Day3_BT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initial array
		System.out.println("Nhập số phần tử của mảng: ");
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
		// print smallest value and largest value
		Arrays.sort(baseArr);
		System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(baseArr));
		int smallestValue = baseArr[0];
		int largestValue = baseArr[baseArr.length - 1];
		System.out.println("Giá trị nhỏ nhất của mảng: " + smallestValue);
		System.out.println("Giá trị lớn nhất của mảng: " + largestValue);
		sc.close();
	}

}
