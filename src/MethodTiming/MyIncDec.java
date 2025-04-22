package MethodTiming;

public class MyIncDec implements IncDec {
    private int x;

    public MyIncDec(int x) {
        this.x = x;
    }

    @Override
    public void increment() {
        x++;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void decrement() {
        x--;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getValue() {
        return x;
    }
}
