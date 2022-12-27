package homework_3;

public class IsEven implements IsGood<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }

}
