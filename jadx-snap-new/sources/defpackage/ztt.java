package defpackage;

import com.google.common.base.Optional;
import com.google.common.net.MediaType;
import com.google.protobuf.nano.Timestamp;
import com.snap.core.db.record.UploadedMediaRecord;
import defpackage.ryz.c;
import defpackage.rzu.b;
import defpackage.zuk.a;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ztt */
public final class ztt implements zuk {
    static final ajxe l = ajxh.a(b.a);
    final ajxe a = ajxh.a(new l(this));
    final a b = a.UPLOAD;
    final ajwy<odu> c;
    final ajwy<zuh> d;
    final ajwy<rzx> e;
    final ajwy<gfx> f;
    final ajwy<gqr> g;
    final ajwy<ztw> h;
    final ajwy<ihh> i;
    final ajwy<zuu> j;
    final ajwy<ftl> k;
    private final ajxe m = ajxh.a(d.a);
    private final ajxe n = ajxh.a(new m(this));
    private final ajxe o = ajxh.a(new e(this));

    /* renamed from: ztt$b */
    static final class b extends akcs implements akbk<SimpleDateFormat> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        }
    }

    /* renamed from: ztt$d */
    static final class d extends akcs implements akbk<idd> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zui.a.callsite("UploadMediaManager:UploadMediaController");
        }
    }

    /* renamed from: ztt$a */
    public static final class a {
        static {
            new aken[1][0] = new akdc(akde.a(a.class), "rfcDateFormatter", "getRfcDateFormatter()Ljava/text/SimpleDateFormat;");
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ztt$l */
    static final class l extends akcs implements akbk<zuh> {
        private /* synthetic */ ztt a;

        l(ztt ztt) {
            this.a = ztt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zuh) this.a.d.get();
        }
    }

    /* renamed from: ztt$m */
    static final class m extends akcs implements akbk<ztw> {
        private /* synthetic */ ztt a;

        m(ztt ztt) {
            this.a = ztt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ztw) this.a.h.get();
        }
    }

    /* renamed from: ztt$e */
    static final class e extends akcs implements akbk<ihh> {
        private /* synthetic */ ztt a;

        e(ztt ztt) {
            this.a = ztt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.i.get();
        }
    }

    /* renamed from: ztt$r */
    static final class r<T, R> implements ajfc<T, R> {
        private /* synthetic */ ztt a;
        private /* synthetic */ AtomicBoolean b;

        r(ztt ztt, AtomicBoolean atomicBoolean) {
            this.a = ztt;
            this.b = atomicBoolean;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            ztt ztt = this.a;
            AtomicBoolean atomicBoolean = this.b;
            if (atomicBoolean.compareAndSet(true, false)) {
                gfx gfx = (gfx) ztt.f.get();
                Object c = new ryz.a("https://cf-st.sc-cdn.net/ping/ping_res", sac.GET, c.SMALL_MEDIA, new HashSet()).e();
                akcr.a(c, "NetworkRequest.Builder(\n…dulingContext>()).build()");
                gfx.a(c, null).e().a((ajev) new p(atomicBoolean), (ajfb) new q(atomicBoolean));
            }
            return l;
        }
    }

    /* renamed from: ztt$p */
    static final class p implements ajev {
        private /* synthetic */ AtomicBoolean a;

        p(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        public final void run() {
            this.a.compareAndSet(false, true);
        }
    }

    /* renamed from: ztt$q */
    static final class q<T> implements ajfb<Throwable> {
        private /* synthetic */ AtomicBoolean a;

        q(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.compareAndSet(false, true);
        }
    }

    /* renamed from: ztt$c */
    public static final class c {
        final abyi a;
        final acgp b;
        final long c;

        public c(abyi abyi, acgp acgp, long j) {
            akcr.b(abyi, "mediaPackage");
            akcr.b(acgp, "uploadLocation");
            this.a = abyi;
            this.b = acgp;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (akcr.a(this.a, cVar.a) && akcr.a(this.b, cVar.b)) {
                        if ((this.c == cVar.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            abyi abyi = this.a;
            int i = 0;
            int hashCode = (abyi != null ? abyi.hashCode() : 0) * 31;
            acgp acgp = this.b;
            if (acgp != null) {
                i = acgp.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.c;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("UploadResult(mediaPackage=");
            stringBuilder.append(this.a);
            stringBuilder.append(", uploadLocation=");
            stringBuilder.append(this.b);
            stringBuilder.append(", uploadMediaSize=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: ztt$f */
    static final class f<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ ztt a;
        private /* synthetic */ List b;
        private /* synthetic */ String c;

        f(ztt ztt, List list, String str) {
            this.a = ztt;
            this.b = list;
            this.c = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "dbPersistUploadStateAbEnabled");
            return bool.booleanValue() ? ((zuu) this.a.j.get()).a(this.c, this.b) : ajvo.a(ajhn.a);
        }
    }

    /* renamed from: ztt$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ ztt a;
        private /* synthetic */ String b;
        private /* synthetic */ abyi c;

        g(ztt ztt, String str, abyi abyi) {
            this.a = ztt;
            this.b = str;
            this.c = abyi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "result");
            if (!optional.isPresent()) {
                return Optional.absent();
            }
            abyi abyi = this.c;
            Object encryption_key = ((UploadedMediaRecord) optional.get()).encryption_key();
            akcr.a(encryption_key, "result.get().encryption_key()");
            Object encryption_iv = ((UploadedMediaRecord) optional.get()).encryption_iv();
            akcr.a(encryption_iv, "result.get().encryption_iv()");
            abye abye = new abye(encryption_key, encryption_iv);
            encryption_key = ((UploadedMediaRecord) optional.get()).upload_location();
            akcr.a(encryption_key, "result.get().upload_location()");
            return Optional.fromNullable(ztt.a(abyi, abye, encryption_key, ((UploadedMediaRecord) optional.get()).upload_size()));
        }
    }

    /* renamed from: ztt$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ztt a;
        private /* synthetic */ String b;
        private /* synthetic */ abyi c;

        h(ztt ztt, String str, abyi abyi) {
            this.a = ztt;
            this.b = str;
            this.c = abyi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "dbPersistUploadStateAbEnabled");
            if (bool.booleanValue()) {
                ztt ztt = this.a;
                str = this.b;
                abyi abyi = this.c;
                obj = ((zuu) ztt.j.get()).a(str, abyi.b).f(new g(ztt, str, abyi));
                str = "uploadedMediaRepository.…      }\n                }";
            } else {
                obj = ajdx.b(Optional.absent());
                str = "Single.just(Optional.absent<UploadResult>())";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: ztt$i */
    static final class i<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ ztt a;
        private /* synthetic */ abyi b;
        private /* synthetic */ String c;
        private /* synthetic */ abye d;
        private /* synthetic */ long e;
        private /* synthetic */ acgp f;

        i(ztt ztt, abyi abyi, String str, abye abye, long j, acgp acgp) {
            this.a = ztt;
            this.b = abyi;
            this.c = str;
            this.d = abye;
            this.e = j;
            this.f = acgp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "dbPersistUploadStateAbEnabled");
            return bool.booleanValue() ? ((zuu) this.a.j.get()).a(this.c, this.b.b, this.d.a, this.d.b, this.e, this.f, (((ihh) this.a.o.b()).a() / 1000) + 86400) : ajvo.a(ajhn.a);
        }
    }

    /* renamed from: ztt$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ztt a;
        private /* synthetic */ abyi b;
        private /* synthetic */ String c;
        private /* synthetic */ b d;
        private /* synthetic */ String e;

        j(ztt ztt, abyi abyi, String str, b bVar, String str2) {
            this.a = ztt;
            this.b = abyi;
            this.c = str;
            this.d = bVar;
            this.e = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Optional optional = (Optional) obj;
            akcr.b(optional, "uploadResult");
            if (optional.isPresent()) {
                ((ztw) this.a.n.b()).a(((c) optional.get()).b, true, ((ihh) this.a.o.b()).a());
                obj = ajdx.b(optional.get());
                str = "Single.just(uploadResult.get())";
            } else {
                ztt ztt = this.a;
                abyi abyi = this.b;
                String str2 = this.c;
                obj = ((zuh) ztt.a.b()).b().h(new ztu(new n(ztt))).a((ajfc) new o(ztt, abyi, this.d, this.e, str2));
                str = "uploadLocationProvider.g…eption)\n                }";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: ztt$k */
    static final class k<T, R> implements ajfc<T, R> {
        private /* synthetic */ abye a;

        k(abye abye) {
            this.a = abye;
        }

        public final /* synthetic */ Object apply(Object obj) {
            sat sat = (sat) obj;
            akcr.b(sat, "it");
            return new ajxm(this.a, sat);
        }
    }

    /* renamed from: ztt$o */
    static final class o<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ ztt a;
        final /* synthetic */ abyi b;
        final /* synthetic */ b c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        o(ztt ztt, abyi abyi, b bVar, String str, String str2) {
            this.a = ztt;
            this.b = abyi;
            this.c = bVar;
            this.d = str;
            this.e = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final acgp acgp = (acgp) obj;
            akcr.b(acgp, "uploadLocation");
            return ((odu) this.a.c.get()).c(((idd) this.a.m.b()), this.b).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                final /* synthetic */ o a;

                public final /* synthetic */ Object apply(Object obj) {
                    final odx odx = (odx) obj;
                    akcr.b(odx, "mediaPackageReader");
                    Object a = ajdx.c((Callable) new Callable<T>() {
                        public final /* synthetic */ Object call() {
                            return odx.a();
                        }
                    }).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                        private /* synthetic */ 1 a;

                        public final /* synthetic */ Object apply(Object obj) {
                            akcr.b((odx) obj, "it");
                            ztt ztt = this.a.a.a;
                            Object obj2 = odx;
                            akcr.a(obj2, "mediaPackageReader");
                            Object obj3 = acgp;
                            akcr.a(obj3, "uploadLocation");
                            b bVar = this.a.a.c;
                            String str = this.a.a.d;
                            Object a = abnd.a();
                            akcr.a(a, "MediaEncryptionUtils.generateKey()");
                            Object b = abnd.b();
                            akcr.a(b, "MediaEncryptionUtils.generateIv()");
                            abye abye = new abye(a, b);
                            InputStream bufferedInputStream = new BufferedInputStream(obj2.f());
                            String str2 = abye.a;
                            String str3 = abye.b;
                            akcr.b(bufferedInputStream, "inputStream");
                            akcr.b(str2, "key");
                            akcr.b(str3, "iv");
                            sbd sba = new sba(bufferedInputStream, str2, str3);
                            long a2 = abmv.a(obj2.g());
                            obj3 = obj3.b();
                            akcr.a(obj3, "uploadLocation.uploadUrl");
                            String str4 = obj2.b().e.h;
                            obj3 = new ryz.a(obj3, sac.PUT, c.UPLOAD, new HashSet()).a(sbg.a(MediaType.OCTET_STREAM, a2, sba));
                            akcr.a(obj3, "NetworkRequest.Builder(\n…ET_STREAM, size, stream))");
                            if (str4 != null) {
                                obj3.b("__xsc_local__:capture_media_id", str4);
                            }
                            if (str != null) {
                                obj3.b("__xsc_local__:media_orchestration_attempt_id", str);
                            }
                            obj2 = obj3.e();
                            akcr.a(obj2, "builder.build()");
                            obj = ((gfx) ztt.f.get()).a(obj2, bVar).f(new k(abye));
                            akcr.a(obj, "uploadManager.get().subm… { Pair(encryption, it) }");
                            return obj;
                        }
                    });
                    akcr.a(a, "Single.fromCallable { me…OrchestrationAttemptId) }");
                    Object obj2 = this.a.a.g.get();
                    akcr.a(obj2, "exceptionTracker.get()");
                    return ody.a(a, odx, (gqr) obj2, ((idd) this.a.a.m.b()).a("upload"));
                }
            }).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ o a;

                public final /* synthetic */ Object apply(Object obj) {
                    ajxm ajxm = (ajxm) obj;
                    String str = "result";
                    akcr.b(ajxm, str);
                    ztt ztt = this.a.a;
                    abye abye = (abye) ajxm.a;
                    sat sat = (sat) ajxm.b;
                    abyi abyi = this.a.b;
                    acgp acgp = acgp;
                    akcr.a((Object) acgp, "uploadLocation");
                    String str2 = this.a.e;
                    Object a = sat.a();
                    String str3 = "result.response";
                    akcr.a(a, str3);
                    int i = 0;
                    Object parse;
                    if (a.b()) {
                        if (zts.a.a(acgp)) {
                            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) ztt.l.b();
                            a = sat.a();
                            akcr.a(a, str3);
                            parse = simpleDateFormat.parse((String) a.h().get("Date"));
                            a = acgp.b;
                            akcr.a(a, "contentObject");
                            acev c = a.c();
                            Timestamp timestamp = new Timestamp();
                            akcr.a(parse, "uploadDateTime");
                            timestamp.setSeconds((parse.getTime() / 1000) + TimeUnit.DAYS.toSeconds(1));
                            c.c = c.d;
                            c.d = new long[0];
                            c.b = timestamp;
                            c.a = timestamp;
                        }
                        obj = sat.b();
                        akcr.a(obj, "result.request");
                        sai sai = (sai) obj.n();
                        long c2 = sai != null ? sai.c() : -1;
                        obj = ((ftl) ztt.k.get()).b((fth) zun.MDP_PERSIST_UPLOAD_STATE_ANDROID).e((ajfc) new i(ztt, abyi, str2, abye, c2, acgp));
                        akcr.a(obj, "configurationProvider.ge…      }\n                }");
                        obj = obj.b((ajeb) ajdx.b(ztt.a(abyi, abye, acgp, c2)));
                        str = "saveUploadedResultToDBIf…adLocation, uploadSize)))";
                    } else {
                        rzx rzx = (rzx) ztt.e.get();
                        akcr.b(sat, str);
                        parse = sat.a();
                        akcr.a(parse, str3);
                        if (parse.a() == 0) {
                            parse = sat.a();
                            akcr.a(parse, str3);
                            parse = parse.d();
                            if (parse != null) {
                                akcr.a(parse, "it");
                                i = rzx.a(parse);
                            } else {
                                i = 1;
                            }
                        }
                        a aVar;
                        if (i != 0) {
                            aVar = ztt.b;
                            obj = sat.a();
                            akcr.a(obj, str3);
                            obj = ajdx.b((Throwable) new zuc(aVar, obj.d()));
                            str = "Single.error(NoNetworkUp…sult.response.exception))";
                        } else {
                            aVar = ztt.b;
                            StringBuilder stringBuilder = new StringBuilder("Media upload request unsuccessful. Code: ");
                            Object a2 = sat.a();
                            akcr.a(a2, str3);
                            stringBuilder.append(a2.a());
                            stringBuilder.append(". Message: ");
                            a2 = sat.a();
                            akcr.a(a2, str3);
                            stringBuilder.append(a2.c());
                            String stringBuilder2 = stringBuilder.toString();
                            obj = sat.a();
                            akcr.a(obj, str3);
                            obj = ajdx.b((Throwable) new zuf(aVar, stringBuilder2, obj.d(), true));
                            str = "Single.error(UploadExcep…                   true))";
                        }
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            }).c((ajfb) new ajfb<c>(this) {
                private /* synthetic */ o a;

                public final /* synthetic */ void accept(Object obj) {
                    long a = ((ihh) this.a.a.o.b()).a();
                    ztw b = ((ztw) this.a.a.n.b());
                    Object obj2 = acgp;
                    akcr.a(obj2, "uploadLocation");
                    b.a(obj2, true, a);
                }
            }).d((ajfb) new ajfb<Throwable>(this) {
                private /* synthetic */ o a;

                public final /* synthetic */ void accept(Object obj) {
                    long a = ((ihh) this.a.a.o.b()).a();
                    ztw b = ((ztw) this.a.a.n.b());
                    Object obj2 = acgp;
                    akcr.a(obj2, "uploadLocation");
                    b.a(obj2, false, a);
                }
            }).h(new ztu(new akbl<Throwable, ajdx<c>>(this.a) {
                public final String getName() {
                    return "handleException";
                }

                public final akej getOwner() {
                    return akde.a(ztt.class);
                }

                public final String getSignature() {
                    return "handleException(Ljava/lang/Throwable;)Lio/reactivex/Single;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    String str;
                    Throwable th = (Throwable) obj;
                    akcr.b(th, "p1");
                    ztt ztt = (ztt) this.receiver;
                    if (((rzx) ztt.e.get()).a(th)) {
                        obj = ajdx.b((Throwable) new zuc(ztt.b, th));
                        str = "Single.error(NoNetworkUp…ception(step, throwable))";
                    } else if (th instanceof zuf) {
                        obj = ajdx.b(th);
                        str = "Single.error(throwable)";
                    } else {
                        obj = ajdx.b((Throwable) new zuf(ztt.b, th.getMessage(), th, true));
                        str = "Single.error(UploadExcep…essage, throwable, true))";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            }));
        }
    }

    /* renamed from: ztt$n */
    static final class n extends akcq implements akbl<Throwable, ajdx<acgp>> {
        n(ztt ztt) {
            super(1, ztt);
        }

        public final String getName() {
            return "handleUrlException";
        }

        public final akej getOwner() {
            return akde.a(ztt.class);
        }

        public final String getSignature() {
            return "handleUrlException(Ljava/lang/Throwable;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            ztt ztt = (ztt) this.receiver;
            if (((rzx) ztt.e.get()).a(th)) {
                obj = ajdx.b((Throwable) new zuc(ztt.b, th));
                str = "Single.error(NoNetworkUp…ception(step, throwable))";
            } else if (th instanceof zuf) {
                obj = ajdx.b(th);
                str = "Single.error(throwable)";
            } else {
                obj = ajdx.b((Throwable) new zuf(ztt.b, "Failed to retrieve upload url", th, true));
                str = "Single.error(UploadExcep…d url\", throwable, true))";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ztt.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(ztt.class), "uploadLocationProvider", "getUploadLocationProvider()Lcom/snap/upload/api/UploadLocationProvider;"), new akdc(akde.a(ztt.class), "uploadMediaMetricsController", "getUploadMediaMetricsController()Lcom/snap/upload/UploadMediaMetricsController;"), new akdc(akde.a(ztt.class), "clock", "getClock()Lcom/snap/framework/time/Clock;")};
        a aVar = new a();
    }

    public ztt(ajwy<odu> ajwy, ajwy<zuh> ajwy2, ajwy<rzx> ajwy3, ajwy<gfx> ajwy4, ajwy<gqr> ajwy5, ajwy<ztw> ajwy6, ajwy<ihh> ajwy7, ajwy<zuu> ajwy8, ajwy<ftl> ajwy9) {
        akcr.b(ajwy, "mediaPackageManager");
        akcr.b(ajwy2, "providerOfUploadLocationProvider");
        akcr.b(ajwy3, "noNetworkDetector");
        akcr.b(ajwy4, "uploadManager");
        akcr.b(ajwy5, "exceptionTracker");
        akcr.b(ajwy6, "uploadMediaMetricsControllerProvider");
        akcr.b(ajwy7, "clockProvider");
        akcr.b(ajwy8, "uploadedMediaRepository");
        akcr.b(ajwy9, "configurationProvider");
        this.c = ajwy;
        this.d = ajwy2;
        this.e = ajwy3;
        this.f = ajwy4;
        this.g = ajwy5;
        this.h = ajwy6;
        this.i = ajwy7;
        this.j = ajwy8;
        this.k = ajwy9;
    }

    static c a(abyi abyi, abye abye, acgp acgp, long j) {
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        acgp acgp2 = acgp;
        return new c(abyi.a(abyi, null, null, null, uuid, null, null, abye, null, 183), acgp, j);
    }

    public final ajcx a(String str, List<String> list) {
        akcr.b(str, "sessionId");
        akcr.b(list, "contentIds");
        Object e = ((ftl) this.k.get()).b((fth) zun.MDP_PERSIST_UPLOAD_STATE_ANDROID).e((ajfc) new f(this, list, str));
        akcr.a(e, "configurationProvider.ge…      }\n                }");
        return e;
    }

    public final a a() {
        return this.b;
    }
}
