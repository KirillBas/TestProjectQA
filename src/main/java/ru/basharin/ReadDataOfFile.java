package main.java.ru.basharin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDataOfFile {
    private static final String CLIENT_FILE_NAME = "data.txt";
    private final File file = new File(CLIENT_FILE_NAME);
    private final List<NumberData> result = new ArrayList<>();

    public List<NumberData> readNumberFromFile() {
       try(Scanner scanner = new Scanner(new FileInputStream(file))) {
           while (scanner.hasNextLine()) {
               String line = scanner.nextLine();
               String[] numbers = line.split(" ");
               NumberData numberData = new NumberData(Integer.parseInt(numbers[0]),
                       Integer.parseInt(numbers[1]),
                       Integer.parseInt(numbers[2]));
               result.add(numberData);
           }
       } catch (FileNotFoundException | NumberFormatException e) {
           System.out.println("Неверные данные в файле " + file.getName());
       }
       return result;
    }
}
