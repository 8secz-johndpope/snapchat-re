package defpackage;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/* renamed from: acuy */
public final class acuy {
    final Cache<String, acxn> a;
    final Object b = new Object();
    private actz c;

    public acuy(int i, actz actz) {
        this.a = CacheBuilder.newBuilder().maximumSize((long) i).removalListener(new -$$Lambda$acuy$mtxnPxBCboOaBVGqi3bFmLjDkrY(this)).build();
        this.c = actz;
    }

    private long c() {
        long size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public final acxn a(String str) {
        acxn acxn;
        synchronized (this.b) {
            acxn = (acxn) this.a.getIfPresent(str);
        }
        return acxn;
    }

    public final void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    public final void a(String str, acxn acxn) {
        synchronized (this.b) {
            this.a.put(str, acxn);
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.a.invalidateAll();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        super.finalize();
        c();
    }
}
