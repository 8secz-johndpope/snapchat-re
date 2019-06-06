package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import defpackage.iti.a;
import java.util.concurrent.Callable;

/* renamed from: jig */
public final class jig {
    public final ajdx<SharedPreferences> a;
    final Context b;
    public final aipn<gpb> c;
    private final ajxe d = ajxh.a(new d(this));
    private zgb e;

    /* renamed from: jig$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: jig$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ jig a;

        d(jig jig) {
            this.a = jig;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(jjo.b, "LegalAgreementStore");
        }
    }

    /* renamed from: jig$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ jig a;

        g(jig jig) {
            this.a = jig;
        }

        public final /* synthetic */ Object call() {
            Object sharedPreferences = this.a.b.getSharedPreferences("LegalAgreementStore", 0);
            akcr.a(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* renamed from: jig$f */
    public static final class f<T> implements ajfb<SharedPreferences> {
        private /* synthetic */ String a;
        private /* synthetic */ boolean b;

        public f(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((SharedPreferences) obj).edit().putBoolean(this.a, this.b).apply();
        }
    }

    /* renamed from: jig$e */
    public static final class e<T> implements ajfb<SharedPreferences> {
        private /* synthetic */ String a;
        private /* synthetic */ boolean b;
        private /* synthetic */ String c;
        private /* synthetic */ boolean d;

        public e(String str, boolean z, String str2, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = z2;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((SharedPreferences) obj).edit().putBoolean(this.a, this.b).putBoolean(this.c, this.d).apply();
        }
    }

    /* renamed from: jig$b */
    public static final class b<T> implements ajfb<SharedPreferences> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ((SharedPreferences) obj).edit().clear().commit();
        }
    }

    /* renamed from: jig$c */
    public static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SharedPreferences sharedPreferences = (SharedPreferences) obj;
            akcr.b(sharedPreferences, "it");
            if (!sharedPreferences.contains(this.a) || !sharedPreferences.contains(this.b) || !sharedPreferences.contains(this.c)) {
                return ajdx.b((Throwable) new NotFoundException());
            }
            return !sharedPreferences.getBoolean(this.a, false) ? ajdx.b(a.NeedTermsOfUse) : (sharedPreferences.getBoolean(this.b, false) || !sharedPreferences.getBoolean(this.c, true)) ? ajdx.b(a.AllAccepted) : ajdx.b(a.NeedPrivacyPolicy);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(jig.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public jig(Context context, zgb zgb, aipn<gpb> aipn) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "userAuthStore");
        this.b = context;
        this.e = zgb;
        this.c = aipn;
        Object b = ajdx.c((Callable) new g(this)).a().b((ajdw) ((zfw) this.d.b()).f());
        akcr.a(b, "Single.fromCallable { ge…scribeOn(schedulers.io())");
        this.a = b;
    }

    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('~');
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
