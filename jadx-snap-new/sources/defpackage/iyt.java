package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendRecord;
import com.snapchat.android.R;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: iyt */
public final class iyt extends ajed implements iqv {
    final ajxe a;
    final ajwy<zgb> b;
    final gpb c;
    final Context d;
    final Set<itr> e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j = ajxh.a(new w(this));
    private final ajei k = new ajei();
    private final ajdx<ira> l;
    private final ajdx<iqm> m;
    private final ajdx<prx> n;

    /* renamed from: iyt$e */
    static final class e extends akcq implements akbk<ixj> {
        e(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ixj) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: iyt$y */
    static final class y extends akcq implements akbk<ixp> {
        y(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ixp) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: iyt$f */
    static final class f extends akcq implements akbk<ixk> {
        f(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ixk) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: iyt$c */
    static final class c extends akcq implements akbk<ixh> {
        c(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ixh) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: iyt$d */
    static final class d extends akcs implements akbk<DbClient> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((SnapDb) this.a.get()).getDbClient((ide) irc.t);
        }
    }

    /* renamed from: iyt$w */
    static final class w extends akcs implements akbk<zfw> {
        private /* synthetic */ iyt a;

        w(iyt iyt) {
            this.a = iyt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.b.get();
            return zgb.a(irc.t.callsite("FriendActionProcessorImpl"));
        }
    }

    /* renamed from: iyt$x */
    static final class x implements Runnable {
        private /* synthetic */ iyt a;

        x(iyt iyt) {
            this.a = iyt;
        }

        public final void run() {
            Toast.makeText(this.a.d, R.string.no_sms_application, 0).show();
        }
    }

    /* renamed from: iyt$a */
    static final class a<T> implements ajfb<Long> {
        final /* synthetic */ iyt a;
        final /* synthetic */ agzs b;

        a(iyt iyt, agzs agzs) {
            this.a = iyt;
            this.b = agzs;
        }

        public final /* synthetic */ void accept(Object obj) {
            final Long l = (Long) obj;
            ((DbClient) this.a.i.b()).runInTransaction("onFriendRes", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ a a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    String str = "tx";
                    akcr.b(dbTransaction, str);
                    ixp b = this.a.a.b();
                    Object obj2 = l;
                    String str2 = "friendKey";
                    akcr.a(obj2, str2);
                    b.a(obj2.longValue(), true, dbTransaction);
                    ixk c = this.a.a.c();
                    Object obj3 = l;
                    akcr.a(obj3, str2);
                    long longValue = obj3.longValue();
                    akcr.b(dbTransaction, str);
                    c.b.throwIfNotDbScheduler();
                    c.a().bind(true, longValue);
                    Object obj4 = c.a;
                    akcr.a(obj4, "briteDatabase");
                    BriteDatabaseExtensionsKt.executeUpdate(obj4, c.a(), dbTransaction);
                    ixh ixh = (ixh) this.a.a.a.b();
                    Object obj5 = l;
                    akcr.a(obj5, str2);
                    ixh.a(obj5.longValue(), dbTransaction);
                    for (itr a : this.a.a.e) {
                        a.a(this.a.b.a, "onAddFriendEvent");
                    }
                    return ajxw.a;
                }
            }).e();
        }
    }

    /* renamed from: iyt$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: iyt$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ isj a;

        g(isj isj) {
            this.a = isj;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ira ira = (ira) obj;
            akcr.b(ira, "it");
            return ira.a(this.a);
        }
    }

    /* renamed from: iyt$h */
    static final class h<T, R> implements ajfc<agzs, ajdb> {
        private /* synthetic */ iyt a;

