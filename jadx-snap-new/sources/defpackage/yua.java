package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.mapbox.mapboxsdk.style.sources.RasterSource;

/* renamed from: yua */
public final class yua {
    final Context a;
    private final ajxe b = ajxh.a(new a(this));
    private final int c = RasterSource.DEFAULT_TILE_SIZE;

    /* renamed from: yua$a */
    static final class a extends akcs implements akbk<PackageManager> {
        private /* synthetic */ yua a;

        a(yua yua) {
            this.a = yua;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.getPackageManager();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(yua.class), "packageManager", "getPackageManager()Landroid/content/pm/PackageManager;");
    }

    public yua(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    private final PackageManager a() {
        return (PackageManager) this.b.b();
    }

    private final PackageInfo b() {
        try {
            Object packageInfo = a().getPackageInfo(this.a.getPackageName(), 655);
            akcr.a(packageInfo, "packageManager.getPackag…lags or queryDisableFlag)");
            return packageInfo;
        } catch (NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x00a5 in {4, 7, 10, 13, 20, 21, 23, 24, 26} preds:[]
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
    public final boolean a(java.lang.String r6) {
        /*
        r5 = this;
        r0 = "tag";
        defpackage.akcr.b(r6, r0);
        r6 = r5.b();	 Catch:{ all -> 0x00a3 }
        r0 = com.google.common.collect.Lists.newArrayList();	 Catch:{ all -> 0x00a3 }
        r1 = r6.services;	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x0023;	 Catch:{ all -> 0x00a3 }
        r1 = r6.services;	 Catch:{ all -> 0x00a3 }
        r2 = r1.length;	 Catch:{ all -> 0x00a3 }
        r1 = java.util.Arrays.copyOf(r1, r2);	 Catch:{ all -> 0x00a3 }
        r1 = (android.content.pm.ServiceInfo[]) r1;	 Catch:{ all -> 0x00a3 }
        r1 = java.util.Arrays.asList(r1);	 Catch:{ all -> 0x00a3 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00a3 }
        r0.addAll(r1);	 Catch:{ all -> 0x00a3 }
        r1 = r6.receivers;	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x0039;	 Catch:{ all -> 0x00a3 }
        r1 = r6.receivers;	 Catch:{ all -> 0x00a3 }
        r2 = r1.length;	 Catch:{ all -> 0x00a3 }
        r1 = java.util.Arrays.copyOf(r1, r2);	 Catch:{ all -> 0x00a3 }
        r1 = (android.content.pm.ActivityInfo[]) r1;	 Catch:{ all -> 0x00a3 }
        r1 = java.util.Arrays.asList(r1);	 Catch:{ all -> 0x00a3 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00a3 }
        r0.addAll(r1);	 Catch:{ all -> 0x00a3 }
        r1 = r6.providers;	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x004f;	 Catch:{ all -> 0x00a3 }
        r1 = r6.providers;	 Catch:{ all -> 0x00a3 }
        r2 = r1.length;	 Catch:{ all -> 0x00a3 }
        r1 = java.util.Arrays.copyOf(r1, r2);	 Catch:{ all -> 0x00a3 }
        r1 = (android.content.pm.ProviderInfo[]) r1;	 Catch:{ all -> 0x00a3 }
        r1 = java.util.Arrays.asList(r1);	 Catch:{ all -> 0x00a3 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00a3 }
        r0.addAll(r1);	 Catch:{ all -> 0x00a3 }
        r1 = r6.activities;	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x0065;	 Catch:{ all -> 0x00a3 }
        r6 = r6.activities;	 Catch:{ all -> 0x00a3 }
        r1 = r6.length;	 Catch:{ all -> 0x00a3 }
        r6 = java.util.Arrays.copyOf(r6, r1);	 Catch:{ all -> 0x00a3 }
        r6 = (android.content.pm.ActivityInfo[]) r6;	 Catch:{ all -> 0x00a3 }
        r6 = java.util.Arrays.asList(r6);	 Catch:{ all -> 0x00a3 }
        r6 = (java.util.Collection) r6;	 Catch:{ all -> 0x00a3 }
        r0.addAll(r6);	 Catch:{ all -> 0x00a3 }
        r6 = "componentInfos";	 Catch:{ all -> 0x00a3 }
        defpackage.akcr.a(r0, r6);	 Catch:{ all -> 0x00a3 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x00a3 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x00a3 }
        r6 = r0.iterator();	 Catch:{ all -> 0x00a3 }
        r0 = 0;	 Catch:{ all -> 0x00a3 }
        r1 = 0;	 Catch:{ all -> 0x00a3 }
        r2 = r6.hasNext();	 Catch:{ all -> 0x00a3 }
        if (r2 == 0) goto L_0x00a2;	 Catch:{ all -> 0x00a3 }
        r2 = r6.next();	 Catch:{ all -> 0x00a3 }
        r2 = (android.content.pm.ComponentInfo) r2;	 Catch:{ all -> 0x00a3 }
        r3 = new android.content.ComponentName;	 Catch:{ all -> 0x00a3 }
        r4 = r2.packageName;	 Catch:{ all -> 0x00a3 }
        r2 = r2.name;	 Catch:{ all -> 0x00a3 }
        r3.<init>(r4, r2);	 Catch:{ all -> 0x00a3 }
        r2 = r5.a();	 Catch:{ all -> 0x00a3 }
        r2 = r2.getComponentEnabledSetting(r3);	 Catch:{ all -> 0x00a3 }
        r4 = 1;	 Catch:{ all -> 0x00a3 }
        if (r2 == 0) goto L_0x009d;	 Catch:{ all -> 0x00a3 }
        r2 = r5.a();	 Catch:{ all -> 0x00a3 }
        r2.setComponentEnabledSetting(r3, r0, r4);	 Catch:{ all -> 0x00a3 }
        r2 = 1;
        goto L_0x009e;
        r2 = 0;
        if (r2 == 0) goto L_0x0074;
        r1 = 1;
        goto L_0x0074;
        return r1;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yua.a(java.lang.String):boolean");
    }
}
