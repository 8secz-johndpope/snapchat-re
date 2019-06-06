package defpackage;

import com.brightcove.player.model.Video.Fields;
import defpackage.rzu.b;
import defpackage.ztp.e;
import defpackage.ztp.f;
import defpackage.ztp.k;
import defpackage.ztp.l;
import defpackage.ztp.m;
import defpackage.ztt.c;
import defpackage.ztt.h;
import defpackage.ztt.j;
import defpackage.ztt.r;
import defpackage.zuk.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ztv */
public final class ztv implements zuj {
    final Map<a, gpl<abyi>> a;
    final gpl<List<abyi>> b;
    final gpl<c> c;
    final ConcurrentHashMap<String, ajej> d;
    final List<zud> e;
    final ajwy<ztt> f;
    final ajwy<ztp> g;
    final ajwy<ihh> h;
    final ajwy<ofb> i;
    final rxj j;
    final ftl k;
    final abse l;
    final ztw m;
    final evg n;
    private final ajxe o;
    private final ajwy<odu> p;
    private final zgb q;

    /* renamed from: ztv$p */
    static final class p extends akcq implements akca<String, String, Object[], ajxw> {
        public static final p a = new p();

        p() {
            super(3);
        }

        public final String getName() {
            return "send";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "send(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: ztv$q */
    static final class q extends akcq implements akca<String, String, Object[], ajxw> {
        public static final q a = new q();

        q() {
            super(3);
        }

        public final String getName() {
            return "send";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "send(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: ztv$z */
    static final class z extends akcq implements akca<String, String, Object[], ajxw> {
        public static final z a = new z();

        z() {
            super(3);
        }

        public final String getName() {
            return "send";
        }

        public final akej getOwner() {
            return akde.a(abpe.class);
        }

        public final String getSignature() {
            return "send(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ajxw.a;
        }
    }

    /* renamed from: ztv$a */
    public static final class a {

        /* renamed from: ztv$a$a */
        public static final class a {
            abyi a;
            String b;
            zuf c;
            c d;
            aart e;

            public /* synthetic */ a(abyi abyi) {
                Object uuid = iig.a().toString();
                akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
                this(abyi, uuid, aart.CANCELLED);
            }

            private a(abyi abyi, String str, aart aart) {
                akcr.b(abyi, "mediaPackage");
                akcr.b(str, "mediaOrchestrationAttemptId");
                akcr.b(aart, "mediaOrchestrationResult");
                this.a = abyi;
                this.b = str;
                this.c = null;
                this.d = null;
                this.e = aart;
            }

            public final void a(aart aart) {
                akcr.b(aart, "<set-?>");
                this.e = aart;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static final /* synthetic */ zuf a(defpackage.zuk.a aVar, Throwable th) {
            return th instanceof zuf ? (zuf) th : new zuf(aVar, th.getMessage(), th, false);
        }
    }

    /* renamed from: ztv$o */
    static final class o extends akcs implements akbk<zfw> {
        private /* synthetic */ ztv a;

        o(ztv ztv) {
            this.a = ztv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zui.a.callsite("UploadMediaManagerImpl"));
        }
    }

    /* renamed from: ztv$g */
    static final class g<V> implements Callable<Object> {
        private /* synthetic */ zub a;

        g(zub zub) {
            this.a = zub;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return ajxw.a;
        }
    }

    /* renamed from: ztv$k */
    static final class k<V> implements Callable<T> {
        private /* synthetic */ ztv a;
        private /* synthetic */ zub b;

        k(ztv ztv, zub zub) {
            this.a = ztv;
            this.b = zub;
        }

        public final /* synthetic */ Object call() {
            ajej ajej = (ajej) this.a.d.remove(this.b.a());
            if (ajej != null) {
                ajej.dispose();
            }
            return ajxw.a;
        }
    }

    /* renamed from: ztv$r */
    static final class r<V> implements Callable<T> {
        private /* synthetic */ zub a;
        private /* synthetic */ ztq b;

        r(zub zub, ztq ztq) {
            this.a = zub;
            this.b = ztq;
        }

        public final /* synthetic */ Object call() {
            this.b.a();
            return this.a;
        }
    }

    /* renamed from: ztv$b */
    static final class b<T1, T2, R> implements ajex<R, T, R> {
        final /* synthetic */ ztv a;
        final /* synthetic */ ztq b;
        final /* synthetic */ zub c;
        final /* synthetic */ abaw d;
        final /* synthetic */ idd e;
        final /* synthetic */ ConcurrentHashMap f;
        final /* synthetic */ abyi g;

        b(ztv ztv, ztq ztq, zub zub, abaw abaw, idd idd, ConcurrentHashMap concurrentHashMap, abyi abyi) {
            this.a = ztv;
            this.b = ztq;
            this.c = zub;
            this.d = abaw;
            this.e = idd;
            this.f = concurrentHashMap;
            this.g = abyi;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            ajdx ajdx = (ajdx) obj;
            final zud zud = (zud) obj2;
            akcr.b(ajdx, "prev");
            akcr.b(zud, "plugin");
            return ajdx.a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                final /* synthetic */ b a;

                /* renamed from: ztv$b$1$1 */
                static final class 1<T, R> implements ajfc<T, R> {
                    private /* synthetic */ 1 a;

                    1(1 1) {
                        this.a = 1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        abyi abyi = (abyi) obj;
                        akcr.b(abyi, "transformedMediaPackage");
                        a aVar = (a) this.a.a.f.get(abyi.b);
                        if (aVar != null) {
                            akcr.b(abyi, "<set-?>");
                            aVar.a = abyi;
                        }
                        return abyi;
                    }
                }

                /* renamed from: ztv$b$1$2 */
                static final class 2<T, R> implements ajfc<Throwable, ajeb<? extends abyi>> {
                    private /* synthetic */ 1 a;

                    2(1 1) {
                        this.a = 1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        akcr.b(th, "throwable");
                        zuf a = a.a(zud.a(), th);
                        a aVar = (a) this.a.a.f.get(this.a.a.g.b);
                        if (aVar != null) {
                            aVar.c = a;
                            aVar.a(ztv.a(a));
                        }
                        return ajdx.b((Throwable) a);
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    abyi abyi = (abyi) obj;
                    akcr.b(abyi, "it");
                    gpl gpl = (gpl) this.a.a.a.get(zud.a());
                    if (gpl != null) {
                        ztq ztq = this.a.b;
                        zub zub = this.a.c;
                        a a = zud.a();
                        String a2 = ztv.a(this.a.c.a(), abyi.b);
                        zud zud = zud;
                        ztv ztv = this.a.a;
                        abaw abaw = this.a.d;
                        akcr.b(abyi, "mediaPackage");
                        ajwy fVar = new f(ztv, abaw, abyi);
                        a aVar = (a) this.a.f.get(abyi.b);
                        return ztq.a(zub, abyi, a, gpl.a(a2, zud.a(abyi, fVar, this.a.e.a("UploadMediaManagerImpl"), aVar != null ? aVar.b : null)), this.a.a.a().f()).f(new 1(this)).h(new 2(this));
                    }
                    StringBuilder stringBuilder = new StringBuilder("Job cache for ");
                    stringBuilder.append(zud.a());
                    stringBuilder.append(" is not present.");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            });
        }
    }

    /* renamed from: ztv$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdx ajdx = (ajdx) obj;
            akcr.b(ajdx, "it");
            return ajdx;
        }
    }

    /* renamed from: ztv$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ztv a;
        private /* synthetic */ idd b;

        d(ztv ztv, idd idd) {
            this.a = ztv;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            ztv ztv = this.a;
            ((ofb) ztv.i.get()).a(this.b, list);
            return ajdp.b((Iterable) list);
        }
    }

    /* renamed from: ztv$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ztv a;

        e(ztv ztv) {
            this.a = ztv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyi abyi = (abyi) obj;
            akcr.b(abyi, "it");
            return ((ztp) this.a.g.get()).a(ajyl.a(abyi));
        }
    }

    /* renamed from: ztv$f */
    static final class f<T> implements ajwy<vjo> {
        private /* synthetic */ ztv a;
        private /* synthetic */ abaw b;
        private /* synthetic */ abyi c;

        f(ztv ztv, abaw abaw, abyi abyi) {
            this.a = ztv;
            this.b = abaw;
            this.c = abyi;
        }

        public final /* synthetic */ Object get() {
            ftl ftl;
            zun zun;
            long h;
            abtl abtl;
            ztv ztv = this.a;
            abaw abaw = this.b;
            if (ztv.k.a((fth) zun.LIBJPEG_IMAGE_ENCODING_BY_SOURCE_ENABLED) && (abaw == abaw.IN_CHAT || abaw == abaw.FEED)) {
                ftl = ztv.k;
                zun = zun.LIBJPEG_IMAGE_ENCODING_BY_SOURCE_QUALITY;
            } else {
                if (ztv.k.a((fth) zun.LIBJPEG_IMAGE_ENCODING_BY_NETWORK_ENABLED)) {
                    long e = ztv.k.a((fth) zun.LIBJPEG_IMAGE_ENCODING_USE_UPLOAD_BANDWIDTH) ? ztv.j.e() : ztv.j.d();
                    if (e > 0) {
                        h = ztv.k.h(zun.LIBJPEG_IMAGE_ENCODING_MID_QUALITY_MIN_BITPS);
                        if (h <= 0 || e >= h) {
                            long h2 = ztv.k.h(zun.LIBJPEG_IMAGE_ENCODING_HIGH_QUALITY_MIN_BITPS);
                            if (h2 > 0 && e > h2) {
                                ftl = ztv.k;
                                zun = zun.LIBJPEG_IMAGE_ENCODING_HIGH_QUALITY;
                            } else if (h > 0 && h2 > 0) {
                                ftl = ztv.k;
                                zun = zun.LIBJPEG_IMAGE_ENCODING_MID_QUALITY;
                            }
                        } else {
                            ftl = ztv.k;
                            zun = zun.LIBJPEG_IMAGE_ENCODING_LOW_QUALITY;
                        }
                    }
                }
                ftl = ztv.k;
                zun = zun.DEFAULT_UPLOAD_LIBJPEG_IMAGE_ENCODING_QUALITY;
            }
            int f = ftl.f(zun);
            abtl c = abyj.c(this.c.e);
            ztv ztv2 = this.a;
            abaw abaw2 = this.b;
            float f2;
            if (ztv2.k.a((fth) zun.LIBJPEG_IMAGE_ENCODING_BY_SOURCE_ENABLED) && (abaw2 == abaw.IN_CHAT || abaw2 == abaw.FEED)) {
                f2 = ((float) ztv2.k.f(zun.LIBJPEG_IMAGE_ENCODING_BY_SOURCE_RESOLUTION)) / ((float) Math.min(ztv2.l.widthPixels, ztv2.l.heightPixels));
                abtl = new abtl((int) (((float) ztv2.l.widthPixels) * f2), (int) (((float) ztv2.l.heightPixels) * f2));
            } else {
                if (ztv2.k.a((fth) zun.LIBJPEG_IMAGE_ENCODING_BY_NETWORK_ENABLED)) {
                    h = ztv2.k.a((fth) zun.LIBJPEG_IMAGE_ENCODING_USE_UPLOAD_BANDWIDTH) ? ztv2.j.e() : ztv2.j.d();
                    if (h > 0) {
                        ftl ftl2;
                        zun zun2;
                        int min = Math.min(ztv2.l.widthPixels, ztv2.l.heightPixels);
                        long h3 = ztv2.k.h(zun.LIBJPEG_IMAGE_ENCODING_MID_RESOLUTION_MIN_BITPS);
                        if (h3 <= 0 || h >= h3) {
                            long h4 = ztv2.k.h(zun.LIBJPEG_IMAGE_ENCODING_HIGH_RESOLUTION_MIN_BITPS);
                            if (h4 <= 0 || h <= h4) {
                                if (h3 > 0 && h4 > 0) {
                                    ftl2 = ztv2.k;
                                    zun2 = zun.LIBJPEG_IMAGE_ENCODING_MID_RESOLUTION;
                                }
                                f2 = ((float) min) / ((float) Math.min(ztv2.l.widthPixels, ztv2.l.heightPixels));
                                abtl = new abtl((int) (((float) ztv2.l.widthPixels) * f2), (int) (((float) ztv2.l.heightPixels) * f2));
                            } else {
                                ftl2 = ztv2.k;
                                zun2 = zun.LIBJPEG_IMAGE_ENCODING_HIGH_RESOLUTION;
                            }
                        } else {
                            ftl2 = ztv2.k;
                            zun2 = zun.LIBJPEG_IMAGE_ENCODING_LOW_RESOLUTION;
                        }
                        min = ftl2.f(zun2);
                        f2 = ((float) min) / ((float) Math.min(ztv2.l.widthPixels, ztv2.l.heightPixels));
                        abtl = new abtl((int) (((float) ztv2.l.widthPixels) * f2), (int) (((float) ztv2.l.heightPixels) * f2));
                    }
                }
                abtl = new abtl(ztv2.l.widthPixels, ztv2.l.heightPixels);
            }
            abtl abtl2 = new abtl(Math.min(c.b(), abtl.b()), Math.min(c.c(), abtl.c()));
            evg evg = this.a.n;
            fth fth = zun.MEDIA_UPLOAD_QUALITY_LEVEL;
            acce acce = new acce();
            abaw2 = this.b;
            Object name = abaw2 != null ? abaw2.name() : null;
            int i = 0;
            if (name != null) {
                Integer num = (Integer) evj.a.get(name);
                if (num != null) {
                    i = num.intValue();
                }
            }
            Object a = acce.a(i);
            akcr.a(a, "FeatureProvidedSignals()…rce(featureSource?.name))");
            aesb a2 = aesb.a(Integer.valueOf(evg.e(fth, a)));
            ztw ztw = this.a.m;
            aesf a3 = aesf.a(this.c.e.a);
            akcr.a((Object) a3, "MediaType.fromValue(mediaPackage.media.mediaType)");
            String str = "qualityLevel";
            akcr.a((Object) a2, str);
            akcr.b(a3, "mediaType");
            akcr.b(a2, str);
            ztw.a().a(a3, a2);
            return new vjo(abtl2, f, a2);
        }
    }

    /* renamed from: ztv$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<abyi> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abyi abyi : iterable) {
                arrayList.add(abyi.b);
            }
            return (List) arrayList;
        }
    }

    /* renamed from: ztv$i */
    static final class i<T, R> implements ajfc<List<? extends String>, ajdb> {
        final /* synthetic */ ztv a;
        final /* synthetic */ zub b;

        i(ztv ztv, zub zub) {
            this.a = ztv;
            this.b = zub;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "contentIds");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ i a;

                public final void run() {
                    Object obj = list;
                    akcr.a(obj, "contentIds");
                    for (String a : (Iterable) obj) {
                        this.a.a.c.a(ztv.a(this.a.b.a(), a));
                    }
                }
            }).b((ajdb) ((ztt) this.a.f.get()).a(this.b.a(), list));
        }
    }

