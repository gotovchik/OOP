package homework_3;

public class BeginsWithA implements IsGood<String> {
    private char ch = 'a';

    @Override
    public boolean isGood(String str) {
        return str.toLowerCase().charAt(0) == ch;
    }

}
