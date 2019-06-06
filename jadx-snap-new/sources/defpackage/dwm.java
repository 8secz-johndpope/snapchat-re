package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Face;
import android.hardware.Camera.FaceDetectionListener;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.media.CamcorderProfile;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.dpa.b;
import defpackage.dpa.c;
import defpackage.dvp.a;
import defpackage.dwq.1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: dwm */
public final class dwm implements dpp, dvn {
    private final gqr A;
    private ede[] B;
    private edd C;
    private List<Integer> D;
    private final dvq E;
    private dwl F;
    private final dwo G;
    private ajwl<Optional<abtl>> H;
    private abtl I;
    private int J;
    private float K;
    private Integer L;
    private boolean M;
    private boolean N;
    private ecb O;
    private ecb P;
    private final Supplier<dwv> Q;
    private final dwr R;
    private final Supplier<dwg> S;
    private long T;
    private final dwn U;
    private final dqo V;
    private final boolean W;
    private ajei X;
    protected final doo a;
    final Set<dos> b;
    protected dvp c;
    final dpf d;
    protected final jwa e;
    protected dwj f;
    protected ecd g;
    protected ecc h;
    protected ecy i;
    abtl j;
    int k;
    boolean l;
    protected boolean m;
    protected Parameters n;
    boolean o;
    ecd p;
    boolean q;
    final FaceDetectionListener r;
    private Supplier<Handler> s;
    private final boolean t;
    private dyv u;
    private final dzn v;
    private final dny w;
    private final dws x;
    private final dwp y;
    private final int z;

    /* renamed from: dwm$21 */
    class 21 implements FaceDetectionListener {
        private final abse a = new abse();

        21() {
        }

        public final void onFaceDetection(Face[] faceArr, Camera camera) {
            if (faceArr != null && faceArr.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (Face face : faceArr) {
                    Rect rect = face.rect;
                    int i = this.a.widthPixels;
                    int i2 = this.a.heightPixels;
                    int i3 = dwm.this.k;
                    boolean z = dwm.this.l;
                    RectF rectF = new RectF(rect);
                    Matrix matrix = new Matrix();
                    matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
                    matrix.postRotate((float) i3);
                    float f = (float) i;
                    float f2 = (float) i2;
                    matrix.postScale(f / 2000.0f, f2 / 2000.0f);
                    matrix.postTranslate(f / 2.0f, f2 / 2.0f);
                    matrix.mapRect(rectF);
                    rect = new Rect();
                    dvf.a(rectF, rect);
                    arrayList.add(rect);
                }
                for (dos a : dwm.this.b) {
                    a.a(arrayList);
                }
            }
        }
    }

    /* renamed from: dwm$17 */
    class 17 implements a {
        17() {
        }

        public final void execute() {
            dwm.this.y();
        }
    }

    /* renamed from: dwm$15 */
    class 15 implements a {
        private /* synthetic */ dpa a;
        private /* synthetic */ b b;
        private /* synthetic */ c c;
        private /* synthetic */ boolean d = false;

        15(dpa dpa, b bVar, c cVar, boolean z) {
            this.a = dpa;
            this.b = bVar;
            this.c = cVar;
        }

        public final void execute() {
            dwm.this.b(this.a, this.b, this.c, this.d, -1);
        }
    }

    /* renamed from: dwm$a */
    interface a extends AutoFocusCallback, Runnable {
    }

    /* renamed from: dwm$18 */
    class 18 implements a {
        18() {
        }

        public final void execute() {
            dwm.b(dwm.this);
        }
    }

    /* renamed from: dwm$19 */
    class 19 implements a {
        19() {
        }

        public final void execute() {
            dwm.c(dwm.this);
        }
    }

    /* renamed from: dwm$2 */
    class 2 implements a {
        2() {
        }

        public final void execute() {
            dwm.this.o = true;
            edg.a aVar = new edg.a();
            if (dwm.this.d.l()) {
                aVar.a(true);
            }
            if (!(dwm.this.l || dwm.this.g == ecd.AUTO)) {
                aVar.a = ecd.CONTINUOUS_VIDEO;
            }
            dwm dwm = dwm.this;
            dwm.p = dwm.g;
            dwm.a(dwm.this, aVar.a());
        }
    }

    /* renamed from: dwm$3 */
    class 3 implements a {
        3() {
        }

        public final void execute() {
            if (dwm.this.i == ecy.ACTIVE) {
                dwm.this.f.c();
            }
        }
    }

    /* renamed from: dwm$4 */
    class 4 implements a {
        4() {
        }

        public final void execute() {
            dwm.this.o = false;
            edg.a aVar = new edg.a();
            aVar.a = dwm.this.p;
            if (dwm.this.d.l()) {
                aVar.a(false);
            }
            dwm.a(dwm.this, aVar.a());
        }
    }

    /* renamed from: dwm$5 */
    class 5 implements a {
        5() {
        }

        public final void execute() {
            if (dwm.this.i == ecy.ACTIVE) {
                dwm.this.f.d();
            }
        }
    }

    /* renamed from: dwm$6 */
    class 6 implements a {
        6() {
        }

        public final void execute() {
            if (dwm.this.f != null) {
                dwm.this.f.e();
            }
        }
    }

    public dwm(Supplier<Handler> supplier, jwa jwa, dny dny, gqr gqr, Context context, dyw dyw, dvq dvq, dqo dqo) {
        this(dpg.a(), new dzn(), jwa, dny, gqr, context, doo.a(), supplier, dvq, dyw.a(), new dwr(), dqo);
    }

    private dwm(dpf dpf, dzn dzn, jwa jwa, dny dny, gqr gqr, Context context, doo doo, Supplier<Handler> supplier, dvq dvq, dyv dyv, dwr dwr, dqo dqo) {
        dny dny2 = dny;
        gqr gqr2 = gqr;
        Supplier<Handler> supplier2 = supplier;
        this.b = new HashSet();
        this.g = ecd.UNKNOWN;
        this.h = ecc.UNKNOWN;
        this.D = Collections.emptyList();
        this.i = ecy.INVALID;
        this.H = ajwl.i(Optional.absent());
        this.I = null;
        this.j = null;
        boolean z = false;
        this.J = 0;
        this.K = MapboxConstants.MINIMUM_ZOOM;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.M = false;
        this.Q = Suppliers.memoize(-$$Lambda$dwm$HRjky5kRMBS28CU59exAhV2t2Oc.INSTANCE);
        this.S = Suppliers.memoize(-$$Lambda$UAzyJEJjgygGP9-zjMKneODq3Jo.INSTANCE);
        this.T = -1;
        this.o = false;
        this.p = null;
        this.q = false;
        this.r = new 21();
        this.d = dpf;
        this.V = dqo;
        this.z = -3;
        Context context2 = context;
        this.c = new dvp(t(), context, supplier2, gqr);
        this.c.a();
        this.u = dyv;
        this.v = dzn;
        this.i = ecy.CLOSED;
        this.e = jwa;
        this.x = new dws(this.d, t(), dny);
        this.y = new dwp(this.d);
        this.U = dwn.a.a;
        this.a = doo;
        this.s = supplier2;
        this.G = new dwo();
        this.w = dny2;
        this.E = dvq;
        this.R = dwr;
        if (dwg.a() && this.d.ag()) {
            z = true;
        }
        this.t = z;
        this.W = this.d.ae();
        this.A = gqr2;
        this.L = this.d.x();
    }

