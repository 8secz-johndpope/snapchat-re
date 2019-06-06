package defpackage;

import android.content.Context;
import defpackage.lvi.b;
import defpackage.miw.b.a;

/* renamed from: lva */
public abstract class lva implements mha {

    /* renamed from: lva$d */
    public interface d {
        ide h();

        zgb i();

        ajdp<lqf> j();

        akbl<Context, jn> k();

        ajdp<mmt> l();

        miw m();

        kqf n();
    }

    /* renamed from: lva$a */
    public static abstract class a implements mhi<lva> {
        public d e;

        public abstract a a(ajdp<mih> ajdp);

        public abstract a a(d dVar);

        public abstract a a(mtj mtj);

        public abstract a b(ajdp<lvi> ajdp);
    }

    /* renamed from: lva$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lva$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdu<b, b> a(kqf kqf, ajdp<lqf> ajdp, ajdp<mih> ajdp2, zfw zfw) {
            akcr.b(kqf, "analyticsEventHandler");
            akcr.b(ajdp, "cameraLifecycle");
            akcr.b(ajdp2, "windowRect");
            akcr.b(zfw, "qualifiedSchedulers");
            return mic.a(new luz(ajdp, zfw), new lvn(kqf), mic.a((ajdp) ajdp2));
        }

        public static final lvg a(zfw zfw, ajdp<lvi> ajdp, lvh lvh, ajdu<b, b> ajdu) {
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(ajdp, "viewProvider");
            akcr.b(lvh, "imagePickerUseCase");
            akcr.b(ajdu, "imagePickerViewModelTransformer");
            return new luq(ajdp, lvh, ajdu, zfw);
        }

        public static final lvh a(ajdp<mmt> ajdp, mtj mtj, zfw zfw) {
            akcr.b(ajdp, "lensCore");
            akcr.b(mtj, "externalImagesRepository");
            akcr.b(zfw, "qualifiedSchedulers");
            return new lut(ajdp, mtj, zfw);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("LensImagePicker"));
        }
    }

    /* renamed from: lva$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ajdp a;

        e(ajdp ajdp) {
            this.a = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            return bool.booleanValue() ? this.a : ajvo.a(ajot.a);
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
        ajdp b = d().b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mip.a(d().getClass()));
        stringBuilder.append("#observe");
        Object u = e().a(a.a).a(mja.ENABLE_IMAGE_PICKER).u(new e(mip.b(b, stringBuilder.toString())));
        akcr.a(u, "configurationRepository.…      }\n                }");
        return u;
    }

    public abstract lvg d();

    public abstract miw e();
}
