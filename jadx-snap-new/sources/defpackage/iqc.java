package defpackage;

/* renamed from: iqc */
public final class iqc {
    private final ajxe a;

    /* renamed from: iqc$a */
    static final class a extends akcq implements akbk<ilv> {
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
            return (ilv) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(iqc.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;");
    }

    public iqc(ajwy<ilv> ajwy) {
        akcr.b(ajwy, "grapheneProvider");
        this.a = ajxh.a(new a(ajwy));
    }

    public final ilv a() {
        return (ilv) this.a.b();
    }

    /* JADX WARNING: Missing block: B:3:0x0019, code skipped:
            if (r5 == null) goto L_0x001b;
     */
    public final void a(defpackage.iqd r4, com.snap.core.db.column.FriendLinkType r5) {
        /*
        r3 = this;
        r0 = "source";
        defpackage.akcr.b(r4, r0);
        r1 = r3.a();
        r2 = defpackage.iob.DB_USERNAME_UPDATED;
        r4 = r4.name();
        r4 = r2.a(r0, r4);
        if (r5 == 0) goto L_0x001b;
    L_0x0015:
        r5 = r5.name();
        if (r5 != 0) goto L_0x001d;
    L_0x001b:
        r5 = "null";
    L_0x001d:
        r0 = "link_type";
        r4 = r4.a(r0, r5);
        r1.c(r4, 1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqc.a(iqd, com.snap.core.db.column.FriendLinkType):void");
    }

    /* JADX WARNING: Missing block: B:3:0x0019, code skipped:
            if (r5 == null) goto L_0x001b;
     */
    public final void a(defpackage.iqd r4, com.snap.core.db.column.FriendLinkType r5, boolean r6) {
        /*
        r3 = this;
        r0 = "source";
        defpackage.akcr.b(r4, r0);
        r1 = r3.a();
        r2 = defpackage.iob.DB_CONFLICT;
        r4 = r4.name();
        r4 = r2.a(r0, r4);
        if (r5 == 0) goto L_0x001b;
    L_0x0015:
        r5 = r5.name();
        if (r5 != 0) goto L_0x001d;
    L_0x001b:
        r5 = "null";
    L_0x001d:
        r0 = "link_type";
        r4 = r4.a(r0, r5);
        r5 = java.lang.String.valueOf(r6);
        r6 = "has_user_id";
        r4 = r4.a(r6, r5);
        r1.c(r4, 1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqc.a(iqd, com.snap.core.db.column.FriendLinkType, boolean):void");
    }
}
