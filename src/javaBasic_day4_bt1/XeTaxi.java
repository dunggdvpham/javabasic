package javaBasic_day4_bt1;

public class XeTaxi {
	public static void main(String[] args) {
		Xe xeTaxi1 = new Xe();
		xeTaxi1.setTenXe("VinFast VF3");
		xeTaxi1.setLoaiXe("Cedan");
		xeTaxi1.setVanTocMax(250);
		System.out.println("Ten xe: " + xeTaxi1.getTenXe() + ", Loai xe: " + xeTaxi1.getLoaiXe() + ", Van toc max: " + xeTaxi1.getVanTocMax() + " km/h.") ;
	}
}
