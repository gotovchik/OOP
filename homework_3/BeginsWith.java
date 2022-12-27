package homework_3;

public class BeginsWith implements IsGood<String> {
    private String str;

    public BeginsWith(String str) {
        this.str = str;
    }

    @Override
    public boolean isGood(String begin) {
        return this.str.toLowerCase().startsWith(begin.toLowerCase());
    }
}
