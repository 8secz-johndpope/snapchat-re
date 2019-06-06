package defpackage;

import defpackage.ogw.u;
import defpackage.ogw.v;
import defpackage.yes.b;
import java.util.ArrayList;
import java.util.Map;
import java.util.NavigableMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: oha */
public abstract class oha extends ieo {
    final Map<ohy, ohx> a = new ConcurrentHashMap();
    final NavigableMap<Integer, kaz<jwj>> b = new ConcurrentSkipListMap();
    abyy c;
    b d;
    boolean e;
    final ajwm f;
    ajej g;
    boolean h;
    final idd i;
    final ajdw j;
    final ogw k;
    private final ArrayList<ygm.b<ygk, ygh>> l = new ArrayList();
    private aeew m;
    private abyo n;
    private abye o;
    private abyl p;
    private b q;
    private b r;
    private final String s;
    private final iha t;

    /* renamed from: oha$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ oha a;

        a(oha oha) {
            this.a = oha;
        }

        public final /* synthetic */ Object call() {
            return this.a.l();
        }
    }

    /* renamed from: oha$b */
    static final class b extends akcs implements akbl<abyi, ajcx> {
        private /* synthetic */ oha a;

        b(oha oha) {
            this.a = oha;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            abyi abyi = (abyi) obj;
            if (this.a.h) {
                ogw ogw = this.a.k;
                akcr.a((Object) abyi, "it");
                akcr.b(abyi, "mediaPackage");
                ogw.b(abyi);
                Object a = ((ohj) ogw.l.get()).a().runInTransaction("MediaPackageManagerImpl:persistSession", new u(ogw, abyi)).a((ajfb) new v(ogw, abyi));
                akcr.a(a, "mediaPackageRepository.g…ackage)\n                }");
                obj = a.b((ajdb) this.a.k.a(abyi.a, this.a.i.a("setSoleRecoverableSession")));
                str = "mediaPackageManager.pers…oleRecoverableSession\")))";
            } else {
                obj = ajvo.a(ajhn.a);
                str = "Completable.complete()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: oha$c */
    static final class c<T> implements ajfb<abyi> {
        private /* synthetic */ oha a;

        c(oha oha) {
            this.a = oha;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f.a();
        }
    }

    /* renamed from: oha$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ oha a;

        d(oha oha) {
            this.a = oha;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f.a((Throwable) obj);
        }
    }

    public oha(idd idd, String str, ajdw ajdw, iha iha, ogw ogw) {
        akcr.b(idd, "caller");
        akcr.b(str, "sessionId");
        akcr.b(ajdw, "scheduler");
        akcr.b(iha, "serializationHelper");
        akcr.b(ogw, "mediaPackageManager");
        super((byte) 0);
        this.i = idd;
        this.s = str;
        this.j = ajdw;
        this.t = iha;
        this.k = ogw;
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        this.f = ajwm;
    }

    public odx a(abyi abyi, idd idd) {
        akcr.b(abyi, "mediaPackage");
        akcr.b(idd, "caller");
        return new ogz(idd, abyi, this.c, this.a, this.b, this.k, 4);
    }

    public void a() {
        ajej ajej = this.g;
        if (ajej != null) {
            ajej.dispose();
        }
        for (ohx m : this.a.values()) {
            m.m();
        }
        Object values = this.b.values();
        akcr.a(values, "cachedThumbnails.values");
        for (kaz dispose : (Iterable) values) {
            dispose.dispose();
        }
        for (ygm.b a : this.l) {
            a.a();
        }
    }

    public void a(abye abye) {
        this.o = abye;
    }

    public void a(abyl abyl) {
        this.p = abyl;
    }

    public void a(abyo abyo) {
        this.n = abyo;
    }

    public void a(aeew aeew) {
        this.m = aeew;
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public oha e() {
        b a;
        if (this.q == null) {
            this.l.add(this.k.g.l(ohq.EDITS, c()));
            a = this.k.g.a((ygp) ohq.EDITS, c(), 1);
            if (a != null) {
                this.q = a;
            } else {
                throw new gce("Failed to initialize edits editor");
            }
        }
        if (this.r == null) {
            this.l.add(this.k.g.l(ohq.OVERLAY, c()));
            a = this.k.g.a((ygp) ohq.OVERLAY, c(), 1);
            if (a != null) {
                this.r = a;
            } else {
                throw new gce("Failed to initialize overlay editor");
            }
        }
        return this;
    }

    public b f() {
        if (this.d == null) {
            this.l.add(this.k.g.l(ohq.MEDIA, d()));
            this.d = this.k.g.a((ygp) ohq.MEDIA, d(), 1);
        }
        b bVar = this.d;
        if (bVar != null) {
            return bVar;
        }
        throw new gce("Failed to initialize media editor");
    }

    public aeew g() {
        return this.m;
    }

    public abye h() {
        return this.o;
    }

    public abyo i() {
        return this.n;
    }

    public abyl j() {
        return this.p;
    }

    /* Access modifiers changed, original: final */
    public final abyi k() {
        aeew g = g();
        if (g != null) {
            return new abyi(this.s, b(), c(), d(), g, i(), h(), j());
        }
        throw new IllegalStateException("Media type has not been provided");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:79:0x00d4 in {12, 22, 26, 31, 34, 38, 51, 56, 59, 63, 69, 72, 75, 78} preds:[]
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
    public synchronized defpackage.abyi l() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.r;	 Catch:{ all -> 0x00d1 }
        r1 = 0;	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x0083;	 Catch:{ all -> 0x00d1 }
        r2 = r9.a;	 Catch:{ all -> 0x00d1 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x00d1 }
        if (r2 != 0) goto L_0x0083;
        r2 = r0.d();	 Catch:{ all -> 0x007e }
        r3 = "it.newOutputStream()";	 Catch:{ all -> 0x007e }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x007e }
        r2 = (java.io.Closeable) r2;	 Catch:{ all -> 0x007e }
        r3 = r2;	 Catch:{ Throwable -> 0x0078 }
        r3 = (java.io.FileOutputStream) r3;	 Catch:{ Throwable -> 0x0078 }
        r4 = new ohz$a;	 Catch:{ Throwable -> 0x0078 }
        r5 = r9.i;	 Catch:{ Throwable -> 0x0078 }
        r4.<init>(r5);	 Catch:{ Throwable -> 0x0078 }
        r5 = r9.a;	 Catch:{ Throwable -> 0x0078 }
        r5 = r5.entrySet();	 Catch:{ Throwable -> 0x0078 }
        r5 = r5.iterator();	 Catch:{ Throwable -> 0x0078 }
        r6 = r5.hasNext();	 Catch:{ Throwable -> 0x0078 }
        if (r6 == 0) goto L_0x004f;	 Catch:{ Throwable -> 0x0078 }
        r6 = r5.next();	 Catch:{ Throwable -> 0x0078 }
        r6 = (java.util.Map.Entry) r6;	 Catch:{ Throwable -> 0x0078 }
        r7 = r6.getKey();	 Catch:{ Throwable -> 0x0078 }
        r7 = (defpackage.ohy) r7;	 Catch:{ Throwable -> 0x0078 }
        r6 = r6.getValue();	 Catch:{ Throwable -> 0x0078 }
        r6 = (defpackage.ohx) r6;	 Catch:{ Throwable -> 0x0078 }
        r8 = r9.i;	 Catch:{ Throwable -> 0x0078 }
        r6 = r6.a(r8);	 Catch:{ Throwable -> 0x0078 }
        r4.a(r7, r6);	 Catch:{ Throwable -> 0x0078 }
        goto L_0x002d;	 Catch:{ Throwable -> 0x0078 }
        r4 = r4.a();	 Catch:{ Throwable -> 0x0078 }
        r5 = r9.k;	 Catch:{ all -> 0x0071 }
        r5 = r5.j;	 Catch:{ all -> 0x0071 }
        r5 = r5.get();	 Catch:{ all -> 0x0071 }
        r5 = (defpackage.oec) r5;	 Catch:{ all -> 0x0071 }
        r3 = (java.io.OutputStream) r3;	 Catch:{ all -> 0x0071 }
        r6 = android.graphics.Bitmap.CompressFormat.PNG;	 Catch:{ all -> 0x0071 }
        r5.a(r4, r3, r6);	 Catch:{ all -> 0x0071 }
        r4.m();	 Catch:{ Throwable -> 0x0078 }
        defpackage.akax.a(r2, r1);	 Catch:{ all -> 0x007e }
        r0.e();	 Catch:{ all -> 0x007e }
        r0.h();	 Catch:{ all -> 0x00d1 }
        goto L_0x0083;
        r3 = move-exception;
        r4.m();	 Catch:{ Throwable -> 0x0078 }
        throw r3;	 Catch:{ Throwable -> 0x0078 }
        r3 = move-exception;
        goto L_0x007a;
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0076 }
        defpackage.akax.a(r2, r1);	 Catch:{ all -> 0x007e }
        throw r3;	 Catch:{ all -> 0x007e }
        r1 = move-exception;
        r0.h();	 Catch:{ all -> 0x00d1 }
        throw r1;	 Catch:{ all -> 0x00d1 }
        r0 = r9.q;	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x00bb;	 Catch:{ all -> 0x00d1 }
        r2 = r9.c;	 Catch:{ all -> 0x00d1 }
        if (r2 == 0) goto L_0x00bb;
        r3 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x00b6 }
        r4 = r0.d();	 Catch:{ all -> 0x00b6 }
        r4 = (java.io.OutputStream) r4;	 Catch:{ all -> 0x00b6 }
        r5 = defpackage.akfp.a;	 Catch:{ all -> 0x00b6 }
        r3.<init>(r4, r5);	 Catch:{ all -> 0x00b6 }
        r4 = r3;	 Catch:{ all -> 0x00b6 }
        r4 = (java.io.Closeable) r4;	 Catch:{ all -> 0x00b6 }
        r5 = r9.t;	 Catch:{ Throwable -> 0x00b0 }
        r2 = r5.b(r2);	 Catch:{ Throwable -> 0x00b0 }
        r3.write(r2);	 Catch:{ Throwable -> 0x00b0 }
        defpackage.akax.a(r4, r1);	 Catch:{ all -> 0x00b6 }
        r0.e();	 Catch:{ all -> 0x00b6 }
        r0.h();	 Catch:{ all -> 0x00d1 }
        goto L_0x00bb;
        r2 = move-exception;
        goto L_0x00b2;
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00ae }
        defpackage.akax.a(r4, r1);	 Catch:{ all -> 0x00b6 }
        throw r2;	 Catch:{ all -> 0x00b6 }
        r1 = move-exception;
        r0.h();	 Catch:{ all -> 0x00d1 }
        throw r1;	 Catch:{ all -> 0x00d1 }
        r0 = r9.d;	 Catch:{ all -> 0x00d1 }
        if (r0 == 0) goto L_0x00cb;
        r0.e();	 Catch:{ all -> 0x00c6 }
        r0.h();	 Catch:{ all -> 0x00d1 }
        goto L_0x00cb;	 Catch:{ all -> 0x00d1 }
        r1 = move-exception;	 Catch:{ all -> 0x00d1 }
        r0.h();	 Catch:{ all -> 0x00d1 }
        throw r1;	 Catch:{ all -> 0x00d1 }
        r0 = r9.k();	 Catch:{ all -> 0x00d1 }
        monitor-exit(r9);
        return r0;
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oha.l():abyi");
    }
}
