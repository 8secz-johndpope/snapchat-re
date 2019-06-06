package defpackage;

import com.brightcove.player.event.EventType;
import java.util.Arrays;

/* renamed from: cop */
public final class cop implements cjq, ckh, ckn {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c = ajxh.a(b.a);
    private final ajxe d = ajxh.a(e.a);
    private final ajxe e = ajxh.a(f.a);
    private final ajxe f = ajxh.a(c.a);

    /* renamed from: cop$a */
    static final class a extends akcs implements akbk<ihh> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    /* renamed from: cop$d */
    static final class d extends akcs implements akbk<abss> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (abss) this.a.get();
        }
    }

    /* renamed from: cop$b */
    static final class b extends akcs implements akbk<Integer> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(abte.a("#7BD14D", -1));
        }
    }

    /* renamed from: cop$e */
    static final class e extends akcs implements akbk<Integer> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(abte.a("#FFCB3F", -1));
        }
    }

    /* renamed from: cop$f */
    static final class f extends akcs implements akbk<Integer> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(abte.a("#A05DCD", -1));
        }
    }

    /* renamed from: cop$c */
    static final class c extends akcs implements akbk<ajwo<dir>> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cop.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(cop.class), "releaseManager", "getReleaseManager()Lcom/snapchat/android/framework/release/ReleaseManager;"), new akdc(akde.a(cop.class), "initLogEventColor", "getInitLogEventColor()I"), new akdc(akde.a(cop.class), "serveLogEventColor", "getServeLogEventColor()I"), new akdc(akde.a(cop.class), "trackLogEventColor", "getTrackLogEventColor()I"), new akdc(akde.a(cop.class), "logEventPublisher", "getLogEventPublisher()Lio/reactivex/subjects/PublishSubject;")};
    }

    public cop(ajwy<ihh> ajwy, ajwy<abss> ajwy2) {
        akcr.b(ajwy, "clockProvider");
        akcr.b(ajwy2, "releaseManagerProvider");
        this.a = ajxh.a(new a(ajwy));
        this.b = ajxh.a(new d(ajwy2));
    }

    private final ihh a() {
        return (ihh) this.a.b();
    }

    private final void a(cyt cyt, String str, int i, String str2) {
        cyt cyt2 = cyt;
        String str3 = str;
        String str4 = str2;
        if (b().d()) {
            String str5 = "success";
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str5);
            String str6 = " with ";
            stringBuilder.append(str6);
            stringBuilder.append(cyt2.b);
            String str7 = " in ";
            stringBuilder.append(str7);
            stringBuilder.append(cyt2.e);
            String str8 = "ms\nwith ";
            stringBuilder.append(str8);
            stringBuilder.append(str3);
            objArr[0] = stringBuilder.toString();
            String str9 = "java.lang.String.format(this, *args)";
            akcr.a(String.format(str4, Arrays.copyOf(objArr, 1)), str9);
            if (!(cyt2.c == null && cyt2.b / 100 == 2)) {
                str5 = "ERROR";
                objArr = new Object[1];
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str5);
                stringBuilder2.append(str6);
                stringBuilder2.append(cyt2.b);
                stringBuilder2.append(str7);
                stringBuilder2.append(cyt2.e);
                stringBuilder2.append(str8);
                stringBuilder2.append(cyt2.c);
                objArr[0] = stringBuilder2.toString();
                akcr.a(String.format(str4, Arrays.copyOf(objArr, 1)), str9);
            }
            ajwo f = f();
            long a = a().a();
            Object format = String.format(str4, Arrays.copyOf(new Object[]{str5}, 1));
            akcr.a(format, str9);
            Object[] objArr2 = new Object[]{cyt2.a, Integer.valueOf(cyt2.b), Long.valueOf(cyt2.e), cyt2.c, str3};
            String format2 = String.format("Url = %s\nStatusCode=%s\nLatency=%s\nError=%s\nParsed=%s", Arrays.copyOf(objArr2, 5));
            akcr.a((Object) format2, str9);
            f.a((Object) new dir(a, format, format2, i));
        }
    }

    private final void a(String str, String str2, int i, String str3) {
        if (b().d()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(": url = ");
            stringBuilder.append(str);
            ajwo f = f();
            long a = a().a();
            Object[] objArr = new Object[]{str, str2};
            Object format = String.format("Url = %s\n%s", Arrays.copyOf(objArr, 2));
            akcr.a(format, "java.lang.String.format(this, *args)");
            f.a((Object) new dir(a, str3, format, i));
        }
    }

    private final abss b() {
        return (abss) this.b.b();
    }

    private final int c() {
        return ((Number) this.c.b()).intValue();
    }

    private final int d() {
        return ((Number) this.d.b()).intValue();
    }

    private final int e() {
        return ((Number) this.e.b()).intValue();
    }

    private final ajwo<dir> f() {
        return (ajwo) this.f.b();
    }

    public final void a(cyt cyt) {
        akcr.b(cyt, EventType.RESPONSE);
        a(cyt, null, e(), "[AdTrack Request %s]");
    }

    public final void a(cyt cyt, akzq akzq) {
        String stringBuilder;
        akcr.b(cyt, EventType.RESPONSE);
        if (akzq != null) {
            StringBuilder stringBuilder2 = new StringBuilder("inventoryResponses = ");
            Object obj = akzq.a;
            akcr.a(obj, "it.inventoryResponses");
            stringBuilder2.append(ajyi.i(obj));
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = null;
        }
        a(cyt, stringBuilder, d(), "[AdServe Response %s]");
    }

    public final void a(cyt cyt, alar alar) {
        akcr.b(cyt, "networkResponse");
        a(cyt, alar != null ? alar.toString() : null, c(), "[AdInit Response %s]");
    }

    public final void a(String str, akzp akzp) {
        akcr.b(str, "url");
        akcr.b(akzp, "adRequest");
        String akzp2 = akzp.toString();
        akcr.a((Object) akzp2, "adRequest.toString()");
        a(str, akzp2, d(), "[AdServe Request Sending]");
    }

    public final void a(String str, alaq alaq) {
        akcr.b(str, "url");
        akcr.b(alaq, "initRequest");
        String alaq2 = alaq.toString();
        akcr.a((Object) alaq2, "initRequest.toString()");
        a(str, alaq2, c(), "[AdInit Request Sending]");
    }

    public final void a(String str, albr albr) {
        akcr.b(str, "url");
        akcr.b(albr, "trackRequest");
        String albr2 = albr.toString();
        akcr.a((Object) albr2, "trackRequest.toString()");
        a(str, albr2, e(), "[AdTrack Request Sending]");
    }
}
