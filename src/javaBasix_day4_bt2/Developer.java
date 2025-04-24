package javaBasix_day4_bt2;

public class Developer {
	public static void main(String[] args) {
		Employee dev1 = new Employee();
		dev1.setId("001");
		dev1.setName("Jimmy");
		System.out.println("Id: " + dev1.getId() + ", Ten: " + dev1.getName() + ", Salary: " + dev1.getSalary() + " VND.");
	}
	
	/** Nhận xét giá trị của salary:
	 * Nếu không tạo phương thức set cho Salary thì khi khởi tạo đối tượng tại developer sẽ không thể gán giá trị mới cho salary.
	 * Giá trị của salary luôn giữ nguyên giá trị mặc định đã khai báo ở lớp Employee.
	 * Nếu không gán giá trị ban đầu cho salary ở Employee, thì giá trị salary sẽ lấy mặc định theo kiểu dữ liệu: String sẽ là null, double/float: 0.0, int: 0.
	 */
	
}
