package lesson_1.homework;

public class homework3 {
    private static int PlOrMin(int x) {
        int i1 = x;
        if (i1 >= 0) {
            System.out.print("Число положительное");
        } else {
            System.out.print("Число отрицательное");
        }
        return x;
    }
    public static void main(String[] args) {
        int a = 3;
        int f1 = PlOrMin(a);
    }
}