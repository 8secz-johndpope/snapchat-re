package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.base.Optional;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.acup.1;
import defpackage.acup.a;
import defpackage.acxo.e;
import defpackage.acxo.g;
import java.lang.ref.WeakReference;

/* renamed from: aclg */
public final class aclg {
    final acws A;
    final Runnable B = new 1();
    private final acuj C;
    private final String D;
    private final c E;
    private final long F;
    private final addk G;
    private WeakReference<Activity> H;
    private LayoutInflater I;
    private Resources J;
    private acum K;
    public final adbv a;
    public final acxs b;
    public final actz c;
    public final acxj d;
    final adcl e;
    public final aclo f;
    public final acru g;
    public final acpa h;
    final acla i = new acla();
    public final adbe j;
    public final adbr k;
    public final acyc l;
    final boolean m;
    final boolean n;
    final njw o;
    public final zfw p;
    public final Context q;
    public final adce r;
    public final aclj s;
    public final acqi t;
    public ackt u;
    a v;
    public aclc w;
    public Runnable x;
    public final ajei y;
    final acyj z;

    /* renamed from: aclg$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            acmj j = aclg.this.a.j();
            if (j != null) {
                j.h();
            }
        }
    }

    /* renamed from: aclg$a */
    public static class a {
    }

    /* renamed from: aclg$b */
    public class b {
        public final void a() {
            if (aclg.this.u == null) {
                aclg aclg = aclg.this;
                aclg.u = aclg.b();
            }
            if (aclg.this.b != null) {
                acxo acxo = aclg.this.b.a;
                acxo.c.a(acxo.a.a(new e(acxo.e, acxo, acxo.h)));
            }
            aclg.this.o.a(aclg.this.p, aclg.this.y);
        }

        public final void a(acmu acmu, Bundle bundle, acmg acmg) {
            aclg.this.r.a();
            aclg.this.f.b();
            aclg.this.a.a(acmu, bundle, acmg);
            if (aclg.this.u != null) {
                ackt ackt = aclg.this.u;
                adbv adbv = aclg.this.a;
                for (acup acup : ackt.b) {
                    acup.j = new 1(adbv, ackt.c);
                    acup.h = adbv.c.a().f().newLayer(acup.c, acup.b, acup.j);
                }
            }
        }

        public final void b() {
            aclg.this.s.b(false);
            aclg.this.a.g();
            aclg.this.f.k();
            aclg.this.r.a(true);
            aclg.this.r.b();
            if (aclg.this.b != null) {
                acxo acxo = aclg.this.b.a;
                acxo.d.a(new acxo.1());
            }
            ackm e = aclg.this.e();
            if (e != null) {
                e.a = true;
            }
        }

        public final void c() {
            aclg.this.s.b(true);
            aclg.this.a.h();
            aclg.this.e.a();
            aclg.this.f.l();
            aclg.this.r.a(false);
        }

        public final void d() {
            if (!aclg.this.s.c()) {
                c();
            }
            if (aclg.this.u != null) {
                for (acup acup : aclg.this.u.b) {
                    if (acup.j != null) {
                        acup.j.b();
                    }
                }
                aclg.this.u = null;
            }
            aclg.this.g.a(null, null);
            if (aclg.this.b != null) {
                alij alij;
                acxo acxo = aclg.this.b.a;
                synchronized (acxo) {
                    alij = acxo.g;
                }
                if (alij != null) {
                    acxo.c.a(acxo.a.a(new g(acxo.e, alij, acxo.h)));
                }
            }
            aclg.this.e.a();
            aclg.this.y.dispose();
        }

        public final void e() {
            aclg.this.r.a.a();
            aclo aclo = aclg.this.f;
            aclo.G = null;
            aclo.H = null;
            aclg.this.a.l();
            aclg.this.A.a.a(Optional.absent());
            actz actz = aclg.this.c;
            acxj acxj = aclg.this.d;
            acxj.getClass();
            actz.b(new -$$Lambda$jXGzq0CwCh0hAapaH8W7DcxUe7A(acxj));
        }
    }

