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
        Collections.sort(sortedInts,new ReverseComparator2());
        //Создаем лист из уникальных объектов
        Set<Integer> setOfSortedIntegers = new LinkedHashSet<>(sortedInts);
        int count = 0;
        //Счет уникальных элементов
        for (Integer ints : setOfSortedIntegers) {
            count++;
        }
        System.out.println(setOfSortedIntegers);
        System.out.println("Amount of unique elements is: " + count);
    }
}

//
class ReverseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o2 == 4) {
            return 0;
        } else if (o1 == 4) {
            return -1;
        }
        if (o1 >= 100) {
            return o1-o2;
        }
        return o1 - o2;
    }
}
class ReverseComparator2 implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o2<100){
            return 1;
        }
        return o2-o1;
    }
}
