package net.java.fixparser;

public class TagValueImpl<T, V> implements TagValue<T, V> {

    private final T tag;

    private final V value;

    public TagValueImpl(T tag, V value) {
        if (null == tag) {
            throw new NullPointerException("Argument tag is null!");
        }

        if (null == value) {
            throw new NullPointerException("Argument value is null!");
        }

        this.tag = tag;
        this.value = value;
    }

    public T tag() {
        return tag;
    }

    public V value() {
        return value;
    }

    public String toString() {
        return String.valueOf(tag) + "=" + String.valueOf(value) + "|";
    }
}