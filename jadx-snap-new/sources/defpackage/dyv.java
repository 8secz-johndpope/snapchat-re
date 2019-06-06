package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import android.widget.Toast;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.absc.a;
import defpackage.dpa.b;
import defpackage.dpa.c;
import defpackage.dvs.1;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: dyv */
public final class dyv extends abms implements OnFrameAvailableListener {
    final abre A;
    final boolean B;
    private final abss D;
    private long E;
    private dqo F;
    private final Supplier<dyu> G;
    private SurfaceTexture H;
    private float I;
    private final long J;
    final doo a;
    final jwa b;
    final aipn<ebf> c;
    final dzb d;
    final adhk e;
    final ecv f;
    final gqr g;
    final dpf h;
    final float[] i;
    final dyz j;
    final dvm k;
    long l;
    ecz m;
    dys n;
    int o;
    public dym p;
    public Surface q;
    dxz r;
    abtl s;
    Map<Object, dvl> t;
    boolean u;
    boolean v;
    public boolean w;
    boolean x;
    boolean y;
    final dny z;

    /* renamed from: dyv$1 */
    class 1 implements Supplier<dyu> {
        1() {
        }

        public final /* synthetic */ Object get() {
            return new dyu();
        }
    }

    /* renamed from: dyv$11 */
    class 11 implements a {
        11() {
        }

        public final void a() {
            dyv dyv = dyv.this;
            if (dyv.m == ecz.NOT_SET_UP) {
                if (dyv.r == null) {
                    dyv.r = new dxz(dyv.e);
                    if (dyv.B) {
                        dyv.r.a();
                    }
                    dyv.o = dxz.d();
                }
                dyv.h();
                dyv.a(ecz.SURFACE_CREATED, ech.createSurfaceTexture);
            }
        }
    }

    /* renamed from: dyv$17 */
    class 17 implements a {
        17() {
        }

        public final void a() {
            dyv dyv = dyv.this;
            if (dyv.m == ecz.SURFACE_CREATED) {
                if (dyv.r == null) {
                    dyv.r = new dxz(dyv.e);
                    if (dyv.B) {
                        dyv.r.a();
                    }
                }
                if (!dyv.B) {
                    dyv.r.a();
                }
                if (dyv.n == null) {
                    dyv.n = new dys(dyv.c, dyv.d, dyv.g, dyv.h.r(), a.a, dyv.A, dyv.e);
                    dys dys = dyv.n;
                    ((ebf) dys.a.get()).a();
                    dys.f = 1;
                }
                if (dyv.t == null) {
                    dyv.t = new LinkedHashMap();
                }
                dyv.a(ecz.SET_UP, ech.setUp);
            }
        }
    }

    /* renamed from: dyv$b */
    public enum b {
        ;

