// Задание 1.
// Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;

public class HW01_Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int num = iScanner.nextInt();
        triangleNum(num);
    }    



public static void triangleNum(int num) {
    int triangleNum = (num*(num+1))/2;
    System.out.println("треугольное число для " +num+ " = " +triangleNum);
    int Tn = 1;
    if (num == 1) {
        System.out.print("1");
    } else {
        System.out.print("Последовательность треугольных чисел до " +num+ " = 1, ");
        for (int i = 2; i < num; i++) {
            Tn = Tn + i;
            System.out.print(Tn+", ");
            }
            System.out.print(Tn+num); //избавляемся от запятой в конце строки
        }
    }
}



