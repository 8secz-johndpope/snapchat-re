package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.snap.lenses.camera.snappables.startbutton.DefaultStartButtonView;
import com.snapchat.android.R;
import defpackage.mej.a;
import defpackage.mej.d;
import defpackage.miw.b;
import java.util.Set;

/* renamed from: mdu */
public abstract class mdu implements d, meu.d, mfj.d, mha {

    /* renamed from: mdu$d */
    public interface d {
        ide g();

        zgb h();

        ajdp<mmt> j();

        ajdp<lqf> k();

        miw l();

        kqf m();

        akbl<Context, jn> o();
    }

    /* renamed from: mdu$a */
    public static abstract class a implements mhi<mdu> {
        public d l;

        public abstract a a(ajdp<Boolean> ajdp);

        public abstract a a(ajfb<lwo> ajfb);

        public abstract a a(lpi lpi);

        public abstract a a(d dVar);

        public abstract a a(boolean z);

        public abstract a b(ajdp<ajxw> ajdp);

        public abstract a b(ajfb<lqo> ajfb);

        public abstract a c(ajdp<View> ajdp);

        public abstract a d(ajdp<ViewStub> ajdp);

        public abstract a e(ajdp<View> ajdp);

        public abstract a f(ajdp<ViewGroup> ajdp);
    }

