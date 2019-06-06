package defpackage;

import java.util.List;

/* renamed from: xom */
public final class xom implements xck {
    final ajxe a;
    final ajwy<xad> b;
    private final ajxe c;

    /* renamed from: xom$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xom$i */
    static final class i extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        i(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    /* renamed from: xom$h */
    static final class h extends akcs implements akbk<ojf> {
        private /* synthetic */ ajwy a;

        h(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ojf) this.a.get();
        }
    }

    /* renamed from: xom$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ xom a;

        b(xom xom) {
            this.a = xom;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final xfe xfe = (xfe) obj;
            akcr.b(xfe, "content");
            ojf a = ((ojf) this.a.c.b());
            Object a2 = xfe.a();
            akcr.a(a2, "content.mediaId");
            return a.b(a2).f(new ajfc<T, R>(this) {
                private /* synthetic */ b a;

                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    akcr.b(bool, "uploaded");
                    if (bool.booleanValue()) {
                        xad xad = (xad) this.a.a.b.get();
                        Object obj2 = xfe;
                        akcr.a(obj2, "content");
                        obj2 = obj2.a();
                        akcr.a(obj2, "content.mediaId");
                        xad.a(obj2);
                    }
                    return new ajxm(xfe, bool);
                }
            });
        }
    }

    /* renamed from: xom$c */
    static final class c<T> implements ajfl<ajxm<? extends xfe, ? extends Boolean>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return !((Boolean) ajxm.b).booleanValue();
        }
    }

    /* renamed from: xom$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return (xfe) ajxm.a;
        }
    }

    /* renamed from: xom$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ xom a;

        e(xom xom) {
            this.a = xom;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final xfe xfe = (xfe) obj;
            akcr.b(xfe, "content");
            ojf a = ((ojf) this.a.c.b());
            Object a2 = xfe.a();
            akcr.a(a2, "content.mediaId");
            return a.a(a2).f(new ajfc<T, R>(this) {
                private /* synthetic */ e a;

                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    akcr.b(bool, "persisted");
                    if (bool.booleanValue()) {
                        xdb b = ((xbd) this.a.a.a.b()).j().b(xfe.b);
                        if (b != null) {
                            xex xex = b.b;
                            Object obj2 = xfe;
                            akcr.a(obj2, "content");
                            xex.a(obj2.b(), true);
                        }
                    }
                    return new ajxm(xfe, bool);
                }
            });
        }
    }

    /* renamed from: xom$f */
    static final class f<T> implements ajfl<ajxm<? extends xfe, ? extends Boolean>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return !((Boolean) ajxm.b).booleanValue();
        }
    }

    /* renamed from: xom$g */
    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return (xfe) ajxm.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xom.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(xom.class), "memoriesMediaController", "getMemoriesMediaController()Lcom/snap/memories/api/MemoriesMediaController;")};
        a aVar = new a();
    }

    public xom(ajwy<ojf> ajwy, ajwy<xad> ajwy2, ajwy<xbd> ajwy3) {
        akcr.b(ajwy, "memoriesMediaControllerLazy");
        akcr.b(ajwy2, "contentController");
        akcr.b(ajwy3, "specsCoreComponentLazy");
        this.b = ajwy2;
        this.a = ajxh.a(new i(ajwy3));
        this.c = ajxh.a(new h(ajwy));
    }

    public final ajdx<List<xfe>> a(List<? extends xfe> list) {
        akcr.b(list, "contents");
        return ajdp.b((Iterable) list).g((ajfc) new b(this)).a((ajfl) c.a).p(d.a).g((ajfc) new e(this)).a((ajfl) f.a).p(g.a).a(16);
    }
}
