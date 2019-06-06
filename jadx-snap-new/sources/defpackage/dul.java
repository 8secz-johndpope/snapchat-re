package defpackage;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import defpackage.ablu.c;
import defpackage.dpa.b;
import defpackage.dpe.a;
import defpackage.dqz.f;
import defpackage.dqz.g;
import defpackage.dqz.h;
import defpackage.dqz.l;
import defpackage.dqz.n;
import defpackage.ebi.d;
import defpackage.ebi.i;
import defpackage.ebi.j;
import defpackage.ebi.k;
import defpackage.ebi.m;
import defpackage.ebi.p;
import defpackage.ebi.q;
import defpackage.ebi.r;
import defpackage.ebi.t;
import defpackage.ebi.u;
import defpackage.epm.1;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dul */
public final class dul implements dpe {
    private ajei A = new ajei();
    private final boolean B;
    final abpt<a> a;
    final zfw b;
    final ajei c = new ajei();
    final ajdv<duu> d;
    final eil e;
    final eik f;
    final duk g;
    final dun h;
    final dup i;
    UUID j;
    final f k;
    absz<c> l;
    private final dnx m;
    private final dqi n;
    private final odu o;
    private final ftl p;
    private final duo<aeew> q;
    private final duh r;
    private final Supplier<Boolean> s;
    private final Supplier<Integer> t;
    private final Supplier<adfh> u;
    private final dqr v;
    private final duj w;
    private boolean x;
    private boolean y = false;
    private boolean z = true;

    /* renamed from: dul$c */
    enum c {
        READY,
        INITIALIZING,
        CAPTURE_AFTER_INITIALIZED,
        CANCEL_AFTER_INITIALIZED,
        RELEASE_AFTER_INITIALIZED,
        INITIALIZED,
        CAPTURING,
        CANCELING,
        CAPTURE_AFTER_CANCELED,
        INITIALIZE_AFTER_CANCELED
    }

    /* renamed from: dul$b */
    enum b implements absz.a<c, ebi> {
        ;

        private b(String str) {
        }
    }

    /* renamed from: dul$a */
    enum a implements defpackage.absz.a<c, absy> {
        INITIALIZE_CAPTURE_REQUEST,
        INITIALIZE_COMPLETE,
        START_CAPTURE_REQUEST,
        STOP_CAPTURE_REQUEST,
        CANCEL_START,
        CANCEL_COMPLETE
    }

    /* renamed from: dul$f */
    class f {
        volatile e a;
        volatile odt b;
        volatile String c;
        volatile boolean d;
        volatile boolean e;

        f() {
        }

