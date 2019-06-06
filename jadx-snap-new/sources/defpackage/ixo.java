package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: ixo */
public final class ixo implements ird {
    private final SharedPreferences a;
    private final aipn<abrk> b;

    /* renamed from: ixo$a */
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

    public ixo(Context context, aipn<abrk> aipn) {
        akcr.b(context, "context");
        akcr.b(aipn, "propertiesStore");
        Object sharedPreferences = context.getSharedPreferences("identity_persistent_store", 0);
        akcr.a(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        this.b = aipn;
        m();
    }

    private void m() {
        String str = "SHOULD_SYNCH_OG_DATA";
        if (this.a.getBoolean(str, true)) {
            Editor edit = this.a.edit();
            String str2 = "";
            if (akgb.a(c())) {
                edit.putString("LAST_LOGGED_IN_USERNAME", ((abrk) this.b.get()).a(abro.LAST_SUCCESSFUL_LOGIN_USERNAME, str2));
            }
            long j = 1;
            if (a() == 0) {
                edit.putLong("INSTALL_ON_DEVICE_TIMESTAMP", ((abrk) this.b.get()).b(abro.APP_INSTALL_LOGGED) ? 1 : 0);
            }
            if (b() == 0) {
                Object a = ((abrk) this.b.get()).a(abro.LAST_SUCCESSFUL_LOGIN_USERNAME, str2);
                akcr.a(a, "lastLoginUsername");
                if ((akgb.a((CharSequence) a) ^ 1) == 0) {
                    j = 0;
                }
                edit.putLong("FIRST_LOGGED_IN_ON_DEVICE_TIMESTAMP", j);
            }
            if (!d() && ((abrk) this.b.get()).b(abro.HAS_VISITED_SPLASH_BEFORE)) {
                edit.putBoolean("HAS_VISITED_SPLASH_PAGE", true);
            }
            if (!h() && ((abrk) this.b.get()).b(abro.APP_INSTALL_DEVICE_HISTORY_LOGGED)) {
                edit.putBoolean("WAS_APP_INSTALL_DEVICE_HISTORY_LOGGED", true);
            }
            if (!k() && ((abrk) this.b.get()).b(abro.APP_DEEPLINK_INSTALL_LOGGED)) {
                edit.putBoolean("HAS_DEEP_LINK_FOR_INSTALL_LOGGED", true);
            }
            edit.putBoolean(str, false);
            edit.apply();
        }
    }

    public final long a() {
        return this.a.getLong("INSTALL_ON_DEVICE_TIMESTAMP", 0);
    }

    public final void a(long j) {
        this.a.edit().putLong("INSTALL_ON_DEVICE_TIMESTAMP", j).apply();
    }

    public final void a(String str) {
        akcr.b(str, "username");
        this.a.edit().putString("LAST_LOGGED_IN_USERNAME", str).apply();
        ((abrk) this.b.get()).c(abro.LAST_SUCCESSFUL_LOGIN_USERNAME, str);
        ((abrk) this.b.get()).b();
    }

    public final void a(boolean z) {
        this.a.edit().putBoolean("SHOULD_LOG_INSTALL_LOGIN_EVENT_IN_ALL_UPDATES", z).apply();
    }

    public final long b() {
        return this.a.getLong("FIRST_LOGGED_IN_ON_DEVICE_TIMESTAMP", 0);
    }

    public final void b(long j) {
        this.a.edit().putLong("FIRST_LOGGED_IN_ON_DEVICE_TIMESTAMP", j).apply();
    }

    public final void b(String str) {
        akcr.b(str, "longClientId");
        this.a.edit().putString("LONG_CLIENT_ID", str).apply();
    }

    public final String c() {
        Object string = this.a.getString("LAST_LOGGED_IN_USERNAME", "");
        akcr.a(string, "sharedPreferences.getStr…T_LOGGED_IN_USERNAME, \"\")");
        return string;
    }

    public final void c(long j) {
        this.a.edit().putLong("LONG_CLIENT_ID_DEVICE_TIMESTAMP", j).apply();
    }

    public final boolean d() {
        return this.a.getBoolean("HAS_VISITED_SPLASH_PAGE", false);
    }

    public final void e() {
        this.a.edit().putBoolean("HAS_VISITED_SPLASH_PAGE", true).apply();
    }

    public final String f() {
        Object string = this.a.getString("LONG_CLIENT_ID", "");
        akcr.a(string, "sharedPreferences.getString(LONG_CLIENT_ID, \"\")");
        return string;
    }

    public final long g() {
        return this.a.getLong("LONG_CLIENT_ID_DEVICE_TIMESTAMP", 0);
    }

    public final boolean h() {
        return this.a.getBoolean("WAS_APP_INSTALL_DEVICE_HISTORY_LOGGED", false);
    }

    public final void i() {
        this.a.edit().putBoolean("WAS_APP_INSTALL_DEVICE_HISTORY_LOGGED", true).apply();
    }

    public final boolean j() {
        return this.a.getBoolean("SHOULD_LOG_INSTALL_LOGIN_EVENT_IN_ALL_UPDATES", false);
    }

    public final boolean k() {
        return this.a.getBoolean("HAS_DEEP_LINK_FOR_INSTALL_LOGGED", false);
    }

    public final void l() {
        this.a.edit().putBoolean("HAS_DEEP_LINK_FOR_INSTALL_LOGGED", true).apply();
    }
}
