package javaBasic;

import java.util.Scanner;

public class Java_Basic_Day3_BT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count < 50) {
			System.out.println("Nhập 1 số nguyên từ bàn phím: ");
			int i = sc.nextInt();
			if( i%2 == 0 && i%3 == 0) {
				System.out.println("Số " + i + " chia hết cho cả 2 và 3");
				System.out.println("Tìm kiếm kết thúc. Thoát chương trình");
				break;
			}
			count++;
			}
		if(count == 50) {
			System.out.println("Bạn đã nhập tối đa 50 lần. Thoát chương trình");
			
		}
		sc.close();	
	}
}
