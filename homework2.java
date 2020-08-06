package lesson_1.homework;

public class homework2 {
    private static boolean Summ10_20 (int x, int y) {
        int summ = x + y;
        boolean FirstString = summ < 10;
        boolean SecondString = summ > 20;
        if (FirstString || SecondString ) {
            return false;
        } else {
            return true;
        }

    }

      public static void main(String[] args) {
        int d1 = 10;
        int d2 = 11;
        boolean result = Summ10_20(d1, d2);
        System.out.print(result);

    }



}
