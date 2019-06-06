package defpackage;

/* renamed from: dvl */
public final class dvl {
    public final ecu a;
    public final dya b;
    public final dyo c;
    public final ebt d;
    public final abms e;

    /* renamed from: dvl$a */
    class a implements Runnable {
        dxx a;

        private a() {
        }

        /* synthetic */ a(dvl dvl, byte b) {
            this();
        }

        public final void run() {
            try {
                dvl.this.b.b();
                dyo dyo = dvl.this.c;
                if (dyo.c != null) {
                    dyo.c.e();
                    dyo.c = null;
                }
                if (dyo.d != null) {
                    dyo.d.e();
                    dyo.d = null;
                }
                dyo.a();
            } catch (adjw e) {
                this.a = new dxx(e);
            } catch (dxx e2) {
                this.a = e2;
            }
        }
    }

    /* renamed from: dvl$b */
    class b implements Runnable {
        dxx a;

        private b() {
        }

        /* synthetic */ b(dvl dvl, byte b) {
            this();
        }

        public final void run() {
            try {
                dvl.this.b.c();
                dvl.this.b.d();
            } catch (dxx e) {
                this.a = e;
            }
        }
    }

    public dvl(dya dya, ecu ecu, dov dov) {
        this.b = dya;
        this.a = ecu;
        this.e = ecu.h != null ? new abms(ecu.h) : null;
        this.d = new ebt(ecw.values, ecu.a);
        this.c = new dyo(ecu, dya, dov);
    }

    public final void a() {
        a aVar = new a(this, (byte) 0);
        abms abms = this.e;
        if (abms != null) {
            abms.post(aVar);
            this.e.k();
        } else {
            aVar.run();
        }
        if (aVar.a != null) {
            throw aVar.a;
        }
    }

    public final void a(eda eda, long j) {
        if (this.a.g) {
            ebt ebt = this.d;
            ebt.d.a(eda.a());
            ebt.g.a(eda.b());
            ebt.h.a(eda.c());
            for (ecw ecw : eda.d()) {
                if (ebt.a == ecw) {
                    ebt.b.a(eda.a(ecw));
                    ebt.c.a(eda.b(ecw));
                }
                ((adnh) ebt.e.get(ecw)).a(eda.c(ecw));
            }
            ebt.f.a(j);
        }
    }

    public final void a(Runnable runnable) {
        this.c.b = runnable;
    }

    public final void b() {
        b bVar = new b(this, (byte) 0);
        abms abms = this.e;
        if (abms != null) {
            abms.post(bVar);
            this.e.k();
        } else {
            bVar.run();
        }
        if (bVar.a != null) {
            throw bVar.a;
        }
    }
}