    /* renamed from: mdu$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mdu$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mec a(ajdp<mmt> ajdp, ajdp<lqf> ajdp2) {
            akcr.b(ajdp, "lensCore");
            akcr.b(ajdp2, "cameraLifecycle");
            return new mdp(ajdp, ajdp2);
        }

        public static final mhi<? extends mha> a(ajdp<mmt> ajdp, ajfb<lqo> ajfb, mec mec, zgb zgb, ide ide) {
            akcr.b(ajdp, "lensCore");
            akcr.b(ajfb, "externalControlAppearanceActionConsumer");
            akcr.b(mec, "useCase");
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return new mdg(ajdp, ajfb, mec, zgb.a(ide.callsite("AttachExternalControlAppearanceToSnappables")));
        }

        public static final mhi<? extends mha> a(mdu mdu, ajdp<ViewGroup> ajdp) {
            String str = "parentComponent";
            akcr.b(mdu, "component");
            akcr.b(ajdp, "viewGroupProvider");
            d dVar = mdu;
            akcr.b(dVar, str);
            a c = med.c();
            akcr.b(dVar, str);
            a aVar = c;
            aVar.a(dVar);
            aVar.c = dVar;
            c = c;
            ajdp a = mit.a(R.id.lenses_camera_fullscreen_close_button_view_stub, ajdp);
            akcr.b(a, "viewStub");
            dVar = c.c;
            if (dVar == null) {
                akcr.a(str);
            }
            dVar.f();
            dVar = c.c;
            if (dVar == null) {
                akcr.a(str);
            }
            zfw a2 = zgb.a(dVar.e(), "FullScreenCloseButtonScope#attachToViewStub");
            d dVar2 = c.c;
            if (dVar2 == null) {
                akcr.a(str);
            }
            a = a.a(mit.a((int) R.layout.lenses_camera_fullscreen_close_button_view, mep.class, true, dVar2.g(), false, true)).b((ajdw) a2.l()).c((ajdw) a2.l()).i().a();
            akcr.a((Object) a, "viewStub.compose(\n      …              .refCount()");
            return new mdh(mdu, c.a(a));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x007c in {5, 8, 9, 12, 13, 15} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public static final defpackage.mhi<? extends defpackage.mha> a(defpackage.mdu r3, defpackage.ajdp<android.view.View> r4, boolean r5) {
            /*
            r0 = "parentComponent";
            r1 = "component";
            defpackage.akcr.b(r3, r1);
            r1 = "view";
            defpackage.akcr.b(r4, r1);
            if (r5 == 0) goto L_0x0076;
            r3 = (defpackage.meu.d) r3;	 Catch:{ all -> 0x007a }
            defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x007a }
            r5 = defpackage.meq.c();	 Catch:{ all -> 0x007a }
            defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x007a }
            r2 = r5;	 Catch:{ all -> 0x007a }
            r2 = (defpackage.meu.a) r2;	 Catch:{ all -> 0x007a }
            r2.a(r3);	 Catch:{ all -> 0x007a }
            r2.c = r3;	 Catch:{ all -> 0x007a }
            r5 = (defpackage.meu.a) r5;	 Catch:{ all -> 0x007a }
            defpackage.akcr.b(r4, r1);	 Catch:{ all -> 0x007a }
            r3 = r5.c;	 Catch:{ all -> 0x007a }
            if (r3 != 0) goto L_0x002e;	 Catch:{ all -> 0x007a }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x007a }
            r3.f();	 Catch:{ all -> 0x007a }
            r3 = r5.c;	 Catch:{ all -> 0x007a }
            if (r3 != 0) goto L_0x0038;	 Catch:{ all -> 0x007a }
            defpackage.akcr.a(r0);	 Catch:{ all -> 0x007a }
            r3 = r3.e();	 Catch:{ all -> 0x007a }
            r0 = "LoadingOverlayComponent#attachToViewStub";	 Catch:{ all -> 0x007a }
            r3 = defpackage.zgb.a(r3, r0);	 Catch:{ all -> 0x007a }
            r0 = defpackage.meu.a.a.a;	 Catch:{ all -> 0x007a }
            r0 = (defpackage.ajfc) r0;	 Catch:{ all -> 0x007a }
            r4 = r4.p(r0);	 Catch:{ all -> 0x007a }
            r0 = r3.l();	 Catch:{ all -> 0x007a }
            r0 = (defpackage.zfr) r0;	 Catch:{ all -> 0x007a }
            r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x007a }
            r4 = r4.b(r0);	 Catch:{ all -> 0x007a }
            r3 = r3.l();	 Catch:{ all -> 0x007a }
            r3 = (defpackage.zfr) r3;	 Catch:{ all -> 0x007a }
            r3 = (defpackage.ajdw) r3;	 Catch:{ all -> 0x007a }
            r3 = r4.c(r3);	 Catch:{ all -> 0x007a }
            r3 = r3.i();	 Catch:{ all -> 0x007a }
            r3 = r3.a();	 Catch:{ all -> 0x007a }
            r4 = "view.map<LoadingOverlayV…              .refCount()";	 Catch:{ all -> 0x007a }
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x007a }
            r3 = r5.a(r3);	 Catch:{ all -> 0x007a }
            r3 = (defpackage.mhi) r3;	 Catch:{ all -> 0x007a }
            goto L_0x0079;	 Catch:{ all -> 0x007a }
            r3 = defpackage.mhc.a;	 Catch:{ all -> 0x007a }
            goto L_0x0073;
            return r3;
            r3 = move-exception;
            throw r3;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mdu$c.a(mdu, ajdp, boolean):mhi");
        }

        public static final mhi<? extends mha> a(mdu mdu, ajfb<lwo> ajfb) {
            akcr.b(mdu, "component");
            akcr.b(ajfb, "captureActionConsumer");
            return new mdn(mdu, ajfb);
        }

        public static final mhi<? extends mha> a(mdu mdu, lpi lpi) {
            akcr.b(mdu, "component");
            akcr.b(lpi, "backPressInteractor");
            return new mdf(mdu, lpi);
        }

        public static final mhi<? extends mha> a(mdu mdu, boolean z, ajdp<ViewStub> ajdp, ajdp<View> ajdp2, ajdp<ajxw> ajdp3, ajdp<Boolean> ajdp4) {
            ajdp ajdp32;
            String str = "parentComponent";
            akcr.b(mdu, "component");
            akcr.b(ajdp, "startButtonStub");
            akcr.b(ajdp2, "dispatchScrollsTo");
            akcr.b(ajdp32, "startButtonLoadingSignal");
            akcr.b(ajdp4, "startButtonHideSignal");
            mfj.d dVar = mdu;
            akcr.b(dVar, str);
            mfj.a c = mfc.c();
            akcr.b(dVar, str);
            mfj.a aVar = c;
            aVar.a(dVar);
            aVar.e = dVar;
            mfj.a a = c.a(z).a((ajdp) ajdp4);
            akcr.b(ajdp2, "target");
            a.f = ajdp2;
            a = a;
            akcr.b(ajdp, "viewStub");
            mfj.d dVar2 = a.e;
            if (dVar2 == null) {
                akcr.a(str);
            }
            dVar2.f();
            dVar2 = a.e;
            if (dVar2 == null) {
                akcr.a(str);
            }
            zfw a2 = zgb.a(dVar2.e(), "StartButtonComponent#attachToViewStub");
            dVar = a.e;
            if (dVar == null) {
                akcr.a(str);
            }
            Object a3 = ajdp.a(mit.a((int) R.layout.lenses_camera_start_button_view, DefaultStartButtonView.class, true, dVar.g(), false, true)).b((ajdw) a2.l()).c((ajdw) a2.l()).i().a().a((ajdw) a2.l());
            akcr.a(a3, "viewProvider");
            Object b = a3.b((ajdt) a.f, (ajex) new mfj.a.a());
            akcr.a(b, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
            a3 = b.i((ajdt) a3);
            akcr.a(a3, "viewProvider\n           …itchIfEmpty(viewProvider)");
            a3 = a3.a(mfu.class);
            akcr.a(a3, "cast(R::class.java)");
            mfj.a b2 = a.b(a3);
            if (!z) {
                ajdp32 = ajvo.a(ajot.a);
                akcr.a((Object) ajdp32, "Observable.empty()");
            }
            return new mdk(mdu, b2, ajdp32);
        }
    }

    /* renamed from: mdu$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mdu a;

        e(mdu mdu) {
            this.a = mdu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            if (bool.booleanValue()) {
                return mhb.a(this.a.k());
            }
            obj = ajvo.a(ajot.a);
            akcr.a(obj, "Observable.empty()");
            return obj;
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
        Object u = j().a(b.a.a).a(mja.SNAPPABLE_LENSES_ENABLED).c(1).u(new e(this));
        akcr.a(u, "configurationRepository\n…      }\n                }");
        return u;
    }

    public abstract mec i();

    public abstract miw j();

    public abstract Set<mhi<? extends mha>> k();
}
