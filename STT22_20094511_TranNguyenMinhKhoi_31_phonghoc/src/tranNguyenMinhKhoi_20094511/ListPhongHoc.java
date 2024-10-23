package tranNguyenMinhKhoi_20094511;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
	List<PhongHoc> ls;
	public ListPhongHoc() {
		ls = new ArrayList<PhongHoc>(2);
	}
	//them phong
	public boolean themPhong(PhongHoc p) {
		if (ls.contains(p)) {
			return false;
		}else {
			return true;
		}
	}
	
	public int soPhongHoc() {
		return ls.size();
	}
	
	//xoa phong
	public boolean xoaPhong(String maXoa) {
		for (PhongHoc ph : ls)
			if (ph.getMaPhong().equalsIgnoreCase(maXoa)) {
				ls.remove(ph);
				return true;
			}
		return false;
	}
	
	//xuat toan bo danh sach phong
	public List<PhongHoc> xuatDSP() {
		return ls;
	}
	
	//xuat danh sach phong hoc at chuan
	public List<PhongHoc> xuatDSPChuan(){
		
	}
}
