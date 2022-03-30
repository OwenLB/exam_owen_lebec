package kata;


/**
 * Everything that is hard to test is extracted into collaborators, that can
 * be tested with Focused Integration Tests
 */
public class Roulette {

    private final Ball ball;
    private final Between0And37Randomizer randomizer;

    public Roulette(Ball ball, Between0And37Randomizer randomizer) {
        this.ball = ball;
        this.randomizer = randomizer;
    }

    public Result playGame() {
        ball.roll();
        int randomResult = randomizer.getRouletteResult();
        return new Result(randomResult);
    }

}
