package kata;

public class Ball {

    private static final int DEFAULT_TIME = 20000;
    private final int timeInMilliseconds;

    public Ball(int timeInMilliseconds) {
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public Ball() {
        this(DEFAULT_TIME);
    }

    public void roll() {
        try {
            Thread.sleep(timeInMilliseconds);
        } catch (InterruptedException e) {
        }
    }

}
