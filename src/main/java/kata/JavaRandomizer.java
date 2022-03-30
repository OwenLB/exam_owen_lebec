package kata;

import java.util.Random;

/**
 * This can be replaced by some webservice or some external library
 * by reusing the existing tests
 */
public final class JavaRandomizer implements Between0And37Randomizer {
    public static final int UPPERLIMIT_FOR_RANDOM_37 = 38;
    private final Random random = new Random();

    @Override
    public int getRouletteResult() {
        return random.nextInt(UPPERLIMIT_FOR_RANDOM_37);
    }
}