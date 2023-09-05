package HW1.task1;

class Answer {

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