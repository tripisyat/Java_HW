// Задание 2.
// Написать программу возрващающюю число, которое без остатка делится на сумма цифр этого числа.

import java.util.Scanner;
public class HW01_Task02 {
    /**
 *HW01_Task02
 */
public class HW01_Task01{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int num = iScanner.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("число, которое целочисленно делится на сумму цифр "+num+ " = " +find(sum));
    }

    public static int sumOfDigits(int number) { //метод нахождения суммы цифр, из которых состоит введённое число
        int sumOfDigits = 0;
        while (number>0) {
            int finalDigit = number%10;
            sumOfDigits+=finalDigit;
            number/=10;            
        }
        return sumOfDigits;
    }

    public static int find(int sum) { //метод находящий число, которое целочисленно делится на сумму цифр введённого числа
        int i = 0;
        while (i/sum==0) {
            i++;
        }
        return i;
    }
}

}
