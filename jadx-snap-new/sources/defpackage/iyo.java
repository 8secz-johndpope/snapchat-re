package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.util.Patterns;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventType;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.ContactModel.ClearAll;
import com.snap.core.db.record.ContactModel.RemoveAddedContact;
import com.snap.identity.IdentityHttpInterface;
import com.snap.identity.job.FullContactSyncJob;
import defpackage.ixh.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: iyo */
public final class iyo implements iqm {
    final ajxe a;
    final ajwl<String> b;
    final Context c;
    final ihh d;
    final aipn<IdentityHttpInterface> e;
    final aipn<ixh> f;
    final aipn<abna> g;
    final gpb h;
    final iqc i;
    final ajwy<hwl> j;
    final abss k;
    private final zfw l = zgb.a(irc.t.callsite("ContactClient"));
    private final ajxe m;
    private final ajxe n;
    private final ftl o;
    private final tnj p;

    /* renamed from: iyo$s */
    static final class s extends akcq implements akbk<SnapDb> {
        s(aipn aipn) {
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
            return (SnapDb) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: iyo$b */
    static final class b extends akcs implements akbk<DbClient> {
        private /* synthetic */ iyo a;

        b(iyo iyo) {
            this.a = iyo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.h().getDbClient((ide) irc.t);
        }
    }

    /* renamed from: iyo$c */
    static final class c extends akcs implements akbk<hwl> {
        private /* synthetic */ iyo a;

        c(iyo iyo) {
            this.a = iyo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (hwl) this.a.j.get();
        }
    }

    /* renamed from: iyo$l */
    static final class l<T, R> implements ajfc<T, R> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return abkq.b;
        }
    }

    /* renamed from: iyo$m */
    static final class m<T> implements ajfb<ajej> {
        private /* synthetic */ iyo a;

        m(iyo iyo) {
            this.a = iyo;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.a(this.a.h.b());
        }
    }

    /* renamed from: iyo$n */
    static final class n<T, R> implements ajfc<T, R> {
        public static final n a = new n();

