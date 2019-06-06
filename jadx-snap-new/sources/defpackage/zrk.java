package defpackage;

import com.brightcove.player.event.EventType;
import java.util.Arrays;

/* renamed from: zrk */
public final class zrk implements zpm, zpn {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d = ajxh.a(n.a);
    private final ajxe e = ajxh.a(o.a);
    private final ajxe f = ajxh.a(k.a);

    /* renamed from: zrk$n */
    static final class n extends akcs implements akbk<Integer> {
        public static final n a = new n();

        n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(abte.a("#FFCB3F", -1));
        }
    }

    /* renamed from: zrk$o */
    static final class o extends akcs implements akbk<Integer> {
        public static final o a = new o();

        o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(abte.a("#A05DCD", -1));
        }
    }

    /* renamed from: zrk$k */
    static final class k extends akcs implements akbk<ajwo<dir>> {
        public static final k a = new k();

        k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: zrk$l */
    static final class l extends akcs implements akbl<Integer, CharSequence> {
        public static final l a = new l();

        l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            String str = intValue != 0 ? intValue != 1 ? "Unknown" : "Low" : "High";
            return str;
        }
    }

    /* renamed from: zrk$a */
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

    /* renamed from: zrk$m */
    static final class m extends akcs implements akbk<abss> {
        private /* synthetic */ ajwy a;

        m(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (abss) this.a.get();
        }
    }

    /* renamed from: zrk$b */
    static final class b extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: zrk$c */
    static final class c extends akcs implements akbl<adzo, String> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = ((adzo) obj).a;
            akcr.a(obj, "it.filterId");
            return obj;
        }
    }

    /* renamed from: zrk$d */
    static final class d extends akcs implements akbl<adzo, String> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = ((adzo) obj).a;
            akcr.a(obj, "it.filterId");
            return obj;
        }
    }

    /* renamed from: zrk$e */
    static final class e extends akcs implements akbl<adzo, String> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = ((adzo) obj).a;
            akcr.a(obj, "it.filterId");
            return obj;
        }
    }

    /* renamed from: zrk$f */
    static final class f extends akcs implements akbl<adzo, String> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = ((adzo) obj).a;
            akcr.a(obj, "it.filterId");
            return obj;
        }
    }

    /* renamed from: zrk$g */
    static final class g extends akcs implements akbl<adzo, String> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = ((adzo) obj).a;
            akcr.a(obj, "it.filterId");
            return obj;
        }
    }

    /* renamed from: zrk$h */
    static final class h extends akcs implements akbl<adzo, String> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = ((adzo) obj).a;
            akcr.a(obj, "it.filterId");
            return obj;
        }
    }

    /* renamed from: zrk$i */
    static final class i extends akcs implements akbl<aeal, String> {
        public static final i a = new i();

        i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = ((aeal) obj).d;
            akcr.a(obj, "it.filterId");
            return obj;
        }
    }

    /* renamed from: zrk$j */
    static final class j extends akcs implements akbl<aebs, String> {
        public static final j a = new j();

        j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return String.valueOf(((aebs) obj).a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zrk.class), "clock", "getClock()Lcom/snap/framework/time/Clock;"), new akdc(akde.a(zrk.class), "releaseManager", "getReleaseManager()Lcom/snapchat/android/framework/release/ReleaseManager;"), new akdc(akde.a(zrk.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(zrk.class), "serveLogEventColor", "getServeLogEventColor()I"), new akdc(akde.a(zrk.class), "trackLogEventColor", "getTrackLogEventColor()I"), new akdc(akde.a(zrk.class), "logEventPublisher", "getLogEventPublisher()Lio/reactivex/subjects/PublishSubject;")};
    }

    public zrk(ajwy<ihh> ajwy, ajwy<abss> ajwy2, ajwy<ftl> ajwy3) {
        akcr.b(ajwy, "clockProvider");
        akcr.b(ajwy2, "releaseManagerProvider");
        akcr.b(ajwy3, "configProviderLazy");
        this.a = ajxh.a(new a(ajwy));
        this.b = ajxh.a(new m(ajwy2));
        this.c = ajxh.a(new b(ajwy3));
    }

    private final ihh a() {
        return (ihh) this.a.b();
    }

    private final void a(String str, String str2, int i, String str3) {
        if (b().d()) {
            ajwo e = e();
            long a = a().a();
            Object[] objArr = new Object[]{str, str2};
            Object format = String.format("Url = %s\n%s", Arrays.copyOf(objArr, 2));
            akcr.a(format, "java.lang.String.format(this, *args)");
            e.a((Object) new dir(a, str3, format, i));
        }
    }

    private final void a(zsj zsj, String str, int i, String str2) {
        zsj zsj2 = zsj;
        String str3 = str;
        String str4 = str2;
        if (b().d()) {
            String str5 = "success";
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str5);
            String str6 = " with ";
            stringBuilder.append(str6);
            stringBuilder.append(zsj2.b);
            String str7 = " in ";
            stringBuilder.append(str7);
            stringBuilder.append(zsj2.d);
            String str8 = "ms\nwith ";
            stringBuilder.append(str8);
            stringBuilder.append(str3);
            objArr[0] = stringBuilder.toString();
            String str9 = "java.lang.String.format(this, *args)";
            akcr.a(String.format(str4, Arrays.copyOf(objArr, 1)), str9);
            if (!(zsj2.c == null && zsj2.b / 100 == 2)) {
                str5 = "ERROR";
                objArr = new Object[1];
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str5);
                stringBuilder2.append(str6);
                stringBuilder2.append(zsj2.b);
                stringBuilder2.append(str7);
                stringBuilder2.append(zsj2.d);
                stringBuilder2.append(str8);
                stringBuilder2.append(zsj2.c);
                objArr[0] = stringBuilder2.toString();
                akcr.a(String.format(str4, Arrays.copyOf(objArr, 1)), str9);
            }
            ajwo e = e();
            long a = a().a();
            Object format = String.format(str4, Arrays.copyOf(new Object[]{str5}, 1));
            akcr.a(format, str9);
            Object[] objArr2 = new Object[]{zsj2.a, Integer.valueOf(zsj2.b), Long.valueOf(zsj2.d), zsj2.c, str3};
            String format2 = String.format("Url = %s\nStatusCode=%s\nLatency=%s\nError=%s\nParsed=%s", Arrays.copyOf(objArr2, 5));
            akcr.a((Object) format2, str9);
            e.a((Object) new dir(a, format, format2, i));
        }
    }

    private final abss b() {
        return (abss) this.b.b();
    }

    private final int c() {
        return ((Number) this.d.b()).intValue();
    }

    private final int d() {
        return ((Number) this.e.b()).intValue();
    }

    private final ajwo<dir> e() {
        return (ajwo) this.f.b();
    }

    public final void a(String str, alrt alrt) {
        akcr.b(str, "url");
        akcr.b(alrt, "gtqServeRequest");
        Object obj = alrt.d.b;
        akcr.a(obj, "gtqServeRequest.syncInfo.purposeTypes");
        akbl akbl = l.a;
        String str2 = ppy.d;
        CharSequence charSequence = str2;
        String str3 = "";
        CharSequence charSequence2 = str3;
        CharSequence charSequence3 = str3;
        CharSequence charSequence4 = "...";
        akcr.b(obj, "receiver$0");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        obj = ((StringBuilder) ajyi.a((int[]) obj, (Appendable) new StringBuilder(), charSequence, charSequence2, charSequence3, charSequence4, akbl)).toString();
        akcr.a(obj, "joinTo(StringBuilder(), …ed, transform).toString()");
        StringBuilder stringBuilder = new StringBuilder("sync sensitivity = [");
        stringBuilder.append(obj);
        stringBuilder.append(']');
        String stringBuilder2 = stringBuilder.toString();
        str3 = alrt.a == null ? "location is null" : "location is not null";
        StringBuilder stringBuilder3 = new StringBuilder("[GTQ Serve Request Sending]: url = ");
        stringBuilder3.append(str);
        stringBuilder3.append(str2);
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(str2);
        stringBuilder3.append(str3);
        String alrt2 = alrt.toString();
        akcr.a((Object) alrt2, "gtqServeRequest.toString()");
        a(str, alrt2, c(), "[GTQ Serve Request Sending]");
    }

    public final void a(String str, alsa alsa, boolean z) {
        akcr.b(str, "url");
        akcr.b(alsa, "trackRequest");
        String str2 = z ? "[GTQ Creation Track Sending]" : "[GTQ View Track Sending]";
        String alsa2 = alsa.toString();
        akcr.a((Object) alsa2, "trackRequest.toString()");
        int d = d();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(": url = ");
        stringBuilder.append(str);
        a(str, alsa2, d, str2);
    }

    public final void a(zsj zsj) {
        String ahzm;
        akcr.b(zsj, EventType.RESPONSE);
        aebf aebf = zsj.e;
        if (aebf != null) {
            String str;
            if (((ftl) this.c.b()).a((fth) zpt.ENABLE_DETAILED_GTQ_SERVE_RESPONSE_DEBUG_LOGGING)) {
                ahzm = ahzo.a(aebf).toString();
                str = "GtqServeResponseProtoCon…ServeResponse).toString()";
            } else {
                StringBuilder stringBuilder = new StringBuilder("GtqServeResponse {\n");
                aebg aebg = aebf.a;
                stringBuilder.append("filters: ");
                Object obj = aebg.a;
                akcr.a(obj, "data.filters");
                stringBuilder.append(ajyi.a((Object[]) obj, null, null, null, 0, null, (akbl) c.a, 31));
                stringBuilder.append("\nbitmojiFilters: ");
                obj = aebg.c;
                akcr.a(obj, "data.bitmojiFilters");
                stringBuilder.append(ajyi.a((Object[]) obj, null, null, null, 0, null, (akbl) d.a, 31));
                stringBuilder.append("\nlenses: ");
                obj = aebg.d;
                akcr.a(obj, "data.lenses");
                stringBuilder.append(ajyi.a((Object[]) obj, null, null, null, 0, null, (akbl) e.a, 31));
                stringBuilder.append("\nprefetchLenses: ");
                obj = aebg.e;
                akcr.a(obj, "data.prefetchLenses");
                stringBuilder.append(ajyi.a((Object[]) obj, null, null, null, 0, null, (akbl) f.a, 31));
                stringBuilder.append("\nstickers: ");
                obj = aebg.f;
                akcr.a(obj, "data.stickers");
                stringBuilder.append(ajyi.a((Object[]) obj, null, null, null, 0, null, (akbl) g.a, 31));
                stringBuilder.append("\ncaption styles: ");
                obj = aebg.j;
                akcr.a(obj, "data.previewCaptionStyles");
                stringBuilder.append(ajyi.a((Object[]) obj, null, null, null, 0, null, (akbl) h.a, 31));
                stringBuilder.append("\nvenues: ");
                Object obj2 = aebf.b.a;
                akcr.a(obj2, "gtqServeResponse.venues.venueFilters");
                stringBuilder.append(ajyi.a((Object[]) obj2, null, null, null, 0, null, (akbl) i.a, 31));
                stringBuilder.append("\nresponseChecksumList: ");
                Object obj3 = aebf.a.k;
                akcr.a(obj3, "gtqServeResponse.unlockables.checksumResponseList");
                stringBuilder.append(ajyi.a((Object[]) obj3, null, null, null, 0, null, (akbl) j.a, 31));
                stringBuilder.append("\n}");
                ahzm = stringBuilder.toString();
                str = "stringBuilder.toString()";
            }
            akcr.a((Object) ahzm, str);
        } else {
            ahzm = null;
        }
        a(zsj, ahzm, c(), "[GTQ Serve Response %s]");
    }

    public final void a(zsj zsj, boolean z) {
        akcr.b(zsj, EventType.RESPONSE);
        a(zsj, null, d(), z ? "[GTQ Creation Track Response %s]" : "[GTQ View Track Response %s]");
    }
}
