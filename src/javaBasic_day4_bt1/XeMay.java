package javaBasic_day4_bt1;

public class XeMay {
	public static void main(String[] args) {
		Xe xeMay1 = new Xe();
		xeMay1.setTenXe("SH mode");
		xeMay1.setLoaiXe("under 150cc");
		xeMay1.setVanTocMax(130);
		System.out.println("Ten xe: " + xeMay1.getTenXe() + ", Loai xe: " + xeMay1.getLoaiXe() + ", Van toc max: " + xeMay1.getVanTocMax() + " km/h.") ;
	}
}
