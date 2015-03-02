package Ejercicio4;

//import java.io.File;
import java.io.IOException;

public class Add {
	public static void main(String[] args) throws IOException {
        BinaryIOClass testWrite = new BinaryIOClass(3, 7.5, 'a');
        testWrite.saveToFile("C:/Users/Vargaft/Desktop/prueba.doc");

        BinaryIOClass testRead = BinaryIOClass.readFromFile("C:/Users/Vargaft/Desktop/prueba.doc");
        System.out.println("integer = " + testRead.getInteger());
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("char = " + testRead.getCharacter());

        //File file = new File("C:/Users/Vargaft/Desktop/prueba.doc");
        //file.delete();
    }
}
