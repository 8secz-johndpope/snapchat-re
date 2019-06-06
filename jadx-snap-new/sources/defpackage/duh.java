package defpackage;

import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.common.base.Preconditions;
import com.snap.ui.view.surfaceview.SurfaceViewManager;
import com.snap.ui.view.surfaceview.SurfaceViewManager.SurfaceViewRequest;
import defpackage.absz.a;
import java.util.Set;

/* renamed from: duh */
public class duh {
    public final Set<c> a;
    final zfw b;
    final ilv c;
    protected abta<e> d;
    private final SurfaceViewManager e;
    private final dqg f;
    private final ecv g;
    private final ebh h;
    private final ebw i;
    private gcn j;
    private SurfaceViewRequest k;
    private dqh l = null;

    /* renamed from: duh$h */
    static class h {
        final Surface a;
        final abtl b;

        private h(Surface surface, abtl abtl) {
            this.a = surface;
            this.b = abtl;
        }

        /* synthetic */ h(Surface surface, abtl abtl, byte b) {
            this(surface, abtl);
        }
    }

    /* renamed from: duh$d */
    static class d implements dpn {
        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final adie a(abtl abtl, abtl abtl2) {
            float c = ((float) abtl2.c()) / ((float) abtl2.b());
            float c2 = ((float) abtl.c()) / ((float) abtl.b());
            float f = 1.0f;
            if (c < c2) {
                c2 /= c;
            } else {
                f = c / c2;
                c2 = 1.0f;
            }
            return new adie().b(f, c2);
        }
    }

    /* renamed from: duh$e */
    enum e {
        IDLE,
        REQUESTING_SURFACE,
        HOLDING_SURFACE,
        RELEASING_SURFACE,
        STARTING_STREAM_AFTER_RELEASE
    }

    /* renamed from: duh$a */
    enum a implements defpackage.absz.a<e, absy> {
        START_STREAMING,
        FINISH_RELEASING_SURFACE,
        REQUEST_PREEMPTED
    }

    /* renamed from: duh$i */
    enum i implements a<e, Pair<edj, Boolean>> {
        STOP_STREAMING,
        LOSE_SURFACE_SOON
    }

    /* renamed from: duh$f */
    enum f implements a<e, h> {
        GET_SURFACE,
        UPDATE_SURFACE
    }

    /* renamed from: duh$g */
    class g implements SurfaceViewRequest {
        private g() {
        }

        /* synthetic */ g(duh duh, byte b) {
            this();
        }

        private /* synthetic */ void a() {
            duh.this.d.a(a.REQUEST_PREEMPTED);
        }

        private /* synthetic */ void a(Surface surface, abtl abtl) {
            duh.this.d.b(f.UPDATE_SURFACE, new h(surface, abtl, (byte) 0));
        }

        private /* synthetic */ void a(boolean z) {
            duh.this.d.b(i.LOSE_SURFACE_SOON, new Pair(edj.CLEAR, Boolean.valueOf(z)));
        }

        private /* synthetic */ void b(Surface surface, abtl abtl) {
            duh.this.d.b(f.GET_SURFACE, new h(surface, abtl, (byte) 0));
        }

        public final String getTag() {
            return "CameraViewController";
        }

        public final void onRequestIgnored() {
            duh.this.b.l().a((Runnable) new -$$Lambda$duh$g$8sukK4ddO_Wo4AIHHJbEblWcfss(this));
        }

        public final void onSurfaceChanged(Surface surface, abtl abtl) {
            duh.this.b.l().a((Runnable) new -$$Lambda$duh$g$dcypXlolxOaj8ZtVc6pKspjaUxE(this, surface, abtl));
        }

        public final void onSurfaceGoingToRevoke(boolean z) {
            if (z) {
                duh.this.d.b(i.LOSE_SURFACE_SOON, new Pair(edj.CLEAR, Boolean.valueOf(z)));
            } else {
                duh.this.b.l().a((Runnable) new -$$Lambda$duh$g$2txTZUJld39c9RswwcAHpo16DUY(this, z));
            }
        }

