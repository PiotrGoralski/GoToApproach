package goralski.piotr.gotoapproach.business.library;

public interface IGoTo<T, V> {

    V task(T request);

}
