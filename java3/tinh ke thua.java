/* dựa trên lớp cha đã tồn tại thì người con sẽ thưởng hưởng 
   các thuộc tính đó và có thể mở rộng thêm */

public class Shape { // lớp cha
    public double getArea() {
        return 0.0;
    }
}

public class Rectangle extends Shape { // lớp con
    private double width; 
    private double height;

    public double getArea() {
        return width * height;
    }
}

public class Circle extends Shape {
    private double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
