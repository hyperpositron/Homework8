import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
        /*massiv();
        massiv2();
        massiv3();*/

    }

    public static void task1_2() {
        System.out.println("                                     ---=== Задание № 1 и 2 ===---");
        int[] arr1 = new int[3]; // Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] arr2 = {1.57, 7.654, 9.986}; // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.,
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'}; //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("                                     ---=== Задание № 3 ===---");
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            //System.out.println("Длина Массива = " + arr2.length);
            //System.out.println(i + " это индекс");
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            //System.out.println("Длина Массива = " + arr3.length);
            //System.out.println("Индекс = "+i);
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(" ,");
            }
        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("                                     ---=== Задание № 4 ===---");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13};
        for (int index = 0; index < a.length; index++) {
            a[index] = index + 1;
            if (index % 2 == 0 && index != 0) {
                System.out.print(index + " ");
            }
        }
    }



   /* public static void massiv() {
        System.out.println("Задание с массивами"); // Массивы
        int[] weights = new int[12];           // Объявляем массив
        weights[0] = 90;                       // Присваиваем значение 1-му элементу
        int januaryWeight = weights[0];        // Записываем значение 1-го элемента массива в переменную
        System.out.println(januaryWeight);     // Выводим в консоль 1-й элемент массива. Способ 1
        System.out.println(weights[0]);        // Выводим в консоль 1-й элемент массива. Способ 2
        //System.out.println(weights[13]);     // Выводим в консоль 13-й элемент массива.

    }

    private static void massiv2() {
        System.out.println("Задание с массивами  2");                      // Массивы
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};      // Объявляем массив
        for (int i = 0; i < 12; i++) {
            System.out.println(weights[i]);
        }
    }

    private static void massiv3() {
        System.out.println("Задание с массивами  3");                       // Массивы
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};       // Объявляем массив
        for (int i = 0; i < weights.length; i++) {                          // Меняем в условии 12 на weights.length
            System.out.println(weights[i]);
        }
    }*/
}
