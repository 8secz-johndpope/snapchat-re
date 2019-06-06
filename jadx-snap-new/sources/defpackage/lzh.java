package defpackage;

import android.content.Context;
import defpackage.lzq.b;

/* renamed from: lzh */
public abstract class lzh implements mha {

    /* renamed from: lzh$d */
    public interface d {
        ide d();

        zgb e();

        akbl<Context, jn> f();

        miw g();

        ajdp<lqf> h();
    }

    /* renamed from: lzh$a */
    public static abstract class a implements mhi<lzh> {
        public d e;

        public abstract a a(ajdp<Boolean> ajdp);

        public abstract a a(d dVar);

        public abstract a b(ajdp<mih> ajdp);

        public abstract a c(ajdp<lzq> ajdp);
    }

    /* renamed from: lzh$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lzh$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdu<b, b> a(ajdp<mih> ajdp, ajdp<lqf> ajdp2, ajdp<Boolean> ajdp3, zfw zfw) {
            akcr.b(ajdp, "windowRect");
            akcr.b(ajdp2, "cameraLifecycle");
            akcr.b(ajdp3, "hideWhen");
            akcr.b(zfw, "qualifiedSchedulers");
            return mic.a(new lzg(ajdp2, ajdp3, zfw), mic.a((ajdp) ajdp));
        }

        public static final lzn a(ajdp<lzq> ajdp, ajdu<b, b> ajdu, lzp lzp, zfw zfw) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(ajdu, "viewModelTransformer");
            akcr.b(lzp, "useCase");
            akcr.b(zfw, "qualifiedSchedulers");
            return new lyz(ajdp, lzp, ajdu, zfw);
        }

        public static final lzo a(miw miw) {
            akcr.b(miw, "configurationRepository");
            return new lzc(miw);
        }

        public static final lzp a(lzo lzo, zfw zfw) {
            akcr.b(lzo, "tooltipSettings");
            akcr.b(zfw, "qualifiedSchedulers");
            return new lze(lzo, zfw);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("ExplorerTooltipComponent"));
        }
    }

    static {
        b bVar = new b();
    }

    public final ajej a() {
        Object l = b().l();
        akcr.a(l, "observe().subscribe()");
        return l;
    }

    public final ajdp<Object> b() {
        return d().b();
    }

    public abstract lzn d();

    public abstract lzp e();
}
