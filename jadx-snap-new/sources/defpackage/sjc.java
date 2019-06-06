package defpackage;

import defpackage.siw.b;

/* renamed from: sjc */
public final class sjc {
    public b a;
    private b b;
    private final String c;

    public /* synthetic */ sjc() {
        this(null);
    }

    public sjc(byte b) {
        this();
    }

    public sjc(String str) {
        this.c = str;
    }

    private void c() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.b();
        }
        this.b = null;
    }

    public final void a() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.b();
        }
        this.a = null;
    }

    public final void a(b bVar) {
        akcr.b(bVar, "request");
        if (!akcr.a((Object) bVar, this.b)) {
            c();
            this.b = bVar;
        }
    }

    public final void b() {
        c();
        a();
    }

    public final void b(b bVar) {
        akcr.b(bVar, "content");
        if (!akcr.a((Object) bVar, this.a)) {
            a();
            this.a = bVar;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        Object a = abss.a();
        akcr.a(a, "ReleaseManager.getInstance()");
        if (a.l()) {
            b bVar = this.b;
            boolean a2 = bVar != null ? bVar.a() : true;
            b bVar2 = this.a;
            boolean a3 = bVar2 != null ? bVar2.a() : true;
            Object obj = (a2 && a3) ? null : 1;
            if (obj != null) {
                StringBuilder stringBuilder = new StringBuilder("DisposableContentManager didn't dispose all its contents on finalize. Finalized with managed request disposed = ");
                stringBuilder.append(a2);
                stringBuilder.append(" and managed content disposed = ");
                stringBuilder.append(a3);
                stringBuilder.append(" from source ");
                stringBuilder.append(this.c);
                stringBuilder.append('.');
                IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                ieg.a("Please s2r. Opera layers have not disposed properly", true, 0);
            }
        }
    }
}