        n() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return Boolean.valueOf(iyp.a(str));
        }
    }

    /* renamed from: iyo$h */
    static final class h<V> implements Callable<T> {
        private /* synthetic */ iyo a;

        h(iyo iyo) {
            this.a = iyo;
        }

        public final /* synthetic */ Object call() {
            Set a = iyp.a(this.a.c);
            if (this.a.k.l()) {
                long b = (long) iyp.b(this.a.c);
                this.a.i.a().b((ily) ind.FRIENDING_CONTACT_SIZE, b);
                b = (long) iyp.c(this.a.c);
                this.a.i.a().b((ily) ind.FRIENDING_CONTACT_EMAIL_SIZE, b);
                b = (long) a.size();
                this.a.i.a().b((ily) ind.FRIENDING_CONTACT_PHONE_SIZE, b);
            }
            return a;
        }
    }

    /* renamed from: iyo$o */
    static final class o<V> implements Callable<T> {
        private /* synthetic */ isw a;

        o(isw isw) {
            this.a = isw;
        }

        public final /* synthetic */ Object call() {
            aeoq aeoq = new aeoq();
            aeoq.a = this.a.a;
            aeoq.b = this.a.b;
            List a = ajyl.a(aeoq);
            ahaq ahaq = new ahaq();
            ahaq.a = a;
            return ahaq;
        }
    }

    /* renamed from: iyo$d */
    static final class d<T1, T2, R> implements ajex<Set<? extends iqi>, agze, ajdx<agze>> {
        private /* synthetic */ iyo a;

        d(iyo iyo) {
            this.a = iyo;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Set set = (Set) obj;
            final agze agze = (agze) obj2;
            akcr.b(set, "localContacts");
            akcr.b(agze, "resp");
            ixh ixh = (ixh) this.a.f.get();
            akcr.b(agze, EventType.RESPONSE);
            akcr.b(set, "contactsInAddressBook");
            return ixh.b().runInTransaction("ContactRepository:applyContactUpdate", new a(ixh, agze, set)).c((Callable) new Callable<agze>() {
                public final /* bridge */ /* synthetic */ Object call() {
                    return agze;
                }
            });
        }
    }

    /* renamed from: iyo$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdx ajdx = (ajdx) obj;
            akcr.b(ajdx, "it");
            return ajdx;
        }
    }

    /* renamed from: iyo$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ iyo a;
        final /* synthetic */ boolean b = false;
        final /* synthetic */ agzc.a c;
        final /* synthetic */ boolean d;

        f(iyo iyo, boolean z, agzc.a aVar, boolean z2) {
            this.a = iyo;
            this.c = aVar;
            this.d = z2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Set set = (Set) obj;
            akcr.b(set, "allContactPhoneNumbers");
            return ajdx.c((Callable) new Callable<T>(this) {
                private /* synthetic */ f a;

                /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x00e8 in {6, 11, 12, 17, 18, 20, 22} preds:[]
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                    	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                    	at java.util.ArrayList.forEach(ArrayList.java:1257)
                    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
                    	at java.lang.Iterable.forEach(Iterable.java:75)
                    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:37)
                    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                    */
                public final /* synthetic */ java.lang.Object call() {
                    /*
                    r9 = this;
                    r0 = r9.a;
                    r0 = r0.a;
                    r0 = r0.c;
                    r1 = r9.a;
                    r1 = r1.b;
                    r2 = r9.a;
                    r2 = r2.c;
                    r3 = r9.a;
                    r3 = r3.d;
                    r4 = r2;
                    r5 = "allContactPhoneNumbers";
                    defpackage.akcr.a(r4, r5);
                    r5 = r9.a;
                    r5 = r5.a;
                    r5 = r5.g;
                    r5 = r5.get();
                    r6 = "deviceTokenProvider.get()";
                    defpackage.akcr.a(r5, r6);
                    r5 = (defpackage.abna) r5;
                    r6 = r9.a;
                    r6 = r6.a;
                    r6 = r6.h;
                    r7 = "context";
                    defpackage.akcr.b(r0, r7);
                    r7 = "findFriendSource";
                    defpackage.akcr.b(r2, r7);
                    r7 = "phoneNumbersToContacts";
                    defpackage.akcr.b(r4, r7);
                    r7 = "deviceTokenProvider";
                    defpackage.akcr.b(r5, r7);
                    r7 = "userAuthStore";
                    defpackage.akcr.b(r6, r7);
                    r7 = new java.util.HashMap;
                    r7.<init>();
                    if (r3 != 0) goto L_0x006a;
                    if (r1 != 0) goto L_0x006a;
                    r3 = r4.iterator();
                    r4 = r3.hasNext();
                    if (r4 == 0) goto L_0x006a;
                    r4 = r3.next();
                    r4 = (defpackage.iqi) r4;
                    r8 = r4.a;
                    r4 = r4.b;
                    r7.put(r8, r4);
                    goto L_0x0056;
                    r3 = new agzc;
                    r3.<init>();
                    r4 = defpackage.iha.a();
                    r4 = r4.b(r7);
                    r3.c = r4;
                    r4 = "phone";
                    r0 = r0.getSystemService(r4);
                    if (r0 == 0) goto L_0x00e0;
                    r0 = (android.telephony.TelephonyManager) r0;
                    r4 = r0.getNetworkCountryIso();
                    r4 = (java.lang.CharSequence) r4;
                    r4 = android.text.TextUtils.isEmpty(r4);
                    if (r4 == 0) goto L_0x0092;
                    r0 = "us";
                    goto L_0x009b;
                    r0 = r0.getNetworkCountryIso();
                    r4 = "telephonyManager.networkCountryIso";
                    defpackage.akcr.a(r0, r4);
                    r4 = java.util.Locale.US;
                    r7 = "Locale.US";
                    defpackage.akcr.a(r4, r7);
                    if (r0 == 0) goto L_0x00d8;
                    r0 = r0.toUpperCase(r4);
                    r4 = "(this as java.lang.String).toUpperCase(locale)";
                    defpackage.akcr.a(r0, r4);
                    r3.d = r0;
                    r0 = r1 ^ 1;
                    r0 = java.lang.Boolean.valueOf(r0);
                    r3.g = r0;
                    r0 = r2.a();
                    r3.h = r0;
                    r0 = r6.b();
                    r1 = r3.C;
                    r2 = r3.D;
                    r0 = r5.a(r0, r1, r2);
                    if (r0 == 0) goto L_0x00d7;
                    r1 = r0.first;
                    r1 = (java.lang.String) r1;
                    r3.a = r1;
                    r0 = r0.second;
                    r0 = (java.lang.String) r0;
                    r3.b = r0;
                    return r3;
                    r0 = new ajxt;
                    r1 = "null cannot be cast to non-null type java.lang.String";
                    r0.<init>(r1);
                    throw r0;
                    r0 = new ajxt;
                    r1 = "null cannot be cast to non-null type android.telephony.TelephonyManager";
                    r0.<init>(r1);
                    throw r0;
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.iyo$f$1.call():java.lang.Object");
                }
            });
        }
    }

    /* renamed from: iyo$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ iyo a;

        g(iyo iyo) {
            this.a = iyo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agzc agzc = (agzc) obj;
            akcr.b(agzc, "req");
            return ((IdentityHttpInterface) this.a.e.get()).submitFindFriendRequest(agzc);
        }
    }

    /* renamed from: iyo$i */
    static final class i<T> implements ajfl<ifx> {
        private /* synthetic */ ifu a;

        i(ifu ifu) {
            this.a = ifu;
        }

        public final /* synthetic */ boolean test(Object obj) {
            ifx ifx = (ifx) obj;
            akcr.b(ifx, "it");
            return ifx.a(this.a);
        }
    }

    /* renamed from: iyo$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ iyo a;
        private /* synthetic */ Activity b;

        j(iyo iyo, Activity activity) {
            this.a = iyo;
            this.b = activity;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ifx ifx = (ifx) obj;
            akcr.b(ifx, "it");
            Object obj2 = "";
            if (!ifx.b()) {
                return ajdx.b(obj2);
            }
            obj = this.b.getApplicationContext();
            akcr.a(obj, "activity.applicationContext");
            AccountManager accountManager = AccountManager.get(obj);
            if (accountManager != null) {
                Account[] accounts = accountManager.getAccounts();
                if (accounts != null) {
                    Iterator a = akci.a(accounts);
                    while (a.hasNext()) {
                        Account account = (Account) a.next();
                        if (Patterns.EMAIL_ADDRESS.matcher(account.name).matches()) {
                            obj2 = account.name;
                            akcr.a(obj2, "it.name");
                            break;
                        }
                    }
                }
            }
            return ajdx.b(obj2);
        }
    }

    /* renamed from: iyo$k */
    static final class k<T, R> implements ajfc<Throwable, String> {
        public static final k a = new k();

        k() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return "";
        }
    }

    /* renamed from: iyo$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ iyo a;

        p(iyo iyo) {
            this.a = iyo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ahaq ahaq = (ahaq) obj;
            akcr.b(ahaq, "req");
            return ((IdentityHttpInterface) this.a.e.get()).submitInviteContactAction(ahaq);
        }
    }

    /* renamed from: iyo$q */
    static final class q<T, R> implements ajfc<T, R> {
        private /* synthetic */ iyo a;

        q(iyo iyo) {
            this.a = iyo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "lastFullSyncTime");
            return Boolean.valueOf(this.a.d.a() - l.longValue() > 604800000);
        }
    }

    /* renamed from: iyo$t */
    static final class t<T> implements ajfl<Boolean> {
        public static final t a = new t();

        t() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "expired");
            return bool.booleanValue();
        }
    }

    /* renamed from: iyo$u */
    static final class u<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ iyo a;

        u(iyo iyo) {
            this.a = iyo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return ((hwl) this.a.a.b()).a((hwg) new FullContactSyncJob(ixu.a, "NOT_USE_META")).g();
        }
    }

    /* renamed from: iyo$a */
    static final class a extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ iyo a;

        a(iyo iyo) {
            this.a = iyo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            ixh ixh = (ixh) this.a.f.get();
            akcr.b(dbTransaction, str);
            ixh.a().throwIfNotDbScheduler();
            ixh.b().executeUpdateDelete((ClearAll) ixh.b.b(), dbTransaction);
            return ajxw.a;
        }
    }

    /* renamed from: iyo$r */
    static final class r extends akcs implements akbl<DbTransaction, ajxw> {
        private /* synthetic */ iyo a;

        r(iyo iyo) {
            this.a = iyo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            DbTransaction dbTransaction = (DbTransaction) obj;
            String str = "tx";
            akcr.b(dbTransaction, str);
            ixh ixh = (ixh) this.a.f.get();
            akcr.b(dbTransaction, str);
            ixh.a().throwIfNotDbScheduler();
            ixh.b().executeUpdateDelete((RemoveAddedContact) ixh.a.b(), dbTransaction);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iyo.class), "snapDb", "getSnapDb()Lcom/snap/core/db/api/SnapDb;"), new akdc(akde.a(iyo.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(iyo.class), "durableJobManager", "getDurableJobManager()Lcom/snap/durablejob/DurableJobManager;")};
    }

    public iyo(Context context, ihh ihh, aipn<IdentityHttpInterface> aipn, aipn<SnapDb> aipn2, zgb zgb, aipn<ixh> aipn3, aipn<abna> aipn4, gpb gpb, ftl ftl, tnj tnj, iqc iqc, ajwy<hwl> ajwy, abss abss) {
        akcr.b(context, "context");
        akcr.b(ihh, "clock");
        akcr.b(aipn, "identityHttpInterface");
        akcr.b(aipn2, "snapDbLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn3, "contactRepository");
        akcr.b(aipn4, "deviceTokenProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(ftl, "configProvider");
        akcr.b(tnj, "prefs");
        akcr.b(iqc, "friendingAnalytics");
        akcr.b(ajwy, "durableJobManagerProvider");
        akcr.b(abss, "releaseManager");
        this.c = context;
        this.d = ihh;
        this.e = aipn;
        this.f = aipn3;
        this.g = aipn4;
        this.h = gpb;
        this.o = ftl;
        this.p = tnj;
        this.i = iqc;
        this.j = ajwy;
        this.k = abss;
        this.m = ajxh.a(new s(aipn2));
        this.n = ajxh.a(new b(this));
        this.a = ajxh.a(new c(this));
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<String>()");
        this.b = ajwl;
    }

    private final DbClient i() {
        return (DbClient) this.n.b();
    }

    public final ajdj<String> a() {
        Object f = this.o.i(jic.LAST_FULL_CONTACT_SYNC_TIMESTAMP_MS).f(new q(this));
        akcr.a(f, "configProvider.getLongCo…NTERVAL\n                }");
        f = f.b((ajdw) this.l.j()).a((ajfl) t.a).a((ajfc) new u(this));
        akcr.a(f, "isFullContactSyncExpired…ring>()\n                }");
        return f;
    }

    public final ajdx<agze> a(agzc.a aVar, boolean z, ajdx<Set<iqi>> ajdx, boolean z2) {
        Object a;
        String str;
        akcr.b(aVar, "findFriendSource");
        if (z2 || f()) {
            ajdx ajdx2;
            i().runInTransaction("removeAddedContact", new r(this)).e();
            if (ajdx2 == null) {
                ajdx2 = b().a();
                akcr.a((Object) ajdx2, "getAllContactPhoneNumbers().cache()");
            }
            a = ajdx2.a((ajfc) new f(this, false, aVar, z)).a((ajfc) new g(this)).b((ajdw) this.l.g()).a(h().scheduler());
            akcr.a(a, "contactsSource.flatMap {…rveOn(snapDb.scheduler())");
            a = ajdx.a((ajeb) ajdx2, (ajeb) a, (ajex) new d(this)).a((ajfc) e.a);
            str = "Single.zip(contactsSourc…          .flatMap { it }";
        } else {
            a = ajvo.a(ajsn.a);
            str = "Single.never()";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajdx<irs> a(Activity activity, ifs ifs, zfw zfw, ifu ifu) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ifs, "permissionHelper");
        akcr.b(zfw, "schedulers");
        akcr.b(ifu, "event");
        return juo.a(activity, ifs, zfw, ifu, false);
    }

    public final ajdx<ahas> a(isw isw) {
        akcr.b(isw, "event");
        Object b = ajdx.c((Callable) new o(isw)).a((ajfc) new p(this)).b((ajdw) this.l.g());
        akcr.a(b, "Single\n                .…fiedSchedulers.network())");
        return b;
    }

    public final void a(String str) {
        String str2 = "username";
        akcr.b(str, str2);
        akcr.b(str, str2);
        abrk.a().d(abro.HAS_GIVEN_ACCESS_TO_CONTACTS, String.valueOf(str.hashCode()));
        abrk.a().b();
        this.b.a((Object) str);
    }

    public final void a(boolean z) {
        this.p.b().a((fth) jic.IS_CONTACT_SYNC_ENABLED, Boolean.valueOf(z)).b();
    }

    public final ajdx<Set<iqi>> b() {
        Object a = ajdx.c((Callable) new h(this)).b((ajdw) this.l.b()).a((ajdw) this.l.b());
        akcr.a(a, "Single.fromCallable {\n  …Schedulers.computation())");
        return a;
    }

    public final ajdx<String> b(Activity activity, ifs ifs, zfw zfw, ifu ifu) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ifs, "permissionHelper");
        akcr.b(zfw, "schedulers");
        akcr.b(ifu, "event");
        Object g = ifs.b(activity, ifu).b((ajdw) zfw.h()).a((ajdw) zfw.h()).a((ajfl) new i(ifu)).e().a((ajfc) new j(this, activity)).g(k.a);
        akcr.a(g, "permissionHelper.request…    .onErrorReturn { \"\" }");
        return g;
    }

    public final void c() {
        i().runInTransaction("clearAllContacts", new a(this)).e();
    }

    public final boolean d() {
        if (this.h.b() == null) {
            return false;
        }
        String b = this.h.b();
        akcr.a((Object) b, "userAuthStore.username");
        return iyp.a(b);
    }

    public final ajdp<Boolean> e() {
        ajwl ajwl = this.b;
        Object f = this.h.c().d().f(l.a);
        ajfv.a(f, "other is null");
        Object p = ajvo.a(new ajpt(ajwl, f)).e((ajfb) new m(this)).p(n.a);
        akcr.a(p, "hasAccessToContactsSubje…hasAccessToContacts(it) }");
        return p;
    }

    public final boolean f() {
        return this.o.a((fth) jic.IS_CONTACT_SYNC_ENABLED);
    }

    public final ajdp<Boolean> g() {
        Object p = this.o.p(jic.IS_CONTACT_SYNC_ENABLED);
        akcr.a(p, "configProvider.observeBo….IS_CONTACT_SYNC_ENABLED)");
        return p;
    }

    /* Access modifiers changed, original: final */
    public final SnapDb h() {
        return (SnapDb) this.m.b();
    }
}
