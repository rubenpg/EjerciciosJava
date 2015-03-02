package Ejercicio3;

public class App {
	  public static void main(String[] args) {
		  
        try {
            double average = AverageFileCalculator.average("C:/Users/Vargaft/Desktop/numeros.txt");
            System.out.println("Average = " + average);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumberException e) {
            e.printStackTrace();
        }
    }
}



