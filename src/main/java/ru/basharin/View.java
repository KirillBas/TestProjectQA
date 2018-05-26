package main.java.ru.basharin;

import java.util.Scanner;

public class View {
    private final Scanner scanner;
    private ReadDataOfFile rdo = null;

    public View(Scanner scanner) {
        this.scanner = scanner;
    }

    public void greetingMenu() {
        String input;
        System.out.println("Здравствуйте это программа для решения квадратных уравнений");
        System.out.println("Для ввода данных нажмите 1");
        System.out.println("Для получения данных из файла нажмите 2");
        while (true) {
            input = scanner.next();
            switch (input) {
                case "1":
                    inputData();
                    return;
                case "2":
                    readDataFromFileAndResult();
                    return;
            }
        }
    }

    public void inputData() {
        String input;
        int numberFirst;
        while (true) {
            System.out.println("Введите новые значения");
            while (true) {
                System.out.println("Введите первый коэффициент. Для отмены ввода введите #");
                System.out.println("**************************");
                try {
                    input = scanner.next();
                    if (input.equals("#")) {
                        return;
                    }
                    numberFirst = Integer.parseInt(input);
                    break;
                } catch (Exception e) {
                    System.out.println("Неверное значение");
                }
            }

            int numberSecond;
            while (true) {
                System.out.println("Введите второй коэффициент. Для отмены ввода введите #");
                System.out.println("**************************");
                try {
                    input = scanner.next();
                    if (input.equals("#")) {
                        return;
                    }
                    numberSecond = Integer.parseInt(input);
                    break;
                } catch (Exception e) {
                    System.out.println("Неверное значение");
                }
            }

            int numberThird;
            while (true) {
                System.out.println("Введите третий коэффициент. Для отмены ввода введите #");
                System.out.println("**************************");
                try {
                    input = scanner.next();
                    if (input.equals("#")) {
                        return;
                    }
                    numberThird = Integer.parseInt(input);
                    break;
                } catch (Exception e) {
                    System.out.println("Неверное значение");
                }
            }
            SolutionQuadraticEquations sqe = new SolutionQuadraticEquations();
            sqe.solution(numberFirst, numberSecond, numberThird);
        }
    }

    public void readDataFromFileAndResult() {
        ReadDataOfFile readDataOfFile = new ReadDataOfFile();
        for (NumberData answer : readDataOfFile.readNumberFromFile()) {
            SolutionQuadraticEquations sqe = new SolutionQuadraticEquations();
            sqe.solution(answer.getNumberFirst(), answer.getNumberSecond(), answer.getNumberThird());
        }
    }
}
