import java.util.Scanner;
interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Square implements Shape{
    double side;
    Square(double side){
        this.side=side;
    }
    public double calculateArea(){
        return side*side;
    }
}
class Rectangle implements Shape{
    double length, width;
    Rectangle(double length, double width){
        this.length= length ; 
        this.width= width;
    }
    public double calculateArea(){
        return length*width;
    }
}
class Triangle implements Shape{
    double base, height;
    Triangle(double base, double height){
        this.base= base;
        this.height= height;
    }
    public double calculateArea(){
        return 0.5*base*height;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Shape to calculate the Area of the shape");
        System.out.println("1.Circle");
        System.out.println("2.Square");
        System.out.println("3.Rectangle");
        System.out.println("4.Triangle");
        int choice = sc.nextInt();

        Shape shape = null;
        if(choice ==1){
            System.out.println("Enter Radius");
            double radius = sc.nextDouble();
            shape = new Circle(radius);
        }
        else if(choice == 2){
            System.out.println("Enter side length");
            double side=sc.nextDouble();
            shape = new Square(side);
        }
        else if (choice == 3){
            System.out.println("Enter length");
            double length = sc.nextDouble();
            System.out.println("Enter Width");
            double width = sc.nextDouble();
            shape=new Rectangle(length,width);
        }
        else if (choice == 4){
            System.out.println("Enter base");
            double base = sc.nextDouble();
            System.out.println("Enter height");
            double height = sc.nextDouble();
            shape = new Triangle(base,height);
        }
        else{
            System.out.println("Invalid Choise, kindly pick a valid choice");
            sc.close();
            return;
        }
        System.out.println("Area: "+shape.calculateArea());
        sc.close();
    }
}