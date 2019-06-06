package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.fidelius.deps.FideliusHttpInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ibg */
public final class ibg implements hyq {
    private final hyj a;
    private final ajwy<iba> b;
    private final ajwy<ian> c;
    private final Object d;
    private final List<iax> e;
    private final ajwy<hyk> f;
    private final ajwy<hys> g;
    private ibb h;
    private final ajwy<ibi> i;
    private final ajwy<iaw> j;
    private final ajwy<FideliusHttpInterface> k;
    private final ajwy<Context> l;
    private final zfw m;
    private final ajei n;
    private final ajwy<hyz> o;
    private final ajwy<hyo> p;
    private final ajwy<hyl> q;
    private final zgb r;
    private final ajwy<hzb> s;
    private final DbLogger t;
    private final igb u;
    private final gqr v;
    private final ftl w;
    private final hzd x;
    private ahqv y;
    private volatile boolean z;

    /* renamed from: ibg$a */
    public enum a {
        SUCCESS,
        FAILURE,
        NOT_FOUND
    }

    /* renamed from: ibg$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.ibg.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.ibg.a.SUCCESS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.ibg.a.FAILURE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.ibg.a.NOT_FOUND;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ibg$1.<clinit>():void");
        }
    }

    public ibg(ajwy<ian> ajwy, ajwy<hys> ajwy2, ajwy<ibi> ajwy3, ajwy<iaw> ajwy4, hyj hyj, ajwy<hyk> ajwy5, ajwy<FideliusHttpInterface> ajwy6, ajwy<iba> ajwy7, ajwy<Context> ajwy8, zgb zgb, ajwy<hyz> ajwy9, ajwy<hyo> ajwy10, ajei ajei, ajwy<hyl> ajwy11, ajwy<hzb> ajwy12, DbLogger dbLogger, ftl ftl, abss abss, igb igb, gqr gqr, hzd hzd) {
        this(hyj, (ajwy) ajwy7, (ajwy) ajwy, (ajwy) ajwy2, (ajwy) ajwy3, (ajwy) ajwy4, (ajwy) ajwy5, (ajwy) ajwy6, (ajwy) ajwy8, zgb, (ajwy) ajwy9, (ajwy) ajwy10, ajei, (ajwy) ajwy11, (ajwy) ajwy12, dbLogger, ftl, abss, igb, gqr, hzd);
    }

    private ibg(hyj hyj, ajwy<iba> ajwy, ajwy<ian> ajwy2, ajwy<hys> ajwy3, ajwy<ibi> ajwy4, ajwy<iaw> ajwy5, ajwy<hyk> ajwy6, ajwy<FideliusHttpInterface> ajwy7, ajwy<Context> ajwy8, zgb zgb, ajwy<hyz> ajwy9, ajwy<hyo> ajwy10, ajei ajei, ajwy<hyl> ajwy11, ajwy<hzb> ajwy12, DbLogger dbLogger, ftl ftl, abss abss, igb igb, gqr gqr, hzd hzd) {
        this.z = false;
        this.a = hyj;
        this.k = ajwy7;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = new Object();
        this.e = new ArrayList();
        this.f = ajwy6;
        this.g = ajwy3;
        this.h = null;
        this.i = ajwy4;
        this.y = ahqv.STATUS_NOT_STARTED;
        this.j = ajwy5;
        this.l = ajwy8;
        this.r = zgb;
        this.m = zgb.a(hyn.a.callsite("FideliusManagerImpl"));
        this.o = ajwy9;
        this.p = ajwy10;
        this.n = ajei;
        this.q = ajwy11;
        this.s = ajwy12;
        this.t = dbLogger;
        this.w = ftl;
        this.u = igb;
        this.v = gqr;
        this.x = hzd;
        this.m.f().a(new -$$Lambda$ibg$Q9CZuV2HNfRukTw0A0x75wFtRVQ(this));
        if (abss.f()) {
            this.n.a(this.w.p(hzf.FIDELIUS_PUBLISH_LOG_FILE).b((ajdw) this.m.f()).f(-$$Lambda$ibg$Igf2ss1WSK-e4gKZAi2_uNsuz9E.INSTANCE));
        }
    }

    private ibb a(String str, String str2, byte[] bArr, icl icl, DbLogger dbLogger, igb igb) {
        return new ibb((Context) this.l.get(), (hys) this.g.get(), str, str2, bArr, icl, this.r, this.v, this.f, dbLogger, igb);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x00b7 in {7, 12, 14, 23, 29, 32, 34, 37} preds:[]
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
    private defpackage.ibg.a a(java.lang.String r12, byte[] r13, java.lang.String r14) {
        /*
        r11 = this;
        r0 = r11.d;
        monitor-enter(r0);
        r1 = r11.g;	 Catch:{ all -> 0x00b4 }
        r1 = r1.get();	 Catch:{ all -> 0x00b4 }
        r1 = (defpackage.hys) r1;	 Catch:{ all -> 0x00b4 }
        r2 = defpackage.hyt.FIDELIUS_EXISTING_IDENTITY_INIT;	 Catch:{ all -> 0x00b4 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00b4 }
        r2 = android.text.TextUtils.isEmpty(r12);	 Catch:{ all -> 0x00b4 }
        r3 = 0;	 Catch:{ all -> 0x00b4 }
        if (r2 == 0) goto L_0x0029;	 Catch:{ all -> 0x00b4 }
        r12 = r11.f;	 Catch:{ all -> 0x00b4 }
        r12 = r12.get();	 Catch:{ all -> 0x00b4 }
        r12 = (defpackage.hyk) r12;	 Catch:{ all -> 0x00b4 }
        r13 = "failure_hashed_out_beta_empty";	 Catch:{ all -> 0x00b4 }
        r12.a(r1, r14, r13, r3);	 Catch:{ all -> 0x00b4 }
        r12 = defpackage.ibg.a.FAILURE;	 Catch:{ all -> 0x00b4 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b4 }
        return r12;	 Catch:{ all -> 0x00b4 }
        r2 = r11.a;	 Catch:{ all -> 0x00b4 }
        r2 = r2.a(r12);	 Catch:{ all -> 0x00b4 }
        r4 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x00b4 }
        if (r4 == 0) goto L_0x0046;	 Catch:{ all -> 0x00b4 }
        r12 = r11.f;	 Catch:{ all -> 0x00b4 }
        r12 = r12.get();	 Catch:{ all -> 0x00b4 }
        r12 = (defpackage.hyk) r12;	 Catch:{ all -> 0x00b4 }
        r13 = "database_not_found";	 Catch:{ all -> 0x00b4 }
        r12.a(r1, r14, r13, r3);	 Catch:{ all -> 0x00b4 }
        r12 = defpackage.ibg.a.NOT_FOUND;	 Catch:{ all -> 0x00b4 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b4 }
        return r12;
        r1.a();	 Catch:{ IllegalArgumentException -> 0x005e }
        r8 = 0;	 Catch:{ IllegalArgumentException -> 0x005e }
        r9 = r11.t;	 Catch:{ IllegalArgumentException -> 0x005e }
        r10 = r11.u;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = r11;	 Catch:{ IllegalArgumentException -> 0x005e }
        r5 = r12;	 Catch:{ IllegalArgumentException -> 0x005e }
        r6 = r2;	 Catch:{ IllegalArgumentException -> 0x005e }
        r7 = r13;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = r4.a(r5, r6, r7, r8, r9, r10);	 Catch:{ IllegalArgumentException -> 0x005e }
        r11.h = r4;	 Catch:{ IllegalArgumentException -> 0x005e }
        r1.b();	 Catch:{ all -> 0x00b4 }
        goto L_0x0066;
        r12 = move-exception;
        goto L_0x00b0;
        r4 = move-exception;
        r11.h = r3;	 Catch:{ all -> 0x005c }
        r3 = defpackage.abmt.a(r4);	 Catch:{ all -> 0x005c }
        goto L_0x0058;
        r4 = r11.h;	 Catch:{ all -> 0x00b4 }
        if (r4 != 0) goto L_0x0080;	 Catch:{ all -> 0x00b4 }
        r13 = r11.a;	 Catch:{ all -> 0x00b4 }
        r13.a(r12, r2);	 Catch:{ all -> 0x00b4 }
        r12 = r11.f;	 Catch:{ all -> 0x00b4 }
        r12 = r12.get();	 Catch:{ all -> 0x00b4 }
        r12 = (defpackage.hyk) r12;	 Catch:{ all -> 0x00b4 }
        r13 = "db_create_failure";	 Catch:{ all -> 0x00b4 }
        r12.a(r1, r14, r13, r3);	 Catch:{ all -> 0x00b4 }
        r12 = defpackage.ibg.a.FAILURE;	 Catch:{ all -> 0x00b4 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b4 }
        return r12;	 Catch:{ all -> 0x00b4 }
        r12 = r11.a;	 Catch:{ all -> 0x00b4 }
        r12.d();	 Catch:{ all -> 0x00b4 }
        r12 = r11.b;	 Catch:{ all -> 0x00b4 }
        r12 = r12.get();	 Catch:{ all -> 0x00b4 }
        r12 = (defpackage.iba) r12;	 Catch:{ all -> 0x00b4 }
        r2 = new wip;	 Catch:{ all -> 0x00b4 }
        r3 = r11.h;	 Catch:{ all -> 0x00b4 }
        r3 = r3.a;	 Catch:{ all -> 0x00b4 }
        r3 = r3.c;	 Catch:{ all -> 0x00b4 }
        r4 = r11.h;	 Catch:{ all -> 0x00b4 }
        r4 = r4.a;	 Catch:{ all -> 0x00b4 }
        r4 = r4.b;	 Catch:{ all -> 0x00b4 }
        r2.<init>(r13, r3, r4);	 Catch:{ all -> 0x00b4 }
        r12.a(r2);	 Catch:{ all -> 0x00b4 }
        r12 = r11.f;	 Catch:{ all -> 0x00b4 }
        r12 = r12.get();	 Catch:{ all -> 0x00b4 }
        r12 = (defpackage.hyk) r12;	 Catch:{ all -> 0x00b4 }
        r12.a(r1, r14);	 Catch:{ all -> 0x00b4 }
        r12 = defpackage.ibg.a.SUCCESS;	 Catch:{ all -> 0x00b4 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b4 }
        return r12;	 Catch:{ all -> 0x00b4 }
        r1.b();	 Catch:{ all -> 0x00b4 }
        throw r12;	 Catch:{ all -> 0x00b4 }
        r12 = move-exception;	 Catch:{ all -> 0x00b4 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b4 }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibg.a(java.lang.String, byte[], java.lang.String):ibg$a");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00da in {4, 5, 9, 18, 26, 27, 30, 32, 35} preds:[]
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
    private defpackage.ibg.a a(java.lang.String r10, byte[] r11, byte[] r12, byte[] r13, boolean r14) {
        /*
        r9 = this;
        r0 = r9.d;
        monitor-enter(r0);
        if (r14 == 0) goto L_0x0026;
        r1 = r9.p;	 Catch:{ all -> 0x00d7 }
        r1 = r1.get();	 Catch:{ all -> 0x00d7 }
        r1 = (defpackage.hyo) r1;	 Catch:{ all -> 0x00d7 }
        r2 = 1;	 Catch:{ all -> 0x00d7 }
        r1.a(r2);	 Catch:{ all -> 0x00d7 }
        r1 = r9.g;	 Catch:{ all -> 0x00d7 }
        r1 = r1.get();	 Catch:{ all -> 0x00d7 }
        r1 = (defpackage.hys) r1;	 Catch:{ all -> 0x00d7 }
        r3 = defpackage.hyt.FIDELIUS_RECREATE_USER_DB;	 Catch:{ all -> 0x00d7 }
        r1 = r1.a(r3);	 Catch:{ all -> 0x00d7 }
        r3 = "Please shake now, Bug SEC-9995 just happened!";	 Catch:{ all -> 0x00d7 }
        r4 = 0;	 Catch:{ all -> 0x00d7 }
        defpackage.ieg.a(r3, r2, r4);	 Catch:{ all -> 0x00d7 }
        goto L_0x0034;	 Catch:{ all -> 0x00d7 }
        r1 = r9.g;	 Catch:{ all -> 0x00d7 }
        r1 = r1.get();	 Catch:{ all -> 0x00d7 }
        r1 = (defpackage.hys) r1;	 Catch:{ all -> 0x00d7 }
        r2 = defpackage.hyt.FIDELIUS_NEW_IDENTITY_INIT;	 Catch:{ all -> 0x00d7 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00d7 }
        r6 = new icl;	 Catch:{ all -> 0x00d7 }
        r6.<init>(r10, r12, r13);	 Catch:{ all -> 0x00d7 }
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d7 }
        r12.<init>();	 Catch:{ all -> 0x00d7 }
        r13 = defpackage.abpu.a();	 Catch:{ all -> 0x00d7 }
        r12.append(r13);	 Catch:{ all -> 0x00d7 }
        r13 = "_fidelius.db";	 Catch:{ all -> 0x00d7 }
        r12.append(r13);	 Catch:{ all -> 0x00d7 }
        r12 = r12.toString();	 Catch:{ all -> 0x00d7 }
        r13 = 0;
        r1.a();	 Catch:{ IllegalArgumentException -> 0x0066 }
        r7 = r9.t;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r8 = r9.u;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = r9;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r3 = r10;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r4 = r12;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r5 = r11;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = r2.a(r3, r4, r5, r6, r7, r8);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r9.h = r2;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1.b();	 Catch:{ all -> 0x00d7 }
        goto L_0x007b;
        r10 = move-exception;
        goto L_0x00d3;
        r2 = move-exception;
        r3 = r9.f;	 Catch:{ all -> 0x0064 }
        r3 = r3.get();	 Catch:{ all -> 0x0064 }
        r3 = (defpackage.hyk) r3;	 Catch:{ all -> 0x0064 }
        r4 = "db_create_failure";	 Catch:{ all -> 0x0064 }
        r2 = defpackage.abmt.a(r2);	 Catch:{ all -> 0x0064 }
        r3.a(r1, r4, r2, r14);	 Catch:{ all -> 0x0064 }
        r9.h = r13;	 Catch:{ all -> 0x0064 }
        goto L_0x0060;
        r2 = r9.h;	 Catch:{ all -> 0x00d7 }
        if (r2 == 0) goto L_0x00cf;	 Catch:{ all -> 0x00d7 }
        r2 = new icd;	 Catch:{ all -> 0x00d7 }
        r2.<init>(r10, r12);	 Catch:{ all -> 0x00d7 }
        r10 = r9.a;	 Catch:{ all -> 0x00d7 }
        r10 = r10.a(r2);	 Catch:{ all -> 0x00d7 }
        if (r10 == 0) goto L_0x00b7;	 Catch:{ all -> 0x00d7 }
        r10 = r9.b;	 Catch:{ all -> 0x00d7 }
        r10 = r10.get();	 Catch:{ all -> 0x00d7 }
        r10 = (defpackage.iba) r10;	 Catch:{ all -> 0x00d7 }
        r12 = new wip;	 Catch:{ all -> 0x00d7 }
        r13 = r9.h;	 Catch:{ all -> 0x00d7 }
        r13 = r13.a;	 Catch:{ all -> 0x00d7 }
        r13 = r13.c;	 Catch:{ all -> 0x00d7 }
        r2 = r9.h;	 Catch:{ all -> 0x00d7 }
        r2 = r2.a;	 Catch:{ all -> 0x00d7 }
        r2 = r2.b;	 Catch:{ all -> 0x00d7 }
        r12.<init>(r11, r13, r2);	 Catch:{ all -> 0x00d7 }
        r10.a(r12);	 Catch:{ all -> 0x00d7 }
        r10 = r9.f;	 Catch:{ all -> 0x00d7 }
        r10 = r10.get();	 Catch:{ all -> 0x00d7 }
        r10 = (defpackage.hyk) r10;	 Catch:{ all -> 0x00d7 }
        r10.a(r1, r14);	 Catch:{ all -> 0x00d7 }
        r10 = defpackage.ibg.a.SUCCESS;	 Catch:{ all -> 0x00d7 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d7 }
        return r10;	 Catch:{ all -> 0x00d7 }
        r10 = r9.f;	 Catch:{ all -> 0x00d7 }
        r10 = r10.get();	 Catch:{ all -> 0x00d7 }
        r10 = (defpackage.hyk) r10;	 Catch:{ all -> 0x00d7 }
        r11 = "device_manager_add_failure";	 Catch:{ all -> 0x00d7 }
        r10.a(r1, r11, r13, r14);	 Catch:{ all -> 0x00d7 }
        r10 = r9.l;	 Catch:{ all -> 0x00d7 }
        r10 = r10.get();	 Catch:{ all -> 0x00d7 }
        r10 = (android.content.Context) r10;	 Catch:{ all -> 0x00d7 }
        r10.deleteDatabase(r12);	 Catch:{ all -> 0x00d7 }
        r10 = defpackage.ibg.a.FAILURE;	 Catch:{ all -> 0x00d7 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d7 }
        return r10;	 Catch:{ all -> 0x00d7 }
        r1.b();	 Catch:{ all -> 0x00d7 }
        throw r10;	 Catch:{ all -> 0x00d7 }
        r10 = move-exception;	 Catch:{ all -> 0x00d7 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d7 }
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibg.a(java.lang.String, byte[], byte[], byte[], boolean):ibg$a");
    }

    private void a(hyi hyi) {
        synchronized (this.d) {
            if (this.y != ahqv.STATUS_READY) {
                synchronized (this.e) {
                    ((hyk) this.f.get()).c();
                    this.e.add(new iax(hyi));
                }
                j("async_load");
            } else if (this.h != null) {
                hyi.onFidDbLoad(this.h.a.d);
            }
        }
    }

    private void a(ick ick, List<String> list, String str) {
        d();
        Object ahpz = new ahpz();
        ahpx ahpx = new ahpx();
        ahpx.d = ick.b;
        ahpx.b = ick.d;
        ahpx.c = ick.f;
        ahpx.e = Integer.valueOf(9);
        ahpx.a = list;
        ahpz.f = ahpx;
        this.n.a(ajdx.b(ahpz).a((ajdw) this.m.g()).a(new -$$Lambda$ibg$d6poWmGzrci40NpO3F-ICZLbS6Y(this)).b((ajdw) this.m.b()).a(new -$$Lambda$ibg$-LlLnGenNgkHHxqoVDZM7w9UFx8(this, str), new -$$Lambda$ibg$aYk0twn4M2WfMpJM4Cn1SkqCd8Q(this)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:66:0x018f in {7, 12, 17, 19, 24, 26, 33, 35, 36, 37, 38, 43, 44, 50, 51, 52, 53, 58, 59, 62, 65} preds:[]
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
    private void a(java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, defpackage.ahql> r13, java.lang.String r14, boolean r15) {
        /*
        r10 = this;
        r0 = r10.d;
        monitor-enter(r0);
        r1 = android.text.TextUtils.isEmpty(r11);	 Catch:{ all -> 0x018c }
        if (r1 == 0) goto L_0x001b;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "null_iwek";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r10.h();	 Catch:{ all -> 0x018c }
        monitor-exit(r0);	 Catch:{ all -> 0x018c }
        return;	 Catch:{ all -> 0x018c }
        r3 = defpackage.abne.b(r11);	 Catch:{ all -> 0x018c }
        if (r3 != 0) goto L_0x0040;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "null_iwek_bytes";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "local_init_null_iwek_bytes";	 Catch:{ all -> 0x018c }
        r11.a(r12);	 Catch:{ all -> 0x018c }
        r10.h();	 Catch:{ all -> 0x018c }
        monitor-exit(r0);	 Catch:{ all -> 0x018c }
        return;	 Catch:{ all -> 0x018c }
        r11 = android.text.TextUtils.isEmpty(r12);	 Catch:{ all -> 0x018c }
        if (r11 == 0) goto L_0x0058;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "null_hashed_out_beta";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r10.h();	 Catch:{ all -> 0x018c }
        monitor-exit(r0);	 Catch:{ all -> 0x018c }
        return;	 Catch:{ all -> 0x018c }
        if (r15 == 0) goto L_0x005e;	 Catch:{ all -> 0x018c }
        r11 = defpackage.ahqv.STATUS_LOGIN_EXISTING;	 Catch:{ all -> 0x018c }
        r10.y = r11;	 Catch:{ all -> 0x018c }
        r11 = "on_server_identity_init_complete";	 Catch:{ all -> 0x018c }
        r11 = r10.a(r12, r3, r11);	 Catch:{ all -> 0x018c }
        r1 = defpackage.ibg.1.a;	 Catch:{ all -> 0x018c }
        r11 = r11.ordinal();	 Catch:{ all -> 0x018c }
        r11 = r1[r11];	 Catch:{ all -> 0x018c }
        r7 = 3;	 Catch:{ all -> 0x018c }
        r8 = 2;	 Catch:{ all -> 0x018c }
        r9 = 1;	 Catch:{ all -> 0x018c }
        r1 = 0;	 Catch:{ all -> 0x018c }
        if (r11 == r9) goto L_0x00e7;	 Catch:{ all -> 0x018c }
        if (r11 == r8) goto L_0x00cc;	 Catch:{ all -> 0x018c }
        if (r11 == r7) goto L_0x0078;	 Catch:{ all -> 0x018c }
        goto L_0x0115;	 Catch:{ all -> 0x018c }
        if (r15 == 0) goto L_0x007e;	 Catch:{ all -> 0x018c }
        r11 = defpackage.ahqv.STATUS_LOGIN_NEW;	 Catch:{ all -> 0x018c }
        r10.y = r11;	 Catch:{ all -> 0x018c }
        r11 = r10.o;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyz) r11;	 Catch:{ all -> 0x018c }
        r15 = "new_identity_";	 Catch:{ all -> 0x018c }
        r1 = java.lang.String.valueOf(r14);	 Catch:{ all -> 0x018c }
        r15 = r15.concat(r1);	 Catch:{ all -> 0x018c }
        r11 = r11.a(r15);	 Catch:{ all -> 0x018c }
        if (r11 == 0) goto L_0x00b2;	 Catch:{ all -> 0x018c }
        r15 = r11.a;	 Catch:{ all -> 0x018c }
        r15 = java.util.Arrays.equals(r3, r15);	 Catch:{ all -> 0x018c }
        if (r15 == 0) goto L_0x00b2;	 Catch:{ all -> 0x018c }
        r15 = r11.f;	 Catch:{ all -> 0x018c }
        r15 = android.text.TextUtils.equals(r12, r15);	 Catch:{ all -> 0x018c }
        if (r15 == 0) goto L_0x00b2;	 Catch:{ all -> 0x018c }
        r4 = r11.c;	 Catch:{ all -> 0x018c }
        r5 = r11.e;	 Catch:{ all -> 0x018c }
        r6 = 0;	 Catch:{ all -> 0x018c }
        r1 = r10;	 Catch:{ all -> 0x018c }
        r2 = r12;	 Catch:{ all -> 0x018c }
        r1 = r1.a(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x018c }
        goto L_0x0115;	 Catch:{ all -> 0x018c }
        if (r11 != 0) goto L_0x00c9;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "null_temp_device_info_";	 Catch:{ all -> 0x018c }
        r15 = java.lang.String.valueOf(r14);	 Catch:{ all -> 0x018c }
        r12 = r12.concat(r15);	 Catch:{ all -> 0x018c }
        r11.a(r12);	 Catch:{ all -> 0x018c }
        r1 = defpackage.ibg.a.NOT_FOUND;	 Catch:{ all -> 0x018c }
        goto L_0x0115;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "failure_existing";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "local_init_failure_existing";	 Catch:{ all -> 0x018c }
        r11.a(r12);	 Catch:{ all -> 0x018c }
        goto L_0x0115;	 Catch:{ all -> 0x018c }
        r11 = r10.h;	 Catch:{ all -> 0x018c }
        if (r11 == 0) goto L_0x00fd;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "success_existing";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r10.a(r1);	 Catch:{ all -> 0x018c }
        monitor-exit(r0);	 Catch:{ all -> 0x018c }
        return;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "local_init_user_db_null_existing";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "user_db_null_existing";	 Catch:{ all -> 0x018c }
        goto L_0x00e3;	 Catch:{ all -> 0x018c }
        if (r1 == 0) goto L_0x0187;	 Catch:{ all -> 0x018c }
        r11 = defpackage.ibg.1.a;	 Catch:{ all -> 0x018c }
        r12 = r1.ordinal();	 Catch:{ all -> 0x018c }
        r11 = r11[r12];	 Catch:{ all -> 0x018c }
        if (r11 == r9) goto L_0x0159;	 Catch:{ all -> 0x018c }
        if (r11 == r8) goto L_0x0141;	 Catch:{ all -> 0x018c }
        if (r11 == r7) goto L_0x0126;	 Catch:{ all -> 0x018c }
        goto L_0x0187;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "local_mismatch";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "local_init_local_mismatch";	 Catch:{ all -> 0x018c }
        r11.a(r12);	 Catch:{ all -> 0x018c }
        goto L_0x0187;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "failure_new";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "local_init_failure_new";	 Catch:{ all -> 0x018c }
        goto L_0x013d;	 Catch:{ all -> 0x018c }
        r11 = r10.h;	 Catch:{ all -> 0x018c }
        if (r11 == 0) goto L_0x016f;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "success_new";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r10.a(r13);	 Catch:{ all -> 0x018c }
        monitor-exit(r0);	 Catch:{ all -> 0x018c }
        return;	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "user_db_null_new";	 Catch:{ all -> 0x018c }
        r11.b(r14, r12);	 Catch:{ all -> 0x018c }
        r11 = r10.f;	 Catch:{ all -> 0x018c }
        r11 = r11.get();	 Catch:{ all -> 0x018c }
        r11 = (defpackage.hyk) r11;	 Catch:{ all -> 0x018c }
        r12 = "local_init_user_db_null_new";	 Catch:{ all -> 0x018c }
        goto L_0x013d;	 Catch:{ all -> 0x018c }
        r10.h();	 Catch:{ all -> 0x018c }
        monitor-exit(r0);	 Catch:{ all -> 0x018c }
        return;	 Catch:{ all -> 0x018c }
        r11 = move-exception;	 Catch:{ all -> 0x018c }
        monitor-exit(r0);	 Catch:{ all -> 0x018c }
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibg.a(java.lang.String, java.lang.String, java.util.Map, java.lang.String, boolean):void");
    }

    private void a(Map<String, ahql> map) {
        synchronized (this.d) {
            if (this.h != null) {
                this.y = ahqv.STATUS_READY;
                ((hyz) this.o.get()).a();
                ((ibi) this.i.get()).a(this.h, map);
                f();
                i(this.h.a.d);
                this.x.a(this.h);
                l(this.h.b);
                e();
            } else {
                h();
                ((hyk) this.f.get()).a("user_db_null");
            }
        }
    }

    private /* synthetic */ void b(String str, String str2) {
        ((hyk) this.f.get()).j(str);
        ajcx refresh = ((hyl) this.q.get()).refresh();
        if (refresh != null) {
            this.n.a(refresh.a(-$$Lambda$ibg$MEwyy5OsBbkJRHCcf1yWZ8KYRus.INSTANCE, -$$Lambda$ibg$c0OzyFd_xWdCTf55RVdfOd0-vqo.INSTANCE));
        }
    }

