package PartIIOOP.Lesson55;

import PartIIOOP.Lesson54.SinhVien;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        SinhVien sv1 = new PartIIOOP.Lesson54.SinhVien(100, "Nguyễn Hải Bình An", "Lớp 10A1", 8.1);
        SinhVien sv2 = new PartIIOOP.Lesson54.SinhVien(150, "Đào Dy Vinh", "Lớp 10A1", 9.5);
        SinhVien sv3 = new SinhVien(89, "Hồ Tấn Hưng", "Lớp 10A1", 7.2);
        SinhVien sv4 = new SinhVien(89, "Hồ Tấn Văn", "Lớp 10A1", 7.2);

        SinhVien[] sv = new SinhVien[]{sv1, sv2, sv3};
        System.out.println(Arrays.toString(sv));
        Arrays.sort(sv);
        System.out.println(Arrays.toString(sv));

        SinhVien[] svTest = new SinhVien[2];
        Arrays.fill(svTest, sv4);
        System.out.println(Arrays.toString(svTest));

        System.out.println(Arrays.binarySearch(sv, sv3));
        System.out.println(Arrays.binarySearch(sv, sv4));


    }
}
