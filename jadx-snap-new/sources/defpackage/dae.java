package defpackage;

import android.os.SystemClock;
import com.google.common.base.Optional;
import defpackage.daq.a;
import java.util.Locale;
import java.util.Set;

/* renamed from: dae */
public final class dae {
    private final daq a;
    private final dbm b;
    private final dar<dap, daq> c;
    private final dag d;
    private volatile int e = 1;
    private String f = dae.b();
    private volatile a g = null;
    private final long h = SystemClock.elapsedRealtime();
    private long i = SystemClock.elapsedRealtime();

    /* renamed from: dae$a */
    public interface a {
        void a(aaah aaah);
    }

    public dae(Set<dat<? extends das<?>>> set, Optional<dbm> optional, dag dag) {
        this.b = (dbm) optional.orNull();
        this.d = dag;
        a aVar = new a();
        for (dat dat : set) {
            aVar.a.put(dat.b().getClass(), dat);
        }
        this.a = aVar.a();
        this.c = new dar(this.a);
    }

    private void a(long j, long j2) {
        dap dap = (dap) this.c.b();
        if (dap != null) {
            das dbl;
            dap dap2 = (dap) this.c.a();
            if (this.b != null) {
                dbl = new dbl();
                this.b.a((dbl) dbl);
            } else {
                dbl = null;
            }
            aabc aabc = this.e == 2 ? aabc.ACTIVE_FOREGROUND : aabc.IN_BACKGROUND;
            aaah aaah = new aaah();
            this.d.a(dap, aaah, true, aabc);
            this.d.a(dap2, aaah, false, aabc);
            this.d.a(dbl, aaah, false, aabc);
            a(aaah, j, j2, aabc);
            if (this.g != null) {
                this.g.a(aaah);
            }
        }
    }

    private void a(long j, long j2, int i) {
        a(j, j2);
        this.e = i;
        if (this.e == 2) {
            this.f = dae.b();
        }
    }

    private void a(aaah aaah, long j, long j2, aabc aabc) {
        j -= this.h;
        aaah.b = aabc;
        aaah.a = this.f;
        aaah.c = Long.valueOf(j);
        aabg aabg = new aabg();
        aabg.c = Long.valueOf(j2);
        if (aabc == aabc.ACTIVE_FOREGROUND) {
            aabg.a = Long.valueOf(j2);
        } else {
            aabg.b = Long.valueOf(j2);
        }
        aaah.a(aabg);
    }

    private static String b() {
        return iig.a().toString().toUpperCase(Locale.US);
    }

    public final void a() {
        this.a.dispose();
    }

    public final void a(long j) {
        this.a.c();
        long j2 = j - this.i;
        this.i = j;
        a(j, j2, 2);
    }

    public final void a(a aVar) {
        this.g = aVar;
    }

    public final void b(long j) {
        this.a.a();
        long j2 = j - this.i;
        this.i = j;
        a(j, j2, 1);
    }
}
