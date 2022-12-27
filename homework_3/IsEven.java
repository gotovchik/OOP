package homework_3;

public class IsEven implements IsGood<Integer> {
    private int number;

    public IsEven(int number) {
        this.number = number;
    }

    public boolean isGood() {
        return this.number % 2 == 0;
    }

    @Override
    public String toString() {
        if (isGood(number)) {
            return "Number=" + number + ", even";
        }
        return "Number=" + number + ", odd";
    }
}
