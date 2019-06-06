package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aisb */
public class aisb implements airt<aisd>, aisa, aisd {
    private final List<aisd> a = new ArrayList();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicReference<Throwable> c = new AtomicReference(null);

    public static boolean b(Object obj) {
        try {
            airt airt = (airt) obj;
            aisd aisd = (aisd) obj;
            aisa aisa = (aisa) obj;
            if (!(airt == null || aisd == null || aisa == null)) {
                return true;
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int a() {
        return 2;
    }

    public final synchronized void a(aisd aisd) {
        this.a.add(aisd);
    }

    public final void a(Throwable th) {
        this.c.set(th);
    }

    public final synchronized void a(boolean z) {
        this.b.set(z);
    }

    public final synchronized Collection<aisd> am_() {
        return Collections.unmodifiableCollection(this.a);
    }

    public int compareTo(Object obj) {
        return airw.a(this, obj);
    }

    public final boolean g() {
        for (aisd h : am_()) {
            if (!h.h()) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        return this.b.get();
    }
}
