package defpackage;

/* renamed from: hkq */
public final class hkq implements hko {
    private final yui a;
    private final hcf b;

    /* renamed from: hkq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public hkq(yui yui, hcf hcf) {
        akcr.b(yui, "optInNotifConfiguration");
        akcr.b(hcf, "storyFriendsDataManager");
        this.a = yui;
        this.b = hcf;
    }

    public final ajdj<hkx> a(vii vii, hjx hjx) {
        akcr.b(vii, "storyCard");
        akcr.b(hjx, "clientDataModel");
        Object a = hiy.a(hjx.a().b());
        akcr.a(a, "CompositeStoryIdUtils.na….data.compositeStoryId())");
        Object b = ajdj.b(new hkr(a, vii, hjx));
        akcr.a(b, "Maybe.just(\n            …lientDataModel)\n        )");
        return b;
    }

    /* JADX WARNING: Missing block: B:8:0x004d, code skipped:
            if (defpackage.ajym.b((java.lang.Object[]) new com.snap.core.db.column.FriendLinkType[]{com.snap.core.db.column.FriendLinkType.MUTUAL, com.snap.core.db.column.FriendLinkType.BLOCKED, com.snap.core.db.column.FriendLinkType.DELETED}).contains(r6) == false) goto L_0x0033;
     */
    public final boolean a(defpackage.vii r6) {
        /*
        r5 = this;
        r0 = "storyCard";
        defpackage.akcr.b(r6, r0);
        r0 = r6.i();
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0050;
    L_0x000d:
        r0 = r6.d;
        r3 = "storyCard.compositeStoryId";
        defpackage.akcr.a(r0, r3);
        r0 = r0.a();
        r3 = 26;
        if (r0 == r3) goto L_0x0050;
    L_0x001c:
        r6 = r6.j();
        r0 = r5.b;
        r6 = r6.a;
        r3 = "publicUser.metadata";
        defpackage.akcr.a(r6, r3);
        r6 = r6.c();
        r6 = r0.a(r6);
        if (r6 != 0) goto L_0x0035;
    L_0x0033:
        r6 = 1;
        goto L_0x0051;
    L_0x0035:
        r0 = 3;
        r0 = new com.snap.core.db.column.FriendLinkType[r0];
        r3 = com.snap.core.db.column.FriendLinkType.MUTUAL;
        r0[r1] = r3;
        r3 = com.snap.core.db.column.FriendLinkType.BLOCKED;
        r0[r2] = r3;
        r3 = 2;
        r4 = com.snap.core.db.column.FriendLinkType.DELETED;
        r0[r3] = r4;
        r0 = defpackage.ajym.b(r0);
        r6 = r0.contains(r6);
        if (r6 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0033;
    L_0x0050:
        r6 = 0;
    L_0x0051:
        if (r6 == 0) goto L_0x005a;
    L_0x0053:
        r6 = r5.a;
        r6 = r6.b;
        if (r6 == 0) goto L_0x005a;
    L_0x0059:
        return r2;
    L_0x005a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkq.a(vii):boolean");
    }
}
