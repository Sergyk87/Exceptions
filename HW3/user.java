package HW3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом: Фамилия Имя Отчество номертелефона
Форматы данных: фамилия, имя, отчество - строки, номертелефона - целое беззнаковое число без форматирования
Ввод всех элементов через пробел. Приложение должно проверить введенные данные по количеству. 
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, 
что он ввел меньше и больше данных, чем требуется.
Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. 
Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, 
пользователю выведено сообщение с информацией, что именно неверно.
Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
<Фамилия><Имя><Отчество><номер_телефона>
Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки. */

public class user {
    public static void main(String[] args) {
        try {
            String[] strings = getUserDataFromConsole();
            saveToFile(strings);
        } catch (FormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String[] getUserDataFromConsole() throws FormatException {
        System.out.println("Введите следующие данные через пробел: \n" +
                "Фамилия\n" +
                "Имя\n" +
                "Отчество\n" +
                "Номер телефона\n");
        try (Scanner scanner = new Scanner(System.in, "Cp866")) {
            String input = scanner.nextLine();
            String[] strings = input.split(" ");
            if (strings.length != 4) {
                System.out.println("Проверьте введенные данные, введено неверное кол-во");
            } else {
                String lastName = strings[0];
                String firstName = strings[1];
                String patronymic = strings[2];
                long phone = Long.parseLong(strings[3]);
                return strings;
            }
        } catch (NumberFormatException e) {
            throw new FormatException("При вводе номера телефона допущена ошибка");
        }

        return new String[0];
    }

    private static void saveToFile(String[] filename) {
        try (FileWriter fw = new FileWriter(filename[0], true)) {
            for (String s : filename) {
                fw.write("<" + s + ">");
            }
            fw.write("\n");
            System.out.println(filename[0] + ": данные успешно сохранены");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла ошибка при введении данных");
        }
    }
}

class FormatException extends Exception {
    public FormatException(String s) {
        super(s);
    }

}
