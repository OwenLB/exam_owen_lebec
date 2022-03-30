package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class JavaRandomizerIT {


    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        JavaRandomizer randomizer = new JavaRandomizer();
        for (int i = 0; i < 100; i++) {
            randomizer.getRouletteResult();
            Assertions.assertThat(randomizer.getRouletteResult()).isBetween(0, 37);
        }
    }

    @Test
    public void allNumbersOccur() throws Exception {
        JavaRandomizer randomizer = new JavaRandomizer();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 38; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            int result = randomizer.getRouletteResult();
            list2.add(result);
        }
        HashSet<Integer> hashSet1 = new HashSet<Integer>(list1);
        HashSet<Integer> hashSet2 = new HashSet<Integer>(list2);

        Assertions.assertThat(hashSet2).isEqualTo(hashSet1);
    }


}
