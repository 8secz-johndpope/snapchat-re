package defpackage;

import java.io.IOException;

/* renamed from: akxi */
final class akxi {

    /* renamed from: akxi$a */
    static final class a implements akwk<akhw, Boolean> {
        static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(((akhw) obj).g());
        }
    }

    /* renamed from: akxi$b */
    static final class b implements akwk<akhw, Byte> {
        static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Byte.valueOf(((akhw) obj).g());
        }
    }

    /* renamed from: akxi$c */
    static final class c implements akwk<akhw, Character> {
        static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object a(Object obj) {
            String g = ((akhw) obj).g();
            if (g.length() == 1) {
                return Character.valueOf(g.charAt(0));
            }
            StringBuilder stringBuilder = new StringBuilder("Expected body of length 1 for Character conversion but was ");
            stringBuilder.append(g.length());
            throw new IOException(stringBuilder.toString());
        }
    }

    /* renamed from: akxi$d */
    static final class d implements akwk<akhw, Double> {
        static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Double.valueOf(((akhw) obj).g());
        }
    }

    /* renamed from: akxi$e */
    static final class e implements akwk<akhw, Float> {
        static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Float.valueOf(((akhw) obj).g());
        }
    }

    /* renamed from: akxi$f */
    static final class f implements akwk<akhw, Integer> {
        static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Integer.valueOf(((akhw) obj).g());
        }
    }

    /* renamed from: akxi$g */
    static final class g implements akwk<akhw, Long> {
        static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Long.valueOf(((akhw) obj).g());
        }
    }

    /* renamed from: akxi$h */
    static final class h implements akwk<akhw, Short> {
        static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return Short.valueOf(((akhw) obj).g());
        }
    }

    /* renamed from: akxi$i */
    static final class i implements akwk<akhw, String> {
        static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object a(Object obj) {
            return ((akhw) obj).g();
        }
    }
}
