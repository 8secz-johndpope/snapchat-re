package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.brightcove.player.event.Event;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: epx */
public abstract class epx<Media extends ept> implements eqm<Media> {
    final ContentResolver a;
    final epy<Media> b;

    /* renamed from: epx$a */
    public static final class a<V> implements Callable<T> {
        private /* synthetic */ epx a;
        private /* synthetic */ long b;

        public a(epx epx, long j) {
            this.a = epx;
            this.b = j;
        }

        /* JADX WARNING: Missing block: B:3:0x002e, code skipped:
            if (r0.a.delete(r0.c.buildUpon().appendPath(java.lang.String.valueOf(r1)).build(), r3, null) == 1) goto L_0x0032;
     */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r6 = this;
            r0 = r6.a;
            r0 = r0.b;
            r1 = r6.b;
            r3 = r6.a;
            r3 = r3.a();
            r4 = r0.b;
            r4 = r4.i();
            r5 = 1;
            if (r4 == 0) goto L_0x0031;
        L_0x0015:
            r4 = r0.c;
            r4 = r4.buildUpon();
            r1 = java.lang.String.valueOf(r1);
            r1 = r4.appendPath(r1);
            r1 = r1.build();
            r0 = r0.a;
            r2 = 0;
            r0 = r0.delete(r1, r3, r2);
            if (r0 != r5) goto L_0x0031;
        L_0x0030:
            goto L_0x0032;
        L_0x0031:
            r5 = 0;
        L_0x0032:
            r0 = java.lang.Boolean.valueOf(r5);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.epx$a.call():java.lang.Object");
        }
    }

    /* renamed from: epx$b */
    public static final class b<V> implements Callable<T> {
        private /* synthetic */ epx a;
        private /* synthetic */ String b;
        private /* synthetic */ String[] c;

        public b(epx epx, String str, String[] strArr) {
            this.a = epx;
            this.b = str;
            this.c = strArr;
        }

        public final /* synthetic */ Object call() {
            epy epy = this.a.b;
            String a = this.a.a(this.b);
            String[] strArr = this.c;
            akcr.b(a, "selection");
            akcr.b(strArr, "selectionArgs");
            return Integer.valueOf(!epy.b.i() ? 0 : epy.a.delete(epy.c, a, strArr));
        }
    }

    /* renamed from: epx$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ epx a;
        private /* synthetic */ long b;

        d(epx epx, long j) {
            this.a = epx;
            this.b = j;
        }

        public final /* synthetic */ Object call() {
            epy epy = this.a.b;
            long j = this.b;
            String a = this.a.a();
            Object build = epy.c.buildUpon().appendPath(String.valueOf(j)).build();
            akcr.a(build, "uriWithId");
            List a2 = epy.a(null, build, a, null, 1, 0);
            return (((Collection) a2).isEmpty() ^ 1) != 0 ? (ept) a2.get(0) : null;
        }
    }

    /* renamed from: epx$h */
    public static final class h<V> implements Callable<T> {
        private /* synthetic */ epx a;

        public h(epx epx) {
            this.a = epx;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(this.a.b.a(this.a.a()));
        }
    }

    /* renamed from: epx$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ epx a;

        /* renamed from: epx$e$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                ept ept = (ept) obj;
                akcr.b(ept, "it");
                return new eqp(ept);
            }
        }

        e(epx epx) {
            this.a = epx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, "it");
            String lastPathSegment = uri.getLastPathSegment();
            Long f = lastPathSegment != null ? akga.f(lastPathSegment) : null;
            return f == null ? ajdp.b(new eqr(uri)) : this.a.a(f.longValue()).f(1.a).g();
        }
    }

    /* renamed from: epx$f */
    static final class f<T> implements ajdr<T> {
        final /* synthetic */ epx a;

        f(epx epx) {
            this.a = epx;
        }

        public final void subscribe(ajdq<Uri> ajdq) {
            akcr.b(ajdq, Event.EMITTER);
            final eqg eqg = new eqg(ajdq, (byte) 0);
            ajdq.a(ajek.a((ajev) new ajev(this) {
                private /* synthetic */ f a;

                public final void run() {
                    this.a.a.a.unregisterContentObserver(eqg);
                }
            }));
            for (Uri uri : this.a.b()) {
                if (!ajdq.isDisposed()) {
                    this.a.a.registerContentObserver(uri, true, eqg);
                }
            }
        }
    }

    /* renamed from: epx$g */
    public static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ epx a;

        public g(epx epx) {
            this.a = epx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Uri) obj, "it");
            return Integer.valueOf(this.a.b.a(this.a.a()));
        }
    }

    /* renamed from: epx$c */
    static final class c extends akcs implements akbw<Integer, Integer, List<? extends Media>> {
        private /* synthetic */ epx a;
        private /* synthetic */ Predicate b = null;
        private /* synthetic */ String c;
        private /* synthetic */ String[] d;

        c(epx epx, Predicate predicate, String str, String[] strArr) {
            this.a = epx;
            this.c = str;
            this.d = strArr;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            epy epy = this.a.b;
            return epy.a(this.b, epy.c, this.c, this.d, intValue, intValue2);
        }
    }

    public epx(ContentResolver contentResolver, epy<? extends Media> epy) {
        akcr.b(contentResolver, "contentResolver");
        akcr.b(epy, "queryHelper");
        this.a = contentResolver;
        this.b = epy;
    }

    public final ajdj<Media> a(long j) {
        Object b = ajdj.b((Callable) new d(this, j));
        akcr.a(b, "Maybe.fromCallable {\n   …ionArgs = null)\n        }");
        return b;
    }

    public final ajdp<eqq<Media>> a(ajdw ajdw) {
        akcr.b(ajdw, "debounceScheduler");
        Object k = c().b(50, TimeUnit.MILLISECONDS, ajdw).k((ajfc) new e(this));
        akcr.a(k, "observeContentResolver()…     }\n                 }");
        return k;
    }

    /* JADX WARNING: Missing block: B:2:0x0006, code skipped:
            if (r3 == null) goto L_0x0008;
     */
    public final defpackage.ifq<Media> a(java.lang.String r3, java.lang.String[] r4, int r5) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0008;
    L_0x0002:
        r3 = r2.a(r3);
        if (r3 != 0) goto L_0x000c;
    L_0x0008:
        r3 = r2.a();
    L_0x000c:
        r0 = new epx$c;
        r1 = 0;
        r0.<init>(r2, r1, r3, r4);
        r0 = (defpackage.akbw) r0;
        r3 = new ifq;
        r4 = 0;
        r3.<init>(r0, r5, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epx.a(java.lang.String, java.lang.String[], int):ifq");
    }

    public abstract String a();

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        String a = a();
        if (a == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" AND ");
        stringBuilder.append(a);
        a = stringBuilder.toString();
        return a == null ? str : a;
    }

    public abstract List<Uri> b();

    public final ajdp<Uri> c() {
        Object a = ajdp.a((ajdr) new f(this));
        akcr.a(a, "Observable.create<Uri>({…\n            }\n        })");
        return a;
    }
}
