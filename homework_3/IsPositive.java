package homework_3;

public class IsPositive implements IsGood<Integer> {
    private int number;

    
    public IsPositive(int number) {
        this.number = number;
    }

    public boolean isGood() {
        return this.number > 0;
    }

    @Override
    public String toString() {
        if (isGood(number)) {
            return "Number=" + number + ", positive";
        }
        return "Number=" + number + ", negative";
    }

    
}
