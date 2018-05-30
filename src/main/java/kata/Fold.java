package kata;

import java.util.ArrayList;
import java.util.List;

public class Fold {
    public static Integer[] foldAnArray(int[] array) {
        List<Integer> retList = new ArrayList<>();
        if (array.length % 2 != 0) {
            for (int i = 0; i < array.length/2; i++ ) {
                retList.add(array[i] + array[array.length - 1 - i]);
            }
        }

        return retList.stream().toArray(Integer[]::new);
    }
}
