public class ObjectClass<T> {
    private T t;

    public ObjectClass() {}

    public ObjectClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}