    private int A() {
        int maxZoom = this.n.getMaxZoom();
        Integer num = this.L;
        return (num == null || num.intValue() > maxZoom) ? maxZoom : this.L.intValue();
    }

    private void B() {
        this.c.a(ecx.TURN_ON_RECORDING_HINT.ordinal(), new 18()).sendToTarget();
    }

    private void C() {
        ajei ajei;
        try {
            if (this.f != null) {
                this.f.m();
            }
            this.f = null;
            this.n = null;
            this.C = null;
            this.D = Collections.emptyList();
            this.J = 0;
            this.k = 0;
            this.H.a(Optional.absent());
            this.I = null;
            this.j = null;
            this.m = false;
            this.h = ecc.UNKNOWN;
            this.g = ecd.UNKNOWN;
            a(ecy.CLOSED, eck.close);
            dwl dwl = this.F;
            if (dwl != null) {
                dwl.b();
                this.F = null;
            }
            this.G.a = 0;
            ajei = this.X;
            if (ajei != null) {
                ajei.a();
                this.X = null;
            }
        } catch (Throwable th) {
            this.f = null;
            this.n = null;
            this.C = null;
            this.D = Collections.emptyList();
            this.J = 0;
            this.k = 0;
            this.H.a(Optional.absent());
            this.I = null;
            this.j = null;
            this.m = false;
            this.h = ecc.UNKNOWN;
            this.g = ecd.UNKNOWN;
            a(ecy.CLOSED, eck.close);
            dwl dwl2 = this.F;
            if (dwl2 != null) {
                dwl2.b();
                this.F = null;
            }
            this.G.a = 0;
            ajei = this.X;
            if (ajei != null) {
                ajei.a();
                this.X = null;
            }
        }
    }

    private void D() {
        E();
        Parameters parameters = this.n;
        if (parameters != null) {
            final dvq dvq = this.E;
            ecc a = dwq.a(parameters.getFlashMode());
            if (a != this.h) {
                this.h = a;
            }
            final ecd b = dwq.b(this.n.getFocusMode());
            if (b != this.g) {
                this.g = b;
                ((Handler) this.s.get()).post(new Runnable() {
                    public final void run() {
                        dvq.a(b);
                    }
                });
            }
        }
    }

    private void E() {
        if (this.f == null) {
            return;
        }
        if (this.N || this.n == null) {
            this.n = this.f.f();
            this.N = false;
        }
    }

    private void F() {
        abll a = abll.a(abmc.STARTING_PREVIEW);
        try {
            this.f.g();
            if (G()) {
                this.f.i();
                this.f.a(this.r);
                this.q = true;
            }
            if (this.t) {
                a((dwg) this.S.get());
            }
            this.w.a(a.a());
        } catch (Throwable th) {
            this.w.a(a.a());
        }
    }

    private boolean G() {
        return this.W || !this.b.isEmpty();
    }

    private static /* synthetic */ abtl H() {
        throw new IllegalStateException("opening camera hardware with null preview resolution");
    }

    private /* synthetic */ void I() {
        if (this.g != ecd.UNKNOWN) {
            ecd a = dvf.a(b(), this.o, this.g);
            if (this.g != a) {
                E();
                Parameters parameters = this.n;
                if (parameters != null) {
                    parameters.setFocusMode(dwq.a(a));
                    a(this.n);
                }
            }
        }
    }

    private /* synthetic */ void J() {
        if (this.i == ecy.CLOSED) {
            this.u.g();
            this.K = MapboxConstants.MINIMUM_ZOOM;
            this.u.k();
        }
    }

    private /* synthetic */ void K() {
        if (this.i == ecy.CLOSED) {
            this.u.d();
            this.u.e();
        }
    }

    private static /* synthetic */ dwv L() {
        dww dww = new dww();
        return TextUtils.equals(Build.MANUFACTURER.toLowerCase(Locale.US), "samsung") ? new dwt() : null;
    }

    private /* synthetic */ void a(long j, dpa dpa, b bVar, c cVar, dpa dpa2, Runnable runnable) {
        if (this.m && !this.M) {
            this.M = true;
            this.T = SystemClock.elapsedRealtime() - j;
            this.a.a(dpa, this.l, x(), bVar, k(), l());
            this.u.a(2);
            if (this.h != ecc.SINGLE_FLASH) {
                this.u.a(this.I, b.SCREENSHOT, cVar, this.l, x(), -1, dpa2);
                if (!this.d.c(this.l)) {
                    this.c.a(runnable, this.d.b(this.l));
                }
            }
        }
    }

