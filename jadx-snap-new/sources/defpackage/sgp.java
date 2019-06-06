package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.snap.notification.NotificationHttpInterface;
import defpackage.abst.a;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sgp */
public class sgp {
    final ajxe a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final zfw c = zgb.a(sdv.a.callsite("NotificationAcknowledger"));
    private final Context d;
    private final ajei e;
    private final iha f;

    /* renamed from: sgp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sgp$f */
    static final class f extends akcs implements akbk<NotificationHttpInterface> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (NotificationHttpInterface) this.a.get();
        }
    }

    /* renamed from: sgp$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ sgp a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ Bundle d;

        d(sgp sgp, String str, String str2, Bundle bundle) {
            this.a = sgp;
            this.b = str;
            this.c = str2;
            this.d = bundle;
        }

        public final /* synthetic */ Object call() {
            aetr aetr = new aetr();
            aetr.d = this.b;
            aetr.c = this.c;
            String string = this.d.getString("sent_ts");
            aetr.a = string != null ? Long.valueOf(Long.parseLong(string)) : null;
            aetr.b = Long.valueOf(System.currentTimeMillis());
            aetr.i = this.d.getString("type");
            aetr.h = this.d.getString("sender_username");
            aetr.e = String.valueOf(this.a.b.get() ^ 1);
            aetr.f = this.a.a(this.d.getString("dt_data"));
            aetr.g = Boolean.valueOf(this.a.a());
            return aetr;
        }
    }

    /* renamed from: sgp$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ sgp a;
        private /* synthetic */ sdr b;
        private /* synthetic */ String c;

        e(sgp sgp, sdr sdr, String str) {
            this.a = sgp;
            this.b = sdr;
            this.c = str;
        }

        public final /* synthetic */ Object call() {
            aetr aetr = new aetr();
            aetr.d = this.b.a;
            aetr.c = this.c;
            aetr.b = Long.valueOf(System.currentTimeMillis());
            aetr.i = this.b.b.toString();
            aetr.j = "PUSH_DISPLAYED";
            aetr.l = Boolean.valueOf(this.a.b.get() ^ 1);
            aetr.f = this.a.a(this.b.h.b);
            aetr.g = Boolean.valueOf(this.a.a());
            return aetr;
        }
    }

    /* renamed from: sgp$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ sgp a;

        b(sgp sgp) {
            this.a = sgp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            aetr aetr = (aetr) obj;
            akcr.b(aetr, "request");
            return ((NotificationHttpInterface) this.a.a.b()).acknowledgeNotification(aetr);
        }
    }

    /* renamed from: sgp$c */
    static final class c<T> implements ajfb<akxa<akhw>> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(sgp.class), "notificationHttpInterface", "getNotificationHttpInterface()Lcom/snap/notification/NotificationHttpInterface;");
        a aVar = new a();
    }

    public sgp(Context context, ajei ajei, iha iha, ajwy<NotificationHttpInterface> ajwy, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(iha, "serializationHelper");
        akcr.b(ajwy, "notificationHttpInterfaceProvider");
        akcr.b(zgb, "schedulersProvider");
        this.d = context;
        this.e = ajei;
        this.f = iha;
        this.a = ajxh.a(new f(ajwy));
    }

    /* Access modifiers changed, original: final */
    public final ajej a(ajdx<aetr> ajdx) {
        ajej e = ajdx.b((ajdw) this.c.b()).a((ajdw) this.c.g()).a((ajfc) new b(this)).e((ajfb) c.a);
        akcr.a((Object) e, "subscribeOn(schedulers.c…%s\", result.response()) }");
        return ajvv.a(e, this.e);
    }

    public final Map<String, String> a(String str) {
        return str != null ? (Map) this.f.a(str, a.a) : null;
    }

    public final void a(sdr sdr) {
        akcr.b(sdr, "notificationDisplayModel");
        String str = sdr.h.a;
        if (str != null) {
            ajdx c = ajdx.c((Callable) new e(this, sdr, str));
            akcr.a((Object) c, "Single.fromCallable {\n  …)\n            }\n        }");
            a(c);
        }
    }

    public final boolean a() {
        return seu.a(this.d).b();
    }
}
