package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.brightcove.player.media.ErrorFields;
import com.google.common.base.Supplier;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.snap.lenses.app.data.LensesHttpInterface;
import com.snap.lenses.app.data.SocialUnlockHttpInterface;
import defpackage.kqf.a;
import defpackage.miw.b;
import defpackage.mxs.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: lfv */
final class lfv {

    /* renamed from: lfv$f */
    static final class f extends akcs implements akbk<mwe> {
        private /* synthetic */ ajwy a;

        /* renamed from: lfv$f$a */
        public static final class a implements mwe {
            private /* synthetic */ mwe a;

            /* renamed from: lfv$f$a$1 */
            public static final class 1<T, R> implements ajfc<T, R> {
                private /* synthetic */ a a;

                public 1(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "lenses");
                    if (list.isEmpty()) {
                        return list;
                    }
                    if (list.size() == 1) {
                        return (((Collection) ajyu.b((Iterable) ((mux) ajyu.f(list)).i.b, (Iterable) muz.SUPPORTED_CONTEXTS)).isEmpty() ^ 1) != 0 ? list : ajyw.a;
                    } else {
                        Collection arrayList = new ArrayList();
                        for (Object next : list) {
                            if ((ajyu.b((Iterable) ((mux) next).i.b, (Iterable) muz.SUPPORTED_CONTEXTS).isEmpty() ^ 1) != 0) {
                                arrayList.add(next);
                            }
                        }
                        return (List) arrayList;
                    }
                }
            }

            public a(mwe mwe) {
                this.a = mwe;
            }

