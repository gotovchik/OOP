package homework_3;

public class Main {
    public static void main(String[] args) {
        int n = -13;
        IsEven even = new IsEven();
        System.out.println(even.isGood(n));
        IsPositive positive = new IsPositive();
        System.out.println(positive.isGood(n));

        String str1 = "Apple";
        BeginsWithA ba = new BeginsWithA();
        System.out.println(ba.isGood(str1));

        String str2 = "Today was a good day";
        String str3 = "today";
        BeginsWith bw = new BeginsWith(str2);
        System.out.println(bw.isGood(str3));

    }
}
