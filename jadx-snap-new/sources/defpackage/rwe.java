package defpackage;

import com.google.common.base.Optional;

/* renamed from: rwe */
public final class rwe implements ajfb<Throwable> {
    final Optional<ftk> a;
    private final ajxe b;
    private final ajwy<gqr> c;
    private final boolean d;

    /* renamed from: rwe$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ rwe a;

        a(rwe rwe) {
            this.a = rwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.isPresent() ? (Boolean) ((ftk) this.a.a.get()).a(fxm.CATCH_ALL_UNDELIVERABLE_EXCEPTIONS).or(Boolean.FALSE) : Boolean.FALSE;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rwe.class), "whitelistAll", "getWhitelistAll()Ljava/lang/Boolean;");
    }

    public rwe(Optional<ftk> optional, ajwy<gqr> ajwy) {
        akcr.b(optional, "cofProvider");
        akcr.b(ajwy, "exceptionTracker");
        akcr.a(abtb.a(), "TestStatus.getInstance()");
        this(optional, ajwy, abtb.b());
    }

    private rwe(Optional<ftk> optional, ajwy<gqr> ajwy, boolean z) {
        akcr.b(optional, "cofProvider");
        akcr.b(ajwy, "exceptionTracker");
        this.a = optional;
        this.c = ajwy;
        this.d = z;
        this.b = ajxh.a(new a(this));
    }

    /* JADX WARNING: Missing block: B:34:0x006a, code skipped:
            if (r1 == null) goto L_0x006c;
     */
    public final /* synthetic */ void accept(java.lang.Object r5) {
        /*
        r4 = this;
        r5 = (java.lang.Throwable) r5;
        r0 = r5 instanceof defpackage.ajet;
        if (r0 == 0) goto L_0x008d;
    L_0x0006:
        r0 = r5.getCause();
        r1 = r4.b;
        r1 = r1.b();
        r1 = (java.lang.Boolean) r1;
        r2 = "whitelistAll";
        defpackage.akcr.a(r1, r2);
        r1 = r1.booleanValue();
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0056;
    L_0x0020:
        r1 = r0 instanceof defpackage.gex;
        if (r1 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0056;
    L_0x0025:
        r1 = r0 instanceof defpackage.gce;
        if (r1 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0056;
    L_0x002a:
        r1 = r0 instanceof defpackage.rxt;
        if (r1 != 0) goto L_0x0056;
    L_0x002e:
        r1 = r0 instanceof defpackage.gly;
        if (r1 == 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0056;
    L_0x0033:
        r1 = r0 instanceof defpackage.zsr;
        if (r1 == 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0056;
    L_0x0038:
        r1 = r0 instanceof defpackage.kba;
        if (r1 == 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0056;
    L_0x003d:
        r1 = r0 instanceof defpackage.adke;
        if (r1 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0056;
    L_0x0042:
        r1 = r0 instanceof java.sql.SQLException;
        if (r1 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0056;
    L_0x0047:
        r1 = r0 instanceof defpackage.admm.b;
        if (r1 == 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0056;
    L_0x004c:
        r1 = r4.d;
        if (r1 == 0) goto L_0x0055;
    L_0x0050:
        r0 = r0 instanceof android.database.sqlite.SQLiteException;
        if (r0 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0056;
    L_0x0055:
        r3 = 0;
    L_0x0056:
        if (r3 == 0) goto L_0x008d;
    L_0x0058:
        r0 = r5.getMessage();
        if (r0 != 0) goto L_0x0060;
    L_0x005e:
        r0 = "UndeliverableException";
    L_0x0060:
        r1 = r5.getCause();
        if (r1 == 0) goto L_0x006c;
    L_0x0066:
        r1 = r1.getMessage();
        if (r1 != 0) goto L_0x006e;
    L_0x006c:
        r1 = "NoCauseMessage";
    L_0x006e:
        r2 = defpackage.zgf.a();
        if (r2 == 0) goto L_0x0079;
    L_0x0074:
        r0 = r2.a(r0);
        goto L_0x007f;
    L_0x0079:
        r2 = defpackage.zge.a;
        r0 = r2.callsite(r0);
    L_0x007f:
        r2 = r4.c;
        r2 = r2.get();
        r2 = (defpackage.gqr) r2;
        r3 = defpackage.gqt.NORMAL;
        r2.a(r3, r5, r0, r1);
        return;
    L_0x008d:
        if (r5 != 0) goto L_0x0090;
    L_0x008f:
        return;
    L_0x0090:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwe.accept(java.lang.Object):void");
    }
}
