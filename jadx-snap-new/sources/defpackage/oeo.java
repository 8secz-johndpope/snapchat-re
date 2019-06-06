package defpackage;

import android.content.Context;

/* renamed from: oeo */
public final class oeo {
    final ajxe a = ajxh.a(new a(this));
    final Context b;
    public final oeq c;
    private final int d = 20;
    private final int e = 4;

    /* renamed from: oeo$a */
    static final class a extends akcs implements akbk<jxs> {
        private /* synthetic */ oeo a;

        a(oeo oeo) {
            this.a = oeo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jxs(this.a.b, 4, 20);
        }
    }

    /* renamed from: oeo$b */
    public static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ oeo a;
        private /* synthetic */ jwa b;

        public b(oeo oeo, jwa jwa) {
            this.a = oeo;
            this.b = jwa;
        }

        public final /* synthetic */ Object apply(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "it");
            return ((jxs) this.a.a.b()).a(this.b, kaz, jwz.a(kaz).getWidth(), jwz.a(kaz).getHeight());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(oeo.class), "blurrer", "getBlurrer()Lcom/snap/imageloading/common/transformations/blur/BlurTransformation;");
    }

    public oeo(Context context, oeq oeq) {
        akcr.b(context, "context");
        akcr.b(oeq, "defaultExtractor");
        this.b = context;
        this.c = oeq;
    }
}
