package main.java.ru.basharin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View view = new View(scanner);
        view.greetingMenu();
    }
}
