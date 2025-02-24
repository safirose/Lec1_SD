//Et program til at beregne en cirkels areal

public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle();
       circle.x=5; circle.y=10; circle.radius=5;
       System.out.println(circle.area());

    }
}

 abstract class Shape {
     int x;
     int y;
      abstract double area();

    }
    class Circle extends Shape {
    double radius;
    double area(){
        return Math.PI * radius * radius;
    }
    class Rectangle extends Shape {
        double length;
        double width;
        double area(){
            return length * width;
        }
    }
    }
