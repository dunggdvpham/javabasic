package javaBasic_day5_bt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> danhSach = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("Chọn 1 trong các lựa chọn:");
			
			System.out.println("1. Nhập thông tin nhân viên. \n"
					+          "2. Xem danh sách nhân viên đã nhập. \n"
					+          "3. Thoát.");
			System.out.println("--------------------------");
			int initOption = sc.nextInt();
			sc.nextLine();
			switch (initOption) {
			case 1:
				System.out.println("Bạn muốn nhập thông tin của Developer, tester hay BA?");
				String option = sc.nextLine().trim().toLowerCase();
				switch (option) {
				case "developer":
					Developer dev1 = new Developer();
					String inforDev = dev1.fillInfo();
					danhSach.add(inforDev);
					dev1.printInfo();
					break;
				case "tester" :
					Tester test1 = new Tester();
					String inforTest = test1.fillInfo();
					danhSach.add(inforTest);
					test1.printInfo();
					break;
				case "ba" :
					BusinessAnalyst ba1 = new BusinessAnalyst();
					String inforBA = ba1.fillInfo();
					danhSach.add(inforBA);
					ba1.printInfo();
					break;
				default:
					System.out.println("Không tìm thấy vai trò phù hợp, kết thúc chương trình!");
					break;
				}
				break;
			case 2:
				if(danhSach.size() == 0) {
					System.out.println("Danh sách trống. Hãy nhập nhân viên!");
					System.out.println("--------------------------");
				} else {
					System.out.println("Danh sách nhân viên đã nhập: ");
					for (String item : danhSach) {
						System.out.println(danhSach.indexOf(item) + ". " + item);
					}
					System.out.println("--------------------------");
				}
				
				break;
			case 3:
				sc.close();
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
			}
		}
	}
}