        public final void onSurfaceReady(Surface surface, abtl abtl) {
            -$$Lambda$duh$g$QnriWBsls17daDrlJHnRYKAY2k0 -__lambda_duh_g_qnriwbsls17dadrljhnrykay2k0 = new -$$Lambda$duh$g$QnriWBsls17daDrlJHnRYKAY2k0(this, surface, abtl);
            if (abmr.c()) {
                -__lambda_duh_g_qnriwbsls17dadrljhnrykay2k0.run();
            } else {
                duh.this.b.l().a((Runnable) -__lambda_duh_g_qnriwbsls17dadrljhnrykay2k0);
            }
        }
    }

    /* renamed from: duh$c */
    public interface c {
        void a();

        void a(edk edk);

        void a(edl edl);
    }

    /* renamed from: duh$b */
    class b implements dqh {
        private ebu<Surface> a;
        private final abtl b;

        public b(Surface surface, abtl abtl) {
            this.a = new ebu(surface);
            this.b = abtl;
        }

        private /* synthetic */ void e() {
            duh.this.d.a(a.FINISH_RELEASING_SURFACE);
        }

        public final abtl a() {
            return this.b;
        }

        public final void a(edk edk) {
            for (c a : duh.this.a) {
                a.a(edk);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                duh.this.d.a(a.FINISH_RELEASING_SURFACE);
            } else {
                duh.this.b.l().a((Runnable) new -$$Lambda$duh$b$_cG-yGkPo8x54BV-seS4tv-97J0(this));
            }
        }

        public final void a(edl edl) {
            for (c a : duh.this.a) {
                a.a(edl);
            }
        }

        public final ecu b() {
            return ecv.a(ecw.MAIN, new d());
        }

        public final ebu<?> c() {
            return this.a;
        }

        public final void d() {
            for (c a : duh.this.a) {
                a.a();
            }
            duh.this.c.c(inq.STREAMING_BEGAN, 1);
        }
    }

    public duh(SurfaceViewManager surfaceViewManager, dqg dqg, ecv ecv, ebh ebh, ebw ebw, ilv ilv) {
        this.e = surfaceViewManager;
        this.f = dqg;
        this.g = ecv;
        this.h = ebh;
        this.i = ebw;
        this.b = zgb.a(dnh.f.callsite("CameraViewController"));
        this.c = ilv;
        this.a = new iw();
    }

    private void a(Pair<edj, Boolean> pair, edk edk, idd idd) {
        Preconditions.checkNotNull(this.l);
        this.f.a(this.l, (edj) pair.first, ((Boolean) pair.second).booleanValue(), edk, idd);
    }

    private void a(ebx ebx, gcn gcn) {
        this.h.a(ebx);
        this.j = gcn;
        this.d.b(a.START_STREAMING);
    }

    private void b() {
        this.a.clear();
    }

    private void b(gcn gcn, idd idd) {
        Preconditions.checkNotNull(this.l);
        ebx a = this.h.a();
        dqg dqg = this.f;
        dqh dqh = this.l;
        edi edi = edi.MAIN;
        edg.a aVar = new edg.a();
        aVar.e = Float.valueOf(this.i.a(a == ebx.FRONT_FACING).a - 1.0f);
        dqg.a(dqh, edi, a, aVar, new emq(gcn), idd);
    }

    private /* synthetic */ void b(idd idd) {
        b(this.j, idd.a("startStreaming"));
    }

    private void c() {
        this.e.checkIn(this.k);
        this.e.checkOut(this.k);
    }

    private /* synthetic */ void c(idd idd, Pair pair) {
        a(pair, edk.END, idd.a("stopStreaming"));
    }

    private void d() {
        this.e.checkIn(this.k);
    }

    private void e() {
        this.e.checkOut(this.k);
    }

    private void f() {
    }

