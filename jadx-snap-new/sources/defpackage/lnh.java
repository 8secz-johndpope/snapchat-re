package defpackage;

import android.database.Cursor;
import com.google.common.base.Supplier;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.query.LegacyProfileQueries;
import com.snap.core.db.query.LegacyProfileQueries.FriendProfileDataRecord;
import com.snap.core.db.record.FriendRecord.UserIdAndUsername;
import java.util.List;
import java.util.Locale;

/* renamed from: lnh */
public final class lnh implements nay {
    final akbk<String> a;
    final Supplier<SnapDb> b;
    final ide c;
    private final ajxe d;
    private final Supplier<gpb> e;
    private final zfw f;

    /* renamed from: lnh$1 */
    static final class 1 extends akcs implements akbk<String> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = Locale.getDefault();
            akcr.a(obj, "Locale.getDefault()");
            String country = obj.getCountry();
            return country == null ? juk.c : country;
        }
    }

    /* renamed from: lnh$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ lnh a;

        a(lnh lnh) {
            this.a = lnh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.b.get()).getDbClient(this.a.c.callsite("DefaultUserDataRepository"));
        }
    }

    /* renamed from: lnh$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ lnh a;

        b(lnh lnh) {
            this.a = lnh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            lnh lnh = this.a;
            String str = abkq.a;
            String str2 = abkq.b;
            String str3 = abkq.c;
            Long l = abkq.h;
            Long valueOf = Long.valueOf(0);
            String str4 = abkq.m;
            if (str4 == null) {
                str4 = abkq.n;
            }
            return new nau(str, str2, str3, l, valueOf, str4 == null ? (String) lnh.a.invoke() : str4, abkq.f);
        }
    }

    /* renamed from: lnh$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lnh a;

        /* renamed from: lnh$c$2 */
        static final class 2<T, R> implements ajfc<T, R> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                FriendProfileDataRecord friendProfileDataRecord = (FriendProfileDataRecord) obj;
                akcr.b(friendProfileDataRecord, "it");
                return new nau(friendProfileDataRecord.friendUserId(), friendProfileDataRecord.friendUsername(), friendProfileDataRecord.friendDisplayName(), friendProfileDataRecord.bitmojiAvatarId(), 56);
            }
        }

        c(lnh lnh) {
            this.a = lnh;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "username");
            obj = LegacyProfileQueries.Companion.getFACTORY().getFriendByUsername(str);
            akcr.a(obj, "LegacyProfileQueries.FAC…riendByUsername(username)");
            return this.a.a().queryAndMapToOne(obj, new akbl<Cursor, FriendProfileDataRecord>(LegacyProfileQueries.Companion.getGET_FRIEND_FROM_USERNAME_MAPPER()) {
                public final String getName() {
                    return "map";
                }

                public final akej getOwner() {
                    return akde.a(ainw.class);
                }

                public final String getSignature() {
                    return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    akcr.b(cursor, "p1");
                    return (FriendProfileDataRecord) ((ainw) this.receiver).map(cursor);
                }
            }).p(2.a);
        }
    }

    /* renamed from: lnh$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list.isEmpty() ? ajvo.a(ajot.a) : ajdp.b(((UserIdAndUsername) ajyu.f(list)).username());
        }
    }

    /* renamed from: lnh$d */
    static final class d extends akcq implements akbl<Cursor, UserIdAndUsername> {
        d(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (UserIdAndUsername) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lnh.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    private lnh(akbk<String> akbk, Supplier<gpb> supplier, Supplier<SnapDb> supplier2, ide ide, zfw zfw) {
        akcr.b(akbk, "deviceCountryCode");
        akcr.b(supplier, "userAuthStore");
        akcr.b(supplier2, "snapDb");
        akcr.b(ide, "attributedFeature");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = akbk;
        this.e = supplier;
        this.b = supplier2;
        this.c = ide;
        this.f = zfw;
        this.d = ajxh.a(new a(this));
    }

    public /* synthetic */ lnh(Supplier supplier, Supplier supplier2, ide ide, zfw zfw) {
        this(1.a, supplier, supplier2, ide, zfw);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x007f in {2, 4, 7, 9} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.ajdp<defpackage.nau> a(defpackage.nay.b r4) {
        /*
        r3 = this;
        r0 = "queryCriteria";
        defpackage.akcr.b(r4, r0);
        r0 = r4 instanceof defpackage.nay.b.b;
        if (r0 == 0) goto L_0x0026;
        r4 = r3.e;
        r4 = r4.get();
        r4 = (defpackage.gpb) r4;
        r4 = r4.c();
        r0 = new lnh$b;
        r0.<init>(r3);
        r0 = (defpackage.ajfc) r0;
        r4 = r4.p(r0);
        r0 = "userAuthStore.get().obse…).map { it.toUserData() }";
        defpackage.akcr.a(r4, r0);
        return r4;
        r0 = r4 instanceof defpackage.nay.b.a;
        if (r0 == 0) goto L_0x0079;
        r4 = (defpackage.nay.b.a) r4;
        r4 = r4.a;
        r0 = com.snap.core.db.record.FriendRecord.FACTORY;
        r1 = 1;
        r1 = new java.lang.String[r1];
        r2 = 0;
        r4 = r4.a;
        r1[r2] = r4;
        r4 = r0.selectUserNameByUserIds(r1);
        r0 = "FriendRecord.FACTORY.sel…ds(arrayOf(userId.value))";
        defpackage.akcr.a(r4, r0);
        r0 = r3.a();
        r1 = new lnh$d;
        r2 = com.snap.core.db.record.FriendRecord.SELECT_USERNAME_BY_USER_IDS_MAPPER;
        r1.<init>(r2);
        r1 = (defpackage.akbl) r1;
        r4 = r0.queryAndMapToList(r4, r1);
        r0 = defpackage.lnh.e.a;
        r0 = (defpackage.ajfc) r0;
        r4 = r4.u(r0);
        r0 = "dbClient.queryAndMapToLi…      }\n                }";
        defpackage.akcr.a(r4, r0);
        r0 = new lnh$c;
        r0.<init>(r3);
        r0 = (defpackage.ajfc) r0;
        r4 = r4.u(r0);
        r0 = r3.f;
        r0 = r0.i();
        r0 = (defpackage.ajdw) r0;
        r4 = r4.b(r0);
        r0 = "usernameFromUserId(query…fiedSchedulers.queries())";
        goto L_0x0022;
        r4 = new ajxk;
        r4.<init>();
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnh.a(nay$b):ajdp");
    }

    /* Access modifiers changed, original: final */
    public final DbClient a() {
        return (DbClient) this.d.b();
    }
}
