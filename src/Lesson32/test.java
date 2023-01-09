package Lesson32;

public class test {
    public static void main(String[] args) {
        Date date = new Date(31, 1, 2023);
        System.out.println("Day: " + date.getDay());
        date.setDay(32);
        System.out.println("Day: " + date.getDay());
        date.setDay(21);
        System.out.println("Day: " + date.getDay());

        System.out.println("Month: " + date.getMonth());

        date.setMonth(13);
        System.out.println("Month: " + date.getMonth());

        date.setMonth(8);
        System.out.println("Month: " + date.getMonth());

        System.out.println("Year: " + date.getYear());

    }
}