    private void a(final dom dom, final List<Area> list) {
        this.c.a(ecx.SET_FOCUS_MODE.ordinal(), new a() {
            public final void execute() {
                if (dwm.this.i != ecy.ACTIVE) {
                    dwm.this.a.a(dom, false, null);
                } else if (dwm.this.g != ecd.AUTO) {
                    dwm.this.E();
                    if (dwm.this.n != null) {
                        dwm.this.n.setFocusMode(dwq.a(ecd.AUTO));
                        dwm dwm = dwm.this;
                        dwm.a(dwm.n);
                    }
                }
            }
        }).sendToTarget();
        this.c.a(ecx.AUTO_FOCUS.ordinal(), new a() {
            public final void execute() {
                if (dwm.this.i != ecy.ACTIVE) {
                    dwm.this.a.a(dom, false, null);
                    return;
                }
                dwm.this.E();
                if (dwm.this.n != null) {
                    List list = list;
                    if (list != null && list.size() > 0 && dwm.this.n.getMaxNumFocusAreas() >= list.size()) {
                        dwm.this.n.setFocusAreas(list);
                        if (dwm.this.n.getMaxNumMeteringAreas() >= list.size()) {
                            dwm.this.n.setMeteringAreas(list);
                        }
                        dwm dwm = dwm.this;
                        dwm.a(dwm.n);
                    }
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                AutoFocusCallback 1 = new a() {
                    private boolean a;
                    private boolean b;

                    private void a() {
                        if (!this.a) {
                            this.a = true;
                            dwm.this.t();
                            if (dwm.this.i == ecy.OPENED || dwm.this.i == ecy.ACTIVE) {
                                dwm.this.a.a(dom, true, dwm.this);
                                return;
                            }
                            dwm.this.a.a(dom, false, null);
                        }
                    }

                    public final void onAutoFocus(boolean z, Camera camera) {
                        this.b = false;
                        dwm.this.c.a((Runnable) this);
                        a();
                    }

                    public final void run() {
                        this.b = true;
                        a();
                    }
                };
                dwm.this.c.a((Runnable) 1, (long) dwm.this.d.z());
                dwm.this.f.a(1);
            }
        }).sendToTarget();
    }

    private void a(ecy ecy, eck eck) {
        ecy ecy2 = this.i;
        this.i = ecy;
        dpj.a(ecy2, ecy, eck);
    }

    private void a(String str, String str2, dwk dwk) {
        E();
        String str3 = this.n.get(str);
        if (str3 != null) {
            try {
                this.n.set(str, str2);
                a(this.n);
                E();
                if (!str2.equals(this.n.get(str))) {
                    dwk.a(this.f, this.n);
                }
            } catch (ecr unused) {
                this.n.set(str, str3);
                dwk.a(this.f, this.n);
            }
        }
    }

    static Integer b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            int a = new dk(byteArrayInputStream).a("ISOSpeedRatings", 0);
            byteArrayInputStream.close();
            return Integer.valueOf(a);
        } catch (IOException unused) {
            return null;
        }
    }

    private void b(edg edg) {
        E();
        if (this.n != null && this.f != null) {
            if (edg.a != null && dvf.a(b(), edg.a)) {
                this.n.setFocusMode(dwq.a(edg.a));
            }
            abtl abtl = edg.c;
            if (abtl != null) {
                this.n.setPreviewSize(abtl.b(), abtl.c());
                this.H.a(Optional.of(abtl));
                this.I = abtl.a();
                ede[] s = s();
                if (s != null) {
                    ede ede;
                    boolean z = this.l;
                    for (int i = 0; i < s.length; i++) {
                        if (s[i].a() == z) {
                            ede = s[i];
                            break;
                        }
                    }
                    ede = null;
                    if (!(!abrr.b || ede == null || dvf.a(ede, absc.a.a.b()))) {
                        this.I = abtl;
                    }
                }
            }
            ecf ecf = edg.i;
            abtl abtl2 = edg.d;
            if (ecf == ecf.JPEG && abtl2 != null) {
                this.n.setPictureSize(abtl2.b(), abtl2.c());
                if (this.d.w()) {
                    this.n.setJpegThumbnailSize(0, 0);
                }
                if (this.Q.get() != null) {
                    if (this.d.f()) {
                        ((dwv) this.Q.get()).a(this.n);
                    }
                    if (!this.l && this.d.v()) {
                        ((dwv) this.Q.get()).b(this.n);
                    }
                }
                this.j = abtl2;
            }
            if (edg.e != null) {
                this.n.setExposureCompensation(edg.e.intValue());
            }
            if (edg.f != null) {
                if (z()) {
                    this.J = (int) Math.ceil((double) (edg.f.floatValue() * ((float) A())));
                    this.K = MapboxConstants.MINIMUM_ZOOM;
                    this.n.setZoom(this.J);
                } else {
                    this.K = edg.f.floatValue();
                }
                this.u.a(this.K);
            }
            if (edg.g != null && this.n.isVideoStabilizationSupported()) {
                this.n.setVideoStabilization(edg.g.booleanValue());
            }
            if (edg.h != null) {
                edd edd = this.C;
                if (edd != null && edd.m) {
                    boolean booleanValue = edg.h.booleanValue();
                    String o = this.x.a.o();
                    dws dws = this.x;
                    a(o, booleanValue ? dws.a.p() : dws.a.q(), this.x);
                }
            }
            ecb ecb = edg.j;
            if (ecb != null) {
                this.O = ecb;
                this.P = dvf.a(i());
                this.n.setPreviewFpsRange(ecb.a, ecb.b);
            }
            if (this.d.p(this.l)) {
                String a = this.y.a(this.n, this.l);
                if (a != null) {
                    a("sharpness", a, this.y);
                }
            }
            a(this.n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x025d A:{Catch:{ all -> 0x02a8, ecr -> 0x01a6, ecr -> 0x02b3 }} */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0255 A:{Catch:{ all -> 0x02a8, ecr -> 0x01a6, ecr -> 0x02b3 }} */
    private /* synthetic */ void b(defpackage.edi r26, boolean r27, defpackage.edg.a r28, defpackage.dop r29) {
        /*
        r25 = this;
        r1 = r25;
        r2 = r29;
        r0 = r25.s();
        r3 = -1;
        if (r0 == 0) goto L_0x02c2;
    L_0x000b:
        r4 = r0.length;
        if (r4 != 0) goto L_0x0010;
    L_0x000e:
        goto L_0x02c2;
    L_0x0010:
        r4 = r27;
        r0 = defpackage.dvf.a(r4, r0);
        if (r0 != r3) goto L_0x001a;
    L_0x0018:
        r3 = 0;
        goto L_0x001b;
    L_0x001a:
        r3 = r0;
    L_0x001b:
        r0 = r1.i;
        r5 = defpackage.ecy.CLOSED;
        if (r0 != r5) goto L_0x02c1;
    L_0x0021:
        r0 = r1.u;	 Catch:{ ecr -> 0x02b3 }
        r5 = defpackage.eca.CAMERA1;	 Catch:{ ecr -> 0x02b3 }
        r0.a(r5);	 Catch:{ ecr -> 0x02b3 }
        r0 = defpackage.abmc.OPENING_CAMERA;	 Catch:{ ecr -> 0x02b3 }
        r5 = defpackage.abll.a(r0);	 Catch:{ ecr -> 0x02b3 }
        r0 = defpackage.dwq.a(r3);	 Catch:{ all -> 0x02a8 }
        r1.f = r0;	 Catch:{ all -> 0x02a8 }
        r0 = r1.w;	 Catch:{ ecr -> 0x02b3 }
        r5 = r5.a();	 Catch:{ ecr -> 0x02b3 }
        r0.a(r5);	 Catch:{ ecr -> 0x02b3 }
        r25.E();	 Catch:{ ecr -> 0x02b3 }
        r0 = r25.s();	 Catch:{ ecr -> 0x02b3 }
        com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ ecr -> 0x02b3 }
        r5 = r0[r3];	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.C;	 Catch:{ ecr -> 0x02b3 }
        r7 = 1;
        if (r0 != 0) goto L_0x011b;
    L_0x004e:
        r25.E();	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        if (r0 == 0) goto L_0x011b;
    L_0x0055:
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r9 = new java.util.ArrayList;	 Catch:{ ecr -> 0x02b3 }
        r9.<init>();	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getSupportedFlashModes();	 Catch:{ ecr -> 0x02b3 }
        if (r0 == 0) goto L_0x007e;
    L_0x0062:
        r0 = r0.iterator();	 Catch:{ ecr -> 0x02b3 }
    L_0x0066:
        r8 = r0.hasNext();	 Catch:{ ecr -> 0x02b3 }
        if (r8 == 0) goto L_0x007e;
    L_0x006c:
        r8 = r0.next();	 Catch:{ ecr -> 0x02b3 }
        r8 = (java.lang.String) r8;	 Catch:{ ecr -> 0x02b3 }
        r8 = defpackage.dwq.a(r8);	 Catch:{ ecr -> 0x02b3 }
        r10 = defpackage.ecc.UNKNOWN;	 Catch:{ ecr -> 0x02b3 }
        if (r8 == r10) goto L_0x0066;
    L_0x007a:
        r9.add(r8);	 Catch:{ ecr -> 0x02b3 }
        goto L_0x0066;
    L_0x007e:
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r10 = defpackage.dwq.a(r0);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getSupportedVideoSizes();	 Catch:{ ecr -> 0x02b3 }
        r16 = defpackage.dwq.c(r0);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getSupportedPictureSizes();	 Catch:{ ecr -> 0x02b3 }
        r17 = defpackage.dwq.c(r0);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getSupportedPreviewSizes();	 Catch:{ ecr -> 0x02b3 }
        r19 = defpackage.dwq.c(r0);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r14 = r0.getMaxExposureCompensation();	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ StringIndexOutOfBoundsException -> 0x00af }
        r0 = r0.getSupportedPreviewFpsRange();	 Catch:{ StringIndexOutOfBoundsException -> 0x00af }
        goto L_0x00b0;
    L_0x00af:
        r0 = 0;
    L_0x00b0:
        r15 = defpackage.dwq.b(r0);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getMaxNumFocusAreas();	 Catch:{ ecr -> 0x02b3 }
        r8 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r8 = r8.getMaxNumMeteringAreas();	 Catch:{ ecr -> 0x02b3 }
        r21 = java.lang.Math.min(r0, r8);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r11 = r0.isZoomSupported();	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r12 = r0.isVideoStabilizationSupported();	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.x;	 Catch:{ ecr -> 0x02b3 }
        r8 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.a;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.n();	 Catch:{ ecr -> 0x02b3 }
        r0 = r8.get(r0);	 Catch:{ ecr -> 0x02b3 }
        if (r0 == 0) goto L_0x00e8;
    L_0x00e0:
        r0 = java.lang.Boolean.parseBoolean(r0);	 Catch:{ ecr -> 0x02b3 }
        if (r0 == 0) goto L_0x00e8;
    L_0x00e6:
        r13 = 1;
        goto L_0x00e9;
    L_0x00e8:
        r13 = 0;
    L_0x00e9:
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r8 = r5.a();	 Catch:{ ecr -> 0x02b3 }
        r6 = r1.d;	 Catch:{ ecr -> 0x02b3 }
        r0 = defpackage.dwq.a(r0, r8, r6);	 Catch:{ ecr -> 0x02b3 }
        r6 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r6 = r6.getMaxZoom();	 Catch:{ ecr -> 0x02b3 }
        r8 = defpackage.ece.NORMAL_LIGHT;	 Catch:{ ecr -> 0x02b3 }
        r4 = defpackage.ece.LOW_LIGHT;	 Catch:{ ecr -> 0x02b3 }
        r20 = com.google.common.collect.ImmutableList.of(r8, r4);	 Catch:{ ecr -> 0x02b3 }
        r4 = new edd;	 Catch:{ ecr -> 0x02b3 }
        r18 = com.google.common.collect.ImmutableList.of();	 Catch:{ ecr -> 0x02b3 }
        r8 = r0.a;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.b;	 Catch:{ ecr -> 0x02b3 }
        r6 = (float) r6;	 Catch:{ ecr -> 0x02b3 }
        r24 = r6;
        r6 = r8;
        r8 = r4;
        r22 = r6;
        r23 = r0;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ ecr -> 0x02b3 }
        r1.C = r4;	 Catch:{ ecr -> 0x02b3 }
    L_0x011b:
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        if (r0 == 0) goto L_0x013f;
    L_0x011f:
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getFlashMode();	 Catch:{ ecr -> 0x02b3 }
        r0 = defpackage.dwq.a(r0);	 Catch:{ ecr -> 0x02b3 }
        r1.h = r0;	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getFocusMode();	 Catch:{ ecr -> 0x02b3 }
        r0 = defpackage.dwq.b(r0);	 Catch:{ ecr -> 0x02b3 }
        r1.g = r0;	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getZoom();	 Catch:{ ecr -> 0x02b3 }
        r1.J = r0;	 Catch:{ ecr -> 0x02b3 }
    L_0x013f:
        r0 = r5.a();	 Catch:{ ecr -> 0x02b3 }
        r1.l = r0;	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.c;	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.l;	 Catch:{ ecr -> 0x02b3 }
        r0.a(r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.C;	 Catch:{ ecr -> 0x02b3 }
        com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.getZoomRatios();	 Catch:{ ecr -> 0x02b3 }
        r1.D = r0;	 Catch:{ ecr -> 0x02b3 }
        r0 = new dwl;	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.E;	 Catch:{ ecr -> 0x02b3 }
        r6 = r1.d;	 Catch:{ ecr -> 0x02b3 }
        r0.<init>(r4, r6);	 Catch:{ ecr -> 0x02b3 }
        r1.F = r0;	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.E;	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.F;	 Catch:{ ecr -> 0x02b3 }
        r4 = r4.a();	 Catch:{ ecr -> 0x02b3 }
        if (r4 != 0) goto L_0x0170;
    L_0x016e:
        r4 = 1;
        goto L_0x0171;
    L_0x0170:
        r4 = 0;
    L_0x0171:
        r0.a(r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.u;	 Catch:{ ecr -> 0x02b3 }
        r0.a(r7);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.u;	 Catch:{ ecr -> 0x02b3 }
        r4 = 0;
        r0.w = r4;	 Catch:{ ecr -> 0x02b3 }
        if (r28 != 0) goto L_0x0186;
    L_0x0180:
        r0 = new edg$a;	 Catch:{ ecr -> 0x02b3 }
        r0.<init>();	 Catch:{ ecr -> 0x02b3 }
        goto L_0x0188;
    L_0x0186:
        r0 = r28;
    L_0x0188:
        r4 = new dzp;	 Catch:{ ecr -> 0x02b3 }
        r6 = new -$$Lambda$fkbSlh4TwtWmOmrnmACrfTOnu1g;	 Catch:{ ecr -> 0x02b3 }
        r6.<init>(r1);	 Catch:{ ecr -> 0x02b3 }
        r4.<init>(r6);	 Catch:{ ecr -> 0x02b3 }
        r6 = r26;
        r4 = r4.a(r6);	 Catch:{ ecr -> 0x02b3 }
        defpackage.dzn.a(r1, r0, r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.a();	 Catch:{ ecr -> 0x01a6 }
        r25.t();	 Catch:{ ecr -> 0x01a6 }
        r1.b(r0);	 Catch:{ ecr -> 0x01a6 }
        goto L_0x01bc;
    L_0x01a6:
        r0 = move-exception;
        r4 = r1.c;	 Catch:{ ecr -> 0x02b3 }
        r6 = defpackage.ecx.BATCH_SETTING;	 Catch:{ ecr -> 0x02b3 }
        r4.a(r6, r0);	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.H;	 Catch:{ ecr -> 0x02b3 }
        r4 = r4.p();	 Catch:{ ecr -> 0x02b3 }
        r4 = (com.google.common.base.Optional) r4;	 Catch:{ ecr -> 0x02b3 }
        r4 = r4.isPresent();	 Catch:{ ecr -> 0x02b3 }
        if (r4 == 0) goto L_0x02a7;
    L_0x01bc:
        r0 = r1.H;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.p();	 Catch:{ ecr -> 0x02b3 }
        r0 = (com.google.common.base.Optional) r0;	 Catch:{ ecr -> 0x02b3 }
        r4 = defpackage.-$$Lambda$dwm$gBnKLALhqJKY90Zsv7JCwJg9X0o.INSTANCE;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.or(r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = (defpackage.abtl) r0;	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.u;	 Catch:{ ecr -> 0x02b3 }
        r6 = r1.I;	 Catch:{ ecr -> 0x02b3 }
        r8 = 0;
        r4.a(r0, r6, r8);	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.d;	 Catch:{ ecr -> 0x02b3 }
        r6 = r1.l;	 Catch:{ ecr -> 0x02b3 }
        r4 = r4.f(r6);	 Catch:{ ecr -> 0x02b3 }
        if (r4 == 0) goto L_0x01e1;
    L_0x01de:
        r25.B();	 Catch:{ ecr -> 0x02b3 }
    L_0x01e1:
        r4 = r1.d;	 Catch:{ ecr -> 0x02b3 }
        r6 = r1.l;	 Catch:{ ecr -> 0x02b3 }
        r4 = r4.r(r6);	 Catch:{ ecr -> 0x02b3 }
        if (r4 == 0) goto L_0x01ff;
    L_0x01eb:
        r4 = r1.c;	 Catch:{ ecr -> 0x02b3 }
        r6 = defpackage.ecx.DISABLE_SHUTTER_SOUND;	 Catch:{ ecr -> 0x02b3 }
        r6 = r6.ordinal();	 Catch:{ ecr -> 0x02b3 }
        r8 = new dwm$17;	 Catch:{ ecr -> 0x02b3 }
        r8.<init>();	 Catch:{ ecr -> 0x02b3 }
        r4 = r4.a(r6, r8);	 Catch:{ ecr -> 0x02b3 }
        r4.sendToTarget();	 Catch:{ ecr -> 0x02b3 }
    L_0x01ff:
        r4 = r1.V;	 Catch:{ ecr -> 0x02b3 }
        r6 = r25.g();	 Catch:{ ecr -> 0x02b3 }
        r8 = r25.d();	 Catch:{ ecr -> 0x02b3 }
        r4.a(r6, r8);	 Catch:{ ecr -> 0x02b3 }
        r4 = 0;
        defpackage.doo.a(r2, r1, r0, r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.u;	 Catch:{ ecr -> 0x02b3 }
        r4 = new edf;	 Catch:{ ecr -> 0x02b3 }
        r6 = r1.I;	 Catch:{ ecr -> 0x02b3 }
        r8 = r25.k();	 Catch:{ ecr -> 0x02b3 }
        r9 = r25.l();	 Catch:{ ecr -> 0x02b3 }
        r4.<init>(r5, r6, r8, r9);	 Catch:{ ecr -> 0x02b3 }
        r0.a(r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.w;	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.l;	 Catch:{ ecr -> 0x02b3 }
        r6 = r5.d;	 Catch:{ ecr -> 0x02b3 }
        r8 = r1.C;	 Catch:{ ecr -> 0x02b3 }
        r0.a(r3, r4, r6, r8);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.R;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.a;	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.a();	 Catch:{ ecr -> 0x02b3 }
        r4 = 90;
        if (r5 != 0) goto L_0x023c;
    L_0x023b:
        goto L_0x0262;
    L_0x023c:
        if (r0 == 0) goto L_0x0246;
    L_0x023e:
        if (r0 == r7) goto L_0x024d;
    L_0x0240:
        r4 = 2;
        if (r0 == r4) goto L_0x024b;
    L_0x0243:
        r4 = 3;
        if (r0 == r4) goto L_0x0248;
    L_0x0246:
        r4 = 0;
        goto L_0x024d;
    L_0x0248:
        r4 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x024d;
    L_0x024b:
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
    L_0x024d:
        r0 = r5.c;	 Catch:{ ecr -> 0x02b3 }
        r5 = r5.a();	 Catch:{ ecr -> 0x02b3 }
        if (r5 == 0) goto L_0x025d;
    L_0x0255:
        r0 = r0 + r4;
        r0 = r0 % 360;
        r0 = 360 - r0;
        r4 = r0 % 360;
        goto L_0x0262;
    L_0x025d:
        r0 = r0 - r4;
        r0 = r0 + 360;
        r4 = r0 % 360;
    L_0x0262:
        r1.k = r4;	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.f;	 Catch:{ ecr -> 0x02b3 }
        r0.a(r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.G;	 Catch:{ ecr -> 0x02b3 }
        r4 = r25.x();	 Catch:{ ecr -> 0x02b3 }
        r0.a(r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = r1.u;	 Catch:{ ecr -> 0x02b3 }
        r0.k();	 Catch:{ ecr -> 0x02b3 }
        r0 = defpackage.ecy.OPENED;	 Catch:{ ecr -> 0x02b3 }
        r4 = defpackage.eck.open;	 Catch:{ ecr -> 0x02b3 }
        r1.a(r0, r4);	 Catch:{ ecr -> 0x02b3 }
        r0 = new ajei;	 Catch:{ ecr -> 0x02b3 }
        r0.<init>();	 Catch:{ ecr -> 0x02b3 }
        r1.X = r0;	 Catch:{ ecr -> 0x02b3 }
        r0 = defpackage.abss.a();	 Catch:{ ecr -> 0x02b3 }
        r0 = r0.p();	 Catch:{ ecr -> 0x02b3 }
        if (r0 == 0) goto L_0x02a6;
    L_0x028f:
        r0 = r1.U;	 Catch:{ ecr -> 0x02b3 }
        r4 = r1.n;	 Catch:{ ecr -> 0x02b3 }
        r5 = r1.l;	 Catch:{ ecr -> 0x02b3 }
        if (r4 == 0) goto L_0x02a6;
    L_0x0297:
        r6 = r0.a;	 Catch:{ ecr -> 0x02b3 }
        if (r6 == 0) goto L_0x029f;
    L_0x029b:
        r6 = r0.b;	 Catch:{ ecr -> 0x02b3 }
        if (r6 == r5) goto L_0x02a6;
    L_0x029f:
        r0.a = r4;	 Catch:{ ecr -> 0x02b3 }
        r0.b = r5;	 Catch:{ ecr -> 0x02b3 }
        r4 = 0;
        r0.c = r4;	 Catch:{ ecr -> 0x02b3 }
    L_0x02a6:
        return;
    L_0x02a7:
        throw r0;	 Catch:{ ecr -> 0x02b3 }
    L_0x02a8:
        r0 = move-exception;
        r4 = r1.w;	 Catch:{ ecr -> 0x02b3 }
        r5 = r5.a();	 Catch:{ ecr -> 0x02b3 }
        r4.a(r5);	 Catch:{ ecr -> 0x02b3 }
        throw r0;	 Catch:{ ecr -> 0x02b3 }
    L_0x02b3:
        r0 = move-exception;
        r25.C();
        r4 = r1.a;
        r5 = r25.t();
        r4.a(r2, r3, r5);
        throw r0;
    L_0x02c1:
        return;
    L_0x02c2:
        r0 = r1.a;
        r4 = r25.t();
        r0.a(r2, r3, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwm.b(edi, boolean, edg$a, dop):void");
    }

    private boolean z() {
        edd edd = this.C;
        return (edd == null || !edd.k) ? false : this.l ? this.d.k() : true;
    }

    public final Camera a() {
        dwj dwj = this.f;
        return dwj == null ? null : dwj.b();
    }

    public final CamcorderProfile a(ebx ebx) {
        ede[] s = s();
        if (s == null) {
            return null;
        }
        int a = dvf.a(ebx == ebx.FRONT_FACING, s);
        return CamcorderProfile.hasProfile(a, 1) ? CamcorderProfile.get(a, 1) : null;
    }

    public final void a(float f) {
        this.c.a(ecx.TRANSLATION_Y.ordinal(), new -$$Lambda$dwm$jRbseBg77uwSvcZ2hZMiGiUlGc0(this, f)).sendToTarget();
    }

    public final void a(final float f, final dor dor) {
        if (f < MapboxConstants.MINIMUM_ZOOM || f > 1.0f) {
            throw new IllegalArgumentException("invalid zoom percentage: ".concat(String.valueOf(f)));
        } else {
            this.c.a(ecx.ZOOM.ordinal(), new a() {
                public final void execute() {
                    dwm.a(dwm.this, f, dor);
                }
            }).sendToTarget();
        }
    }

    public final void a(SurfaceTexture surfaceTexture) {
        a(surfaceTexture, null, edj.FREEZE);
    }

    public final void a(SurfaceTexture surfaceTexture, dpc dpc, edj edj) {
        this.u.a(surfaceTexture, dpc, edj);
    }

    public final void a(SurfaceTexture surfaceTexture, ecu ecu) {
        a(surfaceTexture, ecu, null, null);
    }

    public final void a(SurfaceTexture surfaceTexture, ecu ecu, dov dov, abtl abtl) {
        this.u.a(surfaceTexture, ecu, dov, null, abtl);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Parameters parameters) {
        dwj dwj = this.f;
        if (dwj != null) {
            this.N = true;
            dwj.a(parameters);
            D();
        }
    }

    public final void a(final PreviewCallback previewCallback) {
        this.c.a(ecx.SET_CALLBACK_WITH_BUFFER.ordinal(), new a() {
            private /* synthetic */ doq a = null;

            public final void execute() {
                if (dwm.this.f == null) {
                    dwm.this.a.c(null, "empty camera");
                    return;
                }
                try {
                    dwm.this.f.a(previewCallback);
                    dwm.this.a.a(null, "set preview callback successfully");
                } catch (ecr e) {
                    dwm.this.a.b(null, "set preview callback failed: ".concat(String.valueOf(e)));
                    throw e;
                }
            }
        }).sendToTarget();
    }

    public final void a(Surface surface, dpc dpc) {
        a(surface, dpc, edj.FREEZE);
    }

    public final void a(Surface surface, dpc dpc, edj edj) {
        this.u.a(surface, dpc, edj);
    }

    public final void a(Surface surface, ecu ecu, dov dov, doz doz, abtl abtl) {
        this.u.a(surface, ecu, dov, doz, abtl);
    }

    public final void a(dom dom) {
        if (dvf.a(b(), ecd.AUTO)) {
            a(dom, null);
        } else {
            this.a.a(dom, false, (dpp) this);
        }
    }

    public final void a(dom dom, int i, int i2, int i3, int i4) {
        if (dvf.a(b(), ecd.AUTO)) {
            int i5 = this.k;
            Matrix matrix = new Matrix();
            Matrix matrix2 = new Matrix();
            matrix2.setScale(1.0f, 1.0f);
            matrix2.postRotate((float) i5);
            float f = (float) i3;
            float f2 = (float) i4;
            matrix2.postScale(f / 2000.0f, f2 / 2000.0f);
            matrix2.postTranslate(f / 2.0f, f2 / 2.0f);
            matrix2.invert(matrix);
            Area area = new Area(new Rect(), 1);
            Rect rect = area.rect;
            i = abpf.a(i - 133, 0, i3 - 266);
            i2 = abpf.a(i2 - 133, 0, i4 - 266);
            RectF rectF = new RectF((float) i, (float) i2, (float) (i + 266), (float) (i2 + 266));
            matrix.mapRect(rectF);
            dvf.a(rectF, rect);
            a(dom, ImmutableList.of(area));
            return;
        }
        this.a.a(dom, false, (dpp) this);
    }

    public final void a(don don) {
        this.c.a(ecx.CLOSE.ordinal(), new -$$Lambda$dwm$A4jhodYrHcyR2eQmdjCB0zeLwlE(this, don)).sendToTarget();
    }

    public final void a(final doq doq) {
        this.c.a(ecx.STOP_PREVIEW.ordinal(), new a() {
            public final void execute() {
                dwm.this.c(doq);
            }
        }).sendToTarget();
    }

    public final void a(final doq doq, final dou dou) {
        this.c.a(ecx.START_PREVIEW.ordinal(), new a() {
            public final void execute() {
                dwm.this.b(doq, dou);
            }
        }).sendToTarget();
    }

    public final void a(final dos dos) {
        this.c.a(ecx.FACE_DETECTION.ordinal(), new a() {
            public final void execute() {
                if (!dwm.this.q && dwm.this.i == ecy.ACTIVE) {
                    dwm.this.f.i();
                    dwm.this.f.a(dwm.this.r);
                    dwm.this.q = true;
                }
                dwm.this.b.add(dos);
            }
        }).sendToTarget();
    }

    public final void a(dou dou) {
        this.u.a(dou);
    }

    public final void a(dox dox) {
        this.G.a(this, dox);
    }

    public final void a(dpa dpa, b bVar, c cVar) {
        this.c.a(ecx.TAKE_PHOTO.ordinal(), new 15(dpa, bVar, cVar, false)).sendToTarget();
    }

    public final void a(dpa dpa, b bVar, c cVar, boolean z, int i) {
        final dpa dpa2 = dpa;
        final b bVar2 = bVar;
        final c cVar2 = cVar;
        final int i2 = i;
        this.c.a(ecx.TAKE_PHOTO.ordinal(), new a(false) {
            public final void execute() {
                dwm.this.b(dpa2, bVar2, cVar2, false, i2);
            }
        }).sendToTarget();
    }

    public final void a(final ecc ecc) {
        edd edd = this.C;
        if ((edd == null ? ImmutableList.of() : ImmutableList.copyOf(edd.i)).contains(ecc)) {
            this.c.a(ecx.SET_FLASH_MODE.ordinal(), new a() {
                public final void execute() {
                    if ((dwm.this.i == ecy.OPENED || dwm.this.i == ecy.ACTIVE) && dwm.this.h != ecc) {
                        dwm.this.E();
                        if (dwm.this.n != null) {
                            String str;
                            Parameters parameters = dwm.this.n;
                            ecc ecc = ecc;
                            int i = 1.a[ecc.ordinal()];
                            if (i == 1) {
                                str = "off";
                            } else if (i == 2) {
                                str = "torch";
                            } else if (i == 3) {
                                str = "on";
                            } else {
                                throw new IllegalStateException("unexpected ScFlashMode ".concat(String.valueOf(ecc)));
                            }
                            parameters.setFlashMode(str);
                            dwm dwm = dwm.this;
                            dwm.a(dwm.n);
                        }
                    }
                }
            }).sendToTarget();
        }
    }

    public final void a(ece ece) {
        this.u.w = ece == ece.LOW_LIGHT;
    }

    public final void a(final edg edg) {
        this.c.a(ecx.BATCH_SETTING.ordinal(), new a() {
            public final void execute() {
                dwm.a(dwm.this, edg);
            }
        }).sendToTarget();
    }

    public final void a(edi edi, boolean z, edg.a aVar, dop dop) {
        this.c.a(ecx.OPEN.ordinal(), new -$$Lambda$dwm$Itoy8_nM9b6EM9j--SshpknvUN4(this, edi, z, aVar, dop)).sendToTarget();
    }

    public final void a(boolean z) {
        this.c.a(ecx.SET_FOCUS_MODE.ordinal(), new 2()).sendToTarget();
        if (this.d.g(this.l)) {
            B();
        }
        if (!z) {
            this.c.a(ecx.UNLOCK.ordinal(), new 3()).sendToTarget();
            this.c.a().k();
        }
    }

    public final void a(final byte[] bArr) {
        this.c.a(ecx.ADD_CALLBACK_BUFFER.ordinal(), new a() {
            public final void execute() {
                if (dwm.this.f != null) {
                    dwm.this.f.a(bArr);
                }
            }
        }).sendToTarget();
    }

    public final List<ecd> b() {
        edd edd = this.C;
        return edd == null ? ImmutableList.of() : ImmutableList.copyOf(edd.j);
    }

    public final void b(doq doq) {
        throw new IllegalStateException("resetCameraSession not supported");
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(doq doq, dou dou) {
        if (this.i != ecy.OPENED) {
            doo doo = this.a;
            StringBuilder stringBuilder = new StringBuilder("invalid state ");
            stringBuilder.append(this.i);
            doo.c(doq, stringBuilder.toString());
            return;
        }
        dym dym = this.u.p;
        if (dym instanceof dyn) {
            try {
                this.f.a(((dyn) dym).a);
                dny dny = this.w;
                t();
                this.u.a(ImmutableList.of(new dvg(dny.a()), dou));
                try {
                    F();
                    a(ecy.ACTIVE, eck.startPreview);
                    this.a.a(doq, "done");
                    return;
                } catch (ecr e) {
                    this.a.b(doq, "startPreviewFailure");
                    throw e;
                }
            } catch (ecr e2) {
                this.a.b(doq, "setSurfaceTextureFailure");
                throw e2;
            }
        }
        throw new IllegalStateException("SurfaceTexture not found");
    }

    public final void b(final dos dos) {
        this.c.a(ecx.FACE_DETECTION.ordinal(), new a() {
            public final void execute() {
                dwm.this.b.remove(dos);
            }
        }).sendToTarget();
    }

    public final void b(dou dou) {
        this.u.b(dou);
    }

    public final void b(dox dox) {
        this.G.a(dox);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017b  */
    public final void b(defpackage.dpa r19, defpackage.dpa.b r20, defpackage.dpa.c r21, boolean r22, int r23) {
        /*
        r18 = this;
        r9 = r18;
        r10 = r19;
        r5 = r20;
        r11 = r22;
        r0 = r9.i;
        r1 = defpackage.ecy.ACTIVE;
        if (r0 == r1) goto L_0x002c;
    L_0x000e:
        r0 = r9.a;
        r2 = defpackage.dpa.a.INVALID_STATE;
        r1 = new java.lang.StringBuilder;
        r3 = "Invalid camera state: ";
        r1.<init>(r3);
        r3 = r9.i;
        r1.append(r3);
        r3 = r1.toString();
        r4 = 0;
        r5 = 0;
        r6 = defpackage.dpa.b.API;
        r1 = r19;
        r0.a(r1, r2, r3, r4, r5, r6);
        return;
    L_0x002c:
        r0 = r9.m;
        if (r0 == 0) goto L_0x0044;
    L_0x0030:
        r0 = defpackage.dpa.b.API;
        if (r5 != r0) goto L_0x0044;
    L_0x0034:
        r0 = r9.w;
        r1 = defpackage.dog.IS_TAKING_PICTURE;
        r1 = r1.toString();
        r2 = defpackage.aasc.IMAGE;
        r3 = "";
        r0.a(r1, r2, r3);
        return;
    L_0x0044:
        r0 = defpackage.dpa.b.API;
        r12 = 2;
        r13 = 1;
        if (r5 != r0) goto L_0x019b;
    L_0x004a:
        r0 = -1;
        r7 = r23;
        if (r7 != r0) goto L_0x019d;
    L_0x004f:
        r0 = r9.K;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x0058;
    L_0x0056:
        goto L_0x019d;
    L_0x0058:
        r9.m = r13;
        r0 = 0;
        r9.M = r0;
        r0 = -1;
        r9.T = r0;
        r14 = new dwh;
        r0 = r9.a;
        r14.<init>(r0, r10, r5);
        r0 = r9.X;
        r1 = new ajei;
        r1.<init>();
        r2 = r14.a;
        r2 = (defpackage.ajdp) r2;
        r3 = r14.c;
        r3 = (defpackage.ajdp) r3;
        r2 = (defpackage.ajdt) r2;
        r3 = (defpackage.ajdt) r3;
        r4 = new dwh$e;
        r4.<init>();
        r4 = (defpackage.ajex) r4;
        r2 = defpackage.ajdp.b(r2, r3, r4);
        if (r2 != 0) goto L_0x008b;
    L_0x0088:
        defpackage.akcr.a();
    L_0x008b:
        r2 = (defpackage.ajdt) r2;
        r3 = r14.b;
        r3 = (defpackage.ajdt) r3;
        r2 = defpackage.ajdp.c(r2, r3);
        r3 = new dwh$f;
        r3.<init>(r14);
        r3 = (defpackage.ajfb) r3;
        r4 = new dwh$g;
        r4.<init>(r14);
        r4 = (defpackage.ajfb) r4;
        r2 = r2.a(r3, r4);
        r1.a(r2);
        r2 = new dwh$h;
        r3 = r14;
        r3 = (defpackage.dwh) r3;
        r2.<init>(r3);
        r2 = (defpackage.akbk) r2;
        r3 = new dwi;
        r3.<init>(r2);
        r3 = (defpackage.ajev) r3;
        r2 = defpackage.ajek.a(r3);
        r1.a(r2);
        r1 = (defpackage.ajej) r1;
        r0.a(r1);
        r15 = android.os.SystemClock.elapsedRealtime();
        r8 = new -$$Lambda$dwm$VmSRqPdkgqkYECBkM7TGRiChtD8;
        r8.<init>(r14);
        r7 = new -$$Lambda$dwm$F4ebA7PRZgit9DtyPu9WDwsv6ck;
        r7.<init>(r9, r11, r10);
        r0 = r9.c;
        r1 = r9.d;
        r1 = r1.d();
        r0.a(r7, r1);
        r0 = r9.d;
        r1 = r9.l;
        r0 = r0.c(r1);
        if (r0 == 0) goto L_0x0103;
    L_0x00ea:
        r0 = r9.h;
        r1 = defpackage.ecc.SINGLE_FLASH;
        if (r0 == r1) goto L_0x0103;
    L_0x00f0:
        r0 = r9.s;
        r0 = r0.get();
        r0 = (android.os.Handler) r0;
        r1 = r9.d;
        r2 = r9.l;
        r1 = r1.d(r2);
        r0.postDelayed(r8, r1);
    L_0x0103:
        r0 = new dwh$d;
        r0.<init>(r14);
        r17 = r0;
        r17 = (defpackage.dpa) r17;
        r6 = new -$$Lambda$dwm$lKBUovEUsaiVWbjEHr_DTqPpcbo;
        r0 = r6;
        r1 = r18;
        r2 = r15;
        r4 = r19;
        r5 = r20;
        r20 = r6;
        r6 = r21;
        r23 = r7;
        r7 = r17;
        r0.<init>(r1, r2, r4, r5, r6, r7, r8);
        r0 = new dwh$c;
        r0.<init>(r14);
        r7 = r0;
        r7 = (defpackage.dpa) r7;
        r14 = new dwm$16;
        r0 = r14;
        r4 = r20;
        r5 = r23;
        r6 = r22;
        r8 = r21;
        r0.<init>(r2, r4, r5, r6, r7, r8);
        r0 = r9.d;	 Catch:{ ecr -> 0x0168 }
        r1 = r9.l;	 Catch:{ ecr -> 0x0168 }
        r0 = r0.s(r1);	 Catch:{ ecr -> 0x0168 }
        if (r0 == 0) goto L_0x0157;
    L_0x0141:
        r0 = r9.c;	 Catch:{ ecr -> 0x0168 }
        r1 = r9.d;	 Catch:{ ecr -> 0x0168 }
        r2 = r9.l;	 Catch:{ ecr -> 0x0168 }
        r1 = r1.t(r2);	 Catch:{ ecr -> 0x0168 }
        r3 = r20;
        r0.a(r3, r1);	 Catch:{ ecr -> 0x0167 }
        r0 = r9.f;	 Catch:{ ecr -> 0x0167 }
        r1 = 0;
        r0.a(r1, r14);	 Catch:{ ecr -> 0x0167 }
        return;
    L_0x0157:
        r3 = r20;
        r0 = r9.f;	 Catch:{ ecr -> 0x0167 }
        r3.getClass();	 Catch:{ ecr -> 0x0167 }
        r1 = new -$$Lambda$e-vF8UwVQElaoI246C6KhYx1078;	 Catch:{ ecr -> 0x0167 }
        r1.<init>(r3);	 Catch:{ ecr -> 0x0167 }
        r0.a(r1, r14);	 Catch:{ ecr -> 0x0167 }
        return;
    L_0x0167:
        goto L_0x016a;
    L_0x0168:
        r3 = r20;
    L_0x016a:
        r0 = r9.c;
        r1 = r23;
        r0.a(r1);
        r0 = r9.c;
        r0.a(r3);
        r0 = r9.u;
        if (r11 == 0) goto L_0x017b;
    L_0x017a:
        goto L_0x017c;
    L_0x017b:
        r12 = 1;
    L_0x017c:
        r0.a(r12);
        r0 = r9.a;
        r2 = defpackage.dpa.a.CAPTURE_ERROR;
        r4 = r9.l;
        r5 = r18.x();
        r6 = defpackage.dpa.b.API;
        r3 = "Camera native exception";
        r1 = r19;
        r0.a(r1, r2, r3, r4, r5, r6);
        r18.t();
        r0 = r11 ^ 1;
        r9.c(r0);
        return;
    L_0x019b:
        r7 = r23;
    L_0x019d:
        r0 = defpackage.dpa.b.API;
        if (r5 != r0) goto L_0x01a5;
    L_0x01a1:
        r0 = defpackage.dpa.b.SCREENSHOT;
        r8 = r0;
        goto L_0x01a6;
    L_0x01a5:
        r8 = r5;
    L_0x01a6:
        r0 = r9.u;
        if (r11 == 0) goto L_0x01ab;
    L_0x01aa:
        goto L_0x01ac;
    L_0x01ab:
        r12 = 1;
    L_0x01ac:
        r0.a(r12);
        r0 = r9.a;
        r2 = 0;
        r3 = 0;
        r5 = r18.k();
        r6 = r18.l();
        r1 = r19;
        r4 = r8;
        r0.a(r1, r2, r3, r4, r5, r6);
        r0 = r9.u;
        r1 = r9.I;
        r4 = 0;
        r5 = 0;
        r2 = r8;
        r3 = r21;
        r6 = r23;
        r7 = r19;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwm.b(dpa, dpa$b, dpa$c, boolean, int):void");
    }

    public final void b(boolean z) {
        this.c.a(ecx.SET_FOCUS_MODE.ordinal(), new 4()).sendToTarget();
        if (this.d.g(this.l)) {
            this.c.a(ecx.TURN_OFF_RECORDING_HINT.ordinal(), new 19()).sendToTarget();
        }
        if (!z) {
            this.c.a(ecx.LOCK.ordinal(), new 5()).sendToTarget();
            this.c.a(ecx.RECONNECT.ordinal(), new 6()).sendToTarget();
            this.c.a().k();
        }
    }

    public final List<ece> c() {
        edd edd = this.C;
        return edd == null ? ImmutableList.of() : ImmutableList.copyOf(edd.t);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(doq doq) {
        if (this.i != ecy.ACTIVE) {
            doo doo = this.a;
            StringBuilder stringBuilder = new StringBuilder("wrong state ");
            stringBuilder.append(this.i);
            doo.c(doq, stringBuilder.toString());
            return;
        }
        this.u.f();
        try {
            if (this.t) {
                b((dwg) this.S.get());
            }
            this.f.a(null);
            if (this.q) {
                this.f.j();
                this.q = false;
            }
            this.f.h();
            this.a.a(doq, "stop preview successfully");
            a(ecy.OPENED, eck.stopPreview);
        } catch (ecr e) {
            this.a.b(doq, "stop preview failed: ".concat(String.valueOf(e)));
            throw e;
        } catch (Throwable th) {
            a(ecy.OPENED, eck.stopPreview);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(boolean z) {
        if (this.i == ecy.ACTIVE) {
            if (z) {
                this.u.a(1);
            }
            this.m = false;
            try {
                F();
            } catch (ecr e) {
                this.c.a(ecx.TAKE_PHOTO, e);
            }
        }
    }

    public final List<abtl> d() {
        edd edd = this.C;
        return edd == null ? ImmutableList.of() : ImmutableList.copyOf(edd.p);
    }

    public final List<abtl> e() {
        edd edd = this.C;
        return edd == null ? ImmutableList.of() : ImmutableList.copyOf(edd.q);
    }

    public final List<abtl> f() {
        edd edd = this.C;
        return edd == null ? ImmutableList.of() : ImmutableList.copyOf(edd.r);
    }

    public final List<abtl> g() {
        edd edd = this.C;
        return edd == null ? Collections.emptyList() : new ArrayList(edd.s);
    }

    public final int h() {
        edd edd = this.C;
        return edd == null ? 0 : edd.n;
    }

    public final List<ecb> i() {
        edd edd = this.C;
        return edd == null ? ImmutableList.of() : ImmutableList.copyOf(edd.o);
    }

    public final void j() {
        this.c.a(ecx.SET_FOCUS_MODE.ordinal(), new -$$Lambda$dwm$C-GExqMpaJ_KAZ66fOLi5RfKFFw(this)).sendToTarget();
    }

    public final float k() {
        edd edd = this.C;
        return edd == null ? dvf.a.a : edd.v;
    }

    public final float l() {
        edd edd = this.C;
        return edd == null ? dvf.a.b : edd.w;
    }

    public final abtl m() {
        return (abtl) ((Optional) this.H.p()).orNull();
    }

    public final ajdp<Optional<abtl>> n() {
        return this.H;
    }

    public final boolean o() {
        return this.l;
    }

    public final ecc p() {
        return dvf.a();
    }

    public final abtl q() {
        return this.I;
    }

    public final dpp r() {
        return this;
    }

    public final ede[] s() {
        ede[] edeArr = this.B;
        if (edeArr != null) {
            return edeArr;
        }
        int i = 0;
        while (true) {
            i++;
            if (i > 2) {
                return null;
            }
            try {
                CameraInfo[] l = dwj.l();
                ede[] edeArr2 = new ede[l.length];
                for (int i2 = 0; i2 < l.length; i2++) {
                    int i3 = l[i2].facing;
                    ebx ebx = i3 != 0 ? i3 != 1 ? ebx.NONE : ebx.FRONT_FACING : ebx.BACK_FACING;
                    edeArr2[i2] = new ede(ebx, Integer.toString(i2), l[i2].orientation, Boolean.valueOf(l[i2].canDisableShutterSound));
                }
                this.B = edeArr2;
                return this.B;
            } catch (ecr e) {
                this.w.a(e, dnj.a.callsite("Camera1Manager").a("getCameraInfo"));
                e.getMessage();
            }
        }
    }

    public final eca t() {
        return eca.CAMERA1;
    }

    public final void u() {
        this.c.a(ecx.PREPARE_GL_RESOURCE.ordinal(), new -$$Lambda$dwm$Z8Qx_Fm3KBhqORiNlv9RpjvCQ-w(this)).sendToTarget();
    }

    public final void v() {
        this.c.a(ecx.RELEASE_GL_RESOURCE.ordinal(), new -$$Lambda$dwm$RvKMOdDK0od7mZUFGn_9w9D2Hl8(this)).sendToTarget();
    }

    public final void w() {
        v();
        this.c.a().k();
    }

    /* Access modifiers changed, original: protected|final */
    public final int x() {
        return (this.k + (this.l ? 180 : 0)) % 360;
    }

    /* Access modifiers changed, original: protected|final */
    public final void y() {
        dwj dwj = this.f;
        if (dwj != null) {
            dwj.k();
        }
    }
}
