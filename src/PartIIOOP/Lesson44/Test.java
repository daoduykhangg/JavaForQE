package PartIIOOP.Lesson44;

public class Test {
    public static void main(String[] args) {

        ToaDo td1 = new ToaDo(1, 2);
        ToaDo td2 = new ToaDo(3, 4);
        ToaDo td3 = new ToaDo(5, 6);

        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2, 3.4);
        Hinh h3 = new HinhChuNhat(td3, 3, 5);

        System.out.println("Diện tích h1: " + h1.tinhDienTich());
        System.out.println("Diện tích h2: " + h2.tinhDienTich());
        System.out.println("Diện tích h3: " + h3.tinhDienTich());
    }
}
