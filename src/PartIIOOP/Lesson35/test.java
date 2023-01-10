package PartIIOOP.Lesson35;

public class test {
    public static void main(String[] args) {
        NgaySinh ngay1 = new NgaySinh(15, 12, 2019);
        NgaySinh ngay2 = new NgaySinh(16, 10, 2021);
        NgaySinh ngay3 = new NgaySinh(11, 8, 2023);

        TacGia tacGia1 = new TacGia("Nguyen Van A", ngay1);
        TacGia tacGia2 = new TacGia("Nguyen Van B", ngay2);
        TacGia tacGia3 = new TacGia("Nguyen Van C", ngay3);

        Sach sach1 = new Sach("Lap Trinh C", 500, 2012, tacGia1);
        Sach sach2 = new Sach("Lap Trinh Java", 500, 2011, tacGia2);
        Sach sach3 = new Sach("Lap Trinh Python", 1000, 2010, tacGia3);
        Sach sach4 = new Sach("Lap Trinh Python", 1000, 2012, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        System.out.println("So sánh năm xuất bản 1 và 4: " + sach1.kiemTraCungNamXuatBan(sach4));

        System.out.println("Sách 1 giảm giá 10%: " + sach1.giaSauKhiGiam(10));
        System.out.println("Sách 2 giảm giá 20%: " + sach2.giaSauKhiGiam(20));
        System.out.println("Sách 3 giảm giá 50%: " + sach3.giaSauKhiGiam(50));
    }
}
