package HomeWork;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Создаем массив чисел,исплользуя regex ",".
        String[] input = scanner.nextLine().split(",");
        ArrayList<Integer> ints = new ArrayList<Integer>();
        //преобразовываем элементы массива в Integer.
        for (String x : input) {
            ints.add(Integer.valueOf(x));
        }
        //сортируем массив используя компаратор
        Collections.sort(ints, new ReverseComparator());
        Collections.sort(ints,new ReverseComparator2());
        //Создаем лист из уникальных объектов
        Set<Integer> setOfSortedIntegers = new LinkedHashSet<>(ints);
        int count = 0;
        //Счет уникальных элементов
        for (Integer x : setOfSortedIntegers) {
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
