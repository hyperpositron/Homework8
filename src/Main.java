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
        int[] a = new int[12]; // Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println();
        double[] b = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.,
        for (int i = 0; i < 3; i++) {
            System.out.print(", " + b[i]);
        }
        System.out.println();
        int[] c = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 122, 133}; //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        for (int i = 0; i < 12; i++) {
            System.out.print(", " + c[i]);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("                                     ---=== Задание № 3 ===---");
        int[] a = new int[12];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(", " + a[i]);
        }
        System.out.println();
        double[] b = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(", " + b[i]);
        }
        System.out.println();
        int[] c = {11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 122, 133};
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(", " + c[i]);
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
