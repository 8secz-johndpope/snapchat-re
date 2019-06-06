package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import defpackage.sah.a;

/* renamed from: srs */
public final class srs {
    public final ajwy<gfu> a;
    public final ajwy<sry> b;
    private final sah c;
    private final ide d;

    /* renamed from: srs$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static boolean a(Integer num) {
            return (num == null || num.intValue() != 403) && ((num == null || num.intValue() != 401) && ((num == null || num.intValue() != 400) && ((num == null || num.intValue() != 410) && (num == null || num.intValue() != 404))));
        }

        public static boolean a(Throwable th) {
            akcr.b(th, "receiver$0");
            return th instanceof akwn ? a.a(Integer.valueOf(((akwn) th).a())) : false;
        }
    }

    /* renamed from: srs$b */
    public static final class b {
        public final c a;
        public final gej b;

        public b(c cVar, gej gej) {
            akcr.b(cVar, "status");
            this.a = cVar;
            this.b = gej;
        }
    }

    /* renamed from: srs$c */
    public enum c {
        DOWNLOADING,
        SUCCESS,
        FAIL,
        FAIL_NOT_RETRYABLE
    }

    /* renamed from: srs$d */
    public static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ srt a;

        public d(srt srt) {
            this.a = srt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return gej.a() ? new b(c.SUCCESS, gej) : new b(c.DOWNLOADING, gej);
        }
    }

    /* renamed from: srs$e */
    public static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ srt a;

        public e(srt srt) {
            this.a = srt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            if (gej.a()) {
                return new b(c.SUCCESS, gej);
            }
            Object e = gej.e();
            akcr.a(e, "it.failureReason");
            return a.a(Integer.valueOf(e.a())) ? new b(c.FAIL, gej) : new b(c.FAIL_NOT_RETRYABLE, gej);
        }
    }

    /* renamed from: srs$f */
    public static final class f<T> implements ajfl<b> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, Tags.CAPTION);
            return bVar.a != c.DOWNLOADING;
        }
    }

    static {
        a aVar = new a();
    }

    public srs(ajwy<gfu> ajwy, sah sah, ide ide, ajwy<sry> ajwy2) {
        akcr.b(ajwy, "contentResolver");
        akcr.b(sah, "noNetworkBackoffController");
        akcr.b(ide, "attributedFeature");
        akcr.b(ajwy2, "snapStreamingMethodFactory");
        this.a = ajwy;
        this.c = sah;
        this.d = ide;
        this.b = ajwy2;
    }

    private ajdx<gej> a(srt srt, idl idl) {
        akcr.b(srt, "playableSnap");
        akcr.b(idl, "uiPage");
        Object a = ((gfu) this.a.get()).a(srt.d.a, idl, false, new gdy[0]).a((ajec) a.a(this.c, this.d.callsite("OperaMediaDownloader"), 5, 0, 4));
        akcr.a(a, "contentResolver.get().re…      )\n                )");
        return a;
    }

    public static smg b(srt srt) {
        akcr.b(srt, "playableSnap");
        srp srp = srt.d;
        return new smg.a(srp.a, srp.b);
    }

    public final ajdx<gej> a(srp srp) {
        akcr.b(srp, "downloadInfo");
        return ((gfu) this.a.get()).a(srp.a, srp.b, true, gdy.READ_CACHE_ONLY);
    }

    public final ajdx<gej> a(srt srt) {
        akcr.b(srt, "playableSnap");
        return a(srt, srt.d.b);
    }
}