            public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
                akcr.b(aVar, "queryCriteria");
                Object d = this.a.a(aVar).d((ajfc) new 1(this));
                akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                return d;
            }
        }

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(((mvc) this.a.get()).b());
        }
    }

    /* renamed from: lfv$d */
    public static final class d implements defpackage.mvc.d {
        private final ide a = this.g;
        private final zgb b = this.h;
        private final Context c = this.i.getApplicationContext();
        private final kqf d;
        private final miw e;
        private final Supplier<iha> f;
        private /* synthetic */ ide g;
        private /* synthetic */ zgb h;
        private /* synthetic */ Context i;
        private /* synthetic */ kqf j;
        private /* synthetic */ miw k;
        private /* synthetic */ Supplier l;
        private /* synthetic */ mxa m;
        private /* synthetic */ mzn n;
        private /* synthetic */ ldu o;
        private /* synthetic */ Set p;
        private /* synthetic */ lff q;
        private /* synthetic */ lhg r;
        private /* synthetic */ lfp s;
        private /* synthetic */ lgx t;
        private /* synthetic */ Gson u;
        private /* synthetic */ mwp v;

        d(ide ide, zgb zgb, Context context, kqf kqf, miw miw, Supplier supplier, mxa mxa, mzn mzn, ldu ldu, Set set, lff lff, lhg lhg, lfp lfp, lgx lgx, Gson gson, mwp mwp) {
            this.g = ide;
            this.h = zgb;
            this.i = context;
            this.j = kqf;
            this.k = miw;
            this.l = supplier;
            this.m = mxa;
            this.n = mzn;
            this.o = ldu;
            this.p = set;
            this.q = lff;
            this.r = lhg;
            this.s = lfp;
            this.t = lgx;
            this.u = gson;
            this.v = mwp;
            kqf kqf2 = this.j;
            if (kqf2 == null) {
                kqf2 = a.a;
            }
            this.d = kqf2;
            this.e = this.k;
            this.f = this.l;
        }

        public final ide a() {
            return this.a;
        }

        public final zgb b() {
            return this.b;
        }

        public final Context c() {
            return this.c;
        }

        public final kqf d() {
            return this.d;
        }

        public final Supplier<iha> e() {
            return this.f;
        }
    }

    /* renamed from: lfv$l */
    static final class l<T> implements Supplier<T> {
        private /* synthetic */ aipn a;

        l(aipn aipn) {
            this.a = aipn;
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return (LensesHttpInterface) this.a.get();
        }
    }

    /* renamed from: lfv$j */
    static final class j<T> implements Supplier<File> {
        private /* synthetic */ zgb a;
        private /* synthetic */ ide b;
        private /* synthetic */ miw c;
        private /* synthetic */ Context d;
        private /* synthetic */ Supplier e;
        private /* synthetic */ mhk f;

        j(zgb zgb, ide ide, miw miw, Context context, Supplier supplier, mhk mhk) {
            this.a = zgb;
            this.b = ide;
            this.c = miw;
            this.d = context;
            this.e = supplier;
            this.f = mhk;
        }

        public final /* synthetic */ Object get() {
            return new File(this.d.getFilesDir(), "scheduledLenses.proto");
        }
    }

    /* renamed from: lfv$c */
    public static final class c implements akbl<String, ajxw> {
        final /* synthetic */ Context a;
        private /* synthetic */ zfr b;

        /* renamed from: lfv$c$a */
        static final class a implements Runnable {
            private /* synthetic */ c a;
            private /* synthetic */ String b;

            a(c cVar, String str) {
                this.a = cVar;
                this.b = str;
            }

            public final void run() {
                Toast.makeText(this.a.a, this.b, 1).show();
            }
        }

        c(zfr zfr, Context context) {
            this.b = zfr;
            this.a = context;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, ErrorFields.MESSAGE);
            this.b.a((Runnable) new a(this, str));
            return ajxw.a;
        }
    }

    /* renamed from: lfv$b */
    static final class b extends akcs implements akbk<Boolean> {
        private /* synthetic */ Supplier a;

        b(Supplier supplier) {
            this.a = supplier;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((abss) this.a.get()).d());
        }
    }

    /* renamed from: lfv$a */
    static final class a<T> implements ajfb<muo> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((mvc) this.a.get()).d().accept((muo) obj);
        }
    }

    /* renamed from: lfv$g */
    public static final class g implements c {
        private final zgb a = this.b;
        private /* synthetic */ zgb b;
        private /* synthetic */ ajwy c;
        private /* synthetic */ mxp d;

        g(zgb zgb, ajwy ajwy, mxp mxp) {
            this.b = zgb;
            this.c = ajwy;
            this.d = mxp;
        }

        public final zgb a() {
            return this.a;
        }
    }

    /* renamed from: lfv$k */
    static final class k<T> implements Supplier<File> {
        private /* synthetic */ zgb a;
        private /* synthetic */ ide b;
        private /* synthetic */ miw c;
        private /* synthetic */ Context d;
        private /* synthetic */ Supplier e;
        private /* synthetic */ mhk f;

        k(zgb zgb, ide ide, miw miw, Context context, Supplier supplier, mhk mhk) {
            this.a = zgb;
            this.b = ide;
            this.c = miw;
            this.d = context;
            this.e = supplier;
            this.f = mhk;
        }

        public final /* synthetic */ Object get() {
            return new File(this.d.getFilesDir(), "scheduledLenses.json");
        }
    }

    /* renamed from: lfv$e */
    static final class e extends akcs implements akbw<ajdp<List<? extends moc>>, ide, lgw> {
        private /* synthetic */ gnk a;
        private /* synthetic */ zgb b;
        private /* synthetic */ ide c;
        private /* synthetic */ ldu d;
        private /* synthetic */ Supplier e;

        e(gnk gnk, zgb zgb, ide ide, ldu ldu, Supplier supplier) {
            this.a = gnk;
            this.b = zgb;
            this.c = ide;
            this.d = ldu;
            this.e = supplier;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ajdp ajdp = (ajdp) obj;
            ide ide = (ide) obj2;
            akcr.b(ajdp, "resourceRequests");
            akcr.b(ide, "attributedFeature");
            return new lgw(ajdp, this.d.d(), zgb.a(ide.callsite("LensesGenericPrefetchProcessor")), ide, this.e, this.d.e());
        }
    }

    /* renamed from: lfv$h */
    static final class h extends akcs implements akbk<mwe> {
        private /* synthetic */ zgb a;
        private /* synthetic */ ajwy b;
        private /* synthetic */ mxp c;

        h(zgb zgb, ajwy ajwy, mxp mxp) {
            this.a = zgb;
            this.b = ajwy;
            this.c = mxp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mwe) this.b.get();
        }
    }

    /* renamed from: lfv$i */
    static final class i extends akcs implements akbk<mwe> {
        private /* synthetic */ LinkedHashSet a;
        private /* synthetic */ lhg b;
        private /* synthetic */ lfp c;
        private /* synthetic */ lgx d;
        private /* synthetic */ lfp e;
        private /* synthetic */ lgx f;
        private /* synthetic */ zgb g;
        private /* synthetic */ ide h;

        i(LinkedHashSet linkedHashSet, lhg lhg, lfp lfp, lgx lgx, lfp lfp2, lgx lgx2, zgb zgb, ide ide) {
            this.a = linkedHashSet;
            this.b = lhg;
            this.c = lfp;
            this.d = lgx;
            this.e = lfp2;
            this.f = lgx2;
            this.g = zgb;
            this.h = ide;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            final mwe a = mwd.a((Collection) this.a, zgb.a(this.h.callsite("LensRepositories.merge#prefetchRepository")));
            return new mwe() {

                /* renamed from: lfv$i$1$1 */
                public static final class 1<T, R> implements ajfc<T, R> {
                    private /* synthetic */ 1 a;

                    public 1(1 1) {
                        this.a = 1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "lenses");
                        if (list.isEmpty()) {
                            return list;
                        }
                        if (list.size() == 1) {
                            return (((Collection) ajyu.b((Iterable) ((mux) ajyu.f(list)).i.b, (Iterable) muz.SUPPORTED_CONTEXTS)).isEmpty() ^ 1) != 0 ? list : ajyw.a;
                        } else {
                            Collection arrayList = new ArrayList();
                            for (Object next : list) {
                                if ((ajyu.b((Iterable) ((mux) next).i.b, (Iterable) muz.SUPPORTED_CONTEXTS).isEmpty() ^ 1) != 0) {
                                    arrayList.add(next);
                                }
                            }
                            return (List) arrayList;
                        }
                    }
                }

                public final ajde<List<mux>> a(mwe.a aVar) {
                    akcr.b(aVar, "queryCriteria");
                    Object d = a.a(aVar).d((ajfc) new 1(this));
                    akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                    return d;
                }
            };
        }
    }

    /* renamed from: lfv$m */
    static final class m extends akcs implements akbk<mwe> {
        private /* synthetic */ ajwy a;
        private /* synthetic */ lfq b;
        private /* synthetic */ zfw c;
        private /* synthetic */ kxt d;
        private /* synthetic */ ajwy e;
        private /* synthetic */ mwe f;

        m(ajwy ajwy, lfq lfq, zfw zfw, kxt kxt, ajwy ajwy2, mwe mwe) {
            this.a = ajwy;
            this.b = lfq;
            this.c = zfw;
            this.d = kxt;
            this.e = ajwy2;
            this.f = mwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mwe lhc = new lhc(this.a, this.b, this.c, this.d, (byte) 0);
            mwe[] mweArr = new mwe[]{mwd.a(lhc, ((mvc) this.e.get()).c()), this.f};
            akcr.b(mweArr, "lensRepositories");
            return new mwd.a(mweArr);
        }
    }

    /* renamed from: lfv$n */
    static final class n extends akcs implements akbk<mwe> {
        private /* synthetic */ lhd a;
        private /* synthetic */ zgb b;
        private /* synthetic */ ide c;
        private /* synthetic */ ckx d;
        private /* synthetic */ lfq e;
        private /* synthetic */ ajwy f;

        n(lhd lhd, zgb zgb, ide ide, ckx ckx, lfq lfq, ajwy ajwy) {
            this.a = lhd;
            this.b = zgb;
            this.c = ide;
            this.d = ckx;
            this.e = lfq;
            this.f = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return mwd.a((mwe) this.a, ((mvc) this.f.get()).c());
        }
    }

    static {
        lfv lfv = new lfv();
    }

    private lfv() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140 A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140 A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140 A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140 A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0140 A:{Catch:{ Throwable -> 0x00f2 }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d A:{Catch:{ Throwable -> 0x00f2 }} */
    public static final defpackage.ajdi<defpackage.aeqv, defpackage.aeqv> a(android.content.Context r12, defpackage.mhk r13, defpackage.ide r14, defpackage.zgb r15, com.google.common.base.Supplier<defpackage.iha> r16, defpackage.miw r17) {
        /*
        r3 = r14;
        r8 = r16;
        r0 = "context";
        r5 = r12;
        defpackage.akcr.b(r12, r0);
        r0 = "clock";
        r9 = r13;
        defpackage.akcr.b(r13, r0);
        r0 = "attributedFeature";
        defpackage.akcr.b(r14, r0);
        r0 = "schedulersProvider";
        r2 = r15;
        defpackage.akcr.b(r15, r0);
        r0 = "serializationHelperSupplier";
        defpackage.akcr.b(r8, r0);
        r0 = "configurationRepository";
        r4 = r17;
        defpackage.akcr.b(r4, r0);
        r0 = "ScheduledLensRepositoryCache";
        r0 = r14.callsite(r0);	 Catch:{ all -> 0x015e }
        r10 = defpackage.zgb.a(r0);	 Catch:{ all -> 0x015e }
        r0 = r17.a(defpackage.miw.b.a.a);	 Catch:{ all -> 0x015e }
        r1 = defpackage.mja.LENS_SCHEDULED_PROTO_CACHE_ENABLED;	 Catch:{ all -> 0x015e }
        r1 = (defpackage.mje) r1;	 Catch:{ all -> 0x015e }
        r6 = java.lang.Boolean.class;
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00f2 }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 != 0) goto L_0x00d7;
    L_0x0042:
        r7 = java.lang.Boolean.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 == 0) goto L_0x004c;
    L_0x004a:
        goto L_0x00d7;
    L_0x004c:
        r7 = java.lang.Integer.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 != 0) goto L_0x00d2;
    L_0x0054:
        r7 = java.lang.Integer.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x00d2;
    L_0x005d:
        r7 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00f2 }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 != 0) goto L_0x00cd;
    L_0x0065:
        r7 = java.lang.Long.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x00cd;
    L_0x006e:
        r7 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00f2 }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 != 0) goto L_0x00c8;
    L_0x0076:
        r7 = java.lang.Float.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x00c8;
    L_0x007f:
        r7 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00f2 }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 != 0) goto L_0x00c3;
    L_0x0087:
        r7 = java.lang.Double.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 == 0) goto L_0x0090;
    L_0x008f:
        goto L_0x00c3;
    L_0x0090:
        r7 = java.lang.String.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r7 != 0) goto L_0x00be;
    L_0x0098:
        r7 = java.lang.String.class;
        r6 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00f2 }
        if (r6 == 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00be;
    L_0x00a1:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00f2 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00f2 }
        r7 = "Unsupported input type: [";
        r6.<init>(r7);	 Catch:{ Throwable -> 0x00f2 }
        r7 = java.lang.Boolean.class;
        r6.append(r7);	 Catch:{ Throwable -> 0x00f2 }
        r7 = 93;
        r6.append(r7);	 Catch:{ Throwable -> 0x00f2 }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x00f2 }
        r0.<init>(r6);	 Catch:{ Throwable -> 0x00f2 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ Throwable -> 0x00f2 }
        throw r0;	 Catch:{ Throwable -> 0x00f2 }
    L_0x00be:
        r0 = r0.f(r1);	 Catch:{ Throwable -> 0x00f2 }
        goto L_0x00db;
    L_0x00c3:
        r0 = r0.c(r1);	 Catch:{ Throwable -> 0x00f2 }
        goto L_0x00db;
    L_0x00c8:
        r0 = r0.b(r1);	 Catch:{ Throwable -> 0x00f2 }
        goto L_0x00db;
    L_0x00cd:
        r0 = r0.e(r1);	 Catch:{ Throwable -> 0x00f2 }
        goto L_0x00db;
    L_0x00d2:
        r0 = r0.d(r1);	 Catch:{ Throwable -> 0x00f2 }
        goto L_0x00db;
    L_0x00d7:
        r0 = r0.a(r1);	 Catch:{ Throwable -> 0x00f2 }
    L_0x00db:
        r6 = java.lang.Boolean.class;
        r0 = r0.a(r6);	 Catch:{ Throwable -> 0x00f2 }
        r6 = "cast(R::class.java)";
        defpackage.akcr.a(r0, r6);	 Catch:{ Throwable -> 0x00f2 }
        r0 = r0.b();	 Catch:{ Throwable -> 0x00f2 }
        r6 = "observe<T>(key).blockingFirst()";
        defpackage.akcr.a(r0, r6);	 Catch:{ Throwable -> 0x00f2 }
        goto L_0x0113;
    L_0x00f0:
        r0 = move-exception;
        goto L_0x015d;
    L_0x00f2:
        r0 = move-exception;
        r6 = com.google.common.base.Throwables.getRootCause(r0);	 Catch:{ all -> 0x00f0 }
        r6 = r6 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00f0 }
        if (r6 == 0) goto L_0x015c;
    L_0x00fb:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00f0 }
        r0.interrupt();	 Catch:{ all -> 0x00f0 }
        r0 = r1.a();	 Catch:{ all -> 0x00f0 }
        r1 = "key.delegate";
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x00f0 }
        r0 = r0.b();	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x0154;
    L_0x0111:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x00f0 }
    L_0x0113:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x015e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x015e }
        if (r0 == 0) goto L_0x012a;
    L_0x011b:
        r11 = new lfv$j;	 Catch:{ all -> 0x015e }
        r1 = r11;
        r2 = r15;
        r3 = r14;
        r4 = r17;
        r5 = r12;
        r6 = r16;
        r7 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x015e }
        goto L_0x0138;
    L_0x012a:
        r11 = new lfv$k;	 Catch:{ all -> 0x015e }
        r1 = r11;
        r2 = r15;
        r3 = r14;
        r4 = r17;
        r5 = r12;
        r6 = r16;
        r7 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x015e }
    L_0x0138:
        r11 = (com.google.common.base.Supplier) r11;	 Catch:{ all -> 0x015e }
        r3 = r11;
        if (r0 == 0) goto L_0x0140;
    L_0x013d:
        r0 = defpackage.lhb.a.b.a;	 Catch:{ all -> 0x015e }
        goto L_0x0145;
    L_0x0140:
        r0 = new lhb$a$a;	 Catch:{ all -> 0x015e }
        r0.<init>(r8);	 Catch:{ all -> 0x015e }
    L_0x0145:
        r0 = (defpackage.lhb.a) r0;	 Catch:{ all -> 0x015e }
        r4 = r0;
        r0 = new lgy;	 Catch:{ all -> 0x015e }
        r6 = 0;
        r1 = r0;
        r2 = r13;
        r5 = r10;
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x015e }
        r0 = (defpackage.ajdi) r0;	 Catch:{ all -> 0x015e }
        return r0;
    L_0x0154:
        r0 = new ajxt;	 Catch:{ all -> 0x00f0 }
        r1 = "null cannot be cast to non-null type kotlin.Boolean";
        r0.<init>(r1);	 Catch:{ all -> 0x00f0 }
        throw r0;	 Catch:{ all -> 0x00f0 }
    L_0x015c:
        throw r0;	 Catch:{ all -> 0x00f0 }
    L_0x015d:
        throw r0;	 Catch:{ all -> 0x015e }
    L_0x015e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfv.a(android.content.Context, mhk, ide, zgb, com.google.common.base.Supplier, miw):ajdi");
    }

    public static final ajdp<Boolean> a(miw miw) {
        akcr.b(miw, "configurationRepository");
        Object c = miw.a(b.a.a).a(mja.SPONSORED_LENS_ENABLED).c(1).c();
        akcr.a(c, "configurationRepository\n…                 .cache()");
        return c;
    }

    public static final LensesHttpInterface a(mxa mxa) {
        akcr.b(mxa, "remoteServiceFactory");
        return (LensesHttpInterface) mxa.a(LensesHttpInterface.class);
    }

    public static final TimeZone a() {
        Object obj = TimeZone.getDefault();
        akcr.a(obj, "TimeZone.getDefault()");
        return obj;
    }

    public static final lbp a(lbp.a aVar, ide ide) {
        akcr.b(aVar, "lensesConfigurationComponentBuilder");
        akcr.b(ide, "attributedFeature");
        return aVar.a(ide).a();
    }

    public static final ldu a(lfu lfu, lcq lcq, ide ide) {
        akcr.b(lfu, "component");
        akcr.b(lcq, "encryptionRegistry");
        akcr.b(ide, "attributedFeature");
        ldu.c cVar = lfu;
        akcr.b(cVar, "parentComponent");
        return lcj.a().a(cVar).a(ide).a(lcq).a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114 A:{Catch:{ Throwable -> 0x00eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114 A:{Catch:{ Throwable -> 0x00eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114 A:{Catch:{ Throwable -> 0x00eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114 A:{Catch:{ Throwable -> 0x00eb }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114 A:{Catch:{ Throwable -> 0x00eb }} */
    public static final defpackage.lfp a(defpackage.zpo r10, defpackage.miw r11, defpackage.ajdp<java.lang.Boolean> r12, defpackage.ajdp<java.lang.Boolean> r13, long r14, defpackage.lfq r16, defpackage.ide r17, defpackage.zgb r18) {
        /*
        r1 = r12;
        r2 = r13;
        r3 = r16;
        r5 = r17;
        r0 = "configurationRepository";
        r4 = r11;
        defpackage.akcr.b(r11, r0);
        r0 = "sponsoredLensesEnabled";
        defpackage.akcr.b(r12, r0);
        r0 = "snappablesEnabled";
        defpackage.akcr.b(r13, r0);
        r0 = "geofilterToLensMapper";
        defpackage.akcr.b(r3, r0);
        r0 = "attributedFeature";
        defpackage.akcr.b(r5, r0);
        r0 = "schedulersProvider";
        r6 = r18;
        defpackage.akcr.b(r6, r0);
        if (r10 == 0) goto L_0x0146;
    L_0x0029:
        r0 = r11.a(defpackage.miw.b.a.a);	 Catch:{ all -> 0x0144 }
        r4 = defpackage.mja.LENS_GEO_ENABLED;	 Catch:{ all -> 0x0144 }
        r4 = (defpackage.mje) r4;	 Catch:{ all -> 0x0144 }
        r6 = java.lang.Boolean.class;
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 != 0) goto L_0x00d0;
    L_0x003b:
        r7 = java.lang.Boolean.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 == 0) goto L_0x0045;
    L_0x0043:
        goto L_0x00d0;
    L_0x0045:
        r7 = java.lang.Integer.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 != 0) goto L_0x00cb;
    L_0x004d:
        r7 = java.lang.Integer.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x00cb;
    L_0x0056:
        r7 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 != 0) goto L_0x00c6;
    L_0x005e:
        r7 = java.lang.Long.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 == 0) goto L_0x0067;
    L_0x0066:
        goto L_0x00c6;
    L_0x0067:
        r7 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 != 0) goto L_0x00c1;
    L_0x006f:
        r7 = java.lang.Float.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 == 0) goto L_0x0078;
    L_0x0077:
        goto L_0x00c1;
    L_0x0078:
        r7 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 != 0) goto L_0x00bc;
    L_0x0080:
        r7 = java.lang.Double.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 == 0) goto L_0x0089;
    L_0x0088:
        goto L_0x00bc;
    L_0x0089:
        r7 = java.lang.String.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r7 != 0) goto L_0x00b7;
    L_0x0091:
        r7 = java.lang.String.class;
        r6 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00eb }
        if (r6 == 0) goto L_0x009a;
    L_0x0099:
        goto L_0x00b7;
    L_0x009a:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00eb }
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00eb }
        r7 = "Unsupported input type: [";
        r6.<init>(r7);	 Catch:{ Throwable -> 0x00eb }
        r7 = java.lang.Boolean.class;
        r6.append(r7);	 Catch:{ Throwable -> 0x00eb }
        r7 = 93;
        r6.append(r7);	 Catch:{ Throwable -> 0x00eb }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x00eb }
        r0.<init>(r6);	 Catch:{ Throwable -> 0x00eb }
        r0 = (java.lang.Throwable) r0;	 Catch:{ Throwable -> 0x00eb }
        throw r0;	 Catch:{ Throwable -> 0x00eb }
    L_0x00b7:
        r0 = r0.f(r4);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00bc:
        r0 = r0.c(r4);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00c1:
        r0 = r0.b(r4);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00c6:
        r0 = r0.e(r4);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00cb:
        r0 = r0.d(r4);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00d0:
        r0 = r0.a(r4);	 Catch:{ Throwable -> 0x00eb }
    L_0x00d4:
        r6 = java.lang.Boolean.class;
        r0 = r0.a(r6);	 Catch:{ Throwable -> 0x00eb }
        r6 = "cast(R::class.java)";
        defpackage.akcr.a(r0, r6);	 Catch:{ Throwable -> 0x00eb }
        r0 = r0.b();	 Catch:{ Throwable -> 0x00eb }
        r6 = "observe<T>(key).blockingFirst()";
        defpackage.akcr.a(r0, r6);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x010c;
    L_0x00e9:
        r0 = move-exception;
        goto L_0x0143;
    L_0x00eb:
        r0 = move-exception;
        r6 = com.google.common.base.Throwables.getRootCause(r0);	 Catch:{ all -> 0x00e9 }
        r6 = r6 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00e9 }
        if (r6 == 0) goto L_0x0142;
    L_0x00f4:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00e9 }
        r0.interrupt();	 Catch:{ all -> 0x00e9 }
        r0 = r4.a();	 Catch:{ all -> 0x00e9 }
        r4 = "key.delegate";
        defpackage.akcr.a(r0, r4);	 Catch:{ all -> 0x00e9 }
        r0 = r0.b();	 Catch:{ all -> 0x00e9 }
        if (r0 == 0) goto L_0x013a;
    L_0x010a:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x00e9 }
    L_0x010c:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0144 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0144 }
        if (r0 == 0) goto L_0x0146;
    L_0x0114:
        r0 = new lfp;	 Catch:{ all -> 0x0144 }
        r4 = new lhf;	 Catch:{ all -> 0x0144 }
        r6 = defpackage.muu.GEO;	 Catch:{ all -> 0x0144 }
        r4.<init>(r12, r13, r3, r6);	 Catch:{ all -> 0x0144 }
        r3 = r4;
        r3 = (defpackage.ajdu) r3;	 Catch:{ all -> 0x0144 }
        r1 = defpackage.lfp.a.a.a;	 Catch:{ all -> 0x0144 }
        r4 = r1;
        r4 = (defpackage.lfp.a) r4;	 Catch:{ all -> 0x0144 }
        r1 = "geoLensRepository";
        r1 = r5.callsite(r1);	 Catch:{ all -> 0x0144 }
        r6 = defpackage.zgb.a(r1);	 Catch:{ all -> 0x0144 }
        r9 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0144 }
        r1 = r0;
        r2 = r10;
        r5 = r17;
        r7 = r14;
        r1.<init>(r2, r3, r4, r5, r6, r7, r9);	 Catch:{ all -> 0x0144 }
        goto L_0x0147;
    L_0x013a:
        r0 = new ajxt;	 Catch:{ all -> 0x00e9 }
        r1 = "null cannot be cast to non-null type kotlin.Boolean";
        r0.<init>(r1);	 Catch:{ all -> 0x00e9 }
        throw r0;	 Catch:{ all -> 0x00e9 }
    L_0x0142:
        throw r0;	 Catch:{ all -> 0x00e9 }
    L_0x0143:
        throw r0;	 Catch:{ all -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r0 = 0;
    L_0x0147:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfv.a(zpo, miw, ajdp, ajdp, long, lfq, ide, zgb):lfp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    public static final defpackage.lfp a(defpackage.zpo r10, defpackage.miw r11, defpackage.ajdp<java.lang.Boolean> r12, defpackage.ajdp<java.lang.Boolean> r13, defpackage.lfq r14, long r15, defpackage.zgb r17, defpackage.ide r18) {
        /*
        r1 = r12;
        r2 = r13;
        r3 = r14;
        r5 = r18;
        r0 = "configurationRepository";
        r4 = r11;
        defpackage.akcr.b(r11, r0);
        r0 = "sponsoredLensesEnabled";
        defpackage.akcr.b(r12, r0);
        r0 = "snappablesEnabled";
        defpackage.akcr.b(r13, r0);
        r0 = "geofilterToLensMapper";
        defpackage.akcr.b(r14, r0);
        r0 = "schedulersProvider";
        r6 = r17;
        defpackage.akcr.b(r6, r0);
        r0 = "attributedFeature";
        defpackage.akcr.b(r5, r0);
        if (r10 == 0) goto L_0x0145;
    L_0x0028:
        r0 = r11.a(defpackage.miw.b.a.a);	 Catch:{ all -> 0x0143 }
        r4 = defpackage.mja.LENS_GEO_ENABLED;	 Catch:{ all -> 0x0143 }
        r4 = (defpackage.mje) r4;	 Catch:{ all -> 0x0143 }
        r6 = java.lang.Boolean.class;
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 != 0) goto L_0x00cf;
    L_0x003a:
        r7 = java.lang.Boolean.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 == 0) goto L_0x0044;
    L_0x0042:
        goto L_0x00cf;
    L_0x0044:
        r7 = java.lang.Integer.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 != 0) goto L_0x00ca;
    L_0x004c:
        r7 = java.lang.Integer.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x00ca;
    L_0x0055:
        r7 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 != 0) goto L_0x00c5;
    L_0x005d:
        r7 = java.lang.Long.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x00c5;
    L_0x0066:
        r7 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 != 0) goto L_0x00c0;
    L_0x006e:
        r7 = java.lang.Float.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 == 0) goto L_0x0077;
    L_0x0076:
        goto L_0x00c0;
    L_0x0077:
        r7 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 != 0) goto L_0x00bb;
    L_0x007f:
        r7 = java.lang.Double.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 == 0) goto L_0x0088;
    L_0x0087:
        goto L_0x00bb;
    L_0x0088:
        r7 = java.lang.String.class;
        r7 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r7 != 0) goto L_0x00b6;
    L_0x0090:
        r7 = java.lang.String.class;
        r6 = defpackage.akcr.a(r6, r7);	 Catch:{ Throwable -> 0x00ea }
        if (r6 == 0) goto L_0x0099;
    L_0x0098:
        goto L_0x00b6;
    L_0x0099:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00ea }
        r6 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00ea }
        r7 = "Unsupported input type: [";
        r6.<init>(r7);	 Catch:{ Throwable -> 0x00ea }
        r7 = java.lang.Boolean.class;
        r6.append(r7);	 Catch:{ Throwable -> 0x00ea }
        r7 = 93;
        r6.append(r7);	 Catch:{ Throwable -> 0x00ea }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x00ea }
        r0.<init>(r6);	 Catch:{ Throwable -> 0x00ea }
        r0 = (java.lang.Throwable) r0;	 Catch:{ Throwable -> 0x00ea }
        throw r0;	 Catch:{ Throwable -> 0x00ea }
    L_0x00b6:
        r0 = r0.f(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00bb:
        r0 = r0.c(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00c0:
        r0 = r0.b(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00c5:
        r0 = r0.e(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00ca:
        r0 = r0.d(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00cf:
        r0 = r0.a(r4);	 Catch:{ Throwable -> 0x00ea }
    L_0x00d3:
        r6 = java.lang.Boolean.class;
        r0 = r0.a(r6);	 Catch:{ Throwable -> 0x00ea }
        r6 = "cast(R::class.java)";
        defpackage.akcr.a(r0, r6);	 Catch:{ Throwable -> 0x00ea }
        r0 = r0.b();	 Catch:{ Throwable -> 0x00ea }
        r6 = "observe<T>(key).blockingFirst()";
        defpackage.akcr.a(r0, r6);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x010b;
    L_0x00e8:
        r0 = move-exception;
        goto L_0x0142;
    L_0x00ea:
        r0 = move-exception;
        r6 = com.google.common.base.Throwables.getRootCause(r0);	 Catch:{ all -> 0x00e8 }
        r6 = r6 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00e8 }
        if (r6 == 0) goto L_0x0141;
    L_0x00f3:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00e8 }
        r0.interrupt();	 Catch:{ all -> 0x00e8 }
        r0 = r4.a();	 Catch:{ all -> 0x00e8 }
        r4 = "key.delegate";
        defpackage.akcr.a(r0, r4);	 Catch:{ all -> 0x00e8 }
        r0 = r0.b();	 Catch:{ all -> 0x00e8 }
        if (r0 == 0) goto L_0x0139;
    L_0x0109:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x00e8 }
    L_0x010b:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0143 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0143 }
        if (r0 == 0) goto L_0x0145;
    L_0x0113:
        r0 = new lfp;	 Catch:{ all -> 0x0143 }
        r4 = new lhf;	 Catch:{ all -> 0x0143 }
        r6 = defpackage.muu.GEO;	 Catch:{ all -> 0x0143 }
        r4.<init>(r12, r13, r14, r6);	 Catch:{ all -> 0x0143 }
        r3 = r4;
        r3 = (defpackage.ajdu) r3;	 Catch:{ all -> 0x0143 }
        r1 = defpackage.lfp.a.b.a;	 Catch:{ all -> 0x0143 }
        r4 = r1;
        r4 = (defpackage.lfp.a) r4;	 Catch:{ all -> 0x0143 }
        r1 = "prefetchedGeoLensRepository";
        r1 = r5.callsite(r1);	 Catch:{ all -> 0x0143 }
        r6 = defpackage.zgb.a(r1);	 Catch:{ all -> 0x0143 }
        r9 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0143 }
        r1 = r0;
        r2 = r10;
        r5 = r18;
        r7 = r15;
        r1.<init>(r2, r3, r4, r5, r6, r7, r9);	 Catch:{ all -> 0x0143 }
        goto L_0x0146;
    L_0x0139:
        r0 = new ajxt;	 Catch:{ all -> 0x00e8 }
        r1 = "null cannot be cast to non-null type kotlin.Boolean";
        r0.<init>(r1);	 Catch:{ all -> 0x00e8 }
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x0141:
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x0142:
        throw r0;	 Catch:{ all -> 0x0143 }
    L_0x0143:
        r0 = move-exception;
        throw r0;
    L_0x0145:
        r0 = 0;
    L_0x0146:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfv.a(zpo, miw, ajdp, ajdp, lfq, long, zgb, ide):lfp");
    }

    public static final lfq a(gqr gqr, Context context, Supplier<abss> supplier, zgb zgb, ide ide) {
        akcr.b(gqr, "exceptionTracker");
        akcr.b(context, "context");
        akcr.b(supplier, "releaseManagerSupplier");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        return new lfj(ide, gqr, new c(zgb.a(ide, "GeofilterToLensMapper").l(), context), new b(supplier));
    }

    public static final lfs a(ajwy<SocialUnlockHttpInterface> ajwy, lfq lfq, zgb zgb, ide ide) {
        akcr.b(ajwy, "socialUnlockHttpInterfaceProvider");
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        return new lfl(ajwy, lfq, zgb.a(ide, "DefaultLensSocialUnlocker"));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:62:0x0120 in {6, 11, 16, 21, 26, 31, 33, 34, 35, 36, 37, 38, 39, 41, 50, 53, 55, 56, 59, 60, 61} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static final defpackage.lgx.c a(defpackage.aipn<com.snap.lenses.app.data.LensesHttpInterface> r3, defpackage.miw r4) {
        /*
        r0 = "lensesHttpInterface";
        defpackage.akcr.b(r3, r0);
        r0 = "configurationRepository";
        defpackage.akcr.b(r4, r0);
        r0 = new lfv$l;
        r0.<init>(r3);
        r0 = (com.google.common.base.Supplier) r0;
        r3 = com.google.common.base.Suppliers.memoize(r0);
        r4 = r4.a(defpackage.miw.b.a.a);
        r0 = defpackage.mja.LENS_SCHEDULED_PROTO_FETCH_ENABLED;
        r0 = (defpackage.mje) r0;
        r1 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 != 0) goto L_0x00bc;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 == 0) goto L_0x0031;	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00bc;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Integer.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 != 0) goto L_0x00b7;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Integer.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 == 0) goto L_0x0042;	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00b7;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 != 0) goto L_0x00b2;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Long.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 == 0) goto L_0x0053;	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00b2;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 != 0) goto L_0x00ad;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Float.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 == 0) goto L_0x0064;	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00ad;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 != 0) goto L_0x00a8;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Double.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 == 0) goto L_0x0075;	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00a8;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.String.class;	 Catch:{ Throwable -> 0x00d7 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r2 != 0) goto L_0x00a3;	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.String.class;	 Catch:{ Throwable -> 0x00d7 }
        r1 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00d7 }
        if (r1 == 0) goto L_0x0086;	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00a3;	 Catch:{ Throwable -> 0x00d7 }
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00d7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00d7 }
        r2 = "Unsupported input type: [";	 Catch:{ Throwable -> 0x00d7 }
        r1.<init>(r2);	 Catch:{ Throwable -> 0x00d7 }
        r2 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00d7 }
        r1.append(r2);	 Catch:{ Throwable -> 0x00d7 }
        r2 = 93;	 Catch:{ Throwable -> 0x00d7 }
        r1.append(r2);	 Catch:{ Throwable -> 0x00d7 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x00d7 }
        r4.<init>(r1);	 Catch:{ Throwable -> 0x00d7 }
        r4 = (java.lang.Throwable) r4;	 Catch:{ Throwable -> 0x00d7 }
        throw r4;	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.f(r0);	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00c0;	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.c(r0);	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00c0;	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.b(r0);	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00c0;	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.e(r0);	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00c0;	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.d(r0);	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00c0;	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.a(r0);	 Catch:{ Throwable -> 0x00d7 }
        r1 = java.lang.Boolean.class;	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.a(r1);	 Catch:{ Throwable -> 0x00d7 }
        r1 = "cast(R::class.java)";	 Catch:{ Throwable -> 0x00d7 }
        defpackage.akcr.a(r4, r1);	 Catch:{ Throwable -> 0x00d7 }
        r4 = r4.b();	 Catch:{ Throwable -> 0x00d7 }
        r1 = "observe<T>(key).blockingFirst()";	 Catch:{ Throwable -> 0x00d7 }
        defpackage.akcr.a(r4, r1);	 Catch:{ Throwable -> 0x00d7 }
        goto L_0x00f8;
        r3 = move-exception;
        goto L_0x011f;
        r4 = move-exception;
        r1 = com.google.common.base.Throwables.getRootCause(r4);	 Catch:{ all -> 0x00d5 }
        r1 = r1 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00d5 }
        if (r1 == 0) goto L_0x011e;	 Catch:{ all -> 0x00d5 }
        r4 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00d5 }
        r4.interrupt();	 Catch:{ all -> 0x00d5 }
        r4 = r0.a();	 Catch:{ all -> 0x00d5 }
        r0 = "key.delegate";	 Catch:{ all -> 0x00d5 }
        defpackage.akcr.a(r4, r0);	 Catch:{ all -> 0x00d5 }
        r4 = r4.b();	 Catch:{ all -> 0x00d5 }
        if (r4 == 0) goto L_0x0116;	 Catch:{ all -> 0x00d5 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x00d5 }
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        r0 = "httpInterfaceSupplier";
        if (r4 == 0) goto L_0x010d;
        r4 = new lgx$c$b;
        defpackage.akcr.a(r3, r0);
        r4.<init>(r3);
        r4 = (defpackage.lgx.c) r4;
        return r4;
        r4 = new lgx$c$a;
        defpackage.akcr.a(r3, r0);
        r4.<init>(r3);
        goto L_0x010a;
        r3 = new ajxt;	 Catch:{ all -> 0x00d5 }
        r4 = "null cannot be cast to non-null type kotlin.Boolean";	 Catch:{ all -> 0x00d5 }
        r3.<init>(r4);	 Catch:{ all -> 0x00d5 }
        throw r3;	 Catch:{ all -> 0x00d5 }
        throw r4;	 Catch:{ all -> 0x00d5 }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfv.a(aipn, miw):lgx$c");
    }

    public static final lgx a(lgx.c cVar, TimeZone timeZone, mhk mhk, ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, long j, ajdi<aeqv, aeqv> ajdi, lfq lfq, ide ide, zgb zgb) {
        ide ide2 = ide;
        lgx.c cVar2 = cVar;
        akcr.b(cVar, "lensesFetcher");
        akcr.b(timeZone, "timeZone");
        akcr.b(mhk, "clock");
        akcr.b(ajdp, "sponsoredLensesEnabled");
        akcr.b(ajdp2, "snappableLensesEnabled");
        akcr.b(ajdi, "cacheTransformer");
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(ide2, "attributedFeature");
        akcr.b(zgb, "schedulersProvider");
        return new lgx(cVar, timeZone, mhk, zgb.a(ide2.callsite("MainScheduledLensRepository")), ajdi, ajdp, ajdp2, lfq, lgx.b.a.a, j, TimeUnit.SECONDS);
    }

    public static final miw a(ajwy<lbp> ajwy) {
        akcr.b(ajwy, "lensesConfigurationComponent");
        return ((lbp) ajwy.get()).e();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0152 in {5, 8, 9, 12, 14, 16, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static final defpackage.mvc a(android.content.Context r19, com.google.gson.Gson r20, defpackage.mxa r21, defpackage.mwp r22, defpackage.ldu r23, defpackage.lff r24, defpackage.kqf r25, java.util.Set<? extends defpackage.mwe> r26, defpackage.lgx r27, defpackage.lfp r28, defpackage.lhg r29, defpackage.mzn r30, defpackage.ide r31, defpackage.zgb r32, defpackage.miw r33, com.google.common.base.Supplier<defpackage.iha> r34) {
        /*
        r0 = r20;
        r15 = r21;
        r14 = r22;
        r13 = r24;
        r12 = r26;
        r11 = r27;
        r1 = "context";
        r4 = r19;
        defpackage.akcr.b(r4, r1);
        r1 = "gson";
        defpackage.akcr.b(r0, r1);
        r1 = "remoteServiceFactory";
        defpackage.akcr.b(r15, r1);
        r1 = "signatureValidator";
        defpackage.akcr.b(r14, r1);
        r1 = "contentManagerComponent";
        r10 = r23;
        defpackage.akcr.b(r10, r1);
        r1 = "additionalLensRepositories";
        defpackage.akcr.b(r12, r1);
        r1 = "scheduledLensRepository";
        defpackage.akcr.b(r11, r1);
        r1 = "attributedFeature";
        r2 = r31;
        defpackage.akcr.b(r2, r1);
        r1 = "schedulersProvider";
        r3 = r32;
        defpackage.akcr.b(r3, r1);
        r1 = "configurationRepository";
        r6 = r33;
        defpackage.akcr.b(r6, r1);
        r1 = "serializationHelperSupplier";
        r7 = r34;
        defpackage.akcr.b(r7, r1);
        r18 = new lfv$d;	 Catch:{ all -> 0x0150 }
        r1 = r18;	 Catch:{ all -> 0x0150 }
        r2 = r31;	 Catch:{ all -> 0x0150 }
        r3 = r32;	 Catch:{ all -> 0x0150 }
        r4 = r19;	 Catch:{ all -> 0x0150 }
        r5 = r25;	 Catch:{ all -> 0x0150 }
        r6 = r33;	 Catch:{ all -> 0x0150 }
        r7 = r34;	 Catch:{ all -> 0x0150 }
        r8 = r21;	 Catch:{ all -> 0x0150 }
        r9 = r30;	 Catch:{ all -> 0x0150 }
        r10 = r23;	 Catch:{ all -> 0x0150 }
        r11 = r26;	 Catch:{ all -> 0x0150 }
        r12 = r24;	 Catch:{ all -> 0x0150 }
        r0 = r13;	 Catch:{ all -> 0x0150 }
        r13 = r29;	 Catch:{ all -> 0x0150 }
        r14 = r28;	 Catch:{ all -> 0x0150 }
        r0 = r15;	 Catch:{ all -> 0x0150 }
        r15 = r27;	 Catch:{ all -> 0x0150 }
        r16 = r20;	 Catch:{ all -> 0x0150 }
        r17 = r22;	 Catch:{ all -> 0x0150 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x0150 }
        r1 = new akdd$e;	 Catch:{ all -> 0x0150 }
        r1.<init>();	 Catch:{ all -> 0x0150 }
        r2 = r18;	 Catch:{ all -> 0x0150 }
        r2 = (defpackage.mvc.d) r2;	 Catch:{ all -> 0x0150 }
        r3 = "parentComponent";	 Catch:{ all -> 0x0150 }
        defpackage.akcr.b(r2, r3);	 Catch:{ all -> 0x0150 }
        r3 = defpackage.mug.a();	 Catch:{ all -> 0x0150 }
        r2 = r3.a(r2);	 Catch:{ all -> 0x0150 }
        r3 = 1;	 Catch:{ all -> 0x0150 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0150 }
        r3 = defpackage.mok.a.a;	 Catch:{ all -> 0x0150 }
        r3 = (defpackage.mok) r3;	 Catch:{ all -> 0x0150 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0150 }
        r3 = defpackage.mof.a.a;	 Catch:{ all -> 0x0150 }
        r3 = (defpackage.mof) r3;	 Catch:{ all -> 0x0150 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0150 }
        r3 = defpackage.mwq.a;	 Catch:{ all -> 0x0150 }
        r3 = (defpackage.mwp) r3;	 Catch:{ all -> 0x0150 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0150 }
        r2 = r2.b();	 Catch:{ all -> 0x0150 }
        r0 = r2.a(r0);	 Catch:{ all -> 0x0150 }
        r1.a = r0;	 Catch:{ all -> 0x0150 }
        r0 = r26;	 Catch:{ all -> 0x0150 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0150 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0150 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0150 }
        if (r2 == 0) goto L_0x00d1;	 Catch:{ all -> 0x0150 }
        r2 = r0.next();	 Catch:{ all -> 0x0150 }
        r2 = (defpackage.mwe) r2;	 Catch:{ all -> 0x0150 }
        r3 = r1.a;	 Catch:{ all -> 0x0150 }
        r3 = (defpackage.mvc.a) r3;	 Catch:{ all -> 0x0150 }
        r3.a(r2);	 Catch:{ all -> 0x0150 }
        goto L_0x00bd;	 Catch:{ all -> 0x0150 }
        r0 = r24;	 Catch:{ all -> 0x0150 }
        if (r0 == 0) goto L_0x00e7;	 Catch:{ all -> 0x0150 }
        r2 = r1.a;	 Catch:{ all -> 0x0150 }
        r2 = (defpackage.mvc.a) r2;	 Catch:{ all -> 0x0150 }
        r3 = r0.a;	 Catch:{ all -> 0x0150 }
        r0 = r0.b;	 Catch:{ all -> 0x0150 }
        r0 = r2.a(r3, r0);	 Catch:{ all -> 0x0150 }
        r2 = 0;	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0150 }
        goto L_0x00f3;	 Catch:{ all -> 0x0150 }
        r0 = r1.a;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.mvc.a) r0;	 Catch:{ all -> 0x0150 }
        r2 = "looksery/lenses_list.json";	 Catch:{ all -> 0x0150 }
        r3 = "looksery/lenses/content";	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r2, r3);	 Catch:{ all -> 0x0150 }
        r1.a = r0;	 Catch:{ all -> 0x0150 }
        if (r29 == 0) goto L_0x0102;	 Catch:{ all -> 0x0150 }
        r0 = r1.a;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.mvc.a) r0;	 Catch:{ all -> 0x0150 }
        r2 = r29;	 Catch:{ all -> 0x0150 }
        r2 = (defpackage.mwe) r2;	 Catch:{ all -> 0x0150 }
        r0.a(r2);	 Catch:{ all -> 0x0150 }
        if (r28 == 0) goto L_0x010f;	 Catch:{ all -> 0x0150 }
        r0 = r1.a;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.mvc.a) r0;	 Catch:{ all -> 0x0150 }
        r2 = r28;	 Catch:{ all -> 0x0150 }
        r2 = (defpackage.mwe) r2;	 Catch:{ all -> 0x0150 }
        r0.a(r2);	 Catch:{ all -> 0x0150 }
        r0 = r1.a;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.mvc.a) r0;	 Catch:{ all -> 0x0150 }
        r2 = r27;	 Catch:{ all -> 0x0150 }
        r2 = (defpackage.mwe) r2;	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0150 }
        r1.a = r0;	 Catch:{ all -> 0x0150 }
        r0 = r1.a;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.mvc.a) r0;	 Catch:{ all -> 0x0150 }
        r2 = r20;	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0150 }
        r2 = r22;	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0150 }
        r2 = r23.c();	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0150 }
        r2 = r23.b();	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0150 }
        r1.a = r0;	 Catch:{ all -> 0x0150 }
        r0 = r1.a;	 Catch:{ all -> 0x0150 }
        r0 = (defpackage.mvc.a) r0;	 Catch:{ all -> 0x0150 }
        r1 = r0.j;	 Catch:{ all -> 0x0150 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0150 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0150 }
        r0 = r0.a();	 Catch:{ all -> 0x0150 }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfv.a(android.content.Context, com.google.gson.Gson, mxa, mwp, ldu, lff, kqf, java.util.Set, lgx, lfp, lhg, mzn, ide, zgb, miw, com.google.common.base.Supplier):mvc");
    }

    public static final mwe a(ajwy<mvc> ajwy, ide ide, zgb zgb) {
        akcr.b(ajwy, "lensComponent");
        akcr.b(ide, "attributedFeature");
        akcr.b(zgb, "schedulersProvider");
        return mwd.a(zgb.a(ide.callsite("LensRepositories.lazyInitialized")), (akbk) new f(ajwy));
    }

    public static final mwe a(ajwy<SocialUnlockHttpInterface> ajwy, lfq lfq, zgb zgb, ide ide, ajwy<mvc> ajwy2, mwe mwe, kxt kxt) {
        akcr.b(ajwy, "socialUnlockHttpInterfaceProvider");
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        akcr.b(ajwy2, "lensComponent");
        akcr.b(mwe, "mainLensRepository");
        akcr.b(kxt, "cache");
        zfw a = zgb.a(ide, "SocialUnlockedLensRepository");
        return mwd.a(a, (akbk) new m(ajwy, lfq, a, kxt, ajwy2, mwe));
    }

    public static final mwe a(ckx ckx, lfq lfq, ajwy<mvc> ajwy, ide ide, zgb zgb) {
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(ajwy, "lensComponent");
        akcr.b(ide, "attributedFeature");
        akcr.b(zgb, "schedulersProvider");
        if (ckx == null) {
            return mwd.a();
        }
        zfw a = zgb.a(ide, "SwipeToLensRepository");
        return mwd.a(a, (akbk) new n(new lhd(ckx, lfq, a), zgb, ide, ckx, lfq, ajwy));
    }

    public static final mwe a(lgx lgx, lgx lgx2, lfp lfp, lfp lfp2, lhg lhg, zgb zgb, ide ide) {
        lgx lgx3 = lgx;
        lgx lgx4 = lgx2;
        lfp lfp3 = lfp;
        lfp lfp4 = lfp2;
        lhg lhg2 = lhg;
        ide ide2 = ide;
        akcr.b(lgx, "mainScheduledRepository");
        akcr.b(lgx2, "prefetchScheduledRepository");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide2, "attributedFeature");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (lhg2 != null) {
            linkedHashSet.add(lhg2);
        }
        if (lfp4 != null) {
            linkedHashSet.add(lfp2);
        }
        linkedHashSet.add(lgx);
        if (lfp3 != null) {
            linkedHashSet.add(lfp);
        }
        linkedHashSet.add(lgx2);
        return mwd.a(zgb.a(ide2.callsite("LensRepositories.lazyInitialized#prefetchRepository")), (akbk) new i(linkedHashSet, lhg, lfp2, lgx, lfp, lgx2, zgb, ide));
    }

    public static final mxp a(gnk gnk, ldu ldu, Supplier<gfu> supplier, zgb zgb, ide ide) {
        akcr.b(gnk, "prefetchScheduler");
        akcr.b(ldu, "contentManagerComponent");
        akcr.b(supplier, "snapContentResolver");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        return new lfo(gnk, zgb.a(ide.callsite("ForegroundLensPrefetchHandler")), new e(gnk, zgb, ide, ldu, supplier));
    }

    public static final mxs.a a(mxp mxp, ajwy<mwe> ajwy, zgb zgb) {
        akcr.b(mxp, "prefetchHandler");
        akcr.b(ajwy, "lensRepository");
        akcr.b(zgb, "schedulersProvider");
        c gVar = new g(zgb, ajwy, mxp);
        akcr.b(gVar, "parentComponent");
        return mxo.c().a(gVar).a((nay) nay.a.a).a((lop) lop.a.a).a(mwf.a(new h(zgb, ajwy, mxp))).a(mxp);
    }

    public static final ajdp<Boolean> b(miw miw) {
        akcr.b(miw, "configurationRepository");
        Object c = miw.a(b.a.a).a(mja.SNAPPABLE_LENSES_ENABLED).c(1).c();
        akcr.a(c, "configurationRepository\n…                 .cache()");
        return c;
    }

    public static final Gson b() {
        Object create = new GsonBuilder().create();
        akcr.a(create, "GsonBuilder().create()");
        return create;
    }

    public static final SocialUnlockHttpInterface b(mxa mxa) {
        akcr.b(mxa, "remoteServiceFactory");
        return (SocialUnlockHttpInterface) mxa.a(SocialUnlockHttpInterface.class);
    }

    public static final lgx b(lgx.c cVar, TimeZone timeZone, mhk mhk, ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, long j, ajdi<aeqv, aeqv> ajdi, lfq lfq, ide ide, zgb zgb) {
        ide ide2 = ide;
        lgx.c cVar2 = cVar;
        akcr.b(cVar, "lensesFetcher");
        akcr.b(timeZone, "timeZone");
        akcr.b(mhk, "clock");
        akcr.b(ajdp, "sponsoredLensesEnabled");
        akcr.b(ajdp2, "snappableLensesEnabled");
        akcr.b(ajdi, "cacheTransformer");
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(ide2, "attributedFeature");
        akcr.b(zgb, "schedulersProvider");
        return new lgx(cVar, timeZone, mhk, zgb.a(ide2.callsite("PrefetchScheduledLensRepository")), ajdi, ajdp, ajdp2, lfq, lgx.b.b.a, j, TimeUnit.SECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A:{Catch:{ Throwable -> 0x00ea }} */
    public static final defpackage.lhg b(defpackage.zpo r9, defpackage.miw r10, defpackage.ajdp<java.lang.Boolean> r11, defpackage.ajdp<java.lang.Boolean> r12, long r13, defpackage.lfq r15, defpackage.ide r16, defpackage.zgb r17) {
        /*
        r1 = r11;
        r2 = r12;
        r3 = r15;
        r8 = r16;
        r0 = "configurationRepository";
        r4 = r10;
        defpackage.akcr.b(r10, r0);
        r0 = "sponsoredLensesEnabled";
        defpackage.akcr.b(r11, r0);
        r0 = "snappablesEnabled";
        defpackage.akcr.b(r12, r0);
        r0 = "geofilterToLensMapper";
        defpackage.akcr.b(r15, r0);
        r0 = "attributedFeature";
        defpackage.akcr.b(r8, r0);
        r0 = "schedulersProvider";
        r5 = r17;
        defpackage.akcr.b(r5, r0);
        if (r9 == 0) goto L_0x0140;
    L_0x0028:
        r0 = r10.a(defpackage.miw.b.a.a);	 Catch:{ all -> 0x013e }
        r4 = defpackage.mja.LENS_UNLOCKED_ENABLED;	 Catch:{ all -> 0x013e }
        r4 = (defpackage.mje) r4;	 Catch:{ all -> 0x013e }
        r5 = java.lang.Boolean.class;
        r6 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 != 0) goto L_0x00cf;
    L_0x003a:
        r6 = java.lang.Boolean.class;
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 == 0) goto L_0x0044;
    L_0x0042:
        goto L_0x00cf;
    L_0x0044:
        r6 = java.lang.Integer.class;
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 != 0) goto L_0x00ca;
    L_0x004c:
        r6 = java.lang.Integer.class;
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x00ca;
    L_0x0055:
        r6 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 != 0) goto L_0x00c5;
    L_0x005d:
        r6 = java.lang.Long.class;
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x00c5;
    L_0x0066:
        r6 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 != 0) goto L_0x00c0;
    L_0x006e:
        r6 = java.lang.Float.class;
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 == 0) goto L_0x0077;
    L_0x0076:
        goto L_0x00c0;
    L_0x0077:
        r6 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00ea }
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 != 0) goto L_0x00bb;
    L_0x007f:
        r6 = java.lang.Double.class;
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 == 0) goto L_0x0088;
    L_0x0087:
        goto L_0x00bb;
    L_0x0088:
        r6 = java.lang.String.class;
        r6 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r6 != 0) goto L_0x00b6;
    L_0x0090:
        r6 = java.lang.String.class;
        r5 = defpackage.akcr.a(r5, r6);	 Catch:{ Throwable -> 0x00ea }
        if (r5 == 0) goto L_0x0099;
    L_0x0098:
        goto L_0x00b6;
    L_0x0099:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00ea }
        r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00ea }
        r6 = "Unsupported input type: [";
        r5.<init>(r6);	 Catch:{ Throwable -> 0x00ea }
        r6 = java.lang.Boolean.class;
        r5.append(r6);	 Catch:{ Throwable -> 0x00ea }
        r6 = 93;
        r5.append(r6);	 Catch:{ Throwable -> 0x00ea }
        r5 = r5.toString();	 Catch:{ Throwable -> 0x00ea }
        r0.<init>(r5);	 Catch:{ Throwable -> 0x00ea }
        r0 = (java.lang.Throwable) r0;	 Catch:{ Throwable -> 0x00ea }
        throw r0;	 Catch:{ Throwable -> 0x00ea }
    L_0x00b6:
        r0 = r0.f(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00bb:
        r0 = r0.c(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00c0:
        r0 = r0.b(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00c5:
        r0 = r0.e(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00ca:
        r0 = r0.d(r4);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x00d3;
    L_0x00cf:
        r0 = r0.a(r4);	 Catch:{ Throwable -> 0x00ea }
    L_0x00d3:
        r5 = java.lang.Boolean.class;
        r0 = r0.a(r5);	 Catch:{ Throwable -> 0x00ea }
        r5 = "cast(R::class.java)";
        defpackage.akcr.a(r0, r5);	 Catch:{ Throwable -> 0x00ea }
        r0 = r0.b();	 Catch:{ Throwable -> 0x00ea }
        r5 = "observe<T>(key).blockingFirst()";
        defpackage.akcr.a(r0, r5);	 Catch:{ Throwable -> 0x00ea }
        goto L_0x010b;
    L_0x00e8:
        r0 = move-exception;
        goto L_0x013d;
    L_0x00ea:
        r0 = move-exception;
        r5 = com.google.common.base.Throwables.getRootCause(r0);	 Catch:{ all -> 0x00e8 }
        r5 = r5 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00e8 }
        if (r5 == 0) goto L_0x013c;
    L_0x00f3:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00e8 }
        r0.interrupt();	 Catch:{ all -> 0x00e8 }
        r0 = r4.a();	 Catch:{ all -> 0x00e8 }
        r4 = "key.delegate";
        defpackage.akcr.a(r0, r4);	 Catch:{ all -> 0x00e8 }
        r0 = r0.b();	 Catch:{ all -> 0x00e8 }
        if (r0 == 0) goto L_0x0134;
    L_0x0109:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x00e8 }
    L_0x010b:
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x013e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x013e }
        if (r0 == 0) goto L_0x0140;
    L_0x0113:
        r0 = new lhg;	 Catch:{ all -> 0x013e }
        r4 = new lhf;	 Catch:{ all -> 0x013e }
        r5 = defpackage.muu.UNLOCKED;	 Catch:{ all -> 0x013e }
        r4.<init>(r11, r12, r15, r5);	 Catch:{ all -> 0x013e }
        r3 = r4;
        r3 = (defpackage.ajdu) r3;	 Catch:{ all -> 0x013e }
        r1 = "UnlockedLensRepository";
        r1 = r8.callsite(r1);	 Catch:{ all -> 0x013e }
        r4 = defpackage.zgb.a(r1);	 Catch:{ all -> 0x013e }
        r7 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x013e }
        r1 = r0;
        r2 = r9;
        r5 = r13;
        r8 = r16;
        r1.<init>(r2, r3, r4, r5, r7, r8);	 Catch:{ all -> 0x013e }
        goto L_0x0141;
    L_0x0134:
        r0 = new ajxt;	 Catch:{ all -> 0x00e8 }
        r1 = "null cannot be cast to non-null type kotlin.Boolean";
        r0.<init>(r1);	 Catch:{ all -> 0x00e8 }
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x013c:
        throw r0;	 Catch:{ all -> 0x00e8 }
    L_0x013d:
        throw r0;	 Catch:{ all -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = 0;
    L_0x0141:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfv.b(zpo, miw, ajdp, ajdp, long, lfq, ide, zgb):lhg");
    }

    public static final mwa b(ajwy<mvc> ajwy) {
        akcr.b(ajwy, "lensComponent");
        return ((mvc) ajwy.get()).e();
    }

    public static final mvu c(ajwy<mvc> ajwy) {
        akcr.b(ajwy, "lensComponent");
        return ((mvc) ajwy.get()).f();
    }

    public static final ajfb<muo> d(ajwy<mvc> ajwy) {
        akcr.b(ajwy, "lensComponent");
        return new a(ajwy);
    }
}
