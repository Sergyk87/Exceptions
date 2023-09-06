package HW2;
/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            nameMethod();
        } catch (Exception e) {
            System.err.println("Введена пустая строка. Повторите.");
        }
    }

    public static void nameMethod() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст и нажмите ENTER");
        String input = scanner.nextLine();
        if (input.length() == 0)
            throw new RuntimeException();
        else {
            System.out.println(input);
        }
        scanner.close();
    }
}