        h(iyt iyt) {
            this.a = iyt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            agzs agzs = (agzs) obj;
            akcr.b(agzs, "it");
            iyt iyt = this.a;
            if (agzs.a != null) {
                obj = iyt.a().a(agzs.a).a((ajdw) iyt.d().m()).c((ajfb) new a(iyt, agzs)).d((ajfb) b.a).e();
                str = "friendRepository\n       …         .ignoreElement()";
            } else {
                obj = ajvo.a(ajhn.a);
                str = "Completable.complete()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: iyt$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ isl a;

        i(isl isl) {
            this.a = isl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ira ira = (ira) obj;
            akcr.b(ira, "it");
            return ira.a(this.a);
        }
    }

    /* renamed from: iyt$j */
    static final class j<T, R> implements ajfc<agzs, ajdb> {
        final /* synthetic */ iyt a;
        final /* synthetic */ isl b;

        /* renamed from: iyt$j$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ j a;

            1(j jVar) {
                this.a = jVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DbTransaction dbTransaction = (DbTransaction) obj;
                akcr.b(dbTransaction, "it");
                iyt iyt = this.a.a;
                isl isl = this.a.b;
                iyt.c().a(isl.c, dbTransaction);
                for (itr a : iyt.e) {
                    a.a(isl.c, "onBlockFriendEvent");
                }
                return ajxw.a;
            }
        }

        j(iyt iyt, isl isl) {
            this.a = iyt;
            this.b = isl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((agzs) obj, "it");
            return ((DbClient) this.a.i.b()).runInTransaction("onBlockFriend", new 1(this));
        }
    }

    /* renamed from: iyt$k */
    static final class k<T, R> implements ajfc<prx, ajdb> {
        private /* synthetic */ isl a;

        k(isl isl) {
            this.a = isl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "it");
            return prx.d(this.a.b);
        }
    }

    /* renamed from: iyt$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ist a;

        l(ist ist) {
            this.a = ist;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ira ira = (ira) obj;
            akcr.b(ira, "it");
            return ira.a(this.a);
        }
    }

    /* renamed from: iyt$m */
    static final class m<T, R> implements ajfc<ahef, ajdb> {
        final /* synthetic */ iyt a;
        final /* synthetic */ ist b;

        /* renamed from: iyt$m$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ m a;

            1(m mVar) {
                this.a = mVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DbTransaction dbTransaction = (DbTransaction) obj;
                String str = "tx";
                akcr.b(dbTransaction, str);
                ixp b = this.a.a.b();
                String str2 = this.a.b.a;
                String str3 = "username";
                akcr.b(str2, str3);
                akcr.b(dbTransaction, str);
                b.b.throwIfNotDbScheduler();
                akcr.b(str2, str3);
                DbClient dbClient = b.a;
                Object selectIdForKey = FriendRecord.FACTORY.selectIdForKey(str2);
                akcr.a(selectIdForKey, "FriendRecord.FACTORY.selectIdForKey(username)");
                Object selectIdForKeyMapper = FriendRecord.FACTORY.selectIdForKeyMapper();
                akcr.a(selectIdForKeyMapper, "FriendRecord.FACTORY.selectIdForKeyMapper()");
                Object queryFirst = dbClient.queryFirst(selectIdForKey, selectIdForKeyMapper, Long.valueOf(-1));
                akcr.a(queryFirst, "briteDatabase.queryFirst…r(),\n                -1L)");
                long longValue = ((Number) queryFirst).longValue();
                if (longValue != -1) {
                    b.b().bind(true, longValue);
                    queryFirst = b.a;
                    akcr.a(queryFirst, "briteDatabase");
                    BriteDatabaseExtensionsKt.executeUpdate(queryFirst, b.b(), dbTransaction);
                }
                return ajxw.a;
            }
        }

        m(iyt iyt, ist ist) {
            this.a = iyt;
            this.b = ist;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ahef) obj, "it");
            return ((DbClient) this.a.i.b()).runInTransaction("onHideSuggestedFriend", new 1(this));
        }
    }

    /* renamed from: iyt$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ isv a;

        n(isv isv) {
            this.a = isv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ira ira = (ira) obj;
            akcr.b(ira, "it");
            return ira.a(this.a);
        }
    }

    /* renamed from: iyt$o */
    static final class o<T, R> implements ajfc<agzs, ajdb> {
        final /* synthetic */ iyt a;
        final /* synthetic */ isv b;

        /* renamed from: iyt$o$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ o a;

            1(o oVar) {
                this.a = oVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DbTransaction dbTransaction = (DbTransaction) obj;
                akcr.b(dbTransaction, "it");
                iyt iyt = this.a.a;
                isv isv = this.a.b;
                ixk c = iyt.c();
                String str = isv.a;
                String str2 = "username";
                akcr.b(str, str2);
                akcr.b(dbTransaction, "tx");
                c.b.throwIfNotDbScheduler();
                akcr.b(str, str2);
                DbClient dbClient = c.a;
                Object selectIdForKey = FriendRecord.FACTORY.selectIdForKey(str);
                akcr.a(selectIdForKey, "FriendRecord.FACTORY.selectIdForKey(username)");
                Object selectIdForKeyMapper = FriendRecord.FACTORY.selectIdForKeyMapper();
                akcr.a(selectIdForKeyMapper, "FriendRecord.FACTORY.selectIdForKeyMapper()");
                selectIdForKey = dbClient.queryFirst(selectIdForKey, selectIdForKeyMapper, Long.valueOf(-1));
                akcr.a(selectIdForKey, "briteDatabase.queryFirst…r(),\n                -1L)");
                long longValue = ((Number) selectIdForKey).longValue();
                if (longValue != -1) {
                    c.b().bind(true, longValue);
                    selectIdForKey = c.a;
                    akcr.a(selectIdForKey, "briteDatabase");
                    BriteDatabaseExtensionsKt.executeUpdate(selectIdForKey, c.b(), dbTransaction);
                }
                return ajxw.a;
            }
        }

        o(iyt iyt, isv isv) {
            this.a = iyt;
            this.b = isv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((agzs) obj, "it");
            return ((DbClient) this.a.i.b()).runInTransaction("onIgnoreFriend", new 1(this));
        }
    }

    /* renamed from: iyt$p */
    static final class p<T, R> implements ajfc<prx, ajdb> {
        private /* synthetic */ isv a;

        p(isv isv) {
            this.a = isv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "it");
            return prx.d(this.a.a);
        }
    }

    /* renamed from: iyt$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ isw a;

        q(isw isw) {
            this.a = isw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iqm iqm = (iqm) obj;
            akcr.b(iqm, "it");
            return iqm.a(this.a);
        }
    }

    /* renamed from: iyt$r */
    static final class r<T> implements ajfb<ahas> {
        private /* synthetic */ iyt a;
        private /* synthetic */ isw b;

        r(iyt iyt, isw isw) {
            this.a = iyt;
            this.b = isw;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) ((ahas) obj).a.get(this.b.a);
            if (str != null) {
                akcr.a(Uri.parse(str).toString(), "Uri.parse(inviteLink).toString()");
                str = this.a.d.getString(R.string.invite_friend_message_body_with_invite_link, new Object[]{this.a.c.b(), obj});
                iyt iyt = this.a;
                String str2 = this.b.a;
                akcr.a((Object) str, "msgBody");
                iyt.a(str2, str);
            }
        }
    }

    /* renamed from: iyt$s */
    static final class s<T> implements ajfb<Throwable> {
        private /* synthetic */ iyt a;
        private /* synthetic */ isw b;

        s(iyt iyt, isw isw) {
            this.a = iyt;
            this.b = isw;
        }

        public final /* synthetic */ void accept(Object obj) {
            String string = this.a.d.getString(R.string.invite_friend_message_body_with_invite_link, new Object[]{this.a.c.b(), this.a.c.b()});
            iyt iyt = this.a;
            String str = this.b.a;
            akcr.a((Object) string, "msgBody");
            iyt.a(str, string);
        }
    }

    /* renamed from: iyt$t */
    static final class t<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ itc a;

        t(itc itc) {
            this.a = itc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ira ira = (ira) obj;
            akcr.b(ira, "it");
            return ira.a(this.a);
        }
    }

