package defpackage;

import android.view.Surface;
import defpackage.blq.a;
import defpackage.bly.b;
import defpackage.bsk.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;

/* renamed from: blz */
public final class blz implements a, bmg, bqu, bsk, bxa.a, bzx {
    public final CopyOnWriteArraySet<bma> a = new CopyOnWriteArraySet();
    public final b b = new b();
    private final byq c;
    private final b d = new b();
    @MonotonicNonNull
    private blq e;

    /* renamed from: blz$a */
    public static class a {
        public static blz a(blq blq, byq byq) {
            return new blz(blq, byq);
        }
    }

    /* renamed from: blz$b */
    public static final class b {
        final ArrayList<c> a = new ArrayList();
        final bly.a b = new bly.a();
        c c;
        c d;
        bly e = bly.a;
        public boolean f;

        public final c a() {
            return (this.a.isEmpty() || this.e.a() || this.f) ? null : (c) this.a.get(0);
        }

        /* Access modifiers changed, original: final */
        public final c a(c cVar, bly bly) {
            if (bly.a() || this.e.a()) {
                return cVar;
            }
            int a = bly.a(this.e.a(cVar.b.a, this.b, true).a);
            return a == -1 ? cVar : new c(bly.a(a, this.b, false).b, cVar.b.a(a));
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (!this.a.isEmpty()) {
                this.c = (c) this.a.get(0);
            }
        }
    }

    /* renamed from: blz$c */
    static final class c {
        public final int a;
        public final bsj.a b;

        public c(int i, bsj.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                c cVar = (c) obj;
                return this.a == cVar.a && this.b.equals(cVar.b);
            }
        }

        public final int hashCode() {
            return (this.a * 31) + this.b.hashCode();
        }
    }

    protected blz(blq blq, byq byq) {
        this.e = blq;
        this.c = (byq) byo.a((Object) byq);
    }

    private bma.a a(c cVar) {
        if (cVar != null) {
            return d(cVar.a, cVar.b);
        }
        int f = ((blq) byo.a(this.e)).f();
        b bVar = this.b;
        bsj.a aVar = null;
        if (bVar.e != null) {
            int c = bVar.e.c();
            bsj.a aVar2 = null;
            for (int i = 0; i < bVar.a.size(); i++) {
                c cVar2 = (c) bVar.a.get(i);
                int i2 = cVar2.b.a;
                if (i2 < c && bVar.e.a(i2, bVar.b, false).b == f) {
                    if (aVar2 != null) {
                        break;
                    }
                    aVar2 = cVar2.b;
                }
            }
            aVar = aVar2;
        }
        return d(f, aVar);
    }

    private bma.a c() {
        return a(this.b.c);
    }

    private bma.a d() {
        return a(this.b.d);
    }

    private bma.a d(int i, bsj.a aVar) {
        long a;
        long j;
        byo.a(this.e);
        long a2 = this.c.a();
        bly o = this.e.o();
        long j2 = 0;
        if (i != this.e.f()) {
            if (i < o.b() && (aVar == null || !aVar.a())) {
                a = bkw.a(o.a(i, this.d).d);
            }
            j = j2;
            return new bma.a(a2, o, i, aVar, j, this.e.h(), this.e.i() - this.e.m());
        } else if (aVar == null || !aVar.a()) {
            a = this.e.m();
        } else {
            if (this.e.k() == aVar.b && this.e.l() == aVar.c) {
                j2 = this.e.h();
            }
            j = j2;
            return new bma.a(a2, o, i, aVar, j, this.e.h(), this.e.i() - this.e.m());
        }
        j = a;
        return new bma.a(a2, o, i, aVar, j, this.e.h(), this.e.i() - this.e.m());
    }

    public final void a() {
        for (c cVar : new ArrayList(this.b.a)) {
            b(cVar.a, cVar.b);
        }
    }

    public final void a(int i) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, long j) {
        c();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, long j, long j2) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, bsj.a aVar) {
        b bVar = this.b;
        bVar.a.add(new c(i, aVar));
        if (bVar.a.size() == 1 && !bVar.e.a()) {
            bVar.b();
        }
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, bsj.a aVar, bsk.b bVar, c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, bsj.a aVar, bsk.b bVar, c cVar, IOException iOException, boolean z) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, bsj.a aVar, c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(Surface surface) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(blg blg) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bma) it.next()).a(2, blg);
        }
    }

    public final void a(bmx bmx) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(bqp bqp) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(String str, long j, long j2) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final bma.a b() {
        return a(this.b.a());
    }

    public final void b(int i, bsj.a aVar) {
        b bVar = this.b;
        c cVar = new c(i, aVar);
        bVar.a.remove(cVar);
        if (cVar.equals(bVar.d)) {
            bVar.d = bVar.a.isEmpty() ? null : (c) bVar.a.get(0);
        }
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int i, bsj.a aVar, bsk.b bVar, c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int i, bsj.a aVar, c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(blg blg) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bma) it.next()).a(1, blg);
        }
    }

    public final void b(bmx bmx) {
        c();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(String str, long j, long j2) {
        d();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(int i, bsj.a aVar) {
        this.b.d = new c(i, aVar);
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(int i, bsj.a aVar, bsk.b bVar, c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(bmx bmx) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void d(bmx bmx) {
        c();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onLoadingChanged(boolean z) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onPlaybackParametersChanged(blp blp) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onPlayerError(bla bla) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onPositionDiscontinuity(int i) {
        this.b.b();
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onRepeatModeChanged(int i) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onSeekProcessed() {
        if (this.b.f) {
            b bVar = this.b;
            bVar.f = false;
            bVar.b();
            b();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void onTimelineChanged(bly bly, Object obj, int i) {
        b bVar = this.b;
        for (i = 0; i < bVar.a.size(); i++) {
            bVar.a.set(i, bVar.a((c) bVar.a.get(i), bly));
        }
        if (bVar.d != null) {
            bVar.d = bVar.a(bVar.d, bly);
        }
        bVar.e = bly;
        bVar.b();
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onTracksChanged(bss bss, bwu bwu) {
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
