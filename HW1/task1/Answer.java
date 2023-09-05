package HW1.task1;

/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

Метод divisionByZero - Деление на 0

Метод numberFormatException - Ошибка преобразования строки в число

Важно: они не должны принимать никаких аргументов */

class Answer {
    // public static void main(String[] args) {
    //     arrayOutOfBoundsException();
    //     divisionByZero();
    //     numberFormatException();
    // }
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = {1,2,3,4,5,6};
        System.out.println(array[7]);
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
      int result = 5/0;
      System.out.println(result);
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int two = Integer.parseInt("two");
 }
}