    /* renamed from: ztv$j */
    static final class j<T> implements ajfb<Throwable> {
        private /* synthetic */ zub a;

        j(zub zub) {
            this.a = zub;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ztv$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ztv a;
        private /* synthetic */ zub b;

        l(ztv ztv, zub zub) {
            this.a = ztv;
            this.b = zub;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajxw) obj, "it");
            ztp ztp = (ztp) this.a.g.get();
            String a = this.b.a();
            akcr.b(a, "originalSessionId");
            obj = ztp.b().callInTransaction("MediaResolver:deleteMediaReferenceAndReleaseMedia", new e(ztp, a)).a((ajdw) ztp.c().b()).a((ajfc) new f(ztp, a));
            akcr.a(obj, "dbClient.callInTransacti…      }\n                }");
            return obj;
        }
    }

    /* renamed from: ztv$m */
    static final class m<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return ajdp.b((Iterable) list);
        }
    }

    /* renamed from: ztv$n */
    static final class n<T, R> implements ajfc<String, ajdb> {
        final /* synthetic */ ztv a;
        final /* synthetic */ zub b;

        n(ztv ztv, zub zub) {
            this.a = ztv;
            this.b = zub;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            akcr.b(str, Fields.CONTENT_ID);
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ n a;

                public final void run() {
                    Iterator it = this.a.a.a.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        String str = Fields.CONTENT_ID;
                        String a;
                        if (hasNext) {
                            gpl gpl = (gpl) ((Entry) it.next()).getValue();
                            a = this.a.b.a();
                            String str2 = str;
                            akcr.a((Object) str2, str);
                            gpl.a(ztv.a(a, str2));
                        } else {
                            gpl gpl2 = this.a.a.c;
                            String a2 = this.a.b.a();
                            a = str;
                            akcr.a((Object) a, str);
                            gpl2.a(ztv.a(a2, a));
                            gpl2 = this.a.a.b;
                            a2 = this.a.b.a();
                            a = str;
                            akcr.a((Object) a, str);
                            gpl2.a(ztv.a(a2, a));
                            return;
                        }
                    }
                }
            }).b((ajdb) ((ofb) this.a.i.get()).a(str)).b((ajdb) ((ztt) this.a.f.get()).a(this.b.a(), ajyl.a(str)));
        }
    }

    /* renamed from: ztv$s */
    static final class s<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ztv a;
        private /* synthetic */ zub b;

        s(ztv ztv, zub zub) {
            this.a = ztv;
            this.b = zub;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((zub) obj, "it");
            return ((ztp) this.a.g.get()).a(this.b);
        }
    }

    /* renamed from: ztv$t */
    static final class t<T, R> implements ajfc<T, R> {
        private /* synthetic */ ConcurrentHashMap a;

        t(ConcurrentHashMap concurrentHashMap) {
            this.a = concurrentHashMap;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "mediaPackages");
            Iterable<abyi> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abyi abyi : iterable) {
                this.a.put(abyi.b, new a(abyi));
                arrayList.add(ajxw.a);
            }
            return list;
        }
    }

    /* renamed from: ztv$u */
    static final class u<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ ztv a;
        final /* synthetic */ idd b;
        final /* synthetic */ ztq c;
        final /* synthetic */ zub d;
        final /* synthetic */ ConcurrentHashMap e;
        final /* synthetic */ zue f;
        final /* synthetic */ b g;

        /* renamed from: ztv$u$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ u a;

            1(u uVar) {
                this.a = uVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Object obj2 = (abyi) obj;
                akcr.b(obj2, "it");
                ztv ztv = this.a.a;
                idd idd = this.a.b;
                ztq ztq = this.a.c;
                zub zub = this.a.d;
                ConcurrentHashMap concurrentHashMap = this.a.e;
                obj = ajdp.b((Iterable) ztv.e).a(ajdx.b(obj2), (ajex) new b(ztv, ztq, zub, this.a.f.b, idd, concurrentHashMap, obj2)).a((ajfc) c.a);
                akcr.a(obj, "Observable.fromIterable(…          .flatMap { it }");
                return obj;
            }
        }

        /* renamed from: ztv$u$3 */
        static final class 3<T, R> implements ajfc<T, Iterable<? extends U>> {
            public static final 3 a = new 3();

            3() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "it");
                return list;
            }
        }

        /* renamed from: ztv$u$4 */
        static final class 4<T, R> implements ajfc<T, ajeb<? extends R>> {
            final /* synthetic */ u a;

            4(u uVar) {
                this.a = uVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final abyi abyi = (abyi) obj;
                String str = "mediaPackage";
                akcr.b(abyi, str);
                a aVar = (a) this.a.e.get(abyi.b);
                String str2 = aVar != null ? aVar.b : null;
                ztq ztq = this.a.c;
                zub zub = this.a.d;
                a aVar2 = a.UPLOAD;
                gpl gpl = this.a.a.c;
                String a = ztv.a(this.a.d.a(), abyi.b);
                ztt ztt = (ztt) this.a.a.f.get();
                String a2 = this.a.d.a();
                b bVar = this.a.g;
                akcr.b(abyi, str);
                akcr.b(a2, "originalSessionId");
                Object a3 = ((ftl) ztt.k.get()).b((fth) zun.MDP_PERSIST_UPLOAD_STATE_ANDROID).a((ajfc) new h(ztt, a2, abyi));
                akcr.a(a3, "configurationProvider.ge…      }\n                }");
                abyi abyi2 = abyi;
                Object a4 = a3.a((ajfc) new j(ztt, abyi2, a2, bVar, str2));
                akcr.a(a4, "getSavedUploadedResultFr…      }\n                }");
                return ztq.a(zub, abyi2, aVar2, gpl.a(a, a4), this.a.a.a().f()).f(new ajfc<T, R>(this) {
                    private /* synthetic */ 4 a;

                    public final /* synthetic */ Object apply(Object obj) {
                        c cVar = (c) obj;
                        akcr.b(cVar, "result");
                        a aVar = (a) this.a.a.e.get(abyi.b);
                        if (aVar != null) {
                            aVar.d = cVar;
                        }
                        return cVar;
                    }
                }).h(new ajfc<Throwable, ajeb<? extends c>>(this) {
                    private /* synthetic */ 4 a;

                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        akcr.b(th, "throwable");
                        zuf a = a.a(a.UPLOAD, th);
                        a aVar = (a) this.a.a.e.get(abyi.b);
                        if (aVar != null) {
                            aVar.c = a;
                            aVar.a(ztv.a(a));
                        }
                        return ajdx.b((Throwable) a);
                    }
                });
            }
        }

        /* renamed from: ztv$u$5 */
        static final class 5<T, R> implements ajfc<T, R> {
            private /* synthetic */ u a;

            5(u uVar) {
                this.a = uVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                c cVar = (c) obj;
                akcr.b(cVar, "result");
                return new zua(cVar.a, cVar.b, new ztz(((ihh) this.a.a.h.get()).a() - this.a.c.a, ajzm.c((Map) this.a.c.b), cVar.c));
            }
        }

        /* renamed from: ztv$u$6 */
        static final class 6<T, R> implements ajfc<T, K> {
            public static final 6 a = new 6();

            6() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                zua zua = (zua) obj;
                akcr.b(zua, "it");
                return zua.a.b;
            }
        }

        /* renamed from: ztv$u$7 */
        static final class 7<T, R> implements ajfc<T, V> {
            public static final 7 a = new 7();

            7() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                zua zua = (zua) obj;
                akcr.b(zua, "it");
                return zua;
            }
        }

        u(ztv ztv, idd idd, ztq ztq, zub zub, ConcurrentHashMap concurrentHashMap, zue zue, b bVar) {
            this.a = ztv;
            this.b = idd;
            this.c = ztq;
            this.d = zub;
            this.e = concurrentHashMap;
            this.f = zue;
            this.g = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "mediaPackages");
            Iterable<abyi> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abyi abyi : iterable) {
                arrayList.add(abyi.b);
            }
            final List k = ajyu.k((List) arrayList);
            return ajdp.b((Iterable) iterable).n(new 1(this)).a(16).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                final /* synthetic */ u a;

                /* renamed from: ztv$u$2$2 */
                static final class 2<T, R> implements ajfc<T, ajeb<? extends R>> {
                    private /* synthetic */ 2 a;

                    2(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        String str;
                        obj = (List) obj;
                        akcr.b(obj, "it");
                        Iterable<abyi> iterable = (Iterable) obj;
                        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                        for (abyi abyi : iterable) {
                            arrayList.add(abyi.b);
                        }
                        if (!k.containsAll(ajyu.m((List) arrayList))) {
                            ieg.a("ERROR PLEASE SHAKE: Media transformations incorrectly modified content ids!", true, 0);
                        }
                        if ((akcr.a(obj, list) ^ 1) != 0) {
                            ztp ztp = (ztp) this.a.a.a.g.get();
                            zub zub = this.a.a.d;
                            akcr.b(obj, "newMediaPackages");
                            akcr.b(zub, "oldMediaReference");
                            obj = ((odu) ztp.b.get()).b(ztp.a(), (List) obj).a((ajfc) new k(ztp, zub)).a((ajfc) new l(ztp, zub)).f(m.a);
                            str = "mediaPackageManager.get(….map { it.mediaPackages }";
                        } else {
                            obj = ajdx.b(obj);
                            str = "Single.just(it)";
                        }
                        akcr.a(obj, str);
                        return obj;
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    final List list = (List) obj;
                    akcr.b(list, "transformedMediaPackages");
                    Iterable<abyi> iterable = list;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (abyi abyi : iterable) {
                        akcr.a((Object) abyi, "it");
                        arrayList.add(ztv.a(this.a.d.a(), abyi.b));
                    }
                    String a = ajyu.a((Iterable) (List) arrayList, null, null, null, 0, null, null, 63);
                    gpl gpl = this.a.a.b;
                    obj = ajdx.c((Callable) new Callable<T>() {
                        public final /* bridge */ /* synthetic */ Object call() {
                            return list;
                        }
                    }).a((ajfc) new 2(this));
                    akcr.a(obj, "Single.fromCallable { tr…                        }");
                    return gpl.a(a, obj).a;
                }
            }).i().l(3.a).n(new 4(this)).p(new 5(this)).a((ajfc) 6.a, (ajfc) 7.a).f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    Map map = (Map) obj;
                    akcr.b(map, "it");
                    Collection arrayList = new ArrayList();
                    for (String str : k) {
                        zua zua = (zua) map.get(str);
                        if (zua != null) {
                            arrayList.add(zua);
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    /* renamed from: ztv$v */
    static final class v<T> implements ajfb<List<? extends zua>> {
        private /* synthetic */ ztv a;
        private /* synthetic */ ConcurrentHashMap b;
        private /* synthetic */ zue c;
        private /* synthetic */ ztq d;

        v(ztv ztv, ConcurrentHashMap concurrentHashMap, zue zue, ztq ztq) {
            this.a = ztv;
            this.b = concurrentHashMap;
            this.c = zue;
            this.d = ztq;
        }

        public final /* synthetic */ void accept(Object obj) {
            for (Entry value : this.b.entrySet()) {
                ((a) value.getValue()).a(aart.SUCCESS);
            }
            ztv.a(this.a, this.c, this.b, this.d);
        }
    }

    /* renamed from: ztv$w */
    static final class w<T, R> implements ajfc<Throwable, ajeb<? extends List<? extends zua>>> {
        private /* synthetic */ ztv a;
        private /* synthetic */ zue b;
        private /* synthetic */ ConcurrentHashMap c;
        private /* synthetic */ ztq d;

        w(ztv ztv, zue zue, ConcurrentHashMap concurrentHashMap, ztq ztq) {
            this.a = ztv;
            this.b = zue;
            this.c = concurrentHashMap;
            this.d = ztq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "throwable");
            ztv.a(this.a, this.b, this.c, this.d);
            return ajdx.b(th);
        }
    }

    /* renamed from: ztv$x */
    static final class x<T> implements ajfb<List<? extends zua>> {
        private /* synthetic */ zub a;

        x(zub zub) {
            this.a = zub;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ztv$y */
    static final class y<T> implements ajfb<Throwable> {
        private /* synthetic */ zub a;

        y(zub zub) {
            this.a = zub;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ztv.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public ztv(List<zud> list, ajwy<ztt> ajwy, ajwy<odu> ajwy2, ajwy<ztp> ajwy3, ajwy<ihh> ajwy4, ajwy<ofb> ajwy5, zgb zgb, rxj rxj, ftl ftl, abse abse, ztw ztw, evg evg) {
        akcr.b(list, "uploadMediaStepPlugins");
        akcr.b(ajwy, "uploadMediaController");
        akcr.b(ajwy2, "mediaPackageManager");
        akcr.b(ajwy3, "mediaResolver");
        akcr.b(ajwy4, "clock");
        akcr.b(ajwy5, "mediaTrimController");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(rxj, "bandwidthClassManager");
        akcr.b(ftl, "configProvider");
        akcr.b(abse, "displayMetrics");
        akcr.b(ztw, "uploadMediaMetricsController");
        akcr.b(evg, "circumstanceEngine");
        this.e = list;
        this.f = ajwy;
        this.p = ajwy2;
        this.g = ajwy3;
        this.h = ajwy4;
        this.i = ajwy5;
        this.q = zgb;
        this.j = rxj;
        this.k = ftl;
        this.l = abse;
        this.m = ztw;
        this.n = evg;
        Iterable<zud> iterable = this.e;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (zud zud : iterable) {
            arrayList.add(ajxs.a(zud.a(), new gpl(p.a, zud.a().name())));
        }
        this.a = ajzm.a((Iterable) (List) arrayList);
        this.b = new gpl(q.a, "UPDATE_MEDIA_REFERENCE");
        this.c = new gpl(z.a, a.UPLOAD.name());
        this.o = ajxh.a(new o(this));
        this.d = new ConcurrentHashMap();
    }

    static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(':');
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final ajcx a(zub zub) {
        akcr.b(zub, "mediaReference");
        Object a = ajdx.c((Callable) new k(this, zub)).a((ajfc) new l(this, zub)).d((ajfc) m.a).a((ajfc) new n(this, zub), false);
        akcr.a(a, "Single.fromCallable {\n  …ntId)))\n                }");
        return a;
    }

    public final ajdp<zub> a(idd idd, List<abyi> list) {
        akcr.b(idd, "caller");
        akcr.b(list, "mediaPackages");
        Object obj = 1;
        if (list.size() != 1 || abyj.a((abyi) list.get(0))) {
            obj = null;
        }
        Object g = (obj != null ? ((odu) this.p.get()).a(idd, (abyi) list.get(0), odu.a.a(((abyi) list.get(0)).a().b)).i() : ajdp.b((Object) list)).k((ajfc) new d(this, idd)).g((ajfc) new e(this));
        akcr.a(g, "mediaPackageSource.flatM…nce(listOf(it))\n        }");
        return g;
    }

    public final ajdx<zub> a(List<abyi> list) {
        akcr.b(list, "mediaPackages");
        return ((ztp) this.g.get()).a((List) list);
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.o.b();
    }

    public final void a(idd idd, zub zub, zue zue, b bVar) {
        akcr.b(idd, "caller");
        akcr.b(zub, "mediaReference");
        akcr.b(zue, "uploadAnalytics");
        Map map = this.d;
        String a = zub.a();
        Object a2 = b(idd, zub, zue, bVar).a((ajfb) new x(zub), (ajfb) new y(zub));
        akcr.a(a2, "upload(caller, mediaRefe…ence\")\n                })");
        map.put(a, a2);
    }

    public final ajcx b() {
        Object a = ajdp.a(0, 12000, TimeUnit.MILLISECONDS).p(new r((ztt) this.f.get(), new AtomicBoolean(true))).g().a(ajfu.g);
        akcr.a(a, "Observable.interval(init…       .onErrorComplete()");
        a = a.b((ajdw) a().f());
        akcr.a(a, "uploadMediaController.ge…scribeOn(schedulers.io())");
        return a;
    }

    public final ajcx b(zub zub) {
        akcr.b(zub, "mediaReference");
        Object a = ajcx.b((Callable) new g(zub)).b((ajeb) ((ztp) this.g.get()).a(zub)).f(h.a).e((ajfc) new i(this, zub)).a((ajfb) new j(zub));
        akcr.a(a, "Completable.fromCallable…ence.\")\n                }");
        return a;
    }

    public final ajdx<List<zua>> b(idd idd, zub zub, zue zue, b bVar) {
        zub zub2 = zub;
        zue zue2 = zue;
        idd idd2 = idd;
        akcr.b(idd, "caller");
        akcr.b(zub2, "mediaReference");
        akcr.b(zue2, "uploadAnalytics");
        Object obj = this.h.get();
        akcr.a(obj, "clock.get()");
        ztq ztq = new ztq((ihh) obj);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        obj = ajdx.c((Callable) new r(zub2, ztq)).a((ajdw) a().b()).a((ajfc) new s(this, zub2)).f(new t(concurrentHashMap)).a((ajfc) new u(this, idd2, ztq, zub2, concurrentHashMap, zue, bVar)).c((ajfb) new v(this, concurrentHashMap, zue2, ztq)).h(new w(this, zue2, concurrentHashMap, ztq));
        akcr.a(obj, "Single.fromCallable {\n  …owable)\n                }");
        return obj;
    }
}
