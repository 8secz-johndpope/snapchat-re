package defpackage;

import com.snap.ui.view.emoji.SnapEmojiSpanFactory;

/* renamed from: zgw */
public final class zgw {
    static final ajxe a = ajxh.a(a.a);
    public static final ajxe b = ajxh.a(c.a);
    public static final ajxe c = ajxh.a(b.a);
    private static zgb d;

    /* renamed from: zgw$a */
    static final class a extends akcs implements akbk<ajwy<gfu>> {
        public static final a a = new a();

        /* renamed from: zgw$a$1 */
        static final class 1<T> implements ajwy<gfu> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object get() {
                Object c = ftq.c();
                akcr.a(c, "SnapContentProviderDependencies.getInstance()");
                return (gfu) c.a().get();
            }
        }

        a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return 1.a;
        }
    }

    /* renamed from: zgw$c */
    static final class c extends akcs implements akbk<SnapEmojiSpanFactory> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            zgb a = zgw.a();
            Object obj = ((ajwy) zgw.a.b()).get();
            akcr.a(obj, "contentResolver.get()");
            return new SnapEmojiSpanFactory(a, (gfu) obj);
        }
    }

    /* renamed from: zgw$b */
    static final class b extends akcs implements akbk<ajwy<ilv>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object c = ftq.c();
            akcr.a(c, "SnapContentProviderDependencies.getInstance()");
            return c.b();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zgw.class), "contentResolver", "getContentResolver()Ljavax/inject/Provider;"), new akdc(akde.a(zgw.class), "snapEmojiSpanFactory", "getSnapEmojiSpanFactory()Lcom/snap/ui/view/emoji/SnapEmojiSpanFactory;"), new akdc(akde.a(zgw.class), "graphene", "getGraphene()Ljavax/inject/Provider;")};
        zgw zgw = new zgw();
    }

    private zgw() {
    }

    public static zgb a() {
        if (d == null) {
            d = new zgb();
        }
        zgb zgb = d;
        if (zgb == null) {
            akcr.a();
        }
        return zgb;
    }
}
