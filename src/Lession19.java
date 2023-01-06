import java.util.Scanner;

public class Lession19 {
    public static void main(String[] args) {
        boolean continuing = true;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.print("Nhập vào số: ");
            int option = sc.nextInt();
            if (option == 2) {
                continuing = false;
            } else {
                System.out.print("Nhập vào số thứ: ");
                int n = sc.nextInt();
                switch (n) {
                    case 2: {
                        System.out.println("Thứ hai");
                        break;
                    }
                    case 3: {
                        System.out.println("Thứ ba");
                        break;
                    }
                    case 4: {
                        System.out.println("Thứ tư");
                        break;
                    }
                    case 5: {
                        System.out.println("Thứ năm");
                        break;
                    }
                    case 6: {
                        System.out.println("Thứ sáu");
                        break;
                    }
                    case 7: {
                        System.out.println("Thứ bảy");
                        break;
                    }
                    case 8: {
                        System.out.println("Chủ nhật");
                        break;
                    }
                    default: {
                        System.out.println("Số không hợp lệ!");
                    }
                }
            }

        } while (continuing);

    }

    public static void menu() {
        System.out.println("**********Menu***********");
        System.out.println("1. Kiểm tra thứ");
        System.out.println("2. Thoát");
    }
}
