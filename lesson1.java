package lesson_1.homework;

public class lesson1 {

    public static void home1 (int[] arr1) {
        int[] arr2 = arr1;
        arr2[0] = 0;
        arr2[1] = 1;
        arr2[2] = 0;
        arr2[3] = 1;
        arr2[4] = 0;
        arr2[5] = 1;
    } //задание 1

    public static void home2 (int[] arr3) {
        for (int a = 0; a < arr3.length; a++) {
            arr3[a] = (a * 3) + 1;
        }
    } //задание 2

    public static void home3 (int[] arr4) {
        for (int a = 0; a < arr4.length; a++){
            if (arr4[a] < 6) {
                arr4[a] = arr4[a] * 2;
            }
        }
    } // задание 3

    public static void home4 (int[] arr5) {
        for (int a = 0; a < arr5.length;) {
            for (int b = 0; b < arr5.length; b++) {
                if (arr5[b] < arr5[a]) {
                }

            }
            break;
        }
    } // задание 4 (поиск минимального)

    public static void home4_1 (int[] arr6) {
        for (int a = 0; a < arr6.length;) {
            for (int b = 0; b < arr6.length; b++) {
                if (arr6[b] > arr6[a]) {
                    System.out.println(arr6[b]);
                }

            }
            break;
        }
    } // задание 4 (поиск максимального)





       

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 1, 0};
        home1(arr1); // задание 1

        int[] arr3 = new int[8];
        home2(arr3); // задание 2

        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        home3(arr4); // задание 3

        int[] arr5 = {3,8,2,14,1};
        home4(arr5); // задание 4 (поиск минимального)
        home4_1(arr5); // задание 4 (поиск максимального)
















    }
}



