package defpackage;

import android.os.Looper;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: zgk */
public final class zgk<Event extends Enum<Event>> {
    private final ConcurrentHashMap<Event, ajei> a = new ConcurrentHashMap();
    private final ajej b;
    private final Map<Event, Event> c;
    private final Collection<Event> d;

    public zgk(ajws<Event> ajws, Map<Event, Event> map) {
        this.c = map;
        this.d = map.values();
        this.b = ajws.a((ajfb) new -$$Lambda$zgk$2fbJ_06z40ra3zIgrcOR8ok3Oic(this), (ajfb) new -$$Lambda$zgk$-t-GH0d6xNMAtTJpIwa3lu7oPBI(this));
        Preconditions.checkArgument(this.d.size() == map.size());
        for (Enum enumR : this.d) {
            ajei ajei = new ajei();
            ajei.dispose();
            this.a.put(enumR, ajei);
        }
    }

    private void a(ajej ajej, Event event) {
        ((ajei) this.a.get(event)).a(ajej);
    }

    private void a(Event event) {
        Preconditions.checkArgument(Thread.currentThread().equals(Looper.getMainLooper().getThread()));
        if (this.c.containsKey(event)) {
            this.a.put(this.c.get(event), new ajei());
        } else if (this.d.contains(event)) {
            ((ajei) this.a.get(event)).dispose();
        } else {
            throw new IllegalArgumentException("Unexpected event: ".concat(String.valueOf(event)));
        }
    }

    private void a(Throwable th) {
        this.b.dispose();
    }

    public final <T extends ajej> T a(T t, Event event, String str) {
        a(new zgl(t, str), event);
        return t;
    }
}
