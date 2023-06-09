package ftc;

public abstract class Sleep {
    private static final int TIMES = 3;
    public static void forMilliseconds(long milliseconds) {
        for (int i = 0; i < TIMES; i++) {
            sleep(milliseconds / TIMES - 1);
            System.out.print(".");
        }
        sleep(milliseconds / TIMES - 1);
        System.out.println();
    }
    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {

        }
    }
}
