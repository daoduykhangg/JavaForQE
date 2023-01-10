package PartIIOOP.Lesson37;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(12, 12, 2012);
        Ngay ngay2 = new Ngay(21, 8, 2005);
        Ngay ngay3 = new Ngay(12, 12, 2012);
        Ngay ngay4 = new Ngay(9, 1, 2010);

        Lop lop1 = new Lop("Lop A", "Khoa A");
        Lop lop2 = new Lop("Lop B", "Khoa B");
        Lop lop3 = new Lop("Lop C", "Khoa C");
        Lop lop4 = new Lop("Lop D", "Khoa D");

        SinhVien sv1 = new SinhVien("sv1", "Nguyen Van A", ngay1, 5.7, lop1);
        SinhVien sv2 = new SinhVien("sv2", "Nguyen Van B", ngay2, 3.6, lop2);
        SinhVien sv3 = new SinhVien("sv3", "Nguyen Van C", ngay3, 7.1, lop3);
        SinhVien sv4 = new SinhVien("sv4", "Nguyen Van D", ngay4, 4.9, lop4);

        System.out.println("sv1 đang học tại khoa " + sv1.khoaSinhVienDangHoc());
        System.out.println("sv2 đang học tại khoa " + sv2.khoaSinhVienDangHoc());
        System.out.println("sv3 đang học tại khoa " + sv3.khoaSinhVienDangHoc());
        System.out.println("sv4 đang học tại khoa " + sv4.khoaSinhVienDangHoc());

        System.out.println("SV1 có đậu: " + sv1.kiemTraSinhVienCoDau());
        System.out.println("SV2 có đậu: " + sv2.kiemTraSinhVienCoDau());
        System.out.println("SV3 có đậu: " + sv3.kiemTraSinhVienCoDau());
        System.out.println("SV4 có đậu: " + sv4.kiemTraSinhVienCoDau());

        System.out.println("SV1 có ngày sinh giống với sv2: " + sv1.kiemTraSinhVienCoTrungNgaySinh(sv2));
        System.out.println("SV1 có ngày sinh giống với sv3: " + sv1.kiemTraSinhVienCoTrungNgaySinh(sv3));
    }
}
