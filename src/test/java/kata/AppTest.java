package kata;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.util.Arrays;
import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldFoldArray() {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,6,3};

        assertThat(Fold.foldAnArray(array1)).isEqualTo(Arrays.array(6,6,3));
        assertThat(Fold.foldAnArray(array2)).isEqualTo(Arrays.array(9,6));
    }
}
