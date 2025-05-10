package new_1;

import java.util.*;

public class DanhSachPhongHoc {
    private List<PhongHoc> danhSach;

    public DanhSachPhongHoc() {
        danhSach = new ArrayList<>();
    }

    public boolean them(PhongHoc p) {
        for (PhongHoc ph : danhSach) {
            if (ph.getMaPhong().equalsIgnoreCase(p.getMaPhong()))
                return false;
        }
        danhSach.add(p);
        return true;
    }

    public PhongHoc timKiem(String maPhong) {
        for (PhongHoc p : danhSach) {
            if (p.getMaPhong().equalsIgnoreCase(maPhong))
                return p;
        }
        return null;
    }

    public List<PhongHoc> getDanhSachDatChuan() {
        List<PhongHoc> result = new ArrayList<>();
        for (PhongHoc p : danhSach) {
            if (p.datChuan())
                result.add(p);
        }
        return result;
    }

    public void sapXepTheoDayNha() {
        danhSach.sort(Comparator.comparing(PhongHoc::getDayNha));
    }

    public void sapXepTheoDienTichGiamDan() {
        danhSach.sort((a, b) -> Double.compare(b.getDienTich(), a.getDienTich()));
    }

    public void sapXepTheoSoBongDenTangDan() {
        danhSach.sort(Comparator.comparingInt(PhongHoc::getSoBongDen));
    }

    public boolean capNhatSoMayTinh(String maPhong, int soMayMoi) {
        for (PhongHoc p : danhSach) {
            if (p instanceof PhongMayTinh && p.getMaPhong().equalsIgnoreCase(maPhong)) {
                ((PhongMayTinh) p).setSoMayTinh(soMayMoi);
                return true;
            }
        }
        return false;
    }

    public boolean xoaPhong(String maPhong) {
        return danhSach.removeIf(p -> p.getMaPhong().equalsIgnoreCase(maPhong));
    }

    public int tongSoPhong() {
        return danhSach.size();
    }

    public List<PhongMayTinh> getPhongMay60May() {
        List<PhongMayTinh> result = new ArrayList<>();
        for (PhongHoc p : danhSach) {
            if (p instanceof PhongMayTinh && ((PhongMayTinh) p).getSoMayTinh() == 60)
                result.add((PhongMayTinh) p);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Danh sách phòng học:\n");
        for (PhongHoc p : danhSach) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
