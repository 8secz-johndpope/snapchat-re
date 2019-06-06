package defpackage;

import defpackage.ofh.b;
import defpackage.ofl.a;
import defpackage.vlp.a.c;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: oim */
public final class oim implements vjn {
    final ajxe a = ajxh.a(new a(this));
    final vlp b;
    final ofm c;
    final ajwy<gqr> d;
    final ajwy<odl> e;
    private final odu f;
    private final ofq g;

    /* renamed from: oim$a */
    static final class a extends akcs implements akbk<idd> {
        private /* synthetic */ oim a;

        a(oim oim) {
            this.a = oim;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((odl) this.a.e.get()).callsite("MediaRenderingControllerImpl");
        }
    }

    /* renamed from: oim$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (abyi) ajyu.f(list);
        }
    }

    /* renamed from: oim$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ oim a;
        final /* synthetic */ abyi b;
        final /* synthetic */ ajwy c;
        final /* synthetic */ idd d;
        final /* synthetic */ String e;

        /* renamed from: oim$c$2 */
        static final class 2<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ c a;

            /* renamed from: oim$c$2$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "it");
                    return (abyi) ajyu.f(list);
                }
            }

            2(c cVar) {
                this.a = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                /*
                r5 = this;
                r6 = (defpackage.odx) r6;
                r0 = "reader";
                defpackage.akcr.b(r6, r0);
                r0 = r6.c();
                r1 = 0;
                if (r0 == 0) goto L_0x0013;
            L_0x000e:
                r0 = r0.C();
                goto L_0x0014;
            L_0x0013:
                r0 = 0;
            L_0x0014:
                r2 = r5.a;
                r2 = r2.b;
                r2 = r2.e;
                r2 = r2.a;
                r3 = "this.mediaType";
                defpackage.akcr.a(r2, r3);
                r2 = r2.intValue();
                r2 = defpackage.abyp.c(r2);
                if (r2 == 0) goto L_0x00c3;
            L_0x002b:
                if (r0 != 0) goto L_0x00c3;
            L_0x002d:
                r0 = r5.a;
                r0 = r0.b;
                r0 = r0.e;
                r2 = r0.a;
                defpackage.akcr.a(r2, r3);
                r2 = r2.intValue();
                r2 = defpackage.abyp.c(r2);
                r4 = 1;
                if (r2 == 0) goto L_0x0054;
            L_0x0043:
                r0 = r0.a;
                defpackage.akcr.a(r0, r3);
                r0 = r0.intValue();
                r0 = defpackage.abyp.i(r0);
                if (r0 == 0) goto L_0x0054;
            L_0x0052:
                r0 = 1;
                goto L_0x0055;
            L_0x0054:
                r0 = 0;
            L_0x0055:
                r2 = r6.c();
                r3 = 0;
                if (r2 == 0) goto L_0x0067;
            L_0x005c:
                r2 = r2.a();
                if (r2 == 0) goto L_0x0067;
            L_0x0062:
                r2 = r2.g();
                goto L_0x0068;
            L_0x0067:
                r2 = r3;
            L_0x0068:
                if (r2 != 0) goto L_0x0093;
            L_0x006a:
                r2 = r6.c();
                if (r2 == 0) goto L_0x007b;
            L_0x0070:
                r2 = r2.a();
                if (r2 == 0) goto L_0x007b;
            L_0x0076:
                r2 = r2.d();
                goto L_0x007c;
            L_0x007b:
                r2 = r3;
            L_0x007c:
                if (r2 != 0) goto L_0x0093;
            L_0x007e:
                r6 = r6.c();
                if (r6 == 0) goto L_0x008e;
            L_0x0084:
                r6 = r6.a();
                if (r6 == 0) goto L_0x008e;
            L_0x008a:
                r3 = r6.l();
            L_0x008e:
                if (r3 == 0) goto L_0x0091;
            L_0x0090:
                goto L_0x0093;
            L_0x0091:
                r6 = 0;
                goto L_0x0094;
            L_0x0093:
                r6 = 1;
            L_0x0094:
                if (r0 == 0) goto L_0x0099;
            L_0x0096:
                if (r6 == 0) goto L_0x0099;
            L_0x0098:
                r1 = 1;
            L_0x0099:
                if (r1 != 0) goto L_0x00c3;
            L_0x009b:
                r6 = r5.a;
                r6 = r6.c;
                r6 = r6.get();
                r6 = (defpackage.vjo) r6;
                r0 = r5.a;
                r0 = r0.a;
                r0 = r0.b;
                r1 = r5.a;
                r1 = r1.d;
                r2 = new vlp$a$d;
                r3 = r6.a;
                r6 = r6.b;
                r2.<init>(r3, r6);
                r2 = (defpackage.vlp.a) r2;
                r6 = r5.a;
                r6 = r6.b;
                r6 = r0.a(r1, r2, r6);
                return r6;
            L_0x00c3:
                r6 = new ofl$a;
                r0 = r5.a;
                r0 = r0.d;
                r1 = r5.a;
                r1 = r1.b;
                r1 = defpackage.ajyl.a(r1);
                r2 = new ofh$d;
                r3 = r5.a;
                r3 = r3.e;
                r2.<init>(r3);
                r2 = (defpackage.ofh) r2;
                r6.<init>(r0, r1, r2);
                r0 = r5.a;
                r0 = r0.c;
                r0 = r0.get();
                r0 = (defpackage.vjo) r0;
                r0 = r0.c;
                r1 = "mediaQualityLevel";
                defpackage.akcr.b(r0, r1);
                r6 = (defpackage.ofl.a) r6;
                r6.a = r0;
                r6 = r6.a();
                r0 = r5.a;
                r0 = r0.a;
                r0 = r0.c;
                r6 = r0.a(r6);
                r0 = defpackage.oim.c.2.1.a;
                r0 = (defpackage.ajfc) r0;
                r6 = r6.f(r0);
                r0 = "transcodingService.submi…quest).map { it.first() }";
                defpackage.akcr.a(r6, r0);
                return r6;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oim$c$2.apply(java.lang.Object):java.lang.Object");
            }
        }

        c(oim oim, abyi abyi, ajwy ajwy, idd idd, String str) {
            this.a = oim;
            this.b = abyi;
            this.c = ajwy;
            this.d = idd;
            this.e = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final odx odx = (odx) obj;
            akcr.b(odx, "reader");
            Object a = ajdx.c((Callable) new Callable<T>() {
                public final /* synthetic */ Object call() {
                    return odx.a();
                }
            }).a((ajfc) new 2(this));
            akcr.a(a, "Single.fromCallable { re…                        }");
            Object obj2 = this.a.d.get();
            akcr.a(obj2, "exceptionTracker.get()");
            return ody.a(a, odx, (gqr) obj2, ((idd) this.a.a.b()).a("renderForSending"));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(oim.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;");
    }

    public oim(odu odu, vlp vlp, ofm ofm, ofq ofq, ajwy<gqr> ajwy, ajwy<odl> ajwy2) {
        akcr.b(odu, "mediaPackageManager");
        akcr.b(vlp, "imageRenderer");
        akcr.b(ofm, "transcodingService");
        akcr.b(ofq, "renderPassFactory");
        akcr.b(ajwy, "exceptionTracker");
        akcr.b(ajwy2, "feature");
        this.f = odu;
        this.b = vlp;
        this.c = ofm;
        this.g = ofq;
        this.d = ajwy;
        this.e = ajwy2;
    }

    public final ajdx<abyi> a(idd idd, abyi abyi, ajwy<vjo> ajwy, String str) {
        Object b;
        String str2;
        akcr.b(idd, "caller");
        akcr.b(abyi, "mediaPackage");
        akcr.b(ajwy, "sizeHint");
        Set set = oin.a;
        Object a = aesf.a(abyi.e.a);
        akcr.a(a, "MediaType.fromValue(this.mediaType)");
        if (set.contains(a)) {
            b = ajdx.b((Object) abyi);
            str2 = "Single.just(mediaPackage)";
        } else {
            b = this.f.c(idd, abyi).a((ajfc) new c(this, abyi, ajwy, idd, str));
            str2 = "mediaPackageManager.crea…ding\"))\n                }";
        }
        akcr.a(b, str2);
        return b;
    }

    public final ajdx<abyi> a(idd idd, abyi abyi, boolean z) {
        akcr.b(idd, "caller");
        akcr.b(abyi, "mediaPackage");
        Object obj = abyi.e.a;
        akcr.a(obj, "this.mediaType");
        if (abyp.c(obj.intValue())) {
            return this.b.a(idd, c.a, abyi);
        }
        Object f = this.c.a(new a(idd.a(idh.MEDIA_SOURCE_MEMORIES, idh.TRANSCODING_CONTEXT_MEMORIES, idh.MEDIA_DESTINATION_MEMORIES_BACKUP), ajyl.a(abyi), new b(z)).a()).f(b.a);
        akcr.a(f, "transcodingService.submi…quest).map { it.first() }");
        return f;
    }

    public final ajdx<List<abyi>> a(idd idd, List<abyi> list) {
        akcr.b(idd, "caller");
        akcr.b(list, "mediaPackages");
        Object obj = ((abyi) list.get(0)).e.a;
        akcr.a(obj, "this.mediaType");
        if (abyp.c(obj.intValue())) {
            Object b = ajdx.b((Object) list);
            akcr.a(b, "Single.just(mediaPackages)");
            return b;
        }
        return this.c.a(new a(idd.a(idh.MEDIA_DESTINATION_MEMORIES), list, ofh.c.b).a());
    }

    public final ofs a(acae acae, boolean z) {
        akcr.b(acae, "initialVisualFilter");
        return new oiv(acae, z, this.g);
    }

    public final oft a(int i, int i2) {
        return new oiw(i, i2);
    }
}
