package exception.homework1;

public class Answer {
    public static void arrayOutOfBoundsException() {
        int [] array = {1, 4, 5, 7};
        System.out.println(array[8]);

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 5;
        int b = 0;
        System.out.println(a/b);

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String string = "Hello";
        int _int = Integer.parseInt(string);
        System.out.println(_int);
    }
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int [] d = {0};
        int[] c = new int[a.length];
        int i = 0;
        int j = 0;

        if (a.length == b.length) {
            //int[] c = new int[a.length];
            for (int k = 0; k < c.length; k++) {
                c[k] = a[i] - b[j];
                i++;
                j++;
            }
            return c;
        }else
            return d;

    }
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int [] d = {0};
        int[] c = new int[a.length];
        int i = 0;
        int j = 0;

        if (a.length == b.length) {

            for (int k = 0; k < c.length; k++) {
                if (b[j] == 0)
                    throw new RuntimeException("Второй массив на индексе: " + j + " имеет значение 0. На 0 делить нельзя" );
                c[k] = a[i] / b[j];
                i++;
                j++;
            }
            return c;
        }else
            return d;

    }
}
