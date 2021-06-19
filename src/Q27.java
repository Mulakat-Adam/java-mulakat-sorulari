import java.util.*;

/* Adapter design pattern ornegi - alan hesaplama */
abstract class Shape {
    int width;
    abstract void area();
}

class Square extends Shape{
    public Square(int width){
        super.width = width;
    }

    void area(){
        int area = (width * width);
        System.out.println(area);
    }
}

class Circle extends Shape{
    public Circle(int width){
        super.width = width;
    }

    void area(){
        double area = ((Math.PI) * width * width);
        System.out.println(area);
    }
}

public class Q27 {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kare alani icin sayi giriniz:");
        int x = sc.nextInt();
        System.out.println("Daire alani icin sayi giriniz:");
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}