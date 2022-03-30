package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RouletteAT {

    @Test
    public void itWaitsForTheBallToStop() {
        JavaRandomizer randomizer = new JavaRandomizer();
        Ball ball = new Ball();
        Roulette roulette = new Roulette(ball, randomizer);
        Assertions.assertEquals(0, roulette.playGame().number);
    }

    @Test()
    public void itProvidesAResultWithColor() throws Exception {
        JavaRandomizer randomizer = new JavaRandomizer();
        Ball ball = new Ball();
        Roulette roulette = new Roulette(ball, randomizer);
        Assertions.assertNotNull(roulette.playGame().color);
    }

}
