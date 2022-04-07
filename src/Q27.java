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

class Circle{
    int width;
  
    public Circle(int width){
        this.width = width;
    }

    void circleArea(){
        double area = ((Math.PI) * width * width);
        System.out.println(area);
    }
}

class Adapter extends Shape{
  public Circle circle;
  
      public Adapter(Circle circle){
        this.circle = circle;
    }

  void area(){
    circle.circleArea();
  }
}

public class Q27 {
    public static void main(String[ ] args) {
      Square s = new Square(5);
      s.area();
      Circle c = new Circle(4);
      Adapter a = new Adapter(c);
      a.area();
    }
}
