package defpackage;

import android.net.Uri;
import android.os.Handler;
import defpackage.bse.c;
import defpackage.bxe.a;
import java.io.IOException;

/* renamed from: bsf */
public final class bsf extends brv implements c {
    private final Uri b;
    private final a c;
    private final bnn d;
    private final int e;
    private final String f;
    private final int g;
    private final Object h;
    private long i;
    private boolean j;

    /* renamed from: bsf$c */
    public static final class c {
        private final a a;
        private bnn b;
        private int c = -1;
        private int d = 1048576;
        private boolean e;

        public c(a aVar) {
            this.a = aVar;
        }

        public final bsf a(Uri uri) {
            this.e = true;
            if (this.b == null) {
                this.b = new bni();
            }
            return new bsf(uri, this.a, this.b, this.c, this.d);
        }
    }

    @Deprecated
    /* renamed from: bsf$a */
    public interface a {
        void a(IOException iOException);
    }

    /* renamed from: bsf$b */
    static final class b extends bsc {
        private final a a;

        public b(a aVar) {
            this.a = (a) byo.a((Object) aVar);
        }

        public final void a(int i, bsj.a aVar, defpackage.bsk.b bVar, bsk.c cVar, IOException iOException, boolean z) {
            this.a.a(iOException);
        }
    }

    @Deprecated
    public bsf(Uri uri, a aVar, bnn bnn, int i, Handler handler, a aVar2) {
        this(uri, aVar, bnn, i, null, 1048576, null);
        if (aVar2 != null && handler != null) {
            a(handler, (bsk) new b(aVar2));
        }
    }

    private bsf(Uri uri, a aVar, bnn bnn, int i, String str, int i2, Object obj) {
        this.b = uri;
        this.c = aVar;
        this.d = bnn;
        this.e = i;
        this.f = null;
        this.g = i2;
        this.i = -9223372036854775807L;
        this.h = null;
    }

    @Deprecated
    public bsf(Uri uri, a aVar, bnn bnn, Handler handler) {
        this(uri, aVar, bnn, handler, (byte) 0);
    }

    @Deprecated
    private bsf(Uri uri, a aVar, bnn bnn, Handler handler, byte b) {
        this(uri, aVar, bnn, -1, handler, null);
    }

    private void b(long j, boolean z) {
        this.i = j;
        this.j = z;
        a((bly) new bsq(this.i, this.j, this.h), null);
    }

    public final bsi a(bsj.a aVar, bwy bwy) {
        byo.a(aVar.a == 0);
        return new bse(this.b, this.c.createDataSource(), this.d.a(), this.e, a(aVar), this, bwy, this.f, this.g);
    }

    public final void a() {
    }

    public final void a(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.i;
        }
        if (this.i != j || this.j != z) {
            b(j, z);
        }
    }

    public final void a(blb blb, boolean z) {
        b(this.i, false);
    }

    public final void a(bsi bsi) {
        bse bse = (bse) bsi;
        if (bse.n) {
            for (bsm b : bse.l) {
                b.b();
            }
        }
        bse.f.a(bse);
        bse.i.removeCallbacksAndMessages(null);
        bse.j = null;
        bse.y = true;
        bse.b.b();
    }

    public final void b() {
    }
}
