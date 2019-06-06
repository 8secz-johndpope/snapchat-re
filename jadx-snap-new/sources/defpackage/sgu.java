package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: sgu */
public class sgu {
    public final ajxe a = ajxh.a(new d(this));
    public final ajei b = new ajei();
    final ajxe c;
    final ajxe d;
    final ajxe e;
    final Context f;
    public final ajwy<seo> g;
    final ajwy<dis> h;
    private final zgb i;

    /* renamed from: sgu$e */
    static final class e extends akcq implements akbk<ablp> {
        e(ajwy ajwy) {
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
            return (ablp) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: sgu$b */
    static final class b extends akcq implements akbk<ihh> {
        b(ajwy ajwy) {
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
            return (ihh) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: sgu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sgu$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ sgu a;

        d(sgu sgu) {
            this.a = sgu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(sdv.a.callsite("NotificationLifecycleEventReporter"));
        }
    }

    /* renamed from: sgu$f */
    static final class f extends akcs implements akbk<String> {
        private /* synthetic */ sgu a;

        f(sgu sgu) {
            this.a = sgu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            SharedPreferences sharedPreferences = this.a.f.getSharedPreferences("Composer", 0);
            String str = "deviceId";
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                string = abpu.a().toString();
                sharedPreferences.edit().putString(str, string).apply();
            }
            if (string != null) {
                Object toUpperCase = string.toUpperCase();
                akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase()");
                return toUpperCase;
            }
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: sgu$c */
    public static final class c<T> implements ajfb<sep> {
        private /* synthetic */ sgu a;

        public c(sgu sgu) {
            this.a = sgu;
        }

        public final /* synthetic */ void accept(Object obj) {
            sep sep = (sep) obj;
            abhs abhs = new abhs();
            abhs.a(Boolean.valueOf(seu.a(this.a.f).b()));
            abhs.b(Boolean.valueOf(sep.f));
            abhs.a(Long.valueOf(((long) ((String) this.a.e.b()).hashCode()) % 1000000));
            abhs.c(Boolean.valueOf(sep.c));
            long c = ((ihh) this.a.d.b()).c();
            obj = (ablp) this.a.c.b();
            akcr.a(obj, "startupContext");
            abhs.b(Long.valueOf(c - obj.a()));
            ((dis) this.a.h.get()).a(abhs);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(sgu.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(sgu.class), "startupContext", "getStartupContext()Lcom/snapchat/android/framework/analytics/StartupStatsReporter;"), new akdc(akde.a(sgu.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(sgu.class), "uniqueDeviceId", "getUniqueDeviceId()Ljava/lang/String;")};
        a aVar = new a();
    }

    public sgu(Context context, ajwy<seo> ajwy, ajwy<dis> ajwy2, zgb zgb, ajwy<ablp> ajwy3, ajwy<ihh> ajwy4) {
        akcr.b(context, "context");
        akcr.b(ajwy, "notificationPreferences");
        akcr.b(ajwy2, "eventLogger");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy3, "startupContextProvider");
        akcr.b(ajwy4, "clockProvider");
        this.f = context;
        this.g = ajwy;
        this.h = ajwy2;
        this.i = zgb;
        this.c = ajxh.a(new e(ajwy3));
        this.d = ajxh.a(new b(ajwy4));
        this.e = ajxh.a(new f(this));
    }
}
