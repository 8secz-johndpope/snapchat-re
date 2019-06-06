package defpackage;

import android.content.Context;
import android.view.View;
import com.snap.lenses.camera.snappables.startbutton.DefaultStartButtonView;
import defpackage.mft.b;
import defpackage.mic.a;

/* renamed from: mfj */
public abstract class mfj implements mha {

    /* renamed from: mfj$d */
    public interface d {
        ajdp<mmt> d();

        ide e();

        zgb f();

        akbl<Context, jn> g();

        kqf h();
    }

    /* renamed from: mfj$a */
    public static abstract class a implements mhi<mfj> {
        public d e;
        public ajdp<View> f;

        /* renamed from: mfj$a$a */
        public static final class a<T1, T2, R> implements ajex<DefaultStartButtonView, View, R> {
            public final R apply(DefaultStartButtonView defaultStartButtonView, View view) {
                Object obj = view;
                defaultStartButtonView = defaultStartButtonView;
                akcr.a(obj, "dispatchTo");
                defaultStartButtonView.setOnTouchListener(new mfr(obj));
                return defaultStartButtonView;
            }
        }

        public a() {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            this.f = a;
        }

        public abstract a a(ajdp<Boolean> ajdp);

        public abstract a a(d dVar);

        public abstract a a(boolean z);

        public abstract a b(ajdp<mfu> ajdp);
    }

    /* renamed from: mfj$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mfj$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdu<b, b> a(boolean z) {
            return z ? new mfp() : a.a;
        }

        public static final ajdu<mfu.b, mfu.b> a(boolean z, ajdp<Boolean> ajdp) {
            Object ajdp2;
            akcr.b(ajdp2, "startButtonHideSignal");
            if (z) {
                ajdp2 = ajdp2.e((ajdt) ajdp.b(Boolean.FALSE));
            }
            akcr.a(ajdp2, "signal");
            return new mfb(ajdp2);
        }

        public static final mfq a(ajdp<mfu> ajdp, ajdu<mfu.b, mfu.b> ajdu, mft mft, zfw zfw) {
            akcr.b(ajdp, "startButtonView");
            akcr.b(ajdu, "viewModelTransformer");
            akcr.b(mft, "useCase");
            akcr.b(zfw, "qualifiedSchedulers");
            return new mfd(ajdp, ajdu, mft, zfw);
        }

        public static final mft a(ajdp<mmt> ajdp, ajdu<b, b> ajdu, kqf kqf) {
            akcr.b(ajdp, "lensCore");
            akcr.b(ajdu, "startButtonResultTransformer");
            akcr.b(kqf, "analyticsEventHandler");
            return new mfg(ajdp, ajdu, kqf);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("StartButton"));
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

    public abstract mfq d();

    public abstract mft e();
}
