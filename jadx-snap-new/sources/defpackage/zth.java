package defpackage;

import com.google.common.collect.ImmutableSet;
import java.io.File;
import java.util.Set;

/* renamed from: zth */
public final class zth implements gfo {
    private static final Set<String> a = ImmutableSet.of("scene.scn", "config.json");

    private static /* synthetic */ boolean a(File file) {
        if (!file.isDirectory()) {
            return false;
        }
        for (String file2 : a) {
            if (new File(file, file2).exists()) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x005f in {7, 15, 21, 23, 24, 25, 27, 28, 30} preds:[]
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
    private static void b(java.io.File r5, java.io.File r6, boolean r7) {
        /*
        r0 = new java.io.File;	 Catch:{ all -> 0x005d }
        r1 = "media_cache";	 Catch:{ all -> 0x005d }
        r0.<init>(r5, r1);	 Catch:{ all -> 0x005d }
        r5 = r0.exists();	 Catch:{ all -> 0x005d }
        if (r5 == 0) goto L_0x005c;	 Catch:{ all -> 0x005d }
        r5 = r0.isDirectory();	 Catch:{ all -> 0x005d }
        if (r5 == 0) goto L_0x005c;	 Catch:{ all -> 0x005d }
        r5 = new java.io.File;	 Catch:{ all -> 0x005d }
        r1 = "Lenses";	 Catch:{ all -> 0x005d }
        r5.<init>(r6, r1);	 Catch:{ all -> 0x005d }
        if (r7 == 0) goto L_0x001f;	 Catch:{ all -> 0x005d }
        defpackage.ygr.b(r5);	 Catch:{ all -> 0x005d }
        defpackage.ygr.a(r5);	 Catch:{ all -> 0x005d }
        r6 = defpackage.-$$Lambda$zth$rUYA_yVKUCaFg6lRoeFWjPfkDsA.INSTANCE;	 Catch:{ Exception -> 0x0059 }
        r6 = r0.listFiles(r6);	 Catch:{ Exception -> 0x0059 }
        r0 = r6.length;	 Catch:{ Exception -> 0x0059 }
        r1 = 0;	 Catch:{ Exception -> 0x0059 }
        if (r1 >= r0) goto L_0x0058;	 Catch:{ Exception -> 0x0059 }
        r2 = r6[r1];	 Catch:{ Exception -> 0x0059 }
        r3 = r2.getName();	 Catch:{ Exception -> 0x0059 }
        r4 = new java.io.File;	 Catch:{ Exception -> 0x0059 }
        r4.<init>(r5, r3);	 Catch:{ Exception -> 0x0059 }
        if (r7 == 0) goto L_0x003c;
        defpackage.ygr.b(r4);	 Catch:{ Exception -> 0x004f }
        defpackage.ygr.a(r4);	 Catch:{ Exception -> 0x004f }
        r3 = r2.exists();	 Catch:{ Exception -> 0x004f }
        if (r3 == 0) goto L_0x0055;	 Catch:{ Exception -> 0x004f }
        r3 = r2.isDirectory();	 Catch:{ Exception -> 0x004f }
        if (r3 == 0) goto L_0x0055;	 Catch:{ Exception -> 0x004f }
        com.google.common.io.Files.move(r2, r4);	 Catch:{ Exception -> 0x004f }
        goto L_0x0055;
    L_0x004f:
        defpackage.ygr.b(r2);	 Catch:{ Exception -> 0x0059 }
        defpackage.ygr.b(r4);	 Catch:{ Exception -> 0x0059 }
        r1 = r1 + 1;
        goto L_0x002a;
        return;
    L_0x0059:
        defpackage.ygr.b(r5);	 Catch:{ all -> 0x005d }
        return;
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zth.b(java.io.File, java.io.File, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            defpackage.ygr.b(r1);
            defpackage.ygr.b(r2);
     */
    private /* synthetic */ void c(java.io.File r4, java.io.File r5, boolean r6) {
        /*
        r3 = this;
        r0 = "OnDemandResources/Lenses";
        r1 = new java.io.File;	 Catch:{ all -> 0x002e }
        r1.<init>(r4, r0);	 Catch:{ all -> 0x002e }
        r2 = r1.exists();	 Catch:{ all -> 0x002e }
        if (r2 == 0) goto L_0x002a;
    L_0x000d:
        r2 = r1.isDirectory();	 Catch:{ all -> 0x002e }
        if (r2 == 0) goto L_0x002a;
    L_0x0013:
        r2 = new java.io.File;	 Catch:{ all -> 0x002e }
        r2.<init>(r5, r0);	 Catch:{ all -> 0x002e }
        if (r6 == 0) goto L_0x001d;
    L_0x001a:
        defpackage.ygr.b(r2);	 Catch:{ Exception -> 0x0024 }
    L_0x001d:
        defpackage.ygr.a(r2);	 Catch:{ Exception -> 0x0024 }
        com.google.common.io.Files.move(r1, r2);	 Catch:{ Exception -> 0x0024 }
        goto L_0x002a;
    L_0x0024:
        defpackage.ygr.b(r1);	 Catch:{ all -> 0x002e }
        defpackage.ygr.b(r2);	 Catch:{ all -> 0x002e }
    L_0x002a:
        defpackage.zth.b(r4, r5, r6);
        return;
    L_0x002e:
        r4 = move-exception;
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zth.c(java.io.File, java.io.File, boolean):void");
    }

    public final ajcx a(File file, File file2, boolean z) {
        return ajcx.a(new -$$Lambda$zth$A3t41qmGJeTlarGbb_QVXNask50(this, file, file2, z)).a(ajfu.g);
    }
}
