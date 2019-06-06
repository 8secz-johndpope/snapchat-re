package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: cup */
public final class cup implements cjt {
    private final ajxe a;
    private final ajxe b;

    /* renamed from: cup$b */
    static final class b extends akcq implements akbk<ilv> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: cup$a */
    static final class a extends akcq implements akbk<gqr> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cup.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;"), new akdc(akde.a(cup.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;")};
    }

    public cup(ajwy<gqr> ajwy, ajwy<ilv> ajwy2) {
        akcr.b(ajwy, "exceptionTrackerProvider");
        akcr.b(ajwy2, "grapheneProvider");
        this.a = ajxh.a(new b(ajwy2));
        this.b = ajxh.a(new a(ajwy));
    }

    private final ilv a() {
        return (ilv) this.a.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    public final void a(defpackage.ckt r6, defpackage.idd r7, java.lang.String r8, java.lang.Throwable r9, boolean r10) {
        /*
        r5 = this;
        r0 = "issueSeverity";
        defpackage.akcr.b(r6, r0);
        r0 = "callsite";
        defpackage.akcr.b(r7, r0);
        r0 = "cause";
        defpackage.akcr.b(r8, r0);
        r1 = "throwable";
        defpackage.akcr.b(r9, r1);
        r1 = r8;
        r1 = (java.lang.CharSequence) r1;
        r2 = " ";
        r2 = (java.lang.CharSequence) r2;
        r3 = 0;
        r1 = defpackage.akgc.a(r1, r2, r3);
        r2 = 1;
        r1 = r1 ^ r2;
        com.google.common.base.Preconditions.checkArgument(r1);
        r1 = defpackage.ckt.HIGH;
        r1 = (java.lang.Enum) r1;
        r6.compareTo(r1);
        r1 = r5.b;
        r1 = r1.b();
        r1 = (defpackage.gqr) r1;
        r3 = defpackage.cuq.a;
        r4 = r6.ordinal();
        r3 = r3[r4];
        if (r3 == r2) goto L_0x0044;
    L_0x003e:
        r2 = 2;
        if (r3 == r2) goto L_0x004a;
    L_0x0041:
        r2 = 3;
        if (r3 == r2) goto L_0x0047;
    L_0x0044:
        r2 = defpackage.gqt.NORMAL;
        goto L_0x004c;
    L_0x0047:
        r2 = defpackage.gqt.UBN;
        goto L_0x004c;
    L_0x004a:
        r2 = defpackage.gqt.HIGH;
    L_0x004c:
        r1.a(r2, r9, r7);
        r7 = r9.getClass();
        r7 = r7.getSimpleName();
        if (r10 == 0) goto L_0x0067;
    L_0x0059:
        r9 = r9.getCause();
        if (r9 == 0) goto L_0x0067;
    L_0x005f:
        r7 = r9.getClass();
        r7 = r7.getSimpleName();
    L_0x0067:
        r9 = r5.a();
        r10 = defpackage.inm.OPS_ISSUE;
        r6 = (java.lang.Enum) r6;
        r1 = "severity";
        r6 = r10.a(r1, r6);
        r6 = r6.a(r0, r8);
        r8 = "exceptionName";
        defpackage.akcr.a(r7, r8);
        r8 = "exception";
        r6 = r6.a(r8, r7);
        r9.c(r6, 1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cup.a(ckt, idd, java.lang.String, java.lang.Throwable, boolean):void");
    }

    public final void a(ckt ckt, String str) {
        akcr.b(ckt, "issueSeverity");
        String str2 = "cause";
        akcr.b(str, str2);
        Preconditions.checkArgument(akgc.a((CharSequence) str, (CharSequence) " ", false) ^ 1);
        ckt.compareTo(ckt.HIGH);
        a().c(inm.OPS_ISSUE.a("severity", (Enum) ckt).a(str2, str), 1);
    }
}