    private /* synthetic */ void b(String str, String str2, String str3) {
        synchronized (this.d) {
            d();
            g();
            a(str, str2, null, str3, true);
        }
    }

    private void d() {
        synchronized (this.d) {
            ((iba) this.b.get()).a(null);
            this.h = null;
            this.z = false;
            this.e.clear();
            ((iaw) this.j.get()).a();
        }
    }

    private void e() {
        String[] strArr;
        List c;
        synchronized (this.d) {
            strArr = null;
            if (((hyo) this.p.get()).c()) {
                strArr = ((Context) this.l.get()).databaseList();
                c = this.a.c();
            } else {
                c = null;
            }
        }
        if (strArr != null && c != null) {
            this.m.f().a(new -$$Lambda$ibg$Xgp_gpivlHV-RLR82aYPQVpFVOQ(this, strArr, c));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0048 in {6, 13, 17, 22, 25} preds:[]
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
    private void f() {
        /*
        r9 = this;
        r0 = r9.d;
        monitor-enter(r0);
        r1 = r9.h;	 Catch:{ all -> 0x0045 }
        if (r1 != 0) goto L_0x0009;	 Catch:{ all -> 0x0045 }
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return;	 Catch:{ all -> 0x0045 }
        r1 = r9.e;	 Catch:{ all -> 0x0045 }
        monitor-enter(r1);	 Catch:{ all -> 0x0045 }
        r2 = r9.e;	 Catch:{ all -> 0x0042 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0042 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0042 }
        if (r3 == 0) goto L_0x003f;	 Catch:{ all -> 0x0042 }
        r3 = r2.next();	 Catch:{ all -> 0x0042 }
        r3 = (defpackage.iax) r3;	 Catch:{ all -> 0x0042 }
        r4 = r9.f;	 Catch:{ all -> 0x0042 }
        r4 = r4.get();	 Catch:{ all -> 0x0042 }
        r4 = (defpackage.hyk) r4;	 Catch:{ all -> 0x0042 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0042 }
        r7 = r3.a;	 Catch:{ all -> 0x0042 }
        r5 = r5 - r7;	 Catch:{ all -> 0x0042 }
        r4.a(r5);	 Catch:{ all -> 0x0042 }
        r3 = r3.b;	 Catch:{ all -> 0x0042 }
        r4 = r9.h;	 Catch:{ all -> 0x0042 }
        r4 = r4.a;	 Catch:{ all -> 0x0042 }
        r4 = r4.d;	 Catch:{ all -> 0x0042 }
        r3.onFidDbLoad(r4);	 Catch:{ all -> 0x0042 }
        r2.remove();	 Catch:{ all -> 0x0042 }
        goto L_0x0012;	 Catch:{ all -> 0x0042 }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return;
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        throw r2;	 Catch:{ all -> 0x0045 }
        r1 = move-exception;	 Catch:{ all -> 0x0045 }
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibg.f():void");
    }

    private void g() {
        synchronized (this.d) {
            ((ibi) this.i.get()).a();
        }
    }

    private void h() {
        synchronized (this.d) {
            this.y = ahqv.STATUS_FAILED;
            ((hyz) this.o.get()).a();
            d();
        }
    }

    private static /* synthetic */ void i() {
    }

    private /* synthetic */ void j() {
        this.a.a();
    }

    private void j(String str) {
        this.m.b().a(new -$$Lambda$ibg$dQVf3_sg33EJ4xpAVK5FU6xeYNs(this, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Missing block: B:45:0x00e6, code skipped:
            return;
     */
    private void k(java.lang.String r12) {
        /*
        r11 = this;
        r0 = r11.d;
        monitor-enter(r0);
        r1 = r11.y;	 Catch:{ all -> 0x013f }
        r2 = defpackage.ahqv.STATUS_READY;	 Catch:{ all -> 0x013f }
        r3 = 1;
        r4 = 0;
        if (r1 != r2) goto L_0x001a;
    L_0x000b:
        r1 = r11.f;	 Catch:{ all -> 0x013f }
        r1 = r1.get();	 Catch:{ all -> 0x013f }
        r1 = (defpackage.hyk) r1;	 Catch:{ all -> 0x013f }
        r2 = "found";
        r1.a(r3, r2, r12, r4);	 Catch:{ all -> 0x013f }
        monitor-exit(r0);	 Catch:{ all -> 0x013f }
        return;
    L_0x001a:
        r1 = r11.y;	 Catch:{ all -> 0x013f }
        r2 = defpackage.ahqv.STATUS_CLIENT_INIT;	 Catch:{ all -> 0x013f }
        if (r1 != r2) goto L_0x002f;
    L_0x0020:
        r1 = r11.f;	 Catch:{ all -> 0x013f }
        r1 = r1.get();	 Catch:{ all -> 0x013f }
        r1 = (defpackage.hyk) r1;	 Catch:{ all -> 0x013f }
        r2 = "already_generating";
        r1.a(r3, r2, r12, r4);	 Catch:{ all -> 0x013f }
        monitor-exit(r0);	 Catch:{ all -> 0x013f }
        return;
    L_0x002f:
        r11.g();	 Catch:{ all -> 0x013f }
        r1 = defpackage.ahqv.STATUS_LOADING_LOCAL;	 Catch:{ all -> 0x013f }
        r11.y = r1;	 Catch:{ all -> 0x013f }
        r1 = r11.b;	 Catch:{ all -> 0x013f }
        r1 = r1.get();	 Catch:{ all -> 0x013f }
        r1 = (defpackage.iba) r1;	 Catch:{ all -> 0x013f }
        r7 = r1.a();	 Catch:{ all -> 0x013f }
        r1 = r11.b;	 Catch:{ all -> 0x013f }
        r1 = r1.get();	 Catch:{ all -> 0x013f }
        r1 = (defpackage.iba) r1;	 Catch:{ all -> 0x013f }
        r8 = r1.c();	 Catch:{ all -> 0x013f }
        r1 = r11.b;	 Catch:{ all -> 0x013f }
        r1 = r1.get();	 Catch:{ all -> 0x013f }
        r1 = (defpackage.iba) r1;	 Catch:{ all -> 0x013f }
        r9 = r1.b();	 Catch:{ all -> 0x013f }
        r1 = 0;
        if (r7 == 0) goto L_0x00fb;
    L_0x005d:
        if (r8 == 0) goto L_0x00fb;
    L_0x005f:
        r2 = r11.c;	 Catch:{ GeneralSecurityException -> 0x007c }
        r2 = r2.get();	 Catch:{ GeneralSecurityException -> 0x007c }
        r2 = (defpackage.ian) r2;	 Catch:{ GeneralSecurityException -> 0x007c }
        r2 = r2.b(r7, r8);	 Catch:{ GeneralSecurityException -> 0x007c }
        r2 = defpackage.abne.a(r2);	 Catch:{ GeneralSecurityException -> 0x007c }
        r5 = android.text.TextUtils.isEmpty(r2);	 Catch:{ GeneralSecurityException -> 0x007a }
        if (r5 == 0) goto L_0x0078;
    L_0x0075:
        r5 = "hash_beta_failure";
        goto L_0x0084;
    L_0x0078:
        r5 = r4;
        goto L_0x0084;
    L_0x007a:
        r5 = move-exception;
        goto L_0x007e;
    L_0x007c:
        r5 = move-exception;
        r2 = r4;
    L_0x007e:
        r6 = "hmac_exc";
        defpackage.abmt.a(r5);	 Catch:{ all -> 0x013f }
        r5 = r6;
    L_0x0084:
        r6 = r2;
        r2 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x013f }
        if (r2 != 0) goto L_0x00f9;
    L_0x008b:
        r2 = "init_user";
        r2 = r11.a(r6, r7, r2);	 Catch:{ all -> 0x013f }
        r5 = defpackage.ibg.a.SUCCESS;	 Catch:{ all -> 0x013f }
        if (r2 != r5) goto L_0x00bb;
    L_0x0095:
        r2 = r11.h;	 Catch:{ all -> 0x013f }
        if (r2 == 0) goto L_0x00ab;
    L_0x0099:
        r11.a(r4);	 Catch:{ all -> 0x013f }
        r1 = r11.f;	 Catch:{ all -> 0x013f }
        r1 = r1.get();	 Catch:{ all -> 0x013f }
        r1 = (defpackage.hyk) r1;	 Catch:{ all -> 0x013f }
        r2 = "db_load_success";
        r1.a(r3, r2, r12, r4);	 Catch:{ all -> 0x013f }
        monitor-exit(r0);	 Catch:{ all -> 0x013f }
        return;
    L_0x00ab:
        r2 = "app_open_user_db_null";
        r3 = r11.f;	 Catch:{ all -> 0x013f }
        r3 = r3.get();	 Catch:{ all -> 0x013f }
        r3 = (defpackage.hyk) r3;	 Catch:{ all -> 0x013f }
        r4 = "app_open_user_db_null";
        r3.a(r4);	 Catch:{ all -> 0x013f }
        goto L_0x00fd;
    L_0x00bb:
        if (r9 == 0) goto L_0x00e7;
    L_0x00bd:
        r10 = 1;
        r5 = r11;
        r2 = r5.a(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x013f }
        r5 = defpackage.ibg.a.SUCCESS;	 Catch:{ all -> 0x013f }
        if (r2 != r5) goto L_0x00d8;
    L_0x00c7:
        r11.a(r4);	 Catch:{ all -> 0x013f }
        r1 = r11.f;	 Catch:{ all -> 0x013f }
        r1 = r1.get();	 Catch:{ all -> 0x013f }
        r1 = (defpackage.hyk) r1;	 Catch:{ all -> 0x013f }
        r2 = "db_create_success";
        r1.a(r3, r2, r12, r4);	 Catch:{ all -> 0x013f }
        goto L_0x00e5;
    L_0x00d8:
        r2 = r11.f;	 Catch:{ all -> 0x013f }
        r2 = r2.get();	 Catch:{ all -> 0x013f }
        r2 = (defpackage.hyk) r2;	 Catch:{ all -> 0x013f }
        r3 = "db_create_failure";
        r2.a(r1, r3, r12, r4);	 Catch:{ all -> 0x013f }
    L_0x00e5:
        monitor-exit(r0);	 Catch:{ all -> 0x013f }
        return;
    L_0x00e7:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x013f }
        r4 = "existing_identity_init_";
        r3.<init>(r4);	 Catch:{ all -> 0x013f }
        r2 = r2.name();	 Catch:{ all -> 0x013f }
        r3.append(r2);	 Catch:{ all -> 0x013f }
        r5 = r3.toString();	 Catch:{ all -> 0x013f }
    L_0x00f9:
        r2 = r5;
        goto L_0x00fd;
    L_0x00fb:
        r2 = "iwek_or_beta_not_found";
    L_0x00fd:
        r11.d();	 Catch:{ all -> 0x013f }
        r3 = r11.a;	 Catch:{ all -> 0x013f }
        r3 = r3.b();	 Catch:{ all -> 0x013f }
        r4 = r11.o;	 Catch:{ all -> 0x013f }
        r4 = r4.get();	 Catch:{ all -> 0x013f }
        r4 = (defpackage.hyz) r4;	 Catch:{ all -> 0x013f }
        r5 = "app_start";
        r4 = r4.a(r5);	 Catch:{ all -> 0x013f }
        if (r4 != 0) goto L_0x0129;
    L_0x0116:
        r3 = r11.f;	 Catch:{ all -> 0x013f }
        r3 = r3.get();	 Catch:{ all -> 0x013f }
        r3 = (defpackage.hyk) r3;	 Catch:{ all -> 0x013f }
        r4 = "temp_user_info_failure";
        r3.a(r1, r2, r12, r4);	 Catch:{ all -> 0x013f }
        r12 = defpackage.ahqv.STATUS_FAILED;	 Catch:{ all -> 0x013f }
        r11.y = r12;	 Catch:{ all -> 0x013f }
        monitor-exit(r0);	 Catch:{ all -> 0x013f }
        return;
    L_0x0129:
        r5 = defpackage.ahqv.STATUS_CLIENT_INIT;	 Catch:{ all -> 0x013f }
        r11.y = r5;	 Catch:{ all -> 0x013f }
        r5 = r11.f;	 Catch:{ all -> 0x013f }
        r5 = r5.get();	 Catch:{ all -> 0x013f }
        r5 = (defpackage.hyk) r5;	 Catch:{ all -> 0x013f }
        r6 = "init_request";
        r5.a(r1, r2, r12, r6);	 Catch:{ all -> 0x013f }
        r11.a(r4, r3, r12);	 Catch:{ all -> 0x013f }
        monitor-exit(r0);	 Catch:{ all -> 0x013f }
        return;
    L_0x013f:
        r12 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x013f }
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibg.k(java.lang.String):void");
    }

    private void l(String str) {
        List<String> c = this.a.c();
        long j = 0;
        long j2 = j;
        for (String str2 : c) {
            long length = ((Context) this.l.get()).getDatabasePath(str2).length();
            j2 += length;
            if (str2.equals(str)) {
                j = length;
            }
        }
        ((hyk) this.f.get()).a(j, j2, (long) c.size());
    }

    private /* synthetic */ void m(String str) {
        synchronized (this.d) {
            if (!this.z) {
                this.z = true;
                a(new -$$Lambda$ibg$UwC0HEG9amH-yDk4ZHcaFWFWb9w(this, str));
            }
        }
    }

    private /* synthetic */ void n(String str) {
        synchronized (this.d) {
            a(new -$$Lambda$AL2Prlys0nm9A8kAnyfMTWIimIQ(this));
        }
    }

    private /* synthetic */ void o(String str) {
        k(str);
    }

    public final ahqv a() {
        ahqv ahqv;
        synchronized (this.d) {
            ahqv = this.y;
        }
        return ahqv;
    }

    public final void a(String str) {
        this.m.b().a(new -$$Lambda$ibg$F3z-1P39YQU5HmXEfDYLRhhyvfw(this, str));
    }

    public final void a(String str, String str2) {
        synchronized (this.d) {
            String str3;
            byte[] c;
            boolean z = false;
            if (this.h != null) {
                str3 = this.h.a.d;
            } else {
                z = true;
                c = ((iba) this.b.get()).c();
                str3 = c == null ? null : abne.a(c);
            }
            if (((iaw) this.j.get()).a(str, str3, str2, z)) {
                synchronized (this.d) {
                    byte[] a = ((iba) this.b.get()).a();
                    byte[] c2 = ((iba) this.b.get()).c();
                    c = ((iba) this.b.get()).b();
                    ick a2 = (a == null || c2 == null || c == null) ? ((hyz) this.o.get()).a("identity_regen") : ((hyz) this.o.get()).a(a, c2, c);
                    if (a2 == null) {
                        ((hyk) this.f.get()).e("temp_user_info_failure");
                    } else {
                        this.y = ahqv.STATUS_CLIENT_INIT;
                        ((hyk) this.f.get()).e("init_request");
                        a(a2, this.a.b(), "identity_regen");
                    }
                }
            }
        }
    }

    public final void a(String str, String str2, String str3) {
        this.m.f().a(new -$$Lambda$ibg$UyH_-kw5wuERgxvl--ra8DndPuw(this, str, str2, str3));
    }

    public final void b() {
        synchronized (this.d) {
            this.y = ahqv.STATUS_CLIENT_INIT;
        }
    }

    public final void b(String str) {
        this.m.b().a(new -$$Lambda$ibg$mFmJHGhHIOLxMZgtlAkQc0ftiBE(this, str));
    }

    public final hyp c(String str) {
        hyp d;
        synchronized (this.d) {
            if (this.y != ahqv.STATUS_READY) {
                k(str);
            }
            d = ((ibi) this.i.get()).d(str);
        }
        return d;
    }

    public final void c() {
        synchronized (this.d) {
            this.y = ahqv.STATUS_NOT_STARTED;
            ((hyz) this.o.get()).a();
            d();
        }
        ((iaw) this.j.get()).a();
        this.n.a();
        ((ibi) this.i.get()).b();
        if (this.w.a(hzf.DELETE_FIDELIUS_DATA_ON_LOGOUT)) {
            this.a.e();
            ((iba) this.b.get()).a(null);
        }
    }

    public final hzc d(String str) {
        hzc a;
        synchronized (this.d) {
            if (this.y != ahqv.STATUS_READY) {
                k(str);
            }
            a = ((ibi) this.i.get()).a(str);
        }
        return a;
    }

    public final hyx e(String str) {
        hyx b;
        synchronized (this.d) {
            if (this.y != ahqv.STATUS_READY) {
                k(str);
            }
            b = ((ibi) this.i.get()).b(str);
        }
        return b;
    }

    public final hza f(String str) {
        hza e;
        synchronized (this.d) {
            if (this.y != ahqv.STATUS_READY) {
                k(str);
            }
            e = ((ibi) this.i.get()).e(str);
        }
        return e;
    }

    public final hyy g(String str) {
        j(str);
        return ((ibi) this.i.get()).c();
    }

    public final hyu h(String str) {
        hyu f;
        synchronized (this.d) {
            if (this.y != ahqv.STATUS_READY) {
                k(str);
            }
            f = ((ibi) this.i.get()).f(str);
        }
        return f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void i(String str) {
        this.n.a(((hzb) this.s.get()).a(str));
    }
}