    /* renamed from: aclg$c */
    public interface c {
        ackt a(aclg aclg, adbv adbv, addk addk, acqi acqi, zfw zfw);
    }

    /* renamed from: aclg$d */
    public enum d {
        BOTTOM(ackj.class),
        TAP_ANIMATION(acta.class),
        CONTENT(ackq.class),
        TOP(acln.class),
        HEATMAP(ackm.class);
        
        public final Class<? extends a> clazz;

        private d(Class<? extends a> cls) {
            this.clazz = cls;
        }
    }

    /* renamed from: aclg$e */
    class e extends adbn {
        private e() {
            super(0);
        }

        /* synthetic */ e(aclg aclg, byte b) {
            this();
        }

        public final void a(acmj acmj) {
            acmj.l();
            acmj.c(aclg.this.m);
            acmj.j();
            acmj.k();
            if (aclg.this.v != null) {
                acmj.a(false);
                acmj.b(false);
            } else if (aclg.this.w != null) {
                aclg.this.w.a(acmj);
            } else {
                if (aclg.this.x != null) {
                    aclg.this.x.run();
                }
            }
        }
    }

    /* renamed from: aclg$f */
    class f extends adbw {
        private acuu a;

        private f() {
        }

        /* synthetic */ f(aclg aclg, byte b) {
            this();
        }

        private void g(acmj acmj) {
            if (aclg.this.u != null) {
                aclg.this.u.a(acmj);
            }
            aclg.this.f.c();
        }

        public final void a() {
            aclg.this.g.a(null, null);
        }

        public final void a(acmj acmj) {
            g(acmj);
        }

        public final boolean a(View view, MotionEvent motionEvent) {
            boolean a = aclg.this.i.a();
            acla acla = aclg.this.i;
            int actionMasked = motionEvent.getActionMasked();
            Boolean bool = actionMasked == 0 ? Boolean.TRUE : null;
            if (actionMasked == 1 || actionMasked == 3) {
                bool = Boolean.FALSE;
                acla.a = System.currentTimeMillis();
            }
            if (bool != null) {
                acla.a(bool.booleanValue());
            }
            if (aclg.this.m) {
                acuu acuu = this.a;
                boolean z = false;
                if (motionEvent.getAction() == 0 && aclg.this.h.a()) {
                    aclg.this.h.a(false);
                }
                if (aclg.this.f.h.d() == null) {
                    float f = 1.0f;
                    float f2 = 0.8f;
                    if (!a && aclg.this.i.a()) {
                        acmj j = aclg.this.a.j();
                        if (j != null && aclg.this.a.e()) {
                            cgi a2 = j.a(motionEvent.getX(), motionEvent.getY());
                            int action = motionEvent.getAction();
                            if (aclg.this.u != null) {
                                Object a3 = aclg.this.u.a(aclg.this.a, a2, action);
                                if (a3 instanceof acuu) {
                                    this.a = (acuu) a3;
                                    aclo aclo = aclg.this.f;
                                    acuu acuu2 = this.a;
                                    if (acuu2.d() != null) {
                                        f = acuu2.d().b(System.currentTimeMillis());
                                    }
                                    acuu2.a(new acuh(f, 0.8f, 100.0f, acun.a));
                                    acuu2.d().a(System.currentTimeMillis());
                                    aclo.r.m();
                                }
                            }
                        }
                    } else if (!(!a || aclg.this.i.a() || this.a == null)) {
                        aclo aclo2 = aclg.this.f;
                        acuu acuu3 = this.a;
                        if (acuu3.d() != null) {
                            f2 = acuu3.d().b(System.currentTimeMillis());
                        }
                        acuu3.a(new acuh(f2, 1.0f, 100.0f, acun.a));
                        acuu3.d().a(System.currentTimeMillis());
                        aclo2.r.m();
                        this.a = null;
                    }
                }
                if (a && !aclg.this.i.a()) {
                    z = true;
                }
                if (z) {
                    aclg.this.g.a(acuu, new PointF(motionEvent.getX(), motionEvent.getY()));
                }
                acmj j2 = aclg.this.a.j();
                if (j2 != null && aclg.this.a.e() && motionEvent.getAction() == 1 && j2.g() != 0.0d) {
                    view.post(aclg.this.B);
                }
            }
            return aclg.this.n ? super.a(view, motionEvent) : true;
        }

