package defpackage;

import android.content.Intent;

/* renamed from: igg */
public final class igg {
    public static final ajxe b = ajxh.a(c.a);
    public final ajxe a = ajxh.a(i.a);

    /* renamed from: igg$c */
    static final class c extends akcs implements akbk<igg> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return f.a;
        }
    }

    /* renamed from: igg$i */
    static final class i extends akcs implements akbk<ajwo<e>> {
        public static final i a = new i();

        i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    /* renamed from: igg$b */
    public static final class b {
        static {
            new aken[1][0] = new akdc(akde.a(b.class), "instance", "getInstance()Lcom/snap/framework/rx/ActivityEventDispatcher;");
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: igg$f */
    static final class f {
        static final igg a = new igg();

        static {
            f fVar = new f();
        }

        private f() {
        }
    }

    /* renamed from: igg$d */
    public enum d {
        ACTIVITY_RESULT,
        PERMISSION_RESULT
    }

    /* renamed from: igg$e */
    public interface e {
        d a();
    }

    /* renamed from: igg$a */
    public static final class a implements e {
        public final int a;
        public final int b;
        private final Intent c;
        private final d d;

        public final d a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) != null) {
                        if (!((this.b == aVar.b ? 1 : null) != null && akcr.a(this.c, aVar.c) && akcr.a(this.d, aVar.d))) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            Intent intent = this.c;
            int i2 = 0;
            i = (i + (intent != null ? intent.hashCode() : 0)) * 31;
            d dVar = this.d;
            if (dVar != null) {
                i2 = dVar.hashCode();
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ActvityResult(requestCode=");
            stringBuilder.append(this.a);
            stringBuilder.append(", resultCode=");
            stringBuilder.append(this.b);
            stringBuilder.append(", data=");
            stringBuilder.append(this.c);
            stringBuilder.append(", event=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: igg$g */
    public static final class g<T> implements ajfl<e> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            e eVar = (e) obj;
            akcr.b(eVar, "it");
            return eVar.a() == d.ACTIVITY_RESULT;
        }
    }

    /* renamed from: igg$h */
    public static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            e eVar = (e) obj;
            akcr.b(eVar, "it");
            return (a) eVar;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(igg.class), "resultDispatcher", "getResultDispatcher()Lio/reactivex/subjects/PublishSubject;");
        b bVar = new b();
    }
}
