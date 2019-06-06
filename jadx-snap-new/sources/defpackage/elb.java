package defpackage;

import defpackage.dva.a;
import defpackage.dva.b;
import defpackage.ebs.d;

/* renamed from: elb */
public final class elb implements ajdu<ebs, ebs> {
    private final a a = new a(d.b, new a());
    private final ajdp<dva> b;

    /* renamed from: elb$a */
    static final class a {
        final ebs a;
        final dva b;

        public a(ebs ebs, dva dva) {
            akcr.b(ebs, "streamingState");
            akcr.b(dva, "pageVisibilityTransition");
            this.a = ebs;
            this.b = dva;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.elb.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.elb.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.elb$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ebs ebs = this.a;
            int i = 0;
            int hashCode = (ebs != null ? ebs.hashCode() : 0) * 31;
            dva dva = this.b;
            if (dva != null) {
                i = dva.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("State(streamingState=");
            stringBuilder.append(this.a);
            stringBuilder.append(", pageVisibilityTransition=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: elb$b */
    static final class b<T> implements ajfb<ebs> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: elb$c */
    static final class c<T> implements ajfb<dva> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: elb$d */
    static final class d<T1, T2, R> implements ajex<ebs, dva, a> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            ebs ebs = (ebs) obj;
            dva dva = (dva) obj2;
            akcr.b(ebs, "streamingState");
            akcr.b(dva, "pageVisibilityTransition");
            return new a(ebs, dva);
        }
    }

    /* renamed from: elb$e */
    static final class e<T1, T2, R> implements ajex<R, T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            akcr.b(aVar, "currentState");
            akcr.b(aVar2, "newState");
            return ((aVar2.b instanceof a) || (aVar2.b instanceof b) || (aVar.b instanceof a) || (aVar.b instanceof b) || (akcr.a(aVar.a, d.b) ^ 1) == 0 || !akcr.a(aVar2.a, d.b)) ? aVar2 : aVar;
        }
    }

    /* renamed from: elb$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            return aVar.a;
        }
    }

    /* renamed from: elb$g */
    static final class g<T> implements ajfb<ebs> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public elb(ajdp<dva> ajdp) {
        akcr.b(ajdp, "pageVisibilityTransitionObservable");
        this.b = ajdp;
    }

    public final ajdt<ebs> apply(ajdp<ebs> ajdp) {
        akcr.b(ajdp, "streamingStateObservable");
        Object d = ajdp.a((ajdt) ajdp.d((ajfb) b.a), (ajdt) this.b.d((ajfb) c.a).h(new b()), (ajex) d.a).b(this.a, (ajex) e.a).b(1).p(f.a).j(ajfu.a).d((ajfb) g.a);
        akcr.a(d, "Observable.combineLatest…te %s\", streamingState) }");
        return (ajdt) d;
    }
}
