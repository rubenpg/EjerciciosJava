package Ejercicio2;

public class App {
	 public static void main(String[] args) {
	        Shape[] shapes = new Shape[2];
	        shapes[0] = new Circle(2.5);
	        shapes[1] = new Rectangle(3,5);
	        for (Shape s : shapes)
	            System.out.println("Soy un " + s.gettype() + " con area = " + s.area());
	    }

}