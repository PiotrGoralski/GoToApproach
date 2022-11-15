package goralski.piotr.gotoapproach.business.library;

import java.lang.reflect.Constructor;

public class GoToProducer<T extends GoTo<R> & IGoTo<V, R>, V, R>{

    private final Class<T> function;

    public GoToProducer(Class<T> function)
    {
        this.function = function;
    }

    public R execute(V data) {
        try {
            Constructor<T> constructor = function.getConstructor(data.getClass());
            GoTo<R> object = constructor.newInstance(data);

            return object.getResult();
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
