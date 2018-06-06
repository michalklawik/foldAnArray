package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fold {

    public static int[] foldAnArray(int[] array) {
        List<Integer> retList = new ArrayList<>();
        for (int i = 0; i < array.length/2; i++ ) {
            retList.add(array[i] + array[array.length - 1 - i]);
        }
        if (array.length % 2 != 0) {
            retList.add(array[array.length/2]);
        }
        return retList.stream().mapToInt(a -> a).toArray();
    }

    public static Integer[] foldAnArrayNTimes(int[] array, int foldCount) {
        List<Integer> retList = Arrays.stream(array).boxed().collect(Collectors.toList());
        for (int i = 0; i < foldCount; i++) {
            array = foldAnArray(array);
        }
        return retList.stream().toArray(Integer[]::new);
    }
}
