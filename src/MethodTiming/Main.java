package MethodTiming;

public class Main {
    public static void main(String[] args) {
        MyIncDec myIncDec = new MyIncDec(3);
        IncDecTiming incDecTiming = new IncDecTiming(myIncDec);

        incDecTiming.increment();
        incDecTiming.decrement();
    }
}