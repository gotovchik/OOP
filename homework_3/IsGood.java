package homework_3;

public interface IsGood<T> {
    public default boolean isGood(T item) {
        return false;
    }
}
