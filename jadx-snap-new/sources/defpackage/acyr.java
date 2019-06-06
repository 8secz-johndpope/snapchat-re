package defpackage;

import android.content.Context;
import com.mapbox.mapboxsdk.Mapbox;
import defpackage.acmx.a;

/* renamed from: acyr */
public final class acyr implements acmf {
    private final ajxe a;
    private final boolean b = true;
    private final ajxe c;

    /* renamed from: acyr$b */
    static final class b extends akcs implements akbk<aczl> {
        private /* synthetic */ Context a;
        private /* synthetic */ zgb b;

        b(Context context, zgb zgb) {
            this.a = context;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new aczl(this.a, this.b);
        }
    }

    /* renamed from: acyr$a */
    static final class a extends akcs implements akbk<acyy> {
        private /* synthetic */ Context a;
        private /* synthetic */ zgb b;

        a(Context context, zgb zgb) {
            this.a = context;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new acyy(this.a, this.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acyr.class), "telemetryAccessor", "getTelemetryAccessor()Lcom/mapbox/mapboxsdk/TelemetryAccessor$TelemetryAccessorInterface;"), new akdc(akde.a(acyr.class), "mapManagers", "getMapManagers()Lcom/snapchat/map/mapbox/MapboxStyleManagers;")};
    }

    public acyr(Context context, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        this.a = ajxh.a(new b(context, zgb));
        this.c = ajxh.a(new a(context, zgb));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x00b0 in {4, 7, 9, 12, 15} preds:[]
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
    private final com.mapbox.mapboxsdk.Mapbox a(defpackage.acyy r7) {
        /*
        r6 = this;
        r0 = "";
        defpackage.in.a(r0);
        android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00ab }
        r7 = r7.a;	 Catch:{ all -> 0x00ab }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r1 = "MapboxStyleManager";	 Catch:{ all -> 0x00ab }
        r0.<init>(r1);	 Catch:{ all -> 0x00ab }
        r1 = r7.e();	 Catch:{ all -> 0x00ab }
        r0.append(r1);	 Catch:{ all -> 0x00ab }
        r0 = r7.c();	 Catch:{ all -> 0x00ab }
        r1 = "styleManager.context";	 Catch:{ all -> 0x00ab }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x00ab }
        r1 = r7.d();	 Catch:{ all -> 0x00ab }
        if (r1 != 0) goto L_0x0029;	 Catch:{ all -> 0x00ab }
        r1 = "pk.place_holder";	 Catch:{ all -> 0x00ab }
        r2 = "styleManager.accessToken…legate.PLACE_HOLDER_TOKEN";	 Catch:{ all -> 0x00ab }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00ab }
        r2 = 0;	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.constants.MapboxConstants.ENABLE_MAPBOX_LOCATION_SERVICE = r2;	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.MapboxNatives.loadWrapperLayer();	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.MapboxNatives.load();	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.http.HTTPRequest.getUserAgent();	 Catch:{ all -> 0x00ab }
        r2 = com.mapbox.mapboxsdk.Mapbox.getInstance(r0, r1);	 Catch:{ all -> 0x00ab }
        r2.setAccessToken(r1);	 Catch:{ all -> 0x00ab }
        r3 = r6.a;	 Catch:{ all -> 0x00ab }
        r3 = r3.b();	 Catch:{ all -> 0x00ab }
        r3 = (com.mapbox.mapboxsdk.TelemetryAccessor.TelemetryAccessorInterface) r3;	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.TelemetryAccessor.sCustom = r3;	 Catch:{ all -> 0x00ab }
        r3 = new aczd;	 Catch:{ all -> 0x00ab }
        r3.<init>();	 Catch:{ all -> 0x00ab }
        r3 = (com.mapbox.mapboxsdk.net.ConnectivityReceiver.Provider) r3;	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.net.ConnectivityReceiver.setProvider(r3);	 Catch:{ all -> 0x00ab }
        r3 = new aczk;	 Catch:{ all -> 0x00ab }
        r3.<init>();	 Catch:{ all -> 0x00ab }
        r3 = (com.mapbox.mapboxsdk.maps.MapView.NativeMapViewFactory) r3;	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.maps.MapView.sNativeMapViewFactory = r3;	 Catch:{ all -> 0x00ab }
        r3 = new aczj;	 Catch:{ all -> 0x00ab }
        r3.<init>();	 Catch:{ all -> 0x00ab }
        r3 = (com.mapbox.mapboxsdk.maps.MapView.MapBoxMapFactory) r3;	 Catch:{ all -> 0x00ab }
        com.mapbox.mapboxsdk.maps.MapView.sMapboxMapFactory = r3;	 Catch:{ all -> 0x00ab }
        r3 = com.mapbox.mapboxsdk.maps.MapView.getSystemInfo(r0);	 Catch:{ all -> 0x00ab }
        r3 = r3.fileSourceCachePath;	 Catch:{ all -> 0x00ab }
        if (r3 == 0) goto L_0x008a;	 Catch:{ all -> 0x00ab }
        r4 = com.mapbox.mapboxsdk.storage.FileSource.getInstance(r3, r0);	 Catch:{ all -> 0x00ab }
        r5 = "FileSource.getInstance(cachePath, context)";	 Catch:{ all -> 0x00ab }
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x00ab }
        r4.setAccessToken(r1);	 Catch:{ all -> 0x00ab }
        r0 = com.mapbox.mapboxsdk.storage.FileSource.getInstance(r3, r0);	 Catch:{ all -> 0x00ab }
        r1 = new aczo;	 Catch:{ all -> 0x00ab }
        r1.<init>(r7);	 Catch:{ all -> 0x00ab }
        r1 = (com.mapbox.mapboxsdk.storage.FileSource.ResourceTransformCallback) r1;	 Catch:{ all -> 0x00ab }
        r0.setResourceTransform(r1);	 Catch:{ all -> 0x00ab }
        goto L_0x00a2;	 Catch:{ all -> 0x00ab }
        r3 = com.mapbox.mapboxsdk.storage.FileSource.getInstance(r0);	 Catch:{ all -> 0x00ab }
        r4 = "FileSource.getInstance(context)";	 Catch:{ all -> 0x00ab }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x00ab }
        r3.setAccessToken(r1);	 Catch:{ all -> 0x00ab }
        r0 = com.mapbox.mapboxsdk.storage.FileSource.getInstance(r0);	 Catch:{ all -> 0x00ab }
        r1 = new aczo;	 Catch:{ all -> 0x00ab }
        r1.<init>(r7);	 Catch:{ all -> 0x00ab }
        r1 = (com.mapbox.mapboxsdk.storage.FileSource.ResourceTransformCallback) r1;	 Catch:{ all -> 0x00ab }
        goto L_0x0086;	 Catch:{ all -> 0x00ab }
        r7 = "mapbox";	 Catch:{ all -> 0x00ab }
        defpackage.akcr.a(r2, r7);	 Catch:{ all -> 0x00ab }
        defpackage.in.a();
        return r2;
        r7 = move-exception;
        defpackage.in.a();
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyr.a(acyy):com.mapbox.mapboxsdk.Mapbox");
    }

    private acyy c() {
        return (acyy) this.c.b();
    }

    public final acmk a(String str, acmm acmm, adbx adbx, aclb aclb, a aVar, ncn ncn) {
        akcr.b(str, "tag");
        akcr.b(acmm, "style");
        akcr.b(adbx, "listeners");
        akcr.b(aclb, "viewport");
        akcr.b(aVar, "requestMakerFactory");
        akcr.b(ncn, "sharingManager");
        Mapbox a = a(c());
        acyw.a.a(aVar);
        return new acyl(str, a, adbx, aclb, ncn);
    }

    public final acml a() {
        return acyw.a;
    }

    public final acmq b() {
        return c();
    }
}
