package defpackage;

import com.snap.core.db.record.MobStoryMetadataModel;
import com.snap.core.db.record.PublisherSnapPageModel;
import defpackage.aflz.a;
import defpackage.zpq.e;

/* renamed from: yhq */
public final class yhq implements yhp {
    final aipn<zrn> a;
    final ajwy<ilv> b;
    private final ajxe c = ajxh.a(new e(this));
    private final ajxe d;
    private final ajxe e;
    private final ajei f;
    private final dis g;
    private final ajdx<e> h;
    private final ajwy<isg> i;

    /* renamed from: yhq$e */
    static final class e extends akcs implements akbk<zrn> {
        private /* synthetic */ yhq a;

        e(yhq yhq) {
            this.a = yhq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zrn) this.a.a.get();
        }
    }

    /* renamed from: yhq$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        b(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(yhy.j.callsite("StoryViewAnalyticsImpl"));
        }
    }

    /* renamed from: yhq$a */
    static final class a extends akcs implements akbk<ilv> {
        private /* synthetic */ yhq a;

        a(yhq yhq) {
            this.a = yhq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.b.get();
        }
    }

    /* renamed from: yhq$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;
        private /* synthetic */ double c;
        private /* synthetic */ double d;

        c(String str, String str2, double d, double d2) {
            this.a = str;
            this.b = str2;
            this.c = d;
            this.d = d2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            e eVar = (e) obj;
            akcr.b(eVar, "it");
            eVar.a(new zsy(this.a, a.STORY, this.c, this.d, this.b, (byte) 0));
            return ajxw.a;
        }
    }

    /* renamed from: yhq$d */
    static final class d extends akcs implements akbl<Throwable, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "throwable");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yhq.class), "unlockablesSnapInfoParser", "getUnlockablesSnapInfoParser()Lcom/snap/unlockables/lib/helper/UnlockablesSnapInfoParser;"), new akdc(akde.a(yhq.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(yhq.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;")};
    }

    public yhq(dis dis, aipn<zrn> aipn, ajdx<e> ajdx, ajwy<ilv> ajwy, zgb zgb, ajwy<isg> ajwy2) {
        akcr.b(dis, "eventLogger");
        akcr.b(aipn, "unlockablesSnapInfoParserLazy");
        akcr.b(ajdx, "trackNetClient");
        akcr.b(ajwy, "grapheneProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "teamsnapIdHelper");
        this.g = dis;
        this.a = aipn;
        this.h = ajdx;
        this.b = ajwy;
        this.i = ajwy2;
        this.d = ajxh.a(new b(zgb));
        this.e = ajxh.a(new a(this));
        this.f = new ajei();
    }

    private final zrn a() {
        return (zrn) this.c.b();
    }

    public final void a(String str, aajv aajv, abfx abfx) {
        akcr.b(str, "posterId");
        akcr.b(abfx, MobStoryMetadataModel.STORYTYPE);
        abfm abfm = new abfm();
        abfm.a(str);
        abfm.a(aajv);
        abfm.a(abfx);
        this.g.a(abfm);
    }

    public final /* synthetic */ void a(String str, String str2, aahb aahb, Double d, Long l, Long l2, aajv aajv) {
        double doubleValue = d.doubleValue();
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        akcr.b(str, PublisherSnapPageModel.PUBLISHERID);
        akcr.b(str2, PublisherSnapPageModel.EDITIONID);
        akcr.b(aahb, "viewSource");
        aaiy aaiy = new aaiy();
        aaiy.b(str);
        aaiy.a(str2);
        aaiy.a(aajv);
        aaiy.a(Double.valueOf(doubleValue / 1000.0d));
        aaiy.a(Long.valueOf(longValue));
        aaiy.b(Long.valueOf(longValue2));
        aaiy.a(aahb);
        this.g.a(aaiy);
    }

    public final /* synthetic */ void a(String str, String str2, String str3, aasc aasc, aahb aahb, Double d, Double d2, Boolean bool, Boolean bool2, aajv aajv) {
        double doubleValue = d.doubleValue();
        double doubleValue2 = d2.doubleValue();
        boolean booleanValue = bool.booleanValue();
        akcr.b(str, "dSnapId");
        akcr.b(str2, PublisherSnapPageModel.PUBLISHERID);
        akcr.b(str3, PublisherSnapPageModel.EDITIONID);
        akcr.b(aasc, "mediaType");
        akcr.b(aahb, "viewSource");
        aajj aajj = new aajj();
        aajj.i(str2);
        aajj.h(str3);
        aajj.b(aajv);
        aajj.j(str);
        aajj.a(aasc);
        aajj.d(Double.valueOf(doubleValue / 1000.0d));
        aajj.a(Double.valueOf(doubleValue2 / 1000.0d));
        aajj.a(aahb);
        aajj.f(Boolean.valueOf(booleanValue));
        aajj.g(bool2);
        this.g.a(aajj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    public final void a(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, double r19, double r21) {
        /*
        r14 = this;
        r0 = r14;
        r1 = r15;
        r3 = r17;
        r2 = new aanz;
        r2.<init>();
        r4 = r3;
        r4 = (java.lang.CharSequence) r4;
        r8 = 0;
        r9 = 1;
        if (r4 == 0) goto L_0x0019;
    L_0x0010:
        r4 = r4.length();
        if (r4 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0019;
    L_0x0017:
        r4 = 0;
        goto L_0x001a;
    L_0x0019:
        r4 = 1;
    L_0x001a:
        r10 = 0;
        if (r4 != 0) goto L_0x0089;
    L_0x001d:
        r2.c(r3);
        r14.a();
        if (r3 != 0) goto L_0x0028;
    L_0x0025:
        defpackage.akcr.a();
    L_0x0028:
        r4 = defpackage.zrn.a(r17);
        if (r4 == 0) goto L_0x0089;
    L_0x002e:
        r14.a();
        if (r4 == 0) goto L_0x0048;
    L_0x0033:
        r5 = r4.a;
        if (r5 == 0) goto L_0x0048;
    L_0x0037:
        r5 = defpackage.ajyi.d(r5);
        r5 = (defpackage.alrq) r5;
        if (r5 == 0) goto L_0x0048;
    L_0x003f:
        r5 = r5.b();
        r5 = java.lang.String.valueOf(r5);
        goto L_0x0049;
    L_0x0048:
        r5 = r10;
    L_0x0049:
        r2.d(r5);
        r14.a();
        if (r4 == 0) goto L_0x007b;
    L_0x0051:
        r5 = r4.b;
        if (r5 == 0) goto L_0x007b;
    L_0x0055:
        r6 = r5.length;
        r7 = 0;
    L_0x0057:
        if (r7 >= r6) goto L_0x006f;
    L_0x0059:
        r11 = r5[r7];
        r12 = "it";
        defpackage.akcr.a(r11, r12);
        r12 = r11.c();
        if (r12 != r9) goto L_0x0068;
    L_0x0066:
        r12 = 1;
        goto L_0x0069;
    L_0x0068:
        r12 = 0;
    L_0x0069:
        if (r12 == 0) goto L_0x006c;
    L_0x006b:
        goto L_0x0070;
    L_0x006c:
        r7 = r7 + 1;
        goto L_0x0057;
    L_0x006f:
        r11 = r10;
    L_0x0070:
        if (r11 == 0) goto L_0x007b;
    L_0x0072:
        r5 = r11.b();
        r5 = java.lang.String.valueOf(r5);
        goto L_0x007c;
    L_0x007b:
        r5 = r10;
    L_0x007c:
        r2.e(r5);
        r14.a();
        r4 = defpackage.zrn.b(r4);
        r2.g(r4);
    L_0x0089:
        r11 = r1;
        r11 = (java.lang.CharSequence) r11;
        if (r11 == 0) goto L_0x0097;
    L_0x008e:
        r4 = r11.length();
        if (r4 != 0) goto L_0x0095;
    L_0x0094:
        goto L_0x0097;
    L_0x0095:
        r4 = 0;
        goto L_0x0098;
    L_0x0097:
        r4 = 1;
    L_0x0098:
        if (r4 != 0) goto L_0x009d;
    L_0x009a:
        r2.a(r15);
    L_0x009d:
        r1 = r16;
        r2.f(r1);
        r4 = r18;
        r2.b(r4);
        r1 = r0.g;
        r2 = (defpackage.aajt) r2;
        r1.a(r2);
        r1 = r0.h;
        r2 = r0.d;
        r2 = r2.b();
        r2 = (defpackage.zfw) r2;
        r2 = r2.g();
        r2 = (defpackage.ajdw) r2;
        r12 = r1.b(r2);
        r13 = new yhq$c;
        r1 = r13;
        r2 = r18;
        r3 = r17;
        r4 = r19;
        r6 = r21;
        r1.<init>(r2, r3, r4, r6);
        r13 = (defpackage.ajfc) r13;
        r1 = r12.f(r13);
        r2 = "trackNetClient\n         …      )\n                }";
        defpackage.akcr.a(r1, r2);
        r2 = defpackage.yhq.d.a;
        r2 = (defpackage.akbl) r2;
        r3 = 2;
        r1 = defpackage.yit.a(r1, r2, r10, r3);
        r2 = r0.f;
        defpackage.ajvv.a(r1, r2);
        if (r11 == 0) goto L_0x00f1;
    L_0x00eb:
        r1 = r11.length();
        if (r1 != 0) goto L_0x00f2;
    L_0x00f1:
        r8 = 1;
    L_0x00f2:
        if (r8 != 0) goto L_0x0103;
    L_0x00f4:
        r1 = r0.e;
        r1 = r1.b();
        r1 = (defpackage.ilv) r1;
        r2 = defpackage.iod.GEOFILTER_VIEW;
        r2 = (defpackage.ily) r2;
        r1.c(r2, 1);
    L_0x0103:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhq.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double):void");
    }
}