        public final void b(acmj acmj) {
            aclg.this.f.I = false;
            g(acmj);
        }

        public final void c(acmj acmj) {
            if (aclg.this.u != null) {
                aclg.this.u.a(acmj);
            }
            aclg.this.f.c();
        }

        public final void e(acmj acmj) {
            g(acmj);
        }

        public final void f(acmj acmj) {
            aclg.this.f.I = true;
        }
    }

    public aclg(Context context, ihh ihh, ide ide, zgb zgb, adcl adcl, adbe adbe, adbr adbr, ajei ajei, njw njw, acru acru, adbv adbv, acxj acxj, actz actz, acyj acyj, adce adce, acuj acuj, aclj aclj, aclo aclo, acyc acyc, acli acli, addk addk, acqi acqi, acmh acmh, acxs acxs, c cVar, acpa.a aVar) {
        adbv adbv2 = adbv;
        acli acli2 = acli;
        this.G = addk;
        this.t = acqi;
        if (acli2.a == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        } else if (acli2.c && !acli2.d) {
            throw new IllegalArgumentException("Touch handling cannot be enabled without Tile Fetching.");
        } else if (acli2.d || acli2.f != null) {
            this.b = acxs;
            this.l = acyc;
            this.q = context;
            this.j = adbe;
            this.k = adbr;
            this.e = adcl;
            this.D = acli2.a;
            this.F = ihh.c();
            this.r = adce;
            this.g = acru;
            this.z = acyj;
            this.c = actz;
            this.C = acuj;
            ide ide2 = ide;
            this.p = zgb.a(ide.callsite("SnapMap"));
            this.a = adbv2;
            this.d = acxj;
            this.s = aclj;
            this.f = aclo;
            this.o = njw;
            this.h = new acpa(aVar);
            this.a.a(new f(this, (byte) 0));
            this.a.a(new e(this, (byte) 0));
            this.m = acli2.c;
            this.n = acli2.b;
            zgb zgb2 = zgb;
            this.A = new acws(zgb, adbv2);
            this.y = ajei;
            this.E = cVar != null ? cVar : new aclh();
            this.a.a.a(acmh);
            this.u = b();
        } else {
            throw new IllegalArgumentException("Custom render ratio provider required when tile fetching is disabled");
        }
    }

    private Optional<Activity> z() {
        WeakReference weakReference = this.H;
        return weakReference == null ? Optional.absent() : Optional.fromNullable(weakReference.get());
    }

    public final adce a() {
        return this.r;
    }

    public final void a(aclc aclc) {
        this.w = aclc;
    }

    public final void a(Activity activity) {
        if (activity != null) {
            this.H = new WeakReference(activity);
        }
    }

    public final void a(String str) {
        this.s.a(str);
    }

    public final void a(boolean z) {
        this.s.a(z);
    }

    /* Access modifiers changed, original: final */
    public final ackt b() {
        c cVar = this.E;
        if (cVar == null) {
            return null;
        }
        return cVar.a(this, this.a, this.G, this.t, this.p);
    }

    public final void b(boolean z) {
        ackm e = e();
        if (e != null) {
            e.c = z;
        }
        this.f.m.a = z;
        this.f.m.b = z;
        this.a.m();
    }

    public final ackj c() {
        ackt ackt = this.u;
        return ackt != null ? (ackj) ackt.a.get(d.BOTTOM) : null;
    }

