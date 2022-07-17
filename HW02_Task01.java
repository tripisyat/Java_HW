/**
 * У вас есть отсортированный массив (Можете сами сгенерировать и использовать
 * любой
 * удобный вам алгоритм сортировки (кроме пузырька)), нужно используя
 * минимальное
 * колличество попыток найти загаданное число (Алгоритм бинарного поиска )
 */
public class HW02_Task01 {
    public static void main(String[] args) {
        int[] myArray = new int[] { 5, 10, 13, 26, 1, 8, 96, 7, 289, 14, 26};
        int [] sortedArray = SortByInsert(myArray);// сортируем массив
        printArray(sortedArray);//распечатываем отсортированный массив
        int valueToFind = 26;//загаданное значение
        int [] result = binarySearch(sortedArray, valueToFind, 0, myArray.length-1);//ищем бинарным поском
        System.out.println();//переход на новую строку для красоты
        for (int i : result) {System.out.printf("%d ", i);};//выводим в консоль результат
    }

    public static void printArray(int [] array) { //метод распечатки массива в консоль
        for (int i : array) {System.out.printf("%d ", i);}
    }

    public static int[] SortByInsert(int[] array) { // метод сортировки массива вставкой
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j + 1] = current;            
        }
        return array;
    }


public static int[] binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
    /**
     * алгоритм бинарного поиска
     * На вход подается отсортированный массив, значения для поиска, диапазон индексов поиска в массиве от и до
     * Если значение не будет найдено, вернется -1
     * Возвращает массив из 2х элементов - 1-ый:индекс искомого элемента, 2-й сколько было попыток поиска
     */
    int index = -1;
    int counter = 0;
    while (low <= high) {
        int mid = (low + high) / 2;//ищем середину массива
        if (sortedArray[mid] < valueToFind) {
            low = mid + 1;
            counter++;
        } else if (sortedArray[mid] > valueToFind) {
            high = mid - 1;
            counter++;
        } else if (sortedArray[mid] == valueToFind) {
            index = mid;
            break;
        }
    }
    return new int [] {index, counter};
}
}