package PartIIOOP.Lesson36;

public class Test {
    public static void main(String[] args) {
        NgayChieu nc1 = new NgayChieu(31, 12, 2023);
        NgayChieu nc2 = new NgayChieu(14, 7, 2022);
        NgayChieu nc3 = new NgayChieu(9, 4, 2023);

        HangSanXuat hsx1 = new HangSanXuat("CGV", "Viet Nam");
        HangSanXuat hsx2 = new HangSanXuat("Galaxy", "Korea");
        HangSanXuat hsx3 = new HangSanXuat("Lotteria", "ThaiLand");

        Phim p1 = new Phim("Nhà Bà Nữ", 2023, hsx1, 150000, nc1);
        Phim p2 = new Phim("Nhà Ma", 2019, hsx2, 130000, nc2);
        Phim p3 = new Phim("Nhà Bà Nữ", 2020, hsx3, 170000, nc3);


        System.out.println("Giá vé phim 1 có rẻ hơn giá vé phim 2 hay không: " + p1.kiemTraGiaVeCoReHonPhimKhac(p2));
        System.out.println("Giá vé phim 1 có rẻ hơn giá vé phim 3 hay không: " + p1.kiemTraGiaVeCoReHonPhimKhac(p3));

        System.out.println("Tên hãng sản xuất của p1: "+ p1.tenHangSanXuat());
        System.out.println("Tên hãng sản xuất của p2: "+ p2.tenHangSanXuat());
        System.out.println("Tên hãng sản xuất của p3: "+ p3.tenHangSanXuat());

        System.out.println("Giá vé p1 sau khi KM 10% là: " + p1.giaVeSauKhuyenMai(10));
        System.out.println("Giá vé p2 sau khi KM 20% là: " + p2.giaVeSauKhuyenMai(20));
        System.out.println("Giá vé p3 sau khi KM 30% là: " + p3.giaVeSauKhuyenMai(30));
    }
}
