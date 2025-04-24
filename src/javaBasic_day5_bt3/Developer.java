package javaBasic_day5_bt3;

import java.util.Scanner;

public class Developer extends Employee{
	private String language;
	private String codeRole;
	public String infor;
	@Override
	public String fillInfo() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên của Dev");
		super.name = sc.nextLine();
		System.out.println("Nhập vào tuổi của Dev");
		super.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập vào ngôn ngữ của Dev");
		language = sc.nextLine();
		System.out.println("Nhập vào vị trí (Front-End hay Back-End) của Dev");
		codeRole = sc.nextLine();
		System.out.println("Nhập vào số năm kinh nghiệm của Dev");
		super.expYear = sc.nextDouble();
		sc.nextLine();
		return infor = "Developer: " + super.name + ", tuổi: " + super.age+ ", sử dụng ngôn ngữ: " + language + " cho thiết kế: " + codeRole + ", có số năm kinh nghiệm: " +super.expYear;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Developer: " + super.name + ", tuổi: " + super.age+ ", sử dụng ngôn ngữ: " + language + " cho thiết kế: " + codeRole + ", có số năm kinh nghiệm: " +super.expYear);
		System.out.println("--------------------------");
	}

}
