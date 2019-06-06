package defpackage;

import defpackage.mnu.b;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: mnc */
public final class mnc {
    private final Map<Class<?>, akbl<mkx, ?>> a;

    /* renamed from: mnc$a */
    public static final class a {
        final Map<Class<?>, akbl<mkx, ?>> a = new LinkedHashMap();

        /* renamed from: mnc$a$a */
        static final class a extends akcs implements akbl<mkx, mlq> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mlq(mkx);
            }
        }

        /* renamed from: mnc$a$n */
        public static final class n extends akcs implements akbl<mkx, R> {
            private /* synthetic */ akbl a;

            public n(akbl akbl) {
                this.a = akbl;
                super(1);
            }

            private R a(mkx mkx) {
                akcr.b(mkx, "lensCore");
                return this.a.invoke(mkx);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return a((mkx) obj);
            }
        }

        /* renamed from: mnc$a$g */
        static final class g extends akcs implements akbl<mkx, mkp> {
            private /* synthetic */ mmu a;

            g(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mkp(mkx, this.a.h, this.a.c);
            }
        }

        /* renamed from: mnc$a$h */
        static final class h extends akcs implements akbl<mkx, mls> {
            private /* synthetic */ mmu a;

            h(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mls(this.a.a, mkx, this.a.o, this.a.c);
            }
        }

        /* renamed from: mnc$a$i */
        static final class i extends akcs implements akbl<mkx, mlv> {
            private /* synthetic */ mmu a;

            i(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mlv(mkx, this.a.a);
            }
        }

        /* renamed from: mnc$a$k */
        static final class k extends akcs implements akbl<mkx, mnu> {
            private /* synthetic */ mmu a;

            k(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mkx) obj, "it");
                return this.a.n ? new mli(this.a.a) : b.a;
            }
        }

        /* renamed from: mnc$a$b */
        static final class b extends akcs implements akbl<mkx, mld> {
            private /* synthetic */ mmu a;

            b(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mld(mkx, this.a.h);
            }
        }

        /* renamed from: mnc$a$d */
        static final class d extends akcs implements akbl<mkx, mku> {
            private /* synthetic */ mmu a;

            d(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mku(this.a.a, mkx);
            }
        }

        /* renamed from: mnc$a$f */
        static final class f extends akcs implements akbl<mkx, mke> {
            public static final f a = new f();

            f() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mke(mkx);
            }
        }

        /* renamed from: mnc$a$j */
        static final class j extends akcs implements akbl<mkx, mkw> {
            public static final j a = new j();

            j() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mkw(mkx);
            }
        }

        /* renamed from: mnc$a$l */
        static final class l extends akcs implements akbl<mkx, mko> {
            public static final l a = new l();

            l() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mko(mkx);
            }
        }

        /* renamed from: mnc$a$m */
        static final class m extends akcs implements akbl<mkx, mkf> {
            public static final m a = new m();

            m() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mkf(mkx);
            }
        }

        /* renamed from: mnc$a$c */
        static final class c extends akcs implements akbl<mkx, mkc> {
            public static final c a = new c();

            c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mkc(mkx);
            }
        }

        /* renamed from: mnc$a$e */
        static final class e extends akcs implements akbl<mkx, mkz> {
            public static final e a = new e();

            e() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mkz(mkx);
            }
        }
    }

    /* renamed from: mnc$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        b bVar = new b();
    }

    private /* synthetic */ mnc() {
        this(ajyx.a);
    }

    public mnc(Map<Class<?>, ? extends akbl<? super mkx, ?>> map) {
        akcr.b(map, "factories");
        this.a = map;
    }

    public final <T> T a(Class<T> cls, mkx mkx) {
        akcr.b(cls, "componentClass");
        akcr.b(mkx, "lensCore");
        akbl akbl = (akbl) this.a.get(cls);
        if (akbl != null) {
            Object invoke = akbl.invoke(mkx);
            if (invoke != null) {
                return invoke;
            }
        }
        throw new IllegalArgumentException("No factory defined to create component for: ".concat(String.valueOf(cls)));
    }
}
