package defpackage;

import defpackage.mbg.b.c;
import defpackage.mbv.a.b;

/* renamed from: mar */
public final class mar implements mhi<mha> {
    private final may a;
    private final mhi<mbn> b;

    /* renamed from: mar$a */
    public static final class a implements mha {
        private /* synthetic */ mbn a;
        private /* synthetic */ mbg b;

        /* renamed from: mar$a$a */
        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                b bVar;
                obj = (mbg.b) obj;
                akcr.b(obj, "result");
                if (akcr.a(obj, c.a)) {
                    bVar = b.a;
                } else if (akcr.a(obj, defpackage.mbg.b.a.a) || akcr.a(obj, mbg.b.b.a)) {
                    bVar = defpackage.mbv.a.a.a;
                } else {
                    throw new ajxk();
                }
                return bVar;
            }
        }

        a(mbn mbn, mbg mbg) {
            this.a = mbn;
            this.b = mbg;
        }

        public final ajej a() {
            ajei ajei = new ajei();
            ajei.a(this.a.b().l());
            ajei.a(this.b.b().p(a.a).f(this.a.d().a()));
            return ajei;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public mar(may may, mhi<mbn> mhi) {
        akcr.b(may, "buttonComponent");
        akcr.b(mhi, "tooltipBuilder");
        this.a = may;
        this.b = mhi;
    }

    public final /* synthetic */ Object a() {
        return new a((mbn) this.b.a(), this.a.i());
    }
}
