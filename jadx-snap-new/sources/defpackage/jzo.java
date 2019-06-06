package defpackage;

import android.content.Context;

/* renamed from: jzo */
public final class jzo implements jyp {
    private final ajxe a;

    /* renamed from: jzo$a */
    static final class a extends akcs implements akbk<ahx> {
        private /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ahx.a(this.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(jzo.class), "glide", "getGlide()Lcom/bumptech/glide3/Glide;");
    }

    public jzo(Context context) {
        akcr.b(context, "context");
        this.a = ajxh.a(new a(context));
    }

    private final ahx b() {
        return (ahx) this.a.b();
    }

    public final void a() {
        b().a();
    }

    public final void a(int i) {
        b().a(i);
    }
}
