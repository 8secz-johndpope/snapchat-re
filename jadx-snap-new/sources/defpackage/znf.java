package defpackage;

import com.brightcove.player.event.Event;
import java.util.Iterator;
import java.util.List;

/* renamed from: znf */
public final class znf<T> implements znh<T> {
    private final List<T> a;

    public znf(List<? extends T> list) {
        akcr.b(list, Event.LIST);
        this.a = list;
    }

    public final int a() {
        return this.a.size();
    }

    public final T a(int i) {
        return this.a.get(i);
    }

    public final Iterator<T> iterator() {
        return new zni(this);
    }

    public final String toString() {
        return this.a.toString();
    }
}
