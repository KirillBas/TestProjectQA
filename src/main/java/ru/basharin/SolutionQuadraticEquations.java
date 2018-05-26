package main.java.ru.basharin;

public class SolutionQuadraticEquations {

    public void solution(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        int x = 0;
        int x2 = 0;
        if (a == 0) {
            System.out.println("***************");
            System.out.println("Значение а не может быть 0");
            return;
        }
        if (b == 0 && c == 0) {
            System.out.println("***************");
            System.out.println("При данных значениях " + a + " " + b + " " + c);
            System.out.println("Ответ = 0");
            return;
        } else if (b == 0) {
            if ((-c / a) >= 0) {
                x = (int)Math.sqrt(-(c / a));
                x2 = (int)Math.sqrt((c / a));
                System.out.println("***************");
                System.out.println("При данных значениях " + a + " " + b + " " + c + " нет решения");
                System.out.println("Ответ 1 = " + x);
                System.out.println("Ответ 2 = " + x2);
                return;
            } else {
                System.out.println("***************");
                System.out.println("Решения нет");
                return;
            }
        } else if (c == 0) {
            x = 0;
            x2 = -(b / a);
            System.out.println("***************");
            System.out.println("При данных значениях " + a + " " + b + " " + c);
            System.out.println("Ответ 1 = " + x);
            System.out.println("Ответ 2 = " + x2);
            return;
        }

        if (d < 0) {
            System.out.println("***************");
            System.out.println("При данных значениях " + a + " " + b + " " + c + " нет решения");
            return;
        } else if (d == 0) {
            x = (-b + (int)Math.sqrt(d)) / (2 * a);
            System.out.println("***************");
            System.out.println("При данных значениях " + a + " " + b + " " + c);
            System.out.println("Ответ равен " + x);
            return;
        } else if (d > 0) {
            System.out.println("***************");
            x = (-b + (int)Math.sqrt(d)) / (2 * a);
            x2 = (-b - (int)Math.sqrt(d)) / (2 * a);
            System.out.println("При данных значениях " + a + " " + b + " " + c);
            System.out.println("Ответ 1 равен " + x + " Ответ 2 равен " + x2);
            return;
        }
    }
}