        static {
            a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* renamed from: dyv$a */
    interface a {
        void a();
    }

    /* renamed from: dyv$4 */
    class 4 implements a {
        4() {
        }

        public final void a() {
            dyv dyv = dyv.this;
            dys dys = dyv.n;
            if (dys != null) {
                try {
                    ((ebf) dys.a.get()).d();
                } catch (dxx e) {
                    dyv.g.a(gqt.NORMAL, e, dnj.a.callsite("CameraFrameDispatcher").a("onEndPreviewFramesInternal"));
                }
            }
            dyv.removeMessages(10);
        }
    }

    /* renamed from: dyv$10 */
    class 10 implements a {
        10() {
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
        public final void a() {
            /*
            r12 = this;
            r0 = defpackage.dyv.this;
            r1 = r0.m;
            r2 = defpackage.ecz.SET_UP;
            if (r1 != r2) goto L_0x00f3;
        L_0x0008:
            r1 = r0.t;	 Catch:{ all -> 0x00ea }
            if (r1 == 0) goto L_0x0041;
        L_0x000c:
            r1 = r0.t;	 Catch:{ all -> 0x00ea }
            r1 = r1.values();	 Catch:{ all -> 0x00ea }
            r1 = r1.iterator();	 Catch:{ all -> 0x00ea }
        L_0x0016:
            r2 = r1.hasNext();	 Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x0041;
        L_0x001c:
            r2 = r1.next();	 Catch:{ all -> 0x00ea }
            r2 = (defpackage.dvl) r2;	 Catch:{ all -> 0x00ea }
            r3 = r0.n;	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r4 = r0.r;	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r5 = r0.i;	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r6 = r0.o;	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r7 = r0.l;	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r9 = r0.j;	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r10 = r0.l;	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r9 = r9.a(r10);	 Catch:{ dxx -> 0x0038, all -> 0x003c }
            r11 = r2;
            r3.a(r4, r5, r6, r7, r9, r11);	 Catch:{ dxx -> 0x0038, all -> 0x003c }
        L_0x0038:
            r2.a();	 Catch:{ all -> 0x00ea }
            goto L_0x0016;
        L_0x003c:
            r1 = move-exception;
            r2.a();	 Catch:{ all -> 0x00ea }
            throw r1;	 Catch:{ all -> 0x00ea }
        L_0x0041:
            r0.i();	 Catch:{ all -> 0x00ea }
            r1 = r0.r;	 Catch:{ all -> 0x00ea }
            if (r1 == 0) goto L_0x0050;
        L_0x0048:
            r1 = r0.o;	 Catch:{ dxx -> 0x004d }
            defpackage.dxz.a(r1);	 Catch:{ dxx -> 0x004d }
        L_0x004d:
            r1 = -1;
            r0.o = r1;	 Catch:{ all -> 0x00ea }
        L_0x0050:
            r1 = 0;
            r0.s = r1;	 Catch:{ all -> 0x00ea }
            r2 = r0.t;	 Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x0090;
        L_0x0057:
            r2 = r0.t;	 Catch:{ all -> 0x00ea }
            r2 = r2.values();	 Catch:{ all -> 0x00ea }
            r2 = r2.iterator();	 Catch:{ all -> 0x00ea }
        L_0x0061:
            r3 = r2.hasNext();	 Catch:{ all -> 0x00ea }
            if (r3 == 0) goto L_0x0089;
        L_0x0067:
            r3 = r2.next();	 Catch:{ all -> 0x00ea }
            r3 = (defpackage.dvl) r3;	 Catch:{ all -> 0x00ea }
            r3.b();	 Catch:{ all -> 0x00ea }
            r4 = r0.a;	 Catch:{ all -> 0x00ea }
            r3 = r3.c;	 Catch:{ all -> 0x00ea }
            r3 = r3.a;	 Catch:{ all -> 0x00ea }
            if (r3 == 0) goto L_0x0061;
        L_0x0078:
            r5 = r4.b;	 Catch:{ all -> 0x00ea }
            r5 = r5.get();	 Catch:{ all -> 0x00ea }
            r5 = (android.os.Handler) r5;	 Catch:{ all -> 0x00ea }
            r6 = new doo$4;	 Catch:{ all -> 0x00ea }
            r6.<init>(r3);	 Catch:{ all -> 0x00ea }
            r5.post(r6);	 Catch:{ all -> 0x00ea }
            goto L_0x0061;
        L_0x0089:
            r2 = r0.t;	 Catch:{ all -> 0x00ea }
            r2.clear();	 Catch:{ all -> 0x00ea }
            r0.t = r1;	 Catch:{ all -> 0x00ea }
        L_0x0090:
            r2 = r0.r;	 Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x0099;
        L_0x0094:
            r2 = r0.r;	 Catch:{ all -> 0x00ea }
            r2.b();	 Catch:{ all -> 0x00ea }
        L_0x0099:
            r2 = r0.n;	 Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x00d4;
        L_0x009d:
            r2 = r0.n;	 Catch:{ all -> 0x00ea }
            r3 = r2.a;	 Catch:{ all -> 0x00ea }
            r3 = r3.get();	 Catch:{ all -> 0x00ea }
            r3 = (defpackage.ebf) r3;	 Catch:{ all -> 0x00ea }
            r3.b();	 Catch:{ all -> 0x00ea }
            r3 = r2.c;	 Catch:{ all -> 0x00ea }
            r4 = r3.g;	 Catch:{ adjz -> 0x00cd }
            if (r4 == 0) goto L_0x00b7;
        L_0x00b0:
            r4 = r3.g;	 Catch:{ adjz -> 0x00cd }
            r4.e();	 Catch:{ adjz -> 0x00cd }
            r3.g = r1;	 Catch:{ adjz -> 0x00cd }
        L_0x00b7:
            r4 = r3.h;	 Catch:{ adjz -> 0x00cd }
            if (r4 == 0) goto L_0x00c2;
        L_0x00bb:
            r4 = r3.h;	 Catch:{ adjz -> 0x00cd }
            r4.e();	 Catch:{ adjz -> 0x00cd }
            r3.h = r1;	 Catch:{ adjz -> 0x00cd }
        L_0x00c2:
            r3.b();	 Catch:{ all -> 0x00ea }
            r2 = r2.b;	 Catch:{ all -> 0x00ea }
            r2.f();	 Catch:{ all -> 0x00ea }
            r0.n = r1;	 Catch:{ all -> 0x00ea }
            goto L_0x00d4;
        L_0x00cd:
            r1 = move-exception;
            r2 = new dxx;	 Catch:{ all -> 0x00ea }
            r2.<init>(r1);	 Catch:{ all -> 0x00ea }
            throw r2;	 Catch:{ all -> 0x00ea }
        L_0x00d4:
            r2 = r0.r;	 Catch:{ all -> 0x00ea }
            if (r2 == 0) goto L_0x00df;
        L_0x00d8:
            r2 = r0.r;	 Catch:{ all -> 0x00ea }
            r2.c();	 Catch:{ all -> 0x00ea }
            r0.r = r1;	 Catch:{ all -> 0x00ea }
        L_0x00df:
            r1 = 0;
            r0.u = r1;	 Catch:{ all -> 0x00ea }
            r1 = defpackage.ecz.NOT_SET_UP;
            r2 = defpackage.ech.cleanUp;
            r0.a(r1, r2);
            return;
        L_0x00ea:
            r1 = move-exception;
            r2 = defpackage.ecz.NOT_SET_UP;
            r3 = defpackage.ech.cleanUp;
            r0.a(r2, r3);
            throw r1;
        L_0x00f3:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dyv$10.a():void");
        }
    }

    /* renamed from: dyv$16 */
    static /* synthetic */ class 16 {
        static final /* synthetic */ int[] a = new int[b.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.dpa.b.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.dpa.b.SCREENSHOT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.dpa.b.SCREENSHOT_PLUS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.dpa.b.POST_PROCESS_SCREENSHOT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dyv$16.<clinit>():void");
        }
    }

    /* renamed from: dyv$14 */
    class 14 implements dvk.a {
        14() {
        }

        public final void a(dvl dvl) {
            dyv.this.n.a(dyv.this.r, dyv.this.i, dyv.this.o, dyv.this.l, dyv.this.j.a(dyv.this.l), Collections.singleton(dvl), dyv.this.w, dyv.this.v, dyv.this.x, true);
        }
    }

    /* renamed from: dyv$c */
    static class c {
        static final Pattern a = Pattern.compile("\\beglCreateWindowSurface\\b.+\\bEGL_BAD_ALLOC\\b");
    }

    /* renamed from: dyv$15 */
    class 15 implements a {
        15() {
        }

        public final void a() {
            dyv.this.onFrameAvailable(null);
            dyv.this.j();
        }
    }

    public dyv(Looper looper, jwa jwa, aipn<ebf> aipn, dzb dzb, dny dny, abre abre, adhk adhk, gqr gqr, abss abss, dvm dvm) {
        this(looper, jwa, aipn, dzb, dny, abre, new ecv(), adhk, gqr, abss, dvm);
    }

    private dyv(Looper looper, jwa jwa, aipn<ebf> aipn, dzb dzb, dny dny, abre abre, ecv ecv, adhk adhk, gqr gqr, abss abss, dvm dvm) {
        this(looper, jwa, aipn, dzb, ecv, gqr, (dqo) dqp.a.get(), dpg.a(), new dyz(), dny, abre, adhk, abss, dvm);
    }

    private dyv(Looper looper, jwa jwa, aipn<ebf> aipn, dzb dzb, ecv ecv, gqr gqr, dqo dqo, dpf dpf, dyz dyz, dny dny, abre abre, adhk adhk, abss abss, dvm dvm) {
        super(looper);
        this.E = 0;
        this.i = new float[16];
        this.G = Suppliers.memoize(new 1());
        this.m = ecz.INVALID;
        this.w = false;
        this.x = false;
        this.I = MapboxConstants.MINIMUM_ZOOM;
        this.y = false;
        this.b = jwa;
        this.c = aipn;
        this.d = dzb;
        this.f = ecv;
        this.g = gqr;
        this.F = dqo;
        this.h = dpf;
        this.k = dvm;
        this.m = ecz.NOT_SET_UP;
        this.j = dyz;
        this.z = dny;
        this.J = TimeUnit.SECONDS.toMillis(1) / 60;
        this.y = false;
        this.a = doo.a();
        this.A = abre;
        this.e = adhk;
        this.D = abss;
        this.B = dpf.av();
    }

    static /* synthetic */ void a(dyv dyv, Object obj, doz doz, ecu ecu, dov dov, abtl abtl) {
        StringBuilder stringBuilder;
        if (dyv.m != ecz.SET_UP) {
            doo doo = dyv.a;
            stringBuilder = new StringBuilder("invalid state ");
            stringBuilder.append(dyv.m);
            doo.b(doz, stringBuilder.toString());
        } else if (dyv.s == null) {
            stringBuilder = new StringBuilder("empty resolution. current state ");
            stringBuilder.append(dyv.m);
            dyv.g.a(gqt.HIGH, new IllegalStateException(stringBuilder.toString()), dnj.a.callsite("CameraFrameDispatcher").a("registerSurfaceInternal"));
            dyv.a.b(doz, "empty surface resolution");
        } else {
            dvl dvl = (dvl) dyv.t.get(obj);
            if (dvl != null) {
                if (abtl == null || dvl.b.a().equals(abtl)) {
                    Looper looper = ecu.h;
                    Object obj2 = (dvl.e != null ? dvl.e.getLooper() != looper : looper != null) ? null : 1;
                    if (obj2 != null) {
                        dvl.a();
                        ecu.d.a(dyv.s, dvl.b.a());
                        dyv.t.put(obj, new dvl(dvl.b, ecu, dov));
                        dyv.a.a(doz, "surface already registered");
                        dyv.v = dyv.l();
                        dyv.x = dyv.m();
                        return;
                    }
                }
                dyv.t.remove(obj);
                dvl.a();
                dvl.b();
            }
            try {
                dya dxw;
                if (obj instanceof Surface) {
                    Surface surface = (Surface) obj;
                    if (!surface.isValid()) {
                        doo.a().b(doz, "Surface is destroyed");
                        return;
                    } else if (ecu.h != null) {
                        dxz dxz = dyv.r;
                        dxw = new dxw(surface, new dyc(dqt.a().b(), new adhi(dxz.b), dxz.a.a.a), (byte) 0);
                    } else {
                        dxw = dyv.r.a(surface);
                    }
                } else if (obj instanceof SurfaceTexture) {
                    dxw = new dxw((SurfaceTexture) obj, dyv.r.a);
                } else {
                    throw new IllegalArgumentException("illegal surface object type");
                }
                ecu.d.a(dyv.s, dxw.a());
                final dvl dvl2 = new dvl(dxw, ecu, dov);
                if (obj instanceof Surface) {
                    dvl2.a(new Runnable() {
                        private boolean a = false;

                        public final void run() {
                            if (!this.a) {
                                this.a = true;
                                dyv.this.z.a(abmb.FIRST_PREVIEW_FRAME_RENDERED);
                                abmb.FIRST_PREVIEW_FRAME_RENDERED.name();
                                zgo.b();
                                dvl2.a(null);
                            }
                        }
                    });
                }
                dyv.t.put(obj, dvl2);
                dyv.n.a(dyv.t.values());
                dyv.a.a(doz, "succeeded to register surfaceTexture");
                dyv.v = dyv.l();
                dyv.x = dyv.m();
            } catch (dxx e) {
                if (dyv.D.f() && c.a.matcher(e.getMessage()).find()) {
                    ((dyu) dyv.G.get()).a.set(true);
                    Toast.makeText(AppContext.get(), "Looks like camera OOM. Do you see a black screen? Are you in background? Please S2R and describe what you did and what you see! :)", 1).show();
                    dyv.a.b(doz, Log.getStackTraceString(e));
                    return;
                }
                dyv.a.b(doz, Log.getStackTraceString(e));
                throw e;
            }
        }
    }

    static /* synthetic */ void a(dyv dyv, Object obj, dpc dpc, edj edj) {
        try {
            doo doo;
            if (dyv.m != ecz.SET_UP) {
                doo = dyv.a;
                StringBuilder stringBuilder = new StringBuilder("invalid state ");
                stringBuilder.append(dyv.m);
                doo.a(dpc, stringBuilder.toString());
                return;
            }
            ebt ebt = null;
            if (dyv.t != null) {
                if (dyv.t.containsKey(obj)) {
                    dvl dvl = (dvl) dyv.t.get(obj);
                    if (dvl == null) {
                        dyv.a.a(dpc, "surface object not found.", null);
                        return;
                    }
                    if (edj == edj.CLEAR) {
                        dyv.n.a(dyv.r, dyv.i, dyv.o, dyv.l, dyv.j.a(dyv.l), dvl);
                    }
                    dyv.t.remove(obj);
                    dvl.a();
                    dvl.b();
                    dyv.n.a(dyv.t.values());
                    doo = dyv.a;
                    String str = "done release egl resources of the surface object.";
                    if (dvl.a.g) {
                        ebt = dvl.d;
                    }
                    doo.a(dpc, str, ebt);
                    if (dyv.r != null) {
                        dyv.r.b();
                    }
                    dyv.v = dyv.l();
                    dyv.x = dyv.m();
                    return;
                }
            }
            dyv.a.a(dpc, "surface object not registered.", null);
        } catch (dxx e) {
            doo doo2 = dyv.a;
            StringBuilder stringBuilder2 = new StringBuilder("Exception thrown ");
            stringBuilder2.append(dyv.m);
            stringBuilder2.append(". Exception: ");
            stringBuilder2.append(e.getMessage());
            doo2.a(dpc, stringBuilder2.toString());
            throw e;
        }
    }

    private boolean l() {
        Map map = this.t;
        if (map != null) {
            for (dvl dvl : map.values()) {
                if (dvl.a.a == ecw.VIDEO_CHAT_PREVIEW) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean m() {
        Map map = this.t;
        if (map != null) {
            for (dvl dvl : map.values()) {
                if (dvl.a.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(final float f) {
        obtainMessage(12, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                float f = f;
                if (dyv.m == ecz.SET_UP) {
                    dys dys = dyv.n;
                    if (f < MapboxConstants.MINIMUM_ZOOM || f > 1.0f) {
                        throw new IllegalArgumentException("invalid zoom percentage: ".concat(String.valueOf(f)));
                    }
                    f = (f * 3.0f) + 1.0f;
                    dys.d = f;
                    dys.g = dys.a(f, dys.e);
                }
            }
        }).sendToTarget();
    }

    public final void a(final int i) {
        obtainMessage(6, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                int i = i;
                if (dyv.m == ecz.SET_UP) {
                    dyv.n.f = i;
                }
            }
        }).sendToTarget();
    }

    public final void a(final abtl abtl, final abtl abtl2, final boolean z) {
        obtainMessage(2, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                abtl abtl = abtl;
                abtl abtl2 = abtl2;
                boolean z = z;
                if (dyv.m == ecz.SET_UP || dyv.m == ecz.SURFACE_CREATED) {
                    if (z) {
                        dyv.p.a(abtl.b(), abtl.c());
                    }
                    dyv.s = abtl2;
                }
            }
        }).sendToTarget();
    }

    public final void a(abtl abtl, b bVar, c cVar, boolean z, int i, int i2, dpa dpa) {
        final abtl abtl2 = abtl;
        final b bVar2 = bVar;
        final c cVar2 = cVar;
        final boolean z2 = z;
        final int i3 = i;
        final int i4 = i2;
        final dpa dpa2 = dpa;
        obtainMessage(14, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                abtl abtl = abtl2;
                b bVar = bVar2;
                c cVar = cVar2;
                boolean z = z2;
                int i = i3;
                int i2 = i4;
                dpa dpa = dpa2;
                if (dyv.m != ecz.SET_UP) {
                    doo doo = dyv.a;
                    dpa.a aVar = dpa.a.INVALID_STATE;
                    StringBuilder stringBuilder = new StringBuilder("Invalid frame dispatcher state: ");
                    stringBuilder.append(dyv.m);
                    doo.a(dpa, aVar, stringBuilder.toString(), false, 0, b.SCREENSHOT);
                    return;
                }
                int i3 = 16.a[bVar.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    int c;
                    ecw ecw;
                    adie adie = new adie();
                    if (z) {
                        adie = adie.d();
                    }
                    System.currentTimeMillis();
                    dvs dvs = new dvs(dyv.b, dyv.e);
                    dxz dxz = dyv.r;
                    abtl abtl2 = dyv.s;
                    dpf dpf = dyv.h;
                    ecv ecv = dyv.f;
                    dny dny = dyv.z;
                    14 14 = new 14();
                    dvs.g = i2;
                    dvs.f = i;
                    dvs.m = adie;
                    dvs.n = dxz;
                    dvs.p = abtl2;
                    dvs.q = ecv;
                    dvs.c = dny;
                    dvs.r = 14;
                    if (i == 0 || i == 180) {
                        dvs.d = abtl.b();
                        c = abtl.c();
                    } else {
                        dvs.d = abtl.c();
                        c = abtl.b();
                    }
                    dvs.e = c;
                    Object obj = (bVar != b.SCREENSHOT_PLUS && dpf.s() && i2 == -1 && dpf.P()) ? 1 : null;
                    Object obj2 = (!dpf.P() || dpf.C()) ? 1 : null;
                    i3 = 1.a[bVar.ordinal()];
                    if (i3 == 1) {
                        ecw = ecw.SCREENSHOT;
                    } else if (i3 == 2) {
                        ecw = ecw.SCREENSHOT_PLUS;
                    } else {
                        throw new IllegalArgumentException("unacceptable method: ".concat(String.valueOf(bVar)));
                    }
                    dvs.l = ecw;
                    long currentTimeMillis = System.currentTimeMillis();
                    dvk dvu = obj != null ? new dvu(dvs.a) : obj2 != null ? new dvw(dvs.a, dvs.b) : new dvy(dvs.a, dvs.b);
                    dvs.o = dvu;
                    abtl abtl3 = abtl;
                    dvs.o.a(dvs.d, dvs.e, dvs.g, dvs.f, dvs.m.clone(), dvs.n, dvs.r);
                    dvs.h = System.currentTimeMillis() - currentTimeMillis;
                    dvs.a();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    dvs.o.c();
                    kaz d = dvs.o.d();
                    if ((d == null || d.isDisposed()) && dvs.o.e() == dvs.a.IMAGE_READER) {
                        dvs.o.f();
                        dvs.o = new dvy(dvs.a, dvs.b);
                        dvs.o.a(dvs.d, dvs.e, dvs.g, dvs.f, dvs.m.clone(), dvs.n, dvs.r);
                        dvs.a();
                        dvs.o.c();
                        dvs.k = true;
                        d = dvs.o.d();
                    }
                    dvs.i = System.currentTimeMillis() - currentTimeMillis2;
                    dyv.a.a(dpa, new dwb(cVar, d, dyv.b).a(), null, "success", System.currentTimeMillis(), z, i, bVar);
                    dvs.b();
                    long currentTimeMillis3 = System.currentTimeMillis();
                    dvs.o.f();
                    dvs.j = System.currentTimeMillis() - currentTimeMillis3;
                    dvs.b();
                    dvs.k = false;
                    System.currentTimeMillis();
                    abtl3.e();
                    abtl3.d();
                } else if (i3 == 3) {
                    ((ebf) dyv.n.a.get()).a(dpa);
                } else {
                    throw new IllegalArgumentException("illegal take picture method ".concat(String.valueOf(bVar)));
                }
            }
        }).sendToTarget();
    }

    public final void a(final SurfaceTexture surfaceTexture, final dpc dpc, final edj edj) {
        obtainMessage(7, new a() {
            public final void a() {
                dyv.a(dyv.this, surfaceTexture, dpc, edj);
            }
        }).sendToTarget();
    }

    public final void a(SurfaceTexture surfaceTexture, ecu ecu, dov dov, doz doz, abtl abtl) {
        final SurfaceTexture surfaceTexture2 = surfaceTexture;
        final doz doz2 = doz;
        final ecu ecu2 = ecu;
        final dov dov2 = dov;
        final abtl abtl2 = abtl;
        obtainMessage(5, new a() {
            public final void a() {
                dyv.a(dyv.this, surfaceTexture2, doz2, ecu2, dov2, abtl2);
            }
        }).sendToTarget();
    }

    public final void a(final Surface surface, final dpc dpc, final edj edj) {
        obtainMessage(7, new a() {
            public final void a() {
                dyv.a(dyv.this, surface, dpc, edj);
            }
        }).sendToTarget();
    }

    public final void a(Surface surface, ecu ecu, dov dov, doz doz, abtl abtl) {
        final Surface surface2 = surface;
        final doz doz2 = doz;
        final ecu ecu2 = ecu;
        final dov dov2 = dov;
        final abtl abtl2 = abtl;
        obtainMessage(5, new a() {
            public final void a() {
                dyv.a(dyv.this, surface2, doz2, ecu2, dov2, abtl2);
            }
        }).sendToTarget();
    }

    public final void a(final dou dou) {
        obtainMessage(11, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                dyv.k.a(dou);
            }
        }).sendToTarget();
    }

    public final void a(final eca eca) {
        obtainMessage(3, new a() {
            public final void a() {
                boolean z = eca == eca.ARCORE;
                if (dyv.this.y != z) {
                    dyv.this.i();
                    dyv dyv = dyv.this;
                    dyv.y = z;
                    dyv.h();
                }
            }
        }).sendToTarget();
    }

    /* Access modifiers changed, original: final */
    public final void a(ecz ecz, ech ech) {
        ecz ecz2 = this.m;
        this.m = ecz;
        try {
            dpi.a().a(new eco(System.currentTimeMillis(), edm.CameraFrameDispatcher, ecg.valueOf(ecz2.name()), ecg.valueOf(ecz.name()), ech, null));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void a(final edf edf) {
        obtainMessage(4, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                edf edf = edf;
                if (dyv.m != ecz.SET_UP) {
                    return;
                }
                if (dyv.s != null) {
                    try {
                        dyv.n.a(edf);
                    } catch (dxx e) {
                        dyv.g.a(gqt.NORMAL, e, dnj.a.callsite("CameraFrameDispatcher").a("onCameraChangedInternal"));
                    }
                    if (dyv.t != null) {
                        for (dvl dvl : dyv.t.values()) {
                            dvl.a.d.a(dyv.s, dvl.b.a());
                        }
                    }
                    dyv.j.a = false;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("empty resolution. current state ");
                stringBuilder.append(dyv.m);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }).sendToTarget();
    }

    public final void a(final List<dou> list) {
        obtainMessage(8, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                for (dou a : list) {
                    dyv.k.a(a);
                }
                if (dyv.y) {
                    dyv.j();
                }
            }
        }).sendToTarget();
    }

    public final void b(final float f) {
        obtainMessage(13, new a() {
            public final void a() {
                dys dys = dyv.this.n;
                float f = f * 2.0f;
                dys.e = f;
                dys.g = dys.a(dys.d, f);
            }
        }).sendToTarget();
    }

    public final void b(final dou dou) {
        obtainMessage(11, new a() {
            public final void a() {
                dyv dyv = dyv.this;
                dyv.k.b(dou);
            }
        }).sendToTarget();
    }

    public final abov c() {
        return (abov) this.G.get();
    }

    public final void d() {
        obtainMessage(0, new 11()).sendToTarget();
    }

    public final void e() {
        obtainMessage(1, new 17()).sendToTarget();
    }

    public final void f() {
        obtainMessage(9, new 4()).sendToTarget();
    }

    public final void g() {
        obtainMessage(15, new 10()).sendToTarget();
    }

    /* Access modifiers changed, original: final */
    public final void h() {
        if (this.p == null) {
            if (this.y) {
                this.p = new dvi(this.o);
                return;
            }
            this.H = new SurfaceTexture(this.o);
            this.H.setOnFrameAvailableListener(this);
            this.q = new Surface(this.H);
            this.p = new dyn(this.H);
        }
    }

    public final void handleMessage(Message message) {
        a aVar = (a) message.obj;
        b.a();
        int i = message.what;
        try {
            aVar.a();
        } catch (dxx e) {
            this.g.a(gqt.HIGH, e, dnj.a.callsite("CameraFrameDispatcher").a("handleMessage"));
        }
    }

    /* Access modifiers changed, original: final */
    public final void i() {
        Surface surface = this.q;
        if (surface != null) {
            surface.release();
            this.q = null;
        }
        dym dym = this.p;
        if (dym != null) {
            dym.c();
            this.p = null;
            if (!this.y) {
                this.H.setOnFrameAvailableListener(null);
                this.H.release();
                this.H = null;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void j() {
        sendMessageDelayed(obtainMessage(10, new 15()), this.J);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:69:0x016a in {4, 7, 11, 15, 18, 22, 25, 28, 31, 34, 39, 44, 46, 49, 52, 58, 63, 64, 65, 66, 68} preds:[]
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
    public final void onFrameAvailable(android.graphics.SurfaceTexture r22) {
        /*
        r21 = this;
        r1 = r21;
        r2 = "onFrameAvailable";
        r3 = "CameraFrameDispatcher";
        r0 = r1.m;	 Catch:{ all -> 0x0168 }
        r4 = defpackage.ecz.SET_UP;	 Catch:{ all -> 0x0168 }
        if (r0 == r4) goto L_0x000d;	 Catch:{ all -> 0x0168 }
        return;	 Catch:{ all -> 0x0168 }
        r0 = r1.u;	 Catch:{ all -> 0x0168 }
        if (r0 != 0) goto L_0x001b;	 Catch:{ all -> 0x0168 }
        r0 = r1.z;	 Catch:{ all -> 0x0168 }
        r4 = defpackage.abmb.FIRST_PREVIEW_FRAME_RECEIVED;	 Catch:{ all -> 0x0168 }
        r0.a(r4);	 Catch:{ all -> 0x0168 }
        r0 = 1;	 Catch:{ all -> 0x0168 }
        r1.u = r0;	 Catch:{ all -> 0x0168 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0168 }
        r0 = r1.r;	 Catch:{ all -> 0x0168 }
        r6 = r1.p;	 Catch:{ all -> 0x0168 }
        r0.b();	 Catch:{ dxx -> 0x0027 }
        goto L_0x003c;
        r0 = move-exception;
        r7 = r0;
        r0 = r1.g;	 Catch:{ all -> 0x0168 }
        r8 = defpackage.gqt.HIGH;	 Catch:{ all -> 0x0168 }
        r9 = defpackage.dnj.a;	 Catch:{ all -> 0x0168 }
        r9 = r9.callsite(r3);	 Catch:{ all -> 0x0168 }
        r10 = "makeDefaultCurrent";	 Catch:{ all -> 0x0168 }
        r9 = r9.a(r10);	 Catch:{ all -> 0x0168 }
        r0.a(r8, r7, r9);	 Catch:{ all -> 0x0168 }
        r6.a();	 Catch:{ RuntimeException -> 0x0040 }
        goto L_0x0055;
        r0 = move-exception;
        r7 = r0;
        r0 = r1.g;	 Catch:{ all -> 0x0168 }
        r8 = defpackage.gqt.HIGH;	 Catch:{ all -> 0x0168 }
        r9 = defpackage.dnj.a;	 Catch:{ all -> 0x0168 }
        r9 = r9.callsite(r3);	 Catch:{ all -> 0x0168 }
        r10 = "updateTexImage";	 Catch:{ all -> 0x0168 }
        r9 = r9.a(r10);	 Catch:{ all -> 0x0168 }
        r0.a(r8, r7, r9);	 Catch:{ all -> 0x0168 }
        r0 = r1.i;	 Catch:{ RuntimeException -> 0x005b }
        r6.a(r0);	 Catch:{ RuntimeException -> 0x005b }
        goto L_0x006f;
        r0 = move-exception;
        r7 = r1.g;	 Catch:{ all -> 0x0168 }
        r8 = defpackage.gqt.HIGH;	 Catch:{ all -> 0x0168 }
        r9 = defpackage.dnj.a;	 Catch:{ all -> 0x0168 }
        r9 = r9.callsite(r3);	 Catch:{ all -> 0x0168 }
        r10 = "getTransformationMatrix";	 Catch:{ all -> 0x0168 }
        r9 = r9.a(r10);	 Catch:{ all -> 0x0168 }
        r7.a(r8, r0, r9);	 Catch:{ all -> 0x0168 }
        r6 = r6.b();	 Catch:{ RuntimeException -> 0x0076 }
        r1.l = r6;	 Catch:{ RuntimeException -> 0x0076 }
        goto L_0x008a;
        r0 = move-exception;
        r6 = r1.g;	 Catch:{ all -> 0x0168 }
        r7 = defpackage.gqt.HIGH;	 Catch:{ all -> 0x0168 }
        r8 = defpackage.dnj.a;	 Catch:{ all -> 0x0168 }
        r8 = r8.callsite(r3);	 Catch:{ all -> 0x0168 }
        r9 = "getTimestamp";	 Catch:{ all -> 0x0168 }
        r8 = r8.a(r9);	 Catch:{ all -> 0x0168 }
        r6.a(r7, r0, r8);	 Catch:{ all -> 0x0168 }
        r0 = r1.t;	 Catch:{ all -> 0x0168 }
        if (r0 == 0) goto L_0x0167;	 Catch:{ all -> 0x0168 }
        r0 = r1.t;	 Catch:{ all -> 0x0168 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0168 }
        if (r0 == 0) goto L_0x0098;	 Catch:{ all -> 0x0168 }
        goto L_0x0167;	 Catch:{ all -> 0x0168 }
        r0 = r1.j;	 Catch:{ all -> 0x0168 }
        r6 = r1.l;	 Catch:{ all -> 0x0168 }
        r14 = r0.a(r6);	 Catch:{ all -> 0x0168 }
        r0 = r1.y;	 Catch:{ dxx -> 0x00e3 }
        if (r0 == 0) goto L_0x00c1;	 Catch:{ dxx -> 0x00e3 }
        r0 = r1.p;	 Catch:{ dxx -> 0x00e3 }
        r0 = (defpackage.dvi) r0;	 Catch:{ dxx -> 0x00e3 }
        r6 = r1.n;	 Catch:{ dxx -> 0x00e3 }
        r7 = r0.a;	 Catch:{ dxx -> 0x00e3 }
        r7 = r7.d;	 Catch:{ dxx -> 0x00e3 }
        r8 = r0.a;	 Catch:{ dxx -> 0x00e3 }
        r8 = r8.h;	 Catch:{ dxx -> 0x00e3 }
        r0 = r0.a;	 Catch:{ dxx -> 0x00e3 }
        r0 = r0.i;	 Catch:{ dxx -> 0x00e3 }
        r6 = r6.a;	 Catch:{ dxx -> 0x00e3 }
        r6 = r6.get();	 Catch:{ dxx -> 0x00e3 }
        r6 = (defpackage.ebf) r6;	 Catch:{ dxx -> 0x00e3 }
        r6.a(r7, r8, r0);	 Catch:{ dxx -> 0x00e3 }
        r8 = r1.n;	 Catch:{ dxx -> 0x00e3 }
        r9 = r1.r;	 Catch:{ dxx -> 0x00e3 }
        r10 = r1.i;	 Catch:{ dxx -> 0x00e3 }
        r11 = r1.o;	 Catch:{ dxx -> 0x00e3 }
        r12 = r1.l;	 Catch:{ dxx -> 0x00e3 }
        r0 = r1.t;	 Catch:{ dxx -> 0x00e3 }
        r16 = r0.values();	 Catch:{ dxx -> 0x00e3 }
        r0 = r1.w;	 Catch:{ dxx -> 0x00e3 }
        r6 = r1.v;	 Catch:{ dxx -> 0x00e3 }
        r7 = r1.x;	 Catch:{ dxx -> 0x00e3 }
        r20 = 0;	 Catch:{ dxx -> 0x00e3 }
        r17 = r0;	 Catch:{ dxx -> 0x00e3 }
        r18 = r6;	 Catch:{ dxx -> 0x00e3 }
        r19 = r7;	 Catch:{ dxx -> 0x00e3 }
        r8.a(r9, r10, r11, r12, r14, r16, r17, r18, r19, r20);	 Catch:{ dxx -> 0x00e3 }
        goto L_0x00f5;
        r0 = move-exception;
        r6 = r1.g;	 Catch:{ all -> 0x0168 }
        r7 = defpackage.gqt.NORMAL;	 Catch:{ all -> 0x0168 }
        r8 = defpackage.dnj.a;	 Catch:{ all -> 0x0168 }
        r3 = r8.callsite(r3);	 Catch:{ all -> 0x0168 }
        r3 = r3.a(r2);	 Catch:{ all -> 0x0168 }
        r6.a(r7, r0, r3);	 Catch:{ all -> 0x0168 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0168 }
        r6 = r6 - r4;	 Catch:{ all -> 0x0168 }
        r0 = r1.n;	 Catch:{ all -> 0x0168 }
        r0 = r0.a;	 Catch:{ all -> 0x0168 }
        r0 = r0.get();	 Catch:{ all -> 0x0168 }
        r0 = (defpackage.ebf) r0;	 Catch:{ all -> 0x0168 }
        r0 = r0.c();	 Catch:{ all -> 0x0168 }
        r3 = com.google.common.base.Strings.isNullOrEmpty(r0);	 Catch:{ all -> 0x0168 }
        if (r3 == 0) goto L_0x0110;	 Catch:{ all -> 0x0168 }
        r0 = "NO_LEN";	 Catch:{ all -> 0x0168 }
        r3 = r1.k;	 Catch:{ all -> 0x0168 }
        r4 = r1.t;	 Catch:{ all -> 0x0168 }
        r4.size();	 Catch:{ all -> 0x0168 }
        r3 = r3.a;	 Catch:{ all -> 0x0168 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0168 }
        r4 = r3.hasNext();	 Catch:{ all -> 0x0168 }
        if (r4 == 0) goto L_0x0136;	 Catch:{ all -> 0x0168 }
        r4 = r3.next();	 Catch:{ all -> 0x0168 }
        r4 = (defpackage.dou) r4;	 Catch:{ all -> 0x0168 }
        r4.a(r6, r0);	 Catch:{ all -> 0x0168 }
        r4 = r4.c();	 Catch:{ all -> 0x0168 }
        if (r4 != 0) goto L_0x011d;	 Catch:{ all -> 0x0168 }
        r3.remove();	 Catch:{ all -> 0x0168 }
        goto L_0x011d;	 Catch:{ all -> 0x0168 }
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0168 }
        r5 = r1.E;	 Catch:{ all -> 0x0168 }
        r5 = r3 - r5;	 Catch:{ all -> 0x0168 }
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ all -> 0x0168 }
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ all -> 0x0168 }
        if (r0 < 0) goto L_0x0167;	 Catch:{ all -> 0x0168 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0168 }
        r0 = defpackage.eci.a;	 Catch:{ all -> 0x0168 }
        r0 = r0.a();	 Catch:{ all -> 0x0168 }
        r0 = (defpackage.eci) r0;	 Catch:{ all -> 0x0168 }
        if (r0 == 0) goto L_0x0153;	 Catch:{ all -> 0x0168 }
        goto L_0x0158;	 Catch:{ all -> 0x0168 }
        r0 = new eci;	 Catch:{ all -> 0x0168 }
        r0.<init>();	 Catch:{ all -> 0x0168 }
        r0.a(r5);	 Catch:{ all -> 0x0168 }
        r0.a(r2);	 Catch:{ all -> 0x0168 }
        r2 = defpackage.dpi.a();	 Catch:{ all -> 0x0168 }
        r2.a(r0);	 Catch:{ all -> 0x0168 }
        r1.E = r3;	 Catch:{ all -> 0x0168 }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyv.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }
}
