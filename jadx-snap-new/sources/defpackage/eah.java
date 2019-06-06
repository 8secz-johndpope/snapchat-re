package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.eae.a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: eah */
final class eah implements dqg, dqj {
    final dqo a;
    final Supplier<dny> b;
    final ead c;
    final eag d;
    private final dpf e;
    private final dou f;
    private final dvo g;
    private final Supplier<Handler> h;

    /* renamed from: eah$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[a.values().length];
        static final /* synthetic */ int[] c = new int[ebx.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a4 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Missing block: B:41:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.ebx.values();
            r0 = r0.length;
            r0 = new int[r0];
            c = r0;
            r0 = 1;
            r1 = c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.ebx.FRONT_FACING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = c;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.ebx.BACK_FACING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = c;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = defpackage.ebx.NONE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = defpackage.eaj.values();
            r3 = r3.length;
            r3 = new int[r3];
            b = r3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = defpackage.eaj.OPENING;	 Catch:{ NoSuchFieldError -> 0x003d }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x003d }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x003d }
        L_0x003d:
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r4 = defpackage.eaj.OPENED;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r3[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r4 = defpackage.eaj.STOPPING;	 Catch:{ NoSuchFieldError -> 0x0051 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0051 }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x0051 }
        L_0x0051:
            r3 = 4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x005c }
            r5 = defpackage.eaj.STARTING;	 Catch:{ NoSuchFieldError -> 0x005c }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x005c }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x005c }
        L_0x005c:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r5 = defpackage.eaj.STARTED;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r6 = 5;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r5 = defpackage.eaj.CLOSING;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
            r6 = 6;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0072 }
        L_0x0072:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x007d }
            r5 = defpackage.eaj.CLOSED;	 Catch:{ NoSuchFieldError -> 0x007d }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x007d }
            r6 = 7;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x007d }
        L_0x007d:
            r4 = defpackage.eae.a.values();
            r4 = r4.length;
            r4 = new int[r4];
            a = r4;
            r4 = a;	 Catch:{ NoSuchFieldError -> 0x0090 }
            r5 = defpackage.eae.a.OPEN;	 Catch:{ NoSuchFieldError -> 0x0090 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0090 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0090 }
        L_0x0090:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x009a }
            r4 = defpackage.eae.a.START;	 Catch:{ NoSuchFieldError -> 0x009a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x009a }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x009a }
        L_0x009a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00a4 }
            r1 = defpackage.eae.a.STOP;	 Catch:{ NoSuchFieldError -> 0x00a4 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a4 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00a4 }
        L_0x00a4:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00ae }
            r1 = defpackage.eae.a.CLOSE;	 Catch:{ NoSuchFieldError -> 0x00ae }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ae }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00ae }
        L_0x00ae:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eah$2.<clinit>():void");
        }
    }

    /* renamed from: eah$b */
    class b implements dop {
        private b() {
        }

        /* synthetic */ b(eah eah, byte b) {
            this();
        }

        public final void a() {
            synchronized (eah.this.d) {
                if (eah.this.d.i != eaj.OPENING) {
                    eah.this.b.get();
                    eah.this.d.i.name();
                    return;
                }
                eah eah = eah.this;
                eaj eaj = eaj.CLOSED;
                edo edo = edo.onDeviceOpenFailure;
                dnj.a.callsite("ScCameraServiceImpl").a("onDeviceOpenFailure");
                eah.a(eaj, edo, null);
                eah.this.d.n();
                eah.this.d.g = null;
                eah.this.c.d();
                eah.this.a(a.OPEN);
                eah.a(eah.this, edl.CAMERA_OPEN_FAILURE);
                eah.this.a("onDeviceOpenFailure");
                eah.this.b.get();
            }
        }

        public final void a(dpp dpp, abtl abtl, long j, dnm dnm) {
            synchronized (eah.this.d) {
                if (eah.this.d.i != eaj.OPENING) {
                    eah.this.b.get();
                    eah.this.d.i.name();
                    return;
                }
                eah.this.d.g = dpp;
                eah.this.c.a.a(Optional.of(dpp));
                eah.this.d.a = abtl;
                eah.this.d.b = dpp.q();
                eah eah = eah.this;
                eaj eaj = eaj.OPENED;
                edo edo = edo.onCameraOpened;
                dnj.a.callsite("ScCameraServiceImpl").a("onCameraOpened");
                eah.a(eaj, edo, null);
                eah.this.a("onCameraOpened");
                eah.this.d.o();
                eah.this.d.a(dnm);
                eah = eah.this;
                eah.a.a(eah.this.d.c);
                edi edi = (edi) Preconditions.checkNotNull(eah.this.d.d);
                eah.this.a.a(edi);
                ((dny) eah.this.b.get()).b(j);
            }
        }
    }

    /* renamed from: eah$c */
    class c implements doq {
        private c() {
        }

        /* synthetic */ c(eah eah, byte b) {
            this();
        }

        private void e() {
            synchronized (eah.this.d) {
                if (eah.this.d.i != eaj.STARTING) {
                    eah.this.b.get();
                    eah.this.d.i.name();
                    return;
                }
                eah eah = eah.this;
                eaj eaj = eaj.OPENED;
                edo edo = edo.onStartPreviewFailure;
                dnj.a.callsite("ScCameraServiceImpl").a("onStartPreviewFailure");
                eah.a(eaj, edo, null);
                eah.a(eah.this, edl.START_PREVIEW_FAILURE);
                eah.this.a(a.START);
                eah.this.a("onStartPreviewFailure");
                eah.this.b.get();
            }
        }

        public final void a() {
            ((dny) eah.this.b.get()).a(abmb.START_PREVIEW_UI_THREAD_COMPLETE);
        }

        public final void b() {
            e();
        }

        public final void c() {
            e();
        }

        public final void d() {
            ((dny) eah.this.b.get()).a(abmb.START_PREVIEW_BG_THREAD_COMPLETE);
            synchronized (eah.this.d) {
                if (eah.this.d.i != eaj.STARTING) {
                    eah.this.b.get();
                    eah.this.d.i.name();
                    return;
                }
                eah.this.b.get();
                eah eah = eah.this;
                eaj eaj = eaj.STARTED;
                edo edo = edo.onStartPreviewSuccess;
                dnj.a.callsite("ScCameraServiceImpl").a("startPreviewInternal");
                eah.a(eaj, edo, null);
                Preconditions.checkNotNull(eah.this.d.g);
                eah.this.a(eah.this.d.g);
                eah.this.a("onPreviewStarted");
            }
        }
    }

    /* renamed from: eah$d */
    class d implements doq {
        private d() {
        }

        /* synthetic */ d(eah eah, byte b) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0052 in {7, 9, 11, 14, 17} preds:[]
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
        private void a(boolean r6) {
            /*
            r5 = this;
            r0 = defpackage.eah.this;
            r0 = r0.d;
            monitor-enter(r0);
            r1 = defpackage.eah.this;	 Catch:{ all -> 0x004f }
            r1 = r1.d;	 Catch:{ all -> 0x004f }
            r1 = r1.i;	 Catch:{ all -> 0x004f }
            r2 = defpackage.eaj.STOPPING;	 Catch:{ all -> 0x004f }
            if (r1 == r2) goto L_0x0021;	 Catch:{ all -> 0x004f }
            r6 = defpackage.eah.this;	 Catch:{ all -> 0x004f }
            r6 = r6.b;	 Catch:{ all -> 0x004f }
            r6.get();	 Catch:{ all -> 0x004f }
            r6 = defpackage.eah.this;	 Catch:{ all -> 0x004f }
            r6 = r6.d;	 Catch:{ all -> 0x004f }
            r6 = r6.i;	 Catch:{ all -> 0x004f }
            r6.name();	 Catch:{ all -> 0x004f }
            monitor-exit(r0);	 Catch:{ all -> 0x004f }
            return;	 Catch:{ all -> 0x004f }
            if (r6 == 0) goto L_0x002b;	 Catch:{ all -> 0x004f }
            r6 = defpackage.eah.this;	 Catch:{ all -> 0x004f }
            r6 = r6.b;	 Catch:{ all -> 0x004f }
            r6.get();	 Catch:{ all -> 0x004f }
            goto L_0x0030;	 Catch:{ all -> 0x004f }
            r6 = defpackage.eah.this;	 Catch:{ all -> 0x004f }
            r6 = r6.b;	 Catch:{ all -> 0x004f }
            goto L_0x0027;	 Catch:{ all -> 0x004f }
            r6 = defpackage.eah.this;	 Catch:{ all -> 0x004f }
            r1 = defpackage.eaj.OPENED;	 Catch:{ all -> 0x004f }
            r2 = defpackage.edo.onStopPreviewDone;	 Catch:{ all -> 0x004f }
            r3 = defpackage.dnj.a;	 Catch:{ all -> 0x004f }
            r4 = "ScCameraServiceImpl";	 Catch:{ all -> 0x004f }
            r3 = r3.callsite(r4);	 Catch:{ all -> 0x004f }
            r4 = "onStopPreviewDone";	 Catch:{ all -> 0x004f }
            r3.a(r4);	 Catch:{ all -> 0x004f }
            r6.a(r1, r2, null);	 Catch:{ all -> 0x004f }
            r6 = defpackage.eah.this;	 Catch:{ all -> 0x004f }
            r1 = "onPreviewStopped";	 Catch:{ all -> 0x004f }
            r6.a(r1);	 Catch:{ all -> 0x004f }
            monitor-exit(r0);	 Catch:{ all -> 0x004f }
            return;	 Catch:{ all -> 0x004f }
            r6 = move-exception;	 Catch:{ all -> 0x004f }
            monitor-exit(r0);	 Catch:{ all -> 0x004f }
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eah$d.a(boolean):void");
        }

        public final void a() {
            a(true);
        }

        public final void b() {
            a(false);
        }

        public final void c() {
            a(false);
        }

        public final void d() {
        }
    }

    /* renamed from: eah$e */
    static class e implements dpc {
        final dqh a;
        private final CountDownLatch b;
        private final Supplier<Handler> c;

        /* renamed from: eah$e$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                e.this.a.a(edk.END);
            }
        }

        e(dqh dqh, boolean z, Supplier<Handler> supplier) {
            this.a = dqh;
            this.b = z ? new CountDownLatch(1) : null;
            this.c = supplier;
        }

        public final void a(ebt ebt) {
            CountDownLatch countDownLatch = this.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            } else {
                ((Handler) this.c.get()).post(new 1());
            }
        }

        public final void a(edk edk) {
            try {
                this.b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                if (abss.a().c()) {
                    throw new RuntimeException(e);
                }
            }
            this.a.a(edk);
        }
    }

    /* renamed from: eah$a */
    class a implements don {
        private a() {
        }

        /* synthetic */ a(eah eah, byte b) {
            this();
        }

        public final void a() {
            synchronized (eah.this.d) {
                if (eah.this.d.i != eaj.CLOSING) {
                    eah.this.b.get();
                    eah.this.d.i.name();
                    return;
                }
                eah eah = eah.this;
                eaj eaj = eaj.CLOSED;
                edo edo = edo.onCameraClosed;
                dnj.a.callsite("ScCameraServiceImpl").a("onCameraClosed");
                eah.a(eaj, edo, null);
                eah.this.d.n();
                eah.this.c.d();
                eah.this.a("onCameraClosed");
                eah.this.b.get();
            }
        }
    }

    eah(dqo dqo, dpf dpf, dvo dvo, eag eag, ead ead, Supplier<dny> supplier, Supplier<Handler> supplier2, dou dou) {
        this.a = dqo;
        this.e = dpf;
        this.g = dvo;
        this.c = ead;
        this.f = dou;
        this.d = eag;
        this.b = supplier;
        this.h = supplier2;
        this.d.k = Suppliers.memoize(new -$$Lambda$eah$EGnHgUshBk23hmg1lbvaFm_HVxQ(dvo));
    }

    private Supplier<dvn> a(eca eca) {
        return eca == ((dvn) this.d.k.get()).t() ? this.d.k : Suppliers.memoize(new -$$Lambda$eah$mGjWLDawrhd4y1wvJtOTNsDCAOY(this));
    }

    private static void a(dqk dqk, dpf dpf, dpp dpp, Supplier<dvn> supplier, Set<iih<dqh>> set) {
        Preconditions.checkNotNull(dqk);
        dqk.a();
        dqk.a(null);
        if (dpp != null) {
            dpp.a(null);
        }
        ((dvn) supplier.get()).a(null);
        if (dpf.b()) {
            ((dvn) supplier.get()).v();
        } else {
            ((dvn) supplier.get()).w();
        }
        for (iih iih : set) {
            dqh dqh = (dqh) iih.get();
            if (dqh != null) {
                dqh.a(edk.END);
            }
        }
    }

    private void a(a aVar, eca eca, ebx ebx, edi edi, doc doc, boolean z, idd idd) {
        this.d.l.add(new eae(aVar, eca, ebx, edi, doc, false, idd));
        c();
    }

    private void a(eae eae, String str) {
        int i = 2.a[eae.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        StringBuilder stringBuilder = new StringBuilder("unexpected operation ");
                        stringBuilder.append(eae.a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else if (this.d.i == eaj.OPENED) {
                        this.b.get();
                        ((dvn) this.d.k.get()).a(new a(this, (byte) 0));
                        if (eae.e) {
                            ((dvn) this.d.k.get()).v();
                        }
                        a(eaj.CLOSING, edo.close, str);
                        this.d.l.poll();
                    }
                } else if (this.d.i == eaj.STARTED) {
                    this.b.get();
                    Preconditions.checkNotNull(this.d.g);
                    this.d.g.a(new d(this, (byte) 0));
                    a(eaj.STOPPING, edo.stop, str);
                    this.d.l.poll();
                }
            } else if (this.d.i == eaj.OPENED) {
                Preconditions.checkNotNull(this.d.g);
                ((dny) this.b.get()).a(abmb.START_PREVIEW_TRIGGERED);
                this.b.get();
                this.d.g.a(new c(this, (byte) 0), this.f);
                a(eaj.STARTING, edo.start, str);
                this.d.l.poll();
            }
        } else if (this.d.i == eaj.CLOSED) {
            Preconditions.checkNotNull(eae.d);
            ((dny) this.b.get()).a(abmb.CAMERA_OPEN_TRIGGERED);
            this.d.k = a(eae.b);
            ((dvn) this.d.k.get()).u();
            ((dvn) this.d.k.get()).a(eae.d, eah.a(eae.c), this.d.j, new b(this, (byte) 0));
            a(eaj.OPENING, edo.open, str);
            this.d.e = eae.b;
            this.d.c = eae.c;
            this.d.d = eae.d;
            this.d.l.poll();
            ((dny) this.b.get()).a(eae.b, eae.c, eae.d, eae.f);
            this.d.j = null;
        }
    }

    private void a(eaj eaj, edo edo, String str) {
        eaj eaj2 = this.d.i;
        this.d.i = eaj;
        dpj.a(eaj2.name(), eaj.name(), edo, str);
    }

    private void a(String str) {
        if (!this.d.l.isEmpty()) {
            a((eae) this.d.l.peek(), str);
        }
    }

    private static boolean a(ebx ebx) {
        int i = 2.c[ebx.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("not expecting this camera type ".concat(String.valueOf(ebx)));
    }

    private eae b() {
        if (!this.d.l.isEmpty()) {
            return (eae) this.d.l.getLast();
        }
        a aVar;
        switch (this.d.i) {
            case OPENING:
            case OPENED:
            case STOPPING:
                aVar = a.OPEN;
                break;
            case STARTING:
            case STARTED:
                aVar = a.START;
                break;
            case CLOSING:
            case CLOSED:
                aVar = a.CLOSE;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder("unexpected state ");
                stringBuilder.append(this.d.i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        return new eae(aVar, this.d.e, this.d.c, this.d.d, null, false, dnj.a.callsite("ScCameraServiceImpl").a("getLastPendingCameraOperation"));
    }

    private void b(dqh dqh, edj edj, boolean z, edk edk, idd idd) {
        if (this.d.i == eaj.NOT_INIT) {
            dqh.a(edk);
            return;
        }
        iih iih = new iih(dqh);
        if (this.d.m.contains(iih)) {
            if (this.d.n.contains(iih)) {
                if (this.d.o.contains(iih)) {
                    this.d.n.remove(iih);
                } else {
                    this.d.m.remove(iih);
                    this.d.n.remove(iih);
                    dqh.a(edk);
                    if (this.d.m.isEmpty()) {
                        Preconditions.checkNotNull(this.d.h);
                        this.d.h.b(idd);
                    }
                    return;
                }
            }
            ebu c = dqh.c();
            dpp dpp = this.d.g == null ? (dpp) this.d.k.get() : this.d.g;
            dpc eVar = new e(dqh, z, this.h);
            Object obj = c.a;
            if (obj instanceof SurfaceTexture) {
                dpp.a((SurfaceTexture) obj, eVar, edj);
            } else if (obj instanceof Surface) {
                dpp.a((Surface) obj, eVar, edj);
            } else {
                StringBuilder stringBuilder = new StringBuilder("unexpected surface class ");
                stringBuilder.append(obj.getClass());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (z) {
                eVar.a(edk);
            }
            this.d.o.remove(iih);
            this.d.m.remove(iih);
            if (this.d.m.isEmpty()) {
                Preconditions.checkNotNull(this.d.h);
                this.d.h.b(idd);
            }
            return;
        }
        dqh.a(edk);
    }

    private void c() {
        if (this.d.l.size() >= 2) {
            this.d.l.size();
            eae eae = (eae) this.d.l.removeLast();
            int i = 2.a[eae.a.ordinal()];
            boolean z = false;
            if (i == 1) {
                if (((eae) this.d.l.getLast()).a == a.CLOSE) {
                    z = true;
                }
                Preconditions.checkArgument(z);
                if (this.d.e == eae.b && this.d.c == eae.c && this.d.d == eae.d) {
                    this.d.l.removeLast();
                } else {
                    this.d.l.add(eae);
                }
            } else if (i != 2) {
                if (i == 3) {
                    if (((eae) this.d.l.getLast()).a == a.START) {
                        z = true;
                    }
                    Preconditions.checkArgument(z);
                    this.d.l.removeLast();
                } else if (i != 4) {
                    throw new IllegalArgumentException("unexpected camera operation ".concat(String.valueOf(eae)));
                } else if (((eae) this.d.l.getLast()).a == a.OPEN) {
                    this.d.l.removeLast();
                } else {
                    this.d.l.add(eae);
                }
            } else if (((eae) this.d.l.getLast()).a == a.STOP) {
                this.d.l.removeLast();
            } else {
                this.d.l.add(eae);
            }
        }
    }

    private /* synthetic */ dvn d() {
        return this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        synchronized (this.d) {
            if (this.d.i == eaj.NOT_INIT) {
                return;
            }
            dqk dqk = this.d.h;
            dpp dpp = this.d.g;
            dvq dvq = this.d.f;
            dvq.b.d();
            dvq.a.d();
            Supplier supplier = this.d.k;
            this.d.n.clear();
            this.d.o.clear();
            Set hashSet = new HashSet(this.d.m);
            this.d.m.clear();
            this.d.l.clear();
            this.d.g = null;
            this.c.d();
            this.d.n();
            this.d.h = null;
            this.d.j = null;
            a(eaj.NOT_INIT, edo.release, null);
            dpf dpf = this.e;
            this.b.get();
            eah.a(dqk, dpf, dpp, supplier, hashSet);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(dpp dpp) {
        for (iih iih : this.d.n) {
            final dqh dqh = (dqh) iih.get();
            if (dqh != null) {
                Object obj = dqh.c().a;
                ecu b = dqh.b();
                dov 1 = new dov() {
                    public final void a() {
                        dqh.a(edk.END);
                    }

                    public final void a(long j) {
                        ((dny) eah.this.b.get()).a(j);
                        synchronized (eah.this.d) {
                            if (eah.this.d.g == null) {
                                eah.this.d.k.get();
                            }
                            dqh.d();
                        }
                    }
                };
                if (obj instanceof SurfaceTexture) {
                    dpp.a((SurfaceTexture) obj, b, 1, dqh.a());
                } else if (obj instanceof Surface) {
                    dpp.a((Surface) obj, b, 1, null, dqh.a());
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unsupported surface type ");
                    stringBuilder.append(obj.getClass());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.d.o.add(iih);
            }
        }
        this.d.n.clear();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:75:0x01f0 in {5, 8, 10, 22, 25, 36, 37, 39, 46, 47, 53, 54, 61, 62, 67, 69, 71, 74} preds:[]
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
    public final void a(defpackage.dqh r15, defpackage.edi r16, defpackage.ebx r17, defpackage.edg.a r18, defpackage.doc r19, defpackage.idd r20) {
        /*
        r14 = this;
        r9 = r14;
        r0 = r15;
        r10 = r16;
        r11 = r17;
        r1 = r18;
        r12 = r9.d;
        monitor-enter(r12);
        r2 = r9.d;	 Catch:{ all -> 0x01ed }
        r2 = r2.i;	 Catch:{ all -> 0x01ed }
        r3 = defpackage.eaj.NOT_INIT;	 Catch:{ all -> 0x01ed }
        if (r2 != r3) goto L_0x0027;	 Catch:{ all -> 0x01ed }
        r1 = r9.d;	 Catch:{ all -> 0x01ed }
        r1 = r1.k;	 Catch:{ all -> 0x01ed }
        r1 = r1.get();	 Catch:{ all -> 0x01ed }
        r1 = (defpackage.dvn) r1;	 Catch:{ all -> 0x01ed }
        r1.t();	 Catch:{ all -> 0x01ed }
        r1 = defpackage.edl.NOT_INIT;	 Catch:{ all -> 0x01ed }
        r15.a(r1);	 Catch:{ all -> 0x01ed }
        goto L_0x01e3;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.ebx.FRONT_FACING;	 Catch:{ all -> 0x01ed }
        if (r11 != r2) goto L_0x0033;	 Catch:{ all -> 0x01ed }
        r2 = r9.g;	 Catch:{ all -> 0x01ed }
        r2 = r2.a();	 Catch:{ all -> 0x01ed }
        r13 = r2;	 Catch:{ all -> 0x01ed }
        goto L_0x0042;	 Catch:{ all -> 0x01ed }
        r2 = r9.d;	 Catch:{ all -> 0x01ed }
        r2 = r2.k;	 Catch:{ all -> 0x01ed }
        r2 = r2.get();	 Catch:{ all -> 0x01ed }
        r2 = (defpackage.dvn) r2;	 Catch:{ all -> 0x01ed }
        r2 = r2.t();	 Catch:{ all -> 0x01ed }
        goto L_0x0031;	 Catch:{ all -> 0x01ed }
        r2 = new iih;	 Catch:{ all -> 0x01ed }
        r2.<init>(r15);	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.m;	 Catch:{ all -> 0x01ed }
        r0 = r0.contains(r2);	 Catch:{ all -> 0x01ed }
        if (r0 == 0) goto L_0x007d;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.k;	 Catch:{ all -> 0x01ed }
        r0 = r0.get();	 Catch:{ all -> 0x01ed }
        r0 = (defpackage.dvn) r0;	 Catch:{ all -> 0x01ed }
        r0 = r0.t();	 Catch:{ all -> 0x01ed }
        if (r13 != r0) goto L_0x007d;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.c;	 Catch:{ all -> 0x01ed }
        if (r11 != r0) goto L_0x007d;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.d;	 Catch:{ all -> 0x01ed }
        if (r10 != r0) goto L_0x007d;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.j;	 Catch:{ all -> 0x01ed }
        if (r0 == 0) goto L_0x007d;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.j;	 Catch:{ all -> 0x01ed }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x01ed }
        if (r0 != 0) goto L_0x01e3;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.m;	 Catch:{ all -> 0x01ed }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x01ed }
        if (r0 == 0) goto L_0x0095;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.h;	 Catch:{ all -> 0x01ed }
        com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.h;	 Catch:{ all -> 0x01ed }
        r0.b();	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0.j = r1;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.m;	 Catch:{ all -> 0x01ed }
        r0.add(r2);	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.n;	 Catch:{ all -> 0x01ed }
        r0.add(r2);	 Catch:{ all -> 0x01ed }
        r0 = defpackage.ebx.NONE;	 Catch:{ all -> 0x01ed }
        if (r11 == r0) goto L_0x01e5;	 Catch:{ all -> 0x01ed }
        r0 = r14.b();	 Catch:{ all -> 0x01ed }
        r1 = defpackage.eah.2.a;	 Catch:{ all -> 0x01ed }
        r2 = r0.a;	 Catch:{ all -> 0x01ed }
        r2 = r2.ordinal();	 Catch:{ all -> 0x01ed }
        r1 = r1[r2];	 Catch:{ all -> 0x01ed }
        r2 = 1;	 Catch:{ all -> 0x01ed }
        if (r1 == r2) goto L_0x0186;	 Catch:{ all -> 0x01ed }
        r2 = 2;	 Catch:{ all -> 0x01ed }
        if (r1 == r2) goto L_0x0144;	 Catch:{ all -> 0x01ed }
        r2 = 3;	 Catch:{ all -> 0x01ed }
        if (r1 == r2) goto L_0x00fd;	 Catch:{ all -> 0x01ed }
        r2 = 4;	 Catch:{ all -> 0x01ed }
        if (r1 != r2) goto L_0x00e7;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.OPEN;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r3 = r13;	 Catch:{ all -> 0x01ed }
        r4 = r17;	 Catch:{ all -> 0x01ed }
        r5 = r16;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.START;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r3 = r13;	 Catch:{ all -> 0x01ed }
        r4 = r17;	 Catch:{ all -> 0x01ed }
        r5 = r16;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        goto L_0x01c9;	 Catch:{ all -> 0x01ed }
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x01ed }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ed }
        r3 = "unexpected operation ";	 Catch:{ all -> 0x01ed }
        r2.<init>(r3);	 Catch:{ all -> 0x01ed }
        r0 = r0.a;	 Catch:{ all -> 0x01ed }
        r2.append(r0);	 Catch:{ all -> 0x01ed }
        r0 = r2.toString();	 Catch:{ all -> 0x01ed }
        r1.<init>(r0);	 Catch:{ all -> 0x01ed }
        throw r1;	 Catch:{ all -> 0x01ed }
        r1 = r9.d;	 Catch:{ all -> 0x01ed }
        r1 = r1.e;	 Catch:{ all -> 0x01ed }
        r2 = r9.d;	 Catch:{ all -> 0x01ed }
        r2 = r2.k;	 Catch:{ all -> 0x01ed }
        r2 = r2.get();	 Catch:{ all -> 0x01ed }
        r2 = (defpackage.dvn) r2;	 Catch:{ all -> 0x01ed }
        r2 = r2.t();	 Catch:{ all -> 0x01ed }
        if (r1 != r2) goto L_0x0120;	 Catch:{ all -> 0x01ed }
        r1 = r9.d;	 Catch:{ all -> 0x01ed }
        r1 = r1.c;	 Catch:{ all -> 0x01ed }
        if (r1 != r11) goto L_0x0120;	 Catch:{ all -> 0x01ed }
        r1 = r9.d;	 Catch:{ all -> 0x01ed }
        r1 = r1.d;	 Catch:{ all -> 0x01ed }
        if (r1 != r10) goto L_0x0120;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.START;	 Catch:{ all -> 0x01ed }
        goto L_0x00d7;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.CLOSE;	 Catch:{ all -> 0x01ed }
        r3 = r0.b;	 Catch:{ all -> 0x01ed }
        r4 = r0.c;	 Catch:{ all -> 0x01ed }
        r5 = r0.d;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.OPEN;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r3 = r13;	 Catch:{ all -> 0x01ed }
        r4 = r17;	 Catch:{ all -> 0x01ed }
        r5 = r16;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.START;	 Catch:{ all -> 0x01ed }
        goto L_0x00d7;	 Catch:{ all -> 0x01ed }
        r1 = r0.b;	 Catch:{ all -> 0x01ed }
        if (r1 != r13) goto L_0x0150;	 Catch:{ all -> 0x01ed }
        r1 = r0.c;	 Catch:{ all -> 0x01ed }
        if (r1 != r11) goto L_0x0150;	 Catch:{ all -> 0x01ed }
        r1 = r0.d;	 Catch:{ all -> 0x01ed }
        if (r1 == r10) goto L_0x01c9;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.STOP;	 Catch:{ all -> 0x01ed }
        r3 = r0.b;	 Catch:{ all -> 0x01ed }
        r4 = r0.c;	 Catch:{ all -> 0x01ed }
        r5 = r0.d;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.CLOSE;	 Catch:{ all -> 0x01ed }
        r3 = r0.b;	 Catch:{ all -> 0x01ed }
        r4 = r0.c;	 Catch:{ all -> 0x01ed }
        r5 = r0.d;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.OPEN;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r3 = r13;	 Catch:{ all -> 0x01ed }
        r4 = r17;	 Catch:{ all -> 0x01ed }
        r5 = r16;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.START;	 Catch:{ all -> 0x01ed }
        goto L_0x00d7;	 Catch:{ all -> 0x01ed }
        r1 = r0.b;	 Catch:{ all -> 0x01ed }
        r2 = r9.d;	 Catch:{ all -> 0x01ed }
        r2 = r2.k;	 Catch:{ all -> 0x01ed }
        r2 = r2.get();	 Catch:{ all -> 0x01ed }
        r2 = (defpackage.dvn) r2;	 Catch:{ all -> 0x01ed }
        r2 = r2.t();	 Catch:{ all -> 0x01ed }
        if (r1 != r2) goto L_0x01a4;	 Catch:{ all -> 0x01ed }
        r1 = r0.c;	 Catch:{ all -> 0x01ed }
        if (r1 != r11) goto L_0x01a4;	 Catch:{ all -> 0x01ed }
        r1 = r0.d;	 Catch:{ all -> 0x01ed }
        if (r1 != r10) goto L_0x01a4;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.START;	 Catch:{ all -> 0x01ed }
        goto L_0x00d7;	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.CLOSE;	 Catch:{ all -> 0x01ed }
        r3 = r0.b;	 Catch:{ all -> 0x01ed }
        r4 = r0.c;	 Catch:{ all -> 0x01ed }
        r5 = r0.d;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.OPEN;	 Catch:{ all -> 0x01ed }
        r7 = 0;	 Catch:{ all -> 0x01ed }
        r1 = r14;	 Catch:{ all -> 0x01ed }
        r3 = r13;	 Catch:{ all -> 0x01ed }
        r4 = r17;	 Catch:{ all -> 0x01ed }
        r5 = r16;	 Catch:{ all -> 0x01ed }
        r6 = r19;	 Catch:{ all -> 0x01ed }
        r8 = r20;	 Catch:{ all -> 0x01ed }
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x01ed }
        r2 = defpackage.eae.a.START;	 Catch:{ all -> 0x01ed }
        goto L_0x00d7;	 Catch:{ all -> 0x01ed }
        r0 = "subscribe";	 Catch:{ all -> 0x01ed }
        r14.a(r0);	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.i;	 Catch:{ all -> 0x01ed }
        r1 = defpackage.eaj.STARTED;	 Catch:{ all -> 0x01ed }
        if (r0 != r1) goto L_0x01e3;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.g;	 Catch:{ all -> 0x01ed }
        if (r0 == 0) goto L_0x01e3;	 Catch:{ all -> 0x01ed }
        r0 = r9.d;	 Catch:{ all -> 0x01ed }
        r0 = r0.g;	 Catch:{ all -> 0x01ed }
        r14.a(r0);	 Catch:{ all -> 0x01ed }
        monitor-exit(r12);	 Catch:{ all -> 0x01ed }
        return;	 Catch:{ all -> 0x01ed }
        r0 = new java.lang.UnsupportedOperationException;	 Catch:{ all -> 0x01ed }
        r1 = "invalid none camera type";	 Catch:{ all -> 0x01ed }
        r0.<init>(r1);	 Catch:{ all -> 0x01ed }
        throw r0;	 Catch:{ all -> 0x01ed }
        r0 = move-exception;	 Catch:{ all -> 0x01ed }
        monitor-exit(r12);	 Catch:{ all -> 0x01ed }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eah.a(dqh, edi, ebx, edg$a, doc, idd):void");
    }

    public final void a(dqh dqh, edj edj, boolean z, edk edk, idd idd) {
        synchronized (this.d) {
            b(dqh, edj, z, edk, idd);
        }
    }

    public final void a(dqh dqh, idd idd) {
        a(dqh, edj.FREEZE, false, edk.END, idd);
    }

    /* Access modifiers changed, original: final */
    public final void a(dqk dqk, idd idd) {
        if (this.d.i == eaj.NOT_INIT) {
            ((dvn) this.d.k.get()).u();
            eag eag = this.d;
            eag.h = dqk;
            eag.h.a((dqj) this);
            a(eaj.CLOSED, edo.prepare, null);
            eag eag2 = this.d;
            eag2.a(((dvn) eag2.k.get()).s());
            eag2 = this.d;
            eag2.e = ((dvn) eag2.k.get()).t();
            this.d.h.a(idd);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(a aVar) {
        boolean z = aVar == a.START || aVar == a.OPEN;
        Preconditions.checkArgument(z, aVar);
        if (!this.d.l.isEmpty()) {
            eae eae = (eae) this.d.l.poll();
            if (aVar != a.START && eae.a != a.CLOSE) {
                int i = 2;
                while (true) {
                    int i2 = i - 1;
                    if (i > 0 && !this.d.l.isEmpty()) {
                        this.d.l.poll();
                        i = i2;
                    }
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x0076 in {6, 10, 19, 21, 22, 23, 24, 27, 30} preds:[]
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
    public final void a(defpackage.idd r12) {
        /*
        r11 = this;
        r0 = r11.d;
        monitor-enter(r0);
        r1 = r11.d;	 Catch:{ all -> 0x0073 }
        r1 = r1.i;	 Catch:{ all -> 0x0073 }
        r2 = defpackage.eaj.NOT_INIT;	 Catch:{ all -> 0x0073 }
        if (r1 != r2) goto L_0x000d;	 Catch:{ all -> 0x0073 }
        monitor-exit(r0);	 Catch:{ all -> 0x0073 }
        return;	 Catch:{ all -> 0x0073 }
        r1 = r11.d;	 Catch:{ all -> 0x0073 }
        r1 = r1.m;	 Catch:{ all -> 0x0073 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0073 }
        if (r1 != 0) goto L_0x0019;	 Catch:{ all -> 0x0073 }
        monitor-exit(r0);	 Catch:{ all -> 0x0073 }
        return;	 Catch:{ all -> 0x0073 }
        r1 = r11.b();	 Catch:{ all -> 0x0073 }
        r10 = r1.b;	 Catch:{ all -> 0x0073 }
        r2 = defpackage.eah.2.a;	 Catch:{ all -> 0x0073 }
        r3 = r1.a;	 Catch:{ all -> 0x0073 }
        r3 = r3.ordinal();	 Catch:{ all -> 0x0073 }
        r2 = r2[r3];	 Catch:{ all -> 0x0073 }
        r3 = 1;	 Catch:{ all -> 0x0073 }
        if (r2 == r3) goto L_0x0067;	 Catch:{ all -> 0x0073 }
        r3 = 2;	 Catch:{ all -> 0x0073 }
        if (r2 == r3) goto L_0x004c;	 Catch:{ all -> 0x0073 }
        r3 = 3;	 Catch:{ all -> 0x0073 }
        if (r2 == r3) goto L_0x0067;	 Catch:{ all -> 0x0073 }
        r12 = 4;	 Catch:{ all -> 0x0073 }
        if (r2 != r12) goto L_0x0036;	 Catch:{ all -> 0x0073 }
        goto L_0x006c;	 Catch:{ all -> 0x0073 }
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0073 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0073 }
        r3 = "unexpected operation ";	 Catch:{ all -> 0x0073 }
        r2.<init>(r3);	 Catch:{ all -> 0x0073 }
        r1 = r1.a;	 Catch:{ all -> 0x0073 }
        r2.append(r1);	 Catch:{ all -> 0x0073 }
        r1 = r2.toString();	 Catch:{ all -> 0x0073 }
        r12.<init>(r1);	 Catch:{ all -> 0x0073 }
        throw r12;	 Catch:{ all -> 0x0073 }
        r3 = defpackage.eae.a.STOP;	 Catch:{ all -> 0x0073 }
        r5 = defpackage.ebx.NONE;	 Catch:{ all -> 0x0073 }
        r6 = 0;	 Catch:{ all -> 0x0073 }
        r7 = 0;	 Catch:{ all -> 0x0073 }
        r8 = 0;	 Catch:{ all -> 0x0073 }
        r2 = r11;	 Catch:{ all -> 0x0073 }
        r4 = r10;	 Catch:{ all -> 0x0073 }
        r9 = r12;	 Catch:{ all -> 0x0073 }
        r2.a(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0073 }
        r3 = defpackage.eae.a.CLOSE;	 Catch:{ all -> 0x0073 }
        r5 = defpackage.ebx.NONE;	 Catch:{ all -> 0x0073 }
        r6 = 0;	 Catch:{ all -> 0x0073 }
        r7 = 0;	 Catch:{ all -> 0x0073 }
        r8 = 0;	 Catch:{ all -> 0x0073 }
        r2 = r11;	 Catch:{ all -> 0x0073 }
        r4 = r10;	 Catch:{ all -> 0x0073 }
        r9 = r12;	 Catch:{ all -> 0x0073 }
        r2.a(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0073 }
        goto L_0x006c;	 Catch:{ all -> 0x0073 }
        r3 = defpackage.eae.a.CLOSE;	 Catch:{ all -> 0x0073 }
        r5 = defpackage.ebx.NONE;	 Catch:{ all -> 0x0073 }
        goto L_0x005d;	 Catch:{ all -> 0x0073 }
        r12 = "closeCameraOnly";	 Catch:{ all -> 0x0073 }
        r11.a(r12);	 Catch:{ all -> 0x0073 }
        monitor-exit(r0);	 Catch:{ all -> 0x0073 }
        return;	 Catch:{ all -> 0x0073 }
        r12 = move-exception;	 Catch:{ all -> 0x0073 }
        monitor-exit(r0);	 Catch:{ all -> 0x0073 }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eah.a(idd):void");
    }

    public final void b(idd idd) {
        if (this.d.i == eaj.CLOSED) {
            Object obj = (ifs.a.a.d() && ifs.c()) ? 1 : null;
            if (obj != null) {
                eca a = this.g.a();
                eca eca = a;
                ebx c = this.a.c();
                edi b = this.a.b();
                idd idd2 = idd;
                a(a.OPEN, eca, c, b, null, false, idd2);
                a(a.START, eca, c, b, null, false, idd2);
                a("openCameraStartPreview");
            }
        }
    }
}
