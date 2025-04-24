package javaBasic_day5_bt3;

import java.util.Scanner;

public class BusinessAnalyst extends Employee{
	private String flowDrawTool;
	private String softSkill;
	@Override
	public String fillInfo() {
		// TODO Auto-generated method stub
		String infor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên của BA: ");
		super.name = sc.nextLine();
		System.out.println("Nhập tuổi của BA: ");
		super.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập công cụ vẽ flow(draw, figma,...) ");
		flowDrawTool = sc.nextLine();
		System.out.println("Nhập kĩ năng mềm của BA: ");
		softSkill = sc.nextLine();
		System.out.println("Nhập số năm kinh nghiệm của BA: ");
		super.expYear = sc.nextDouble();
		sc.nextLine();
		return infor = "BA: " + super.name + " sử dụng công cụ " + flowDrawTool + " để vẽ flow, kĩ năng mềm: " + softSkill + ", số năm kinh nghiệm: " + super.expYear;
		
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("BA: " + super.name + " sử dụng công cụ " + flowDrawTool + " để vẽ flow, kĩ năng mềm: " + softSkill + ", số năm kinh nghiệm: " + super.expYear);
		System.out.println("--------------------------");
	}
}
