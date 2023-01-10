package PartIIOOP.Lesson37;

public class SinhVien {
    private String MSSV;
    private String hoVaTen;
    private Ngay ngay;
    private double diemTB;
    private Lop lop;

    public SinhVien(String MSSV, String hoVaTen, Ngay ngay, double diemTB, Lop lop) {
        this.MSSV = MSSV;
        this.hoVaTen = hoVaTen;
        this.ngay = ngay;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String khoaSinhVienDangHoc() {
        return this.lop.getTenKhoa();
    }

    public boolean kiemTraSinhVienCoDau() {
        return this.diemTB >= 5.0;
    }

    public boolean kiemTraSinhVienCoTrungNgaySinh(SinhVien sv) {
        return this.ngay.equals(sv.ngay);
    }
}
