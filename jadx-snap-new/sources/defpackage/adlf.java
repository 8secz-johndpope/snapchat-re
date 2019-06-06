package defpackage;

import java.util.ArrayList;
import java.util.UUID;

/* renamed from: adlf */
public final class adlf {
    private final ajxe a = ajxh.a(a.a);
    private final ArrayList<adlc> b = new ArrayList();
    private final adlb c = new adlb(this.e, this.g);
    private final adld d = new adld(this.f);
    private final dib e;
    private final ilv f;
    private final zfw g;

    /* renamed from: adlf$a */
    static final class a extends akcs implements akbk<adlg> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new adlg();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(adlf.class), "playbackSessionRecord", "getPlaybackSessionRecord()Lcom/snapchat/mediaengine/player/analytics/video/PlaybackSessionRecord;");
    }

    public adlf(dib dib, ilv ilv, zfw zfw) {
        akcr.b(zfw, "schedulers");
        this.e = dib;
        this.f = ilv;
        this.g = zfw;
        this.b.add(this.c);
        this.b.add(this.d);
    }

    private adlg a() {
        return (adlg) this.a.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0036 in {6, 8, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized void a(defpackage.aarx r2, defpackage.adla r3, java.lang.Throwable r4) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = "failureStage";	 Catch:{ all -> 0x0033 }
        defpackage.akcr.b(r2, r0);	 Catch:{ all -> 0x0033 }
        r0 = "failureType";	 Catch:{ all -> 0x0033 }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x0033 }
        r0 = "throwable";	 Catch:{ all -> 0x0033 }
        defpackage.akcr.b(r4, r0);	 Catch:{ all -> 0x0033 }
        r0 = new adkz;	 Catch:{ all -> 0x0033 }
        r0.<init>(r2, r3, r4);	 Catch:{ all -> 0x0033 }
        r2 = r1.a();	 Catch:{ all -> 0x0033 }
        r2.f = r0;	 Catch:{ all -> 0x0033 }
        r2 = r1.b;	 Catch:{ all -> 0x0033 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0033 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0033 }
        if (r3 == 0) goto L_0x0031;	 Catch:{ all -> 0x0033 }
        r3 = r2.next();	 Catch:{ all -> 0x0033 }
        r3 = (defpackage.adlc) r3;	 Catch:{ all -> 0x0033 }
        r3.a(r0);	 Catch:{ all -> 0x0033 }
        goto L_0x0021;
        monitor-exit(r1);
        return;
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlf.a(aarx, adla, java.lang.Throwable):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0045 in {4, 9, 11, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized void a(defpackage.adlh r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = "playerEvent";	 Catch:{ all -> 0x0042 }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x0042 }
        r0 = r5.a();	 Catch:{ all -> 0x0042 }
        r0 = r0.d;	 Catch:{ all -> 0x0042 }
        r1 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0042 }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0042 }
        r0.put(r6, r1);	 Catch:{ all -> 0x0042 }
        r0 = defpackage.adlh.PLAYER_BEGIN_RESTART;	 Catch:{ all -> 0x0042 }
        if (r6 != r0) goto L_0x0026;	 Catch:{ all -> 0x0042 }
        r0 = r5.a();	 Catch:{ all -> 0x0042 }
        r1 = r0.e;	 Catch:{ all -> 0x0042 }
        r3 = 1;	 Catch:{ all -> 0x0042 }
        r1 = r1 + r3;	 Catch:{ all -> 0x0042 }
        r0.e = r1;	 Catch:{ all -> 0x0042 }
        r0 = r5.b;	 Catch:{ all -> 0x0042 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0042 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0042 }
        if (r1 == 0) goto L_0x0040;	 Catch:{ all -> 0x0042 }
        r1 = r0.next();	 Catch:{ all -> 0x0042 }
        r1 = (defpackage.adlc) r1;	 Catch:{ all -> 0x0042 }
        r2 = r5.a();	 Catch:{ all -> 0x0042 }
        r1.a(r2, r6);	 Catch:{ all -> 0x0042 }
        goto L_0x002c;
        monitor-exit(r5);
        return;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adlf.a(adlh):void");
    }

    public final synchronized void a(UUID uuid, ide ide, adgw adgw) {
        akcr.b(uuid, "playbackSessionId");
        akcr.b(adgw, "mediaSource");
        adlg a = a();
        a.a = uuid;
        a.b = ide;
        a.c = adgw;
    }
}