        public final void a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = false;
            this.e = false;
        }
    }

    /* renamed from: dul$d */
    class d implements dpa {
        private final boolean a;
        private ajwr<abyi> b;
        private AtomicBoolean c = new AtomicBoolean(false);
        private String d;

        d(ajwr<abyi> ajwr, String str, boolean z) {
            this.b = ajwr;
            this.d = str;
            this.a = z;
        }

        private /* synthetic */ void b() {
            Iterator it = dul.this.a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }

        public final void a() {
            dul.this.g.a();
        }

        public final void a(dpa.a aVar, String str, boolean z, int i, b bVar) {
            if (this.c.compareAndSet(false, true)) {
                dul dul;
                ebi ebi;
                int i2 = 1.a[aVar.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        dul = dul.this;
                        ebi = q.d;
                    }
                    if (!this.b.j() && !this.b.k()) {
                        ajwr ajwr = this.b;
                        StringBuilder stringBuilder = new StringBuilder("onTakePictureFailed: ");
                        stringBuilder.append(aVar);
                        stringBuilder.append(ppy.d);
                        stringBuilder.append(str);
                        ajwr.a(new gce(stringBuilder.toString(), (byte) 0));
                        return;
                    }
                }
                dul = dul.this;
                ebi = r.d;
                dul.a(ebi);
                if (!this.b.j()) {
                }
            }
        }

        public final void a(b bVar) {
            Iterator it = dul.this.a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(aesf.IMAGE, false);
            }
            if (this.a) {
                dul.this.a(this.b, dnh.f.callsite("CaptureModelImpl").a("onShutter"));
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x015b in {2, 6, 17, 18, 19, 20, 21, 22, 24, 26} preds:[]
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
        public final void a(defpackage.dpb r1, java.lang.Integer r2, java.lang.String r3, long r4, boolean r6, int r7, defpackage.dpa.b r8) {
            /*
            r0 = this;
            r2 = defpackage.dul.this;
            r2 = r2.g;
            r2.b();
            r2 = defpackage.dul.this;
            r2 = r2.c;
            r3 = new -$$Lambda$dul$d$5IuOW9Pi4noplbNRSVQfVSzYWqo;
            r3.<init>(r0);
            r3 = defpackage.ajcx.a(r3);
            r4 = defpackage.dul.this;
            r4 = r4.b;
            r4 = r4.l();
            r4 = (defpackage.zfr) r4;
            r3 = r3.b(r4);
            r3 = r3.e();
            r2.a(r3);
            r2 = defpackage.dul.this;
            r2 = r2.h;
            r3 = defpackage.dul.this;
            r3 = r3.j;
            r4 = r0.d;
            r5 = new aeew;
            r5.<init>();
            r3 = r3.toString();
            r5.h = r3;
            r3 = defpackage.aesf.IMAGE;
            r3 = r3.a();
            r3 = java.lang.Integer.valueOf(r3);
            r5.a = r3;
            r3 = java.lang.Integer.valueOf(r7);
            r5.b = r3;
            r3 = java.lang.Boolean.valueOf(r6);
            r5.c = r3;
            r3 = r1.a();
            r3 = java.lang.Integer.valueOf(r3);
            r5.q = r3;
            r3 = r1.b();
            r3 = java.lang.Integer.valueOf(r3);
            r5.p = r3;
            r2.a(r5, r4);
            r2 = defpackage.dul.this;
            r2 = r2.c;
            r3 = defpackage.dnh.f;
            r4 = "CaptureModelImpl";
            r3 = r3.callsite(r4);
            r4 = defpackage.dul.this;
            r4 = r4.i;
            r6 = "takePictureResult";
            defpackage.akcr.b(r1, r6);
            r6 = "callsite";
            defpackage.akcr.b(r3, r6);
            r6 = r1 instanceof defpackage.dpb.a;
            if (r6 == 0) goto L_0x00ae;
            r1 = (defpackage.dpb.a) r1;
            r1 = r1.a;
            r4 = r4.a;
            r3 = r4.a(r3, r1);
            r4 = defpackage.dup.a.a;
            r4 = (defpackage.ajfc) r4;
            r3 = r3.a(r4);
            r4 = new dup$b;
            r4.<init>(r1);
            r4 = (defpackage.ajev) r4;
            r1 = r3.b(r4);
            r3 = "mediaPackageManager.crea…y { refBitmap.dispose() }";
            defpackage.akcr.a(r1, r3);
            goto L_0x00c6;
            r6 = r1 instanceof defpackage.dpb.b;
            if (r6 == 0) goto L_0x013d;
            r4 = r4.a;
            r3 = r4.a(r3);
            r4 = new dup$c;
            r4.<init>(r1);
            r4 = (defpackage.ajfc) r4;
            r1 = r3.a(r4);
            r3 = "mediaPackageManager.crea…                        }";
            goto L_0x00aa;
            r3 = new -$$Lambda$dul$d$mgRq3vsZ1cmqY0xfXnyPp5g1O0s;
            r3.<init>(r0, r5);
            r1 = r1.f(r3);
            r3 = defpackage.dul.this;
            r4 = new -$$Lambda$dul$d$o_xJWeOH78Vxw1CTfoDG-9y7lLs;
            r4.<init>(r3);
            r1 = r1.a(r4);
            r3 = defpackage.dul.this;
            r3 = r3.b;
            r3 = r3.h();
            r3 = (defpackage.ajdw) r3;
            r1 = r1.b(r3);
            r3 = defpackage.dul.this;
            r3 = r3.b;
            r3 = r3.h();
            r3 = (defpackage.ajdw) r3;
            r1 = r1.a(r3);
            r3 = new -$$Lambda$dul$d$bNwMRB6njkO-qL-dKUgWngqpuJU;
            r3.<init>(r0);
            r4 = new -$$Lambda$dul$d$pVfb2nNVKweL_IaLprquE3aGec8;
            r4.<init>(r0);
            r1 = r1.a(r3, r4);
            r2.a(r1);
            r1 = defpackage.dul.this;
            r1 = r1.g;
            r2 = r1.a;
            r3 = defpackage.epm.1.e;
            r4 = r8.ordinal();
            r3 = r3[r4];
            r4 = 1;
            if (r3 == r4) goto L_0x0132;
            r4 = 2;
            if (r3 == r4) goto L_0x012f;
            r4 = 3;
            if (r3 == r4) goto L_0x012c;
            r4 = 4;
            if (r3 == r4) goto L_0x0129;
            r4 = 5;
            if (r3 == r4) goto L_0x0126;
            r3 = 0;
            goto L_0x0134;
            r3 = defpackage.ablu.c.API_FALLBACK;
            goto L_0x0134;
            r3 = defpackage.ablu.c.POST_PROCESSING_SCREENSHOT;
            goto L_0x0134;
            r3 = defpackage.ablu.c.TAKE_PICTURE_API;
            goto L_0x0134;
            r3 = defpackage.ablu.c.SCREENSHOT_PLUS;
            goto L_0x0134;
            r3 = defpackage.ablu.c.SCREENSHOT;
            r2.a(r3);
            r2 = defpackage.aesf.IMAGE;
            r1.a(r2, r5);
            return;
            r1 = new java.lang.RuntimeException;
            r2 = new java.lang.StringBuilder;
            r3 = "Unexpected TakePictureResult type。 Current type is ";
            r2.<init>(r3);
            r3 = r4.getClass();
            r3 = r3.getName();
            r2.append(r3);
            r2 = r2.toString();
            r1.<init>(r2);
            r1 = (java.lang.Throwable) r1;
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dul$d.a(dpb, java.lang.Integer, java.lang.String, long, boolean, int, dpa$b):void");
        }

        public final void a(dpb dpb, String str, long j, b bVar) {
        }
    }

    /* renamed from: dul$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[dpa.a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.dpa.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.dpa.a.INVALID_STATE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.dpa.a.CAPTURE_ERROR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dul$1.<clinit>():void");
        }
    }

    /* renamed from: dul$e */
    class e extends ieo implements dqx {
        public e() {
            dnh.f.callsite("CaptureModelImpl");
            super((byte) 0);
        }

        public final void a() {
        }

        public final void a(int i, boolean z, abtl abtl, long j, long j2) {
            m();
            if (dul.this.c.isDisposed()) {
                dul.this.g.a(defpackage.ebi.e.d);
                abqt.a(dul.this.k.b);
                dul.this.k.a();
                return;
            }
            dul.this.g.b();
            Iterator it = dul.this.a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
            dun dun = dul.this.h;
            UUID uuid = dul.this.j;
            String str = dul.this.k.c;
            aeew aeew = new aeew();
            aeew.h = uuid.toString();
            aeew.a = Integer.valueOf(aesf.VIDEO.a());
            aeew.b = Integer.valueOf(i);
            boolean z2 = dun.a.a() && !z;
            aeew.c = Boolean.valueOf(z2);
            aeew.q = Integer.valueOf(abtl.b());
            aeew.p = Integer.valueOf(abtl.c());
            aeew.o = Long.valueOf(j);
            aeew.u = Long.valueOf(j2);
            dun.a(aeew, str);
            Object obj = dul.this.k.b;
            if (obj == null) {
                dul.this.g.a(new t("null media package builder"));
            } else {
                idd a = dnh.f.callsite("CaptureModelImpl").a("onVideoRecordingComplete");
                ajei ajei = dul.this.c;
                ajdx b = ajdx.b(obj).f(new -$$Lambda$dul$e$oP151gTBFq5X08e1e01wk5H2ulo(this, aeew)).a(new -$$Lambda$dul$e$XecdrA1IwsBCGpkyvyz4Xf_oTfY(dul.this)).b((ajdw) dul.this.b.h());
                obj.getClass();
                ajei.a(b.b(new -$$Lambda$U-heeSf9dNAfEgzyRBp9qwqz0l0(obj)).a((ajdw) dul.this.b.l()).a(new -$$Lambda$dul$e$vuwVW36zWH8IWy7uN_dcBAcaFCo(this, a), new -$$Lambda$dul$e$z7NhCxKrEE17KdEI94S5b9MDayY(this)));
            }
            dul.this.k.a();
            dul.this.g.a(aesf.VIDEO, aeew);
        }

        public final void a(dqu dqu, boolean z) {
            duk duk = dul.this.g;
            duk.b.a(dqu);
            ablu ablu = duk.a;
            int i = 1.d[dqu.ordinal()];
            c cVar = i != 1 ? i != 2 ? null : c.ANDROID_MEDIA_RECORDER : c.SC_MEDIA_RECORDER;
            ablu.a(cVar);
            dul.this.g.a();
            Iterator it = dul.this.a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(aesf.VIDEO, z);
            }
        }

        public final void a(dqz dqz) {
            m();
            if (dqz instanceof l) {
                dul.this.g.b.a(dof.a.RECORDING_TOO_SHORT);
                dul.this.f();
            } else {
                t tVar;
                Object obj;
                absz absz = dul.this.l;
                b bVar = b.ENCOUNTER_ERROR;
                akcr.b(dqz, "receiver$0");
                if (dqz instanceof n) {
                    tVar = new t(dqz.a);
                } else if (dqz instanceof dqz.b) {
                    tVar = new ebi.c(dqz.a);
                } else if (dqz instanceof f) {
                    tVar = new i(dqz.a);
                } else if (dqz instanceof g) {
                    tVar = new j(dqz.a);
                } else if (dqz instanceof h) {
                    tVar = new k(dqz.a);
                } else if (dqz instanceof dqz.i) {
                    tVar = new m(dqz.a);
                } else if (dqz instanceof dqz.c) {
                    tVar = new ebi.f(dqz.a);
                } else if (dqz instanceof dqz.k) {
                    tVar = new p(dqz.a);
                } else if (dqz instanceof defpackage.dqz.e) {
                    tVar = new ebi.h(dqz.a);
                } else if (dqz instanceof dqz.a) {
                    tVar = new ebi.a(dqz.a);
                } else if (dqz instanceof dqz.j) {
                    tVar = new ebi.n(dqz.a);
                } else {
                    obj = u.d;
                    absz.a(bVar, obj);
                }
                obj = tVar;
                absz.a(bVar, obj);
            }
            abqt.a(dul.this.k.b);
            dul.this.k.a();
        }
    }

    public dul(dnx dnx, dqi dqi, ajdv<duu> ajdv, odu odu, ftl ftl, duo<aeew> duo, duh duh, Supplier<Boolean> supplier, ajwl<Integer> ajwl, Supplier<adfh> supplier2, eil eil, eik eik, dqr dqr, duk duk, dun dun, dup dup, duj duj) {
        duk duk2 = duk;
        this.m = dnx;
        this.n = dqi;
        this.d = ajdv;
        this.o = odu;
        this.p = ftl;
        this.q = duo;
        this.e = eil;
        this.r = duh;
        this.s = supplier;
        this.f = eik;
        this.u = supplier2;
        this.v = dqr;
        this.g = duk2;
        this.h = dun;
        this.i = dup;
        this.w = duj;
        ajwl.getClass();
        this.t = new -$$Lambda$mrgh4ffROL2QI1oQzU60etYyvZs(ajwl);
        this.a = new abpt();
        this.b = zgb.a(dnh.f.callsite("CaptureModelImpl"));
        this.c.a(this.A);
        this.k = new f();
        boolean z = this.m.a() && this.p.a(dnd.EARLY_INIT_RECORDER_ENABLED);
        this.B = z;
        z = this.B;
        duk2.e = z;
        Object obj = c.READY;
        ajei ajei = this.c;
        ajei.getClass();
        abta.a a = abta.a(obj, new -$$Lambda$mel42v5AXbZcvAypz7TBWMcjMnk(ajei));
        a.a(c.READY, a.START_CAPTURE_REQUEST, c.CAPTURING).a(new -$$Lambda$dul$t06_234XnCSuwy87-2nEPSqVfjk(this));
        a.a(c.CAPTURING, a.STOP_CAPTURE_REQUEST, c.READY).a(new -$$Lambda$dul$Ck7-5s6ne3dLoKtK_2T3JcINFxs(this));
        a.a(EnumSet.complementOf(EnumSet.of(c.INITIALIZING)), b.ENCOUNTER_ERROR, c.CANCELING).a(new -$$Lambda$dul$zhMeg2yN8ZbwiPE1DTj7wWhE29M(this));
        a.a(c.CANCELING, a.CANCEL_COMPLETE, c.READY);
        a.a(c.CANCELING, a.START_CAPTURE_REQUEST, c.CAPTURE_AFTER_CANCELED);
        a.a(c.CAPTURE_AFTER_CANCELED, a.CANCEL_COMPLETE, c.CAPTURING).a(new -$$Lambda$dul$t06_234XnCSuwy87-2nEPSqVfjk(this));
        if (z) {
            a.a(c.INITIALIZING, b.ENCOUNTER_ERROR, c.CANCELING).a(new -$$Lambda$dul$xlDxoqBYNQZ4SBewXahfppOMYqk(this));
            a.a(c.READY, a.INITIALIZE_CAPTURE_REQUEST, c.INITIALIZING).a(new -$$Lambda$dul$vewr2iFG2bQ-X5v1XgDEC7f_BGY(this));
            a.a(c.INITIALIZING, a.INITIALIZE_COMPLETE, c.INITIALIZED);
            a.a(Sets.immutableEnumSet(c.INITIALIZING, c.CANCEL_AFTER_INITIALIZED, c.RELEASE_AFTER_INITIALIZED), a.START_CAPTURE_REQUEST, c.CAPTURE_AFTER_INITIALIZED);
            a.a(c.INITIALIZING, a.CANCEL_START, c.CANCEL_AFTER_INITIALIZED);
            a.a(c.CANCEL_AFTER_INITIALIZED, a.INITIALIZE_CAPTURE_REQUEST, c.INITIALIZING);
            a.a(c.INITIALIZED, a.START_CAPTURE_REQUEST, c.CAPTURING).a(new -$$Lambda$dul$aqPB7OF-X8TNWEQ_YJKQC1Gr5_k(this));
            a.a(c.INITIALIZED, a.CANCEL_START, c.CANCELING).a(new -$$Lambda$dul$CWBcSiYwdCrHzZdwye3sp8Mk5Vk(this));
            a.a(c.CANCEL_AFTER_INITIALIZED, a.INITIALIZE_COMPLETE, c.CANCELING).a(new -$$Lambda$dul$CWBcSiYwdCrHzZdwye3sp8Mk5Vk(this));
            a.a(c.CAPTURE_AFTER_INITIALIZED, a.INITIALIZE_COMPLETE, c.CAPTURING).a(new -$$Lambda$dul$aqPB7OF-X8TNWEQ_YJKQC1Gr5_k(this));
            a.a(c.INITIALIZE_AFTER_CANCELED, a.START_CAPTURE_REQUEST, c.CAPTURE_AFTER_CANCELED);
            a.a(c.CANCELING, a.INITIALIZE_CAPTURE_REQUEST, c.INITIALIZE_AFTER_CANCELED);
            a.a(c.INITIALIZE_AFTER_CANCELED, a.CANCEL_COMPLETE, c.INITIALIZING).a(new -$$Lambda$dul$vewr2iFG2bQ-X5v1XgDEC7f_BGY(this));
            a.a(c.INITIALIZING, a.STOP_CAPTURE_REQUEST, c.RELEASE_AFTER_INITIALIZED);
            a.a(c.CAPTURE_AFTER_INITIALIZED, a.STOP_CAPTURE_REQUEST, c.RELEASE_AFTER_INITIALIZED).a(new -$$Lambda$dul$Ck7-5s6ne3dLoKtK_2T3JcINFxs(this));
            a.a(c.INITIALIZED, a.STOP_CAPTURE_REQUEST, c.CANCELING).a(new -$$Lambda$dul$CWBcSiYwdCrHzZdwye3sp8Mk5Vk(this));
            a.a(c.RELEASE_AFTER_INITIALIZED, a.INITIALIZE_COMPLETE, c.CANCELING).a(new -$$Lambda$dul$CWBcSiYwdCrHzZdwye3sp8Mk5Vk(this));
            a.a(c.CAPTURE_AFTER_CANCELED, a.STOP_CAPTURE_REQUEST, c.CANCELING).a(new -$$Lambda$Zcp4SlFt7Zt_FdvqP2t7aRyOt0I(this));
            a.a(c.INITIALIZE_AFTER_CANCELED, a.STOP_CAPTURE_REQUEST, c.CANCELING);
        }
        this.l = a.a("CaptureModelImpl.videoStateMachine");
    }

    private void a(boolean z, ebi ebi) {
        if (!(z || (ebi instanceof d))) {
            a(ebi);
        }
        j();
    }

    private synchronized void g() {
        this.c.a(k().b((ajdw) this.b.f()).a((ajdw) this.b.l()).a(new -$$Lambda$dul$zpvuifmURDkGxbnSu-aBBQPk-S8(this), new -$$Lambda$dul$ulnegA2pc3josns7tOnrgJJhkeE(this)));
    }

    private synchronized void h() {
        this.c.a(l().b((ajdw) this.b.h()).a((ajdw) this.b.l()).a(-$$Lambda$dul$XirZv8CoCu_Gh0BTu71YqjF7CHU.INSTANCE, new -$$Lambda$dul$kCOOZxgzDlrYP8epMRiyveibOJg(this)));
    }

    private synchronized void i() {
        this.c.a(k().b(l()).b((ajdw) this.b.h()).a((ajdw) this.b.l()).a(-$$Lambda$dul$cZ6KlqR31DXYHqo2ZtloEXXkmLQ.INSTANCE, new -$$Lambda$dul$uw5tjx27BnjTFmO6KkdPUFBFz8w(this)));
    }

    private void j() {
        this.c.a(m().b((ajdw) this.b.f()).a((ajdw) this.b.l()).g(new -$$Lambda$dul$WXFpXx_AL24GcXLwhNGEHMz31f0(this)));
    }

    private ajcx k() {
        return this.o.a(dnh.f.callsite("CaptureModelImpl")).e(new -$$Lambda$dul$gkMPpjr5Fj_6emPb0GrwkTOBmiE(this));
    }

    private ajcx l() {
        return ajcx.a(new -$$Lambda$dul$NkJewzTO8gMEAQTkdW7klP6tU1M(this));
    }

    private ajcx m() {
        return ajcx.a(new -$$Lambda$dul$C0F3wNkpfq_f8wzSEj93iGs2dsk(this));
    }

    private synchronized void n() {
        dqx dqx = this.k.a;
        this.x = true;
        if (this.y) {
            this.m.a(dqx);
        } else {
            f();
        }
    }

    private /* synthetic */ void o() {
        this.m.a(this.n.a());
        e eVar = this.k.a;
        odt odt = this.k.b;
        if (eVar != null) {
            eVar.m();
        }
        if (odt != null) {
            try {
                odt.close();
            } catch (IOException unused) {
            }
        }
    }

    private /* synthetic */ void p() {
        this.g.a(aaig.TAP_AND_HOLD);
        synchronized (this) {
            if (this.x) {
                throw new dui.a("finishCaptureVideo already called. skipping startCaptureVideo.");
            }
            e eVar = this.k.a;
            if (eVar != null) {
                dpp a = this.n.a();
                if (a != null) {
                    this.m.a(eVar, a, this.e.b, this.e.c());
                    this.y = true;
                } else {
                    throw new dui.c("startCaptureVideoInternal with null cameraProxy");
                }
            }
            throw new dui.b("The video recording callback is null");
        }
    }

    private /* synthetic */ void q() {
        this.k.a();
        this.l.a(a.CANCEL_COMPLETE);
    }

    private static /* synthetic */ void r() {
    }

    private static /* synthetic */ void s() {
    }

    private /* synthetic */ void t() {
        this.l.a(a.INITIALIZE_COMPLETE);
    }

    private /* synthetic */ void u() {
        this.l.a(a.CANCEL_START);
    }

    private /* synthetic */ Long v() {
        return Long.valueOf(this.p.h(dnd.DELAY_RELEASE_RECORDER_MS));
    }

    public final synchronized void a() {
        if (!this.z) {
            this.A.a();
            this.l.a(a.INITIALIZE_CAPTURE_REQUEST);
        }
        this.z = false;
    }

    /* Access modifiers changed, original: final */
    public final void a(ajdx<abyi> ajdx, idd idd) {
        a(idd);
        this.g.c();
        this.d.a(new duu(ajdx, aesf.IMAGE, false, this.e.c()));
    }

    public final synchronized void a(b bVar, boolean z) {
        ajdx ajwr = new ajwr();
        String str = this.e.b;
        if (z) {
            a(ajwr, dnh.f.callsite("CaptureModelImpl").a("startCapturePicture"));
        }
        this.n.a(new d(ajwr, str, !z), bVar, ((Boolean) this.s.get()).booleanValue() ? dpa.c.JPEG : dpa.c.BITMAP);
        this.g.a(str);
    }

    public final void a(a aVar) {
        this.a.c(aVar);
    }

    /* Access modifiers changed, original: final */
    public final void a(ebi ebi) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(ebi);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(idd idd) {
        this.r.a(edj.FREEZE);
        if (((Boolean) this.s.get()).booleanValue()) {
            this.r.a(idd.a("batchCaptureMode"));
        }
    }

    public final synchronized void a(boolean z, boolean z2) {
        String str = this.e.b;
        this.x = false;
        this.y = false;
        f fVar = this.k;
        fVar.d = z;
        fVar.e = z2;
        fVar.c = str;
        this.g.a(str);
        this.l.a(a.START_CAPTURE_REQUEST);
    }

    public final synchronized void b() {
        this.A.a(ajdx.c(new -$$Lambda$dul$yyX2ZZ5s_LXGuM5Blq4fif-UTtI(this)).e(-$$Lambda$dul$61Mg5otvKuEpNREpLGtvgwRMm8k.INSTANCE).b((ajdw) this.b.f()).a((ajdw) this.b.l()).g(new -$$Lambda$dul$fC2eOIhESN6dG46hKGnGtB9JupQ(this)));
    }

    public final void b(a aVar) {
        this.a.d(aVar);
    }

    public final synchronized void c() {
        this.l.a(a.STOP_CAPTURE_REQUEST);
    }

    public final synchronized void d() {
        this.m.a(null);
        this.c.a(m().e());
        this.c.dispose();
    }

    public final void e() {
        UUID a = abpu.a();
        this.q.a.clear();
        this.j = a;
        duk duk = this.g;
        UUID uuid = this.j;
        duk.d = uuid;
        duk.a.a(uuid);
        ablb ablb = (ablb) duk.c.get();
        akcr.b(uuid, "captureSession");
        abkz abkz = ablb.a;
        if (abkz != null) {
            abkz.b = uuid;
        }
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
    }
}
