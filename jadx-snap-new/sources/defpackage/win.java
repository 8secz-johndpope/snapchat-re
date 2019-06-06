package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.base.Supplier;
import java.io.File;

/* renamed from: win */
public final class win implements whp {
    final ilv a;
    private final Supplier<SharedPreferences> b;

    /* renamed from: win$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: win$d */
    static final class d<T> implements Supplier<SharedPreferences> {
        private /* synthetic */ Context a;

        d(Context context) {
            this.a = context;
        }

        public final /* synthetic */ Object get() {
            return this.a.getSharedPreferences("user_device_identity_keys", 0);
        }
    }

    /* renamed from: win$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "dir");
            return new File(file, "fidelius/mVZbXY5&BRw@T6lN");
        }
    }

    /* renamed from: win$c */
    static final class c<T> implements ajfb<File> {
        private /* synthetic */ win a;

        c(win win) {
            this.a = win;
        }

        public final /* synthetic */ void accept(Object obj) {
            File file = (File) obj;
            if (file.exists()) {
                file.delete();
                this.a.a.c((ily) iox.USER_DEVICE_KEYS_REMOVE_LEGACY, 1);
            }
        }
    }

    static {
        a aVar = new a();
    }

    public win(Context context, igc igc, ilv ilv) {
        akcr.b(context, "context");
        akcr.b(igc, "storage");
        akcr.b(ilv, "graphene");
        this.a = ilv;
        this.b = new d(context);
        igc.b().b(ajwh.c).f(b.a).e((ajfb) new c(this));
    }

    public final wip a() {
        wip wip = null;
        String string = ((SharedPreferences) this.b.get()).getString("iwek", null);
        String string2 = ((SharedPreferences) this.b.get()).getString("in_beta", null);
        String string3 = ((SharedPreferences) this.b.get()).getString("out_beta", null);
        if (!(TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3))) {
            byte[] b = abne.b(string);
            byte[] b2 = abne.b(string2);
            byte[] b3 = abne.b(string3);
            if (!(b == null || b2 == null || b3 == null)) {
                wip = new wip(b, b2, b3);
            }
        }
        this.a.c(iox.USER_DEVICE_KEYS_READ.a("valid_in_prefs", wip != null), 1);
        return wip;
    }

    public final boolean a(wip wip) {
        akcr.b(wip, "userDeviceIdentityKeys");
        String a = abne.a(wip.a);
        String a2 = abne.a(wip.b);
        String a3 = abne.a(wip.c);
        boolean commit = (TextUtils.isEmpty((CharSequence) a) || TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) ? false : ((SharedPreferences) this.b.get()).edit().putString("iwek", a).putString("in_beta", a2).putString("out_beta", a3).commit();
        this.a.c(iox.USER_DEVICE_KEYS_WRITE.a("prefs_success", commit), 1);
        return commit;
    }

    public final Boolean b() {
        ((SharedPreferences) this.b.get()).edit().remove("iwek").remove("in_beta").remove("out_beta").apply();
        return Boolean.TRUE;
    }
}
