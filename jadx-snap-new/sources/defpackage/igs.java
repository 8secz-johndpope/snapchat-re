package defpackage;

import com.looksery.sdk.listener.AnalyticsListener;
import defpackage.ihu.a;
import defpackage.ihu.b;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: igs */
public final class igs {

    /* renamed from: igs$c */
    static final class c<T> implements ajfb<ajej> {
        private /* synthetic */ AtomicInteger a;
        private /* synthetic */ String b;

        c(AtomicInteger atomicInteger, String str) {
            this.a = atomicInteger;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.set(zgo.a());
        }
    }

    /* renamed from: igs$d */
    static final class d implements ajev {
        private /* synthetic */ String a;
        private /* synthetic */ AtomicInteger b;

        d(String str, AtomicInteger atomicInteger) {
            this.a = str;
            this.b = atomicInteger;
        }

        public final void run() {
            zgo.a(this.b.get());
        }
    }

    /* renamed from: igs$e */
    public static final class e<T1, T2, R> implements ajex<T1, T2, R> {
        private /* synthetic */ akbw a;

        public e(akbw akbw) {
            this.a = akbw;
        }

        public final R apply(T1 t1, T2 t2) {
            return this.a.invoke(t1, t2);
        }
    }

    /* renamed from: igs$i */
    public static final class i<T1, T2, T3, T4, T5, T6, R> implements ajfg<T1, T2, T3, T4, T5, T6, R> {
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return new m(t1, t2, t3, t4, t5, t6);
        }
    }

    /* renamed from: igs$j */
    static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ akcd a;

        j(akcd akcd) {
            this.a = akcd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            m mVar = (m) obj;
            akcr.b(mVar, "<name for destructuring parameter 0>");
            return this.a.a(mVar.a, mVar.b, mVar.c, mVar.d, mVar.e, mVar.f);
        }
    }

    /* renamed from: igs$m */
    public static final class m {
        final T1 a;
        final T2 b;
        final T3 c;
        final T4 d;
        final T5 e;
        final T6 f;

        public m(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            this.a = t1;
            this.b = t2;
            this.c = t3;
            this.d = t4;
            this.e = t5;
            this.f = t6;
        }

        /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (defpackage.akcr.a(r2.f, r3.f) != false) goto L_0x0047;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0047;
        L_0x0002:
            r0 = r3 instanceof defpackage.igs.m;
            if (r0 == 0) goto L_0x0045;
        L_0x0006:
            r3 = (defpackage.igs.m) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x0026:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x0030:
            r0 = r2.e;
            r1 = r3.e;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0045;
        L_0x003a:
            r0 = r2.f;
            r3 = r3.f;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0045;
        L_0x0044:
            goto L_0x0047;
        L_0x0045:
            r3 = 0;
            return r3;
        L_0x0047:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.igs$m.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Object obj = this.a;
            int i = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.b;
            hashCode = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
            obj2 = this.c;
            hashCode = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
            obj2 = this.d;
            hashCode = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
            obj2 = this.e;
            hashCode = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
            obj2 = this.f;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Intermediate6(v1=");
            stringBuilder.append(this.a);
            stringBuilder.append(", v2=");
            stringBuilder.append(this.b);
            stringBuilder.append(", v3=");
            stringBuilder.append(this.c);
            stringBuilder.append(", v4=");
            stringBuilder.append(this.d);
            stringBuilder.append(", v5=");
            stringBuilder.append(this.e);
            stringBuilder.append(", v6=");
            stringBuilder.append(this.f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: igs$q */
    static final class q<V> implements Callable<ajdb> {
        private /* synthetic */ AtomicBoolean a;

        q(AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        public final /* synthetic */ Object call() {
            return ajvo.a(this.a.get() ? ajib.a : ajhn.a);
        }
    }

    /* renamed from: igs$u */
    static final class u<Upstream, Downstream> implements ajec<T, T> {
        final /* synthetic */ akbk a;
        final /* synthetic */ ajdw b;

        u(akbk akbk, ajdw ajdw) {
            this.a = akbk;
            this.b = ajdw;
        }

        public final ajeb<T> apply(final ajdx<T> ajdx) {
            akcr.b(ajdx, "upstream");
            return new ajeb<T>(this) {
                private /* synthetic */ u a;

                public final void a(ajdz<? super T> ajdz) {
                    akcr.b(ajdz, "observer");
                    (((Boolean) this.a.a.invoke()).booleanValue() ? ajdx.b(this.a.b) : ajdx).a((ajdz) ajdz);
                }
            };
        }
    }

    /* renamed from: igs$a */
    static final class a<T> implements ajfb<ajej> {
        private /* synthetic */ AtomicInteger a;
        private /* synthetic */ String b;

        a(AtomicInteger atomicInteger, String str) {
            this.a = atomicInteger;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.set(zgo.a());
        }
    }

    /* renamed from: igs$b */
    static final class b implements ajev {
        private /* synthetic */ String a;
        private /* synthetic */ AtomicInteger b;

        b(String str, AtomicInteger atomicInteger) {
            this.a = str;
            this.b = atomicInteger;
        }

        public final void run() {
            zgo.a(this.b.get());
        }
    }

    /* renamed from: igs$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ akbl a;

        n(akbl akbl) {
            this.a = akbl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return ((ajcx) this.a.invoke(obj)).b((ajeb) ajdx.b(obj));
        }
    }

    /* renamed from: igs$o */
    static final class o<T> implements ajfl<ajxm<? extends T1, ? extends T2>> {
        private /* synthetic */ akbl a;

        o(akbl akbl) {
            this.a = akbl;
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return ((Boolean) this.a.invoke(ajxm.b)).booleanValue();
        }
    }

    /* renamed from: igs$p */
    static final class p<T, R> implements ajfc<T, R> {
        public static final p a = new p();

        p() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return ajxm.a;
        }
    }

    /* renamed from: igs$l */
    public static final class l {
        final T1 a;
        final T2 b;
        final T3 c;

        public l(T1 t1, T2 t2, T3 t3) {
            this.a = t1;
            this.b = t2;
            this.c = t3;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.igs.l;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.igs.l) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.igs$l.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Object obj = this.a;
            int i = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.b;
            hashCode = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
            obj2 = this.c;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Intermediate3(v1=");
            stringBuilder.append(this.a);
            stringBuilder.append(", v2=");
            stringBuilder.append(this.b);
            stringBuilder.append(", v3=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: igs$f */
    public static final class f<T1, T2, T3, T4, R> implements ajfe<T1, T2, T3, T4, R> {
        private /* synthetic */ akcb a;

        public f(akcb akcb) {
            this.a = akcb;
        }

        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return this.a.invoke(t1, t2, t3, t4);
        }
    }

    /* renamed from: igs$g */
    public static final class g<T1, T2, T3, T4, T5, R> implements ajff<T1, T2, T3, T4, T5, R> {
        private /* synthetic */ akcc a;

        public g(akcc akcc) {
            this.a = akcc;
        }

        public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return this.a.a(t1, t2, t3, t4, t5);
        }
    }

    /* renamed from: igs$h */
    public static final class h<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        public final R apply(T1 t1, T2 t2, T3 t3) {
            return new l(t1, t2, t3);
        }
    }

    /* renamed from: igs$k */
    public static final class k<T, R> implements ajfc<T, R> {
        private /* synthetic */ akca a;

        public k(akca akca) {
            this.a = akca;
        }

        public final /* synthetic */ Object apply(Object obj) {
            l lVar = (l) obj;
            akcr.b(lVar, "<name for destructuring parameter 0>");
            return this.a.invoke(lVar.a, lVar.b, lVar.c);
        }
    }

    /* renamed from: igs$r */
    public static final class r<T, R> implements ajfc<T, R> {
        public static final r a = new r();

        r() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new a(obj);
        }
    }

    /* renamed from: igs$s */
    public static final class s<T, R> implements ajfc<Throwable, ajeb<? extends ihu<? extends T, ? extends Throwable>>> {
        public static final s a = new s();

        s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return ajdx.b(new b(th));
        }
    }

    /* renamed from: igs$t */
    static final class t<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final t a = new t();

        t() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdp ajdp = (ajdp) obj;
            akcr.b(ajdp, "it");
            return ajdp;
        }
    }

    /* renamed from: igs$v */
    static final class v<T> implements ajfb<T> {
        private /* synthetic */ String a;

        v(String str) {
            this.a = str;
        }

        public final void accept(T t) {
        }
    }

    /* renamed from: igs$w */
    static final class w<T> implements ajfb<T> {
        public static final w a = new w();

        w() {
        }

        public final void accept(T t) {
        }
    }

    public static final ajcx a(ajcx ajcx, String str) {
        akcr.b(ajcx, "receiver$0");
        akcr.b(str, "tag");
        AtomicInteger atomicInteger = new AtomicInteger();
        Object e = ajcx.c((ajfb) new c(atomicInteger, str)).e((ajev) new d(str, atomicInteger));
        akcr.a(e, "this\n            .doOnSu…eEnd(tag, cookie.get()) }");
        return e;
    }

    public static final ajcx a(ajcx ajcx, AtomicBoolean atomicBoolean) {
        akcr.b(ajcx, "receiver$0");
        Object b = ajcx.b((ajdb) ajcx.a((Callable) new q(atomicBoolean)));
        akcr.a(b, "toBeReturned");
        return b;
    }

    public static final <T> ajdp<T> a(ajdp<T> ajdp) {
        akcr.b(ajdp, "receiver$0");
        Object a = ajdp.a((ajdu) cfb.a());
        akcr.a(a, "this.compose(ReplayingShare.instance())");
        return a;
    }

    private static <T> ajdp<T> a(ajdp<T> ajdp, long j, TimeUnit timeUnit, long j2, ajdw ajdw) {
        long j3 = j;
        Object obj = timeUnit;
        long j4 = j2;
        ajdw ajdw2 = ajdw;
        akcr.b(ajdp, "receiver$0");
        akcr.b(obj, "timeUnit");
        Object obj2 = ajwh.b;
        int i = ajde.a;
        ajfv.a(i, "bufferSize");
        ajfv.a(obj2, "scheduler is null");
        ajfv.a(obj, "unit is null");
        if (j3 > 0) {
            ajdp a = ajvo.a(new ajrj(ajdp, j2, j2, timeUnit, obj2, j, i));
            Object k = (ajdw2 != null ? a.f(j4, obj, ajdw2) : a.f(j4, obj, ajwh.b)).k((ajfc) t.a);
            akcr.a(k, "throttled.flatMap { it }");
            return k;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AnalyticsListener.ANALYTICS_COUNT_KEY);
        stringBuilder.append(" > 0 required but it was ");
        stringBuilder.append(j3);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final <T1, T2, T3, T4, T5, T6, R> ajdp<R> a(ajdp<T1> ajdp, ajdp<T2> ajdp2, ajdp<T3> ajdp3, ajdp<T4> ajdp4, ajdp<T5> ajdp5, ajdp<T6> ajdp6, ajdw ajdw, akcd<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> akcd) {
        akcr.b(ajdp, "observable1");
        akcr.b(ajdp2, "observable2");
        akcr.b(ajdp3, "observable3");
        akcr.b(ajdp4, "observable4");
        akcr.b(ajdp5, "observable5");
        akcr.b(ajdp6, "observable6");
        akcr.b(ajdw, "scheduler");
        akcr.b(akcd, "combiner");
        ajdp a = ajdp.a(ajdp, ajdp2, ajdp3, ajdp4, ajdp5, ajdp6, new i());
        if (a == null) {
            akcr.a();
        }
        Object p = a.a(ajdw).p(new j(akcd));
        akcr.a(p, "Observables.combineLates…v4, v5, v6)\n            }");
        return p;
    }

    public static final <T1, T2, T3, T4, T5, R> ajdp<R> a(ajdp<T1> ajdp, ajdp<T2> ajdp2, ajdp<T3> ajdp3, ajdp<T4> ajdp4, ajdp<T5> ajdp5, akcc<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> akcc) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(ajdp2, "observable2");
        akcr.b(ajdp3, "observable3");
        akcr.b(ajdp4, "observable4");
        akcr.b(ajdp5, "observable5");
        akcr.b(akcc, "combiner");
        ajdp a = ajdp.a(ajdp, ajdp2, ajdp3, ajdp4, ajdp5, new g(akcc));
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    public static final <T1, T2, T3, T4, R> ajdp<R> a(ajdp<T1> ajdp, ajdp<T2> ajdp2, ajdp<T3> ajdp3, ajdp<T4> ajdp4, akcb<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> akcb) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(ajdp2, "observable2");
        akcr.b(ajdp3, "observable3");
        akcr.b(ajdp4, "observable4");
        akcr.b(akcb, "combiner");
        ajdp a = ajdp.a((ajdt) ajdp, (ajdt) ajdp2, (ajdt) ajdp3, (ajdt) ajdp4, (ajfe) new f(akcb));
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    public static final <T1, T2> ajdp<T1> a(ajdp<T1> ajdp, ajdp<T2> ajdp2, akbl<? super T2, Boolean> akbl) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(ajdp2, "observable");
        akcr.b(akbl, "filterFunc");
        Object p = ajwb.a(ajdp, ajdp2).a((ajfl) new o(akbl)).p(p.a);
        akcr.a(p, "this.withLatestFrom(obse…econd) }.map { it.first }");
        return p;
    }

    public static final <T1, T2, R> ajdp<R> a(ajdp<T1> ajdp, ajdp<T2> ajdp2, akbw<? super T1, ? super T2, ? extends R> akbw) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(ajdp2, "observable2");
        akcr.b(akbw, "combiner");
        ajdp a = ajdp.a((ajdt) ajdp, (ajdt) ajdp2, (ajex) new e(akbw));
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    public static final <T> ajdp<T> a(ajdp<T> ajdp, String str) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(str, "tag");
        Object b = ajdp.d((ajfb) new v(str)).b((ajfb) w.a);
        akcr.a(b, "this\n            .doOnNe…raceCompat.endSection() }");
        return b;
    }

    public static final <T> ajdx<T> a(ajdx<T> ajdx, akbk<Boolean> akbk, ajdw ajdw) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(akbk, "shouldSubscribe");
        akcr.b(ajdw, "scheduler");
        Object a = ajdx.a((ajec) new u(akbk, ajdw));
        akcr.a(a, "this.compose(transformer)");
        return a;
    }

    public static final <T> ajdx<T> a(ajdx<T> ajdx, akbl<? super T, ? extends ajcx> akbl) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(akbl, "completable");
        Object a = ajdx.a((ajfc) new n(akbl));
        akcr.a(a, "this.flatMap { completab…ndThen(Single.just(it)) }");
        return a;
    }

    public static final <T> ajdx<T> a(ajdx<T> ajdx, String str) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(str, "tag");
        AtomicInteger atomicInteger = new AtomicInteger();
        Object a = ajdx.b((ajfb) new a(atomicInteger, str)).a((ajev) new b(str, atomicInteger));
        akcr.a(a, "this\n            .doOnSu…eEnd(tag, cookie.get()) }");
        return a;
    }
}
