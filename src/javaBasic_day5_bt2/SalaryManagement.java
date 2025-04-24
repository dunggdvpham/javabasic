package javaBasic_day5_bt2;

public class SalaryManagement {
	private static double luongCoBan = 10000000;
	public static void main(String[] args) {
		System.out.println("Tính theo công thức 1: " + tinhLuong(luongCoBan, 0.5));
		System.out.println("-----------------------");
		System.out.println("Tính theo công thức 2: " + tinhLuong(luongCoBan, 0.5, 1.5));
		System.out.println("-----------------------");
		System.out.println("Tính theo công thức 3 (chuyên khoa): " + tinhLuong(luongCoBan, 0.5, 4, "Chuyên khoa"));
		System.out.println("-----------------------");
		System.out.println("Tính theo công thức 3 (đa khoa): " + tinhLuong(luongCoBan, 0.5 , 4, "Đa khoa"));
		System.out.println("-----------------------");
		System.out.println("Tính theo công thức 3 (thực tập): " + tinhLuong(luongCoBan, 0.5 , 4, "Thực tập"));
	}
	
	
	public static double tinhLuong(double luongCoBan, double heSoLuong) {
		return luongCoBan * heSoLuong;
	}
	public static double tinhLuong(double luongCoBan, double heSoLuong, double soNamKinhNghiem) {
		return luongCoBan * heSoLuong * soNamKinhNghiem;
	}
	public static double tinhLuong(double luongCoBan, double heSoLuong, double soNamKinNghiem, String loai) {
		switch (loai.trim().toLowerCase()){
		case "chuyên khoa": 
			return luongCoBan * heSoLuong * soNamKinNghiem * 0.2;
		case "đa khoa" : 
			return luongCoBan * heSoLuong * soNamKinNghiem * 0.45;
		default:
			System.out.println("Theo công thức 3, không tìm thấy loại " + loai + " phù hợp, mặc định trả về mức lương đa khoa.");
			return luongCoBan * heSoLuong * soNamKinNghiem * 0.45;
			
		}
	}
}
