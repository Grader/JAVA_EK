package model;

public class Ugadai {

    private final int min;
    private final int max;
    private final int attemptCount;
    private final int target;

    private Ugadai(
            final int min,
            final int max,
            final int attemptCount,
            final int target) {
        this.min = min;
        this.max = max;
        this.attemptCount = attemptCount;
        this.target = target;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int getTarget() {
        return target;
    }

    public static class UgadaiBuilder {
        private int min;
        private int max;
        private int attemptCount;
        private int target;

        public UgadaiBuilder setMin(int min) {
            this.min = min;
            return this;
        }

        public UgadaiBuilder setMax(int max) {
            this.max = max;
            return this;
        }

        public UgadaiBuilder setAttemptCount(int attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }

        public UgadaiBuilder setTarget(int target) {
            this.target = target;
            return this;
        }

        public Ugadai createUgadai() {
            return new Ugadai(min, max, attemptCount, target);
        }
    }
}
