package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: app */
public class app<T, Y> {
    protected int a = 0;
    private final LinkedHashMap<T, Y> b = new LinkedHashMap(100, 0.75f, true);
    private int c;
    private final int d;

    public app(int i) {
        this.d = i;
        this.c = i;
    }

    private void b() {
        b(this.c);
    }

    /* Access modifiers changed, original: protected */
    public int a(Y y) {
        return 1;
    }

    public final void a() {
        b(0);
    }

    public final void a(float f) {
        if (f >= MapboxConstants.MINIMUM_ZOOM) {
            this.c = Math.round(((float) this.d) * f);
            b();
            return;
        }
        throw new IllegalArgumentException("Multiplier must be >= 0");
    }

    /* Access modifiers changed, original: protected */
    public void a(T t, Y y) {
    }

    public final Y b(T t) {
        return this.b.get(t);
    }

    public final Y b(T t, Y y) {
        if (a((Object) y) >= this.c) {
            a(t, y);
            return null;
        }
        Object put = this.b.put(t, y);
        if (y != null) {
            this.a += a((Object) y);
        }
        if (put != null) {
            this.a -= a(put);
        }
        b();
        return put;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(int i) {
        while (this.a > i) {
            Entry entry = (Entry) this.b.entrySet().iterator().next();
            Object value = entry.getValue();
            this.a -= a(value);
            Object key = entry.getKey();
            this.b.remove(key);
            a(key, value);
        }
    }

    public final Y c(T t) {
        Object remove = this.b.remove(t);
        if (remove != null) {
            this.a -= a(remove);
        }
        return remove;
    }
}
