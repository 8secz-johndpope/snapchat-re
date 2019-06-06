package defpackage;

import defpackage.akwk.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: akwg */
final class akwg extends a {

    /* renamed from: akwg$d */
    static final class d implements akwk<Object, String> {
        static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: akwg$e */
    static final class e implements akwk<akhw, Void> {
        static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object a(Object obj) {
            ((akhw) obj).close();
            return null;
        }
    }

    /* renamed from: akwg$a */
    static final class a implements akwk<akhw, akhw> {
        static final a a = new a();

        a() {
        }

        private static akhw a(akhw akhw) {
            try {
                akhw a = akwv.a(akhw);
                return a;
            } finally {
                akhw.close();
            }
        }
    }

    /* renamed from: akwg$b */
    static final class b implements akwk<akhu, akhu> {
        static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return (akhu) obj;
        }
    }

    /* renamed from: akwg$c */
    static final class c implements akwk<akhw, akhw> {
        static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return (akhw) obj;
        }
    }

    akwg() {
    }

    public final akwk<akhw, ?> a(Type type, Annotation[] annotationArr, akwt akwt) {
        if (type != akhw.class) {
            return type == Void.class ? e.a : null;
        } else {
            Class cls = akyg.class;
            Object obj = null;
            for (Object isInstance : annotationArr) {
                if (cls.isInstance(isInstance)) {
                    obj = 1;
                    break;
                }
            }
            return obj != null ? c.a : a.a;
        }
    }

    public final akwk<?, akhu> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, akwt akwt) {
        return akhu.class.isAssignableFrom(akwv.a(type)) ? b.a : null;
    }
}
