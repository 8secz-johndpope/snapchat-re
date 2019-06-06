package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import com.snap.core.db.api.DbManager;
import com.snap.framework.developer.BuildConfigInfo;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

/* renamed from: ztl */
public final class ztl implements zta {
    ajei a = new ajei();
    public final ajxe b = ajxh.a(new f(this));
    public boolean c;
    Semaphore d = new Semaphore(1);
    final zsz e;
    final gpd f;
    final ilv g;
    private String h;
    private String i;
    private final BuildConfigInfo j;
    private final gds k;
    private final DbManager l;

    /* renamed from: ztl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ztl$f */
    static final class f extends akcs implements akbk<Boolean> {
        private /* synthetic */ ztl a;

        f(ztl ztl) {
            this.a = ztl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.a(true));
        }
    }

    /* renamed from: ztl$b */
    static final class b<V> implements Callable<Object> {
        private /* synthetic */ long a;
        private /* synthetic */ ztl b;
        private /* synthetic */ Context c;
        private /* synthetic */ boolean d;

        b(long j, ztl ztl, Context context, boolean z) {
            this.a = j;
            this.b = ztl;
            this.c = context;
            this.d = z;
        }

        public final /* synthetic */ Object call() {
            ztl ztl = this.b;
            Context context = this.c;
            if (ztl.e.a(this.a)) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
                String string = defaultSharedPreferences.getString("blizzard_token", null);
                boolean z = defaultSharedPreferences.getBoolean("is_registering", false);
                akcr.a((Object) defaultSharedPreferences, "ogPrefs");
                Long a = ztl.a(defaultSharedPreferences, "account_creation_millis");
                String string2 = defaultSharedPreferences.getString("username", null);
                String string3 = defaultSharedPreferences.getString("user_last_sync_country_code", null);
                String string4 = defaultSharedPreferences.getString("auth_token", null);
                String string5 = defaultSharedPreferences.getString("user_id", null);
                Long a2 = ztl.a(defaultSharedPreferences, "birthday_in_millis");
                Editor edit = context.getSharedPreferences("user_session_shared_pref", 0).edit();
                if (string != null) {
                    edit.putString("key_blizzard_token", string);
                }
                edit.putBoolean("key_needs_verification_in_reg", z);
                if (a != null) {
                    edit.putLong("key_created_timestamp", a.longValue());
                }
                if (string2 != null) {
                    edit.putString("key_username", string2);
                }
                if (string3 != null) {
                    edit.putString("key_registration_country_code", string3);
                }
                if (string4 != null) {
                    edit.putString("key_auth_token", string4);
                }
                if (string5 != null) {
                    edit.putString("key_user_id", string5);
                }
                if (a2 != null) {
                    edit.putLong("key_birthday", a2.longValue());
                }
                edit.commit();
                ztl.f.d();
            }
            return ajxw.a;
        }
    }

    /* renamed from: ztl$c */
    static final class c implements ajev {
        private /* synthetic */ long a;
        private /* synthetic */ ztl b;
        private /* synthetic */ Context c;
        private /* synthetic */ boolean d;

        c(long j, ztl ztl, Context context, boolean z) {
            this.a = j;
            this.b = ztl;
            this.c = context;
            this.d = z;
        }

        public final void run() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ztl ztl = this.b;
            ztl.c = this.d;
            ztl.g.a((ily) iot.PURE_MROOM_DATA_MIGR_TIMER, elapsedRealtime - this.a);
        }
    }

    /* renamed from: ztl$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ ztl a;
        private /* synthetic */ Context b;
        private /* synthetic */ boolean c;

        d(ztl ztl, Context context, boolean z) {
            this.a = ztl;
            this.b = context;
            this.c = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.e.g();
        }
    }

    /* renamed from: ztl$e */
    static final class e implements ajev {
        private /* synthetic */ ztl a;
        private /* synthetic */ Context b;
        private /* synthetic */ boolean c;

        e(ztl ztl, Context context, boolean z) {
            this.a = ztl;
            this.b = context;
            this.c = z;
        }

        public final void run() {
            this.a.d.release();
            this.a.a.dispose();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ztl.class), "needsResettingMigration", "getNeedsResettingMigration()Z");
        a aVar = new a();
    }

    public ztl(zsz zsz, BuildConfigInfo buildConfigInfo, gpd gpd, gds gds, ilv ilv, DbManager dbManager) {
        akcr.b(zsz, "ogFileDetector");
        akcr.b(buildConfigInfo, "buildConfigInfo");
        akcr.b(gpd, "userAuthStoreReader");
        akcr.b(gds, "contentManagerMigrationController");
        akcr.b(ilv, "graphene");
        akcr.b(dbManager, "dbManager");
        this.e = zsz;
        this.j = buildConfigInfo;
        this.f = gpd;
        this.k = gds;
        this.g = ilv;
        this.l = dbManager;
        String str = "unknown";
        this.h = str;
        this.i = str;
    }

    static Long a(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.contains(str) ? Long.valueOf(sharedPreferences.getLong(str, 0)) : null;
    }

    private void a(String str) {
        akcr.b(str, "<set-?>");
        this.h = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x00cf in {4, 6, 8, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.ajcx a(android.content.Context r13, boolean r14) {
        /*
        r12 = this;
        r0 = "context";
        defpackage.akcr.b(r13, r0);
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00cd }
        r0 = r12.d;	 Catch:{ all -> 0x00cd }
        r0.acquire();	 Catch:{ all -> 0x00cd }
        r9 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00cd }
        r0 = r12.e;	 Catch:{ all -> 0x00cd }
        r0 = r0.b(r7);	 Catch:{ all -> 0x00cd }
        r11 = new ztl$b;	 Catch:{ all -> 0x00cd }
        r1 = r11;	 Catch:{ all -> 0x00cd }
        r2 = r7;	 Catch:{ all -> 0x00cd }
        r4 = r12;	 Catch:{ all -> 0x00cd }
        r5 = r13;	 Catch:{ all -> 0x00cd }
        r6 = r14;	 Catch:{ all -> 0x00cd }
        r1.<init>(r2, r4, r5, r6);	 Catch:{ all -> 0x00cd }
        r11 = (java.util.concurrent.Callable) r11;	 Catch:{ all -> 0x00cd }
        r1 = defpackage.ajcx.b(r11);	 Catch:{ all -> 0x00cd }
        r1 = (defpackage.ajdb) r1;	 Catch:{ all -> 0x00cd }
        r0 = r0.b(r1);	 Catch:{ all -> 0x00cd }
        if (r14 == 0) goto L_0x003d;	 Catch:{ all -> 0x00cd }
        r1 = r12.l;	 Catch:{ all -> 0x00cd }
        r2 = 0;	 Catch:{ all -> 0x00cd }
        r1 = r1.reset(r13, r2);	 Catch:{ all -> 0x00cd }
        r2 = "dbManager.reset(context, null)";	 Catch:{ all -> 0x00cd }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00cd }
        goto L_0x0046;	 Catch:{ all -> 0x00cd }
        r1 = defpackage.ajhn.a;	 Catch:{ all -> 0x00cd }
        r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x00cd }
        r2 = "Completable.complete()";	 Catch:{ all -> 0x00cd }
        goto L_0x0039;	 Catch:{ all -> 0x00cd }
        r1 = (defpackage.ajdb) r1;	 Catch:{ all -> 0x00cd }
        r0 = r0.b(r1);	 Catch:{ all -> 0x00cd }
        r1 = r12.k;	 Catch:{ all -> 0x00cd }
        r2 = r1.b;	 Catch:{ all -> 0x00cd }
        r2 = r2.get();	 Catch:{ all -> 0x00cd }
        r3 = "storage.get()";	 Catch:{ all -> 0x00cd }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x00cd }
        r2 = (defpackage.igc) r2;	 Catch:{ all -> 0x00cd }
        r2 = r2.b();	 Catch:{ all -> 0x00cd }
        r3 = r1.a();	 Catch:{ all -> 0x00cd }
        r3 = r3.f();	 Catch:{ all -> 0x00cd }
        r3 = (defpackage.ajdw) r3;	 Catch:{ all -> 0x00cd }
        r2 = r2.b(r3);	 Catch:{ all -> 0x00cd }
        r3 = new gds$d;	 Catch:{ all -> 0x00cd }
        r3.<init>(r1);	 Catch:{ all -> 0x00cd }
        r3 = (defpackage.ajfc) r3;	 Catch:{ all -> 0x00cd }
        r1 = r2.e(r3);	 Catch:{ all -> 0x00cd }
        r2 = defpackage.ajfu.g;	 Catch:{ all -> 0x00cd }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00cd }
        r2 = "storage.get().internalFi…      }.onErrorComplete()";	 Catch:{ all -> 0x00cd }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00cd }
        r1 = (defpackage.ajdb) r1;	 Catch:{ all -> 0x00cd }
        r0 = r0.b(r1);	 Catch:{ all -> 0x00cd }
        r1 = r12.e;	 Catch:{ all -> 0x00cd }
        r1 = r1.c(r7);	 Catch:{ all -> 0x00cd }
        r1 = (defpackage.ajdb) r1;	 Catch:{ all -> 0x00cd }
        r0 = r0.b(r1);	 Catch:{ all -> 0x00cd }
        r1 = r12.e;	 Catch:{ all -> 0x00cd }
        r1 = r1.a(r7, r14);	 Catch:{ all -> 0x00cd }
        r1 = (defpackage.ajdb) r1;	 Catch:{ all -> 0x00cd }
        r0 = r0.b(r1);	 Catch:{ all -> 0x00cd }
        r7 = new ztl$c;	 Catch:{ all -> 0x00cd }
        r1 = r7;	 Catch:{ all -> 0x00cd }
        r2 = r9;	 Catch:{ all -> 0x00cd }
        r4 = r12;	 Catch:{ all -> 0x00cd }
        r5 = r13;	 Catch:{ all -> 0x00cd }
        r6 = r14;	 Catch:{ all -> 0x00cd }
        r1.<init>(r2, r4, r5, r6);	 Catch:{ all -> 0x00cd }
        r7 = (defpackage.ajev) r7;	 Catch:{ all -> 0x00cd }
        r0 = r0.d(r7);	 Catch:{ all -> 0x00cd }
        r1 = new ztl$d;	 Catch:{ all -> 0x00cd }
        r1.<init>(r12, r13, r14);	 Catch:{ all -> 0x00cd }
        r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x00cd }
        r0 = r0.a(r1);	 Catch:{ all -> 0x00cd }
        r1 = new ztl$e;	 Catch:{ all -> 0x00cd }
        r1.<init>(r12, r13, r14);	 Catch:{ all -> 0x00cd }
        r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x00cd }
        r13 = r0.f(r1);	 Catch:{ all -> 0x00cd }
        r14 = "ogFileDetector.persistMi…spose()\n                }";	 Catch:{ all -> 0x00cd }
        defpackage.akcr.a(r13, r14);	 Catch:{ all -> 0x00cd }
        return r13;
        r13 = move-exception;
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztl.a(android.content.Context, boolean):ajcx");
    }

    public final String a() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(boolean z) {
        Object obj = (akcr.a(this.j.APPLICATION_ID, (Object) "com.snapchat.android.flavortest.turducken.buck") || !this.j.TURDUCKEN) ? 1 : null;
        if (obj == null) {
            return false;
        }
        if (this.e.f()) {
            return false;
        }
        if (!z) {
            if (this.e.e()) {
                return false;
            }
        }
        a("og_data");
        if (this.e.b()) {
            String a = this.e.a();
            akcr.b(a, "<set-?>");
            this.i = a;
            return true;
        }
        a("user_session");
        if (this.e.c()) {
            return true;
        }
        a("migration_in_progress");
        return this.e.d();
    }

    public final String b() {
        return this.i;
    }

    public final boolean c() {
        return a(false) && !this.c;
    }
}
