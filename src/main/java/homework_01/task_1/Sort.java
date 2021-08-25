package homework_01.task_1;

import java.util.List;

public class Sort {
    public static <T extends Comparable<T>> void bubbleSort(List<T> list) {
        int len = list.size();
        boolean sort;

        do {
            sort = false;

            for (int i = 1; i < len; i++) {
                if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                    sort = true;

                    T tmp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, tmp);
                }
            }

            len--;
        } while (sort);
    }
}
