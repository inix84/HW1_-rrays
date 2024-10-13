import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Три массива.");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arrMarina = new int[]{10, 13, 15, 41};
        System.out.println("Задача 2. Три массива распечатать:");
        for (int index = 0; index < arr1.length; index++) {
            if (index == arr1.length - 1) {
                System.out.println(arr1[index] + ".");
                break;
            }
            System.out.print(arr1[index] + ",");
        }
        for (int index = 0; index < arr2.length; index++) {
            if (index == arr2.length - 1) {
                System.out.println(arr2[index] + ".");
                break;
            }
            System.out.print(arr2[index] + ",");
        }
        for (int index = 0; index < arrMarina.length; index++) {
            if (index == arrMarina.length - 1) {
                System.out.println(arrMarina[index] + ".");
                break;
            }
            System.out.print(arrMarina[index] + ",");
        }
        System.out.println("Задача 3. Три массива распечатать в обратном порядке:");
        for (int index = arr1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr1[index] + ".");
                break;
            }
            System.out.print(arr1[index] + ",");
        }
        for (int index = arr2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr2[index] + ".");
                break;
            }
            System.out.print(arr2[index] + ",");
        }
        for (int index = arrMarina.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrMarina[index] + ".");
                break;
            }
            System.out.print(arrMarina[index] + ",");
        }
        System.out.println("Задача 4. Нечетное сделать четным:");
        for (int index = 0; index < arr1.length; index++) {
            if (arr1[index] % 2 != 0) {
                arr1[index]++;
            }
        }
        System.out.print(Arrays.toString(arr1));
        System.out.println();
    }
}