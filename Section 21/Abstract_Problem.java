// Create a Circle class that extends Shape
// The Circle class should have a private double radius attribute and a constructor to initialize it
// It should also implement the calculateArea() method 

// Create a Rectangle class that extends Shape
// The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
// It should also implement the calculateArea() method 

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }
    
    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

class Rectangle extends Shape{
        private double length,width;
        Rectangle(String name, double length, double width){
            super(name);
            this.length=length;
            this.width=width;
        }
        public double calculateArea(){
            if (length>0 && width>0)
            return this.length*this.width;
            else
            return -1;
        }
    }
    
class Circle extends Shape{
        private double radius;
        
        Circle(String name, double radius){
            super(name);
            this.radius=radius;
            
        }
        
        public double calculateArea(){
            if(this.radius> 0 )
            return Math.PI*this.radius*this.radius;
            
            return -1;
        }
    }

    public class Abstract_Problem {
        public static void main(String[] args) {
            // Create instances of Circle and Rectangle
            Shape circle = new Circle("Circle", 5);
            Shape rectangle = new Rectangle("Rectangle", 4, 6);
    
            // Display information about the shapes
            circle.displayInfo();
            rectangle.displayInfo();
        }
    }