
/*
 * Написать метод, который будет эмулировать работу динамического массива (Без исопользования коллекций), 
 * протестировать можно при выводе последовательности треугольного числа до n
 * Пример:
 * 1
 * 1 3 
 * 1 3 6
 */
import java.util.Scanner;

public class HW02_Task02 {
    public static void main(String[] args) {
        int number = myScanner();
        int newNum = 1;
        int[] triArray = new int[] { 1 };
        for (int i = 2; i <= number; i++) {
            newNum = newTriangleNum(newNum, i);
            triArray = AddItem(triArray, newNum);
            printArray(triArray);
            System.out.println();
        }
    }

    public static void printArray(int[] array) { // метод распечатки массива в консоль
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }

    public static int myScanner() {// метод считывания числа введёного пользователем
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int num = iScanner.nextInt();
        return num;
    }

    public static int[] AddItem(int[] array, int item) {// метод эмуляции динамического массива
        int length = array.length;// записываем длину исходного массива
        int[] temp = new int[length + 1];// делаем новый массив и увеличиваем его длину на 1 по сравнению с исходным
                                         // массивом
        System.arraycopy(array, 0, temp, 0, length);// копируем в новый массив исходный массив
        temp[length] = item;// вставляем в конец новый элемент
        return temp;
    }

    public static int newTriangleNum(int num, int counter) {
        num = num + counter;
        return num;
    }
}
