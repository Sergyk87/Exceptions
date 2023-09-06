package HW2;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.println(getFloatNumber());
    }

    public static float getFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите число типа float");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введенные данные не соответствуют типу float");
            }
        }
    }
}
