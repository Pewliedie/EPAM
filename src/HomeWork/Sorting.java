package HomeWork;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Создаем массив чисел,исплользуя regex ",".
        String[] input = scanner.nextLine().split(",");
        ArrayList<Integer> sortedInts = new ArrayList<Integer>();
        //преобразовываем элементы массива в Integer.
        for (String x : input) {
            sortedInts.add(Integer.valueOf(x));
        }
        //сортируем массив используя компаратор
        Collections.sort(sortedInts, new ReverseComparator());
        //Создаем лист из уникальных объектов
        Set<Integer> setOfSortedIntegers = new LinkedHashSet<>(sortedInts);
        int count =0;
        for (Integer ints:setOfSortedIntegers) {
            count++;
        }
        System.out.println(setOfSortedIntegers);
        System.out.println("Amount of unique elements is: "+count);
    }
}
