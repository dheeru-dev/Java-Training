package Generics;
public class Box {
    private T value;

    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
