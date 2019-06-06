package defpackage;

import defpackage.dpa.b;
import defpackage.dpe.a;
import java.util.Iterator;

/* renamed from: dum */
public final class dum implements dpe {
    final abpt<a> a = new abpt();
    private final aipn<dul> b;
    private final a c = new a(this, (byte) 0);
    private dul d;

    /* renamed from: dum$a */
    class a implements defpackage.dpe.a {
        private a() {
        }

        /* synthetic */ a(dum dum, byte b) {
            this();
        }

        public final void a() {
            Iterator it = dum.this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.dpe.a) it.next()).a();
            }
        }

        public final void a(aesf aesf, boolean z) {
            Iterator it = dum.this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.dpe.a) it.next()).a(aesf, z);
            }
        }

        public final void a(ebi ebi) {
            Iterator it = dum.this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.dpe.a) it.next()).a(ebi);
            }
        }

        public final void b() {
            Iterator it = dum.this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.dpe.a) it.next()).b();
            }
        }

        public final void c() {
            Iterator it = dum.this.a.iterator();
            while (it.hasNext()) {
                ((defpackage.dpe.a) it.next()).c();
            }
        }
    }

    public dum(aipn<dul> aipn) {
        this.b = aiqb.b(new -$$Lambda$dum$xrZ0qzVLwKmHyXOQuSFQ8m37Qts(this, aipn));
    }

    private dul f() {
        if (this.d == null) {
            this.d = (dul) this.b.get();
        }
        return this.d;
    }

    public final void a() {
        f().a();
    }

    public final void a(b bVar, boolean z) {
        f().a(bVar, z);
    }

    public final void a(a aVar) {
        this.a.c(aVar);
    }

    public final void a(boolean z, boolean z2) {
        f().a(z, z2);
    }

    public final void b() {
        f().b();
    }

    public final void b(a aVar) {
        this.a.d(aVar);
    }

    public final void c() {
        f().c();
    }

    public final void d() {
        dul dul = this.d;
        if (dul != null) {
            dul.d();
        }
        this.d = null;
    }

    public final void e() {
        f().e();
    }
}