    public final ajej a() {
        ajei ajei = new ajei();
        ajei.a(ajek.a(new -$$Lambda$duh$Z3Jc4U0Y8Z-FApY1GO7Lx5e1ur0(this)));
        String str = "CameraViewController";
        idd callsite = dnh.f.callsite(str);
        Object obj = e.IDLE;
        ajei.getClass();
        abta.a a = abta.a(obj, new -$$Lambda$mel42v5AXbZcvAypz7TBWMcjMnk(ajei));
        a.a(e.IDLE, a.START_STREAMING, e.REQUESTING_SURFACE).a(new -$$Lambda$duh$-rgh3i_e7iZUlxbfS6OxTTxvEes(this));
        a.a(e.REQUESTING_SURFACE, a.REQUEST_PREEMPTED, e.IDLE).a(new -$$Lambda$duh$DT__F6I3tvRLK1Sb2kCxA5k1eYc(this));
        a.a(e.REQUESTING_SURFACE, a.START_STREAMING, e.REQUESTING_SURFACE);
        a.a(e.REQUESTING_SURFACE, i.STOP_STREAMING, e.IDLE).a(new -$$Lambda$duh$4wGk9G9jLcUaUV8ncvALizpWCw8(this));
        a.a(e.REQUESTING_SURFACE, f.GET_SURFACE, e.HOLDING_SURFACE).a(new -$$Lambda$duh$bArCxB44k-Jtl_syfbbg9dSIUhA(this, callsite));
        a.a(e.HOLDING_SURFACE, a.START_STREAMING, e.HOLDING_SURFACE).a(new -$$Lambda$duh$3UwHwOgtbh2fjbxmTzEw7nxL7bQ(this, callsite));
        a.a(e.HOLDING_SURFACE, f.UPDATE_SURFACE, e.HOLDING_SURFACE).a(new -$$Lambda$duh$V6OQoqAoXnHZ0Nb8uo_MD2rqruM(this, callsite));
        a.a(e.HOLDING_SURFACE, i.STOP_STREAMING, e.RELEASING_SURFACE).a(new -$$Lambda$duh$YDAwtsY_Xr23f8s_QasQGr0fN2A(this, callsite));
        a.a(e.HOLDING_SURFACE, i.LOSE_SURFACE_SOON, e.RELEASING_SURFACE).a(new -$$Lambda$duh$cpMHlNDWsueyWNe4xFBZV5-6biM(this, callsite));
        a.a(e.RELEASING_SURFACE, i.LOSE_SURFACE_SOON, e.RELEASING_SURFACE).a(new -$$Lambda$duh$WOpD6sWvqlBEc7TbaYCspanmypU(this, callsite));
        a.a(e.RELEASING_SURFACE, a.START_STREAMING, e.STARTING_STREAM_AFTER_RELEASE);
        a.a(e.RELEASING_SURFACE, a.FINISH_RELEASING_SURFACE, e.IDLE).a(new -$$Lambda$duh$4wGk9G9jLcUaUV8ncvALizpWCw8(this));
        a.a(e.STARTING_STREAM_AFTER_RELEASE, a.START_STREAMING, e.STARTING_STREAM_AFTER_RELEASE);
        a.a(e.STARTING_STREAM_AFTER_RELEASE, i.STOP_STREAMING, e.RELEASING_SURFACE);
        a.a(e.STARTING_STREAM_AFTER_RELEASE, a.FINISH_RELEASING_SURFACE, e.REQUESTING_SURFACE).a(new -$$Lambda$duh$lMKa-FLtYJN7HvZnCFNl41Z1OPk(this));
        a.a(Thread.currentThread());
        this.d = a.a(str);
        this.k = new g(this, (byte) 0);
        return ajei;
    }

    public final void a(ebx ebx, idd idd) {
        a(ebx, this.j);
    }

    public final void a(edj edj) {
        this.d.b(i.STOP_STREAMING, new Pair(edj, Boolean.FALSE));
    }

    public final void a(gcn gcn, idd idd) {
        a(this.h.a(), gcn);
    }

    public final void a(idd idd) {
        a(this.h.a(), this.j);
    }
}
