package defpackage;

import com.snap.core.db.record.TalkAuthContextModel;
import defpackage.ryz.b;
import defpackage.wjo.a;

/* renamed from: wjj */
final class wjj implements b {
    volatile ajej a;
    volatile String b;
    volatile Throwable c;
    final ajei d;
    private final String e;
    private final wjk f;

    /* renamed from: wjj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: wjj$b */
    static final class b implements ajev {
        private /* synthetic */ wjj a;

        b(wjj wjj) {
            this.a = wjj;
        }

        public final void run() {
            if (this.a.c == null && this.a.b == null) {
                wjj.a(this.a, a.a());
            }
        }
    }

    /* renamed from: wjj$c */
    static final class c<T> implements ajfb<String> {
        private /* synthetic */ wjj a;

        c(wjj wjj) {
            this.a = wjj;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            akcr.b(str, "accessTokenValue");
            wjj wjj = this.a;
            wjj.b = str;
            if (str != null) {
                wjj.a(wjj.a, wjj.d);
            }
        }
    }

    /* renamed from: wjj$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ wjj a;

        d(wjj wjj) {
            this.a = wjj;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            wjj.a(this.a, th);
        }
    }

    static {
        a aVar = new a();
    }

    public wjj(String str, wjk wjk, ajei ajei) {
        akcr.b(str, TalkAuthContextModel.SCOPEID);
        akcr.b(wjk, "snapTokenProvider");
        akcr.b(ajei, "clearOnLogout");
        this.e = str;
        this.f = wjk;
        this.d = ajei;
    }

    static void a(ajej ajej, ajei ajei) {
        if (ajej != null && !ajei.b(ajej) && !ajej.isDisposed()) {
            ajej.dispose();
        }
    }

    public final boolean a() {
        if (this.a == null) {
            this.a = this.f.a(this.e).b((ajev) new b(this)).a((ajfb) new c(this), (ajfb) new d(this));
            ajei ajei = this.d;
            ajej ajej = this.a;
            if (ajej == null) {
                akcr.a();
            }
            ajei.a(ajej);
        }
        return this.c == null && this.b != null;
    }

    public final Throwable b() {
        return this.c;
    }
}
