package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AverageFileCalculator {
    public static double average(String file) throws FileParsingException, BigNumberException {
        double counter = 0d;
        double sum = 0d;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);  //parseInt = Convert to Int
                    if (number > 1000)
                        throw new BigNumberException("El número de la linea " + (int) (++counter) + " es mayor que 1000.");
                    sum += number; //sum = sum + number
                    counter++;
                } catch (NumberFormatException e) {
                    throw new FileParsingException(e.getMessage());
                }
            }
        } catch (java.io.IOException e) {
            throw new FileParsingException(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("warning: can not close file.");
            }
        }

        return sum / counter;
    }
}
