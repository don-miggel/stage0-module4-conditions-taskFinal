package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        System.out.println((second ^ first) ^ first);
        System.out.println((first ^ second) ^ second);

    }
}
