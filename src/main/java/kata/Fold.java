package kata;

import java.util.ArrayList;
import java.util.List;

public class Fold {
    public static Integer[] foldAnArray(int[] array) {
        List<Integer> retList = new ArrayList<>();
        for (int i = 0; i < array.length/2; i++ ) {
            retList.add(array[i] + array[array.length - 1 - i]);
        }
        if (array.length % 2 != 0) {
            retList.add(array[array.length/2]);
        }
        return retList.stream().toArray(Integer[]::new);
    }
}