    /* renamed from: iyt$u */
    static final class u<T, R> implements ajfc<agzs, ajdb> {
        final /* synthetic */ iyt a;
        final /* synthetic */ itc b;

        /* renamed from: iyt$u$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ u a;

            1(u uVar) {
                this.a = uVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DbTransaction dbTransaction = (DbTransaction) obj;
                akcr.b(dbTransaction, "it");
                this.a.a.a(this.a.b, dbTransaction);
                return ajxw.a;
            }
        }

        u(iyt iyt, itc itc) {
            this.a = iyt;
            this.b = itc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((agzs) obj, "it");
            return ((DbClient) this.a.i.b()).runInTransaction("onRemoveFriend", new 1(this));
        }
    }

    /* renamed from: iyt$v */
    static final class v<T, R> implements ajfc<prx, ajdb> {
        private /* synthetic */ itc a;

        v(itc itc) {
            this.a = itc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prx prx = (prx) obj;
            akcr.b(prx, "it");
            return prx.d(this.a.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iyt.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/db/FriendRepository;"), new akdc(akde.a(iyt.class), "suggestedFriendRepository", "getSuggestedFriendRepository()Lcom/snap/identity/db/SuggestedFriendRepository;"), new akdc(akde.a(iyt.class), "friendWhoAddedMeRepository", "getFriendWhoAddedMeRepository()Lcom/snap/identity/db/FriendWhoAddedMeRepository;"), new akdc(akde.a(iyt.class), "contactRepository", "getContactRepository()Lcom/snap/identity/db/ContactRepository;"), new akdc(akde.a(iyt.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(iyt.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public iyt(ajwy<zgb> ajwy, ajdx<ira> ajdx, aipn<ixj> aipn, aipn<ixp> aipn2, aipn<ixk> aipn3, gpb gpb, Context context, ajdx<iqm> ajdx2, Set<itr> set, aipn<ixh> aipn4, ajdx<prx> ajdx3, ajwy<SnapDb> ajwy2) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(ajdx, "identityApi");
        akcr.b(aipn, "friendRepositoryLazy");
        akcr.b(aipn2, "suggestedFriendRepositoryLazy");
        akcr.b(aipn3, "friendWhoAddedMeRepositoryLazy");
        akcr.b(gpb, "userAuthStore");
        akcr.b(context, "context");
        akcr.b(ajdx2, "contactApi");
        akcr.b(set, "friendUpdatesProcessors");
        akcr.b(aipn4, "contactRepositoryLazy");
        akcr.b(ajdx3, "messagingApi");
        akcr.b(ajwy2, "snapDb");
        this.b = ajwy;
        this.l = ajdx;
        this.c = gpb;
        this.d = context;
        this.m = ajdx2;
        this.e = set;
        this.n = ajdx3;
        this.f = ajxh.a(new e(aipn));
        this.g = ajxh.a(new y(aipn2));
        this.h = ajxh.a(new f(aipn3));
        this.a = ajxh.a(new c(aipn4));
        this.i = ajxh.a(new d(ajwy2));
    }

    public final ajcx a(isj isj) {
        akcr.b(isj, "event");
        ajcx e = this.l.a((ajfc) new g(isj)).e((ajfc) new h(this));
        akcr.a((Object) e, "identityApi\n            …applyFriendResponse(it) }");
        Object a = a().a(isj.b, e);
        akcr.a(a, "friendRepository.startFr…vent.userId, completable)");
        return a;
    }

    public final ajcx a(isl isl) {
        akcr.b(isl, "event");
        Object e = this.l.a((ajfc) new i(isl)).e((ajfc) new j(this, isl)).b((ajeb) this.n).e((ajfc) new k(isl));
        akcr.a(e, "identityApi\n            …sername(event.username) }");
        return e;
    }

    public final ajcx a(ist ist) {
        akcr.b(ist, "event");
        Object e = this.l.a((ajfc) new l(ist)).e((ajfc) new m(this, ist));
        akcr.a(e, "identityApi\n            …      }\n                }");
        return e;
    }

    public final ajcx a(isv isv) {
        akcr.b(isv, "event");
        Object e = this.l.a((ajfc) new n(isv)).e((ajfc) new o(this, isv)).b((ajeb) this.n).e((ajfc) new p(isv));
        akcr.a(e, "identityApi\n            …sername(event.username) }");
        return e;
    }

    public final ajcx a(itc itc) {
        akcr.b(itc, "event");
        Object e = this.l.a((ajfc) new t(itc)).e((ajfc) new u(this, itc)).b((ajeb) this.n).e((ajfc) new v(itc));
        akcr.a(e, "identityApi\n            …sername(event.username) }");
        return e;
    }

    public final ajej a(isw isw) {
        akcr.b(isw, "event");
        Object a = this.m.a((ajfc) new q(isw)).a((ajdw) d().h()).a((ajfb) new r(this, isw), (ajfb) new s(this, isw));
        akcr.a(a, "contactApi\n             …      }\n                )");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final ixj a() {
        return (ixj) this.f.b();
    }

    public final void a(isj isj, akbl<? super ajcx, ? extends ajcx> akbl) {
        akcr.b(isj, "event");
        akcr.b(akbl, "completionHandler");
        this.k.a(((ajcx) akbl.invoke(a(isj))).e());
    }

    public final void a(itc itc, DbTransaction dbTransaction) {
        akcr.b(itc, "event");
        String str = "tx";
        akcr.b(dbTransaction, str);
        long f = a().f(itc.a);
        a().a(Long.valueOf(f), FriendLinkType.DELETED);
        ixp b = b();
        akcr.b(dbTransaction, str);
        b.b.throwIfNotDbScheduler();
        b.a().bind(f);
        b.a.executeUpdateDelete(b.a(), dbTransaction);
        b.c().bind(f);
        b.a.executeUpdateDelete(b.c(), dbTransaction);
        c().a(itc.b, dbTransaction);
        for (itr a : this.e) {
            a.a(itc.b, "onRemoveFriendEvent");
        }
    }

    public final void a(String str, String str2) {
        akcr.b(str, "phoneNumber");
        akcr.b(str2, "msgBody");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("smsto:".concat(String.valueOf(str))));
        intent.putExtra("address", str);
        intent.putExtra("sms_body", str2);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        try {
            this.d.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            d().l().a((Runnable) new x(this));
        }
    }

    /* Access modifiers changed, original: final */
    public final ixp b() {
        return (ixp) this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final ixk c() {
        return (ixk) this.h.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw d() {
        return (zfw) this.j.b();
    }

    public final void onDispose() {
        this.k.dispose();
    }
}
