package homework_01;

import homework_01.task_1.Sort;

import java.util.*;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {

        bubbleSortExample();
    }

    private static void bubbleSortExample() {
        List<Integer> list = new Random().ints(20, -100, 100)
                        .boxed().collect(Collectors.toList());

        System.out.println(list);
        Sort.bubbleSort(list);
        System.out.println(list);
    }
}
