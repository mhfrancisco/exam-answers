package MethodTiming;

public class IncDecTiming implements IncDec {
    private final IncDec incDec;

    public IncDecTiming(IncDec incDec) {
        this.incDec = incDec;
    }

    @Override
    public void increment() {
        long startTime = System.currentTimeMillis();
        incDec.increment();
        long endTime = System.currentTimeMillis();
        System.out.println("increment() took " + (endTime - startTime) + " ms");
    }

    @Override
    public void decrement() {
        long startTime = System.currentTimeMillis();
        incDec.decrement();
        long endTime = System.currentTimeMillis();
        System.out.println("decrement() took " + (endTime - startTime) + " ms");
    }
}
