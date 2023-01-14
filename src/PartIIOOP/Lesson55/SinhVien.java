package PartIIOOP.Lesson55;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTb;

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTb) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTb = diemTb;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    @Override
    public int compareTo(SinhVien o) {
//        return this.maSinhVien - o.maSinhVien;
//        return (int) Math.round(this.diemTb - o.diemTb);

        String tenThis = this.getTen();
        String tenO = o.getTen();
        return tenThis.compareTo(tenO);
    }

    private String getTen() {
        String s = this.hoVaTen.trim();
        if (s.indexOf(" ") > 0) {
            return s.substring(s.lastIndexOf(" ") + 1);
        }
        return s;
    }
}
