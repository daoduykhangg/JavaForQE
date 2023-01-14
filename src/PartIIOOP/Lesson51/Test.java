package PartIIOOP.Lesson51;

public class Test {
    public static void main(String[] args) {
        String s1 = "Xin chào cô chú, xin chào anh chị, Xin chào!";
        String s2 = "Xin chào";
        String s3 = "Xin chào 123";
        System.out.println("vị trí của s2 trong s1 là: " + s1.indexOf(s2));
        System.out.println("vị trí của s3 trong s1 là: " + s1.indexOf(s3));


        System.out.println("vị trí của s2 trong s1 là: " + s1.indexOf(s2, 2));

        System.out.println("vị trí của ô trong s1 là: " + s1.indexOf('ô'));
        System.out.println("vị trí của ô trong s1 là: " + s1.indexOf('ô', 11));


        System.out.println("vị trí của s2 trong s1 là: " + s1.lastIndexOf(s2));
    }
}
