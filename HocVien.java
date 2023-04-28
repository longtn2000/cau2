package cau2;
import java.util.Scanner;
public class HocVien {
	private String maSo, hoTen, gioiTinh;
	private double diem;
	
	public HocVien() {}
	public HocVien(String maSo, String hoTen, String gioiTinh, double diem) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.diem = diem;
	}
	public double getDiem() {
		return diem;
	}
	public void nhap() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập mã số: ");
		maSo = input.nextLine();
		System.out.print("Nhập họ tên: ");
		hoTen = input.nextLine();
		System.out.print("Nhập giới tính: ");
		gioiTinh = input.nextLine();
		System.out.print("Nhập điểm: ");
		diem = input.nextDouble();
		input.nextLine();
	}
	public void xuat() {
		System.out.println("Mã số: " + maSo);
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Giới tính: " + gioiTinh);
		System.out.println("Điểm: " + diem);
	}
}