    public final void c(final boolean z) {
        Runnable 2 = new Runnable() {
            public final void run() {
                acmj j = aclg.this.a.j();
                if (j != null) {
                    if (z) {
                        j.a(true);
                        j.b(true);
                        return;
                    }
                    j.a(false);
                    j.b(false);
                } else if (z) {
                    aclg.this.v = null;
                } else {
                    aclg.this.v = new a();
                }
            }
        };
        if (abmr.c()) {
            2.run();
        } else {
            this.a.a(2);
        }
    }

    public final ackq d() {
        ackt ackt = this.u;
        return ackt != null ? (ackq) ackt.a.get(d.CONTENT) : null;
    }

    public final ackm e() {
        ackt ackt = this.u;
        return ackt != null ? (ackm) ackt.a.get(d.HEATMAP) : null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x002a in {6, 7, 8, 11, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized android.view.LayoutInflater f() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.I;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0023;	 Catch:{ all -> 0x0027 }
        r0 = r2.z();	 Catch:{ all -> 0x0027 }
        r1 = r0.isPresent();	 Catch:{ all -> 0x0027 }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x0027 }
        r0 = r0.get();	 Catch:{ all -> 0x0027 }
        r0 = (android.app.Activity) r0;	 Catch:{ all -> 0x0027 }
        r0 = r0.getLayoutInflater();	 Catch:{ all -> 0x0027 }
        r2.I = r0;	 Catch:{ all -> 0x0027 }
        goto L_0x0023;	 Catch:{ all -> 0x0027 }
        r0 = r2.q;	 Catch:{ all -> 0x0027 }
        r0 = android.view.LayoutInflater.from(r0);	 Catch:{ all -> 0x0027 }
        goto L_0x0019;	 Catch:{ all -> 0x0027 }
        r0 = r2.I;	 Catch:{ all -> 0x0027 }
        monitor-exit(r2);
        return r0;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclg.f():android.view.LayoutInflater");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x002a in {6, 7, 8, 11, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized android.content.res.Resources g() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.J;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0023;	 Catch:{ all -> 0x0027 }
        r0 = r2.z();	 Catch:{ all -> 0x0027 }
        r1 = r0.isPresent();	 Catch:{ all -> 0x0027 }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x0027 }
        r0 = r0.get();	 Catch:{ all -> 0x0027 }
        r0 = (android.app.Activity) r0;	 Catch:{ all -> 0x0027 }
        r0 = r0.getResources();	 Catch:{ all -> 0x0027 }
        r2.J = r0;	 Catch:{ all -> 0x0027 }
        goto L_0x0023;	 Catch:{ all -> 0x0027 }
        r0 = r2.q;	 Catch:{ all -> 0x0027 }
        r0 = r0.getResources();	 Catch:{ all -> 0x0027 }
        goto L_0x0019;	 Catch:{ all -> 0x0027 }
        r0 = r2.J;	 Catch:{ all -> 0x0027 }
        monitor-exit(r2);
        return r0;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclg.g():android.content.res.Resources");
    }

    public final b h() {
        return new b();
    }

    public final acxs i() {
        return this.b;
    }

    public final adbv j() {
        return this.a;
    }

    public final aclo k() {
        return this.f;
    }

    public final acyj l() {
        return this.z;
    }

    public final ackt m() {
        return this.u;
    }

    public final acpa n() {
        return this.h;
    }

    public final String o() {
        return this.s.a();
    }

    public final acru p() {
        return this.g;
    }

    public final adbe q() {
        return this.j;
    }

    public final jwa r() {
        return this.j.b();
    }

    public final ackr s() {
        return this.f.m;
    }

    public final acum t() {
        if (this.K == null) {
            this.K = new acum(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        }
        return this.K;
    }

    public final zfw u() {
        return this.p;
    }

    public final Context v() {
        return this.q;
    }

    public final actz w() {
        return this.c;
    }

    public final acwr x() {
        return this.A;
    }

    public final void y() {
        this.x = null;
    }
}
