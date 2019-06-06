package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import defpackage.aiwb.b;
import defpackage.aiwb.c;
import defpackage.aiwe.a;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/* renamed from: aizn */
final class aizn extends aiwb {
    static final akkd c = new akkd();
    final aivm<?, ?> d;
    final String e;
    String f;
    Object g;
    volatile int h = -1;
    final c i;
    boolean j = false;
    private final aiza k;
    private final b l = new b();
    private final aiud m;

    /* renamed from: aizn$b */
    class b implements defpackage.aiwb.b {
        b() {
        }

        public final void a(int i) {
            synchronized (aizn.this.i.j) {
                c cVar = aizn.this.i;
                try {
                    cVar.f.b(i);
                } catch (Throwable th) {
                    cVar.a(th);
                }
            }
        }

        public final void a(aivl aivl, byte[] bArr) {
            StringBuilder stringBuilder = new StringBuilder("/");
            stringBuilder.append(aizn.this.d.b);
            String stringBuilder2 = stringBuilder.toString();
            if (bArr != null) {
                aizn.this.j = true;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append("?");
                stringBuilder3.append(BaseEncoding.base64().encode(bArr));
                stringBuilder2 = stringBuilder3.toString();
            }
            synchronized (aizn.this.i.j) {
                c cVar = aizn.this.i;
                cVar.k = aizj.a(aivl, stringBuilder2, aizn.this.f, aizn.this.e, aizn.this.j);
                aizo aizo = cVar.o;
                aizn aizn = aizn.this;
                if (aizo.m != null) {
                    aizn.i.a(aizo.m, 2, true, new aivl());
                } else if (aizo.h.size() >= aizo.r) {
                    aizo.s.add(aizn);
                    aizo.e();
                } else {
                    aizo.a(aizn);
                }
            }
        }

        public final void a(aivw aivw) {
            synchronized (aizn.this.i.j) {
                aizn.this.i.b(aivw, true, null);
            }
        }

        public final void a(aizg aizg, boolean z, boolean z2, int i) {
            akkd akkd;
            if (aizg == null) {
                akkd = aizn.c;
            } else {
                akkd = ((aizs) aizg).a;
                int i2 = (int) akkd.b;
                if (i2 > 0) {
                    aizn.this.d(i2);
                }
            }
            synchronized (aizn.this.i.j) {
                c cVar = aizn.this.i;
                if (!cVar.m) {
                    if (cVar.l != null) {
                        cVar.l.add(new a(akkd, z, z2));
                    } else {
                        Preconditions.checkState(aizn.this.h != -1, "streamId should be set");
                        cVar.n.a(z, aizn.this.h, akkd, z2);
                    }
                }
                aizf aizf = aizn.this.b;
                if (i != 0) {
                    aizf.e += (long) i;
                    aizf.f = aizf.b.a();
                }
            }
        }
    }

    /* renamed from: aizn$c */
    class c extends aixr {
        final Object j;
        List<ajai> k;
        Queue<a> l = new ArrayDeque();
        boolean m = false;
        final aizu n;
        final aizo o;
        private int q = 65535;
        private int r = 65535;
        private final aizi s;

        public c(int i, aiza aiza, Object obj, aizi aizi, aizu aizu, aizo aizo) {
            super(i, aiza, aizn.this.b);
            this.j = Preconditions.checkNotNull(obj, "lock");
            this.s = aizi;
            this.n = aizu;
            this.o = aizo;
        }

        public final void a(aivw aivw, aivl aivl) {
            b(aivw, false, aivl);
        }

        public final void a(akkd akkd, boolean z) {
            this.q -= (int) akkd.b;
            if (this.q < 0) {
                this.s.a(aizn.this.h, ajaf.FLOW_CONTROL_ERROR);
                this.o.a(aizn.this.h, aivw.i.a("Received data size exceeded our receiving window size"), 1, false, null, null);
                return;
            }
            super.a(new aizq(akkd), z);
        }

        public final void a(Runnable runnable) {
            synchronized (this.j) {
                runnable.run();
            }
        }

        public final void a(Throwable th) {
            b(aivw.a(th), true, new aivl());
        }

        public final void a(List<ajai> list, boolean z) {
            if (z) {
                b(aivd.a(aizv.a(list)));
            } else {
                a(aivd.a(aizv.a(list)));
            }
        }

        public final void a(boolean z) {
            if (this.d) {
                this.o.a(aizn.this.h, null, 1, false, null, null);
            } else {
                this.o.a(aizn.this.h, null, 1, false, ajaf.CANCEL, null);
            }
            super.a(z);
        }

        public final void b() {
            super.b();
            this.h.a();
        }

        public final void b(int i) {
            Preconditions.checkState(aizn.this.h == -1, "the stream has been started with id %s", i);
            aizn aizn = aizn.this;
            aizn.h = i;
            aizn.i.b();
            if (this.l != null) {
                this.s.a(aizn.this.j, false, aizn.this.h, 0, this.k);
                this.k = null;
                Object obj = null;
                while (!this.l.isEmpty()) {
                    a aVar = (a) this.l.poll();
                    this.n.a(aVar.b, aizn.this.h, aVar.a, false);
                    if (aVar.c) {
                        obj = 1;
                    }
                }
                if (obj != null) {
                    this.n.a();
                }
                this.l = null;
            }
        }

        /* Access modifiers changed, original: final */
        public final void b(aivw aivw, boolean z, aivl aivl) {
            if (!this.m) {
                this.m = true;
                if (this.l != null) {
                    this.o.b(aizn.this);
                    this.k = null;
                    for (a aVar : this.l) {
                        aVar.a.r();
                    }
                    this.l = null;
                    if (aivl == null) {
                        aivl = new aivl();
                    }
                    a(aivw, true, aivl);
                    return;
                }
                this.o.a(aizn.this.h, aivw, 1, z, ajaf.CANCEL, aivl);
            }
        }

        public final void c(int i) {
            this.r -= i;
            i = this.r;
            if (i <= 32767) {
                int i2 = 65535 - i;
                this.q += i2;
                this.r = i + i2;
                this.s.a(aizn.this.h, (long) i2);
            }
        }
    }

    /* renamed from: aizn$a */
    static class a {
        akkd a;
        boolean b;
        boolean c;

        a(akkd akkd, boolean z, boolean z2) {
            this.a = akkd;
            this.b = z;
            this.c = z2;
        }
    }

    aizn(aivm<?, ?> aivm, aivl aivl, aizi aizi, aizo aizo, aizu aizu, Object obj, int i, String str, String str2, aiza aiza, aizf aizf) {
        aivm<?, ?> aivm2 = aivm;
        super(new aizt(), aiza, aizf, aivl, aivm2.d);
        aiza aiza2 = aiza;
        this.k = (aiza) Preconditions.checkNotNull(aiza2, "statsTraceCtx");
        this.d = aivm2;
        this.f = str;
        this.e = str2;
        this.m = aizo.c();
        this.i = new c(i, aiza2, obj, aizi, aizu, aizo);
    }

    public final /* bridge */ /* synthetic */ c a() {
        return this.i;
    }

    public final void a(String str) {
        this.f = (String) Preconditions.checkNotNull(str, "authority");
    }

    public final /* bridge */ /* synthetic */ b b() {
        return this.l;
    }

    public final /* bridge */ /* synthetic */ a e() {
        return this.i;
    }
}
