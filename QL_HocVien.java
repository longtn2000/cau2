package cau2;
import java.util.ArrayList;
import java.util.Scanner;
public class QL_HocVien {
	private ArrayList<HocVien> hv = new ArrayList<>();
	public void nhapDS() {
		Scanner input = new Scanner(System.in);
		int n = 0;
		System.out.print("Nhập số lượng học viên: ");
		do {
			n = input.nextInt();
			if(n < 1) System.out.print("Vui lòng nhập số lượng học viên hợp lệ: ");
		}
		while(n < 1);
		for(int i = 0; i < n; i++) {
			System.out.println("\nHỌC VIÊN " + (i+1));
			HocVien h = new HocVien();
			h.nhap();
			hv.add(h);
		}
	}
	public void sapXep() {
		for(int i = 0; i < hv.size() - 1; i++) {
			for(int j = i + 1; j < hv.size(); j++) {
				if(hv.get(i).getDiem() < hv.get(j).getDiem()) {
					HocVien temp = hv.get(i);
					hv.set(i, hv.get(j));
					hv.set(j, temp);
				}
			}
		}
	}
	public void xuatDS() {
		sapXep();
		System.out.println("\n -- HIỂN THỊ DANH SÁCH HỌC VIÊN GIẢM DẦN THEO ĐIỂM -- ");
		for(int i = 0; i < hv.size(); i++) {
			System.out.println("\nHỌC VIÊN " + (i+1));
			hv.get(i).xuat();
		}
	}
}
