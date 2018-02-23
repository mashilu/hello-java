package msl.mHH.javacore.util;

/**
 * Created by Administrator on 2018/2/23 0023.
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
