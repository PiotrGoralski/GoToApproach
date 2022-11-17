package goralski.piotr.gotoapproach.business.library;

public abstract class GoTo<T> {

    private T result;

    public void proceed(T result) {
        setResult(result);
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
