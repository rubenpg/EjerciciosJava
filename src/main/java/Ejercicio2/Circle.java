package Ejercicio2;

public class Circle implements Shape {
    private double radius;
    private String type = "Circulo";
    
    public Circle(double radius) {
    	this.radius = radius;
    }

    /*public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }*/

    public double area() {
        return Math.PI * radius * radius;        
    }
    
    public String gettype() {
        return type;
    }
}
