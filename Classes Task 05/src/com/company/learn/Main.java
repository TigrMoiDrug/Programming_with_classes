package com.company.learn;

// Десятичный счетчик( задание 5)

public class Main {

    public static void main(String[] args) {
        Counter a = new Counter(5, 10, 10);
        Counter b = new Counter(6, 4, 7);
        Counter c = new Counter(5, 3);

        for (int i = 0; i < 2; ++i) {
            a.inc();
            b.inc();
            c.inc();
        }

        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());

        for (int i = 0; i < 20; ++i) {
            a.dec();
            b.dec();
            c.dec();
        }
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
    }
}

class Counter {
    private int min, max, current;
    public Counter(int min_, int max_, int current_) {
        min = min_;
        max = max_;
        current = current_;
        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }
        if (current < min)
            current = min;
        if (current > max)
            current = max;
    }
    public Counter(int min_, int max_) {
        this(min_, max_, min_);
        current = min;
    }
    public void inc() {       // увеличение
        current++;
        if (current > max)
            current = min;
    }
    public void dec() {           // уменьшение
        current--;
        if (current < min)
            current = max;
    }
    public int value() {
        return current;
    }

}

