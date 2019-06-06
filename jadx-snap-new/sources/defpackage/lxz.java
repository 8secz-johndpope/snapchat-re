package defpackage;

/* renamed from: lxz */
public final class lxz implements mhi<mha> {
    private final lyl a;
    private final mhi<lzh> b;

    /* renamed from: lxz$a */
    public static final class a implements mha {
        private /* synthetic */ ajdp a;
        private /* synthetic */ lyw b;
        private /* synthetic */ lzp c;

        a(ajdp ajdp, lyw lyw, lzp lzp) {
            this.a = ajdp;
            this.b = lyw;
            this.c = lzp;
        }

        public final ajej a() {
            ajei ajei = new ajei();
            ajej l = this.a.l();
            akcr.a((Object) l, "tooltipUi.subscribe()");
            ajvv.a(ajei, l);
            ajdp b = this.b.b();
            akbl akbl = lya.a;
            if (akbl != null) {
                akbl = new lyb(akbl);
            }
            l = b.p((ajfc) akbl).f(this.c.a());
            akcr.a((Object) l, "explorerUseCase.outputs\n…be(tooltipUseCase.inputs)");
            ajvv.a(ajei, l);
            return ajei;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public lxz(lyl lyl, mhi<lzh> mhi) {
        akcr.b(lyl, "explorerComponent");
        akcr.b(mhi, "tooltipBuilder");
        this.a = lyl;
        this.b = mhi;
    }

    public final /* synthetic */ Object a() {
        lzh lzh = (lzh) this.b.a();
        return new a(lzh.b(), this.a.j(), lzh.e());
    }
}
