package defpackage;

import com.brightcove.player.event.Event;
import java.io.IOException;

/* renamed from: xpn */
public final class xpn {
    final ajxe a;
    private final ajxe b = ajxh.a(new b(this));

    /* renamed from: xpn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xpn$c */
    static final class c extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    /* renamed from: xpn$b */
    static final class b extends akcs implements akbk<xoz> {
        private /* synthetic */ xpn a;

        b(xpn xpn) {
            this.a = xpn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            xfu m = ((xbd) this.a.a.b()).m();
            if (m != null) {
                return (xoz) m;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.spectacles.lib.main.filemanager.SpectaclesFileManagerImpl");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xpn.class), "specsComponent", "getSpecsComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(xpn.class), "fileManager", "getFileManager()Lcom/snap/spectacles/lib/main/filemanager/SpectaclesFileManagerImpl;")};
        a aVar = new a();
    }

    public xpn(ajwy<xbd> ajwy) {
        akcr.b(ajwy, "specsCoreComponentLazy");
        this.a = ajxh.a(new c(ajwy));
    }

    private static String a(xdg xdg, boolean z, xjh xjh) {
        akcr.b(xdg, "primaryCamera");
        akcr.b(xjh, "fileType");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xdg.name());
        String str = "_";
        stringBuilder.append(str);
        stringBuilder.append(z ? "image" : Event.VIDEO);
        stringBuilder.append(str);
        stringBuilder.append(xjh);
        Object stringBuilder2 = stringBuilder.toString();
        akcr.a(stringBuilder2, "StringBuilder()\n        …              .toString()");
        return stringBuilder2;
    }

    private final xoz a() {
        return (xoz) this.b.b();
    }

    public final boolean a(String str, xdg xdg, boolean z, xjh xjh) {
        akcr.b(str, "deviceId");
        akcr.b(xdg, "primaryCamera");
        akcr.b(xjh, "fileType");
        String a = xpn.a(xdg, z, xjh);
        return a().b(xjh, a, str) && a().e(xjh, a, str) > 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0043 in {4, 8, 10, 11, 14} preds:[]
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
    public final synchronized boolean a(java.lang.String r3, defpackage.xdg r4, byte[] r5, boolean r6) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "deviceId";	 Catch:{ all -> 0x0040 }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x0040 }
        r0 = "primaryCamera";	 Catch:{ all -> 0x0040 }
        defpackage.akcr.b(r4, r0);	 Catch:{ all -> 0x0040 }
        r0 = "lutByteArray";	 Catch:{ all -> 0x0040 }
        defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x0040 }
        r0 = defpackage.xjh.LUT;	 Catch:{ all -> 0x0040 }
        r0 = r2.a(r3, r4, r6, r0);	 Catch:{ all -> 0x0040 }
        r1 = defpackage.xjh.LUT;	 Catch:{ all -> 0x0040 }
        r4 = defpackage.xpn.a(r4, r6, r1);	 Catch:{ all -> 0x0040 }
        if (r0 == 0) goto L_0x0027;	 Catch:{ all -> 0x0040 }
        r6 = r2.a();	 Catch:{ all -> 0x0040 }
        r0 = defpackage.xjh.LUT;	 Catch:{ all -> 0x0040 }
        r6.f(r0, r4, r3);	 Catch:{ all -> 0x0040 }
        r6 = r2.a();	 Catch:{ all -> 0x0040 }
        r0 = defpackage.xjh.LUT;	 Catch:{ all -> 0x0040 }
        r3 = r6.a(r0, r4, r3);	 Catch:{ all -> 0x0040 }
        if (r3 == 0) goto L_0x003e;	 Catch:{ all -> 0x0040 }
        r3.a(r5);	 Catch:{ all -> 0x0040 }
        r4 = 0;	 Catch:{ all -> 0x0040 }
        r3.b(r4);	 Catch:{ all -> 0x0040 }
        r3 = 1;
        monitor-exit(r2);
        return r3;
        r3 = 0;
        goto L_0x003c;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpn.a(java.lang.String, xdg, byte[], boolean):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x007f in {4, 12, 16, 22, 25, 28, 31} preds:[]
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
    public final synchronized boolean a(java.lang.String r5, defpackage.xdg r6, float[] r7, boolean r8) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = "deviceId";	 Catch:{ all -> 0x007c }
        defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x007c }
        r0 = "primaryCamera";	 Catch:{ all -> 0x007c }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x007c }
        r0 = "alignmentMatrix";	 Catch:{ all -> 0x007c }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x007c }
        r0 = defpackage.xjh.ALIGNMENT_MATRIX;	 Catch:{ all -> 0x007c }
        r0 = r4.a(r5, r6, r8, r0);	 Catch:{ all -> 0x007c }
        r1 = defpackage.xjh.ALIGNMENT_MATRIX;	 Catch:{ all -> 0x007c }
        r6 = defpackage.xpn.a(r6, r8, r1);	 Catch:{ all -> 0x007c }
        if (r0 == 0) goto L_0x0027;	 Catch:{ all -> 0x007c }
        r8 = r4.a();	 Catch:{ all -> 0x007c }
        r0 = defpackage.xjh.ALIGNMENT_MATRIX;	 Catch:{ all -> 0x007c }
        r8.c(r0, r6, r5);	 Catch:{ all -> 0x007c }
        r8 = r4.a();	 Catch:{ all -> 0x007c }
        r0 = defpackage.xjh.ALIGNMENT_MATRIX;	 Catch:{ all -> 0x007c }
        r1 = "fileType";	 Catch:{ all -> 0x007c }
        defpackage.akcr.b(r0, r1);	 Catch:{ all -> 0x007c }
        r1 = "id";	 Catch:{ all -> 0x007c }
        defpackage.akcr.b(r6, r1);	 Catch:{ all -> 0x007c }
        r1 = "alignmentMatrix";	 Catch:{ all -> 0x007c }
        defpackage.akcr.b(r7, r1);	 Catch:{ all -> 0x007c }
        r5 = defpackage.xoz.a(r6, r5);	 Catch:{ all -> 0x007c }
        r6 = r8.a();	 Catch:{ all -> 0x007c }
        r0 = (defpackage.ygp) r0;	 Catch:{ all -> 0x007c }
        r5 = r6.e(r0, r5);	 Catch:{ all -> 0x007c }
        if (r5 == 0) goto L_0x0079;	 Catch:{ all -> 0x007c }
        r6 = new java.io.DataOutputStream;	 Catch:{ all -> 0x007c }
        r8 = r5.d();	 Catch:{ all -> 0x007c }
        r8 = (java.io.OutputStream) r8;	 Catch:{ all -> 0x007c }
        r6.<init>(r8);	 Catch:{ all -> 0x007c }
        r6 = (java.io.Closeable) r6;	 Catch:{ all -> 0x007c }
        r8 = 0;
        r0 = r6;	 Catch:{ Throwable -> 0x0072 }
        r0 = (java.io.DataOutputStream) r0;	 Catch:{ Throwable -> 0x0072 }
        r1 = r7.length;	 Catch:{ Throwable -> 0x0072 }
        r2 = 0;	 Catch:{ Throwable -> 0x0072 }
        if (r2 >= r1) goto L_0x0069;	 Catch:{ Throwable -> 0x0072 }
        r3 = r7[r2];	 Catch:{ Throwable -> 0x0072 }
        r0.writeFloat(r3);	 Catch:{ Throwable -> 0x0072 }
        r2 = r2 + 1;	 Catch:{ Throwable -> 0x0072 }
        goto L_0x005f;	 Catch:{ Throwable -> 0x0072 }
        r5.f();	 Catch:{ Throwable -> 0x0072 }
        defpackage.akax.a(r6, r8);	 Catch:{ all -> 0x007c }
        goto L_0x0079;
        r5 = move-exception;
        goto L_0x0075;
        r5 = move-exception;
        r8 = r5;
        throw r8;	 Catch:{ all -> 0x0070 }
        defpackage.akax.a(r6, r8);	 Catch:{ all -> 0x007c }
        throw r5;	 Catch:{ all -> 0x007c }
        monitor-exit(r4);
        r5 = 1;
        return r5;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpn.a(java.lang.String, xdg, float[], boolean):boolean");
    }

    public final synchronized byte[] a(String str, xdg xdg, boolean z) {
        byte[] bArr;
        akcr.b(str, "deviceId");
        akcr.b(xdg, "primaryCamera");
        bArr = null;
        if (!a(str, xdg, z, xjh.LUT)) {
            return null;
        }
        try {
            bArr = a().c(xjh.LUT, xpn.a(xdg, z, xjh.LUT), str);
        } catch (IOException unused) {
        }
        return bArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x005b in {6, 14, 17, 19, 22, 24, 27, 28, 31, 34} preds:[]
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
    public final synchronized float[] b(java.lang.String r5, defpackage.xdg r6, boolean r7) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = "deviceId";	 Catch:{ all -> 0x0058 }
        defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x0058 }
        r0 = "primaryCamera";	 Catch:{ all -> 0x0058 }
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x0058 }
        r0 = defpackage.xjh.ALIGNMENT_MATRIX;	 Catch:{ all -> 0x0058 }
        r0 = r4.a(r5, r6, r7, r0);	 Catch:{ all -> 0x0058 }
        r1 = 0;
        if (r0 != 0) goto L_0x0016;
        monitor-exit(r4);
        return r1;
        r0 = defpackage.xjh.ALIGNMENT_MATRIX;	 Catch:{ IOException -> 0x0055 }
        r6 = defpackage.xpn.a(r6, r7, r0);	 Catch:{ IOException -> 0x0055 }
        r7 = r4.a();	 Catch:{ IOException -> 0x0055 }
        r0 = defpackage.xjh.ALIGNMENT_MATRIX;	 Catch:{ IOException -> 0x0055 }
        r5 = r7.d(r0, r6, r5);	 Catch:{ IOException -> 0x0055 }
        r6 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x0055 }
        r5 = (java.io.InputStream) r5;	 Catch:{ IOException -> 0x0055 }
        r6.<init>(r5);	 Catch:{ IOException -> 0x0055 }
        r6 = (java.io.Closeable) r6;	 Catch:{ IOException -> 0x0055 }
        r5 = r6;	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r5 = (java.io.DataInputStream) r5;	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r7 = 9;	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r7 = new float[r7];	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r0 = 0;	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r2 = 8;	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        if (r0 > r2) goto L_0x0044;	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r2 = r5.readFloat();	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r7[r0] = r2;	 Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        r0 = r0 + 1;
        goto L_0x0037;
        defpackage.akax.a(r6, r1);	 Catch:{ IOException -> 0x0055 }
        goto L_0x0056;
        r5 = move-exception;
        r7 = r1;
        goto L_0x0051;
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x004d }
        r7 = move-exception;
        r3 = r7;
        r7 = r5;
        r5 = r3;
        defpackage.akax.a(r6, r7);	 Catch:{ IOException -> 0x0055 }
        throw r5;	 Catch:{ IOException -> 0x0055 }
        r7 = r1;
        monitor-exit(r4);
        return r7;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpn.b(java.lang.String, xdg, boolean):float[]");
    }
}
