package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.looksery.sdk.lenses.resources.BuildConfig;
import com.snap.core.db.record.FeedMemberModel;
import defpackage.zti.a;
import java.io.File;

/* renamed from: ztj */
public final class ztj implements zsz {
    final String a = "dataMigrationConfig";
    final String b = "migrationInProgress";
    final String c = "migrationStartTime";
    final String d = "nonResettingMigrationComplete";
    final String e = "resettingMigrationComplete";
    final String f = "migrationFailureCount";
    ajei g = new ajei();
    final Context h;
    final ilv i;
    private String j = "unknown";
    private final String k = "shared_prefs/user_session_shared_pref.xml";
    private final String l = "dynamicAppConfig";
    private final String m = "TROPHY_PREF";
    private final String n = "appFamily";
    private final String o = "previousAppFamily";
    private final String p = BuildConfig.FLAVOR;
    private final int q = 3;
    private final int r = 60;
    private int s;

    /* renamed from: ztj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ztj$b */
    static final class b implements ajev {
        private /* synthetic */ ztj a;
        private /* synthetic */ long b;

        /* renamed from: ztj$b$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        b(ztj ztj, long j) {
            this.a = ztj;
            this.b = j;
        }

        public final void run() {
            if (this.a.a(this.b)) {
                File file = new File(this.a.h.getApplicationInfo().dataDir, "shared_prefs");
                Object filesDir = this.a.h.getFilesDir();
                File file2 = new File(this.a.h.getApplicationInfo().dataDir, "databases");
                ajei ajei = this.a.g;
                ajcx a = a.a(file2);
                akcr.a(filesDir, "filesDir");
                ajei.a(a.d((ajdb) a.a(filesDir)).d((ajdb) a.a(file)).a(ajfu.g).g(1.a));
                return;
            }
            this.a.i.c((ily) iot.PURE_MROOM_DATA_MIGR_NOOP, 1);
        }
    }

    /* renamed from: ztj$c */
    static final class c implements ajev {
        private /* synthetic */ ztj a;
        private /* synthetic */ long b;
        private /* synthetic */ boolean c;

        c(ztj ztj, long j, boolean z) {
            this.a = ztj;
            this.b = j;
            this.c = z;
        }

        public final void run() {
            if (this.a.a(this.b)) {
                Editor edit = this.a.h.getSharedPreferences(this.a.a, 0).edit();
                edit.putBoolean(this.a.b, false);
                edit.putLong(this.a.c, this.b);
                edit.putBoolean(this.a.e, this.c);
                edit.putBoolean(this.a.d, true);
                edit.putInt(this.a.f, 0);
                edit.commit();
            }
            this.a.g.dispose();
        }
    }

    /* renamed from: ztj$d */
    static final class d implements ajev {
        private /* synthetic */ ztj a;
        private /* synthetic */ long b;

        d(ztj ztj, long j) {
            this.a = ztj;
            this.b = j;
        }

        public final void run() {
            int i = 0;
            SharedPreferences sharedPreferences = this.a.h.getSharedPreferences(this.a.a, 0);
            if (sharedPreferences.getBoolean(this.a.e, false) && sharedPreferences.getBoolean(this.a.d, false)) {
                i = 1;
            }
            boolean d = this.a.d();
            if (i == 0 && !d) {
                Editor edit = sharedPreferences.edit();
                edit.putBoolean(this.a.b, true);
                edit.putLong(this.a.c, this.b);
                edit.commit();
            }
        }
    }

    static {
        a aVar = new a();
    }

    public ztj(Context context, ilv ilv) {
        akcr.b(context, "ctx");
        akcr.b(ilv, "graphene");
        this.h = context;
        this.i = ilv;
    }

    private void a(String str) {
        akcr.b(str, "<set-?>");
        this.j = str;
    }

    private final boolean h() {
        SharedPreferences sharedPreferences = this.h.getSharedPreferences(this.a, 0);
        Object obj = (sharedPreferences.getBoolean(this.e, false) && sharedPreferences.getBoolean(this.d, false)) ? 1 : null;
        return obj != null;
    }

    private final int i() {
        this.s = this.h.getSharedPreferences(this.a, 0).getInt(this.f, 0);
        return this.s;
    }

    public final ajcx a(long j, boolean z) {
        Object a = ajcx.a((ajev) new c(this, j, z));
        akcr.a(a, "Completable.fromAction {…ables.dispose()\n        }");
        return a;
    }

    public final String a() {
        return this.j;
    }

    public final boolean a(long j) {
        return j == this.h.getSharedPreferences(this.a, 0).getLong(this.c, 0);
    }

    public final ajcx b(long j) {
        Object a = ajcx.a((ajev) new d(this, j));
        akcr.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }

    public final boolean b() {
        String str;
        if (e()) {
            str = "db_reset";
        } else if (h()) {
            a(FeedMemberModel.REMOVED);
            return false;
        } else {
            String str2 = this.h.getApplicationInfo().dataDir;
            String str3 = "shared_prefs/";
            StringBuilder stringBuilder = new StringBuilder(str3);
            stringBuilder.append(this.l);
            String str4 = ".xml";
            stringBuilder.append(str4);
            if (!new File(str2, stringBuilder.toString()).exists()) {
                str2 = this.h.getApplicationInfo().dataDir;
                stringBuilder = new StringBuilder(str3);
                stringBuilder.append(this.m);
                stringBuilder.append(str4);
                if (new File(str2, stringBuilder.toString()).exists()) {
                    str = "trophy_prefs";
                }
            }
            SharedPreferences sharedPreferences = this.h.getSharedPreferences(this.l, 0);
            Object string = sharedPreferences.getString(this.n, null);
            str3 = "none";
            Object string2 = sharedPreferences.getString(this.o, str3);
            if (akcr.a(string, this.p) || akcr.a(string2, this.p)) {
                str = "turducken_og_family";
            } else {
                a(str3);
                return false;
            }
        }
        a(str);
        return true;
    }

    public final ajcx c(long j) {
        Object a = ajcx.a((ajev) new b(this, j));
        akcr.a(a, "Completable.fromAction {…)\n            }\n        }");
        return a;
    }

    public final boolean c() {
        return (new File(this.h.getApplicationInfo().dataDir, this.k).exists() || PreferenceManager.getDefaultSharedPreferences(this.h.getApplicationContext()).getString("auth_token", null) == null) ? false : true;
    }

    public final boolean d() {
        SharedPreferences sharedPreferences = this.h.getSharedPreferences(this.a, 0);
        boolean z = sharedPreferences.getBoolean(this.b, false);
        long j = sharedPreferences.getLong(this.c, 0);
        if (!z || System.currentTimeMillis() - j <= 60) {
            return z;
        }
        g();
        this.i.c((ily) iot.PURE_MROOM_DATA_MIGR_ZOMBIE, 1);
        return false;
    }

    public final boolean e() {
        SharedPreferences sharedPreferences = this.h.getSharedPreferences(this.a, 0);
        boolean h = h();
        Object obj = sharedPreferences.getLong(this.c, 0) != 0 ? 1 : null;
        return (!h || obj == null) && obj != null;
    }

    public final boolean f() {
        return i() >= 3;
    }

    public final boolean g() {
        Editor edit = this.h.getSharedPreferences(this.a, 0).edit();
        edit.putBoolean(this.b, false);
        edit.putBoolean(this.e, false);
        edit.putBoolean(this.d, false);
        edit.putLong(this.c, 0);
        edit.putInt(this.f, i() + 1);
        return edit.commit();
    }
}
