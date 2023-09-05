package HW1.task2;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (a.length != b.length) {
           int result[] = new int[1];
           return result;
        } else {
            int[] result = new int[b.length];
            for (int i = 0; i < b.length; i++) {
                result[i] = a[i] - b[i];

            }
            return result;
        }

    }
}
