package lesson_1.homework;

public class homework1 {
    private static int MatchScore(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 2;
        int i3 = 4;
        int i4 = 2;
        float f1 = MatchScore(i1, i2, i3, i4);
        System.out.print(f1);
    }
}