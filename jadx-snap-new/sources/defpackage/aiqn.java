package defpackage;

/* renamed from: aiqn */
public final class aiqn<Result> extends airx<Void, Void, Result> {
    private aiqo<Result> e;

    public aiqn(aiqo<Result> aiqo) {
        this.e = aiqo;
    }

    private airr a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e.b());
        stringBuilder.append(".");
        stringBuilder.append(str);
        airr airr = new airr(stringBuilder.toString(), "KitInitialization");
        airr.a();
        return airr;
    }

    public final int a() {
        return 3;
    }

    public final void b() {
        super.b();
        airr a = a("onPreExecute");
        try {
            boolean d_ = this.e.d_();
            a.b();
            if (!d_) {
                f();
            }
        } catch (aise e) {
            throw e;
        } catch (Exception e2) {
            aiqj.a().c("Fabric", "Failure onPreExecute()", e2);
            a.b();
            f();
        } catch (Throwable th) {
            a.b();
            f();
        }
    }

    public final void c() {
        this.e.g.a();
    }

    public final void d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e.b());
        stringBuilder.append(" Initialization was cancelled");
        aiqm aiqm = new aiqm(stringBuilder.toString());
    }

    public final /* synthetic */ Object e() {
        airr a = a("doInBackground");
        Object d = !this.c.get() ? this.e.d() : null;
        a.b();
        return d;
    }
}
