package PartIIOOP.Lesson54;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100, "Nguyễn Hải Bình An", "Lớp 10A1", 8.1);
        SinhVien sv2 = new SinhVien(150, "Đào Dy Khang", "Lớp 10A1", 9.5);
        SinhVien sv3 = new SinhVien(89, "Hồ Tấn Hưng", "Lớp 10A1", 7.2);
        System.out.println("sv1.compareTo(sv2) = " + sv1.compareTo(sv2));
        System.out.println("sv1.compareTo(sv3) = " + sv1.compareTo(sv3));
    }
}
