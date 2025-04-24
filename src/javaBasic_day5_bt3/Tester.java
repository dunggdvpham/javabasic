package javaBasic_day5_bt3;

import java.util.Scanner;

public class Tester extends Employee{
	private String testRole;
	private String extentSkill;
	@Override
	public String fillInfo() {
		// TODO Auto-generated method stub
		String infor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên của tester: ");
		super.name = sc.nextLine();
		System.out.println("Nhập tuổi của tester: ");
		super.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập ví trí của tester (manual or automation): ");
		testRole = sc.nextLine();
		System.out.println("Nhập kĩ năng bổ trợ của tester (SQL, API,...): ");
		extentSkill = sc.nextLine();
		System.out.println("Nhập số năm kinh nghiệm của tester: ");
		super.expYear = sc.nextDouble();
		sc.nextLine();
		return infor = "Tester: " + super.name + " đang làm: " + testRole + ", có thêm kĩ năng: " + extentSkill + ", số năm kinh nghiệm: " + super.expYear;
	}
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Tester: " + super.name + " đang làm: " + testRole + ", có thêm kĩ năng: " + extentSkill + ", số năm kinh nghiệm: " + super.expYear);
		System.out.println("--------------------------");
	}
	
	
}
