package defpackage;

import com.snap.core.db.record.UnlockablesModel;

/* renamed from: tpj */
public final class tpj {
    public final ajxe a;
    public final ajxe b;
    public final ajxe c;
    public final ajxe d;
    private final ajxe e;

    /* renamed from: tpj$d */
    static final class d extends akcs implements akbk<Boolean> {
        private /* synthetic */ tpi a;

        d(tpi tpi) {
            this.a = tpi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.a);
        }
    }

    /* renamed from: tpj$e */
    static final class e extends akcs implements akbk<Boolean> {
        private /* synthetic */ tpi a;

        e(tpi tpi) {
            this.a = tpi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.b);
        }
    }

    /* renamed from: tpj$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ tpi a;

        a(tpi tpi) {
            this.a = tpi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.c);
        }
    }

    /* renamed from: tpj$c */
    static final class c extends akcs implements akbk<Boolean> {
        private /* synthetic */ tpi a;

        c(tpi tpi) {
            this.a = tpi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.d);
        }
    }

    /* renamed from: tpj$b */
    static final class b extends akcs implements akbk<Boolean> {
        private /* synthetic */ tpi a;

        b(tpi tpi) {
            this.a = tpi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.e);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tpj.class), "isSnapCropEnabled", "isSnapCropEnabled()Z"), new akdc(akde.a(tpj.class), "isVideoTimerLoopPlayback", "isVideoTimerLoopPlayback()Z"), new akdc(akde.a(tpj.class), "isCaptionBarEnabled", "isCaptionBarEnabled()Z"), new akdc(akde.a(tpj.class), "isPreviewSwipeDownToDismiss", "isPreviewSwipeDownToDismiss()Z"), new akdc(akde.a(tpj.class), "isLensesInFilterCarouselEnabled", "isLensesInFilterCarouselEnabled()Z")};
    }

    public tpj(tpi tpi) {
        akcr.b(tpi, UnlockablesModel.DATA);
        this.a = ajxh.a(new d(tpi));
        this.b = ajxh.a(new e(tpi));
        this.e = ajxh.a(new a(tpi));
        this.c = ajxh.a(new c(tpi));
        this.d = ajxh.a(new b(tpi));
    }

    public final boolean a() {
        return ((Boolean) this.e.b()).booleanValue();
    }
}
