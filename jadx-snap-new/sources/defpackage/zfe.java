package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: zfe */
public final class zfe<T> extends ThreadLocal<T> {
    public final ConcurrentHashMap<Long, T> a = new ConcurrentHashMap();

    public final void remove() {
        super.remove();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object currentThread = Thread.currentThread();
        akcr.a(currentThread, "Thread.currentThread()");
        concurrentHashMap.remove(Long.valueOf(currentThread.getId()));
    }

    public final void set(T t) {
        super.set(t);
        Map map = this.a;
        Object currentThread = Thread.currentThread();
        akcr.a(currentThread, "Thread.currentThread()");
        map.put(Long.valueOf(currentThread.getId()), t);
    }
}
