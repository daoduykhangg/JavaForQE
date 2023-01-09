package Lesson34;

public class test {
    public static void main(String[] args) {
        Date date = new Date(31, 1, 2023);
        Date date1 = new Date(13, 6, 2019);
        Date date2 = new Date(31, 1, 2023);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);

        System.out.println("date so sanh với date1: " + date.equals(date1));
        System.out.println("date so sanh với date2: " + date.equals(date2));

        System.out.println("HashCode date: " + date.hashCode());
        System.out.println("HashCode date1: " + date1.hashCode());
        System.out.println("HashCode date2: " + date2.hashCode());
    }
}
