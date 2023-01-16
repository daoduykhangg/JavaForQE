package PartIIOOP.Lesson61;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSachSV;

    public DanhSachSinhVien() {
        this.danhSachSV = new ArrayList<SinhVien>();
    }

    public ArrayList<SinhVien> getDanhSachSV() {
        return danhSachSV;
    }

    public void setDanhSachSV(ArrayList<SinhVien> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }

    public void soLuongSinhVienTrongDanhSach() {
        if (this.danhSachSV.size() == 0) {
            System.out.println("Danh sách sinh viên rỗng");
        } else {
            System.out.println("Số lượng sinh viên trong danh sách: " + this.danhSachSV.size());
        }
    }

    public void kiemTraDanhSachCoRong() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng");
        } else {
            System.out.println("Danh sách sinh viên không rỗng");
        }
    }

    public void themSinhVienVaoDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        String maSV = sc.nextLine();

        System.out.print("Nhập họ và tên: ");
        String hoVaTen = sc.nextLine();

        System.out.print("Nhập năm sinh: ");
        int namSinh = sc.nextInt();

        System.out.print("Nhập điểm trung bình: ");
        double diemTb = sc.nextDouble();

        SinhVien sv = new SinhVien(maSV, hoVaTen, namSinh, diemTb);
        System.out.println("Đã thêm Sinh Viên: " + sv.getHoVaTen());
        danhSachSV.add(sv);
    }

    public void lamRongDanhSachSienVien() {
        this.danhSachSV.removeAll(danhSachSV);
    }

    public void inRaDanhSachSinhVien() {
        for (SinhVien sinhVien : this.danhSachSV) {
            System.out.println(sinhVien);
        }
    }

    public void kiemTraSinhVienCoTonTaiBangMSV(String msv) {
        boolean haveSV = false;
        for (SinhVien sinhVien : this.danhSachSV) {
            if (sinhVien.getMaSinhVien().equals(msv)) {
                System.out.println(sinhVien);
                haveSV = true;
            }
        }
        if (!haveSV) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public void xoaSinhVienBangMSV(String msv) {
        boolean haveSV = false;
        for (SinhVien sinhVien : this.danhSachSV) {
            if (sinhVien.getMaSinhVien().equals(msv)) {
                danhSachSV.remove(sinhVien);
                haveSV = true;
            }
        }
        if (!haveSV) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public void timKiemTatCaSinhVienBangTen(String ten) {
        String tentemp;
        boolean haveSV = false;
        for (SinhVien sinhVien : this.danhSachSV) {
            String hoVaTen = sinhVien.getHoVaTen();
            if (hoVaTen.lastIndexOf(" ") == -1) {
                tentemp = hoVaTen;
            } else {
                tentemp = hoVaTen.substring(hoVaTen.lastIndexOf(" ") + 1);
            }
            if (tentemp.equals(ten)) {
                System.out.println(sinhVien);
                haveSV = true;
            }
        }
        if (!haveSV) {
            System.out.println("Không tìm thấy sinh viên");
        }
    }
}
