public class Lession10Cast {
    public static void main(String[] args) {
        int a = 100;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Ép kiểu ngầm định
        float c = a;
        float d = b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //Ép kiểu tường minh
        float e = 9.4f;
        float f = 3.5f;

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = (int) e;
        int h = (int) f;

        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Ép kiểu kiểu dữ liệu nguyên thủy và đối tượng
        int x = new Integer(31);
        System.out.println("x = " + x);
    }
}
